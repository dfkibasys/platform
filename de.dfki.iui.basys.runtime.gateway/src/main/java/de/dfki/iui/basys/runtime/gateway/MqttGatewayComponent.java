package de.dfki.iui.basys.runtime.gateway;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;

public class MqttGatewayComponent extends ServiceComponent implements Gateway {

	IMqttAsyncClient mqttClient = null;
	

	protected Map<Channel, String> outgoing = new HashMap<>();
	protected Map<String, Channel> incoming = new HashMap<>();

	public MqttGatewayComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();

		MemoryPersistence persistence = new MemoryPersistence();
		final MqttConnectOptions options = new MqttConnectOptions();
		options.setCleanSession(true);

		try {

			mqttClient = new MqttAsyncClient(componentConfig.getExternalConnectionString(), getId(), persistence);
			mqttClient.connect(options, new IMqttActionListener() {
				@Override
				public void onSuccess(IMqttToken asyncActionToken) {
					LOGGER.info("MqttGatewayComponent connected: " + getId());
				}

				@Override
				public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
					LOGGER.info("MqttGatewayComponent could not establish connection: " + getId());

				}
			}).waitForCompletion();
		} catch (MqttException e) {
			throw new ComponentException("MqttGatewayComponent \"" + getId() + "\" cannot connect to \"" + componentConfig.getExternalConnectionString() + "\"", e);
		}
	}

	@Override
	public void disconnectFromExternal() {
		super.disconnectFromExternal();
		
		try {
			
			outgoing.forEach((channel, mp) -> {
				channel.close();				
			});
			
			incoming.forEach((mc, channel) -> {					
				channel.close();
			});
			
			
			mqttClient.disconnect().waitForCompletion();
		} catch (MqttException e) {
			LOGGER.warn("MqttGatewayComponent \"" + getId() + "\"" + " cannot disconnect", e);
		}
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
				try {
					
					String msg = JsonUtils.toString(not);
					
					MqttMessage message = new MqttMessage();
					message.setPayload(msg.getBytes(StandardCharsets.UTF_8));
					message.setQos(2);
				
					try {
						mqttClient.publish(externalChannelName, message).waitForCompletion();
					} catch (MqttException e) {
						throw new ProviderException("Cannot publish MQTT message with payload \"" + msg + "\" to topic \"" + externalChannelName + "\"", e);
					}
					
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
					internalChannel.sendMessage(mqttPayload);
					
				}

			}).waitForCompletion();
			incoming.put(externalChannelName,internalChannel);
		} catch (MqttException e) {
			throw new ProviderException("Cannot subscribe MqttGateway to topic \"" + externalChannelName + "\"", e);
		}
		
	}

}
