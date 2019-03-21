package de.dfki.cos.basys.platform.runtime.component.device.rest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.communication.CommUtils;
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

	@Override
	protected boolean canConnectToExternal() {
		try {
			URL url = new URL(getConfig().getExternalConnectionString());		
			return CommUtils.isServerListening(url.getHost(), url.getPort(), 2000);
		} catch (Exception e) {
			LOGGER.warn(e.getMessage());
		}
		return false;
	}
	
//	@Override
//	protected boolean canConnectToExternal() {
//		try {
//			URL siteURL = new URL(getConfig().getExternalConnectionString());
//			HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
//			connection.setRequestMethod("GET");
//			connection.setConnectTimeout(3000);
//			connection.connect();
// 
//			int code = connection.getResponseCode();
//			if (code == 200) {
//				return true;
//			}
//		} catch (Exception e) {
//			
//		}		
//		
//		return false;
//	}
	
}
