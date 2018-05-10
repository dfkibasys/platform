package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository;

@Path("/resourceinstance")
public interface ResourceInstanceManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{resourceInstanceId}")
	ResourceInstance getResourceInstance(@PathParam("resourceInstanceId") String id);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/capability")
	List<ResourceInstance> getResourceInstancesByCapability(Capability capability);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	ResourceInstanceRepository getResourceInstanceRepository();

}
