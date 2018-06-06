package de.dfki.iui.basys.runtime.component.device.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;

public abstract class MqttDeviceComponent extends DeviceComponent {

	protected IMqttAsyncClient mqttClient = null;

	public MqttDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void connectToExternal() throws ComponentException {			
		MemoryPersistence persistence = new MemoryPersistence();
		final MqttConnectOptions options = new MqttConnectOptions();
		options.setCleanSession(true);

		try {

			mqttClient = new MqttAsyncClient(componentConfig.getExternalConnectionString(), getId(), persistence);
			mqttClient.connect(options, new IMqttActionListener() {
				@Override
				public void onSuccess(IMqttToken asyncActionToken) {
					LOGGER.info( getName() + " connected to " + componentConfig.getExternalConnectionString());
				}

				@Override
				public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
					LOGGER.info( getName() + " could not establish connection to " + componentConfig.getExternalConnectionString());

				}
			}).waitForCompletion();
		} catch (MqttException e) {
			throw new ComponentException( getName() + "\" cannot connect to \"" + componentConfig.getExternalConnectionString() + "\"", e);
		}

	}

	@Override
	public void disconnectFromExternal() {
		try {
			mqttClient.disconnect().waitForCompletion();
		} catch (MqttException e) {
			LOGGER.warn("MqttGatewayComponent \"" + getId() + "\"" + " cannot disconnect", e);
		}
	}


}
