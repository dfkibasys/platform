package de.dfki.cos.basys.platform.runtime.processcontrol;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;

public class TaskDescription {

	//String correlationId;
	ComponentRequest request;
	ComponentResponse response;
	
	public TaskDescription(ComponentRequest request) {
		//this(request, null);
	}
	
//	public TaskDescription(ComponentRequest request, String correlationId) {
//		this.request = request;
//		this.correlationId = correlationId;
//	}

//	public String getCorrelationId() {
//		return correlationId;
//	}
	
	public ComponentRequest getRequest() {
		return request;
	}
	
	public ComponentResponse getResponse() {
		return response;
	}
	
	public void setResponse(ComponentResponse response) {
		this.response = response;
	}
	
	
}
