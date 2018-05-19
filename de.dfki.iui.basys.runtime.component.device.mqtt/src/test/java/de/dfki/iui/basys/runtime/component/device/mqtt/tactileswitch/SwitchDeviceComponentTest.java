package de.dfki.iui.basys.runtime.component.device.mqtt.tactileswitch;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.domain.capability.SwitchConfirmationCapability;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.communication.provider.MqttCommunicationProvider;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class SwitchDeviceComponentTest {

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
		String basysBroker = MqttCommunicationProvider.defaultConnectionString;
		String localBroker = "tcp://127.0.0.1:1883";
		componentConfig = new ComponentConfigurationImpl.Builder()
				.componentId("switch-component")
				.componentName("switch-component")
				.inChannelName("switch-component#in")
				.outChannelName("switch-component#out")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.externalConnectionString(basysBroker).build();
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
		
		SwitchDeviceComponent component = new SwitchDeviceComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}
	
	@Test
	@Ignore
	public void testActivateStop() throws ComponentException {
		SwitchDeviceComponent component = new SwitchDeviceComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		
		component.reset();
		sleep(1);
		
		SwitchConfirmationCapability capability = CapabilityFactory.eINSTANCE.createSwitchConfirmationCapability();
		capability.setState(1);
		
		CapabilityRequest req = ComponentFactory.eINSTANCE.createCapabilityRequest();
		req.setCapability(capability);
		req.setComponentId(componentConfig.getComponentId());
		
		try {
			String payload = JsonUtils.toString(req);
			Request message = CommFactory.getInstance().createRequest(payload);
			component.handleRequest(null, message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		sleep(3);
				
		assertEquals(State.EXECUTE, component.getState());
		
		component.stop();
		
		sleep(3);
		
		assertEquals(State.IDLE, component.getState());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}
	
	@Test
	@Ignore
	public void testActivateComplete() throws ComponentException {
		SwitchDeviceComponent component = new SwitchDeviceComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		
		component.reset();
		sleep(1);
		
		SwitchConfirmationCapability capability = CapabilityFactory.eINSTANCE.createSwitchConfirmationCapability();
		capability.setState(1);
		
		CapabilityRequest req = ComponentFactory.eINSTANCE.createCapabilityRequest();
		req.setCapability(capability);
		req.setComponentId(componentConfig.getComponentId());
		
		try {
			String payload = JsonUtils.toString(req);
			Request message = CommFactory.getInstance().createRequest(payload);
			component.handleRequest(null, message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		sleep(3);
				
		assertEquals(State.EXECUTE, component.getState());
		
		sleep(10);
		
		assertEquals(State.IDLE, component.getState());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}
	
}
