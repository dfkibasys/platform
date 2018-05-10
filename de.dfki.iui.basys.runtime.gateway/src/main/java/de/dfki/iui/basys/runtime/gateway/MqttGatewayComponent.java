package de.dfki.iui.basys.runtime.gateway;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;

public class MqttGatewayComponent extends ServiceComponent implements Gateway {

	IMqttAsyncClient mqttClient = null;

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
			mqttClient.disconnect().waitForCompletion();
		} catch (MqttException e) {
			LOGGER.warn("MqttGatewayComponent \"" + getId() + "\"" + " cannot disconnect", e);
		}
	}

	@Override
	public void installOutgoingChannel(String internalChannelName, String externalChannelName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void installIncomingChannel(String externalChannelName, String internalChannelName) {
		// TODO Auto-generated method stub

	}

}
