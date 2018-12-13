package de.dfki.cos.basys.platform.runtime.component.device.mqtt;

import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.device.mqtt.MqttDeviceComponent;
import de.dfki.cos.basys.platform.runtime.component.device.packml.UnitConfiguration;

public class TestMqttDeviceComponent extends MqttDeviceComponent {

	public TestMqttDeviceComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

}
