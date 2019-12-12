/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;


public class ComponentRequest {
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
