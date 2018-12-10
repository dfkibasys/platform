package de.dfki.cos.basys.platform.runtime.component.registry.zookeeper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.device.TestDeviceComponent;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentInfo;
import de.dfki.iui.basys.model.runtime.component.State;

public class ServiceRegistryTest extends BaseComponentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// not really needed
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// not really needed
	}

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testRegisterDeviceComponentsAndList() throws ComponentException, InterruptedException {
		LOGGER.info("testRegisterServicesAndList - start");

		// fail("Not yet implemented");

		// TODO: implement test
		// Step 1: register 3 different services

		TestDeviceComponent comp1 = new TestDeviceComponent(config1);
		TestDeviceComponent comp2 = new TestDeviceComponent(config2);
		TestDeviceComponent comp3 = new TestDeviceComponent(config3);

		comp1.activate(context);
		ComponentInfo details1 = registry.getComponentById(comp1.getCategory(), comp1.getId());
		assertNotNull(details1);
		assertEquals(config1.getComponentId(), details1.getComponentId());
	
		comp2.activate(context);
		ComponentInfo details2 = registry.getComponentById(comp2.getCategory(), comp2.getId());
		assertNotNull(details2);
		assertEquals(config2.getComponentId(), details2.getComponentId());
		
		comp3.activate(context);
		ComponentInfo details3 = registry.getComponentById(comp3.getCategory(), comp3.getId());
		assertNotNull(details3);
		assertEquals(config3.getComponentId(), details3.getComponentId());
				
		List<ComponentInfo> services = registry.getComponents(ComponentCategory.DEVICE_COMPONENT);
		assertEquals(3, services.size());

		comp1.deactivate();
		details1 = registry.getComponentById(comp1.getCategory(), comp1.getId());
		assertNull(details1);

		comp2.deactivate();
		details2 = registry.getComponentById(comp2.getCategory(), comp2.getId());
		assertNull(details2);

		comp3.deactivate();
		details3 = registry.getComponentById(comp3.getCategory(), comp3.getId());
		assertNull(details3);
		
		services = registry.getComponents(ComponentCategory.DEVICE_COMPONENT);
		assertEquals(0, services.size());

		LOGGER.info("testRegisterServicesAndList - complete");
	}

	@Test
	public void testDeviceComponentLifecycle() throws ComponentException {
		LOGGER.info("testServiceLifecycle - start");
		
		TestDeviceComponent comp = new TestDeviceComponent(config1);
		comp.activate(context);

		assertEquals(State.STOPPED, comp.getLastState());
			
		comp.reset();
		assertEquals(State.RESETTING, comp.getLastState());
		assertEquals(State.IDLE, comp.getLastState());
		
		comp.start();
		assertEquals(State.STARTING, comp.getLastState());
		assertEquals(State.EXECUTE, comp.getLastState());

		assertEquals(State.COMPLETING, comp.getLastState());

		comp.stop();
		//assertEquals(State.COMPLETE, comp.getLastState());		
		
		assertEquals(State.STOPPING, comp.getLastState());
		assertEquals(State.STOPPED, comp.getLastState());		
		
		comp.deactivate();
		
		LOGGER.info("testServiceLifecycle - complete");
	}
		
	@Test
	public void testDeviceComponentLifecycle2() throws ComponentException {
		LOGGER.info("testServiceLifecycle - start");
		
		TestDeviceComponent comp = new TestDeviceComponent(config1);
		comp.activate(context);

		assertEquals(State.STOPPED, comp.getLastState());
			
		comp.reset();
		assertEquals(State.RESETTING, comp.getLastState());
		assertEquals(State.IDLE, comp.getLastState());
		
		comp.start();
		assertEquals(State.STARTING, comp.getLastState());
		assertEquals(State.EXECUTE, comp.getLastState());
		
		comp.stop();
		
//		assertEquals(State.COMPLETING, comp.getLastState());
//		assertEquals(State.COMPLETE, comp.getLastState());		
//		
//		
//		assertEquals(State.RESETTING, comp.getLastState());
		assertEquals(State.STOPPING, comp.getLastState());
		assertEquals(State.STOPPED, comp.getLastState());		
		
		comp.deactivate();
		
		LOGGER.info("testServiceLifecycle - complete");
	}

	@Test
	public void testDeviceComponentLifecycle3() throws ComponentException {
		LOGGER.info("testServiceLifecycle - start");
		
		TestDeviceComponent comp = new TestDeviceComponent(config1);
		comp.activate(context);

		assertEquals(State.STOPPED, comp.getLastState());
		ComponentInfo info = registry.getComponentById(comp.getCategory(), comp.getId());
		assertNotNull(info);
		assertEquals(config1.getComponentId(), info.getComponentId());
		assertEquals(State.STOPPED,info.getCurrentState());
			
		comp.reset();
		assertEquals(State.RESETTING, comp.getLastState());
		assertEquals(State.IDLE, comp.getLastState());
		info = registry.getComponentById(comp.getCategory(), comp.getId());
		assertNotNull(info);
		assertEquals(config1.getComponentId(), info.getComponentId());		
		assertEquals(State.IDLE,info.getCurrentState());
		
		comp.start();
		assertEquals(State.STARTING, comp.getLastState());
		assertEquals(State.EXECUTE, comp.getLastState());
		info = registry.getComponentById(comp.getCategory(), comp.getId());
		assertNotNull(info);
		assertEquals(config1.getComponentId(), info.getComponentId());
		assertEquals(State.EXECUTE,info.getCurrentState());

		assertEquals(State.COMPLETING, comp.getLastState());
		assertEquals(State.COMPLETE, comp.getLastState());		
		info = registry.getComponentById(comp.getCategory(), comp.getId());
		assertNotNull(info);
		assertEquals(config1.getComponentId(), info.getComponentId());
		assertEquals(State.COMPLETE,info.getCurrentState());
		
		comp.stop();
		assertEquals(State.STOPPING, comp.getLastState());
		assertEquals(State.STOPPED, comp.getLastState());		
		info = registry.getComponentById(comp.getCategory(), comp.getId());
		assertNotNull(info);
		assertEquals(config1.getComponentId(), info.getComponentId());
		assertEquals(State.STOPPED,info.getCurrentState());
		
		comp.deactivate();
		info = registry.getComponentById(comp.getCategory(), comp.getId());
		assertNull(info);
		
		LOGGER.info("testServiceLifecycle - complete");
	}
		
	// @Test
	// public void testRegisterServicesAndRemove() {
	// //fail("Not yet implemented");
	//
	// // TODO: implement test
	// // Step 1: register 3 different services
	// // Step 2: remove one of the services from the registry
	// // Step 2: list all registered services
	// // Step 3: assert that the two remaining services are in the list
	// }
	//
	// @Test
	// public void testQueryServicesOneResult() {
	// //fail("Not yet implemented");
	//
	// // TODO: implement test
	// // Step 1: register 3 different services
	// // Step 2: query for one of the services
	// // Step 3: assert that retrieved service is the one you asked for
	// }
	//
	// @Test
	// public void testQueryServicesTwoResults() {
	// //fail("Not yet implemented");
	//
	// // TODO: implement test
	// // Step 1: register 3 different services, two of them should have something
	// in common
	// // Step 2: query for the common attribute of these services
	// // Step 3: assert that retrieved services are the two you asked for
	// }
	//
	// @Test
	// public void testQueryServicesNoResult() {
	// //fail("Not yet implemented");
	//
	// // TODO: implement test
	// // Step 1: register 3 different services
	// // Step 2: query for one of the services
	// // Step 3: assert that retrieved service is the one you asked for
	// }

}
