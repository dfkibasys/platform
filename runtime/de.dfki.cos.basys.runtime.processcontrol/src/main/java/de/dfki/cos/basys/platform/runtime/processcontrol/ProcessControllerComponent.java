package de.dfki.cos.basys.platform.runtime.processcontrol;

import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.platform.runtime.component.BasysComponent;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;
import de.dfki.cos.basys.platform.runtime.processcontrol.camunda.CamundaProcessControllerService;

public class ProcessControllerComponent extends BasysComponent implements ProcessController {
	
	//ScheduledExecutorService executor = Executors.newScheduledThreadPool(32);
	
	public ProcessControllerComponent(Properties config) {
		super(config);
		serviceManager = new ServiceManagerImpl<ComponentResponseHandler>(config, new Supplier<CamundaProcessControllerService>() {
			@Override
			public CamundaProcessControllerService get() {
				CamundaProcessControllerService service = new CamundaProcessControllerService(config);
				service.setController(ProcessControllerComponent.this);
				return service;
			}
		});
		
		
	}
	

	@Override
	public CompletableFuture<ComponentResponse> scheduleComponentRequest(ComponentRequest request) {
		LOGGER.debug("scheduleTask");
		ComponentRequestExecutor executor = new ComponentRequestExecutor(request);
		CompletableFuture<ComponentResponse> cf = CompletableFuture.supplyAsync(() -> {
			executor.execute(context);
			return executor.getResponse();
		}, context.getScheduledExecutorService()).thenApply((response) -> {
			if (response.getRequest().getCorrelationId() != null) {				
				getService(ComponentResponseHandler.class).handleComponentResponse(response);				
			}
			return response;
		}).handle((response, ex) -> {
			if (ex != null) {
				LOGGER.error(ex.getMessage(), ex);
			}
			return response;
		});
		
		return cf;
	}

	@Override
	public void scheduleComponentRequest(ComponentRequest request, long delay) {
		context.getScheduledExecutorService().schedule(new Runnable() {
			@Override
			public void run() {
				scheduleComponentRequest(request);
			}
		}, delay, TimeUnit.MILLISECONDS);
	}
	
//	@Override
//	public Response handleRequest(Channel channel, Request req) {
//		String payload = req.getPayload();
//		Response res = null;
//		try {
//			ComponentRequest request = JsonUtils.fromString(payload, ComponentRequest.class);
//			ComponentResponse response = scheduleTask(new TaskDescription(request)).get();
//			res = CommFactory.getInstance().createResponse(req.getId(), context.getObjectMapper().writeValueAsString(response));
//		} catch (IOException | InterruptedException | ExecutionException e) {			
//			e.printStackTrace();
//			res.setPayload(e.getMessage());
//		}
//		return res;
//	}
//
//	@Override
//	public void handleNotification(Channel channel, Notification not) {
//		try {
//			EObject payload = JsonUtils.fromString(not.getPayload(), EObject.class);		
//			
//			if (ComponentPackage.eINSTANCE.getComponentRequest().isSuperTypeOf(payload.eClass())) {
//				ComponentRequest request = (ComponentRequest)payload;
//				if (request.getCorrelationId() == null) {
//					request.setCorrelationId(UUID.randomUUID().toString());
//				}
//				scheduleTask(new TaskDescription(request));
//			} 
////			else if (payload.eClass().equals(ComponentPackage.eINSTANCE.getProcessRequest())) {
////				ProcessRequest request = (ProcessRequest)payload;
////				startProcessInstance(request);				
////			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}


//	@Override
//	public String deployProcessDefinition(String deploymentName, String processDefinition) {
//		// TODO Auto-generated method stub
//		return null;
//	}


//	@Override
//	public ProcessRequestStatus startProcessInstance(ProcessRequest request) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
