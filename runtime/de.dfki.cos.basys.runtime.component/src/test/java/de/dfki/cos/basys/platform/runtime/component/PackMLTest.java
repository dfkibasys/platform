package de.dfki.cos.basys.platform.runtime.component;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.runtime.component.device.packml.PackMLUnit;
import junit.framework.TestCase;

public class PackMLTest extends TestCase {

	protected final Logger LOGGER = LoggerFactory.getLogger(PackMLTest.class);
	
	TestHandler handler;
	PackMLUnit unit;
	
	@Override
	protected void setUp() throws Exception {		
		super.setUp();
		LOGGER.info("setUp");
		unit = new PackMLUnit("test_unit","test_unit");
		handler = new TestHandler(unit);
		unit.setActiveStatesHandler(handler);
		unit.initialize();
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		LOGGER.info("tearDown");
		
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
	
	
	public void testExecute() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
		unit.start();
		sleep(5);
		
		//assertEquals(State.EXECUTE, unit.getState());		
		//sleep(3);
		
		assertEquals(State.COMPLETE, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
	}
	
	public void testHoldExternal() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
		unit.start();
		sleep(1.5);
		
		assertEquals(State.EXECUTE, unit.getState());		
		unit.hold();
		sleep(2);
		
		assertEquals(State.HELD, unit.getState());		
		unit.unhold();
		sleep(5);
		
		assertEquals(State.COMPLETE, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
	}
	
	public void testSuspendExternal() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
		unit.start();
		sleep(1.5);
		
		assertEquals(State.EXECUTE, unit.getState());		
		unit.suspend();
		sleep(3);
		
		assertEquals(State.SUSPENDED, unit.getState());		
		unit.unsuspend();
		sleep(5);
		
		assertEquals(State.COMPLETE, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
	}

	public void testStopExternal() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
		unit.start();
		sleep(2);
		
		assertEquals(State.EXECUTE, unit.getState());		
		unit.stop();
		sleep(3);
		
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
	}
	
	
	public void testAbort() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
		unit.start();
		sleep(2);
		
		assertEquals(State.EXECUTE, unit.getState());		
		unit.abort();
		sleep(3);
		
		assertEquals(State.ABORTED, unit.getState());		
		unit.clear();
		sleep(3);

		assertEquals(State.STOPPED, unit.getState());	
		unit.reset();
		sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
	}
	
}
