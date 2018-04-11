package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.ComponentCategory;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.OpcUaDeviceComponent;
import de.dfki.iui.basys.runtime.component.device.packml.Mode;
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

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testRegisterServicesAndList() throws ComponentException {
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

		service1.reset();
		details1 = registry.getComponentById(service1.getCategory(), service1.getId());
		assertEquals(State.IDLE, details1.getCurrentState());

		service2.activate(context);
		ComponentInfo details2 = registry.getComponentById(service2.getCategory(), service2.getId());
		assertNotNull(details2);

		service3.activate(context);
		ComponentInfo details3 = registry.getComponentById(service3.getCategory(), service3.getId());
		assertNotNull(details3);

		List<ComponentInfo> services = registry.getComponents(ComponentCategory.NONE);
		assertEquals(3+2, services.size()); // component-manager & component-registry are also registered

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
