package de.dfki.cos.basys.platform.runtime.gateway.v2;

import java.util.Properties;
import java.util.function.Supplier;

import de.dfki.cos.basys.common.component.impl.ConnectionManagerImpl;

public class JmsGatewayComponent extends AbstractGatewayComponent {

	public JmsGatewayComponent(Properties config) {
		super(config);

		connectionManager = new ConnectionManagerImpl(config, new Supplier<JmsGateway>() {
			@Override
			public JmsGateway get() {
				JmsGateway gateway = new JmsGateway(config);
				return gateway;
			}
		});
	}

}
