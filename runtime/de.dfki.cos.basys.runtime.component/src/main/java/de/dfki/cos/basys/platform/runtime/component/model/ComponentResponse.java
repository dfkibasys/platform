/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import java.util.ArrayList;
import java.util.List;

public class ComponentResponse {

	String componentId;
	ResponseStatus status;
	int statusCode;
	String message;
	ComponentRequest request;
	List<Variable> outputParameters = new ArrayList<>();

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ComponentRequest getRequest() {
		return request;
	}

	public void setRequest(ComponentRequest request) {
		this.request = request;
	}

	public List<Variable> getOutputParameters() {
		return outputParameters;
	}

	public void setOutputParameters(List<Variable> outputParameters) {
		this.outputParameters = outputParameters;
	}

	public static class Builder {
		private String componentId;
		private ResponseStatus status;
		private int statusCode;
		private String message;
		private ComponentRequest request;
		private List<Variable> outputParameters;

		public Builder componentId(String componentId) {
			this.componentId = componentId;
			return this;
		}

		public Builder status(ResponseStatus status) {
			this.status = status;
			return this;
		}

		public Builder statusCode(int statusCode) {
			this.statusCode = statusCode;
			return this;
		}

		public Builder message(String message) {
			this.message = message;
			return this;
		}

		public Builder request(ComponentRequest request) {
			this.request = request;
			return this;
		}

		public Builder outputParameters(List<Variable> outputParameters) {
			this.outputParameters = outputParameters;
			return this;
		}

		public ComponentResponse build() {
			return new ComponentResponse(this);
		}
	}

	private ComponentResponse(Builder builder) {
		this.componentId = builder.componentId;
		this.status = builder.status;
		this.statusCode = builder.statusCode;
		this.message = builder.message;
		this.request = builder.request;
		this.outputParameters = builder.outputParameters;
	}
}
