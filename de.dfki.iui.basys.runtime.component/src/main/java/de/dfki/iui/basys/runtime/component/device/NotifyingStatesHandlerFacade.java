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
		component.LOGGER.info("onStopped - start");
		component.updateRegistrationAndNotify();
		component.onStopped();
		component.LOGGER.info("onStopped - finished");
	}

	@Override
	public void onIdle() {
		component.LOGGER.info("onIdle - start");
		component.updateRegistrationAndNotify();
		component.onIdle();
		component.LOGGER.info("onIdle - finished");
	}

	@Override
	public void onComplete() {
		component.LOGGER.info("onComplete - start");
		component.updateRegistrationAndNotify();
		component.onComplete();
		component.LOGGER.info("onComplete - finished");
	}

	@Override
	public void onHeld() {
		component.LOGGER.info("onHeld - start");
		component.updateRegistrationAndNotify();
		component.onHeld();
		component.LOGGER.info("onHeld - finished");
	}

	@Override
	public void onSuspended() {
		component.LOGGER.info("onSuspended - start");
		component.updateRegistrationAndNotify();
		component.onSuspended();
		component.LOGGER.info("onSuspended - finished");
	}

	@Override
	public void onAborted() {
		component.LOGGER.info("onAborted - start");
		component.updateRegistrationAndNotify();
		component.onAborted();
		component.LOGGER.info("onAborted - finished");
	}

	/*
	 * default ActiveStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onResetting() {
		component.LOGGER.info("onResetting - start");
		component.updateRegistrationAndNotify();
		component.onResetting();
		component.LOGGER.info("onResetting - finished");
	}

	@Override
	public void onStarting() {
		component.LOGGER.info("onStarting - start");
		component.updateRegistrationAndNotify();
		component.onStarting();
		component.LOGGER.info("onStarting - finished");
	}

	@Override
	public void onExecute() {
		component.LOGGER.info("onExecute - start");
		component.updateRegistrationAndNotify();
		component.onExecute();
		component.LOGGER.info("onExecute - finished");
	}

	@Override
	public void onCompleting() {
		component.LOGGER.info("onCompleting - start");
		component.updateRegistrationAndNotify();
		component.onCompleting();
		component.LOGGER.info("onCompleting - finished");
	}

	@Override
	public void onHolding() {
		component.LOGGER.info("onHolding - start");
		component.updateRegistrationAndNotify();
		component.onHolding();
		component.LOGGER.info("onHolding - finished");
	}

	@Override
	public void onUnholding() {
		component.LOGGER.info("onUnholding - start");
		component.updateRegistrationAndNotify();
		component.onUnholding();
		component.LOGGER.info("onUnholding - finished");
	}

	@Override
	public void onSuspending() {
		component.LOGGER.info("onSuspending - start");
		component.updateRegistrationAndNotify();
		component.onSuspending();
		component.LOGGER.info("onSuspending - finished");
	}

	@Override
	public void onUnsuspending() {
		component.LOGGER.info("onUnsuspending - start");
		component.updateRegistrationAndNotify();
		component.onUnsuspending();
		component.LOGGER.info("onUnsuspending - finished");
	}

	@Override
	public void onAborting() {
		component.LOGGER.info("onAborting - start");
		component.updateRegistrationAndNotify();
		component.onAborting();
		component.LOGGER.info("onAborting - finished");
	}

	@Override
	public void onClearing() {
		component.LOGGER.info("onClearing - start");
		component.updateRegistrationAndNotify();
		component.onClearing();
		component.LOGGER.info("onClearing - finished");
	}

	@Override
	public void onStopping() {
		component.LOGGER.info("onStopping - start");
		component.updateRegistrationAndNotify();
		component.onStopping();
		component.LOGGER.info("onStopping - finished");
	}

}
