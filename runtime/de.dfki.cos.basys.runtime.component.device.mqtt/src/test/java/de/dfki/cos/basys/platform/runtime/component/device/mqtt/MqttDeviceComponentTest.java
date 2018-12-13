package de.dfki.cos.basys.platform.runtime.component.device.mqtt;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.communication.provider.MqttCommunicationProvider;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;

public class MqttDeviceComponentTest {

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
		componentConfig = new ComponentConfigurationImpl.Builder()
				.componentId("mqtt-test-component")
				.componentName("mqtt-test-component")
				.inChannelName("mqtt-test-component#in")
				.outChannelName("mqtt-test-component#out")
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
		
		TestMqttDeviceComponent component = new TestMqttDeviceComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}
	
}
