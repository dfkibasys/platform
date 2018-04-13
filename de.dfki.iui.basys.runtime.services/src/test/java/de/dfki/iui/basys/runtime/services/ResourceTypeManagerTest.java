package de.dfki.iui.basys.runtime.services;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.packml.State;
import de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl;
import de.dfki.iui.basys.runtime.services.impl.ResourceTypeManagerImpl;

public class ResourceTypeManagerTest extends BaseComponentTest {

	ResourceTypeManagerImpl manager;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ComponentConfiguration configResourceTypeCatalogueManager = new ComponentConfiguration.Builder()
				.componentId("ResourceInstanceManager-1")
				.componentName("ResourceInstanceManager-1")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.impl.ResourceTypeCatalogueManagerImpl")
				//.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				//.communicationProviderConnectionString(communicationProviderConnectionString)
				.externalConnectionString(new File(".").getAbsolutePath() + "\\src\\test\\resources\\model\\cebit.resourcetype")
				.build();
		
		manager = new ResourceTypeManagerImpl(configResourceTypeCatalogueManager);
		manager.activate(new ComponentContext.Builder().build());
		
		State state = manager.getState();
	}

	@After
	public void tearDown() throws Exception {
		manager.deactivate();
	}

	@Test
	public void testGetById() {
		String id = "_Hi37STD5EeiuBvcKgWzd3Q";
		ResourceType type= manager.getResourceType(id);
		assertEquals("UR3", type.getName());
	}


}
