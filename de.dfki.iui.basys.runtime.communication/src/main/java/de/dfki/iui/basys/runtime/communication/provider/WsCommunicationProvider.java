package de.dfki.iui.basys.runtime.communication.provider;

import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.CommunicationProvider;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.communication.ResponseCallback;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException;

public class WsCommunicationProvider implements CommunicationProvider {

	@Override
	public void doConnect(ChannelPool pool) throws ProviderException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doDisconnect(ChannelPool pool) throws ProviderException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doOpenChannel(Channel channel) throws ProviderException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doCloseChannel(Channel channel) throws ProviderException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSendMessage(Channel channel, String msg) throws ProviderException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSendRequest(Channel channel, Request req, ResponseCallback cb) throws ProviderException {
		// TODO Auto-generated method stub

	}

	@Override
	public Response doSendRequest(Channel channel, Request req) throws ProviderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doSendNotification(Channel channel, Notification not) throws ProviderException {
		// TODO Auto-generated method stub

	}
	
	@Override
	public boolean supportQueuedChannels() {
		// TODO Auto-generated method stub
		return false;
	}

}
