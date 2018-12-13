package de.dfki.cos.basys.platform.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.cos.basys.platform.runtime.services.impl.ResourceInstanceManagerImpl;

public class ResourceInstanceManagerTest extends BaseEmfServiceComponentTest<ResourceInstanceManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl";
		file = "model.resourceinstance";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetResourceInstance() {
		String id = "_jJdx4DD7EeiuBvcKgWzd3Q";
		ResourceInstance instance = service.getResourceInstance(id);

		assertEquals(id, instance.getId());
		assertEquals("My UR3", instance.getName());
	}

	@Test
	public void testGetResourceInstancesByCapability() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetResourceInstanceRepository() {
		ResourceInstanceRepository store = service.getResourceInstanceRepository();

		assertNotNull(store);
		assertEquals(11, store.getResourceInstances().size());
	}

}
