package de.dfki.iui.basys.runtime.component.device;

import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.device.packml.ActiveStatesHandler;

public class SimulatedStatesHandler implements ActiveStatesHandler {

	private DeviceComponent component;
	
	public SimulatedStatesHandler(DeviceComponent component) {
		this.component = component;
	}

	@Override
	public void onResetting() {
		//recentStates.add(State.RESETTING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
	}

	@Override
	public void onStarting() {
		//recentStates.add(State.STARTING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
	}

	@Override
	public void onExecute() {
		//recentStates.add(State.EXECUTE);
		component.updateRegistrationAndNotify();
		component.sleep(3);
	}

	@Override
	public void onCompleting() {
		//recentStates.add(State.COMPLETING);
		component.updateRegistrationAndNotify();
		component.sleep(1);

		component.sendComponentResponse(ResponseStatus.OK, 0);
	}

	@Override
	public void onHolding() {
		//recentStates.add(State.HOLDING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
	}

	@Override
	public void onUnholding() {
		//recentStates.add(State.UNHOLDING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
	}

	@Override
	public void onSuspending() {
		//recentStates.add(State.SUSPENDING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
	}

	@Override
	public void onUnsuspending() {
		//recentStates.add(State.UNSUSPENDING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
	}

	@Override
	public void onAborting() {
		//recentStates.add(State.ABORTING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
	}

	@Override
	public void onClearing() {
		//recentStates.add(State.CLEARING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
	}

	@Override
	public void onStopping() {
		//recentStates.add(State.STOPPING);
		component.updateRegistrationAndNotify();
		component.sleep(1);
		if (component.isCapabilityRequestPending())
			component.sendComponentResponse(ResponseStatus.NOT_OK, 0);
	}

}
