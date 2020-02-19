package de.dfki.cos.basys.platform.runtime.processcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.cos.basys.platform.runtime.processcontrol.impl.ComponentRequestExecutionManagerImpl;

public class ProcessControllerComponentTest extends BaseComponentTest {
	
	@Override
	@Before
	public void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	
	@Test
	@Ignore
	public void testTaskFetch() {
		ComponentRequestExecutionManagerImpl component = (ComponentRequestExecutionManagerImpl) componentManager.getComponentById("process-controller");
			
		
		sleep(300);
	}
	
	
	
}
