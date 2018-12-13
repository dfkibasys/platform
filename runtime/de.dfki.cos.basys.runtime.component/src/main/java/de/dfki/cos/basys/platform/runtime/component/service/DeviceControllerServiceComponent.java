package de.dfki.cos.basys.platform.runtime.component.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.device.DeviceComponentController;

public class DeviceControllerServiceComponent extends ServiceComponent {

	protected DeviceComponentController device;
	
	public DeviceControllerServiceComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void connectToExternal() throws ComponentException {	
		String patternString = "basys.component:\\/\\/(?<componentId>.*)";

		Pattern pattern = Pattern.compile(patternString);

		Matcher matcher = pattern.matcher(componentConfig.getExternalConnectionString());
		boolean matches = matcher.matches();
		if (!matches) {
			throw new ComponentException("Invalid external connection string! " + componentConfig.getExternalConnectionString() + " does not match the expected pattern " + patternString);
		}

		String componentId = matcher.group("componentId");
		
		device = new DeviceComponentController(componentId, this);
		device.lazyConnect(context);
	}
	
	@Override
	public void disconnectFromExternal() {
		device.disconnect();
		device = null;
	}
	
}
