package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;

import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.platform.runtime.component.BasysComponent;
import de.dfki.cos.basys.platform.runtime.services.EmfService;

public class EmfBasysComponent extends BasysComponent<EmfService> {
	
	public EmfBasysComponent(Properties config) {
		super(config);
		
		EmfServiceImpl serviceProvider = new EmfServiceImpl(config);
		serviceManager = new ServiceManagerImpl<EmfService>(config, serviceProvider);		
	}

}
