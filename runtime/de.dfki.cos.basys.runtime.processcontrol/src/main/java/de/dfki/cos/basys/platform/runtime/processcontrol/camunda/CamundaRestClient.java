/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dfki.cos.basys.platform.runtime.processcontrol.camunda;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.dfki.cos.basys.platform.runtime.component.model.Variable;

public class CamundaRestClient {

	private Logger LOGGER = LoggerFactory.getLogger(CamundaRestClient.class);

	protected String workerId;
	protected Client client;
	protected WebTarget endpoint = null;
	protected WebTarget externalTaskEndpoint = null;
	protected WebTarget processDefinitionEndpoint = null;
	protected WebTarget processInstanceEndpoint = null;

	//public final String externalTaskPath = "engine/default/external-task/";
	
	Map<String,String> taskToProcessInstanceMap = new HashMap<>();
	
	public CamundaRestClient(String workerId, String baseUrl) {
		this.workerId = workerId;				
		client = ClientBuilder.newClient();		
		this.endpoint = client.target(baseUrl);	
		this.externalTaskEndpoint = endpoint.path("/engine/default/external-task");
		this.processDefinitionEndpoint = endpoint.path("/engine/default/process-definition");
		this.processInstanceEndpoint = endpoint.path("/engine/default/process-instance");
	}

	public List<ExternalServiceTaskDto> getExternalTasks(String topic, int maxCount, long lockDuration, long asyncResponseTimeout, String... fetchVariables) {

		String vars = "[]";
		try {
			vars = new ObjectMapper().writeValueAsString(fetchVariables);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Entity<String> e = Entity.entity(
				"{\n" + "  \"workerId\":\"" + workerId + "\",\n" + "  \"maxTasks\":" + maxCount + ",\n"
						+ "  \"usePriority\":true,\n" 
						+ "  \"asyncResponseTimeout\":" + asyncResponseTimeout + ",\n"																																									// maximum)
						+ "  \"topics\":\n" + "      [{\"topicName\": \"" + topic + "\",\n" 
						+ "      \"lockDuration\": " + lockDuration + ",\n" 
						+ "      \"deserializeValues\" : true,\n"
						+ "      \"variables\": " + vars + "}]\n" 
						+ "}",
				MediaType.APPLICATION_JSON);

		
		Response response = externalTaskEndpoint.path("/fetchAndLock")
								.request(MediaType.APPLICATION_JSON)
								//.property(ClientProperties.CONNECT_TIMEOUT, (int) asyncResponseTimeout)
								//.property(ClientProperties.READ_TIMEOUT, (int) asyncResponseTimeout)
								.post(e);

	
		
		if (response.getStatus() != 200) {		
			LOGGER.warn("getExternalTasks finished with status code " + response.getStatus() + " - " + response.getStatusInfo());
		}
		
		try {
			response.bufferEntity();
			String dto = response.readEntity(String.class);
			LOGGER.debug(dto);
			
			List<ExternalServiceTaskDto> result = response.readEntity(new GenericType<List<ExternalServiceTaskDto>>() {
			});
			
			//LOGGER.debug("retrieved " + result.size() + " tasks");
			
			for (ExternalServiceTaskDto task : result) {
				taskToProcessInstanceMap.put(task.id,task.processInstanceId);
			}
	
			return result;
		} catch (Exception ex) {
			LOGGER.warn(ex.getMessage());
			LOGGER.warn("JSON deserialization failed.");
			return new LinkedList<ExternalServiceTaskDto>();
		}
	}

	public synchronized void putVariable(Variable var, String processInstanceId) {
		LOGGER.debug("Put variable {} with value {}", var.getName(), var.getValue());
		String json = "{ \"value\": \"" + var.getValue() + "\" , \"type\": \"" + var.getType().getName().toLowerCase() + "\" }";
	
		Response response = processInstanceEndpoint.path("/{processInstanceId}/variables/{varName}").resolveTemplate("processInstanceId", processInstanceId).resolveTemplate("varName", var.getName()).request(MediaType.APPLICATION_JSON).put(Entity.entity(json, MediaType.APPLICATION_JSON));
		if (response.getStatus()==204) {
			LOGGER.debug("Variable set.");
			LOGGER.debug(response.toString());
		}
			
	}

	public synchronized String getVariable(String name, String processInstanceId) {
		LOGGER.debug("Get Variable {}", name);
		Response response = processInstanceEndpoint.path("/{processInstanceId}/variables/{varName}").resolveTemplate("processInstanceId", processInstanceId).resolveTemplate("varName", name).request(MediaType.APPLICATION_JSON).get();
		if (response.getStatus() == 200) {
			String var = response.readEntity(String.class); 
			LOGGER.debug(name + " = " + var);
			return var;
		}
		LOGGER.warn("Variable {} not set", name);
		return null;
	}
	
	public synchronized void complete(String taskId) {
		LOGGER.debug("Complete task {}", taskId);
		Response response = externalTaskEndpoint.path("/{taskId}/complete").resolveTemplate("taskId", taskId).request(MediaType.APPLICATION_JSON).post(Entity.entity("{\"workerId\": \"" + workerId + "\"}", MediaType.APPLICATION_JSON));
		LOGGER.debug("Complete task {} succeded with status code {}", taskId, response.getStatus());
	}

//	public void complete2(String taskId, List<Variable> variables) {
//		LOGGER.debug("Complete task {} with process vars {}", taskId, variables.toString());
//		
//		for (Variable var : variables) {
//			String processInstanceId = taskToProcessInstanceMap.get(taskId);
//			putVariable(var, processInstanceId);
//			String v = getVariable(var.getName(), processInstanceId);
//		}
//		
//		complete(taskId);
//	}
	
	
	public synchronized void complete(String taskId, List<Variable> variables) {
		LOGGER.debug("Complete task {} with process vars {}", taskId, variables.toString());
		String vars = "";
		for (Variable var : variables) {
			vars += "\"" + var.getName() + "\": { \"value\": \"" + var.getValue() + "\" , \"type\": \"" + var.getType().getName().toLowerCase() + "\" },";
		}
		vars = vars.substring(0, vars.length() - 1);

		Response response = externalTaskEndpoint.path("/{taskId}/complete").resolveTemplate("taskId", taskId).request(MediaType.APPLICATION_JSON)
				.post(Entity.entity("{" + "\"workerId\": \"" + workerId + "\"," + "\"variables\": {" + vars + "}" + "}", MediaType.APPLICATION_JSON));
		LOGGER.debug("Complete task {} succeded with status code {}", taskId, response.getStatus());
	}

//	public synchronized boolean isCanceled(String taskId) {
//		LOGGER.debug("IsCanceled task {}", taskId);
//		Response response = externalTaskEndpoint.path(taskId).request(MediaType.APPLICATION_JSON).get();
//		LOGGER.debug("IsCanceled task {} succeded with status code {}", taskId, response.getStatus());
//
//		if (response.getStatus() == 404) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	public synchronized void handleError(String taskId, String message, int retries, int retryTimeout) {
		LOGGER.debug("HandleError task {}, message {}", taskId, message);
		Response response = externalTaskEndpoint.path("/{taskId}/failure").resolveTemplate("taskId", taskId).request(MediaType.APPLICATION_JSON).post(Entity.entity("{\n" + "  \"workerId\": \"" + workerId + "\",\n"
				+ "  \"errorMessage\": \"" + message + "\",\n" + "  \"retries\": " + retries + ",\n" + "  \"retryTimeout\": " + retryTimeout + "\n" + "}", MediaType.APPLICATION_JSON));
		LOGGER.debug("HandleError task {} succeded with status code {}", taskId, response.getStatus());
	}
//	
//	public void sendMessage(String message, String businessKey) {
//		LOGGER.debug("Send message {} with businessKey {}", message, businessKey);
//		String entity = "{\n" + 
//				"  \"messageName\" : \"" + message + "\",\n" + 
//				"  \"businessKey\" : \"" +businessKey+ "\"\n" + 
//				"}";
//		Response response = endpoint.path("/message").request(MediaType.APPLICATION_JSON).post(Entity.entity(entity, MediaType.APPLICATION_JSON));	
//		LOGGER.debug("sendMessage succeded with status code {}", response.getStatus());
//		
//	}
//
//	public void sendMessage(String message, String businessKey, List<Variable> variables) {
//		LOGGER.debug("Send message {} with businessKey {}", message, businessKey);
//
//		String vars = "";
//		for (Variable var : variables) {
//			vars += "\"" + var.getName() + "\": { \"value\": \"" + var.getValue() + "\" , \"type\": \"" + var.getType().getName().toLowerCase() + "\" },";
//		}
//		vars = vars.substring(0, vars.length() - 1);
//		
//		String entity = "{\n" + 
//				"  \"messageName\" : \"" + message + "\",\n" + 
//				"  \"businessKey\" : \"" +businessKey+ "\",\n" + 
//				"  \"processVariables\" : {\n" + vars +	"  }\n" + 
//				"}";
//		LOGGER.debug(entity);
//		Response response = endpoint.path("/message").request(MediaType.APPLICATION_JSON).post(Entity.entity(entity, MediaType.APPLICATION_JSON));	
//		LOGGER.debug("sendMessage succeded with status code {}", response.getStatus());
//	}
	
	public String deployProcessDefinition(String deploymentName) {
		return null;
	};
	
	public void createProcessInstanceByKey(String processDefinitionKey, String businessKey) {
		LOGGER.debug("Create process instance {} with businessKey {}", processDefinitionKey, businessKey);
		
		String entity = "{\n" +  
				"  \"businessKey\" : \"" +businessKey+ "\"\n" + 
				"}";
		LOGGER.debug(entity);
		
		Response response = processDefinitionEndpoint.path("/key/{key}/start").resolveTemplate("key", processDefinitionKey).request(MediaType.APPLICATION_JSON).post(Entity.entity(entity, MediaType.APPLICATION_JSON));	
		
	}
	
	public void createProcessInstanceByKey(String processDefinitionKey, String businessKey, List<Variable> variables) {
		LOGGER.debug("Create process instance {} with businessKey {}", processDefinitionKey, businessKey);

		String vars = "";
		for (Variable var : variables) {
			vars += "\"" + var.getName() + "\": { \"value\": \"" + var.getValue() + "\" , \"type\": \"" + var.getType().getName().toLowerCase() + "\" },";
		}
		vars = vars.substring(0, vars.length() - 1);
		
		String entity = "{\n" +  
				"  \"variables\" : {\n" + vars +	"  },\n" + 
				"  \"businessKey\" : \"" +businessKey+ "\"\n" + 
				"}";
		LOGGER.debug(entity);
		
		Response response = processDefinitionEndpoint.path("/key/{key}/start").resolveTemplate("key", processDefinitionKey).request(MediaType.APPLICATION_JSON).post(Entity.entity(entity, MediaType.APPLICATION_JSON));	
		
	}
}
