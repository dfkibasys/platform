package de.dfki.cos.basys.platform.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition;

@Path("/processdefinition")
public interface ProcessDefinitionManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{processDefinitionId}")
	ProcessDefinition getProcessDefinition(@PathParam("processDefinitionId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productVariant/{productVariantId}")
	ProcessDefinition getProcessDefinitionByProductVariant(@PathParam("productVariantId") String productVariantId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<ProcessDefinition> getAllProcessDefinitions();

}
