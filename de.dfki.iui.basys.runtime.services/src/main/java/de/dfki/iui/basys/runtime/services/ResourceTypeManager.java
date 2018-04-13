package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue;

public interface ResourceTypeManager {

	ResourceType getResourceType(String id);
	
	ResourceType getResourceTypeByName(String name);
	
	List<ResourceType> getResourceTypesByManufacturer(String manufacturer);
	
	List<ResourceType> getResourceTypesByCapability(Capability capability);
		
	List<ResourceType> getAllResourceTypes();
	
	

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/")
//	Response getAllResourceTypeCataloguesRest();
//
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/typeCatalogue/{manufacturer}")
//	Response getTypeCatalogueRest(@PathParam("manufacturer") String manufacturer);
//		
//
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/")
//	Response getAllResourceTypesRest(String manufacturer);
//		
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/{resourceTypeId}")
//	Response getResourceTypeRest(@PathParam("resourceTypeId") String id);
	
}
