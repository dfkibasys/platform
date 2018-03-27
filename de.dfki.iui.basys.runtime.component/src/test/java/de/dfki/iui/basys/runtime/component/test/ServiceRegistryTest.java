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

import de.dfki.iui.basys.runtime.component.OpcUaComponent;
import de.dfki.iui.basys.runtime.component.packml.Mode;
import de.dfki.iui.basys.runtime.component.packml.State;
import de.dfki.iui.basys.runtime.component.registry.InstanceDetails;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;
import de.dfki.iui.basys.runtime.component.registry.ZookeeperServiceRegistry;

public class ServiceRegistryTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
	private static final String PATH = "/discovery/myproducts";
	
	private ZookeeperServiceRegistry registry;
	
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
		registry = new ZookeeperServiceRegistry();
		registry.activate();
	}

	@After
	public void tearDown() throws Exception {
		registry.deactivate();
		registry = null;
	}
	
	@Test
	public void testRegisterServicesAndList() {
		//fail("Not yet implemented");

		// TODO: implement test
		// Step 1: register 3 different services
		TestDeviceComponent service1 = new TestDeviceComponent("service1", registry);
		TestDeviceComponent service2 = new TestDeviceComponent("service2", registry);		
		TestDeviceComponent service3 = new TestDeviceComponent("service3", registry);

		service1.activate();
		InstanceDetails details1 = registry.getService(service1.getId());
		assertNotNull(details1);
		
		service1.reset();				
		details1 = registry.getService(service1.getId());
		assertEquals(State.IDLE, details1.getCurrentState());
		
		service2.activate();
		InstanceDetails details2 = registry.getService(service2.getId());
		assertNotNull(details2);
		
		service3.activate();
		InstanceDetails details3 = registry.getService(service3.getId());
		assertNotNull(details3);

		
		
		List<InstanceDetails> services = registry.getServices("device");
		assertEquals(3,services.size());
		
		service1.deactivate();
		details1 = registry.getService(service1.getId());
		assertNull(details1);
		
		service2.deactivate();
		details2 = registry.getService(service2.getId());
		assertNull(details2);
		
		service3.deactivate();
		details3 = registry.getService(service3.getId());
		assertNull(details3);
		// Step 2: list all registered services
		// Step 3: assert that all registered services from step 1 are in the list

		LOGGER.info("testRegisterServicesAndList - complete");
	}

//	@Test
//	public void testRegisterServicesAndRemove() {
//		//fail("Not yet implemented");
//		
//		// TODO: implement test
//		// Step 1: register 3 different services
//		// Step 2: remove one of the services from the registry
//		// Step 2: list all registered services
//		// Step 3: assert that the two remaining services are in the list
//	}
//
//	@Test
//	public void testQueryServicesOneResult() {
//		//fail("Not yet implemented");
//		
//		// TODO: implement test
//		// Step 1: register 3 different services
//		// Step 2: query for one of the services
//		// Step 3: assert that retrieved service is the one you asked for
//	}
//	
//	@Test
//	public void testQueryServicesTwoResults() {
//		//fail("Not yet implemented");
//		
//		// TODO: implement test
//		// Step 1: register 3 different services, two of them should have something in common 
//		// Step 2: query for the common attribute of these services
//		// Step 3: assert that retrieved services are the two you asked for
//	}
//	
//	@Test
//	public void testQueryServicesNoResult() {
//		//fail("Not yet implemented");
//		
//		// TODO: implement test
//		// Step 1: register 3 different services
//		// Step 2: query for one of the services
//		// Step 3: assert that retrieved service is the one you asked for
//	}
	
	
}
