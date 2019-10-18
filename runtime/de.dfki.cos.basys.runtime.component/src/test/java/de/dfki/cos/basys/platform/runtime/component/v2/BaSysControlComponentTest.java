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
import de.dfki.cos.basys.controlcomponent.ExecutionMode;
import de.dfki.cos.basys.controlcomponent.ExecutionState;
import de.dfki.cos.basys.controlcomponent.OccupationLevel;
import de.dfki.cos.basys.controlcomponent.client.ControlComponentClient;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest;

public class BaSysControlComponentTest extends BaseComponentTest {

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testSingleConnectToBackend() throws ComponentException, ComponentManagerException {		
		componentManager.activate(context);
		componentManager.createComponent(new File(StringConstants.testConfigurationFolder + "/controlcomponents/component-2.json"));
		
		for (Component component : componentManager.getComponents()) {
			BasysComponent c = (BasysComponent) component;
			assertEquals(true, c.isConnectedToBasys());			
			assertEquals(true, c.isConnected());			
		}
		
	}

	@Test
	public void testHandleOperationModeRequest() throws ComponentException, ComponentManagerException {		
		componentManager.activate(context);
		BasysControlComponent c = (BasysControlComponent) componentManager.createComponent(new File(StringConstants.testConfigurationFolder + "/controlcomponents/component-3.json"));
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
