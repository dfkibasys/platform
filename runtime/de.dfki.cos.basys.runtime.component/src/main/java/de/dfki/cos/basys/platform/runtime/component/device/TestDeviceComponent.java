package de.dfki.cos.basys.platform.runtime.component.device;

import java.util.concurrent.TimeUnit;

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

	@Override
	public void onExecute() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
