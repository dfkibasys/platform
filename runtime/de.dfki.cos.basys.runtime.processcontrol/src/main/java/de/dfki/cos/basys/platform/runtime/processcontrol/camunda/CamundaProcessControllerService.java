package de.dfki.cos.basys.platform.runtime.processcontrol.camunda;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.controlcomponent.ExecutionCommand;
import de.dfki.cos.basys.controlcomponent.ExecutionMode;
import de.dfki.cos.basys.controlcomponent.OccupationCommand;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestEnvelop;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;
import de.dfki.cos.basys.platform.runtime.component.model.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ExecutionModeRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OccupationCommandRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OperationModeRequest;
import de.dfki.cos.basys.platform.runtime.component.model.RequestStatus;
import de.dfki.cos.basys.platform.runtime.component.model.Variable;
import de.dfki.cos.basys.platform.runtime.processcontrol.ProcessController;
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentResponseHandler;

public class CamundaProcessControllerService implements ServiceProvider<ComponentResponseHandler>, ComponentResponseHandler {

	Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());
	
	//ComponentContext context;
	ProcessController controller;
	CamundaRestClient client;	
	private boolean connected;
	
	BlockingQueue<ComponentResponse> responseQueue = new LinkedBlockingQueue<ComponentResponse>(32);

	ScheduledExecutorService executor = Executors.newScheduledThreadPool(32);

	String topic = "ControlComponent";
	String workerId = this.getClass().getName();
	int maxFetchCount = 1;
	long lockDuration = 24 * 60 * 60 * 1000; // 1 day
	long asyncResponseTimeout = 10000; // Long Polling request timeout in milliseconds
	int maxRetryCount = 0;
	int retryTimeout = 1000;
	
	public CamundaProcessControllerService(Properties config, ProcessController controller) {

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
		
		this.controller = controller;
	}
	
	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		
		//this.context = context;
		
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
						ComponentResponse response = responseQueue.poll(1000, TimeUnit.MILLISECONDS);
						if (response != null) {
							if (response.getStatus() == RequestStatus.OK) {
								if (response.getOutputParameters().size() > 0) {
									client.complete(response.getRequest().getCorrelationId(), response.getOutputParameters());
								} else {
									client.complete(response.getRequest().getCorrelationId());
								}
							} else {
								client.handleError(response.getRequest().getCorrelationId(), response.getMessage(), 0, 1000);
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

		List<ExternalServiceTaskDto> tasks = client.getExternalTasks(topic, maxFetchCount, lockDuration, asyncResponseTimeout, "componentId", "requestType", "token", "inputParameters", "outputParameters");
		
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
				r = new ExecutionCommandRequest();
				((ExecutionCommandRequest)r).setExecutionCommand(ExecutionCommand.get(task.variables.token.value));
				break;
			case "ExecutionModeRequest":
				r = new ExecutionModeRequest();
				((ExecutionModeRequest)r).setExecutionMode(ExecutionMode.get(task.variables.token.value));
				break;
			case "OccupationCommandRequest":
				r = new OccupationCommandRequest();
				((OccupationCommandRequest)r).setOccupationCommand(OccupationCommand.get(task.variables.token.value));
				break;
			case "OperationModeRequest":
				r = new OperationModeRequest();
				OperationModeRequest req = (OperationModeRequest) r;
				req.setOperationMode(task.variables.token.value);
				ObjectMapper mapper = new ObjectMapper();
				try {
					
					List<Variable> inputParameters = mapper.readValue(task.variables.inputParameters.value,new TypeReference<List<Variable>>(){});
					LOGGER.debug(inputParameters.toString());					
					for (Variable var : inputParameters) {
						//Variable var = new Variable.Builder().name(entry.getKey()).valueString(entry.getValue()).build();
						req.getInputParameters().add(var);						
					    //System.out.println(entry.getKey() + "/" + entry.getValue());
					}
										
					List<Variable> output = mapper.readValue(task.variables.outputParameters.value,new TypeReference<List<Variable>>(){});			
					LOGGER.debug(output.toString());		
					req.getOutputParameters().addAll(output);
					
				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			default:
				break;
			}
			
			r.setCorrelationId(task.id);
			r.setOccupierId(task.processInstanceId);				
			r.setComponentId(task.variables.componentId.value);					
			
			
			//context.getEventBus().post(r);
			controller.scheduleComponentRequest(r);
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
	public void handleComponentResponse(ComponentResponse response) {
		try {
			responseQueue.put(response);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public ComponentResponseHandler getService() {
		return this;
	}

}
