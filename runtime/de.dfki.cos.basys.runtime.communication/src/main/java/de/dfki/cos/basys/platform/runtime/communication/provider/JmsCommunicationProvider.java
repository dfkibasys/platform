package de.dfki.cos.basys.platform.runtime.communication.provider;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import javax.jms.Connection;
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

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationProvider;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.ResponseCallback;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ProviderException;
import de.dfki.cos.basys.platform.runtime.communication.CommUtils;

public class JmsCommunicationProvider implements CommunicationProvider {

	protected final Logger LOGGER = LoggerFactory.getLogger(JmsCommunicationProvider.class.getName());

	public static String defaultConnectionString;
	private Connection connection = null;
	private Session session;

	private MessageProducer replyProducer;
	private TemporaryQueue tmpQueue;
	private MessageConsumer responseConsumer;

	private Map<String, ResponseCallback> requestCorrelations = new ConcurrentHashMap<String, ResponseCallback>();

	private Map<String, JmsDestination> destinations = new ConcurrentHashMap<String, JmsDestination>();
	
	ExecutorService executor = Executors.newCachedThreadPool();
	
	static {
		try {
			String serverName = CommUtils.getPreferredBasysMiddleware();
			defaultConnectionString = String.format("tcp://%s:61616", serverName);			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	@Override
	public void doConnect(ChannelPool pool) throws ProviderException {
		String poolId = pool.getId();

		LOGGER.info("doConnect ChannelPool: " + poolId);
		Authentication auth = pool.getClient().getAuthentication();

		if (pool.getUri() == null) {
			pool.setUri(defaultConnectionString);
			LOGGER.warn(String.format("ConnectionString not specified, using VM internal default %s", pool.getUri()));
		}

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
						message.acknowledge();
						String correlationId = textMessage.getJMSCorrelationID();
						ResponseCallback listener = requestCorrelations.get(correlationId);
						Response response = JsonUtils.fromString(textMessage.getText(), Response.class);
						if (listener != null) {
							listener.handleResponse(response);
						} else {
							LOGGER.warn("listener is null, correlationId " + correlationId);
						}
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
			throw new ProviderException("ChannelPool \"" + poolId + "\" cannot connect to \"" + pool.getUri() + "\"", e);
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

	private String getJmsChannelName(Channel channel) {
		return channel.getName().replaceAll("#", ".");
	}

	@Override
	public void doOpenChannel(Channel channel) throws ProviderException {
		LOGGER.trace("doOpenChannel: " + channel.getName());

		JmsDestination internalDestination = this.destinations.get(channel.getId());

		if (internalDestination == null) {
			internalDestination = new JmsDestination(getJmsChannelName(channel));
			this.destinations.put(channel.getId(), internalDestination);
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
					public void onMessage(Message message) {
						TextMessage textMessage = (TextMessage) message;
						try {
							message.acknowledge();
							String content = textMessage.getText();
							try {
								de.dfki.cos.basys.platform.model.runtime.communication.Message incomingMessage = 
										JsonUtils.fromString(content, de.dfki.cos.basys.platform.model.runtime.communication.Message.class);
								if (textMessage.getJMSCorrelationID() != null) {
									Request req = (Request) incomingMessage;
									Response res = channel.getListener().handleRequest(channel, req);
									String payload = JsonUtils.toString(res);

									TextMessage responseMessage = session.createTextMessage();
									responseMessage.setText(payload);
									responseMessage.setJMSCorrelationID(textMessage.getJMSCorrelationID());
									replyProducer.send(textMessage.getJMSReplyTo(), responseMessage);
								} else {
									if (incomingMessage instanceof Notification) {
										channel.getListener().handleNotification(channel, (Notification) incomingMessage);
									} else {
										channel.getListener().handleMessage(channel, incomingMessage.getPayload());
									}
								}
							} catch (IOException e) {
								channel.getListener().handleMessage(channel, content);
							}
						} catch (JMSException e) {
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
							message.acknowledge();
							String content = textMessage.getText();
							try {
								de.dfki.cos.basys.platform.model.runtime.communication.Message incomingMessage = 
										JsonUtils.fromString(content, de.dfki.cos.basys.platform.model.runtime.communication.Message.class);
								if (textMessage.getJMSCorrelationID() != null) {
									
									Runnable task = new Runnable() {
										
										@Override
										public void run() {											
											try {
												Request req = (Request) incomingMessage;
												Response res = channel.getListener().handleRequest(channel, req);
												String payload = JsonUtils.toString(res);
												TextMessage responseMessage = session.createTextMessage();
												responseMessage.setText(payload);
												responseMessage.setJMSCorrelationID(textMessage.getJMSCorrelationID());
												
												replyProducer.send(textMessage.getJMSReplyTo(), responseMessage);
											} catch (JsonProcessingException e) {
												e.printStackTrace();
											} catch (JMSException e) {
												e.printStackTrace();
											}											
										}
									};
									
									executor.execute(task);									
									
								} else {
									if (incomingMessage instanceof Notification) {
										channel.getListener().handleNotification(channel, (Notification) incomingMessage);
									} else {
										channel.getListener().handleMessage(channel, incomingMessage.getPayload());
									}
								}
							} catch (IOException | ClassCastException e) {
								channel.getListener().handleMessage(channel, content);
							}
						} catch (JMSException e) {
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
		JmsDestination internal_destination = this.destinations.get(channel.getId());

		if (internal_destination.getMessageConsumer() != null) {
			try {
				internal_destination.getMessageConsumer().close();
			} catch (JMSException e) {
				throw new ProviderException("Cannot close channel " + channel.getId() + " (" + channel.getName() + ")", e);
			}
		}

		this.destinations.remove(channel.getId());

	}

	@Override
	public void doSendMessage(Channel channel, String payload) throws ProviderException {
		LOGGER.trace("doSendMessage: " + channel.getName());

		JmsDestination internal_destination = this.destinations.get(channel.getId());

		// de.dfki.cos.basys.platform.model.runtime.communication.Message message = ClientFactory.getInstance()
		// .createNotification(payload);

		try {
			// String payloadString = JsonUtils.toString(payload);
			Message jmsMsg = session.createTextMessage(payload);
			// if (internal_destination.getMessageProducer() == null) {
			// Topic jmsTopic = session.createTopic(channel.getName());
			// MessageProducer jmsProducer = session.createProducer(jmsTopic);
			// internal_destination.setMessageProducer(jmsProducer);
			// }
			internal_destination.getMessageProducer().send(jmsMsg);
		} catch (JMSException e) {
			throw new ProviderException("Message could not be published on " + channel.getName() + ".", e);
			// } catch (IOException e) {
			// e.printStackTrace();
		}

	}

	@Override
	public void doSendRequest(Channel channel, Request req, ResponseCallback cb) throws ProviderException {
		LOGGER.trace("doSendRequest: " + channel.getName());

		JmsDestination internal_destination = this.destinations.get(channel.getId());

		try {
			String payload = JsonUtils.toString(req);
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
				e.printStackTrace();
			}

		}
		return cb.response;
	}

	@Override
	public void doSendNotification(Channel channel, Notification not) throws ProviderException {
		LOGGER.trace("doSendNotification: " + channel.getName());

		JmsDestination internal_destination = this.destinations.get(channel.getId());

		try {
			String payload = JsonUtils.toString(not);
			Message jmsMsg = session.createTextMessage(payload);
			// if (internal_destination.getMessageProducer() == null) {
			// Topic jmsTopic = session.createTopic(internal_destination.getName());
			// MessageProducer jmsProducer = session.createProducer(jmsTopic);
			// internal_destination.setMessageProducer(jmsProducer);
			// }
			internal_destination.getMessageProducer().send(jmsMsg);
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (JMSException e) {
			throw new ProviderException("Message could not be published on " + channel.getName() + ".", e);
		}
	}

	class JmsDestination {

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
