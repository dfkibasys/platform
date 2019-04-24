package de.dfki.cos.basys.platform.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstance;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstanceStore;
import de.dfki.cos.basys.platform.runtime.services.impl.ProcessInstanceManagerImpl;

public class ProcessInstanceManagerTest extends BaseEmfServiceComponentTest<ProcessInstanceManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName += "ProcessInstanceManagerImpl";
		file = "model.processinstance";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetProcessInstance() {
//		// TODO: set properties
//		String id = "";
//		ProcessInstance processInstance = service.getProcessInstance(id);
//
//		assertEquals(id, processInstance.getId());
	}

	@Test
	public void testGetProcessInstanceByProductInstance() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetProcessInstanceStore() {
		ProcessInstanceStore store = service.getProcessInstanceStore();

		assertNotNull(store);
		assertEquals(0, store.getProcessInstances().size());
	}
}
