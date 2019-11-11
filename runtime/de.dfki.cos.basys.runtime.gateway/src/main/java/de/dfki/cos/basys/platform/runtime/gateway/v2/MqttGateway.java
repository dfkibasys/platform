package de.dfki.cos.basys.platform.runtime.gateway.v2;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

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

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceConnection;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ProviderException;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponentContext;
import de.dfki.cos.basys.platform.runtime.component.v2.StringConstants;
import de.dfki.cos.basys.platform.runtime.gateway.Gateway;

public class MqttGateway implements ServiceConnection, Gateway {

	public final Logger LOGGER;
	private String id = null;
	IMqttAsyncClient mqttClient = null;

	BasysComponentContext context;
	CommFactory cf = CommFactory.getInstance();
	
	protected Map<Channel, String> outgoing = new HashMap<>();
	protected Map<String, Channel> incoming = new HashMap<>();

	
	public MqttGateway(Properties config) {
		this.id = config.getProperty(StringConstants.id);
		this.LOGGER = LoggerFactory.getLogger("basys.component." + id.replaceAll(" ", "-"));
	}
	
	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		this.context = (BasysComponentContext) context;
		
		MemoryPersistence persistence = new MemoryPersistence();
		final MqttConnectOptions options = new MqttConnectOptions();
		options.setCleanSession(true);

		try {

			mqttClient = new MqttAsyncClient(connectionString, id, persistence);
			mqttClient.connect(options, new IMqttActionListener() {
				@Override
				public void onSuccess(IMqttToken asyncActionToken) {
					LOGGER.info("MqttClient connected: " + id);
				}

				@Override
				public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
					LOGGER.info("MqttClient could not establish connection: " + id);

				}
			}).waitForCompletion();
			return mqttClient.isConnected();
		} catch (MqttException e) {
			LOGGER.warn("MqttClient \"" + id + "\" cannot connect to \"" + connectionString + "\"", e);
			return false;
		}		
	}

	@Override
	public void disconnect() {
		try {			
			outgoing.forEach((channel, mp) -> {
				channel.close();				
			});
			
			incoming.forEach((mc, channel) -> {					
				channel.close();
			});
			
			mqttClient.disconnect().waitForCompletion();
		} catch (MqttException e) {
			LOGGER.warn("MqttClient \"" + id + "\"" + " cannot disconnect", e);
		}
	}

	@Override
	public boolean isConnected() {		
		return (mqttClient != null) ? mqttClient.isConnected() : false;
	}
	
	@Override
	public void installOutgoingChannel(String internalChannelName, String externalChannelName) {
		Channel internalChannel = cf.openChannel(context.getSharedChannelPool(), internalChannelName, false, new ChannelListener() {

			@Override
			public Response handleRequest(Channel channel, Request req) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void handleNotification(Channel channel, Notification not) {
//				try {
					
					//String msg = JsonUtils.toString(not);
					
					MqttMessage message = new MqttMessage();
					message.setPayload(not.getPayload().getBytes(StandardCharsets.UTF_8));
					message.setQos(2);
				
					try {
						mqttClient.publish(externalChannelName, message).waitForCompletion();
					} catch (MqttException e) {
						throw new ProviderException("Cannot publish MQTT message with payload \"" + not.getPayload() + "\" to topic \"" + externalChannelName + "\"", e);
					}
					
//				} catch (JsonProcessingException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}

			@Override
			public void handleMessage(Channel channel, String msg) {
				MqttMessage message = new MqttMessage();
				message.setPayload(msg.getBytes(StandardCharsets.UTF_8));
				message.setQos(2);
			
				try {
					mqttClient.publish(externalChannelName, message).waitForCompletion();
				} catch (MqttException e) {
					throw new ProviderException("Cannot publish MQTT message with payload \"" + msg + "\" to topic \"" + externalChannelName + "\"", e);
				}
			}
		});
		outgoing.put(internalChannel, externalChannelName);
	}

	@Override
	public void installIncomingChannel(String externalChannelName, String internalChannelName) {

		Channel internalChannel = cf.openChannel(context.getSharedChannelPool(), internalChannelName, false, null);
		
		try {
			mqttClient.subscribe(externalChannelName, 2, new IMqttMessageListener() {
				// TODO: unterscheiden handleNotification/Request
				@Override
				public void messageArrived(String topic, MqttMessage message) throws Exception {

					String mqttPayload = new String(message.getPayload(), StandardCharsets.UTF_8);
					
					Notification not = CommFactory.getInstance().createNotification(mqttPayload);
					internalChannel.sendNotification(not);
					
				}

			}).waitForCompletion();
			incoming.put(externalChannelName,internalChannel);
		} catch (MqttException e) {
			throw new ProviderException("Cannot subscribe MqttGateway to topic \"" + externalChannelName + "\"", e);
		}
		
	}


}
