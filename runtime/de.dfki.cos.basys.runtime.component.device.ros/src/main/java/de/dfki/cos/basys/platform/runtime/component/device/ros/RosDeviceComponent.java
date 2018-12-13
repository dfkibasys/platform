package de.dfki.cos.basys.platform.runtime.component.device.ros;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.device.DeviceComponent;
import edu.wpi.rail.jrosbridge.JRosbridge.WebSocketType;
import edu.wpi.rail.jrosbridge.Ros;

public abstract class RosDeviceComponent extends DeviceComponent {

	protected Ros ros = null;	
	protected String protocol = "ws";
	protected String host = "localhost";
	protected int port = 9090;
	
	public RosDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void connectToExternal() throws ComponentException {
		String patternString = "(?<protocol>wss?):\\/\\/(?<host>.*):(?<port>\\d*)";

		Pattern pattern = Pattern.compile(patternString);

		Matcher matcher = pattern.matcher(componentConfig.getExternalConnectionString());
		boolean matches = matcher.matches();
		if (!matches) {
			throw new ComponentException("Invalid external connection string! " + componentConfig.getExternalConnectionString() + " does not match the expected pattern " + patternString);
		}
		protocol = matcher.group("protocol");
		host = matcher.group("host");
		port = Integer.parseInt(matcher.group("port"));
				
		//TODO: support also wss
		ros = new Ros(host, port, WebSocketType.valueOf(protocol));
		if (!ros.connect()) {
			throw new ComponentException( getName() + " cannot connect to \"" + componentConfig.getExternalConnectionString() + "\"");
		}
		
	}
	
	@Override
	public void disconnectFromExternal() {
		ros.disconnect();
	}
	
}
