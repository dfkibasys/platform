package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;

@Path("/resourcetype")
public interface ResourceTypeManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{resourceTypeId}")
	ResourceType getResourceType(@PathParam("resourceTypeId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/name/{name}")
	ResourceType getResourceTypeByName(@PathParam("name") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/manufacturer/{manufacturer}")
	List<ResourceType> getResourceTypesByManufacturer(@PathParam("manufacturer") String manufacturer);

	// TODO: handle capability
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/capability")
	List<ResourceType> getResourceTypesByCapability(Capability capability);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<ResourceType> getAllResourceTypes();

	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// @Path("/")
	// Response getAllResourceTypeCataloguesRest();
	//
	//
	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// @Path("/typeCatalogue/{manufacturer}")
	// Response getTypeCatalogueRest(@PathParam("manufacturer") String
	// manufacturer);
	//
	//
	//
	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// @Path("/")
	// Response getAllResourceTypesRest(String manufacturer);
	//
	//
	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// @Path("/{resourceTypeId}")
	// Response getResourceTypeRest(@PathParam("resourceTypeId") String id);

}
