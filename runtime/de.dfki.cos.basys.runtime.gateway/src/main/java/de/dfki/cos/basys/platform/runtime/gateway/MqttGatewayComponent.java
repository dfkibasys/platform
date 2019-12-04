package de.dfki.cos.basys.platform.runtime.gateway;

import java.util.Properties;
import java.util.function.Supplier;

import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;

public class MqttGatewayComponent extends AbstractGatewayComponent {

	public MqttGatewayComponent(Properties config) {
		super(config);

		serviceManager = new ServiceManagerImpl(config, new Supplier<MqttGateway>() {
			@Override
			public MqttGateway get() {
				MqttGateway client = new MqttGateway(config);
				return client;
			}
		});
	}
}
