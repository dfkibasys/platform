package de.dfki.cos.basys.platform.runtime.processcontrol.deployment;

import java.io.File;

public interface DeploymentService {

	String createDeployment(String filePath);
	
	void deleteDeployment(String id);

	void clearDeployments();
		
}
