package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;
import java.util.function.Supplier;

import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.platform.runtime.component.BasysComponent;
import de.dfki.cos.basys.platform.runtime.services.EmfService;

public class EmfBasysComponent extends BasysComponent {

	protected EmfService service = null;
	
	public EmfBasysComponent(Properties config) {
		super(config);
		
		serviceManager = new ServiceManagerImpl<EmfService>(config, new Supplier<EmfServiceImpl>() {
			@Override
			public EmfServiceImpl get() {
				EmfServiceImpl client = new EmfServiceImpl(config);
				return client;
			}
		});		
		this.service = getService(EmfService.class);
	}

}
