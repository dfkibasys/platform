/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import de.dfki.cos.basys.controlcomponent.ExecutionMode;

public class ExecutionModeRequest extends ComponentRequest {

	ExecutionMode executionMode;
	
	public ExecutionModeRequest() {}
	
	public ExecutionMode getExecutionMode() {
		return executionMode;
	}

	public void setExecutionMode(ExecutionMode executionMode) {
		this.executionMode = executionMode;
	}
	
}
