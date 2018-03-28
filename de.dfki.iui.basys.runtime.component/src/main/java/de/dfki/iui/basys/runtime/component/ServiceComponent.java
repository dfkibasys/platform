package de.dfki.iui.basys.runtime.component;

import java.io.IOException;

import javax.security.auth.callback.ConfirmationCallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.runtime.communication.provider.JmsCommunicationProvider;
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

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected String id;

	protected ComponentConfiguration componentConfig;
	protected ComponentContext context;

	protected ClientFactory cf = ClientFactory.getInstance();
	protected Client client;
	protected String basysConnectionString = "tcp://iot.eclipse.org:1883";
	protected Channel inChannel;
	protected Channel outChannel;
	protected ServiceRegistry registry;
	protected ServiceRegistration registration;

	public ServiceComponent(String id) {
		this.id = id;
		this.componentConfig = new ComponentConfiguration().setId(id).setInChannel(String.format("basys#%s#in", id))
				.setOutChannel(String.format("basys#%s#out", id));
	}

	public ServiceComponent(ComponentConfiguration config) {
		this.id = config.getId();
		this.componentConfig = config;
	}

	public String getId() {
		return id;
	}

	public void activate(ComponentContext context) {
		this.context = context;
		connectToBasys();
		register();
	}

	public void deactivate() {
		unregister();
		disconnectFromBasys();
	}

	protected void connectToBasys() {
		ChannelPool pool = context.getSharedChannelPool();

		if (pool == null) {
			CommunicationProvider provider = null;
			switch (componentConfig.getCommunicationProvider()) {
			case JMS:
				provider = new JmsCommunicationProvider();
				break;
			case MQTT:
				provider = new MqttCommunicationProvider();
				break;
			default:
				break;
			}

			client = cf.createClient(id, cf.createAuthentication(id, "secret", null));
			pool = cf.connectChannelPool(client, basysConnectionString, provider);
		}

		inChannel = cf.openChannel(pool, componentConfig.getInChannel(), false, new ComponentChannelListener(this));
		outChannel = cf.openChannel(pool, componentConfig.getOutChannel(), false, null);
	}

	protected void disconnectFromBasys() {
		inChannel.close();
		outChannel.close();

		if (client != null) {
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
