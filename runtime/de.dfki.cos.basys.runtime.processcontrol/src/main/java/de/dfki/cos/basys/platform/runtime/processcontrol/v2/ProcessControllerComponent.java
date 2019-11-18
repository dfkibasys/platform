package de.dfki.cos.basys.platform.runtime.processcontrol.v2;

import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponent;
import de.dfki.cos.basys.platform.runtime.processcontrol.ProcessController;
import de.dfki.cos.basys.platform.runtime.processcontrol.TaskDescription;
import de.dfki.cos.basys.platform.runtime.processcontrol.v2.camunda.CamundaProcessControllerService;

public class ProcessControllerComponent extends BasysComponent implements ProcessController {
	
	//ScheduledExecutorService executor = Executors.newScheduledThreadPool(32);
	
	public ProcessControllerComponent(Properties config) {
		super(config);
		serviceManager = new ServiceManagerImpl<ProcessControllerService>(config, new Supplier<CamundaProcessControllerService>() {
			@Override
			public CamundaProcessControllerService get() {
				CamundaProcessControllerService service = new CamundaProcessControllerService(config);
				service.setController(ProcessControllerComponent.this);
				return service;
			}
		});
		
		
	}
	

	@Override
	public CompletableFuture<ComponentResponse> scheduleTask(TaskDescription task) {
		LOGGER.debug("scheduleTask");
		TaskExecutor ce = new TaskExecutor(task);
		CompletableFuture<ComponentResponse> cf = CompletableFuture.supplyAsync(() -> {
			ce.execute(context);
			return ce.getTask();
		}, context.getScheduledExecutorService()).thenApply((ts) -> {
			if (ts.getRequest().getCorrelationId() != null) {				
				getService(ProcessControllerService.class).handleTaskResponse(ts);				
			}
			return ts.getResponse();
		}).handle((response, ex) -> {
			if (ex != null) {
				LOGGER.error(ex.getMessage(), ex);
			}
			return response;
		});
		
		return cf;
	}

	@Override
	public void scheduleTask(TaskDescription task, long delay) {
		context.getScheduledExecutorService().schedule(new Runnable() {
			@Override
			public void run() {
				scheduleTask(task);
			}
		}, delay, TimeUnit.MILLISECONDS);
	}
	
	@Override
	public Response handleRequest(Channel channel, Request req) {
		String payload = req.getPayload();
		Response res = null;
		try {
			ComponentRequest request = JsonUtils.fromString(payload, ComponentRequest.class);
			ComponentResponse response = scheduleTask(new TaskDescription(request)).get();
			res = CommFactory.getInstance().createResponse(req.getId(), JsonUtils.toString(response));
		} catch (IOException | InterruptedException | ExecutionException e) {			
			e.printStackTrace();
			res.setPayload(e.getMessage());
		}
		return res;
	}

	@Override
	public void handleNotification(Channel channel, Notification not) {
		try {
			EObject payload = JsonUtils.fromString(not.getPayload(), EObject.class);		
			
			if (ComponentPackage.eINSTANCE.getComponentRequest().isSuperTypeOf(payload.eClass())) {
				ComponentRequest request = (ComponentRequest)payload;
				if (request.getCorrelationId() == null) {
					request.setCorrelationId(UUID.randomUUID().toString());
				}
				scheduleTask(new TaskDescription(request));
			} else if (payload.eClass().equals(ComponentPackage.eINSTANCE.getProcessRequest())) {
				ProcessRequest request = (ProcessRequest)payload;
				startProcessInstance(request);				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public String deployProcessDefinition(String deploymentName, String processDefinition) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ProcessRequestStatus startProcessInstance(ProcessRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
