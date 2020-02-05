package de.dfki.cos.basys.platform.runtime.processcontrol;

import java.util.concurrent.CompletableFuture;

import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;

public interface ProcessController {

//	String deployProcessDefinition(String deploymentName, String processDefinition);
//	
//	ProcessRequestStatus startProcessInstance(ProcessRequest request);	
		
	CompletableFuture<ComponentResponse> scheduleComponentRequest(ComponentRequest request, ComponentResponseHandler callback);

	void scheduleComponentRequest(ComponentRequest request, ComponentResponseHandler callback, long delay);
	

}
