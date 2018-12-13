package de.dfki.cos.basys.platform.runtime.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.cos.basys.platform.model.domain.topology.Enterprise;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyElement;

@Path("/topology")
public interface TopologyManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	Enterprise getEnterprise();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	TopologyElement getTopologyElement(@PathParam("id") String id);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/parent/{id}")
	TopologyElement getParentTopologyElement(@PathParam("id") String id);
	
}
