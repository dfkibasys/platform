package de.dfki.iui.basys.runtime.services;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.packml.State;
import de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl;

public class ResourceInstanceManagerTest extends BaseComponentTest {

	ResourceInstanceManagerImpl manager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Override
	@Before
	public void setUp() throws Exception {
		ComponentConfiguration configResourceInstanceManager = new ComponentConfiguration.Builder().componentId("ResourceInstanceManager-1").componentName("ResourceInstanceManager-1")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl")
				// .communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				// .communicationProviderConnectionString(communicationProviderConnectionString)
				.externalConnectionString("file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/cebit.resourceinstance").build();

		manager = new ResourceInstanceManagerImpl(configResourceInstanceManager);
		manager.activate(new ComponentContext.Builder().build());

		State state = manager.getState();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		manager.deactivate();
	}

	@Test
	public void testGetById() {
		String id = "_jJdx4DD7EeiuBvcKgWzd3Q";
		ResourceInstance instance = manager.getResourceInstance(id);
		assertEquals("My UR3", instance.getName());
	}

}
