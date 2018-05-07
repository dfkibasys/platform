package de.dfki.iui.basys.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Assert;
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
	public void testGetResourceInstance() {
		String id = "_jJdx4DD7EeiuBvcKgWzd3Q";
		ResourceInstance instance = service.getResourceInstance(id);

		assertEquals(id, instance.getId());
		assertEquals("My UR3", instance.getName());
	}

	@Test
	public void testGetResourceInstanceByName() {
		String name = "My UR3";
		ResourceInstance instance = service.getResourceInstanceByName(name);

		assertEquals(name, instance.getName());
		assertEquals("_jJdx4DD7EeiuBvcKgWzd3Q", instance.getId());
	}

	@Test
	public void testGetResourceInstancesByType() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetResourceInstancesByTypeName() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetResourceInstancesByCapability() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetAllResourceInstances() {
		List<ResourceInstance> resourceInstances = service.getAllResourceInstances();
		assertNotNull(resourceInstances);
		List<String> ids = resourceInstances.stream().map(resourceInstance -> resourceInstance.getId()).sorted()
				.collect(Collectors.toList());

		List<String> expectedIds = new LinkedList<>(Arrays.asList("_SE5NIDB4Eei1bbwBPPZWOA", "_jJdx4DD7EeiuBvcKgWzd3Q",
				"_mQ0kYDD7EeiuBvcKgWzd3Q", "_r4sy4DD7EeiuBvcKgWzd3Q", "_uFLRgDD7EeiuBvcKgWzd3Q",
				"_wojNMDD7EeiuBvcKgWzd3Q", "_I4a_oDD-EeiuBvcKgWzd3Q", "_rUJzsDJhEei1p5hKOf5Slw",
				"_PwPREFIxEeidSe5vp9A3oA", "_RtlHgFIxEeidSe5vp9A3oA", "_8cLJ8FIxEeidSe5vp9A3oA"));
		expectedIds = expectedIds.stream().sorted().collect(Collectors.toList());

		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}

	@Test
	public void testAddResourceInstance() {
		// fail("Not yet implemented");
	}

	@Test
	public void testRemoveResourceInstance() {
		String id = "_SE5NIDB4Eei1bbwBPPZWOA";
		ResourceInstance resourceInstance = service.getResourceInstance(id);
		
		assertNotNull(resourceInstance);
		
		service.removeResourceInstance(id);
		resourceInstance = service.getResourceInstance(id);
		
		Assert.assertNull(resourceInstance);
	}

}
