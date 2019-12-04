package de.dfki.cos.basys.platform.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.domain.productdefinition.AssemblyGroup;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductCatalogue;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductGroup;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductVariant;
import de.dfki.cos.basys.platform.runtime.services.impl.ProductDefinitionManagerImpl;

public class ProductDefinitionManagerTest extends BaseComponentTest {

	ProductDefinitionManager service = null;
	
	@Override
	@Before
	public void setUp() throws Exception {		
		super.setUp();
		service = (ProductDefinitionManager) componentManager.getComponentById("product-definition-manager");
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testGetProductVariant() {
		String id = "_6odhQEjIEei9sPQ0bCp2Ew";
		ProductVariant productVariant = service.getProductVariant(id);

		assertEquals(id, productVariant.getId());
		assertEquals("Gearbox zf", productVariant.getName());
	}

	@Test
	public void testGetAssemblyGroup() {
		String id = "_tZoTAUjJEei9sPQ0bCp2Ew";
		AssemblyGroup productVariant = service.getAssemblyGroup(id);

		assertEquals(id, productVariant.getId());
		assertEquals("Housing", productVariant.getName());
	}

	@Test
	public void testGetProductGroup() {
		String id = "_xn7U4EjIEei9sPQ0bCp2Ew";
		ProductGroup productVariant = service.getProductGroup(id);

		assertEquals(id, productVariant.getId());
		assertEquals("Gearboxes", productVariant.getName());
	}

	@Test
	public void testGetProductCatalogue() {
		ProductCatalogue catalogue = service.getProductCatalogue();
		
		assertNotNull(catalogue);
		assertEquals(1, catalogue.getProductGroups().size());
	}
	
}
