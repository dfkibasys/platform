/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

public class ComponentRequestStatus {
	String componentId;
	RequestStatus status;
	String message;

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static class Builder {
		private String componentId;
		private RequestStatus status;
		private String message;

		public Builder componentId(String componentId) {
			this.componentId = componentId;
			return this;
		}

		public Builder status(RequestStatus status) {
			this.status = status;
			return this;
		}

		public Builder message(String message) {
			this.message = message;
			return this;
		}

		public ComponentRequestStatus build() {
			return new ComponentRequestStatus(this);
		}
	}

	private ComponentRequestStatus(Builder builder) {
		this.componentId = builder.componentId;
		this.status = builder.status;
		this.message = builder.message;
	}
}
