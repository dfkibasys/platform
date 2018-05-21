package de.dfki.iui.basys.runtime.processcontrol;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.RequestStatus;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.DeviceComponentController;

public class CapabilityExecutor implements ChannelListener {

	CapabilityRequest request;
	DeviceComponentController device;

	public CapabilityExecutor(CapabilityRequest request) {
		this.request = request;
		device = new DeviceComponentController(request.getComponentId(), this);
	}

	public void execute(ComponentContext context) {
		device.connect(context);
		
		ComponentRequestStatus status = device.executeCapability((Capability)request.getCapability());
		if (status.getStatus() == RequestStatus.ACCEPTED) {
			//TODO: wait until complete notification
		} else {
			//TODO: handle failure, hierfür ggf. scheduler in Konstruktor
		} 
		
		device.disconnect();
	}

	@Override
	public void handleMessage(Channel channel, String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleNotification(Channel channel, Notification not) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Response handleRequest(Channel channel, Request req) {
		// TODO Auto-generated method stub
		return null;
	}
}
