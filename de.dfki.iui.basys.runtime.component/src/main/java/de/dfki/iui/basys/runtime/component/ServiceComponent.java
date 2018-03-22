package de.dfki.iui.basys.runtime.component;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.communication.provider.MqttCommunicationProvider;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistration;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistrationException;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;
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
	protected String basysConnectionString = "tcp://iot.eclipse.org:1883";
	protected Channel channel;
	protected ServiceRegistry registry;
	protected ServiceRegistration registration;

	public ServiceComponent(String id) {
		this(id, null);
	}

	public ServiceComponent(String id, ServiceRegistry registry) {
		this.id = id;
		this.registry = registry;
	}

	public String getId() {
		return id;
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
			ChannelPool pool = cf.connectChannelPool(client, basysConnectionString, provider);
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
		if (registry != null) {
			try {
				registration = registry.createRegistration(this);
				registration.register();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	protected void unregister() {
		if (registration != null) {
			try {
				registration.unregister();
			} catch (ServiceRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
