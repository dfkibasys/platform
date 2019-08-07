package de.dfki.cos.basys.platform.runtime.communication.provider;

import java.net.UnknownHostException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Topic;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;


import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

public class KafkaCommunicationProvider implements CommunicationProvider {
	protected final Logger LOGGER = LoggerFactory.getLogger(KafkaCommunicationProvider.class.getName());
	public static String defaultConnectionString;
	private final AtomicBoolean closed = new AtomicBoolean(false);

	private KafkaProducer<String, String> replyProducer;// I can map them or create a list of them
	private KafkaConsumer<String, String> replyConsumer;
	private Map<String, KafkaDestination> destinations = new ConcurrentHashMap<String, KafkaDestination>();

	
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
	//in JMS we set a message listener as well. That listener checks for a message and if found it handles and gives a response.
	//In kafka version only producer and consumer is created. just like session.consumer / session.producer
	@Override
	public void doConnect(ChannelPool pool) throws ProviderException {
		String poolId = pool.getId();
		LOGGER.info("doConnect ChannelPool: " + poolId);
		Authentication auth = pool.getClient().getAuthentication();// UNSURE?

		if (pool.getUri() == null) {
			pool.setUri(defaultConnectionString);
			LOGGER.warn(String.format("ConnectionString not specified, using VM internal default %s", pool.getUri()));
		}
		try {
			replyProducer = createProducer(poolId); 
			replyConsumer = createConsumer(poolId);
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

		try {
			replyProducer.close();
			replyConsumer.close();
		} catch (Exception e) {
			throw new ProviderException("ChannelPool \"" + poolId + "\"" + " cannot disconnect", e);
		}

	}
	//shut down the consumer thread in doOpenChannel
	public void shutdown(KafkaConsumer<String,String> shut_consumer) {
        closed.set(true);
        shut_consumer.wakeup();
    }
	
	@Override
	public void doOpenChannel(Channel channel) throws ProviderException {
		// TODO Auto-generated method stub
		LOGGER.trace("doOpenChannel: " + channel.getName());

		KafkaDestination internalDestination = this.destinations.get(channel.getId());
		if (internalDestination == null) {
			internalDestination = new KafkaDestination(getKafkaChannelName(channel));
			this.destinations.put(channel.getId(), internalDestination);
		}
		if (internalDestination.getMessageConsumer() != null) {
			return;
		}
//		messageConsumer.subscribe(Arrays.asList(channel.getName()));
//		internalDestination.setMessageConsumer(messageConsumer);
//		internalDestination.setMessageProducer(messageProducer);
		String topic = internalDestination.getName();
		//TODO TOPIC NAME CONTROL
		KafkaConsumer<String,String> consumer = createConsumer(topic); //here topic used as clientId
		KafkaProducer<String,String> producer = createProducer(topic); // also here as clientId
		
		
		
		//First consumer subscribes the topic and the consumer is given to internal destination
		try {
			consumer.subscribe(Arrays.asList(topic));
			internalDestination.setMessageConsumer(consumer);
			//messageProducer is set
			internalDestination.setMessageProducer(producer);
			if (channel.getListener() == null) {
				return;
			}
			
			Runnable task = new Runnable() {
				@Override
				public void run() { // denklestir alttaki run
					try {
						//while thread is not closed poll
						//if poll returns nonempty results then for each record get the message and create a comm package message
						//if key is not null then it means that it's a request.
						//if its a request based on chanel's listener handle the request
						
						//if key is null then check if incoming message is an instanceOfNotification or a message
						
						
						while (!closed.get()) {

							ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
							if (!records.isEmpty()) {
								for (ConsumerRecord<String, String> record : records) {
									String message = (String)record.value();
				                	 de.dfki.cos.basys.platform.model.runtime.communication.Message incomingMessage = 
												JsonUtils.fromString(message, de.dfki.cos.basys.platform.model.runtime.communication.Message.class);
									//if record's key is null that means it's a request
									if(record.key() != null) {
					                	 
					                	 Request req = (Request) incomingMessage;
					                     Response res = channel.getListener().handleRequest(channel, req);
					                     String payload = JsonUtils.toString(res);
					                     producer.send(new ProducerRecord<String, String>(channel.getName(),payload, payload)); //TODO is this also a request? if so we need to give key
									}
									else {
										if (incomingMessage instanceof Notification) {
											channel.getListener().handleNotification(channel, (Notification) incomingMessage);
										} else {
											channel.getListener().handleMessage(channel, incomingMessage.getPayload());
										}
									}
									System.err.print("----------Thread Channel");

									System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(),
											record.value()); //TODO Delete this once done

								}
							}
							else {
								System.err.print("----------Thread Err");

							}
						}
					} catch (Exception e) { // TODO KafkaException include olsun -> jms
						//consumer.close();
					} 
				}
			};
			executor.execute(task);

		}catch(Exception e){
			throw new ProviderException("Cannot open channel \"" + channel.getName() + "\"", e);
		}finally {
			shutdown(consumer);
			//consumer.close();
		}

	}

	@Override
	public void doCloseChannel(Channel channel) throws ProviderException {
		KafkaDestination internal_destination = this.destinations.get(channel.getId());
		System.err.print("----------Close Channel");

		if (internal_destination.getMessageConsumer() != null) {
			try {
				shutdown(internal_destination.getMessageConsumer());
				//internal_destination.getMessageConsumer().close();
			} catch (Exception e) {//TODO Kafkaexception
				throw new ProviderException("Cannot close channel " + channel.getId() + " (" + channel.getName() + ")", e);
			}
		}

		this.destinations.remove(channel.getId());
		// TODO Auto-generated method stub

	}
	
	
	//TODO Topic name doopenchannel ile sendmessage uyusmuyor
	@Override
	public void doSendMessage(Channel channel, String msg) throws ProviderException {
		LOGGER.trace("doSendMessage: " + channel.getName());
		
		KafkaDestination internal_destination = this.destinations.get(channel.getId());

		try {
			// String payloadString = JsonUtils.toString(payload);

			// if (internal_destination.getMessageProducer() == null) {
			// Topic jmsTopic = session.createTopic(channel.getName());
			// MessageProducer jmsProducer = session.createProducer(jmsTopic);
			// internal_destination.setMessageProducer(jmsProducer);
			// }
			internal_destination.getMessageProducer().send(new ProducerRecord<String, String>(channel.getName(), msg));

		} catch (Exception e) {
			throw new ProviderException("Message could not be published on " + channel.getName() + ".", e);
			// } catch (IOException e) {
			// e.printStackTrace();
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
		// TODO Auto-generated method stub

	}

	@Override
	public boolean supportQueuedChannels() {
		// TODO Auto-generated method stub
		return false;
	}

	private static KafkaProducer<String, String> createProducer(String clientId) throws ProviderException {
		Properties props = new Properties();
		props.put("bootstrap.servers", defaultConnectionString);
		props.put("acks", "all");
		props.put("client.id", clientId + Math.random());
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		return new KafkaProducer<>(props);
	}

	private static KafkaConsumer<String, String> createConsumer(String clientId) throws ProviderException {
		Properties props = new Properties();
		props.setProperty("bootstrap.servers", defaultConnectionString);
		props.setProperty("group.id", clientId + Math.random()); // UNSURE FOR NOW
		props.setProperty("enable.auto.commit", "false");
		props.setProperty("auto.commit.interval.ms", "1000");
		props.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		props.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		return new KafkaConsumer<>(props);
	}

	class KafkaDestination {

		private KafkaConsumer<String, String> messageConsumer;
		private KafkaProducer<String, String> messageProducer;

		private String name;

	

		public KafkaDestination(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
		public void setMessageConsumer(KafkaConsumer<String, String> messageConsumer) {
			this.messageConsumer = messageConsumer;
		}

		public KafkaConsumer<String, String> getMessageConsumer() {
			return messageConsumer;
		}

		public void setMessageProducer(KafkaProducer<String, String> messageProducer) {
			this.messageProducer = messageProducer;
		}

		public KafkaProducer<String, String> getMessageProducer() {
			return messageProducer;
		}

	}
	private String getKafkaChannelName(Channel channel) {
		return channel.getName().replaceAll("#", ".");
	}

}
