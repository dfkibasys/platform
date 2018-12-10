package de.dfki.cos.basys.platform.runtime.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment;
import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.order.OrderStore;

@Path("/order")
public interface OrderManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	OrderStore getOrderStore();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{orderId}")
	Order getOrder(@PathParam("orderId") String id);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	void addOrder(Order order);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{orderId}/assignment")
	LineBalancingAssignment getOrderAssignment(@PathParam("orderId") String id);
}
