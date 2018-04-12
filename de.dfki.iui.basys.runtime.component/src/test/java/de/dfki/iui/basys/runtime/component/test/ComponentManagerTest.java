package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.component.manager.impl.ComponentManagerImpl;
import de.dfki.iui.basys.runtime.component.registry.ComponentInfo;
import de.dfki.iui.basys.runtime.component.Component;

public class ComponentManagerTest extends BaseComponentTest {
	
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
	public void testAddGetRemoveServiceComponent() {

		try {
			List<Component> components = componentManager.getLocalComponents();
			assertEquals(0,components.size());
			
			componentManager.createLocalComponent(config1);
			components = componentManager.getLocalComponents();
			assertEquals(1,components.size());
			ComponentInfo details1 = registry.getComponentById(config1.getComponentCategory(), config1.getComponentId());
			assertNotNull(details1);
			
			componentManager.createLocalComponent(config2);
			components = componentManager.getLocalComponents();
			assertEquals(2,components.size());
			ComponentInfo details2 = registry.getComponentById(config1.getComponentCategory(),config2.getComponentId());
			assertNotNull(details2);

			componentManager.createLocalComponent(config3);			
			components = componentManager.getLocalComponents();
			assertEquals(3,components.size());
			ComponentInfo details3 = registry.getComponentById(config1.getComponentCategory(),config3.getComponentId());
			assertNotNull(details3);

			components = componentManager.getLocalComponents();
			assertEquals(3,components.size());
			
			componentManager.deleteLocalComponent(config1.getComponentId());
			components = componentManager.getLocalComponents();
			assertEquals(2,components.size());
			details1 = registry.getComponentById(config1.getComponentCategory(),config1.getComponentId());
			assertNull(details1);
			
			componentManager.deleteLocalComponent(config2.getComponentId());
			components = componentManager.getLocalComponents();
			assertEquals(1,components.size());
			details2 = registry.getComponentById(config1.getComponentCategory(),config2.getComponentId());
			assertNull(details2);
			
			componentManager.deleteLocalComponent(config3.getComponentId());
			components = componentManager.getLocalComponents();
			assertEquals(0,components.size());
			details3 = registry.getComponentById(config1.getComponentCategory(),config3.getComponentId());
			assertNull(details3);			
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
