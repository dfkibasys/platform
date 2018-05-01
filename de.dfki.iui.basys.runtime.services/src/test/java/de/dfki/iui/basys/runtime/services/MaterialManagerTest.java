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

import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;
import de.dfki.iui.basys.runtime.services.impl.MaterialManagerImpl;

public class MaterialManagerTest extends BaseEmfServiceComponentTest<MaterialManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.MaterialManagerImpl";
		file = "test.material";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetAllMaterials() {
		List<Material> materials = service.getAllMaterials();
		assertEquals(5, materials.size());
	}

	@Test
	public void testGetMaterial() {
		String id = "_b9ZKAxMxEeiF0dM40lRpcg";
		Material material = service.getMaterial(id);
		
		assertEquals(id, material.getId());
		assertEquals("Screw 4x10", material.getName());
	}

	@Test
	public void testDeleteMaterial() {
		String id = "_b9ZKAxMxEeiF0dM40lRpcg";
		Material material = service.getMaterial(id);
		assertNotNull(material);
		service.deleteMaterial(id);
		material = service.getMaterial(id);
		Assert.assertNull(material);
	}

	@Test
	public void testGetMaterialGroups() {
		List<MaterialGroup> materialGroups = service.getMaterialGroups();
		assertNotNull(materialGroups);
		List<String> ids = materialGroups.stream().map(materialGroup -> materialGroup.getId()).sorted().collect(Collectors.toList());
		List<String> names = materialGroups.stream().map(materialGroup -> materialGroup.getName()).sorted().collect(Collectors.toList());

		List<String> expectedIds = new LinkedList<>(Arrays.asList("_b9Yi8BMxEeiF0dM90lRpcg", "_b9ZKAhMxEeiF0dM90lRpcg"));
		expectedIds.stream().sorted().collect(Collectors.toList());
		List<String> expectedNames = new LinkedList<>(Arrays.asList("Caps", "Screws"));
		expectedNames.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
		Assert.assertArrayEquals(expectedNames.toArray(), names.toArray());
	}

	@Test
	public void testAddMaterialGroup() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetMaterialGroup() {
		String id = "_b9Yi8BMxEeiF0dM90lRpcg";
		MaterialGroup materialGroup = service.getMaterialGroup(id);
		
		assertEquals(id, materialGroup.getId());
		assertEquals("Caps", materialGroup.getName());
	}

	@Test
	public void testDeleteMaterialGroup() {
		String id = "_b9Yi8BMxEeiF0dM90lRpcg";
		MaterialGroup materialGroup = service.getMaterialGroup(id);
		
		assertNotNull(materialGroup);
		
		service.deleteMaterialGroup(id);
		materialGroup = service.getMaterialGroup(id);
		
		Assert.assertNull(materialGroup);
	}

	@Test
	public void testAddMaterialToGroup() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAddMaterialGroupToGroup() {
		//fail("Not yet implemented");
	}

}
