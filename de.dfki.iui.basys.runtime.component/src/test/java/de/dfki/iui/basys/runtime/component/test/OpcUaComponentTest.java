package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.OpcUaComponent;
import de.dfki.iui.basys.runtime.component.packml.State;

public class OpcUaComponentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOpcUaConnection() {
		OpcUaComponent component = new OpcUaComponent("opcua-component");
		assertTrue(!component.isConnectedToDevice());
		
		component.connectToDevice();
		assertTrue(component.isConnectedToDevice());
		
		component.disconnectFromDevice();
		assertTrue(!component.isConnectedToDevice());
	}

	@Test
	public void testComponentLifecycle() {
		OpcUaComponent component = new OpcUaComponent("opcua-component");
		assertTrue(!component.isConnectedToDevice());
		component.activate();
		assertTrue(component.isConnectedToDevice());		
		assertEquals(State.IDLE, component.getState());
		component.start();
		//concurrency...
		assertEquals(State.COMPLETE, component.getState());
		component.deactivate();
		assertTrue(!component.isConnectedToDevice());
	}
	
}
