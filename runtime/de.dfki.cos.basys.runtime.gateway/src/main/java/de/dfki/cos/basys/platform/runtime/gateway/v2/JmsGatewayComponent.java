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

import de.dfki.cos.basys.common.component.impl.ConnectionManagerImpl;
import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponent;
import de.dfki.cos.basys.platform.runtime.gateway.Gateway;
import de.dfki.cos.basys.platform.runtime.gateway.GatewayProvider;

public class JmsGatewayComponent extends BasysComponent implements Gateway {

	public JmsGatewayComponent(Properties config) {
		super(config);
		
		connectionManager = new ConnectionManagerImpl(config, new Supplier<GatewayProvider>() {
			@Override
			public GatewayProvider get() {
				GatewayProvider client = new JmsGatewayProvider(config);
				return client;
			}
		});		
	}

	@Override
	protected void doActivate() throws de.dfki.cos.basys.common.component.ComponentException {
		super.doActivate();
		
		Gateway gw = connectionManager.getFunctionalClient(GatewayProvider.class).getGateway();
		
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
		Gateway gw = connectionManager.getFunctionalClient(GatewayProvider.class).getGateway();
		gw.installOutgoingChannel(internalChannelName, externalChannelName);		
	}

	@Override
	public void installIncomingChannel(String externalChannelName, String internalChannelName) {
		Gateway gw = connectionManager.getFunctionalClient(GatewayProvider.class).getGateway();
		gw.installIncomingChannel(externalChannelName, internalChannelName);		
	}



}
