package de.dfki.cos.basys.platform.runtime.processcontrol;

import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;

public interface ComponentResponseHandler {

	// String doDeployProcessDefinition(String deploymentName, String processDefinition); //return deploymentId

	// ProcessRequestStatus doStartProcessInstance(ProcessRequest request);
	//void setController(ProcessController controller);
	void handleComponentResponse(ComponentResponse response);
}
