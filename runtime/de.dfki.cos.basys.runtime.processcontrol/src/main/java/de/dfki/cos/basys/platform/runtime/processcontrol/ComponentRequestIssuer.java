package de.dfki.cos.basys.platform.runtime.processcontrol;

import java.util.List;

import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;

public interface ComponentRequestIssuer {
	
	//List<ComponentRequest> getComponentRequests();

	ComponentRequest pollNewComponentRequest();
	
	void handleComponentResponse(ComponentResponse response);
}
