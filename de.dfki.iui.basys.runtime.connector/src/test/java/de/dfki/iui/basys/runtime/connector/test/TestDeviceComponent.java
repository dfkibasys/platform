package de.dfki.iui.basys.runtime.connector.test;

import java.util.concurrent.TimeUnit;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;

public class TestDeviceComponent extends DeviceComponent {

	public TestDeviceComponent(ComponentConfiguration config) {
		super(config);
	}
	
	protected void sleep(long seconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onResetting() {
		sleep(1);
	}

	@Override
	public void onStarting() {
		sleep(1);
	}

	@Override
	public void onExecute() {
		sleep(2);
	}

	@Override
	public void onCompleting() {
		sleep(1);
	}

	@Override
	public void onHolding() {
		sleep(1);
	}

	@Override
	public void onUnholding() {
		sleep(1);
	}

	@Override
	public void onSuspending() {
		sleep(1);
	}

	@Override
	public void onUnsuspending() {
		sleep(1);
	}

	@Override
	public void onAborting() {
		sleep(1);
	}

	@Override
	public void onClearing() {
		sleep(1);
	}

	@Override
	public void onStopping() {
		sleep(1);
	}

}
