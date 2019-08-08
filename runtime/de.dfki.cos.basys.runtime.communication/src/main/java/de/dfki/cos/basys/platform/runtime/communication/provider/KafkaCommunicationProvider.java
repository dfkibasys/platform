package de.dfki.cos.basys.platform.runtime.communication.provider;

import java.io.IOException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationProvider;
import de.dfki.cos.basys.platform.model.runtime.communication.Message;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.ResponseCallback;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ProviderException;
import de.dfki.cos.basys.platform.runtime.communication.CommUtils;
import de.dfki.cos.basys.platform.runtime.communication.provider.JmsCommunicationProvider.JmsDestination;

public class KafkaCommunicationProvider implements CommunicationProvider {

	protected final Logger LOGGER = LoggerFactory.getLogger(KafkaCommunicationProvider.class.getName());

	public static String defaultConnectionString;

	private KafkaProducer<String, String> replyProducer;// I can map them or create a list of them
	private String responseTopic;
	private KafkaConsumer<String, String> responseConsumer;

	private Map<String, ResponseCallback> requestCorrelations = new ConcurrentHashMap<String, ResponseCallback>();

	private Map<String, KafkaChannel> channels = new ConcurrentHashMap<String, KafkaChannel>();

	ExecutorService executor = Executors.newCachedThreadPool();

	static {
		try {
			String serverName = CommUtils.getPreferredBasysMiddleware();
			// "tcp://%s:61616" "lns-90165.sb.dfki.de:9092"
			defaultConnectionString = String.format("tcp://%s:9092", serverName);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	// in JMS we set a message listener as well. That listener checks for a message
	// and if found it handles and gives a response.
	// In kafka version only producer and consumer is created. just like
	// session.consumer / session.producer
	@Override
	public void doConnect(ChannelPool pool) throws ProviderException {
		String poolId = pool.getId();
		LOGGER.info("doConnect ChannelPool: " + poolId);
		// Authentication auth = pool.getClient().getAuthentication();// UNSURE?

		if (pool.getUri() == null) {
			pool.setUri(defaultConnectionString);
			LOGGER.warn(String.format("ConnectionString not specified, using VM internal default %s", pool.getUri()));
		}
		try {
			// replyProducer = createProducer(poolId);
			// responseTopic = poolId + "_response_" + UUID.randomUUID().toString();
			// responseConsumer = createConsumer(poolId);

			// TODO: subscribe responseConsumer to responseTopic

			LOGGER.info("ChannelPool connected: " + poolId);
		} catch (Exception e) {
			throw new ProviderException("ChannelPool \"" + poolId + "\" cannot connect to \"" + pool.getUri() + "\"",
					e);
		}

	}

	// close/deconstructor for producer and consumer
	@Override
	public void doDisconnect(ChannelPool pool) throws ProviderException {
		String poolId = pool.getId();
		LOGGER.info("doDisconnect ChannelPool: " + poolId);

		try {
			// replyProducer.close();
			// responseConsumer.close();

		} catch (Exception e) {
			throw new ProviderException("ChannelPool \"" + poolId + "\"" + " cannot disconnect", e);
		}

	}

	@Override
	public void doOpenChannel(Channel channel) throws ProviderException {
		LOGGER.trace("doOpenChannel: " + channel.getName());

		KafkaChannel internalChannel = this.channels.get(channel.getId());
		if (internalChannel == null) {
			internalChannel = new KafkaChannel(channel);
			internalChannel.open();
			this.channels.put(channel.getId(), internalChannel);
		}

	}

	@Override
	public void doCloseChannel(Channel channel) throws ProviderException {
		LOGGER.trace("doCloseChannel: " + channel.getName());

		KafkaChannel internalChannel = this.channels.get(channel.getId());

		try {
			internalChannel.close();
		} catch (Exception e) {
			throw new ProviderException("Cannot close channel " + channel.getId() + " (" + channel.getName() + ")", e);
		}

		this.channels.remove(channel.getId());
	}

	@Override
	public void doSendMessage(Channel channel, String msg) throws ProviderException {
		LOGGER.trace("doSendMessage: " + channel.getName());

		KafkaChannel internalChannel = this.channels.get(channel.getId());

		try {
			internalChannel.send(msg);
		} catch (Exception e) {
			throw new ProviderException("Message could not be published on " + channel.getName() + ".", e);
		}
	}

	@Override
	public void doSendRequest(Channel channel, Request req, ResponseCallback cb) throws ProviderException {
		// TODO Auto-generated method stub

	}

	@Override
	public Response doSendRequest(Channel channel, Request req) throws ProviderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doSendNotification(Channel channel, Notification not) throws ProviderException {
		LOGGER.trace("doSendNotification: " + channel.getName());

		KafkaChannel internalChannel = this.channels.get(channel.getId());

		try {
			String payload = JsonUtils.toString(not);
			internalChannel.send(payload);
		} catch (Exception e) {
			throw new ProviderException("Message could not be published on " + channel.getName() + ".", e);
		}
	}

	@Override
	public boolean supportQueuedChannels() {
		return false;
	}

	private static KafkaProducer<String, String> createProducer() throws ProviderException {
		return createProducer(null);
	}

	private static KafkaProducer<String, String> createProducer(String clientId) throws ProviderException {
		Properties props = new Properties();
		if (clientId != null)
			props.put(ProducerConfig.CLIENT_ID_CONFIG, clientId);
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, defaultConnectionString);
		props.put(ProducerConfig.ACKS_CONFIG, "all");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		return new KafkaProducer<>(props);
	}

	private static KafkaConsumer<String, String> createConsumer() throws ProviderException {
		return createConsumer(null);
	}

	private static KafkaConsumer<String, String> createConsumer(String clientId) throws ProviderException {
		Properties props = new Properties();
		if (clientId != null)
			props.put(ConsumerConfig.CLIENT_ID_CONFIG, clientId);
		props.put(ConsumerConfig.GROUP_ID_CONFIG, UUID.randomUUID().toString());
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, defaultConnectionString);
		props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
		props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringDeserializer");
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringDeserializer");
		return new KafkaConsumer<>(props);
	}

	class KafkaChannel {

		private Channel channel;
		private KafkaConsumer<String, String> messageConsumer;
		private KafkaProducer<String, String> messageProducer;

		private String name;
		private boolean isOpen;

		public KafkaChannel(Channel channel) {
			this.channel = channel;
			this.name = toTopic(channel);
		}

		public String getName() {
			return this.name;
		}

//		public void setMessageConsumer(KafkaConsumer<String, String> messageConsumer) {
//			this.messageConsumer = messageConsumer;
//		}

//		public KafkaConsumer<String, String> getMessageConsumer() {
//			return messageConsumer;
//		}

//		public void setMessageProducer(KafkaProducer<String, String> messageProducer) {
//			this.messageProducer = messageProducer;
//		}

//		public KafkaProducer<String, String> getMessageProducer() {
//			return messageProducer;
//		}

		public void open() {

			if (channel.isQueued())
				throw new ProviderException("KAKFA does currently not support queued channels.");

			this.messageProducer = createProducer();

			if (channel.getListener() != null) {

				try {
					this.messageConsumer = createConsumer();
					this.messageConsumer.subscribe(Arrays.asList(name));

					isOpen = true;

					Runnable task = new Runnable() {
						@Override
						public void run() { // denklestir alttaki run

							// while thread is not closed poll
							// if poll returns nonempty results then for each record get the message and
							// create a comm package message
							// if key is not null then it means that it's a request.
							// if its a request based on chanel's listener handle the request

							// if key is null then check if incoming message is an instanceOfNotification or
							// a message

							while (isOpen) {

								ConsumerRecords<String, String> records = messageConsumer.poll(Duration.ofMillis(1000));
								if (!records.isEmpty() && isOpen) {
									for (ConsumerRecord<String, String> record : records) {
										String content = (String) record.value();
										try {
											Message incomingMessage = JsonUtils.fromString(content, Message.class);

											if (record.key() != null) {
												Request req = (Request) incomingMessage;
												Response res = channel.getListener().handleRequest(channel, req);
												String payload = JsonUtils.toString(res);
												replyProducer.send(new ProducerRecord<String, String>(channel.getName(),
														record.key(), payload));

											} else {
												if (incomingMessage instanceof Notification) {
													channel.getListener().handleNotification(channel,
															(Notification) incomingMessage);
												} else {
													channel.getListener().handleMessage(channel,
															incomingMessage.getPayload());
												}
											}
										} catch (IOException | ClassCastException e) {
											channel.getListener().handleMessage(channel, content);
										}

									}
								}
							}
							messageConsumer.close();
						}
					};
					executor.execute(task);

				} catch (Exception e) {
					throw new ProviderException("Cannot open channel \"" + channel.getName() + "\"", e);
				}
			}
		};

		public void close() {
			isOpen = false;
			messageProducer.close();

			if (messageConsumer != null) {
				// messageConsumer.wakeup();
			}
		};

		private void send(String msg) {
			messageProducer.send(new ProducerRecord<String, String>(name, msg));
		}

		private String toTopic(Channel channel) {
			return toTopic(channel.getName());
		}

		private String toTopic(String channelName) {
			if (channelName == null)
				return null;
			return channelName.replaceAll("#", ".");
		}
	}

}
