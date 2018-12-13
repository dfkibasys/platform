package de.dfki.cos.basys.platform.runtime.component.device.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.device.DeviceComponent;

public abstract class RestDeviceComponent extends DeviceComponent {

	protected Client client = ClientBuilder.newClient();
	protected WebTarget endpoint = null;
	

	public RestDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void connectToExternal() throws ComponentException {
		this.endpoint = client.target(getConfig().getExternalConnectionString());		
	}
	
	@Override
	public void disconnectFromExternal() {
		endpoint = null;
	}
	
}
