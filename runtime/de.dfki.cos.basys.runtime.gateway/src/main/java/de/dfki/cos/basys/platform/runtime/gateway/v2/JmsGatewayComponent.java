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

public class JmsGatewayComponent extends BasysComponent implements Gateway {

	private Session session = null;
	
	protected Map<Channel, MessageProducer> outgoing = new HashMap<>();
	protected Map<MessageConsumer, Channel> incoming = new HashMap<>();

	public JmsGatewayComponent(Properties config) {
		super(config);
		
		connectionManager = new ConnectionManagerImpl(config, new Supplier<JmsClient>() {
			@Override
			public JmsClient get() {
				JmsClient client = new JmsClient(config);
				return client;
			}
		});		
	}

	@Override
	protected void doActivate() throws de.dfki.cos.basys.common.component.ComponentException {
		super.doActivate();
		
		session = connectionManager.getFunctionalClient(JmsClient.class).getSession();
		
		if (isConnected()) {					
			for (String key : config.stringPropertyNames()) {
				if (key.startsWith("incoming")) {
					String[] parts = config.getProperty(key).split(" ");
					installIncomingChannel(parts[0], parts[1]);
				}
				else if (key.startsWith("outgoing")) {
					String[] parts = config.getProperty(key).split(" ");
					installOutgoingChannel(parts[0], parts[1]);
				}
			}
		} else {
			LOGGER.warn("cannot create routes, not connected.");
		}
	}
	
	@Override
	protected void doDeactivate() throws de.dfki.cos.basys.common.component.ComponentException {
		super.doDeactivate();
		
		outgoing.forEach((channel, mp) -> {
			channel.close();
			try {
				mp.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		});
		
		incoming.forEach((mc, channel) -> {				
			try {
				mc.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
			channel.close();
		});
	}

	@Override
	public void installOutgoingChannel(String internalChannelName, String externalChannelName) {
		try {

			Topic jmsTopicProducer = session.createTopic(externalChannelName);
			MessageProducer sender = session.createProducer(jmsTopicProducer);

			Channel internalChannel = cf.openChannel(context.getSharedChannelPool(), internalChannelName, false, new ChannelListener() {

				@Override
				public Response handleRequest(Channel channel, Request req) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public void handleNotification(Channel channel, Notification not) {
					try {
						TextMessage outMsg = session.createTextMessage();
						String payload = JsonUtils.toString(not);
						outMsg.setText(payload);
						sender.send(outMsg);
					} catch (JMSException | JsonProcessingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				@Override
				public void handleMessage(Channel channel, String msg) {
					try {
						TextMessage outMsg = session.createTextMessage();
						outMsg.setText(msg);
						sender.send(outMsg);
					} catch (JMSException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			outgoing.put(internalChannel, sender);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void installIncomingChannel(String externalChannelName, String internalChannelName) {
		try {
			Channel internalChannel = cf.openChannel(context.getSharedChannelPool(), internalChannelName, false, null);

			Topic jmsTopicConsumer = session.createTopic(externalChannelName);
			MessageConsumer receiver = session.createConsumer(jmsTopicConsumer);
			receiver.setMessageListener(new MessageListener() {

				@Override
				public void onMessage(Message message) {
					try {

						String payload = ((TextMessage) message).getText();
						internalChannel.sendMessage(payload);

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}

				}
			});

			incoming.put(receiver, internalChannel);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
