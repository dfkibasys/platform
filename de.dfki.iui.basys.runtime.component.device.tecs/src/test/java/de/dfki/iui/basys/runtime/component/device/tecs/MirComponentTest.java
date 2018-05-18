package de.dfki.iui.basys.runtime.component.device.tecs;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;

public class MirComponentTest extends BaseComponentTest {

	ComponentContext emptyContext = new ComponentContext.Builder().build();
	private ComponentConfiguration mirComponentConfig;
	private ComponentConfiguration deviceComponentConfig;
	private ComponentConfiguration serviceComponentConfig;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
	/*	mirComponentConfig = new ComponentConfigurationImpl.Builder().componentId("mir-component")
				.inChannelName("mir-component#in").outChannelName("mir-component#out")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.tecs.MirComponent")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.externalConnectionString(String.format("tecs.tcp://%s:%s", "10.2.0.71", 9030)).build();

		deviceComponentConfig = new ComponentConfigurationImpl.Builder().componentId("laser-device-component")
				.componentName("laser-device-component").inChannelName("laser-device-component#in")
				.outChannelName("laser-device-component#out").componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass(
						"de.dfki.iui.basys.runtime.component.device.laser.LaserDeviceComponent")
				.externalConnectionString("http://192.168.100.3:9000/laserControl").build();

		serviceComponentConfig = new ComponentConfigurationImpl.Builder().componentId("laser-service-component")
				.componentName("laser-service-component").inChannelName("laser-service-component#in")
				.outChannelName("laser-service-component#out").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass(
						"de.dfki.iui.basys.runtime.component.device.laser.LaserServiceComponent")
				.externalConnectionString("basys.component://laser-device-component").build();*/

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore
	public void listenForever() throws ComponentException {

		try {

			componentManager.createLocalComponent(mirComponentConfig);
			componentManager.createLocalComponent(deviceComponentConfig);
			componentManager.createLocalComponent(serviceComponentConfig);

			Component mirComponent = componentManager.getLocalComponentById(mirComponentConfig.getComponentId());
			Component deviceComponent = componentManager.getLocalComponentById(deviceComponentConfig.getComponentId());
			Component serviceComponent = componentManager
					.getLocalComponentById(serviceComponentConfig.getComponentId());

			assertTrue(deviceComponent.isActivated());
			assertTrue(serviceComponent.isActivated());
			assertTrue(mirComponent.isActivated());

			while (true) {

			}

		} catch (ComponentManagerException e) {
			e.printStackTrace();
		}

		while (true) {

		}

	}

	/*
	 * @Test public void testConnection() throws ComponentException { MirComponent
	 * component = new MirComponent(componentConfig);
	 * assertTrue(!component.isConnectedToExternal());
	 * 
	 * component.activate(emptyContext);
	 * assertTrue(component.isConnectedToExternal());
	 * 
	 * component.deactivate(); assertTrue(!component.isConnectedToExternal()); }
	 * 
	 * @Test public void testGotoPosition0() throws ComponentException {
	 * MirComponent component = new MirComponent(componentConfig);
	 * assertTrue(!component.isConnectedToExternal());
	 * 
	 * component.activate(emptyContext);
	 * assertTrue(component.isConnectedToExternal());
	 * 
	 * assertEquals(State.STOPPED, component.getState()); component.reset();
	 * sleep(5);
	 * 
	 * // the following code block is equivalent to the handleCapabilityRequest
	 * method assertEquals(State.IDLE, component.getState()); UnitConfiguration
	 * config = new UnitConfiguration(); config.setRecipe(0);
	 * component.setUnitConfig(config); component.start(); sleep(300);
	 * 
	 * assertEquals(State.COMPLETE, component.getState()); component.stop();
	 * sleep(5);
	 * 
	 * component.deactivate(); assertTrue(!component.isConnectedToExternal()); }
	 */

	// @Test
	// public void testGotoPosition1() throws ComponentException {
	// test all positions
	// }

}
