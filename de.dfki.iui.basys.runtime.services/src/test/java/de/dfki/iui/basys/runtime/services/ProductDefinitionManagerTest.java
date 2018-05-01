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

import de.dfki.iui.basys.model.domain.processinstance.ProcessInstance;
import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;
import de.dfki.iui.basys.runtime.services.impl.ProductDefinitionManagerImpl;

public class ProductDefinitionManagerTest extends BaseEmfServiceComponentTest<ProductDefinitionManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ProductDefinitionManagerImpl";
		file = "test.productdefinition";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testGetProductVariant() {
		// TODO: set properties
		String id = "";
		ProductVariant productVariant = service.getProductVariant(id);

		assertEquals(id, productVariant.getId());
		assertEquals("", productVariant.getName());
	}

	@Test
	public void testGetProductVariantByName() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetProductVariants() {
		// TODO: set properties
		String productGroupName = "";
		List<ProductVariant> productVariants = service.getProductVariants(productGroupName);
		assertNotNull(productVariants);
		List<String> ids = productVariants.stream().map(productVariant -> productVariant.getId()).sorted().collect(Collectors.toList());
		List<String> names = productVariants.stream().map(productVariant -> productVariant.getName()).sorted().collect(Collectors.toList());

		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		expectedIds.stream().sorted().collect(Collectors.toList());
		List<String> expectedNames = new LinkedList<>(Arrays.asList("", ""));
		expectedNames.stream().sorted().collect(Collectors.toList());

		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
		Assert.assertArrayEquals(expectedNames.toArray(), names.toArray());
	}
	
	@Test
	public void testGetAllProductVariants() {
		// TODO: set properties
		List<ProductVariant> productVariants = service.getAllProductVariants();
		assertNotNull(productVariants);
		List<String> ids = productVariants.stream().map(productVariant -> productVariant.getId()).sorted().collect(Collectors.toList());
		List<String> names = productVariants.stream().map(productVariant -> productVariant.getName()).sorted().collect(Collectors.toList());

		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
		expectedIds.stream().sorted().collect(Collectors.toList());
		List<String> expectedNames = new LinkedList<>(Arrays.asList("", ""));
		expectedNames.stream().sorted().collect(Collectors.toList());

		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
		Assert.assertArrayEquals(expectedNames.toArray(), names.toArray());
	}

}
