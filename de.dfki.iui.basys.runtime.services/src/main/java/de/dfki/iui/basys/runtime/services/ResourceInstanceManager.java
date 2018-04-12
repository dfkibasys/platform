package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;

@Path("/resourceinstance")
public interface ResourceInstanceManager {

	List<ResourceInstance> getAllResourceInstances();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	Response getAllResourceInstancesRest();

	ResourceInstance getResourceInstance(String id);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{resourceInstanceId}")
	Response getResourceInstanceRest(@PathParam("resourceInstanceId") String id);
}
