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
		component.notifyAndUpdateRegistration();
		component.onStopped();
	}

	@Override
	public void onIdle() {
		component.notifyAndUpdateRegistration();
		component.onIdle();
	}

	@Override
	public void onComplete() {
		component.notifyAndUpdateRegistration();
		component.onComplete();
	}

	@Override
	public void onHeld() {
		component.notifyAndUpdateRegistration();
		component.onHeld();
	}

	@Override
	public void onSuspended() {
		component.notifyAndUpdateRegistration();
		component.onSuspended();
	}

	@Override
	public void onAborted() {
		component.notifyAndUpdateRegistration();
		component.onAborted();
	}

	/*
	 * default ActiveStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onResetting() {
		component.notifyAndUpdateRegistration();
		component.onResetting();
	}

	@Override
	public void onStarting() {
		component.notifyAndUpdateRegistration();
		component.onStarting();
	}

	@Override
	public void onExecute() {
		component.notifyAndUpdateRegistration();
		component.onExecute();
	}

	@Override
	public void onCompleting() {
		component.notifyAndUpdateRegistration();
		component.onCompleting();
	}

	@Override
	public void onHolding() {
		component.notifyAndUpdateRegistration();
		component.onHolding();
	}

	@Override
	public void onUnholding() {
		component.notifyAndUpdateRegistration();
		component.onUnholding();
	}

	@Override
	public void onSuspending() {
		component.notifyAndUpdateRegistration();
		component.onSuspending();
	}

	@Override
	public void onUnsuspending() {
		component.notifyAndUpdateRegistration();
		component.onUnsuspending();
	}

	@Override
	public void onAborting() {
		component.notifyAndUpdateRegistration();
		component.onAborting();
	}

	@Override
	public void onClearing() {
		component.notifyAndUpdateRegistration();
		component.onClearing();
	}

	@Override
	public void onStopping() {
		component.notifyAndUpdateRegistration();
		component.onStopping();
	}

}
