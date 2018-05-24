package de.dfki.iui.basys.runtime.processcontrol.impl;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentResponse;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;
import de.dfki.iui.basys.runtime.processcontrol.TaskDescription;
import de.dfki.iui.basys.runtime.processcontrol.TaskExecutor;
import de.dfki.iui.basys.runtime.processcontrol.TaskScheduler;

public class CamundaTaskScheduler extends ServiceComponent implements TaskScheduler {

	CamundaRestClient client;
	//private final LinkedBlockingDeque<TaskInstanceDto> taskInstances = new LinkedBlockingDeque<>();

	ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
	
	
	public CamundaTaskScheduler(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);
		executor.scheduleWithFixedDelay(new Runnable() {
			
			@Override
			public void run() {
				pollCamunda();
				
			}
		}, 3000, 1000, TimeUnit.MILLISECONDS);
	}
	
	@Override
	public void deactivate() throws ComponentException {	
		super.deactivate();

		try {
			System.out.println("attempt to shutdown executor");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}
	}

	@Override
	public void connectToExternal() throws ComponentException {
		client = new CamundaRestClient(getId(), getConfig().getExternalConnectionString());
	}

	private void pollCamunda() {

		LOGGER.debug("pollCamunda");
		
		//long lockDuration = 24 * 60 * 60 * 1000;
		long lockDuration = 30 * 1000;
		List<ExternalServiceTaskDto> tasks = client.getExternalTasks("BasysTask", 5, lockDuration, "assignee", "command", "parameters");

		for (ExternalServiceTaskDto task : tasks) {
			if (task.variables.assignee == null || task.variables.assignee.value == null) {
				client.handleError(task.id, "ExternalTask does not contain an assignee", 0, 1000);
				continue;
			}
			if (task.variables.command == null || task.variables.command.value == null) {
				client.handleError(task.id, "ExternalTask does not contain a command", 0, 1000);
				continue;
			}
//			if (task.variables.parameters == null || task.variables.parameters.value == null) {
//				client.handleError(task.id, "ExternalTask does not contain parameters", 0, 1000);
//				continue;
//			}
						 
			try {
				ComponentRequest request = JsonUtils.fromString(task.variables.command.value, ComponentRequest.class);				
				if (task.variables.assignee != null || task.variables.assignee.value != null) {
					request.setComponentId(task.variables.assignee.value);				
				}
				scheduleTask(new TaskDescription(request, task.id));	
			} catch (IOException e) {
				e.printStackTrace();
			}							

		}
	}
    
	/*
	 * TaskScheduler interface
	 */

	@Override
	public void scheduleTask(TaskDescription task) {
		LOGGER.debug("scheduleCapabilityRequest");
		TaskExecutor ce = new TaskExecutor(task);
		CompletableFuture<ComponentResponse> cf = CompletableFuture.supplyAsync(() -> {
			ce.execute(context);
			return ce.getTask();
		}, executor).thenApply((ts) -> {
			if (ts.getCorrelationId() != null) {
				if (ts.getResponse().getStatus() == ResponseStatus.OK) {
					client.complete(ts.getCorrelationId());
				} else {
					client.handleError(ts.getCorrelationId(), ts.getResponse().getMessage(), 0, 1000);
				}
			}
			return ts.getResponse();
		});		
	}

//	@Override
//	public TaskInstance getTaskInstance(String taskInstanceId) {
//		
//		return null;
//	}
//
//	@Override
//	public void deleteTaskInstance(String taskInstanceId) {
//		
//
//	}
//
//	@Override
//	public List<TaskInstance> getTaskInstances() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
