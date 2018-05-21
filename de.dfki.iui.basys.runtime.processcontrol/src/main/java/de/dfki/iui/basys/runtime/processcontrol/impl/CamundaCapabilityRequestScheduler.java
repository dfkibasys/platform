package de.dfki.iui.basys.runtime.processcontrol.impl;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;
import de.dfki.iui.basys.runtime.processcontrol.CapabilityRequestScheduler;

public class CamundaCapabilityRequestScheduler extends ServiceComponent implements CapabilityRequestScheduler {

	CamundaRestClient client;
	//private final LinkedBlockingDeque<TaskInstanceDto> taskInstances = new LinkedBlockingDeque<>();

	ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
	
	
	public CamundaCapabilityRequestScheduler(ComponentConfiguration config) {
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
		}, 1000, 1000, TimeUnit.MILLISECONDS);
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
		//long lockDuration = 24 * 60 * 60 * 1000;
		long lockDuration = 30 * 1000;
		List<ExternalServiceTaskDto> tasks = client.getExternalTasks("BasysTask", lockDuration, "assignee", "command", "parameters");

		for (ExternalServiceTaskDto task : tasks) {
//			if (task.variables.assignee == null || task.variables.assignee.value == null) {
//				client.handleError(task.id, "ExternalTask does not contain an assignee", 0, 1000);
//				continue;
//			}
			if (task.variables.command == null || task.variables.command.value == null) {
				client.handleError(task.id, "ExternalTask does not contain a command", 0, 1000);
				continue;
			}
//			if (task.variables.parameters == null || task.variables.parameters.value == null) {
//				client.handleError(task.id, "ExternalTask does not contain parameters", 0, 1000);
//				continue;
//			}
			
			CapabilityRequest request = ComponentFactory.eINSTANCE.createCapabilityRequest();			
			if (task.variables.assignee != null || task.variables.assignee.value != null) {
				request.setComponentId(task.variables.assignee.value);				
			}			
			scheduleCapabilityRequest(request);				
			
		}
	}
    
	/*
	 * TaskScheduler interface
	 */

	@Override
	public void scheduleCapabilityRequest(CapabilityRequest request) {

		//executor.submit(task)
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
