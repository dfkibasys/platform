package de.dfki.iui.basys.runtime.component.device.tecs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class MirComponentTest {

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
		componentConfig = new ComponentConfigurationImpl.Builder().componentId("mir-component")
				.externalConnectionString(String.format("tecs.tcp://%s:%s", "10.2.0.40", 9030)).build();
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
	public void testConnection() throws ComponentException {
		MirComponent component = new MirComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}

	@Test
	public void testGotoPosition0() throws ComponentException {
		MirComponent component = new MirComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());
		
		assertEquals(State.STOPPED, component.getState());
		component.reset();
		sleep(5);
		
		// the following code block is equivalent to the handleCapabilityRequest method
		assertEquals(State.IDLE, component.getState());		
		UnitConfiguration config = new UnitConfiguration();
		config.setRecipe(0);
		component.setUnitConfig(config);
		component.start();		
		sleep(300);	
		
		assertEquals(State.COMPLETE, component.getState());
		component.stop();
		sleep(5);	
		
		component.deactivate();
		assertTrue(!component.isConnectedToExternal());
	}

//	@Test
//	public void testGotoPosition1() throws ComponentException {
//		test all positions
//	}
	
}
