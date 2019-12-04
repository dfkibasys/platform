package de.dfki.cos.basys.platform.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.domain.order.Order;
import de.dfki.cos.basys.platform.model.domain.order.OrderStore;
import de.dfki.cos.basys.platform.runtime.services.impl.OrderManagerImpl;

public class OrderManagerTest extends BaseComponentTest {

	OrderManager service = null;
	
	@Override
	@Before
	public void setUp() throws Exception {		
		super.setUp();
		service = (OrderManager) componentManager.getComponentById("order-manager");
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	@Ignore
	public void testGetOrderStore() {
		OrderStore store = service.getOrderStore();

		assertNotNull(store);
		assertEquals(2, store.getOrders().size());
	}

	@Test
	@Ignore
	public void testGetOrder() {
		String id = "_CcNFcFIAEeivcqRF4-9YHA";
		Order order = service.getOrder(id);

		assertEquals(id, order.getId());
	}

	@Test
	@Ignore
	public void testAddOrder() {
		//TODO: implement
	}

}
