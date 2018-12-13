package de.dfki.cos.basys.platform.runtime.component;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.runtime.component.device.packml.ActiveStatesHandler;
import de.dfki.cos.basys.platform.runtime.component.device.packml.PackMLUnit;
import junit.framework.TestCase;

public class TestHandler implements ActiveStatesHandler {

	protected final Logger LOGGER = LoggerFactory.getLogger(TestHandler.class.getName());
		
	enum Path {NORMAL, SUSPEND, HOLD}
	
	public Path path = Path.NORMAL;
	
	PackMLUnit unit;
	
	public TestHandler(PackMLUnit unit) {
		this.unit = unit;
	}

	public void initialize() {
		unit.initialize();
	}

	public void dispose() {
		unit.dispose();
	}
	
	private void sleep(double seconds) {
		try {
			TimeUnit.MILLISECONDS.sleep((long)(seconds*100));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onResetting() {
		LOGGER.info("onResetting");
		TestCase.assertEquals(State.RESETTING, unit.getState());
		sleep(1);
		
	}

	@Override
	public void onStarting() {
		LOGGER.info("onStarting");
		TestCase.assertEquals(State.STARTING, unit.getState());
		sleep(1);
	}

	@Override
	public void onExecute() {
		LOGGER.info("onExecute");
		TestCase.assertEquals(State.EXECUTE, unit.getState());
		sleep(1);
		
		switch (path) {
		case HOLD:
			unit.hold();
			break;
		case SUSPEND:
			unit.suspend();
			break;
		case NORMAL:
		default:
			break;
		}
		//sleep(1);
	}

	@Override
	public void onCompleting() {
		LOGGER.info("onCompleting");
		TestCase.assertEquals(State.COMPLETING, unit.getState());
		sleep(1);
	}

	@Override
	public void onHolding() {
		LOGGER.info("onHolding");
		TestCase.assertEquals(State.HOLDING, unit.getState());
		sleep(1);
	}

	@Override
	public void onUnholding() {
		LOGGER.info("onUnholding");
		TestCase.assertEquals(State.UNHOLDING, unit.getState());
		path = Path.NORMAL;
		sleep(1);
	}

	@Override
	public void onSuspending() {
		LOGGER.info("onSuspending");
		TestCase.assertEquals(State.SUSPENDING, unit.getState());
		sleep(1);
	}

	@Override
	public void onUnsuspending() {
		TestCase.assertEquals(State.UNSUSPENDING, unit.getState());
		LOGGER.info("onUnsuspending");
		path = Path.NORMAL;
		sleep(1);
	}

	@Override
	public void onAborting() {
		TestCase.assertEquals(State.ABORTING, unit.getState());
		LOGGER.info("onAborting");
		sleep(1);
	}

	@Override
	public void onClearing() {
		TestCase.assertEquals(State.CLEARING, unit.getState());
		LOGGER.info("onClearing");
		sleep(1);
	}

	@Override
	public void onStopping() {
		TestCase.assertEquals(State.STOPPING, unit.getState());
		LOGGER.info("onStopping");
		sleep(1);
	}

}
