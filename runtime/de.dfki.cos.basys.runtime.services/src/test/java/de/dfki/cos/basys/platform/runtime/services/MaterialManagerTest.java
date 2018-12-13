package de.dfki.cos.basys.platform.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.domain.material.Material;
import de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue;
import de.dfki.cos.basys.platform.model.domain.material.MaterialGroup;
import de.dfki.cos.basys.platform.runtime.services.impl.MaterialManagerImpl;

public class MaterialManagerTest extends BaseEmfServiceComponentTest<MaterialManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.MaterialManagerImpl";
		file = "model.material";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetMaterialCatalogue() {
		MaterialCatalogue catalogue = service.getMaterialCatalogue();
		
		assertNotNull(catalogue);
		assertEquals(5, catalogue.getMaterialGroups().size());
	}

	@Test
	public void testGetMaterial() {
		String id = "_b9ZKAxMxEeiF0dM40lRpcg";
		Material material = service.getMaterial(id);
		
		assertEquals(id, material.getId());
		assertEquals("Screw 4x10", material.getName());
	}

	@Test
	public void testGetMaterialGroup() {
		String id = "_b9ZKAhMxEeiF0dM90lRpcg";
		MaterialGroup materialGroup = service.getMaterialGroup(id);
		
		assertNotNull(materialGroup);
		assertEquals(3, materialGroup.getMaterials().size());
	}

}
