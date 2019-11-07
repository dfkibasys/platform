package de.dfki.cos.basys.platform.runtime.gateway.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceConnection;
import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationFactory;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.Property;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.service.ServiceComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponentContext;
import de.dfki.cos.basys.platform.runtime.component.v2.StringConstants;
import de.dfki.cos.basys.platform.runtime.gateway.Gateway;

public class JmsGateway implements ServiceConnection, Gateway {

	public final Logger LOGGER;
	private String id = null;
	
	BasysComponentContext context;
	CommFactory cf = CommFactory.getInstance();
		
	protected Map<Channel, MessageProducer> outgoing = new HashMap<>();
	protected Map<MessageConsumer, Channel> incoming = new HashMap<>();
	
	// JMS
	private Connection connection;
	private Session session;
	private boolean connected = false;

	public JmsGateway(Properties config) {
		this.id = config.getProperty(StringConstants.id);
		this.LOGGER = LoggerFactory.getLogger("basys.component." + id.replaceAll(" ", "-"));
	}


	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		this.context = (BasysComponentContext) context;
		
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(connectionString);
		try {
			connection = connectionFactory.createConnection();
			connection.setClientID(id);
			connection.start();			
			connection.setExceptionListener(new ExceptionListener() {				
				@Override
				public void onException(JMSException e) {
					LOGGER.info("JmsClient \"" + id + "\": " + e.getLocalizedMessage() );	
					connected = false;
				}
			});

			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			LOGGER.info("JmsClient \"" + id + "\" connected to \"" + connectionString + "\"");
			connected = true;
			return connected;
		} catch (JMSException e) {
			LOGGER.warn("JmsClient \"" + id + "\" cannot connect to \"" + connectionString + "\"", e);
			return connected;
		}
	}

	@Override
	public void disconnect() {
		try {
			
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
						
			session.close();
			connection.close();
			connected = false;
		} catch (JMSException e) {
			LOGGER.warn("JmsClient \"" + id + "\"" + " cannot disconnect", e);
		}
	}
	
	@Override
	public boolean isConnected() {
		return connected;
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
