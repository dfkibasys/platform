package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.ComponentManager;
import de.dfki.iui.basys.runtime.component.ComponentManagerImpl;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.component.BasysComponent;
import de.dfki.iui.basys.runtime.component.registry.InstanceDetails;

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


		try {
			List<BasysComponent> components = componentManager.getServiceComponents();
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
