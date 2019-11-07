package de.dfki.cos.basys.platform.runtime.processcontrol.v2.camunda;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceConnection;
import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.component.CommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel;
import de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.processcontrol.ProcessController;
import de.dfki.cos.basys.platform.runtime.processcontrol.ProcessControllerProvider;
import de.dfki.cos.basys.platform.runtime.processcontrol.TaskDescription;
import de.dfki.cos.basys.platform.runtime.processcontrol.impl.ProcessControllerImpl;
import de.dfki.cos.basys.platform.runtime.processcontrol.v2.ProcessControllerService;

public class CamundaProcessControllerService implements ServiceConnection, ProcessControllerService {

	Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());
	
	ProcessController controller;
	CamundaRestClient client;	
	private boolean connected;
	
	BlockingQueue<TaskDescription> responseQueue = new LinkedBlockingQueue<TaskDescription>(32);

	ScheduledExecutorService executor = Executors.newScheduledThreadPool(32);

	String topic = "ControlComponent";
	String workerId = this.getClass().getName();
	int maxFetchCount = 1;
	long lockDuration = 24 * 60 * 60 * 1000; // 1 day
	long asyncResponseTimeout = 10000; // Long Polling request timeout in milliseconds
	int maxRetryCount = 0;
	int retryTimeout = 1000;
	
	public CamundaProcessControllerService(Properties config) {

		if (config.getProperty("topic") != null) {
			topic = config.getProperty("topic");
			LOGGER.info("topic = " + topic);
		}
		
		if (config.getProperty("workerId") != null) {
			workerId = config.getProperty("workerId");
			LOGGER.info("workerId = " + workerId);
		}
		
		if (config.getProperty("maxFetchCount") != null) {
			maxFetchCount = Integer.parseInt(config.getProperty("maxFetchCount"));
			LOGGER.info("maxFetchCount = " + maxFetchCount);
		}	
		
		if (config.getProperty("lockDuration") != null) {
			lockDuration = Long.parseLong(config.getProperty("lockDuration"));
			LOGGER.info("lockDuration = " + lockDuration);
		}	
		
		if (config.getProperty("asyncResponseTimeout") != null) {
			asyncResponseTimeout = Long.parseLong(config.getProperty("asyncResponseTimeout"));
			LOGGER.info("asyncResponseTimeout = " + asyncResponseTimeout);
		}	

		if (config.getProperty("maxRetryCount") != null) {
			maxRetryCount = Integer.parseInt(config.getProperty("maxRetryCount"));
			LOGGER.info("maxRetryCount = " + maxRetryCount);
		}	
		
		if (config.getProperty("retryTimeout") != null) {
			retryTimeout = Integer.parseInt(config.getProperty("retryTimeout"));
			LOGGER.info("retryTimeout = " + retryTimeout);
		}			
	}
	
	public void setController(ProcessController controller) {
		this.controller = controller;
	}

	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		
		if (connectionString.endsWith("/"))
			connectionString = connectionString.substring(0, connectionString.length()-1);		
		
		this.client = new CamundaRestClient(workerId, connectionString);
		executor.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				try {
				pollCamunda();
				connected = true;
				} catch (Exception e) {
					LOGGER.error(e.getMessage());
					e.printStackTrace();
					LOGGER.error("Camunda could not be polled - is it running?");
					connected = false;
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
		connected = true;
		return connected;
	}


	@Override
	public void disconnect() {
		try {
			LOGGER.info("attempt to shutdown executor");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			LOGGER.warn("tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				LOGGER.warn("cancel non-finished tasks");
			}
			List<Runnable> runnables = executor.shutdownNow();
			connected = false;
			LOGGER.info("shutdown finished");
		}
	}
	
	@Override
	public boolean isConnected() {		
		return connected;
	}

	private void pollCamunda() {

		LOGGER.trace("pollCamunda");

		List<ExternalServiceTaskDto> tasks = client.getExternalTasks(topic, maxFetchCount, lockDuration, asyncResponseTimeout, "componentId", "requestType", "token", "parameters");
		
		if (tasks.size() > 0) {
			LOGGER.info("pollCamunda fetched " + tasks.size() + " task(s)" );
		}
		
		for (ExternalServiceTaskDto task : tasks) {
			
			if (task.variables.requestType == null || task.variables.requestType.value == null) {
				client.handleError(task.id, "ExternalTask does not contain a requestType", maxRetryCount, retryTimeout);
				continue;
			}
			
			if (task.variables.requestType.value.equals("WAIT")) {
				int duration = Integer.parseInt(task.variables.token.value);
				scheduleWait(task.id,duration);
				continue;
			}
				
			if (task.variables.componentId == null || task.variables.componentId.value == null) {
				client.handleError(task.id, "ExternalTask does not contain a componentId", maxRetryCount, retryTimeout);
				continue;
			}
			
			ComponentRequest r = null;
			
			switch (task.variables.requestType.value) {
			case "ExecutionCommandRequest":
				r = ComponentFactory.eINSTANCE.createExecutionCommandRequest();
				((ExecutionCommandRequest)r).setExecutionCommand(ExecutionCommand.get(task.variables.token.value));
				break;
			case "ExecutionModeRequest":
				r = ComponentFactory.eINSTANCE.createExecutionModeRequest();
				((ExecutionModeRequest)r).setExecutionMode(ExecutionMode.get(task.variables.token.value));
				break;
			case "OccupationLevelRequest":
				r = ComponentFactory.eINSTANCE.createOccupationLevelRequest();
				((OccupationLevelRequest)r).setOccupationLevel(OccupationLevel.get(task.variables.token.value));
				break;
			case "OperationModeRequest":
				r = ComponentFactory.eINSTANCE.createOperationModeRequest();
				((OperationModeRequest)r).setOperationMode(task.variables.token.value);
				break;

			default:
				break;
			}
			
			r.setCorrelationId(task.id);
			r.setOccupierId(task.processInstanceId);				
			r.setComponentId(task.variables.componentId.value);					
			
			controller.scheduleTask(new TaskDescription(r));

		}
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
