package de.dfki.cos.basys.platform.runtime.component.device;

import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.packml.UnitConfiguration;

public class TestDeviceComponent extends DeviceComponent {

	public TestDeviceComponent(ComponentConfiguration config) {
		super(config);
	}
	
	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		return null;
	}


}
