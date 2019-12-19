package de.dfki.cos.basys.platform.runtime.gateway;

import java.util.Properties;

import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.platform.runtime.component.BasysComponent;

public abstract class AbstractGatewayComponent extends BasysComponent<Gateway> implements Gateway {


	public AbstractGatewayComponent(Properties config) {
		super(config);
	}

	public AbstractGatewayComponent(Properties config, ServiceProvider<Gateway> serviceProvider) {
		super(config, serviceProvider);
	}
	
	@Override
	protected void doActivate() throws de.dfki.cos.basys.common.component.ComponentException {
		super.doActivate();
				
		if (isConnected()) {					
			for (String key : config.stringPropertyNames()) {
				if (key.startsWith("incoming")) {
					String[] parts = config.getProperty(key).split(" ");
					getService().installIncomingChannel(parts[0], parts[1]);
				}
				else if (key.startsWith("outgoing")) {
					String[] parts = config.getProperty(key).split(" ");
					getService().installOutgoingChannel(parts[0], parts[1]);
				}
			}
		} else {
			LOGGER.warn("cannot create routes, not connected.");
		}
	}
	
	@Override
	public void installOutgoingChannel(String internalChannelName, String externalChannelName) {
		getService().installOutgoingChannel(internalChannelName, externalChannelName);		
	}

	@Override
	public void installIncomingChannel(String externalChannelName, String internalChannelName) {		
		getService().installIncomingChannel(externalChannelName, internalChannelName);		
	}



}
