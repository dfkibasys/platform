package de.dfki.iui.basys.runtime.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl;

public class ResourceInstanceManagerTest extends BaseEmfServiceComponentTest<ResourceInstanceManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl";
		file = "cebit.resourceinstance";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetById() {
		String id = "_jJdx4DD7EeiuBvcKgWzd3Q";
		ResourceInstance instance = service.getResourceInstance(id);
		assertEquals("My UR3", instance.getName());
	}

}
