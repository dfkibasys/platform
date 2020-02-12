package de.dfki.cos.basys.platform.runtime.processcontrol;

import java.util.concurrent.CompletableFuture;

import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;

public interface ComponentRequestExecutionManager {

//	String deployProcessDefinition(String deploymentName, String processDefinition);
//	
//	ProcessRequestStatus startProcessInstance(ProcessRequest request);	
		
	CompletableFuture<ComponentResponse> executeComponentRequest(ComponentRequest request);

	//void executeComponentRequest(ComponentRequest request, long delay);
	

}
