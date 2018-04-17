package de.dfki.iui.basys.osgi.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/resourceInstance")
public interface ResourceInstanceCatalogue {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	Response getAllResourceInstances();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{resourceInstanceId}")
	Response getResourceInstance(@PathParam("resourceInstanceId") String id);

}
