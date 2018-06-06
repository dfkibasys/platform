package de.dfki.iui.basys.runtime.component.device.tecs;

import static org.junit.Assert.assertTrue;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.domain.capability.ProjectPath;
import de.dfki.iui.basys.model.domain.resourceinstance.GeneralCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstanceFactory;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.runtime.communication.CommFactory;
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

	@Override
	@Before
	public void setUp() throws Exception {
		/*super.setUp();
		mirComponentConfig = new ComponentConfigurationImpl.Builder().componentId("mir-component")
				.componentName("mir-component").inChannelName("mir-component#in").outChannelName("mir-component#out")
				.componentImplementationJavaClass(
						"de.dfki.iui.basys.runtime.component.device.tecs.MirComponent")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.externalConnectionString(String.format("tecs.tcp://%s:%s", "10.2.0.70",
				 9030))
				.build();

		deviceComponentConfig = new ComponentConfigurationImpl.Builder().componentId("laser-device-component")
				.componentName("laser-device-component").inChannelName("laser-device-component#in")
				.outChannelName("laser-device-component#out").componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass(
						"de.dfki.iui.basys.runtime.component.device.laser.LaserDeviceComponent")
				.externalConnectionString("http://10.2.0.70:9000/laserControl").build();

		serviceComponentConfig = new ComponentConfigurationImpl.Builder().componentId("laser-service-component")
				.componentName("laser-service-component").inChannelName("laser-service-component#in")
				.outChannelName("laser-service-component#out").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass(
						"de.dfki.iui.basys.runtime.component.device.laser.LaserServiceComponent")
				.externalConnectionString("basys.component://laser-device-component").build();
*/
	}

	@Override
	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore
	public void testInChannel() throws ComponentException, JsonProcessingException, ComponentManagerException {

		componentManager.createLocalComponent(mirComponentConfig);
		componentManager.createLocalComponent(deviceComponentConfig);
		componentManager.createLocalComponent(serviceComponentConfig);

		Channel componentInChannel = CommFactory.getInstance().openChannel(context.getSharedChannelPool(),
				"laser-device-component#in", false, null);

		ProjectPath capability = CapabilityFactory.eINSTANCE.createProjectPath();
		capability.setPath(null);
		capability.setDelay(1000);
		capability.setArrowCount(3);
		capability.setColor(0);

		GeneralCapabilityVariant variant = ResourceinstanceFactory.eINSTANCE.createGeneralCapabilityVariant();
		variant.setCapability(capability);

		CapabilityRequest req = ComponentFactory.eINSTANCE.createCapabilityRequest();
		req.setCapabilityVariant(variant);
		req.setComponentId("laser-device-component");
		Request test = CommFactory.getInstance().createRequest(JsonUtils.toString(req));
		componentInChannel.sendRequest(test);

	}

	@Test
	public void testMission() {
		
		
		Client restClient = ClientBuilder.newClient();
		String mRest_URI = "http://robot-mir-04.mrk40.dfki.lan:8080/v1.0.0/mission_queue";

		String payload = "{\"mission\":\"f4c63d9a-696a-11e8-a644-f44d3061d9da\"}";  
		Response r = restClient.target(mRest_URI).request(MediaType.APPLICATION_JSON).post(Entity.json(payload));
		LOGGER.debug("Status: " + r.getStatus());
		
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
