/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import de.dfki.cos.basys.controlcomponent.ExecutionCommand;

public class ExecutionCommandRequest extends ComponentRequest {
	
	ExecutionCommand executionCommand;

	public ExecutionCommandRequest() {}
	
	public ExecutionCommand getExecutionCommand() {
		return executionCommand;
	}

	public void setExecutionCommand(ExecutionCommand executionCommand) {
		this.executionCommand = executionCommand;
	}
	

} 
