package de.dfki.cos.basys.platform.runtime.component.packml;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.runtime.component.BaseComponent;

public class PackMLStatesHandlerFacade implements ActiveStatesHandler, WaitStatesHandler {

	PackMLComponent component;

	boolean notifyStateChanges = true;
	boolean recordStateChanges = false;

	private LinkedBlockingQueue<State> recentStates = new LinkedBlockingQueue<>();
	
	public PackMLStatesHandlerFacade(PackMLComponent component) {
		this.component = component;
		if (component.getConfig().getProperty("notifyStateChanges") != null) {
			notifyStateChanges = Boolean.parseBoolean(component.getConfig().getProperty("notifyStateChanges").getValue());
			component.LOGGER.info("notifyStateChanges=" + notifyStateChanges);
		}
		if (component.getConfig().getProperty("recordStateChanges") != null) {
			recordStateChanges = Boolean.parseBoolean(component.getConfig().getProperty("recordStateChanges").getValue());
			component.LOGGER.info("recordStateChanges=" + recordStateChanges);
		}
		
	}
	
	public LinkedBlockingQueue<State> getRecentStates() {
		return recentStates;
	}
	
	public State getLastState() {
		try {
			return recentStates.poll(20,TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return State.ABORTED;
	}

	/*
	 * default WaitStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onStopped() {		
		component.LOGGER.debug("onStopped - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onStopped();
		component.LOGGER.debug("onStopped - finished");
	}

	@Override
	public void onIdle() {
		component.LOGGER.debug("onIdle - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onIdle();
		component.LOGGER.debug("onIdle - finished");
	}

	@Override
	public void onComplete() {
		component.LOGGER.debug("onComplete - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onComplete();
		component.LOGGER.debug("onComplete - finished");
	}

	@Override
	public void onHeld() {
		component.LOGGER.debug("onHeld - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onHeld();
		component.LOGGER.debug("onHeld - finished");
	}

	@Override
	public void onSuspended() {
		component.LOGGER.debug("onSuspended - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onSuspended();
		component.LOGGER.debug("onSuspended - finished");
	}

	@Override
	public void onAborted() {
		component.LOGGER.debug("onAborted - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onAborted();
		component.LOGGER.debug("onAborted - finished");
	}

	/*
	 * default ActiveStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onResetting() {
		component.LOGGER.debug("onResetting - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onResetting();
		component.LOGGER.debug("onResetting - finished");
	}

	@Override
	public void onStarting() {
		component.LOGGER.debug("onStarting - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onStarting();
		component.LOGGER.debug("onStarting - finished");
	}

	@Override
	public void onExecute() {
		component.LOGGER.debug("onExecute - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onExecute();
		component.LOGGER.debug("onExecute - finished");
	}

	@Override
	public void onCompleting() {
		component.LOGGER.debug("onCompleting - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onCompleting();
		component.LOGGER.debug("onCompleting - finished");
	}

	@Override
	public void onHolding() {
		component.LOGGER.debug("onHolding - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onHolding();
		component.LOGGER.debug("onHolding - finished");
	}

	@Override
	public void onUnholding() {
		component.LOGGER.debug("onUnholding - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onUnholding();
		component.LOGGER.debug("onUnholding - finished");
	}

	@Override
	public void onSuspending() {
		component.LOGGER.debug("onSuspending - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onSuspending();
		component.LOGGER.debug("onSuspending - finished");
	}

	@Override
	public void onUnsuspending() {
		component.LOGGER.debug("onUnsuspending - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onUnsuspending();
		component.LOGGER.debug("onUnsuspending - finished");
	}

	@Override
	public void onAborting() {
		component.LOGGER.debug("onAborting - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onAborting();
		component.LOGGER.debug("onAborting - finished");
	}

	@Override
	public void onClearing() {
		component.LOGGER.debug("onClearing - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onClearing();
		component.LOGGER.debug("onClearing - finished");
	}

	@Override
	public void onStopping() {
		component.LOGGER.debug("onStopping - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onStopping();
		component.LOGGER.debug("onStopping - finished");
	}

}
