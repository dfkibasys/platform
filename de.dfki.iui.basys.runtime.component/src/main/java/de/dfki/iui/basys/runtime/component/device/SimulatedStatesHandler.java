package de.dfki.iui.basys.runtime.component.device;

import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.model.runtime.component.SimulationConfiguration;
import de.dfki.iui.basys.runtime.component.device.packml.ActiveStatesHandler;

public class SimulatedStatesHandler implements ActiveStatesHandler {

	private DeviceComponent component;
	private SimulationConfiguration config;
	
	public SimulatedStatesHandler(DeviceComponent component) {
		this.component = component;
		this.config = component.getConfig().getSimulationConfiguration();
	}

	@Override
	public void onResetting() {
		//recentStates.add(State.RESETTING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnResettingDuration());
	}

	@Override
	public void onStarting() {
		//recentStates.add(State.STARTING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnStartingDuration());
	}

	@Override
	public void onExecute() {
		//recentStates.add(State.EXECUTE);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnExecuteDuration());
	}

	@Override
	public void onCompleting() {
		//recentStates.add(State.COMPLETING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnCompletingDuration());
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
		component.sleep(config.getOnHoldingDuration());
	}

	@Override
	public void onUnholding() {
		//recentStates.add(State.UNHOLDING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnUnholdingDuration());
	}

	@Override
	public void onSuspending() {
		//recentStates.add(State.SUSPENDING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnSuspendingDuration());
	}

	@Override
	public void onUnsuspending() {
		//recentStates.add(State.UNSUSPENDING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnUnsuspendingDuration());
	}

	@Override
	public void onAborting() {
		//recentStates.add(State.ABORTING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnAbortingDuration());
	}

	@Override
	public void onClearing() {
		//recentStates.add(State.CLEARING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnClearingDuration());
	}

	@Override
	public void onStopping() {
		//recentStates.add(State.STOPPING);
		component.updateRegistrationAndNotify();
		component.sleep(config.getOnStoppingDuration());
		if (component.isCapabilityRequestPending())
			component.sendComponentResponse(ResponseStatus.NOT_OK, config.getOnStoppingStatusCode());
	}

}
