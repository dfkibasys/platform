package de.dfki.cos.basys.platform.runtime.component;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.runtime.component.device.TestDeviceComponent;
import de.dfki.cos.basys.platform.runtime.component.packml.PackMLUnit;

public class PackMLTest extends BaseComponentTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(PackMLTest.class);
	
	TestHandler handler;
	PackMLUnit unit;
	
	@Override
	public void setUp() throws Exception {		
		super.setUp();
		LOGGER.info("setUp");
		unit = new PackMLUnit("test_unit","test_unit");
		handler = new TestHandler(unit);
		unit.setActiveStatesHandler(handler);
		unit.initialize();
		
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
		LOGGER.info("tearDown");
		
		unit.dispose();
	}

	@Test
	public void testExecute() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
		unit.start();
		handler.sleep(5);
		
		//assertEquals(State.EXECUTE, unit.getState());		
		//sleep(3);
		
		assertEquals(State.COMPLETE, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
	}

	@Test
	public void testHoldExternal() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
		unit.start();
		handler.sleep(1.5);
		
		assertEquals(State.EXECUTE, unit.getState());		
		unit.hold();
		handler.sleep(2);
		
		assertEquals(State.HELD, unit.getState());		
		unit.unhold();
		handler.sleep(5);
		
		assertEquals(State.COMPLETE, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
	}

	@Test
	public void testSuspendExternal() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
		unit.start();
		handler.sleep(1.5);
		
		assertEquals(State.EXECUTE, unit.getState());		
		unit.suspend();
		handler.sleep(3);
		
		assertEquals(State.SUSPENDED, unit.getState());		
		unit.unsuspend();
		handler.sleep(5);
		
		assertEquals(State.COMPLETE, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
	}

	@Test
	public void testStopExternal() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
		unit.start();
		handler.sleep(2);
		
		assertEquals(State.EXECUTE, unit.getState());		
		unit.stop();
		handler.sleep(3);
		
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
	}
	

	@Test
	public void testAbort() {
		assertEquals(State.STOPPED, unit.getState());		
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());		
		unit.start();
		handler.sleep(2);
		
		assertEquals(State.EXECUTE, unit.getState());		
		unit.abort();
		handler.sleep(3);
		
		assertEquals(State.ABORTED, unit.getState());		
		unit.clear();
		handler.sleep(3);

		assertEquals(State.STOPPED, unit.getState());	
		unit.reset();
		handler.sleep(3);
		
		assertEquals(State.IDLE, unit.getState());
	}
	

	@Test
	public void testPackMLComponentLifecycle() throws ComponentException {
		LOGGER.info("testServiceLifecycle - start");
		
		TestDeviceComponent comp = new TestDeviceComponent(config1);
		comp.activate(context);

		assertEquals(State.STOPPED, comp.getState(true));
			
		comp.reset();
		assertEquals(State.RESETTING, comp.getState(true));
		assertEquals(State.IDLE, comp.getState(true));
		
		comp.start();
		assertEquals(State.STARTING, comp.getState(true));
		assertEquals(State.EXECUTE, comp.getState(true));
		assertEquals(State.COMPLETING, comp.getState(true));
		assertEquals(State.COMPLETE, comp.getState(true));	
		
		comp.stop();	
		
		assertEquals(State.STOPPING, comp.getState(true));
		assertEquals(State.STOPPED, comp.getState(true));		
		
		sleep(2);
		comp.deactivate();
		
		LOGGER.info("testServiceLifecycle - complete");
	}
		
	@Test
	public void testPackMLComponentLifecycle2() throws ComponentException {
		LOGGER.info("testServiceLifecycle - start");
		
		TestDeviceComponent comp = new TestDeviceComponent(config1);
		comp.activate(context);

		assertEquals(State.STOPPED, comp.getState(true));
			
		comp.reset();
		assertEquals(State.RESETTING, comp.getState(true));
		assertEquals(State.IDLE, comp.getState(true));
		
		comp.start();
		assertEquals(State.STARTING, comp.getState(true));
		assertEquals(State.EXECUTE, comp.getState(true));
		
		comp.stop();
		
//		assertEquals(State.COMPLETING, comp.getState(true));
//		assertEquals(State.COMPLETE, comp.getState(true));		
//		
//		
//		assertEquals(State.RESETTING, comp.getState(true));
		assertEquals(State.STOPPING, comp.getState(true));
		assertEquals(State.STOPPED, comp.getState(true));		
		
		sleep(2);
		comp.deactivate();
		
		LOGGER.info("testServiceLifecycle - complete");
	}

	
}
