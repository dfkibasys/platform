package de.dfki.iui.basys.runtime.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.communication.provider.MqttCommunicationProvider;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.communication.CommunicationProvider;

public abstract class ServiceComponent {

	protected final Logger LOGGER = LoggerFactory.getLogger(ServiceComponent.class);

	protected String id;

	protected ClientFactory cf = ClientFactory.getInstance();
	protected Client client;
	protected String connectionString = "tcp://iot.eclipse.org:1883";
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
			// TODO: either discover automatically or set externally
			
			// TODO: configure channelPool (MQTT/JMS usage and connectionString) externally
			CommunicationProvider provider = new MqttCommunicationProvider();
			ChannelPool pool = cf.connectChannelPool(client, connectionString, provider);
			channel = cf.openComponentChannel(pool, id, provider.supportQueuedChannels(),
					new ComponentChannelListener(this));
			register();
		}
	}

	public void disconnectFromBasys() {
		if (client != null) {
			unregister();
			client.disconnect();
			client = null;
		}
	}

	protected void register() {

	}

	protected void unregister() {

	}

}
