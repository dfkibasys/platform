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
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.processcontrol.ProcessControllerProvider;
import de.dfki.cos.basys.platform.runtime.processcontrol.TaskDescription;
import de.dfki.cos.basys.platform.runtime.processcontrol.impl.ProcessControllerImpl;

public class CamundaProcessControllerProvider implements ProcessControllerProvider {

	Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());
	
	String restEndpoint;
	String workerId = this.getClass().getName();
	ProcessControllerImpl controller;
	CamundaRestClient client;
	
	BlockingQueue<TaskDescription> responseQueue = new LinkedBlockingQueue<TaskDescription>(32);

	ScheduledExecutorService executor = Executors.newScheduledThreadPool(32);
	
	long asyncResponseTimeout = 10000; // Long Polling request timeout in milliseconds
	
	
	public CamundaProcessControllerProvider(String restEndpoint, ProcessControllerImpl controller) {
		if (restEndpoint.endsWith("/"))
			this.restEndpoint = restEndpoint.substring(0, restEndpoint.length()-1);
		else 
			this.restEndpoint = restEndpoint;
		
		this.client = new CamundaRestClient(workerId, this.restEndpoint);
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
								if (ts.getResponse().getResultVariables().size() > 0) {
									client.complete(ts.getCorrelationId(), ts.getResponse().getResultVariables());
								} else {
									client.complete(ts.getCorrelationId());
								}
							} else {
								client.handleError(ts.getCorrelationId(), ts.getResponse().getMessage(), 0, 1000);
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

		LOGGER.debug("pollCamunda");

		 long lockDuration = 24 * 60 * 60 * 1000;
		//long lockDuration = 5 * 60 * 1000;
		List<ExternalServiceTaskDto> tasks = client.getExternalTasks("BasysTask", 3, lockDuration, asyncResponseTimeout, "assignee", "command", "parameters");

		LOGGER.debug("pollCamunda fetched " + tasks.size() + " tasks" );
		for (ExternalServiceTaskDto task : tasks) {
			if (task.variables.assignee == null || task.variables.assignee.value == null) {
				client.handleError(task.id, "ExternalTask does not contain an assignee", 0, 1000);
				continue;
			}
			if (task.variables.command == null || task.variables.command.value == null) {
				client.handleError(task.id, "ExternalTask does not contain a command", 0, 1000);
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
					request.setComponentId(task.variables.assignee.value);
				}
				controller.scheduleTask(new TaskDescription(request, task.id));
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
