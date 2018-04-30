package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;

@Path("/productdefinition")
public interface ProductDefinitionManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{productVariantId}")
	ProductVariant getProductVariant(@PathParam("productVariantId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/name/{productVariantName}")
	ProductVariant getProductVariantByName(@PathParam("productVariantName") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/group/{productGroupName}")
	List<ProductVariant> getProductVariants(@PathParam("productGroupName") String productGroupName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<ProductVariant> getAllProductVariants();

}
