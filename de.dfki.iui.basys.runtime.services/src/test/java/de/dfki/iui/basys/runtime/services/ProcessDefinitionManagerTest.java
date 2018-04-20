package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;

import de.dfki.iui.basys.runtime.services.impl.ProcessDefinitionManagerImpl;

public class ProcessDefinitionManagerTest extends BaseEmfServiceComponentTest<ProcessDefinitionManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ProcessDefinitionManagerImpl";
		file = "test.processdefinition";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

}
