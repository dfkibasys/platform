package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.component.OpcUaComponent;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;
import de.dfki.iui.basys.runtime.component.registry.ZookeeperServiceRegistry;

public class ServiceRegistryTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(ServiceRegistryTest.class);
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
		service2.activate();
		service3.activate();
	

		service1.deactivate();
		service2.deactivate();
		service3.deactivate();
	
		
		// Step 2: list all registered services
		// Step 3: assert that all registered services from step 1 are in the list

		LOGGER.info("testRegisterServicesAndList - complete");
	}
	
	@Test
	public void testRegisterServicesAndRemove() {
		//fail("Not yet implemented");
		
		// TODO: implement test
		// Step 1: register 3 different services
		// Step 2: remove one of the services from the registry
		// Step 2: list all registered services
		// Step 3: assert that the two remaining services are in the list
	}

	@Test
	public void testQueryServicesOneResult() {
		//fail("Not yet implemented");
		
		// TODO: implement test
		// Step 1: register 3 different services
		// Step 2: query for one of the services
		// Step 3: assert that retrieved service is the one you asked for
	}
	
	@Test
	public void testQueryServicesTwoResults() {
		//fail("Not yet implemented");
		
		// TODO: implement test
		// Step 1: register 3 different services, two of them should have something in common 
		// Step 2: query for the common attribute of these services
		// Step 3: assert that retrieved services are the two you asked for
	}
	
	@Test
	public void testQueryServicesNoResult() {
		//fail("Not yet implemented");
		
		// TODO: implement test
		// Step 1: register 3 different services
		// Step 2: query for one of the services
		// Step 3: assert that retrieved service is the one you asked for
	}
	
	
}
