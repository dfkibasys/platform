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

import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.client.topic.TopicSubscription;
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

public abstract class CamundaExternalTaskWorker extends AbstractComponentRequestIssuer implements ExternalTaskHandler {

	protected String topic = "undefined";
	protected String workerId = this.getClass().getName();
	protected String[] variables = {"componentId", "requestType", "token", "inputParameters", "outputParameters"};
	protected int maxFetchCount = 1;
	protected long lockDuration = 24 * 60 * 60 * 1000; // 1 day
	protected long asyncResponseTimeout = 10000; // Long Polling request timeout in milliseconds
	protected int maxRetryCount = 0;
	protected int retryTimeout = 1000;

	protected ExternalTaskClient client;
	protected TopicSubscription subscription;
	protected ExternalTaskService externalTaskService;
	protected Map<String, ExternalTask> externalTasks = new HashMap<>();
	
	
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
		
		if (config.getProperty("variables") != null) {
			variables = config.getProperty("variables").split("\\s*,\\s*");
			LOGGER.info("variables = " + variables.toString());
		}			
	}
	
	public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		// the externalTaskService is only created once for all externalTasks. So we store it here the first time.		
		if (this.externalTaskService == null) {
			this.externalTaskService = externalTaskService;
		}
			
		ComponentRequest request = createComponentRequest(externalTask);
		if (request != null) {
			externalTasks.put(externalTask.getId(), externalTask);
		}
		
		try {
			requestQueue.put(request);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		super.connect(context, connectionString);
		
		if (connectionString.endsWith("/"))
			connectionString = connectionString.substring(0, connectionString.length()-1);		
				
		client = ExternalTaskClient.create()
				  .baseUrl(connectionString)
				  .asyncResponseTimeout(asyncResponseTimeout)
				  .lockDuration(lockDuration)
				  .maxTasks(maxFetchCount)
				  .build();
		
		subscription = client.subscribe(topic)
			.lockDuration(lockDuration)
			.variables(variables)
			.handler(this)
			.open();		
		
		return client.isActive();
	}
	
	@Override
	public void disconnect() {
		super.disconnect();
		if (subscription != null)
			subscription.close();
		if (client != null)
			client.stop();
	}
	
	@Override
	public boolean isConnected() {
		return client == null ? false : client.isActive();
	}
	
	public abstract ComponentRequest createComponentRequest(ExternalTask externalTask);

	@Override
	protected void doHandleComponentResponse(ComponentResponse response) {
		ExternalTask externalTask = externalTasks.remove(response.getRequest().getCorrelationId());

		if (response.getStatus() == RequestStatus.OK) {
			if (response.getOutputParameters().size() > 0) {
				Map<String, Object> variables = new HashMap<>();
				for (Variable var : response.getOutputParameters()) {
					variables.put(var.getName(), var.getValue());
				}
				externalTaskService.complete(externalTask, variables);
			} else {

				externalTaskService.complete(externalTask);
			}
		} else {
			externalTaskService.handleFailure(externalTask, response.getMessage(), "", maxRetryCount, retryTimeout);
		}
	}


}
