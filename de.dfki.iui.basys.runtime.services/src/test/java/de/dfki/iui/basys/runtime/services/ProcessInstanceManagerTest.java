package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.iui.basys.runtime.services.impl.ProcessInstanceManagerImpl;

public class ProcessInstanceManagerTest extends BaseEmfServiceComponentTest<ProcessInstanceManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ProcessInstanceManagerImpl";
		file = "model.processinstance";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

//	@Test
//	public void testGetProcessInstance() {
//		// TODO: set properties
//		String id = "";
//		ProcessInstance processInstance = service.getProcessInstance(id);
//
//		assertEquals(id, processInstance.getId());
//		assertEquals("", processInstance.getName());
//	}

	@Test
	public void testGetProcessInstanceByProductInstance() {
		// fail("Not yet implemented");
	}

//	@Test
//	public void testGetAllProcessInstances() {
//		// TODO: set properties
//		List<ProcessInstance> processInstances = service.getAllProcessInstances();
//		assertNotNull(processInstances);
//		List<String> ids = processInstances.stream().map(processInstance -> processInstance.getId()).sorted().collect(Collectors.toList());
//		List<String> names = processInstances.stream().map(processInstance -> processInstance.getName()).sorted().collect(Collectors.toList());
//
//		List<String> expectedIds = new LinkedList<>(Arrays.asList("", ""));
//		expectedIds.stream().sorted().collect(Collectors.toList());
//		List<String> expectedNames = new LinkedList<>(Arrays.asList("", ""));
//		expectedNames.stream().sorted().collect(Collectors.toList());
//
//		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
//		Assert.assertArrayEquals(expectedNames.toArray(), names.toArray());
//	}
}
