package de.dfki.iui.basys.runtime.component.device.laser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.data.CartesianCoordinate;
import de.dfki.iui.basys.model.data.DataFactory;
import de.dfki.iui.basys.model.data.Path;
import de.dfki.iui.basys.model.data.impl.CartesianCoordinateImpl;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;

public class LaserServiceComponentTest extends BaseComponentTest {

	ComponentConfiguration deviceComponentConfig;
	ComponentConfiguration serviceComponentConfig;
	ComponentContext emptyContext = new ComponentContext.Builder().build();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		
		
		
		deviceComponentConfig = new ComponentConfigurationImpl.Builder()
				.componentId("laser-device-component")
				.componentName("laser-device-component")
				.inChannelName("laser-device-component#in")
				.outChannelName("laser-device-component#out")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.laser.LaserDeviceComponent")
				.externalConnectionString("http://192.168.100.3:9000/laserControl").build();
		

		serviceComponentConfig = new ComponentConfigurationImpl.Builder()
				.componentId("laser-service-component")
				.componentName("laser-service-component")
				.inChannelName("laser-service-component#in")
				.outChannelName("laser-service-component#out")
				.componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.laser.LaserServiceComponent")
				.externalConnectionString("basys.component://laser-device-component").build();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testConnection() throws ComponentException {
		try {
			System.out.println(JsonUtils.toString(deviceComponentConfig));
			System.out.println(JsonUtils.toString(serviceComponentConfig));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			componentManager.createLocalComponent(deviceComponentConfig);
			componentManager.createLocalComponent(serviceComponentConfig);

			Component deviceComponent = componentManager.getLocalComponentById(deviceComponentConfig.getComponentId());
			Component serviceComponent = componentManager.getLocalComponentById(serviceComponentConfig.getComponentId());

			assertTrue(deviceComponent.isActivated());
			assertTrue(serviceComponent.isActivated());
			

			componentManager.deleteLocalComponent(deviceComponentConfig.getComponentId());
			componentManager.deleteLocalComponent(serviceComponentConfig.getComponentId());
			
			assertTrue(!deviceComponent.isActivated());
			assertTrue(!serviceComponent.isActivated());
			
			
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	

	
//	@Test
//	public void testPathProjection() throws ComponentException {
//
//		try {
//			componentManager.createLocalComponent(deviceComponentConfig);
//			componentManager.createLocalComponent(serviceComponentConfig);
//
//			Component deviceComponent = componentManager.getLocalComponentById(deviceComponentConfig.getComponentId());
//			Component serviceComponent = componentManager.getLocalComponentById(serviceComponentConfig.getComponentId());
//
//			assertTrue(deviceComponent.isActivated());
//			assertTrue(serviceComponent.isActivated());
//
//			CartesianCoordinate c1 = new CartesianCoordinateImpl.Builder().x(1.0).y(1.0).z(1.0).build();
//			CartesianCoordinate c2 = new CartesianCoordinateImpl.Builder().x(2.0).y(2.0).z(2.0).build();
//			CartesianCoordinate c3 = new CartesianCoordinateImpl.Builder().x(3.0).y(3.0).z(3.0).build();
//			CartesianCoordinate c4 = new CartesianCoordinateImpl.Builder().x(4.0).y(3.0).z(3.0).build();
//			CartesianCoordinate c5 = new CartesianCoordinateImpl.Builder().x(5.0).y(3.0).z(3.0).build();
//			CartesianCoordinate c6 = new CartesianCoordinateImpl.Builder().x(6.0).y(3.0).z(3.0).build();
//
//			Path path = DataFactory.eINSTANCE.createPath();
//			path.getCoordinates().add(c1);
//			path.getCoordinates().add(c2);
//			path.getCoordinates().add(c3);
//			path.getCoordinates().add(c4);
//			path.getCoordinates().add(c5);
//			path.getCoordinates().add(c6);
//
//			Channel mirOut = ClientFactory.getInstance().openChannel(sharedPool, "mir-component#out", false, null);
//
//			String payload = JsonUtils.toString(path);
//			Notification not = ClientFactory.getInstance().createNotification(payload);
//			mirOut.sendNotification(not);
//
//			sleep(5);
//
//			assertEquals(State.EXECUTE, deviceComponent.getState());
//
//			componentManager.deleteLocalComponent(deviceComponentConfig.getComponentId());
//			componentManager.deleteLocalComponent(serviceComponentConfig.getComponentId());
//
//			assertTrue(!deviceComponent.isActivated());
//			assertTrue(!serviceComponent.isActivated());
//
//		} catch (ComponentManagerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	/*
	@Test
	public void testEtaProjection() throws ComponentException {
		LaserDeviceComponent component = new LaserDeviceComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		
		
		CartesianCoordinate position = new CartesianCoordinateImpl.Builder().x(1.0).y(1.0).z(1.0).build();		
		
		ProjectETA capability = CapabilityFactory.eINSTANCE.createProjectETA();
		capability.setEta(30*1000); // Millisekunden?
		capability.setPosition(position);
		capability.setRadius(0.5); // Meter?
		//capability.setColor(0);
		
		CapabilityRequest req = ComponentFactory.eINSTANCE.createCapabilityRequest();
		req.setCapability(capability);
		req.setComponentId(componentConfig.getComponentId());
		
		try {
			String payload = JsonUtils.toString(req);
			Request message = ClientFactory.getInstance().createRequest(payload);
			component.handleRequest(message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		sleep(5);
				
		assertEquals(State.EXECUTE, component.getState());
		
		component.stop();
		
		sleep(5);
		
		assertEquals(State.IDLE, component.getState());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}
	*/
	
}
