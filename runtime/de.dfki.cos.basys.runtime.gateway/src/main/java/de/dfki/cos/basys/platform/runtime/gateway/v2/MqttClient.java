package de.dfki.cos.basys.platform.runtime.gateway.v2;

import java.util.Properties;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.FunctionalClient;
import de.dfki.cos.basys.platform.runtime.component.v2.StringConstants;

public class MqttClient implements FunctionalClient {

	public final Logger LOGGER;
	private String id = null;
	IMqttAsyncClient mqttClient = null;

	public MqttClient(Properties config) {
		this.id = config.getProperty(StringConstants.id);
		this.LOGGER = LoggerFactory.getLogger("basys.component." + id.replaceAll(" ", "-"));
	}
	
	@Override
	public boolean connect(ComponentContext context, String connectionString) {
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
			return true;
		} catch (MqttException e) {
			LOGGER.warn("MqttClient \"" + id + "\" cannot connect to \"" + connectionString + "\"", e);
			return false;
		}		
	}

	@Override
	public boolean disconnect() {
		try {					
			mqttClient.disconnect().waitForCompletion();
			return true;
		} catch (MqttException e) {
			LOGGER.warn("MqttClient \"" + id + "\"" + " cannot disconnect", e);
			return false;
		}
	}

	public IMqttAsyncClient getMqttClient() {
		return mqttClient;
	}




}
