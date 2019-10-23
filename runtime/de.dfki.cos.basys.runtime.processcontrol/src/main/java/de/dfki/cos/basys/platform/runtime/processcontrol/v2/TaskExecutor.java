package de.dfki.cos.basys.platform.runtime.processcontrol.v2;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.runtime.component.v2.ComponentController;
import de.dfki.cos.basys.platform.runtime.component.v2.StringConstants;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponentContext;
import de.dfki.cos.basys.platform.runtime.processcontrol.TaskDescription;

public class TaskExecutor implements ChannelListener {

	TaskDescription task;
	ComponentController remoteComponent;	
	CountDownLatch counter = new CountDownLatch(1);

	public TaskExecutor(TaskDescription task) {
		this.task = task;
		remoteComponent = new ComponentController(task.getRequest().getComponentId(), this);
	}

	public TaskDescription getTask() {
		return task;
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
			ComponentResponse response = ComponentFactory.eINSTANCE.createComponentResponse();
			// TODO: ggf. Container-Wechsel?
			response.setRequest(task.getRequest());
			response.setComponentId(task.getRequest().getComponentId());
			response.setMessage(status.getMessage());
			if (status.getStatus() == RequestStatus.NOOP) {
				response.setStatus(ResponseStatus.OK);
			} else {
				response.setStatus(ResponseStatus.NOT_OK);
			}
			task.setResponse(response);
		} 
		
		if (task.getResponse() == null) {
			//remoteComponent.reset();
			ComponentResponse response = ComponentFactory.eINSTANCE.createComponentResponse();
			// TODO: ggf. Container-Wechsel?
			response.setRequest(task.getRequest());
			response.setComponentId(task.getRequest().getComponentId());
			response.setMessage("timeout reached");
			response.setStatus(ResponseStatus.NOT_OK);	
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
				EObject payload = JsonUtils.fromString(not.getPayload(), EObject.class);		
				
				if (ComponentPackage.eINSTANCE.getComponentRequestStatus().isSuperTypeOf(payload.eClass())) {
					ComponentRequestStatus status = (ComponentRequestStatus)payload;
					if (status.getStatus() != RequestStatus.ACCEPTED) {						
						ComponentResponse response = ComponentFactory.eINSTANCE.createComponentResponse();
						// TODO: ggf. Container-Wechsel?
						response.setRequest(task.getRequest());
						response.setComponentId(task.getRequest().getComponentId());
						response.setMessage(status.getMessage());
						if (status.getStatus() == RequestStatus.NOOP) {
							response.setStatus(ResponseStatus.OK);
						} else {
							response.setStatus(ResponseStatus.NOT_OK);
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
