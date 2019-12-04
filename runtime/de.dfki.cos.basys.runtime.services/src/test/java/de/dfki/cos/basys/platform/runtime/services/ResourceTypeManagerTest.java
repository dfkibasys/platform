package de.dfki.cos.basys.platform.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogueCollection;
import de.dfki.cos.basys.platform.runtime.services.impl.ResourceTypeManagerImpl;

public class ResourceTypeManagerTest extends BaseComponentTest {

	ResourceTypeManager service = null;
	
	@Override
	@Before
	public void setUp() throws Exception {		
		super.setUp();
		service = (ResourceTypeManager) componentManager.getComponentById("resource-type-manager");
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetResourceType() {
		String id = "_Hi37STD5EeiuBvcKgWzd3Q";
		ResourceType type = service.getResourceType(id);

		assertEquals(id, type.getId());
		assertEquals("UR3", type.getName());
	}

	@Test
	public void testGetResourceTypeCatalogue() {
		// TODO: implement
	}

	@Test
	public void testGetResourceTypeCatalogueCollection() {
		ResourceTypeCatalogueCollection collection = service.getResourceTypeCatalogueCollection();

		assertNotNull(collection);
		assertEquals(9, collection.getCatalogues().size());
	}

}
