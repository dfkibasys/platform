package de.dfki.iui.basys.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.dfki.iui.basys.model.domain.material.Material;
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
		//fail("Not yet implemented");
	}

	@Test
	public void testAddMaterialGroup() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetMaterialGroup() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeleteMaterialGroup() {
		//fail("Not yet implemented");
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
