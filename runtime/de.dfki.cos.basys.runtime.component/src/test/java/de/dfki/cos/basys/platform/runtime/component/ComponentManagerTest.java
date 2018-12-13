package de.dfki.cos.basys.platform.runtime.component;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.runtime.component.Component;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManagerException;

public class ComponentManagerTest extends BaseComponentTest {
	
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
	public void testAddGetRemoveServiceComponent() {

		try {
			List<Component> components = componentManager.getLocalComponents();
			assertEquals(0,components.size());
			
			componentManager.createLocalComponent(config1);
			components = componentManager.getLocalComponents();
			assertEquals(1,components.size());

			componentManager.createLocalComponent(config2);
			components = componentManager.getLocalComponents();
			assertEquals(2,components.size());

			componentManager.createLocalComponent(config3);			
			components = componentManager.getLocalComponents();
			assertEquals(3,components.size());

			components = componentManager.getLocalComponents();
			assertEquals(3,components.size());
			
			componentManager.deleteLocalComponent(config1.getComponentId());
			components = componentManager.getLocalComponents();
			assertEquals(2,components.size());
			
			componentManager.deleteLocalComponent(config2.getComponentId());
			components = componentManager.getLocalComponents();
			assertEquals(1,components.size());
	
			componentManager.deleteLocalComponent(config3.getComponentId());
			components = componentManager.getLocalComponents();
			assertEquals(0,components.size());
	
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
