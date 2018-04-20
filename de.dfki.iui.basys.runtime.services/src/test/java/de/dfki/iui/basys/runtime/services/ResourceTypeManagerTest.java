package de.dfki.iui.basys.runtime.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.runtime.services.impl.ResourceTypeManagerImpl;

public class ResourceTypeManagerTest extends BaseEmfServiceComponentTest<ResourceTypeManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ResourceTypeManagerImpl";
		file = "cebit.resourcetype";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	@Test
	public void testGetById() {
		String id = "_Hi37STD5EeiuBvcKgWzd3Q";
		ResourceType type = service.getResourceType(id);
		assertEquals("UR3", type.getName());
	}

}
