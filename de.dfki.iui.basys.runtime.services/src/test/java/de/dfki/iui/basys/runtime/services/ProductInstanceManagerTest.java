package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;

import de.dfki.iui.basys.runtime.services.impl.ProductInstanceManagerImpl;

public class ProductInstanceManagerTest extends BaseEmfServiceComponentTest<ProductInstanceManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ProductInstanceManagerImpl";
		file = "model.productinstance";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
//	@Test
//	public void testGetProductInstance() {
//		// TODO: set properties
//		String id = "";
//		ProductInstance productInstance = service.getProductInstance(id);
//
//		assertEquals(id, productInstance.getId());
//		assertEquals("", productInstance.getName());
//	}
//
//	@Test
//	public void testGetAllProductInstances() {
//		// TODO: set properties
//		List<ProductInstance> productInstances = service.getAllProductInstances();
//		assertNotNull(productInstances);
//		List<String> ids = productInstances.stream().map(productInstance -> productInstance.getId()).sorted().collect(Collectors.toList());
//		List<String> names = productInstances.stream().map(productInstance -> productInstance.getName()).sorted().collect(Collectors.toList());
//
//		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
//		expectedIds.stream().sorted().collect(Collectors.toList());
//		List<String> expectedNames = new LinkedList<>(Arrays.asList("", ""));
//		expectedNames.stream().sorted().collect(Collectors.toList());
//
//		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
//		Assert.assertArrayEquals(expectedNames.toArray(), names.toArray());
//	}
}
