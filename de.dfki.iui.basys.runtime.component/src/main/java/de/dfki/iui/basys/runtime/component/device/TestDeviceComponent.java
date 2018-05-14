package de.dfki.iui.basys.runtime.component.device;

import java.util.concurrent.TimeUnit;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

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
		LOGGER.info("onResetting()");
		sleep(2);
	}

	@Override
	public void onStarting() {
		LOGGER.info("onStarting()");
		sleep(2);
	}

	@Override
	public void onExecute() {
		LOGGER.info("onExecute()");
		sleep(10);
	}

	@Override
	public void onCompleting() {
		LOGGER.info("onCompleting()");
		sleep(2);
	}

	@Override
	public void onHolding() {
		LOGGER.info("onHolding()");
		sleep(1);
	}

	@Override
	public void onUnholding() {
		LOGGER.info("onUnholding()");
		sleep(1);
	}

	@Override
	public void onSuspending() {
		LOGGER.info("onSuspending()");
		sleep(1);
	}

	@Override
	public void onUnsuspending() {
		LOGGER.info("onUnsuspending()");
		sleep(1);
	}

	@Override
	public void onAborting() {
		LOGGER.info("onAborting()");
		sleep(1);
	}

	@Override
	public void onClearing() {
		LOGGER.info("onClearing()");
		sleep(1);
	}

	@Override
	public void onStopping() {
		LOGGER.info("onStopping()");
		sleep(2);
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		return null;
	}


}
