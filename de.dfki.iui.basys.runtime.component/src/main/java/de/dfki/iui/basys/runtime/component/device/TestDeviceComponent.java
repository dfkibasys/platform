package de.dfki.iui.basys.runtime.component.device;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class TestDeviceComponent extends DeviceComponent {

	//enum Path {NORMAL, SUSPEND, HOLD, STOP_ON_ERROR, STOP_ON_EMERGENCY}
	
	//public Path path = Path.NORMAL;
	
	private LinkedBlockingQueue<State> recentStates = new LinkedBlockingQueue<>();
	
	public TestDeviceComponent(ComponentConfiguration config) {
		super(config);
	}
		
	public LinkedBlockingQueue<State> getRecentStates() {
		return recentStates;
	}
	
	public State getLastState() {
		try {
			return recentStates.poll(20,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return State.ABORTED;
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
		recentStates.add(State.RESETTING);
		sleep(1);
	}

	@Override
	public void onStarting() {
		recentStates.add(State.STARTING);
		sleep(1);
	}

	@Override
	public void onExecute() {
		recentStates.add(State.EXECUTE);
		sleep(3);
	}

	@Override
	public void onCompleting() {
		recentStates.add(State.COMPLETING);
		sleep(1);
	}

	@Override
	public void onHolding() {
		recentStates.add(State.HOLDING);
		sleep(1);
	}

	@Override
	public void onUnholding() {
		recentStates.add(State.UNHOLDING);
		sleep(1);
	}

	@Override
	public void onSuspending() {
		recentStates.add(State.SUSPENDING);
		sleep(1);
	}

	@Override
	public void onUnsuspending() {
		recentStates.add(State.UNSUSPENDING);
		sleep(1);
	}

	@Override
	public void onAborting() {
		recentStates.add(State.ABORTING);
		sleep(1);
	}

	@Override
	public void onClearing() {
		recentStates.add(State.CLEARING);
		sleep(1);
	}

	@Override
	public void onStopping() {
		recentStates.add(State.STOPPING);
		sleep(1);
	}

	/* Wait States */
	
	@Override
	public void onStopped() {
		recentStates.add(State.STOPPED);
		super.onStopped();
	}
	
	@Override
	public void onIdle() {
		recentStates.add(State.IDLE);
	}
	
	@Override
	public void onComplete() {
		recentStates.add(State.COMPLETE);
		super.onComplete();
	}
	
	@Override
	public void onHeld() {
		recentStates.add(State.HELD);
	}
	
	@Override
	public void onSuspended() {
		recentStates.add(State.SUSPENDED);
	}
	
	@Override
	public void onAborted() {
		recentStates.add(State.ABORTED);
	}
	
	
	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		return null;
	}


}
