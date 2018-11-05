package de.dfki.iui.basys.runtime.gateway;

import java.util.HashMap;
import java.util.Map;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.Property;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;

public class JmsGatewayComponent extends ServiceComponent implements Gateway {

	protected Map<Channel, MessageProducer> outgoing = new HashMap<>();
	protected Map<MessageConsumer, Channel> incoming = new HashMap<>();

	// JMS
	private Connection connection;
	private Session session;

	CommFactory cf = CommFactory.getInstance();

	public JmsGatewayComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(getConfig().getExternalConnectionString());
		try {
			connection = connectionFactory.createConnection();
			connection.setClientID(getId());
			connection.start();

			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		} catch (JMSException e) {
			throw new ComponentException(e);
		}

		for (Property p : getConfig().getProperties()) {
			if (p.getKey().equals("incoming")) {
				String[] parts = p.getValue().split(" ");
				installOutgoingChannel(parts[0], parts[1]);
			}
			if (p.getKey().equals("outgoing")) {
				String[] parts = p.getValue().split(" ");
				installIncomingChannel(parts[0], parts[1]);
			}
		}
	}

	@Override
	public void disconnectFromExternal() {
		super.disconnectFromExternal();
		
		try {
			
			outgoing.forEach((channel, mp) -> {
				channel.close();
				try {
					mp.close();
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			incoming.forEach((mc, channel) -> {				
				try {
					mc.close();
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				channel.close();
			});
			
			session.close();
			connection.close();
		} catch (JMSException e) {
			e.printStackTrace();
		}
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
