package de.dfki.iui.basys.runtime.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStore;

@Path("/productinstance")
public interface ProductInstanceManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{productInstanceId}")
	ProductInstance getProductInstance(@PathParam("productInstanceId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	ProductInstanceStore getProductInstanceStore();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	void addProductInstance(ProductInstance productInstance);

}
