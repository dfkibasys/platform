package de.dfki.iui.basys.runtime.component.device.ros;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.concurrent.TimeUnit;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

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
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class ChimpComponentTest {

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
		componentConfig = new ComponentConfigurationImpl.Builder().componentId("fibonacci-component").componentName("fibonacci-component")
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
		DeviceComponent component = new ChimpComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);
		assertTrue(component.isConnectedToExternal());
		
		component.deactivate();		
		assertTrue(!component.isConnectedToExternal());
	}

	@Test
	public void testComponentLifecycleComplete() throws ComponentException {
		DeviceComponent component = new ChimpComponent(componentConfig);
		assertTrue(!component.isConnectedToExternal());

		component.activate(emptyContext);		
		assertTrue(component.isConnectedToExternal());		
		assertEquals(State.STOPPED, component.getState(true));
		
		component.reset();		
		assertEquals(State.RESETTING, component.getState(true));
		assertEquals(State.IDLE, component.getState(true));
		
		String goalString = "{\r\n" + 
				"	\"tasks\" : [\r\n" + 
				"		{\r\n" + 
				"			\"id\" : \"task0\",\r\n" + 
				"			\"type\" : \"bring\" ,\r\n" + 
				"			\"args\" : [\"screwdriver1\", \"worker1\", \"workArea1\"]\r\n" + 
				"		}\r\n" + 
				"	],\r\n" + 
				"	\"constraints\" : []\r\n" + 
				"}"; 
		
		JsonReader jsonReader = Json.createReader(new StringReader(goalString));
		JsonObject goalObject = jsonReader.readObject();
		jsonReader.close();
		UnitConfiguration config = new UnitConfiguration();
		config.setPayload(goalObject);
		component.setUnitConfig(config);
		
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
		DeviceComponent component = new ChimpComponent(componentConfig);
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
