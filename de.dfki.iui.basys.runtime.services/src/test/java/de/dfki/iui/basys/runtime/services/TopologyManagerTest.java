package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;

import de.dfki.iui.basys.runtime.services.impl.TopologyManagerImpl;

public class TopologyManagerTest extends BaseEmfServiceComponentTest<TopologyManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.TopologyManagerImpl";
		file = "cebit.topology";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

}
