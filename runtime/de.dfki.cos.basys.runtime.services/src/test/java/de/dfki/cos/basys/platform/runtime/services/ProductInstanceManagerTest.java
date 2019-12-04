package de.dfki.cos.basys.platform.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStore;
import de.dfki.cos.basys.platform.runtime.services.impl.ProductInstanceManagerImpl;

public class ProductInstanceManagerTest extends BaseComponentTest {

	ProductInstanceManager service = null;
	
	@Override
	@Before
	public void setUp() throws Exception {		
		super.setUp();
		service = (ProductInstanceManager) componentManager.getComponentById("product-instance-manager");
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetProductInstance() {
		String id = "_SZqnsFIAEeivcqRF4-9YHA";
		ProductInstance productInstance = service.getProductInstance(id);

		assertEquals(id, productInstance.getId());
	}

	@Test
	public void testGetProductInstanceStore() {
		ProductInstanceStore store = service.getProductInstanceStore();

		assertNotNull(store);
		assertEquals(1, store.getProductInstances().size());
	}
}
