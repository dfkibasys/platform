package de.dfki.cos.basys.platform.runtime.gateway.v2;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Supplier;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import de.dfki.cos.basys.common.component.impl.ConnectionManagerImpl;
import de.dfki.cos.basys.controlcomponent.client.ControlComponentClient;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ProviderException;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.Property;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.service.ServiceComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysControlComponent;
import de.dfki.cos.basys.platform.runtime.gateway.Gateway;

public class MqttGatewayComponent extends BasysComponent implements Gateway {

	private IMqttAsyncClient mqttClient = null;	

	protected Map<Channel, String> outgoing = new HashMap<>();
	protected Map<String, Channel> incoming = new HashMap<>();

	public MqttGatewayComponent(Properties config) {
		super(config);
		
		connectionManager = new ConnectionManagerImpl(config, new Supplier<MqttClient>() {
			@Override
			public MqttClient get() {
				MqttClient client = new MqttClient(config);
				return client;
			}
		});		
	}
	
	@Override
	protected void doActivate() throws de.dfki.cos.basys.common.component.ComponentException {		
		super.doActivate();
		
		mqttClient = connectionManager.getFunctionalClient(MqttClient.class).getMqttClient();
				
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
		});
		
		incoming.forEach((mc, channel) -> {					
			channel.close();
		});
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
