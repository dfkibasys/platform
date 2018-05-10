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
		file = "model.resourcetype";

		super.setUp();
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
	
//	@Test
//	public void testGetResourceTypeByName() {
//		String name = "UR3";
//		ResourceType type = service.getResourceTypeByName(name);
//
//		assertEquals(name, type.getId());
//		assertEquals("UR3", type.getName());
//	}

//	@Test
//	public void testGetResourceTypesByManufacturer() {
//		String manufacturer = "Universal Robotics";
//		List<ResourceType> types = service.getResourceTypesByManufacturer(manufacturer);
//		assertNotNull(types);
//		List<String> ids = types.stream().map(type -> type.getId()).sorted()
//				.collect(Collectors.toList());
//
//		List<String> expectedIds = new LinkedList<>(Arrays.asList("_SE5NIDB4Eei1bbwBPPZWOA", "_jJdx4DD7EeiuBvcKgWzd3Q",
//				"_mQ0kYDD7EeiuBvcKgWzd3Q", "_r4sy4DD7EeiuBvcKgWzd3Q", "_uFLRgDD7EeiuBvcKgWzd3Q",
//				"_wojNMDD7EeiuBvcKgWzd3Q", "_I4a_oDD-EeiuBvcKgWzd3Q", "_rUJzsDJhEei1p5hKOf5Slw"));
//		expectedIds.stream().sorted().collect(Collectors.toList());
//
//		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
//	}

	@Test
	public void testGetResourceTypesByCapability() {
		// fail("Not yet implemented");
	}
	
//	@Test
//	public void testGetAllResourceTypes() {
//		List<ResourceType> resourceTypes = service.getAllResourceTypes();
//		assertNotNull(resourceTypes);
//		List<String> ids = resourceTypes.stream().map(resourceType -> resourceType.getId()).sorted().collect(Collectors.toList());
//
//		List<String> expectedIds = new LinkedList<>(
//				Arrays.asList("_yIFSQjB3Eei1bbwBPPZWOA", "_Hi37STD5EeiuBvcKgWzd3Q", "_Jve8yTD5EeiuBvcKgWzd3Q",
//						"_LILOCTD5EeiuBvcKgWzd3Q", "_Vvb1uTD7EeiuBvcKgWzd3Q", "_9rqBszD8EeiuBvcKgWzd3Q",
//						"_NnuuyTD7EeiuBvcKgWzd3Q", "_0xCaqTD9EeiuBvcKgWzd3Q", "_ZRW8sjJhEei1p5hKOf5Slw"));
//		expectedIds.stream().sorted().collect(Collectors.toList());
//
//		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
//	}

}
