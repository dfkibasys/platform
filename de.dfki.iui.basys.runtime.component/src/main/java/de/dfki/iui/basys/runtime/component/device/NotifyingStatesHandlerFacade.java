package de.dfki.iui.basys.runtime.component.device;

import de.dfki.iui.basys.runtime.component.device.packml.ActiveStatesHandler;
import de.dfki.iui.basys.runtime.component.device.packml.WaitStatesHandler;

public class NotifyingStatesHandlerFacade implements ActiveStatesHandler, WaitStatesHandler {

	DeviceComponent component;

	public NotifyingStatesHandlerFacade(DeviceComponent component) {
		this.component = component;
	}

	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onStopped() {
		component.updateRegistrationAndNotify();
		component.onStopped();
	}

	@Override
	public void onIdle() {
		component.updateRegistrationAndNotify();
		component.onIdle();
	}

	@Override
	public void onComplete() {
		component.updateRegistrationAndNotify();
		component.onComplete();
	}

	@Override
	public void onHeld() {
		component.updateRegistrationAndNotify();
		component.onHeld();
	}

	@Override
	public void onSuspended() {
		component.updateRegistrationAndNotify();
		component.onSuspended();
	}

	@Override
	public void onAborted() {
		component.updateRegistrationAndNotify();
		component.onAborted();
	}

	/*
	 * default ActiveStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onResetting() {
		component.updateRegistrationAndNotify();
		component.onResetting();
	}

	@Override
	public void onStarting() {
		component.updateRegistrationAndNotify();
		component.onStarting();
	}

	@Override
	public void onExecute() {
		component.updateRegistrationAndNotify();
		component.onExecute();
	}

	@Override
	public void onCompleting() {
		component.updateRegistrationAndNotify();
		component.onCompleting();
	}

	@Override
	public void onHolding() {
		component.updateRegistrationAndNotify();
		component.onHolding();
	}

	@Override
	public void onUnholding() {
		component.updateRegistrationAndNotify();
		component.onUnholding();
	}

	@Override
	public void onSuspending() {
		component.updateRegistrationAndNotify();
		component.onSuspending();
	}

	@Override
	public void onUnsuspending() {
		component.updateRegistrationAndNotify();
		component.onUnsuspending();
	}

	@Override
	public void onAborting() {
		component.updateRegistrationAndNotify();
		component.onAborting();
	}

	@Override
	public void onClearing() {
		component.updateRegistrationAndNotify();
		component.onClearing();
	}

	@Override
	public void onStopping() {
		component.updateRegistrationAndNotify();
		component.onStopping();
	}

}
