package de.dfki.cos.basys.platform.runtime.processcontrol.v2;

import de.dfki.cos.basys.platform.runtime.processcontrol.TaskDescription;

public interface ProcessControllerService {

	// String doDeployProcessDefinition(String deploymentName, String processDefinition); //return deploymentId

	// ProcessRequestStatus doStartProcessInstance(ProcessRequest request);

	void handleTaskResponse(TaskDescription task);
}
