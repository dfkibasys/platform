package de.dfki.cos.basys.platform.runtime.processcontrol;

import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;

public interface ProcessControllerProvider {
		
	void activate();
	
	void deactivate();
	
	String doDeployProcessDefinition(String deploymentName, String processDefinition); //return deploymentId
 
	ProcessRequestStatus doStartProcessInstance(ProcessRequest request); 
	
	void handleTaskResponse(TaskDescription task);
}
