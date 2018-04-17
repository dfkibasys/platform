package de.dfki.iui.basys.osgi.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/topology")
public interface TopologyCatalogue {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	Response getRootTopologyEntity();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{entityId}")
	Response getTopologyEntity(@PathParam("entityId") String id);

}
