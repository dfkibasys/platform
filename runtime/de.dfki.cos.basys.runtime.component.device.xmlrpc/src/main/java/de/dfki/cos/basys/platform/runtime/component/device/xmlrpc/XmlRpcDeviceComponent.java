package de.dfki.cos.basys.platform.runtime.component.device.xmlrpc;

import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.communication.CommUtils;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.device.DeviceComponent;


public abstract class XmlRpcDeviceComponent extends DeviceComponent {

	protected XmlRpcClient client;
	
	public XmlRpcDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void connectToExternal() throws ComponentException {
		client = new XmlRpcClient();
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        try {
            config.setServerURL(new URL(getConfig().getExternalConnectionString()));
            client.setConfig(config);
        } catch (MalformedURLException ex) {
           LOGGER.error("Exception occurred: {}", ex.toString());
        }		
	}

//	@Override
//	public void disconnectFromExternal() {
//	}
	
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
	

}
