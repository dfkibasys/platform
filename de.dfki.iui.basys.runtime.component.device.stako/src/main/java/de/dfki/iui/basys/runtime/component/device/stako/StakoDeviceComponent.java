package de.dfki.iui.basys.runtime.component.device.stako;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;

public abstract class StakoDeviceComponent extends DeviceComponent {

	public StakoDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void connectToExternal() throws ComponentException {

	}
	
	@Override
	public void disconnectFromExternal() {

	}
	
}
