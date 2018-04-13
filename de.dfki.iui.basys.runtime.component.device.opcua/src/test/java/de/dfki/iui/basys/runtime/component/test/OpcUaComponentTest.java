package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.opcua.OpcUaDeviceComponent;
import de.dfki.iui.basys.runtime.component.device.packml.State;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class OpcUaComponentTest {

	ComponentConfiguration opcuaConfig;
	ComponentContext emptyContext = new ComponentContext.Builder().build();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		opcuaConfig = new ComponentConfiguration.Builder().componentId("test-opcua-component")
				.externalConnectionString(String.format("opc.tcp://%s:%s", "localhost", 4841)).build();
	}

	@After
	public void tearDown() throws Exception {
	}

	private void sleep(long seconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testOpcUaConnection() throws ComponentException {
		OpcUaDeviceComponent component = new TestOpcUaComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}

	@Test
	public void testComponentLifecycle() throws ComponentException {
		OpcUaDeviceComponent component = new TestOpcUaComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());
		
		assertEquals(State.STOPPED, component.getState());
		component.reset();
		sleep(5);
		
		assertEquals(State.IDLE, component.getState());
		component.start();		
		sleep(5);	
		
		assertEquals(State.COMPLETE, component.getState());
		component.stop();
		sleep(5);	
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}

}
