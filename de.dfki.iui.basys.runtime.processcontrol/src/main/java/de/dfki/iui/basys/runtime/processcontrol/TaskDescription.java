package de.dfki.iui.basys.runtime.processcontrol;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentResponse;

public class TaskDescription {

	String id;
	CapabilityRequest request;
	ComponentResponse response;
	
	public TaskDescription(String id, CapabilityRequest request) {
		this.id = id;
		this.request = request;
	}

	public String getId() {
		return id;
	}
	
	public CapabilityRequest getRequest() {
		return request;
	}
	
	public ComponentResponse getResponse() {
		return response;
	}
	
	public void setResponse(ComponentResponse response) {
		this.response = response;
	}
	
	
}
