package de.dfki.cos.basys.platform.runtime.component.device;

import java.util.concurrent.TimeUnit;

import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration;
import de.dfki.cos.basys.platform.runtime.component.device.packml.ActiveStatesHandler;

public class SimulatedStatesHandler implements ActiveStatesHandler {

	private DeviceComponent component;
	private SimulationConfiguration config;
	private double speedFactor = 1.0;
	
	public SimulatedStatesHandler(DeviceComponent component) {
		this.component = component;
		this.config = component.getConfig().getSimulationConfiguration();
	}

	private void sleep(long millis) {
		try {
			long duration = (long) (speedFactor * millis);
			TimeUnit.MILLISECONDS.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onResetting() {
		//recentStates.add(State.RESETTING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnResettingDuration());
	}

	@Override
	public void onStarting() {
		//recentStates.add(State.STARTING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnStartingDuration());
	}

	@Override
	public void onExecute() {
		//recentStates.add(State.EXECUTE);
		component.updateRegistrationAndNotify();
		sleep(config.getOnExecuteDuration());
	}

	@Override
	public void onCompleting() {
		//recentStates.add(State.COMPLETING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnCompletingDuration());
		if (config.getOnCompletingVariables().size() > 0) {
			component.sendComponentResponse(ResponseStatus.OK, config.getOnCompletingStatusCode(), config.getOnCompletingVariables());					
		} else {
			component.sendComponentResponse(ResponseStatus.OK, config.getOnCompletingStatusCode());
		}
	}

	@Override
	public void onHolding() {
		//recentStates.add(State.HOLDING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnHoldingDuration());
	}

	@Override
	public void onUnholding() {
		//recentStates.add(State.UNHOLDING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnUnholdingDuration());
	}

	@Override
	public void onSuspending() {
		//recentStates.add(State.SUSPENDING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnSuspendingDuration());
	}

	@Override
	public void onUnsuspending() {
		//recentStates.add(State.UNSUSPENDING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnUnsuspendingDuration());
	}

	@Override
	public void onAborting() {
		//recentStates.add(State.ABORTING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnAbortingDuration());
	}

	@Override
	public void onClearing() {
		//recentStates.add(State.CLEARING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnClearingDuration());
	}

	@Override
	public void onStopping() {
		//recentStates.add(State.STOPPING);
		component.updateRegistrationAndNotify();
		sleep(config.getOnStoppingDuration());
		if (component.isCapabilityRequestPending())
			component.sendComponentResponse(ResponseStatus.NOT_OK, config.getOnStoppingStatusCode());
	}

}
