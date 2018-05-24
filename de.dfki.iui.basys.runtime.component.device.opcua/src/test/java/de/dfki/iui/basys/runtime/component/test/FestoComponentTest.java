package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.opcua.FestoComponent;
import de.dfki.iui.basys.runtime.component.device.opcua.OpcUaDeviceComponent;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class FestoComponentTest {

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
		opcuaConfig = new ComponentConfigurationImpl.Builder().componentId("festo-component")
				.externalConnectionString(String.format("opc.tcp://%s:%s", "10.2.100.2", 4848)).build();
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
	@Ignore
	public void testDummy() {}
	/*
	@Test
	public void testOpcUaConnection() throws ComponentException {
		OpcUaDeviceComponent component = new FestoComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}
	*/
	
	@Test
	public void testExecuteJob() throws ComponentException {
		OpcUaDeviceComponent component = new FestoComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());
		
		assertEquals(State.STOPPED, component.getState());
		component.reset();
		sleep(3);
				
		assertEquals(State.IDLE, component.getState());

		UnitConfiguration config = new UnitConfiguration();		
		config.setRecipe(1);
		ComponentRequestStatus status = component.setUnitConfig(config);
		
		component.start();
		sleep(2);	
		assertEquals(State.EXECUTE, component.getState());
		
		sleep(10);		
		assertEquals(State.COMPLETE, component.getState());
	
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}
	
	@Test
	@Ignore
	public void testExecuteJobMitEingriff() throws ComponentException {
		OpcUaDeviceComponent component = new FestoComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());
		
		assertEquals(State.STOPPED, component.getState());
		component.reset();
		sleep(3);
				
		assertEquals(State.IDLE, component.getState());

		UnitConfiguration config = new UnitConfiguration();		
		config.setRecipe(1);
		ComponentRequestStatus status = component.setUnitConfig(config);
		
		component.start();
		sleep(2);	
		assertEquals(State.EXECUTE, component.getState());
		
		sleep(10);		
		assertEquals(State.COMPLETE, component.getState());
	
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}
	
	@Test
	public void testExecuteJobAndStop() throws ComponentException {
		OpcUaDeviceComponent component = new FestoComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());
		
		assertEquals(State.STOPPED, component.getState());
		component.reset();
		sleep(10);		
		
		assertEquals(State.IDLE, component.getState());

		UnitConfiguration config = new UnitConfiguration();		
		config.setRecipe(2);
		ComponentRequestStatus status = component.setUnitConfig(config);
		
		component.start();
		sleep(5);	
		component.stop();
		//assertEquals(State.EXECUTE, component.getState());
		sleep(5);		
		component.reset();
		//assertEquals(State.IDLE, component.getState());
	
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}
	
/*
	@Test
	public void testAck() throws ComponentException {
		FestoComponent component = new FestoComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());
		
		assertEquals(State.STOPPED, component.getState());
		
		component.ackn();		
		//sleep(2);	
		//assertEquals(State.EXECUTE, component.getState());
		
		sleep(20);		
		//assertEquals(State.IDLE, component.getState());
	
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}
	
	*/
	/*
	@Test
	public void testCancelJob() throws ComponentException {
		OpcUaDeviceComponent component = new FestoComponent(opcuaConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());
		
		assertEquals(State.STOPPED, component.getState());
		//component.reset();
		sleep(10);
		
		//assertEquals(State.IDLE, component.getState());

		UnitConfiguration config = new UnitConfiguration();		
		config.setRecipe(0);
		ComponentRequestStatus status = component.setUnitConfig(config);
		
		component.start();		
		sleep(5);	
		
		//assertEquals(State.EXECUTE, component.getState());
		component.stop();
		
		
		sleep(10);
		assertEquals(State.STOPPED, component.getState());
//		component.stop();
		sleep(10);	
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}
	*/

}
