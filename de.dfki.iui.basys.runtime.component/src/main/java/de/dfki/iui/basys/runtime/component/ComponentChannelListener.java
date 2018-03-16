package de.dfki.iui.basys.runtime.component;

import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.runtime.component.packml.PackMLUnit;

public class ComponentChannelListener implements ChannelListener {

	protected ServiceComponent component;
	
	public ComponentChannelListener(ServiceComponent component) {
		this.component = component;
	}
	

	//TODO: Code for communicating with the Basys Middleware: process incoming requests, notify task completion and errors back
	
	@Override
	public void handleMessage(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleNotification(Notification not) {
		// TODO Auto-generated method stub

	}

	@Override
	public Response handleRequest(Request req) {
		// TODO Auto-generated method stub
		return null;
	}

}
