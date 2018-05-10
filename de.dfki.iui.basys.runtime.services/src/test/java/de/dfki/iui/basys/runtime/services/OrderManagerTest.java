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

import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.runtime.services.impl.OrderManagerImpl;

public class OrderManagerTest extends BaseEmfServiceComponentTest<OrderManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.OrderManagerImpl";
		file = "model.order";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetOrder() {
		// TODO: set properties
		String id = "_CcNFcFIAEeivcqRF4-9YHA";
		Order order = service.getOrder(id);

		assertEquals(id, order.getId());
	}

	@Test
	public void testGetOrdersByManufacturedComponent() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetAllOrders() {
		// TODO: set properties
		List<Order> orders = service.getAllOrders();
		assertNotNull(orders);
		List<String> ids = orders.stream().map(order -> order.getId()).sorted().collect(Collectors.toList());
//		List<String> names = orders.stream().map(order -> order.getName()).sorted().collect(Collectors.toList());

		List<String> expectedIds = new LinkedList<>(Arrays.asList("_CcNFcFIAEeivcqRF4-9YHA", "_LQrLwFIAEeivcqRF4-9YHA"));
		expectedIds = expectedIds.stream().sorted().collect(Collectors.toList());
//		List<String> expectedNames = new LinkedList<>(Arrays.asList("", ""));
//		expectedNames.stream().sorted().collect(Collectors.toList());
		
		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
//		Assert.assertArrayEquals(expectedNames.toArray(), names.toArray());
	}

}
