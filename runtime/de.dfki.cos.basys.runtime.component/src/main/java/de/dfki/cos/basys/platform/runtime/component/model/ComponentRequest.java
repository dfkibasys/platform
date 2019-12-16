/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use=Id.CLASS, include=As.PROPERTY)
public abstract class ComponentRequest {
	String componentId;
	String correlationId;
	String occupierId;
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getOccupierId() {
		return occupierId;
	}
	public void setOccupierId(String occupierId) {
		this.occupierId = occupierId;
	}	
}
