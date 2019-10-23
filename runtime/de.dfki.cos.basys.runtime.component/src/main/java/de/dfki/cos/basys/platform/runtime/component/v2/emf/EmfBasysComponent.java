package de.dfki.cos.basys.platform.runtime.component.v2.emf;

import java.util.Properties;
import java.util.function.Supplier;

import de.dfki.cos.basys.common.component.impl.ConnectionManagerImpl;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponent;

public class EmfBasysComponent extends BasysComponent {

	protected EmfClient client = null;
	
	public EmfBasysComponent(Properties config) {
		super(config);
		
		connectionManager = new ConnectionManagerImpl(config, new Supplier<EmfClient>() {
			@Override
			public EmfClient get() {
				EmfClient client = new EmfClient(config);
				return client;
			}
		});		
		this.client = connectionManager.getFunctionalClient(EmfClient.class);
	}

}
