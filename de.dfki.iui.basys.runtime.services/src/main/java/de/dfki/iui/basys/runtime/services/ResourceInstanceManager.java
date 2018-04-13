package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;

//@Path("/resourceinstance")
public interface ResourceInstanceManager {

	ResourceInstance getResourceInstance(String id);
	
	ResourceInstance  getResourceInstanceByName(String name);

	List<ResourceInstance> getResourceInstancesByType(String typeId);

	List<ResourceInstance> getResourceInstancesByTypeName(String typeName);
	
	List<ResourceInstance> getResourceInstancesByCapability(Capability capability);
	
	List<ResourceInstance> getAllResourceInstances();

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/")
//	Response getAllResourceInstancesRest();
//
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/{resourceInstanceId}")
//	Response getResourceInstanceRest(@PathParam("resourceInstanceId") String id);
}
