package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.order.Order;

@Path("/order")
public interface OrderManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{orderId}")
	Order getOrder(@PathParam("orderId") String id);

	// List<Order> queryOrders(OrderQuery query);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/manufacturedComponent/{manufacturedComponentId}")
	List<Order> getOrdersByManufacturedComponent(@PathParam("manufacturedComponentId") String manufacturedComponentId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<Order> getAllOrders();
}
