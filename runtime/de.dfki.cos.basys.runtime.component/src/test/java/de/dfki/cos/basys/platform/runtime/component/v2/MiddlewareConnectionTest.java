package de.dfki.cos.basys.platform.runtime.component.v2;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;

public class MiddlewareConnectionTest extends BaseComponentTest {

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testSingleConnectToMiddleware() throws ComponentException, ComponentManagerException {
		managerConfig.put(StringConstants.connectionString, StringConstants.testConfigurationFolder + "/controlcomponents/component-1.json");
		componentManager.activate(context);
		//componentManager.createComponent(new File(StringConstants.testConfigurationFolder + "/component-1.json"));
		
		for (Component component : componentManager.getComponents()) {
			BasysComponent c = (BasysComponent) component;
			assertEquals(true, c.isConnectedToBasys());			
		}
		
	}
	

	@Test
	public void testMultiConnectToMiddleware() throws ComponentException {
		managerConfig.put(StringConstants.connectionString, StringConstants.testConfigurationFolder);
		managerConfig.put("recursive", "true");
		componentManager.activate(context);
		
		for (Component component : componentManager.getComponents()) {
			BasysComponent c = (BasysComponent) component;
			assertEquals(true, c.isConnectedToBasys());			
		}
	}
	
	

}
