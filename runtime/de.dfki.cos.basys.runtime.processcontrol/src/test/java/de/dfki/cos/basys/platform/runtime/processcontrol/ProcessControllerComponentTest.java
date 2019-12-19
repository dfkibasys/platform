package de.dfki.cos.basys.platform.runtime.processcontrol;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.cos.basys.platform.runtime.component.model.Variable;
import de.dfki.cos.basys.platform.runtime.component.model.VariableType;
import de.dfki.cos.basys.platform.runtime.processcontrol.camunda.CamundaRestClient;
import de.dfki.cos.basys.platform.runtime.processcontrol.camunda.ExternalServiceTaskDto;

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
		ProcessControllerComponent component = (ProcessControllerComponent) componentManager.getComponentById("process-controller");
			
		
		sleep(300);
	}
	
	
	
}
