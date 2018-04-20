package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;

import de.dfki.iui.basys.runtime.services.impl.ProcessInstanceManagerImpl;

public class ProcessInstanceManagerTest extends BaseEmfServiceComponentTest<ProcessInstanceManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ProcessInstanceManagerImpl";
		file = "test.processinstance";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

}
