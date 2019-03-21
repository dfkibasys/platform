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
			component.LOGGER.info("component is under unit test");
		}
		if (component.getConfig().getProperty("recordStateChanges") != null) {
			recordStateChanges = Boolean.parseBoolean(component.getConfig().getProperty("recordStateChanges").getValue());
			component.LOGGER.info("component is under unit test");
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
		component.LOGGER.info("onStopped - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onStopped();
		component.LOGGER.info("onStopped - finished");
	}

	@Override
	public void onIdle() {
		component.LOGGER.info("onIdle - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onIdle();
		component.LOGGER.info("onIdle - finished");
	}

	@Override
	public void onComplete() {
		component.LOGGER.info("onComplete - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onComplete();
		component.LOGGER.info("onComplete - finished");
	}

	@Override
	public void onHeld() {
		component.LOGGER.info("onHeld - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onHeld();
		component.LOGGER.info("onHeld - finished");
	}

	@Override
	public void onSuspended() {
		component.LOGGER.info("onSuspended - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onSuspended();
		component.LOGGER.info("onSuspended - finished");
	}

	@Override
	public void onAborted() {
		component.LOGGER.info("onAborted - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onAborted();
		component.LOGGER.info("onAborted - finished");
	}

	/*
	 * default ActiveStatesHandler implementation -> notify Basys Middleware
	 */

	@Override
	public void onResetting() {
		component.LOGGER.info("onResetting - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onResetting();
		component.LOGGER.info("onResetting - finished");
	}

	@Override
	public void onStarting() {
		component.LOGGER.info("onStarting - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onStarting();
		component.LOGGER.info("onStarting - finished");
	}

	@Override
	public void onExecute() {
		component.LOGGER.info("onExecute - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onExecute();
		component.LOGGER.info("onExecute - finished");
	}

	@Override
	public void onCompleting() {
		component.LOGGER.info("onCompleting - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onCompleting();
		component.LOGGER.info("onCompleting - finished");
	}

	@Override
	public void onHolding() {
		component.LOGGER.info("onHolding - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onHolding();
		component.LOGGER.info("onHolding - finished");
	}

	@Override
	public void onUnholding() {
		component.LOGGER.info("onUnholding - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onUnholding();
		component.LOGGER.info("onUnholding - finished");
	}

	@Override
	public void onSuspending() {
		component.LOGGER.info("onSuspending - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onSuspending();
		component.LOGGER.info("onSuspending - finished");
	}

	@Override
	public void onUnsuspending() {
		component.LOGGER.info("onUnsuspending - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onUnsuspending();
		component.LOGGER.info("onUnsuspending - finished");
	}

	@Override
	public void onAborting() {
		component.LOGGER.info("onAborting - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onAborting();
		component.LOGGER.info("onAborting - finished");
	}

	@Override
	public void onClearing() {
		component.LOGGER.info("onClearing - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onClearing();
		component.LOGGER.info("onClearing - finished");
	}

	@Override
	public void onStopping() {
		component.LOGGER.info("onStopping - start");
		if (notifyStateChanges)
			component.updateRegistrationAndNotify();
		if (recordStateChanges)
			recentStates.add(component.getState());
		component.onStopping();
		component.LOGGER.info("onStopping - finished");
	}

}
