package de.dfki.cos.basys.platform.runtime.processcontrol;

import java.util.concurrent.CompletableFuture;

import javax.ws.rs.Path;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;

public interface ProcessController {

	String deployProcessDefinition(String deploymentName, String processDefinition);
	
	ProcessRequestStatus startProcessInstance(ProcessRequest request);	
		
	CompletableFuture<ComponentResponse> scheduleTask(TaskDescription task);

	void scheduleTask(TaskDescription task, long delay);
	

}
