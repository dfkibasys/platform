package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.OpcUaComponent;

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
		OpcUaComponent service = new OpcUaComponent("opcua-component");
		assertTrue(!service.isConnectedToDevice());
		service.connectToDevice();
		assertTrue(service.isConnectedToDevice());		
		

	    final NodeId NODE_VARIABLE_OUT = new NodeId(1, 50195);
		
		short value = service.readValue(NODE_VARIABLE_OUT);
		assertEquals(0, value);
		
		service.disconnectFromDevice();
		assertTrue(!service.isConnectedToDevice());
	}

}
