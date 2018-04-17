package de.dfki.iui.basys.osgi.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/resourceType")
public interface ResourceTypeCatalogue {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	Response getAllResourceTypeCatalogues();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{resourceTypeId}")
	Response getResourceType(@PathParam("resourceTypeId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/typeCatalogue/{manufacturer}")
	Response getTypeCatalogue(@PathParam("manufacturer") String manufacturer);

}
