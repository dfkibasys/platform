package de.dfki.iui.basys.runtime.component.test;

import java.util.concurrent.TimeUnit;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.component.test.TestHandler.Path;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class TestDeviceComponent extends DeviceComponent {

	enum Path {NORMAL, SUSPEND, HOLD, STOP_ON_ERROR, STOP_ON_EMERGENCY}
	
	public Path path = Path.NORMAL;
	
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
