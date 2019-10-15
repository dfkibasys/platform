package de.dfki.cos.basys.platform.runtime.component.v2.registry.zookeeper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.StringConstants;

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

		BasysComponent comp1 = new BasysComponent(config1);
		BasysComponent comp2 = new BasysComponent(config2);
		BasysComponent comp3 = new BasysComponent(config3);

		comp1.activate(context);
		ComponentInfo details1 = componentRegistry.getComponentById(comp1.getCategory(), comp1.getId());
		assertNotNull(details1);
		assertEquals(config1.getProperty(StringConstants.id), details1.getId());
	
		comp2.activate(context);
		ComponentInfo details2 = componentRegistry.getComponentById(comp2.getCategory(), comp2.getId());
		assertNotNull(details2);
		assertEquals(config2.getProperty(StringConstants.id), details2.getId());
		
		comp3.activate(context);
		ComponentInfo details3 = componentRegistry.getComponentById(comp3.getCategory(), comp3.getId());
		assertNotNull(details3);
		assertEquals(config3.getProperty(StringConstants.id), details3.getId());
				
		List<ComponentInfo> services = componentRegistry.getComponents(StringConstants.categoryDevice);
		assertEquals(3, services.size());

		comp1.deactivate();
		details1 = componentRegistry.getComponentById(comp1.getCategory(), comp1.getId());
		assertNull(details1);

		comp2.deactivate();
		details2 = componentRegistry.getComponentById(comp2.getCategory(), comp2.getId());
		assertNull(details2);

		comp3.deactivate();
		details3 = componentRegistry.getComponentById(comp3.getCategory(), comp3.getId());
		assertNull(details3);
		
		services = componentRegistry.getComponents(StringConstants.categoryDevice);
		assertEquals(0, services.size());

		LOGGER.info("testRegisterServicesAndList - complete");
	}

	

//	@Test
//	@Ignore
//	public void testDeviceComponentLifecycle3() throws ComponentException {
//		LOGGER.info("testServiceLifecycle - start");
//		
//		TestDeviceComponent comp = new TestDeviceComponent(config1);
//		comp.activate(context);
//
//		assertEquals(State.STOPPED, comp.getState(true));
//		ComponentInfo info = componentRegistry.getComponentById(comp.getCategory(), comp.getId());
//		assertNotNull(info);
//		assertEquals(config1.getComponentId(), info.getComponentId());
//		assertEquals(State.STOPPED,info.getCurrentState());
//			
//		comp.reset();
//		sleep(1);
//		
//		assertEquals(State.RESETTING, comp.getState(true));
//		assertEquals(State.IDLE, comp.getState(true));
//		info = componentRegistry.getComponentById(comp.getCategory(), comp.getId());
//		assertNotNull(info);
//		assertEquals(config1.getComponentId(), info.getComponentId());		
//		assertEquals(State.IDLE,info.getCurrentState());
//		
//		comp.start();
//		sleep(1);
//		
//		assertEquals(State.STARTING, comp.getState(true));
//		assertEquals(State.EXECUTE, comp.getState(true));
//		info = componentRegistry.getComponentById(comp.getCategory(), comp.getId());
//		assertNotNull(info);
//		assertEquals(config1.getComponentId(), info.getComponentId());
//		assertEquals(State.EXECUTE,info.getCurrentState());
//
//		assertEquals(State.COMPLETING, comp.getState(true));
//		assertEquals(State.COMPLETE, comp.getState(true));		
//		info = componentRegistry.getComponentById(comp.getCategory(), comp.getId());
//		assertNotNull(info);
//		assertEquals(config1.getComponentId(), info.getComponentId());
//		assertEquals(State.COMPLETE,info.getCurrentState());
//		
//		comp.stop();
//		sleep(1);
//		
//		assertEquals(State.STOPPING, comp.getState(true));
//		assertEquals(State.STOPPED, comp.getState(true));		
//		info = componentRegistry.getComponentById(comp.getCategory(), comp.getId());
//		assertNotNull(info);
//		assertEquals(config1.getComponentId(), info.getComponentId());
//		assertEquals(State.STOPPED,info.getCurrentState());
//		
//		sleep(2);
//		comp.deactivate();
//		info = componentRegistry.getComponentById(comp.getCategory(), comp.getId());
//		assertNull(info);
//		
//		LOGGER.info("testServiceLifecycle - complete");
//	}
		
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
