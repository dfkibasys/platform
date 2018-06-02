/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dfki.iui.basys.runtime.processcontrol.impl;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CamundaRestClient {

    private Logger LOGGER = LoggerFactory.getLogger(CamundaRestClient.class);
	
    String workerId;
	String baseUrl;	
	Client client;
	
	public CamundaRestClient(String workerId, String baseUrl) {
		this.workerId = workerId;
		this.baseUrl = baseUrl;		
		client = ClientBuilder.newClient();		
	}


    public List<ExternalServiceTaskDto> getExternalTasks(String topic, int maxCount, long lockDuration, String... fetchVariables) {
    	
    	String vars = "[]";
		try {
			vars = new ObjectMapper().writeValueAsString(fetchVariables);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		Entity<String> e = Entity.entity("{\n"
                + "  \"workerId\":\""+workerId+"\",\n"
                + "  \"maxTasks\":"+ maxCount + ",\n"
                + "  \"usePriority\":true,\n"
                + "  \"asyncResponseTimeout\":10000,\n" // Long Polling timeout can be set to 30 minutes, 1800000 milliseconds maximum)
                + "  \"topics\":\n"
                + "      [{\"topicName\": \"" + topic + "\",\n"
                + "      \"lockDuration\": " + lockDuration + ",\n"
                + "      \"deserializeValues\" : true,\n"
                + "      \"variables\": " + vars
                + "      }]\n"
                + "}", MediaType.APPLICATION_JSON);
		
    	Response response = client
    			.target(baseUrl + "fetchAndLock").request(MediaType.APPLICATION_JSON)
    			.post(e);

    	//String resultE = response.readEntity(String.class);
    	
		List<ExternalServiceTaskDto> result = response.readEntity(new GenericType<List<ExternalServiceTaskDto>>() {});

		return result;
    }

    public void complete(String taskId) {
    	LOGGER.debug("Complete task {}", taskId);    	
    	Response response = client
    			.target(baseUrl + taskId + "/complete")
    			.request(MediaType.APPLICATION_JSON)
    			.post(Entity.entity("{\"workerId\": \""+workerId+"\"}", MediaType.APPLICATION_JSON));
    	LOGGER.debug("Complete task {} succeded with status code {}", taskId, response.getStatus());
    }

    public boolean isCanceled(String taskId) {
    	LOGGER.debug("IsCanceled task {}", taskId);    
    	Response response = client
    			.target(baseUrl + taskId).request(MediaType.APPLICATION_JSON)
    			.get();
     	LOGGER.debug("IsCanceled task {} succeded with status code {}", taskId, response.getStatus());
        
    	if (response.getStatus() == 404) {
    	    return true;
        } else {
            return false;
        }
    }

    public void handleError(String taskId, String message, int retries, int retryTimeout) {
    	LOGGER.debug("HandleError task {}, message {}", taskId, message);    
    	Response response = client
    			.target(baseUrl + taskId + "/failure")
    			.request(MediaType.APPLICATION_JSON)
    			.post(Entity.entity("{\n"
                        + "  \"workerId\": \""+workerId+"\",\n"
                        + "  \"errorMessage\": \"" + message + "\",\n"
                        + "  \"retries\": " + retries + ",\n"
                        + "  \"retryTimeout\": " + retryTimeout + "\n"
                        + "}", MediaType.APPLICATION_JSON));
    	LOGGER.debug("HandleError task {} succeded with status code {}", taskId, response.getStatus());
    }
    


}
