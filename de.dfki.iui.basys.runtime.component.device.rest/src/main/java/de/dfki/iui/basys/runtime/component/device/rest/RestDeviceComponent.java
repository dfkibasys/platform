package de.dfki.iui.basys.runtime.component.device.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;

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
