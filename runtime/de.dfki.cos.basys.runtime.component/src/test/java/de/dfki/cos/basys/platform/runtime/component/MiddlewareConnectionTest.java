package de.dfki.cos.basys.platform.runtime.component;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest;
import de.dfki.cos.basys.platform.runtime.component.BasysComponent;

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
		managerConfig.put(StringConstants.serviceConnectionString, StringConstants.testConfigurationFolder + "/controlcomponents/component-1.json");
		componentManager.activate(context);
		//componentManager.createComponent(new File(StringConstants.testConfigurationFolder + "/component-1.json"));
		assertEquals(1, componentManager.getComponents().size());
		for (Component component : componentManager.getComponents()) {
			BasysComponent c = (BasysComponent) component;
			assertEquals(true, c.isConnectedToBasys());			
		}
		
	}
	

	@Test
	public void testMultiConnectToMiddleware() throws ComponentException {
		managerConfig.put(StringConstants.serviceConnectionString, StringConstants.testConfigurationFolder);
		managerConfig.put("recursive", "true");
		componentManager.activate(context);
		assertEquals(3, componentManager.getComponents().size());
		for (Component component : componentManager.getComponents()) {
			BasysComponent c = (BasysComponent) component;
			assertEquals(true, c.isConnectedToBasys());			
		}
	}
	
	@Test
	@Ignore
	public void testSingleConnectToBackend() throws ComponentException, ComponentManagerException {
		managerConfig.put(StringConstants.serviceConnectionString, StringConstants.testConfigurationFolder + "/controlcomponents/component-1.json");
		componentManager.activate(context);
		//componentManager.createComponent(new File(StringConstants.testConfigurationFolder + "/controlcomponents/component-2.json"));
		assertEquals(1, componentManager.getComponents().size());
		for (Component component : componentManager.getComponents()) {
			BasysComponent c = (BasysComponent) component;
			assertEquals(true, c.isConnectedToBasys());			
			assertEquals(true, c.isConnected());			
		}
		
	}

	@Test
	@Ignore
	public void testHandleOperationModeRequest() throws ComponentException, ComponentManagerException {		
		managerConfig.put(StringConstants.serviceConnectionString, StringConstants.testConfigurationFolder + "/controlcomponents/component-1.json");
		componentManager.activate(context);
		//BasysControlComponent c = (BasysControlComponent) componentManager.createComponent(new File(StringConstants.testConfigurationFolder + "/controlcomponents/component-3.json"));
		assertEquals(1, componentManager.getComponents().size());
		
		BasysControlComponent c = (BasysControlComponent) (componentManager.getComponents().get(0));
		assertEquals(true, c.isConnectedToBasys());			
		assertEquals(true, c.isConnected());
		
		sleep(10);
		
		OperationModeRequest request = ComponentFactory.eINSTANCE.createOperationModeRequest();
		request.setOperationMode("testmode");
		request.setOccupierId("itsme");
		
		c.handleComponentRequest(request);
		
		sleep(60*5);		
	}

}
