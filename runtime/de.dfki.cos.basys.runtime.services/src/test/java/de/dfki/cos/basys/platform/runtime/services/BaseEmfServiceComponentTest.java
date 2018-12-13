package de.dfki.cos.basys.platform.runtime.services;

import java.io.File;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;

public class BaseEmfServiceComponentTest<T extends EmfServiceComponent> {


	protected ComponentManagerImpl componentManager;
	protected T service;

	protected String javaClassName = "";
	protected String file = "";
	
	protected ComponentConfiguration componentConfig;

	@Before
	public void setUp() throws Exception {	

		ComponentConfiguration serviceConfig = new ComponentConfigurationImpl.Builder()
				.componentId(UUID.randomUUID().toString())
				.componentName("TestComponent")
				.componentImplementationJavaClass(javaClassName)
				.externalConnectionString(new File(".").getAbsolutePath() + "/src/test/resources/model/" + file).build();
		
		ComponentConfiguration managerConfig = new ComponentConfigurationImpl.Builder()
				.componentId("component-manager")
				.componentName("component-manager")
				.build();	
		
		componentManager = new ComponentManagerImpl(managerConfig);
		componentManager.activate(new ComponentContext.Builder().build());
		
		componentManager.createLocalComponent(serviceConfig);
		service = (T)componentManager.getLocalComponentById(serviceConfig.getComponentId());
	}

	@After
	public void tearDown() throws Exception {
		service.deactivate();
	}

}
