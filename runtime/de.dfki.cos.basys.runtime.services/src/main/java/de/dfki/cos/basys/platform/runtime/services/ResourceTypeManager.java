package de.dfki.cos.basys.platform.runtime.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogueCollection;

@Path("/resourcetype")
public interface ResourceTypeManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{resourceTypeId}")
	ResourceType getResourceType(@PathParam("resourceTypeId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/catalogue/{manufacturerName}")
	ResourceTypeCatalogue getResourceTypeCatalogue(@PathParam("manufacturerName") String manufacturerName);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	ResourceTypeCatalogueCollection getResourceTypeCatalogueCollection();

}
