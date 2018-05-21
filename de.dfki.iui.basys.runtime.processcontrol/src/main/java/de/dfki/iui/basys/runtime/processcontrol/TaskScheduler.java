package de.dfki.iui.basys.runtime.processcontrol;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;

@Path("/task")
public interface TaskScheduler {

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	void scheduleTask(TaskDescription task);
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/{taskInstanceId}")
//	TaskInstance getTaskInstance(@PathParam("taskInstanceId") String taskInstanceId);
//
//	@DELETE
//	@Path("/{taskInstanceId}")
//	void deleteTaskInstance(@PathParam("taskInstanceId") String taskInstanceId);
//		
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	List<TaskInstance> getTaskInstances();

}
