package de.dfki.iui.basys.runtime.unit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.communication.provider.MqttCommunicationProvider;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.CommunicationProvider;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.runtime.unit.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.unit.packml.PackMLUnit;
import de.dfki.iui.basys.runtime.unit.packml.WaitStatesHandler;

public abstract class AbstractComponent implements ActiveStatesHandler, WaitStatesHandler {
	
	protected final Logger LOGGER = LoggerFactory.getLogger(AbstractComponent.class);
	
	protected String id;
	
	protected PackMLUnit unit;	
	
	protected ClientFactory cf = ClientFactory.getInstance();
	protected Client client;
	protected String connectionString;	
	protected Channel channel;
	
	public AbstractComponent(String id) {
		this.id = id;
		
	}

	public void activate() {
		unit = new PackMLUnit(id);
		unit.setActiveStatesHandler(this);
		unit.setWaitStatesHandler(this);
		unit.initialize();
		
		connectToDevice();
		connectToBasys();
	}
	
	public void deactivate() {
		disconnectFromDevice();
		disconnectFromBasys();
		
		unit.dispose();
	}
		
	public void connectToDevice() {
		//Try to connect to actual device or enter some kind of simulation mode
		
		//if device connection is established, ideally perform unit.stop() and unit.reset(): 
		//STOPPED -> RESETTING -> IDLE = ready for production
	}
	
	public void disconnectFromDevice() {
		// perform unit.stop()?
	}
	
	public void connectToBasys() {
		if (client == null) {		
			client = cf.createClient(id, cf.createAuthentication(id, "secret", null));
			//TODO: either discover automatically or set externally
			connectionString = "tcp://iot.eclipse.org:1883";		
			//TODO: configure channelPool (MQTT/JMS usage and connectionString) externally
			CommunicationProvider provider = new MqttCommunicationProvider();
			ChannelPool pool = cf.connectChannelPool(client, connectionString, provider);
			channel = cf.openComponentChannel(pool, id, provider.supportQueuedChannels(), new ComponentChannelListener(this));
			//TODO: register service at service registry
		}
	}
	
	public void disconnectFromBasys() {
		if (client != null) {
			//TODO: unregister service at service registry
			client.disconnect();
			client = null;
		}
	}	

	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */
	
	@Override
	public void onStopped() {
		//TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("stopped");
		channel.sendNotification(not);
	}

	@Override
	public void onIdle() {
		//TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("idle");
		channel.sendNotification(not);
	}

	@Override
	public void onComplete() {
		//TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("complete");
		channel.sendNotification(not);
	}

	@Override
	public void onHeld() {
		//TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("held");
		channel.sendNotification(not);
	}

	@Override
	public void onSuspended() {
		//TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("suspended");
		channel.sendNotification(not);
	}

	@Override
	public void onAborted() {
		//TODO: something like:Notification not = createStatusUpdate();
		Notification not = cf.createNotification("aborted");
		channel.sendNotification(not);
	}

}
