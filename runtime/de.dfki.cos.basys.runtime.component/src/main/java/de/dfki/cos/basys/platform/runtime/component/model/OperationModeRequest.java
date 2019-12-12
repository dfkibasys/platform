/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import java.util.ArrayList;
import java.util.List;

public class OperationModeRequest extends ComponentRequest {

	String operationMode;
	List<Variable> inputParameters = new ArrayList<>();
	List<String> outputParameters = new ArrayList<>();

	public String getOperationMode() {
		return operationMode;
	}

	public void setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}

	public List<Variable> getInputParameters() {
		return inputParameters;
	}

	public void setInputParameters(List<Variable> inputParameters) {
		this.inputParameters = inputParameters;
	}

	public List<String> getOutputParameters() {
		return outputParameters;
	}

	public void setOutputParameters(List<String> outputParameters) {
		this.outputParameters = outputParameters;
	}

}
