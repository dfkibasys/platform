package de.dfki.iui.basys.runtime.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.communication.provider.MqttCommunicationProvider;
import de.dfki.iui.basys.runtime.component.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.component.packml.PackMLUnit;
import de.dfki.iui.basys.runtime.component.packml.WaitStatesHandler;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.CommunicationProvider;
import de.dfki.iui.basys.model.runtime.communication.Notification;

public abstract class ServiceComponent {
	
	protected final Logger LOGGER = LoggerFactory.getLogger(ServiceComponent.class);
	
	protected String id;
		
	protected ClientFactory cf = ClientFactory.getInstance();
	protected Client client;
	protected String connectionString;	
	protected Channel channel;
	
	public ServiceComponent(String id) {
		this.id = id;
		
	}

	public void activate() {
		connectToBasys();
	}
	
	public void deactivate() {
		disconnectFromBasys();
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

}
