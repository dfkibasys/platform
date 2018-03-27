package de.dfki.iui.basys.runtime.component.packml;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackMLUnit implements StatusInterface, CommandInterface, ActiveStatesHandler, WaitStatesHandler {

	protected final Logger LOGGER = LoggerFactory.getLogger(PackMLUnit.class.getName());
	
	private String id;

	private boolean initialized = false;

	private PackML packml = null;

	private Mode mode = Mode.PRODUCTION;	
	
	private UnitConfiguration config;	

	private ActiveStatesHandler actHandler = null;
	private WaitStatesHandler waitHandler = null;
	
	public PackMLUnit(String id) {
		this.id = id;
		packml = new PackML(this);
	}
	
	public void initialize() {
		packml.initialize();
	}

	public void dispose() {
		packml.dispose();
	}
	
	public void setActiveStatesHandler(ActiveStatesHandler actHandler) {
		this.actHandler = actHandler;
	}
	
	public void setWaitStatesHandler(WaitStatesHandler waitHandler) {
		this.waitHandler = waitHandler;
	}
	
	/*
	 * StatusInterface
	 */

	@Override
	public String getId() {
		return id;
	}

	@Override
	public State getState() {
		return packml.getState();
	}

	@Override
	public Mode getMode() {
		return mode;
	}

	@Override
	public UnitConfiguration getConfig() {
		return config;
	}

	/*
	 * CommandInterface
	 */

	public void setMode(Mode mode) throws PackMLException {
		State state = getState();
		if (mode == Mode.MANUAL && state == State.ABORTED) {
			this.mode = mode;
		} else if (state == State.STOPPED) {
			this.mode = mode;
		} else {
			// illegal state
			LOGGER.error(String.format("Cannot change to mode %s in state %s", mode, state));
			throw new PackMLException(String.format("Cannot change to mode %s in state %s", mode, state));
		}
	}

	@Override
	public synchronized void setConfig(UnitConfiguration config) throws PackMLException {
		if (getState() == State.IDLE) {
			this.config = config;
		} else {
			// illegal state
			LOGGER.error(String.format("Cannot set config in state %s", getState()));
			throw new PackMLException(String.format("Cannot set config in state %s", getState()));
		}	
	}

	@Override
	public synchronized void reset() {
		LOGGER.info("reset");
		packml.raiseLifecycleEvent("reset");
	}

	@Override
	public synchronized void start() {
		LOGGER.info("start");
		packml.raiseLifecycleEvent("start");
	}

	@Override
	public synchronized void stop() {
		LOGGER.info("stop");
		packml.raiseLifecycleEvent("stop");
	}

	@Override
	public synchronized void hold() {
		LOGGER.info("hold");
		packml.raiseLifecycleEvent("hold");
	}

	@Override
	public synchronized void unhold() {
		LOGGER.info("unhold");
		packml.raiseLifecycleEvent("unhold");
	}

	@Override
	public synchronized void suspend() {
		LOGGER.info("suspend");
		packml.raiseLifecycleEvent("suspend");
	}

	@Override
	public synchronized void unsuspend() {
		LOGGER.info("unsuspend");
		packml.raiseLifecycleEvent("unsuspend");
	}

	@Override
	public synchronized void abort() {
		LOGGER.info("abort");
		packml.raiseLifecycleEvent("abort");
	}

	@Override
	public synchronized void clear() {
		LOGGER.info("clear");
		packml.raiseLifecycleEvent("clear");
	}
	
	/*
	 * ActiveStatesHandler facade
	 */
	
	@Override
	public void onResetting() {
		LOGGER.info("onResetting");
		if (actHandler != null)
			actHandler.onResetting();
	}

	@Override
	public void onStarting() {
		LOGGER.info("onStarting");
		if (actHandler != null)
			actHandler.onStarting();
	}

	@Override
	public void onExecute() {
		LOGGER.info("onExecute");
		if (actHandler != null)
			actHandler.onExecute();
	}

	@Override
	public void onCompleting() {
		LOGGER.info("onCompleting");
		if (actHandler != null)
			actHandler.onCompleting();
	}

	@Override
	public void onHolding() {
		LOGGER.info("onHolding");
		if (actHandler != null)
			actHandler.onHolding();
	}

	@Override
	public void onUnholding() {
		LOGGER.info("onUnholding");
		if (actHandler != null)
			actHandler.onUnholding();
	}

	@Override
	public void onSuspending() {
		LOGGER.info("onSuspending");
		if (actHandler != null)
			actHandler.onSuspending();
	}

	@Override
	public void onUnsuspending() {
		LOGGER.info("onUnsuspending");
		if (actHandler != null)
			actHandler.onUnsuspending();
	}

	@Override
	public void onAborting() {
		LOGGER.info("onAborting");
		if (actHandler != null)
			actHandler.onAborting();
	}

	@Override
	public void onClearing() {
		LOGGER.info("onClearing");
		if (actHandler != null)
			actHandler.onClearing();
	}

	@Override
	public void onStopping() {
		LOGGER.info("onStopping");
		if (actHandler != null)
			actHandler.onStopping();
	}
	
	/*
	 * WaitStatesHandler facade
	 */

	@Override
	public void onStopped() {
		LOGGER.info("onStopped");	
		if (waitHandler != null)
			waitHandler.onStopped();
	};

	@Override
	public void onIdle() {
		LOGGER.info("onIdle");	
		if (waitHandler != null)
			waitHandler.onIdle();
	};

	@Override
	public void onComplete() {
		LOGGER.info("onComplete");
		if (waitHandler != null)
			waitHandler.onComplete();
	};
	
	@Override
	public void onHeld() {
		LOGGER.info("onHeld");		
		if (waitHandler != null)
			waitHandler.onHeld();
	};

	@Override
	public void onSuspended() {
		LOGGER.info("onSuspended");
		if (waitHandler != null)
			waitHandler.onSuspended();
	};

	@Override
	public void onAborted() {
		LOGGER.info("onAborted");		
		if (waitHandler != null)
			waitHandler.onAborted();
	};

}
