package de.dfki.iui.basys.runtime.component.device.ros;

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
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.model.runtime.component.impl.PropertyImpl;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;

public class RosComponentTest {

	ComponentConfiguration componentConfig;
	ComponentContext emptyContext = new ComponentContext.Builder().build();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		componentConfig = new ComponentConfigurationImpl.Builder().componentId("test-ros-component").componentName("test-ros-component")
				.externalConnectionString(String.format("ws://%s:%s", "lns-90165.sb.dfki.de", 9090)).build();
		componentConfig.getProperties().add(new PropertyImpl.Builder().key("unittesting").value("true").build());
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
	public void testConnection() throws ComponentException {
		DeviceComponent component = new TestRosComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}

	@Test
	public void testComponentLifecycleComplete() throws ComponentException {
		DeviceComponent component = new TestRosComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());		
		assertEquals(State.STOPPED, component.getState(true));
		
		component.reset();		
		assertEquals(State.RESETTING, component.getState(true));
		assertEquals(State.IDLE, component.getState(true));
		
		component.start();	
		assertEquals(State.STARTING, component.getState(true));			
		assertEquals(State.EXECUTE, component.getState(true));		
		assertEquals(State.COMPLETING, component.getState(true));
		assertEquals(State.COMPLETE, component.getState(true));
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}
	
	@Test
	@Ignore
	public void testComponentLifecycleStop() throws ComponentException {
		DeviceComponent component = new TestRosComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());		
		assertEquals(State.STOPPED, component.getState(true));
		
		component.reset();		
		assertEquals(State.RESETTING, component.getState(true));
		assertEquals(State.IDLE, component.getState(true));
		
		component.start();	
		assertEquals(State.STARTING, component.getState(true));			
		assertEquals(State.EXECUTE, component.getState(true));
		
		component.stop();
		assertEquals(State.STOPPING, component.getState(true));
		assertEquals(State.STOPPED, component.getState(true));
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}

}
