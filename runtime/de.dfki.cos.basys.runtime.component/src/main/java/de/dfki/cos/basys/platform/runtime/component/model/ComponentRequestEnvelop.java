package de.dfki.cos.basys.platform.runtime.component.model;

public class ComponentRequestEnvelop {

	ComponentRequest request;
	ComponentResponse response;

	public ComponentRequestEnvelop(ComponentRequest request) {
		this.request = request;
	}

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
