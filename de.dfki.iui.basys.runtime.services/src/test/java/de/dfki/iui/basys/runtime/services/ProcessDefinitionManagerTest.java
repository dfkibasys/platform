package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.iui.basys.runtime.services.impl.ProcessDefinitionManagerImpl;

public class ProcessDefinitionManagerTest extends BaseEmfServiceComponentTest<ProcessDefinitionManagerImpl> {

	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ProcessDefinitionManagerImpl";
		file = "model.processdefinition";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

//	@Test
//	public void testGetProcessDefinition() {
//		// TODO: set properties
//		String id = "";
//		ProcessDefinition processDefinition = service.getProcessDefinition(id);
//
//		assertEquals(id, processDefinition.getId());
//		assertEquals("", processDefinition.getName());
//	}

	@Test
	public void testGetProcessDefinitionByProductVariant() {
		// fail("Not yet implemented");
	}

//	@Test
//	public void testGetAllProcessDefinitions() {
//		// TODO: set properties
//		List<ProcessDefinition> processDefinitions = service.getAllProcessDefinitions();
//		assertNotNull(processDefinitions);
//		List<String> ids = processDefinitions.stream().map(processDefinition -> processDefinition.getId()).sorted().collect(Collectors.toList());
//		List<String> names = processDefinitions.stream().map(processDefinition -> processDefinition.getName()).sorted().collect(Collectors.toList());
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
