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
import de.dfki.cos.basys.platform.runtime.component.model.ComponentMessage;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestEnvelop;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequestStatus;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;
import de.dfki.cos.basys.platform.runtime.component.model.RequestStatus;

public class ComponentRequestExecutor implements ChannelListener {

	ComponentRequestEnvelop envelop;
	ComponentController remoteComponent;	
	CountDownLatch counter = new CountDownLatch(1);
	BasysComponentContext context;

	public ComponentRequestExecutor(ComponentRequest request) {
		this.envelop = new ComponentRequestEnvelop(request);
		remoteComponent = new ComponentController(envelop.getRequest().getComponentId(), this);
	}

	public ComponentRequest getRequest() {
		return envelop.getRequest();
	}
	
	public ComponentResponse getResponse() {
		return envelop.getResponse();
	}
	
	public void execute(BasysComponentContext context) {
		this.context = context;
		remoteComponent.connect(context);
		
		ComponentRequestStatus status = remoteComponent.sendComponentRequest(envelop.getRequest());
		if (status.getStatus() == RequestStatus.ACCEPTED || status.getStatus() == RequestStatus.QUEUED) {
			try {
				counter.await(5,TimeUnit.MINUTES);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			ComponentResponse response = new ComponentResponse.Builder()			
				.request(envelop.getRequest())
				.componentId(envelop.getRequest().getComponentId())
				.message(status.getMessage())
				.build();
			if (status.getStatus() == RequestStatus.NOOP) {
				response.setStatus(RequestStatus.OK);
			} else {
				response.setStatus(RequestStatus.NOT_OK);
			}
			envelop.setResponse(response);
		} 
		
		if (envelop.getResponse() == null) {
			ComponentResponse response = new ComponentResponse.Builder()			
					.request(envelop.getRequest())
					.componentId(envelop.getRequest().getComponentId())
					.message("timeout reached")
					.status(RequestStatus.NOT_OK)
					.build();
						
			envelop.setResponse(response);
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
				ComponentMessage message = context.getObjectMapper().readValue(not.getPayload(), ComponentMessage.class);
				
				if (message instanceof ComponentRequestStatus) {
					ComponentRequestStatus status = (ComponentRequestStatus)message;
					if (status.getStatus() != RequestStatus.ACCEPTED) {						
						ComponentResponse response = new ComponentResponse.Builder()			
								.request(envelop.getRequest())
								.componentId(envelop.getRequest().getComponentId())
								.message(status.getMessage())
								.build();
						if (status.getStatus() == RequestStatus.NOOP) {
							response.setStatus(RequestStatus.OK);
						} else {
							response.setStatus(RequestStatus.NOT_OK);
						}						
						envelop.setResponse(response);
						counter.countDown();
					}					
				} else if (message instanceof ComponentResponse) {
					ComponentResponse response = (ComponentResponse)message;
					if (envelop.getRequest().getCorrelationId().equals(response.getRequest().getCorrelationId())) {
						envelop.setResponse(response);
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
