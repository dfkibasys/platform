package de.dfki.iui.basys.runtime.processcontrol;

import java.util.concurrent.CompletableFuture;

import javax.ws.rs.Path;

import de.dfki.iui.basys.model.runtime.component.ComponentResponse;

@Path("/task")
public interface TaskScheduler {

	// @PUT
	// @Consumes(MediaType.APPLICATION_JSON)
	CompletableFuture<ComponentResponse> scheduleTask(TaskDescription task);

	void scheduleTask(TaskDescription task, long delay);

	// CompletableFuture<ComponentResponse> scheduleTaskSync(TaskDescription task);

	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// @Path("/{taskInstanceId}")
	// TaskInstance getTaskInstance(@PathParam("taskInstanceId") String
	// taskInstanceId);
	//
	// @DELETE
	// @Path("/{taskInstanceId}")
	// void deleteTaskInstance(@PathParam("taskInstanceId") String taskInstanceId);
	//
	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// List<TaskInstance> getTaskInstances();

}
