package de.dfki.cos.basys.platform.runtime.processcontrol;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.runtime.component.BasysComponentContext;
import de.dfki.cos.basys.platform.runtime.component.ComponentController;
import de.dfki.cos.basys.platform.runtime.component.StringConstants;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestEnvelop;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestStatus;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;
import de.dfki.cos.basys.platform.runtime.component.model.RequestStatus;

public class ComponentRequestExecutor implements ChannelListener {

	ComponentRequestEnvelop task;
	ComponentController remoteComponent;	
	CountDownLatch counter = new CountDownLatch(1);

	public ComponentRequestExecutor(ComponentRequest request) {
		this.task = new ComponentRequestEnvelop(request);
		remoteComponent = new ComponentController(task.getRequest().getComponentId(), this);
	}

	public ComponentRequest getRequest() {
		return task.getRequest();
	}
	
	public ComponentResponse getResponse() {
		return task.getResponse();
	}
	
	public void execute(BasysComponentContext context) {
		remoteComponent.connect(context);
		
		ComponentRequestStatus status = remoteComponent.sendComponentRequest(task.getRequest());
		if (status.getStatus() == RequestStatus.ACCEPTED || status.getStatus() == RequestStatus.QUEUED) {
			try {
				counter.await(5,TimeUnit.MINUTES);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			ComponentResponse response = new ComponentResponse.Builder()			
				.request(task.getRequest())
				.componentId(task.getRequest().getComponentId())
				.message(status.getMessage())
				.build();
			if (status.getStatus() == RequestStatus.NOOP) {
				response.setStatus(RequestStatus.OK);
			} else {
				response.setStatus(RequestStatus.NOT_OK);
			}
			task.setResponse(response);
		} 
		
		if (task.getResponse() == null) {
			ComponentResponse response = new ComponentResponse.Builder()			
					.request(task.getRequest())
					.componentId(task.getRequest().getComponentId())
					.message("timeout reached")
					.status(RequestStatus.NOT_OK)
					.build();
						
			task.setResponse(response);
		}
		
		remoteComponent.disconnect();
	}

	
	
	@Override
	public void handleMessage(Channel channel, String msg) {
		
	}

	@Override
	public void handleNotification(Channel channel, Notification not) {
		if (channel.getName().equals(remoteComponent.getComponentInfo().getProperty(StringConstants.outChannelName))) {
			try {
				
				String payload = not.getPayload();	
				ComponentMessage message = context
				
				if (ComponentPackage.eINSTANCE.getComponentRequestStatus().isSuperTypeOf(payload.eClass())) {
					ComponentRequestStatus status = (ComponentRequestStatus)payload;
					if (status.getStatus() != RequestStatus.ACCEPTED) {						
						ComponentResponse response = ComponentFactory.eINSTANCE.createComponentResponse();
						// TODO: ggf. Container-Wechsel?
						response.setRequest(task.getRequest());
						response.setComponentId(task.getRequest().getComponentId());
						response.setMessage(status.getMessage());
						if (status.getStatus() == RequestStatus.NOOP) {
							response.setStatus(RequestStatus.OK);
						} else {
							response.setStatus(RequestStatus.NOT_OK);
						}						
						task.setResponse(response);
						counter.countDown();
					}					
				} else if (payload.eClass().equals(ComponentPackage.eINSTANCE.getComponentResponse())) {
					ComponentResponse response = (ComponentResponse)payload;
					if (task.getRequest().getCorrelationId().equals(response.getRequest().getCorrelationId())) {
						task.setResponse(response);
						counter.countDown();
					}			
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public Response handleRequest(Channel channel, Request req) {
		return null;
	}
}
