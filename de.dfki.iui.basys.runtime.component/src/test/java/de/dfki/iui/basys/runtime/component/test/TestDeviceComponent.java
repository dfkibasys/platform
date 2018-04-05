package de.dfki.iui.basys.runtime.component.test;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.DeviceComponente;
import de.dfki.iui.basys.runtime.component.ne.ComponentException;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;

public class TestDeviceComponent extends DeviceComponente {

	public TestDeviceComponent(String id) {
		super(id);
	}
	
	public TestDeviceComponent(ComponentConfiguration config) {
		super(config);
	}
	
	@Override
	public void connectToDevice() throws ComponentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnectFromDevice() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onResetting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStarting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExecute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCompleting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onHolding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUnholding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSuspending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUnsuspending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAborting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClearing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStopping() {
		// TODO Auto-generated method stub

	}

}
