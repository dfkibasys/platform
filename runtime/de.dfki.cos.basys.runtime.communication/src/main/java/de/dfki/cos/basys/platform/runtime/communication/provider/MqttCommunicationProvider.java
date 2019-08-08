package de.dfki.cos.basys.platform.runtime.communication.provider;

import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.communication.CommUtils;

public class MqttCommunicationProvider implements CommunicationProvider {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	public static String defaultConnectionString;
	IMqttAsyncClient mqttClient = null;
	
	static {
		try {
			String serverName = CommUtils.getPreferredBasysMiddleware();
			defaultConnectionString = String.format("tcp://%s:1883", serverName);			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
	private static String toTopic(Channel channel) {
		return toTopic(channel.getName());
	}

	private static String toTopic(String channelName) {
		if (channelName == null)
			return null;
		return channelName.replaceAll("#", "/");
	}

	@Override
	public void doConnect(ChannelPool pool) throws ProviderException {
		String poolId = pool.getId();
		LOGGER.info("doConnect ChannelPool: " + poolId);
		Authentication auth = pool.getClient().getAuthentication();

		MemoryPersistence persistence = new MemoryPersistence();
		final MqttConnectOptions options = new MqttConnectOptions();
		options.setCleanSession(true);

		if (pool.getUri() == null) {
			pool.setUri(defaultConnectionString);
			LOGGER.warn(String.format("ConnectionString not specified, using public default %s", pool.getUri()));
		}

		try {

			mqttClient = new MqttAsyncClient(pool.getUri(), poolId, persistence);
			mqttClient.connect(options, new IMqttActionListener() {
				@Override
				public void onSuccess(IMqttToken asyncActionToken) {
					LOGGER.info("ChannelPool connected: " + poolId);
				}

				@Override
				public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
					LOGGER.info("ChannelPool could not establish connection: " + poolId);

				}
			}).waitForCompletion();
		} catch (MqttException e) {
			throw new ProviderException("ChannelPool \"" + poolId + "\" cannot connect to \"" + pool.getUri() + "\"", e);
		}

	}

	@Override
	public void doDisconnect(ChannelPool pool) throws ProviderException {
		String poolId = pool.getId();
		LOGGER.info("doDisconnect ChannelPool: " + poolId);

		try {
			mqttClient.disconnect().waitForCompletion();
		} catch (MqttException e) {
			throw new ProviderException("ChannelPool \"" + poolId + "\"" + " cannot disconnect", e);
		}
	}

	@Override
	public void doOpenChannel(Channel channel) throws ProviderException {

		LOGGER.trace("doOpenChannel: " + channel.getName());

		if (channel.isQueued())
			throw new ProviderException("MQTT does not support queued channels");

		String topic = toTopic(channel);
		
		if (channel.getListener() != null) {
			try {
				mqttClient.subscribe(topic, 2, new IMqttMessageListener() {
					// TODO: unterscheiden handleNotification/Request
					@Override
					public void messageArrived(String topic, MqttMessage message) throws Exception {

						ObjectMapper objectMapper = new ObjectMapper();
						String mqttPayload = new String(message.getPayload(), StandardCharsets.UTF_8);
						try {

							MqttProtocolMessage mqttProtocolMessage = objectMapper.readValue(mqttPayload, MqttProtocolMessage.class);

							Message incomingMessage = JsonUtils.fromString(mqttProtocolMessage.getPayload(), Message.class);

							if (mqttProtocolMessage.getResponseTopic() != null) {
								Request req = (Request) incomingMessage;
								Response res = channel.getListener().handleRequest(channel, req);

								try {
									String payload = JsonUtils.toString(res);
									MqttProtocolMessage mqttMessage = new MqttProtocolMessage();
									mqttMessage.setPayload(payload);
									Channel responseChannel = CommFactory.getInstance().createChannel(mqttProtocolMessage.getResponseTopic(), false, null);
									doSendMqttProtocolMessage(responseChannel, mqttMessage);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							} else {
								if (incomingMessage instanceof Notification) {
									channel.getListener().handleNotification(channel, (Notification) incomingMessage);
								} else {
									channel.getListener().handleMessage(channel, incomingMessage.getPayload());
								}

							}
						} catch (IOException e) {
							channel.getListener().handleMessage(channel, mqttPayload);
						}
					}

				}).waitForCompletion();
			} catch (MqttException e) {
				throw new ProviderException("Cannot subscribe client to topic \"" + channel.getName() + "\"", e);
			}
		}

	}

	@Override
	public void doCloseChannel(Channel channel) throws ProviderException {

		LOGGER.info("doCloseChannel: " + channel.getName());

		String topic = toTopic(channel);

		if (channel.getListener() != null) {
			try {
				mqttClient.unsubscribe(topic).waitForCompletion();
			} catch (MqttException e) {
				throw new ProviderException("Cannot unsubscribe from topic \"" + channel.getName() + "\"", e);
			}
		}
	}

	@Override
	public void doSendMessage(Channel channel, String msg) throws ProviderException {

		LOGGER.info("doSendMessage: " + channel.getName());

		//Message message = ClientFactory.getInstance().createNotification(msg);

		//try {
			//String payload = JsonUtils.toString(message);
			// MqttProtocolMessage mqttMessage = new MqttProtocolMessage();
			// mqttMessage.setPayload(payload);
			doSendRawMessage(channel, msg);
		//} catch (IOException e1) {
		//	e1.printStackTrace();
		//}

	}

	@Override
	public void doSendNotification(Channel channel, Notification not) throws ProviderException {

		LOGGER.info("doSendNotification: " + channel.getName());
		try {
			String payload = JsonUtils.toString(not);
			MqttProtocolMessage mqttMessage = new MqttProtocolMessage();
			mqttMessage.setPayload(payload);
			doSendMqttProtocolMessage(channel, mqttMessage);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void doSendRequest(Channel channel, Request req, ResponseCallback cb) throws ProviderException {

		LOGGER.info("doSendRequest: " + channel.getName());
		try {
			String payload = JsonUtils.toString(req);
			String responseTopic = CommFactory.getInstance().createResponseTopic(req);
			MqttProtocolMessage message = new MqttProtocolMessage();
			message.setPayload(payload);
			message.setResponseTopic(responseTopic);
			String t = message.getResponseTopic();
			mqttClient.subscribe(t, 2, new IMqttMessageListener() {

				@Override
				public void messageArrived(String topic, MqttMessage message) throws Exception {

					ObjectMapper objectMapper = new ObjectMapper();
					String mqttPayload = new String(message.getPayload(), StandardCharsets.UTF_8);
					MqttProtocolMessage mqttProtocolMessage = objectMapper.readValue(mqttPayload, MqttProtocolMessage.class);

					Response response = JsonUtils.fromString(mqttProtocolMessage.getPayload(), Response.class);
					cb.handleResponse(response);
					mqttClient.unsubscribe(topic);
				}

			}).waitForCompletion();

			doSendMqttProtocolMessage(channel, message);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MqttException e) {
			throw new ProviderException("Cannot subscribe client to topic \"" + channel.getName() + "\"", e);
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

	private void doSendMqttProtocolMessage(Channel channel, MqttProtocolMessage msg) throws ProviderException {
		doSendRawMessage(channel, msg.toMqttPayload());
	}

	private void doSendRawMessage(Channel channel, String msg) throws ProviderException {
		MqttMessage message = new MqttMessage();
		message.setPayload(msg.getBytes(StandardCharsets.UTF_8));
		message.setQos(2);

		String topic = toTopic(channel);

		try {
			mqttClient.publish(topic, message).waitForCompletion();
		} catch (MqttException e) {
			throw new ProviderException("Cannot publish MQTT message with payload \"" + msg + "\" to topic \"" + topic + "\"", e);
		}
	}

	@Override
	public boolean supportQueuedChannels() {
		// TODO Auto-generated method stub
		return false;
	}

	class SyncResponseCallback implements ResponseCallback {

		public Response response;

		@Override
		public synchronized void handleResponse(Response res) {
			response = res;
			notifyAll();
		}

	}

	static class MqttProtocolMessage {

		private String payload;
		private String responseTopic;

		public MqttProtocolMessage() {
		}

		// public MqttProtocolMessage(String payload) {
		// this.payload = payload;
		// }
		//
		// public MqttProtocolMessage(String payload, String responseTopic) {
		// this.payload = payload;
		// this.responseTopic = responseTopic;
		// }

		public String getPayload() {
			return payload;
		}

		public void setPayload(String payload) {
			this.payload = payload;
		}

		public String getResponseTopic() {
			return responseTopic;
		}

		public void setResponseTopic(String responseTopic) {
			this.responseTopic = toTopic(responseTopic);
		}

		public String toMqttPayload() {
			String result = null;
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				result = objectMapper.writeValueAsString(this);

			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			return result;
		}
	}

}
