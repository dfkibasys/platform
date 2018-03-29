package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.OpcUaComponent;
import de.dfki.iui.basys.runtime.component.ServiceComponentException;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration.CommunicationProviderEnum;
import de.dfki.iui.basys.runtime.component.packml.State;

public class OpcUaComponentTest {

	OpcUaComponent component;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ComponentConfiguration config = new ComponentConfiguration()
				.setId("test-opcua-component")
				.setCommunicationProvider(CommunicationProviderEnum.NONE)
				.setDeviceConnectionString(String.format("opc.tcp://%s:%s", "localhost", 4841));
		component = new TestOpcUaComponent(config);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOpcUaConnection() {
		assertTrue(!component.isConnectedToDevice());		
		try {
			component.connectToDevice();
		} catch (ServiceComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(component.isConnectedToDevice());		
		component.disconnectFromDevice();
		assertTrue(!component.isConnectedToDevice());
	}

	@Test
	public void testComponentLifecycle() {
		assertTrue(!component.isConnectedToDevice());
		component.activate(null);
		assertTrue(component.isConnectedToDevice());
		assertEquals(State.IDLE, component.getState());
		component.start();
		//concurrency...
		assertEquals(State.COMPLETE, component.getState());
		component.deactivate();
		assertTrue(!component.isConnectedToDevice());
	}
	
}
