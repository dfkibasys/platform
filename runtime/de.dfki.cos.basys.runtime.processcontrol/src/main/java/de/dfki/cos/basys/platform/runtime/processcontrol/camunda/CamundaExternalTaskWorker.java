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
import java.util.concurrent.ScheduledFuture;
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
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentRequestExecutionManager;
import de.dfki.cos.basys.platform.runtime.processcontrol.impl.AbstractComponentRequestIssuer;
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentRequestIssuer;

public abstract class CamundaExternalTaskWorker extends AbstractComponentRequestIssuer {

	
	protected CamundaRestClient client;	
	
	private ScheduledFuture<?> pollingFuture;

	protected String topic = "undefined";
	protected String workerId = this.getClass().getName();
	protected int maxFetchCount = 1;
	protected long lockDuration = 24 * 60 * 60 * 1000; // 1 day
	protected long asyncResponseTimeout = 10000; // Long Polling request timeout in milliseconds
	protected int maxRetryCount = 0;
	protected int retryTimeout = 1000;
	
	public CamundaExternalTaskWorker(Properties config) {

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
	
	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		super.connect(context, connectionString);
		
		if (connectionString.endsWith("/"))
			connectionString = connectionString.substring(0, connectionString.length()-1);		
		
		this.client = new CamundaRestClient(workerId, connectionString);
		pollingFuture = this.context.getScheduledExecutorService().scheduleWithFixedDelay(new Runnable() {

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
		
		return connected;
	}

	@Override
	public void disconnect() {
		super.disconnect();
		pollingFuture.cancel(true);
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
				
			if (task.variables.componentId == null || task.variables.componentId.value == null) {
				client.handleError(task.id, "ExternalTask does not contain a componentId", maxRetryCount, retryTimeout);
				continue;
			}
			
			ComponentRequest request = createComponentRequest(task);
			
			try {
				requestQueue.put(request);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
	
	public abstract ComponentRequest createComponentRequest(ExternalServiceTaskDto task);

	@Override
	protected void doHandleComponentResponse(ComponentResponse response) {
		if (response.getStatus() == RequestStatus.OK) {								
			if (response.getOutputParameters().size() > 0) {
				client.complete(response.getRequest().getCorrelationId(), response.getOutputParameters());
			} else {
				client.complete(response.getRequest().getCorrelationId());
			}
		} else {
			client.handleError(response.getRequest().getCorrelationId(), response.getMessage(), 0, 1000);
		}		
	}
	



}
