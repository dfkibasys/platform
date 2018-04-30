package de.dfki.iui.basys.runtime.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.domain.processinstance.ProcessInstance;

@Path("/processinstance")
public interface ProcessInstanceManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{processInstanceId}")
	ProcessInstance getProcessInstance(@PathParam("processInstanceId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/productInstance/{processInstanceId}")
	ProcessInstance getProcessInstanceByProductInstance(@PathParam("processInstanceId") String productInstanceId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<ProcessInstance> getAllProcessInstances();

}
