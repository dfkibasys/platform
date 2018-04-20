package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.ComponentCategory;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.State;
import de.dfki.iui.basys.runtime.component.registry.ComponentInfo;

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
	public void testRegisterServicesAndList() throws ComponentException, InterruptedException {
		LOGGER.info("testRegisterServicesAndList - start");

		// fail("Not yet implemented");

		// TODO: implement test
		// Step 1: register 3 different services

		TestDeviceComponent service1 = new TestDeviceComponent(config1);
		TestDeviceComponent service2 = new TestDeviceComponent(config2);
		TestDeviceComponent service3 = new TestDeviceComponent(config3);

		service1.activate(context);
		ComponentInfo details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertNotNull(details1);
		assertEquals(config1.getComponentId(), details1.getId());
	
		service2.activate(context);
		ComponentInfo details2 = registry.getComponentById(service2.getCategory(), service2.getId());
		assertNotNull(details2);
		assertEquals(config2.getComponentId(), details2.getId());
		
		service3.activate(context);
		ComponentInfo details3 = registry.getComponentById(service3.getCategory(), service3.getId());
		assertNotNull(details3);
		assertEquals(config3.getComponentId(), details3.getId());
				
		List<ComponentInfo> services = registry.getComponents(ComponentCategory.DEVICE_COMPONENT);
		assertEquals(3, services.size()); // component-manager & component-registry are also registered

		service1.reset();
		service2.reset();
		service3.reset();
		
		TimeUnit.SECONDS.sleep(3);
		
		service1.deactivate();
		details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertNull(details1);

		service2.deactivate();
		details2 = registry.getComponentById(service2.getCategory(), service2.getId());
		assertNull(details2);

		service3.deactivate();
		details3 = registry.getComponentById(service3.getCategory(), service3.getId());
		assertNull(details3);
		// Step 2: list all registered services
		// Step 3: assert that all registered services from step 1 are in the list

		LOGGER.info("testRegisterServicesAndList - complete");
	}

	@Test
	public void testServiceLifecycle() throws ComponentException {
		LOGGER.info("testServiceLifecycle - start");
		
		TestDeviceComponent service1 = new TestDeviceComponent(config1);
		service1.activate(context);
		ComponentInfo details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertNotNull(details1);
		assertEquals(config1.getComponentId(), details1.getId());
		assertEquals(State.STOPPED,details1.getCurrentState());
			
		service1.reset();
		sleep(2);
		details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertNotNull(details1);
		assertEquals(config1.getComponentId(), details1.getId());
		assertEquals(State.IDLE,details1.getCurrentState());
		
		service1.start();
		sleep(2);
		details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertNotNull(details1);
		assertEquals(config1.getComponentId(), details1.getId());
		assertEquals(State.EXECUTE,details1.getCurrentState());
		
		sleep(3);
		details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertNotNull(details1);
		assertEquals(config1.getComponentId(), details1.getId());
		assertEquals(State.COMPLETE,details1.getCurrentState());
		
		service1.stop();
		sleep(2);
		details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertNotNull(details1);
		assertEquals(config1.getComponentId(), details1.getId());
		assertEquals(State.STOPPED,details1.getCurrentState());
		
		service1.deactivate();
		details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertNull(details1);
		
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
