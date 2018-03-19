package de.dfki.iui.basys.runtime.communication.provider;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.common.emf.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Authentication;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.CommunicationProvider;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.communication.ResponseCallback;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException;
import de.dfki.iui.basys.runtime.communication.ClientFactory;

public class JmsCommunicationProvider implements CommunicationProvider {

	protected final Logger LOGGER = LoggerFactory.getLogger(JmsCommunicationProvider.class.getName());

	private Connection connection = null;
	private Session session;

	private MessageProducer replyProducer;
	private TemporaryQueue tmpQueue;
	private MessageConsumer responseConsumer;

	private Map<String, ResponseCallback> requestCorrelations = new ConcurrentHashMap<String, ResponseCallback>();

	private Map<String, JmsDestination> destinations = new ConcurrentHashMap<String, JmsDestination>();

	@Override
	public void doConnect(ChannelPool pool) throws ProviderException {
		String poolId = pool.getId();

		LOGGER.info("doConnect ChannelPool: " + poolId);
		Authentication auth = pool.getClient().getAuthentication();

		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(pool.getUri());

		try {
			if (auth == null) {
				this.connection = connectionFactory.createConnection();
			} else {
				this.connection = connectionFactory.createConnection(auth.getUsername(), auth.getPassword());
			}
			this.connection.setClientID(poolId);
			this.connection.start();
			this.session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			this.replyProducer = this.session.createProducer(null);
			tmpQueue = session.createTemporaryQueue();
			responseConsumer = session.createConsumer(tmpQueue);

			responseConsumer.setMessageListener(new MessageListener() {

				@Override
				public void onMessage(Message message) {
					TextMessage textMessage = (TextMessage) message;
					try {
						String correlationId = textMessage.getJMSCorrelationID();
						ResponseCallback listener = requestCorrelations.get(correlationId);
						Response response = JsonUtils.fromJsonString(textMessage.getText(), Response.class);
						listener.handleResponse(response);
						requestCorrelations.remove(correlationId);
					} catch (JMSException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});

			LOGGER.info("ChannelPool connected: " + poolId);
		} catch (Exception e) {
			throw new ProviderException("ChannelPool \"" + poolId + "\" cannot connect to \"" + pool.getUri() + "\"",
					e);
		}

	}

	@Override
	public void doDisconnect(ChannelPool pool) throws ProviderException {

		String poolId = pool.getId();

		try {
			this.connection.stop();
			this.session.close();
			this.connection.close();
		} catch (JMSException e) {
			throw new ProviderException("ChannelPool \"" + poolId + "\"" + " cannot disconnect", e);
		}

	}

	@Override
	public void doOpenChannel(Channel channel) throws ProviderException {
		LOGGER.info("doOpenChannel: " + channel.getName());

		JmsDestination internalDestination = this.destinations.get(channel.getName());

		if (internalDestination == null) {
			internalDestination = new JmsDestination(channel.getName());
			this.destinations.put(channel.getName(), internalDestination);
		}

		if (internalDestination.getMessageConsumer() != null) {
			return;
		}
		
		if (channel.isQueued()) {

			Queue jmsQueue;
			try {
				jmsQueue = session.createQueue(internalDestination.getName());
				MessageConsumer consumer = session.createConsumer(jmsQueue);
				internalDestination.setMessageConsumer(consumer);

				Queue jmsQueueProduce = session.createQueue(internalDestination.getName());
				MessageProducer jmsProducer = session.createProducer(jmsQueueProduce);
				internalDestination.setMessageProducer(jmsProducer);
				
				if (channel.getListener() == null) {
					return;
				}

				consumer.setMessageListener(new MessageListener() {

					@Override
					public void onMessage(Message msg) {
						TextMessage textMessage = (TextMessage) msg;

						try {
							de.dfki.iui.basys.model.runtime.communication.Message incomingMessage = JsonUtils
									.fromJsonString(textMessage.getText(),
											de.dfki.iui.basys.model.runtime.communication.Message.class);
							if (textMessage.getJMSCorrelationID() != null) {
								Request req = (Request) incomingMessage;
								Response res = channel.getListener().handleRequest(req);
								String payload = JsonUtils.toJsonString(res);

								TextMessage responseMessage = session.createTextMessage();
								responseMessage.setText(payload);
								responseMessage.setJMSCorrelationID(textMessage.getJMSCorrelationID());
								replyProducer.send(textMessage.getJMSReplyTo(), responseMessage);
							} else {
								if (incomingMessage instanceof Notification) {
									channel.getListener().handleNotification((Notification) incomingMessage);
								} else {
									channel.getListener().handleMessage(incomingMessage.getPayload());
								}
							}
						} catch (JMSException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});
			} catch (JMSException e) {
				throw new ProviderException("Cannot open channel \"" + channel.getName() + "\"", e);
			}

		} else {

			Topic jmsTopic;
			try {
				jmsTopic = session.createTopic(internalDestination.getName());
				MessageConsumer consumer = session.createConsumer(jmsTopic);
				internalDestination.setMessageConsumer(consumer);

				Topic jmsTopicProducer = session.createTopic(internalDestination.getName());
				MessageProducer jmsProducer = session.createProducer(jmsTopicProducer);
				internalDestination.setMessageProducer(jmsProducer);


				if (channel.getListener() == null) {
					return;
				}

				consumer.setMessageListener(new MessageListener() {

					@Override
					public void onMessage(Message message) {
						TextMessage textMessage = (TextMessage) message;
						try {
							de.dfki.iui.basys.model.runtime.communication.Message incomingMessage = JsonUtils
									.fromJsonString(textMessage.getText(),
											de.dfki.iui.basys.model.runtime.communication.Message.class);
							if (textMessage.getJMSCorrelationID() != null) {
								Request req = (Request) incomingMessage;
								Response res = channel.getListener().handleRequest(req);
								String payload = JsonUtils.toJsonString(res);

								TextMessage responseMessage = session.createTextMessage();
								responseMessage.setText(payload);
								responseMessage.setJMSCorrelationID(textMessage.getJMSCorrelationID());
								replyProducer.send(textMessage.getJMSReplyTo(), responseMessage);
							} else {
								if (incomingMessage instanceof Notification) {
									channel.getListener().handleNotification((Notification) incomingMessage);
								} else {
									channel.getListener().handleMessage(incomingMessage.getPayload());
								}
							}
						} catch (JMSException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});
			} catch (JMSException e) {
				throw new ProviderException("Cannot open channel \"" + channel.getName() + "\"", e);
			}

		}

	}

	@Override
	public void doCloseChannel(Channel channel) throws ProviderException {
		JmsDestination internal_destination = (JmsDestination) this.destinations.get(channel.getName());

		if (internal_destination.getMessageConsumer() != null) {
			try {
				internal_destination.getMessageConsumer().close();
			} catch (JMSException e) {
				throw new ProviderException("Cannot close channel \"" + channel.getName() + "\"", e);
			}
		}

		this.destinations.remove(channel.getName());
	}

	@Override
	public void doSendMessage(Channel channel, String payload) throws ProviderException {
		LOGGER.info("doSendMessage: " + channel.getName());

		JmsDestination internal_destination = (JmsDestination) this.destinations.get(channel.getName());

		de.dfki.iui.basys.model.runtime.communication.Message message = ClientFactory.getInstance()
				.createNotification(payload);

		try {
			String payloadString = JsonUtils.toJsonString(message);
			Message jmsMsg = session.createTextMessage(payloadString);
			if (internal_destination.getMessageProducer() == null) {
				Topic jmsTopic = session.createTopic(channel.getName());
				MessageProducer jmsProducer = session.createProducer(jmsTopic);
				internal_destination.setMessageProducer(jmsProducer);
			}
			internal_destination.getMessageProducer().send(jmsMsg);
		} catch (JMSException e) {
			throw new ProviderException("Message could not be published on " + channel.getName() + ".", e);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void doSendRequest(Channel channel, Request req, ResponseCallback cb) throws ProviderException {
		LOGGER.info("doSendRequest: " + channel.getName());

		JmsDestination internal_destination = this.destinations.get(channel.getName());

		try {
			String payload = JsonUtils.toJsonString(req);
			Message jmsMsg = session.createTextMessage(payload);
			String correlationId = UUID.randomUUID().toString();
			jmsMsg.setJMSCorrelationID(correlationId);
			jmsMsg.setJMSReplyTo(tmpQueue);
			this.requestCorrelations.put(correlationId, cb);
			internal_destination.getMessageProducer().send(jmsMsg);
		} catch (JMSException e) {
			throw new ProviderException("Message could not be published on " + channel.getName() + ".", e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Response doSendRequest(Channel channel, Request req) throws ProviderException {
		SyncResponseCallback cb = new SyncResponseCallback();
		synchronized (cb) {
			doSendRequest(channel, req, cb);
			try {
				cb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return cb.response;
	}

	@Override
	public void doSendNotification(Channel channel, Notification not) throws ProviderException {
		LOGGER.info("doSendNotification: " + channel.getName());

		JmsDestination internal_destination = (JmsDestination) this.destinations.get(channel.getName());

		try {
			String payload = JsonUtils.toJsonString(not);
			Message jmsMsg = session.createTextMessage(payload);
			if (internal_destination.getMessageProducer() == null) {
				Topic jmsTopic = session.createTopic(channel.getName());
				MessageProducer jmsProducer = session.createProducer(jmsTopic);
				internal_destination.setMessageProducer(jmsProducer);
			}
			internal_destination.getMessageProducer().send(jmsMsg);
		} catch (JMSException e) {
			throw new ProviderException("Message could not be published on " + channel.getName() + ".", e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class JmsDestination  {

		private MessageConsumer messageConsumer;
		private MessageProducer messageProducer;
		
		private String name;

		public String getName() {
			return this.name;
		}

		public JmsDestination(String name) {
			this.name = name;
		}
		
		public void setMessageConsumer(MessageConsumer messageConsumer) {
			this.messageConsumer = messageConsumer;
		}

		public MessageConsumer getMessageConsumer() {
			return messageConsumer;
		}
		
		public void setMessageProducer(MessageProducer messageProducer) {
			this.messageProducer = messageProducer;
		}
		
		public MessageProducer getMessageProducer() {
			return messageProducer;
		}
		

	}

	class SyncResponseCallback implements ResponseCallback {

		public Response response;

		@Override
		public synchronized void handleResponse(Response res) {
			response = res;
			notifyAll();
		}

	}
	
	@Override
	public boolean supportQueuedChannels() {
		return true;
	}
}
