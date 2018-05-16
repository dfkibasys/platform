package de.dfki.iui.basys.runtime.component.device.mqtt;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class SwitchDeviceComponent extends MqttDeviceComponent {

	public SwitchDeviceComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);
				
		// subscribe to channels
		
	}

	
	@Override
	public void onResetting() {
	}
	
	@Override
	public void onStarting() {
	}
	
	@Override
	public void onExecute() {
	}
	
	@Override
	public void onCompleting() {;
	}
	
	@Override
	public void onStopping() {
	}
}
