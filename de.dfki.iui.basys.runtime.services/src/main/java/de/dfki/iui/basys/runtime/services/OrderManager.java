package de.dfki.iui.basys.runtime.services;

import java.util.List;

import de.dfki.iui.basys.model.domain.order.Order;

public interface OrderManager {

	Order getOrder(String id);

	// List<Order> queryOrders(OrderQuery query);

	List<Order> getOrdersByManufacturedComponent(String manufacturedComponentId);

	List<Order> getAllOrders();
}
