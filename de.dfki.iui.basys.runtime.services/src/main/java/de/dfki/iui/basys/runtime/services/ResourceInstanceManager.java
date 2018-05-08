package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;

@Path("/resourceinstance")
public interface ResourceInstanceManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{resourceInstanceId}")
	ResourceInstance getResourceInstance(@PathParam("resourceInstanceId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/name/{resourceInstanceName}")
	ResourceInstance getResourceInstanceByName(@PathParam("resourceInstanceName") String name);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/type/{resourceTypeId}")
	List<ResourceInstance> getResourceInstancesByType(@PathParam("resourceTypeId") String typeId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/type/name/{resourceTypeName}")
	List<ResourceInstance> getResourceInstancesByTypeName(@PathParam("resourceTypeName") String typeName);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/capability")
	List<ResourceInstance> getResourceInstancesByCapability(Capability capability);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	List<ResourceInstance> getAllResourceInstances();

	// gibt id der ResourceInstance zurück
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	String addResourceInstance(ResourceInstance resourceInstance);

	@DELETE
	@Path("/{resourceInstanceId}")
	void removeResourceInstance(@PathParam("resourceInstanceId") String id);
}
