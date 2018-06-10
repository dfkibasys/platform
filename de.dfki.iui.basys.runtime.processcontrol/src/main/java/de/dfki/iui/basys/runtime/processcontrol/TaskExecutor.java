package de.dfki.iui.basys.runtime.processcontrol;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ComponentResponse;
import de.dfki.iui.basys.model.runtime.component.RequestStatus;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentController;

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
	
	public void execute(ComponentContext context) {
		remoteComponent.connect(context);
		
		ComponentRequestStatus status = remoteComponent.sendComponentRequest(task.getRequest());
		if (status.getStatus() == RequestStatus.ACCEPTED) {
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
			response.setComponentId(remoteComponent.getId());
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
			response.setComponentId(remoteComponent.getId());
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
		if (channel.getName().equals(remoteComponent.getComponentInfo().getOutChannelName())) {
			try {
				ComponentResponse response = JsonUtils.fromString(not.getPayload(), ComponentResponse.class);
				task.setResponse(response);
				counter.countDown();
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
