package de.dfki.cos.basys.platform.runtime.gateway.v2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Supplier;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.common.component.ServiceConnection;
import de.dfki.cos.basys.common.component.impl.ConnectionManagerImpl;
import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponent;
import de.dfki.cos.basys.platform.runtime.gateway.Gateway;

public abstract class AbstractGatewayComponent extends BasysComponent implements Gateway {


	public AbstractGatewayComponent(Properties config) {
		super(config);
	}

	@Override
	protected void doActivate() throws de.dfki.cos.basys.common.component.ComponentException {
		super.doActivate();
		
		Gateway gw = connectionManager.getServiceInterface(Gateway.class);
		
		if (isConnected()) {					
			for (String key : config.stringPropertyNames()) {
				if (key.startsWith("incoming")) {
					String[] parts = config.getProperty(key).split(" ");
					gw.installIncomingChannel(parts[0], parts[1]);
				}
				else if (key.startsWith("outgoing")) {
					String[] parts = config.getProperty(key).split(" ");
					gw.installOutgoingChannel(parts[0], parts[1]);
				}
			}
		} else {
			LOGGER.warn("cannot create routes, not connected.");
		}
	}
	
	@Override
	public void installOutgoingChannel(String internalChannelName, String externalChannelName) {
		Gateway gw = connectionManager.getServiceInterface(Gateway.class);
		gw.installOutgoingChannel(internalChannelName, externalChannelName);		
	}

	@Override
	public void installIncomingChannel(String externalChannelName, String internalChannelName) {
		Gateway gw = connectionManager.getServiceInterface(Gateway.class);
		gw.installIncomingChannel(externalChannelName, internalChannelName);		
	}



}
