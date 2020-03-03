/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import java.util.ArrayList;
import java.util.List;

public class ServiceRequest extends ComponentRequest {
	
	String serviceName;
	List<Variable> inputParameters = new ArrayList<>();
	List<Variable> outputParameters = new ArrayList<>();

	public ServiceRequest() {}
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<Variable> getInputParameters() {
		return inputParameters;
	}

	public void setInputParameters(List<Variable> inputParameters) {
		this.inputParameters = inputParameters;
	}

	public List<Variable> getOutputParameters() {
		return outputParameters;
	}

	public void setOutputParameters(List<Variable> outputParameters) {
		this.outputParameters = outputParameters;
	}
	
} 
