package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentManager;
import de.dfki.iui.basys.runtime.component.ComponentManagerException;
import de.dfki.iui.basys.runtime.component.ComponentManagerImpl;
import de.dfki.iui.basys.runtime.component.ServiceComponent;
import de.dfki.iui.basys.runtime.component.registry.InstanceDetails;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration.CommunicationProviderEnum;

public class ComponentManagerTest extends BaseComponentTest {
	
	protected ComponentManager componentManager;
	
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
		componentManager = new ComponentManagerImpl(context);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testAddGetRemoveServiceComponent() {
		ComponentConfiguration config1 = new ComponentConfiguration()
				.setId("service1")
				.setImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.setCommunicationProvider(CommunicationProviderEnum.JMS);		
		
		ComponentConfiguration config2 = new ComponentConfiguration()
				.setId("service2")
				.setImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.setCommunicationProvider(CommunicationProviderEnum.JMS);		
				
		ComponentConfiguration config3 = new ComponentConfiguration()
				.setId("service3")
				.setImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.setCommunicationProvider(CommunicationProviderEnum.JMS);	

		try {
			List<ServiceComponent> components = componentManager.getServiceComponents();
			assertEquals(0,components.size());
			
			componentManager.addServiceComponent(config1);
			components = componentManager.getServiceComponents();
			assertEquals(1,components.size());
			InstanceDetails details1 = registry.getService(config1.getId());
			assertNotNull(details1);
			
			componentManager.addServiceComponent(config2);
			components = componentManager.getServiceComponents();
			assertEquals(2,components.size());
			InstanceDetails details2 = registry.getService(config2.getId());
			assertNotNull(details2);

			componentManager.addServiceComponent(config3);			
			components = componentManager.getServiceComponents();
			assertEquals(3,components.size());
			InstanceDetails details3 = registry.getService(config3.getId());
			assertNotNull(details3);

			components = componentManager.getServiceComponents();
			assertEquals(3,components.size());
			
			componentManager.removeServiceComponent(config1.getId());
			components = componentManager.getServiceComponents();
			assertEquals(2,components.size());
			details1 = registry.getService(config1.getId());
			assertNull(details1);
			
			componentManager.removeServiceComponent(config2.getId());
			components = componentManager.getServiceComponents();
			assertEquals(1,components.size());
			details2 = registry.getService(config2.getId());
			assertNull(details2);
			
			componentManager.removeServiceComponent(config3.getId());
			components = componentManager.getServiceComponents();
			assertEquals(0,components.size());
			details3 = registry.getService(config3.getId());
			assertNull(details3);			
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
