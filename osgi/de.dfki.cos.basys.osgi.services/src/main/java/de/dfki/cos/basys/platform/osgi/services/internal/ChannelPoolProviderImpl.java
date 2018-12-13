package de.dfki.cos.basys.platform.osgi.services.internal;

import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.osgi.services.ChannelPoolProvider;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE)
public class ChannelPoolProviderImpl implements ChannelPoolProvider {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
	protected ComponentContext context;
	protected Client communicationClient;
	protected ChannelPool channelPool;

	public ChannelPoolProviderImpl() {
	}

	@Activate
	protected void activate(ComponentContext context, Map<String, Object> properties) {
		modified(context, properties);

	}

	@Modified
	public synchronized void modified(ComponentContext context, Map<String, Object> properties) {
		this.context = context;

		// TODO: handle case where modified is called more than once during activation.

		if (properties.containsKey("clientId")) {
			String clientId = (String) properties.get("clientId");
			if (properties.containsKey("username") && properties.containsKey("password")) {
				String username = (String) properties.get("username");
				String password = (String) properties.get("password");
				Authentication auth = CommFactory.getInstance().createAuthentication(username, password, null);
				communicationClient = CommFactory.getInstance().createClient("client", auth);
			} else {
				communicationClient = CommFactory.getInstance().createClient("client", null);
			}
		}

		if (properties.containsKey("communicationProviderImplementationJavaClass") ) {

			String communicationProviderImplementationJavaClass = (String) properties.get("communicationProviderImplementationJavaClass");
			
			String connectionString = null;
			if (properties.containsKey("connectionString"))			
				connectionString = (String) properties.get("connectionString");

			channelPool = CommFactory.getInstance().connectChannelPool(communicationClient, connectionString, communicationProviderImplementationJavaClass);

		}

	}

	@Deactivate
	protected void deactivate(ComponentContext context, int reason) {
		channelPool.disconnect();
		channelPool = null;
	}

	@Override
	public ChannelPool getSharedChannelPool() {
		return channelPool;
	}

}
