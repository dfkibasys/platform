package de.dfki.cos.basys.platform.runtime.processcontrol.v2;

import de.dfki.cos.basys.common.component.FunctionalClient;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;
import de.dfki.cos.basys.platform.runtime.processcontrol.TaskDescription;

public interface ProcessControlClient extends FunctionalClient {
		
	//void activate();
	
	//void deactivate();
	
	//String doDeployProcessDefinition(String deploymentName, String processDefinition); //return deploymentId
 
	//ProcessRequestStatus doStartProcessInstance(ProcessRequest request); 
	
	void handleTaskResponse(TaskDescription task);
}
