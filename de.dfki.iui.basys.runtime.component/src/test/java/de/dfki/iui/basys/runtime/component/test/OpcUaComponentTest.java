package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.OpcUaDeviceComponent;
import de.dfki.iui.basys.runtime.component.device.packml.State;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class OpcUaComponentTest {

	ComponentConfiguration opcuaConfig;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		opcuaConfig = new ComponentConfiguration.Builder()
				.componentId("test-opcua-component")
				.externalConnectionString(String.format("opc.tcp://%s:%s", "localhost", 4841))
				.build();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOpcUaConnection() {
		OpcUaDeviceComponent component = new TestOpcUaComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		try {
			component.connectToExternal();
		} catch (ComponentException e) {
			e.printStackTrace();
		}

		assertTrue(component.isConnectedToExternal());
		component.disconnectFromExternal();
		assertTrue(!component.isConnectedToExternal());
	}

	@Test
	public void testComponentLifecycle() {
		OpcUaDeviceComponent component = new TestOpcUaComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());
		component.activate(null);
		assertTrue(component.isConnectedToExternal());
		assertEquals(State.IDLE, component.getState());
		component.start();
		// concurrency...
		assertEquals(State.COMPLETE, component.getState());
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}

}
