package de.dfki.cos.basys.platform.runtime.processcontrol.camunda;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.component.CommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.processcontrol.ProcessControllerProvider;
import de.dfki.cos.basys.platform.runtime.processcontrol.TaskDescription;
import de.dfki.cos.basys.platform.runtime.processcontrol.impl.ProcessControllerImpl;

public class CamundaProcessControllerProvider implements ProcessControllerProvider {

	Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());
	
	ProcessControllerImpl controller;
	CamundaRestClient client;	
	
	BlockingQueue<TaskDescription> responseQueue = new LinkedBlockingQueue<TaskDescription>(32);

	ScheduledExecutorService executor = Executors.newScheduledThreadPool(32);

	String workerId = this.getClass().getName();
	int maxFetchCount = 1;
	long lockDuration = 24 * 60 * 60 * 1000; // 1 day
	long asyncResponseTimeout = 10000; // Long Polling request timeout in milliseconds
	int maxRetryCount = 0;
	int retryTimeout = 1000;
	
	public CamundaProcessControllerProvider(ComponentConfiguration config, ProcessControllerImpl controller) {
		
		String restEndpoint = config.getExternalConnectionString();
		if (restEndpoint.endsWith("/"))
			restEndpoint = restEndpoint.substring(0, restEndpoint.length()-1);			
		
		if (config.getProperty("workerId") != null) {
			workerId = config.getProperty("workerId").getValue();
			LOGGER.info("workerId = " + workerId);
		}
		
		if (config.getProperty("maxFetchCount") != null) {
			maxFetchCount = Integer.parseInt(config.getProperty("maxFetchCount").getValue());
			LOGGER.info("maxFetchCount = " + maxFetchCount);
		}	
		
		if (config.getProperty("lockDuration") != null) {
			lockDuration = Long.parseLong(config.getProperty("lockDuration").getValue());
			LOGGER.info("lockDuration = " + lockDuration);
		}	
		
		if (config.getProperty("asyncResponseTimeout") != null) {
			asyncResponseTimeout = Long.parseLong(config.getProperty("asyncResponseTimeout").getValue());
			LOGGER.info("asyncResponseTimeout = " + asyncResponseTimeout);
		}	

		if (config.getProperty("maxRetryCount") != null) {
			maxRetryCount = Integer.parseInt(config.getProperty("maxRetryCount").getValue());
			LOGGER.info("maxRetryCount = " + maxRetryCount);
		}	
		
		if (config.getProperty("retryTimeout") != null) {
			retryTimeout = Integer.parseInt(config.getProperty("retryTimeout").getValue());
			LOGGER.info("retryTimeout = " + retryTimeout);
		}			
		
		this.client = new CamundaRestClient(workerId, restEndpoint);
		this.controller = controller;
	}
	

	public void activate() {
		executor.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				try {
				pollCamunda();
				} catch (Exception e) {
					LOGGER.error(e.getMessage());
					e.printStackTrace();
					LOGGER.error("Camunda could not be polled - is it running?");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		}, 5000, 100, TimeUnit.MILLISECONDS);
		
		executor.schedule(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						TaskDescription ts = responseQueue.poll(1000, TimeUnit.MILLISECONDS);
						if (ts != null) {
							if (ts.getResponse().getStatus() == ResponseStatus.OK) {
								if (ts.getResponse().getOutputParameters().size() > 0) {
									client.complete(ts.getRequest().getCorrelationId(), ts.getResponse().getOutputParameters());
								} else {
									client.complete(ts.getRequest().getCorrelationId());
								}
							} else {
								client.handleError(ts.getRequest().getCorrelationId(), ts.getResponse().getMessage(), 0, 1000);
							}
							Thread.sleep(200);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}, 5000, TimeUnit.MILLISECONDS);
	}
	

	public void deactivate() {

		try {
			System.out.println("attempt to shutdown executor");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			List<Runnable> runnables = executor.shutdownNow();
			System.out.println("shutdown finished");
		}
	}

	private void pollCamunda() {

		LOGGER.trace("pollCamunda");

		List<ExternalServiceTaskDto> tasks = client.getExternalTasks("BasysTask", maxFetchCount, lockDuration, asyncResponseTimeout, "assignee", "command", "parameters");
		
		if (tasks.size() > 0) {
			LOGGER.info("pollCamunda fetched " + tasks.size() + " task(s)" );
		}
		
		for (ExternalServiceTaskDto task : tasks) {
			if (task.variables.assignee == null || task.variables.assignee.value == null) {
				client.handleError(task.id, "ExternalTask does not contain an assignee", maxRetryCount, retryTimeout);
				continue;
			}
			if (task.variables.command == null || task.variables.command.value == null) {
				client.handleError(task.id, "ExternalTask does not contain a command", maxRetryCount, retryTimeout);
				continue;
			}
			
			if (task.variables.assignee.value.equals("WAIT")) {
				int duration = Integer.parseInt(task.variables.command.value);
				scheduleWait(task.id,duration);
				continue;
			}

			try {
				//LOGGER.debug(task.variables.command.value);
				ComponentRequest request = JsonUtils.fromString(task.variables.command.value, ComponentRequest.class);
				if (task.variables.assignee != null || task.variables.assignee.value != null) {
					request.setCorrelationId(task.id);
					request.setComponentId(task.variables.assignee.value);
					request.setOccupierId(task.processInstanceId);
				}
				controller.scheduleTask(new TaskDescription(request));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	
	
	@Override
	public String doDeployProcessDefinition(String deploymentName, String processDefinition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessRequestStatus doStartProcessInstance(ProcessRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void scheduleWait(String id, int duration) {
		executor.schedule(new Runnable() {
			@Override
			public void run() {
				client.complete(id);
			}
		}, duration, TimeUnit.MILLISECONDS);
	}

	@Override
	public void handleTaskResponse(TaskDescription task) {
		try {
			responseQueue.put(task);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
