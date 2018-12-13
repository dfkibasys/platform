package de.dfki.cos.basys.platform.runtime.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.cos.basys.platform.model.domain.productdefinition.AssemblyGroup;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductCatalogue;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductGroup;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductVariant;

@Path("/productdefinition")
public interface ProductDefinitionManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{productVariantId}")
	ProductVariant getProductVariant(@PathParam("productVariantId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/assemblygroup/{assemblyGroupId}")
	AssemblyGroup getAssemblyGroup(@PathParam("assemblyGroupId") String assemblyGroupId);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productgroup/{productGroupId}")
	ProductGroup getProductGroup(@PathParam("productGroupId") String productGroupId);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	ProductCatalogue getProductCatalogue();

}
