package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;

import de.dfki.iui.basys.runtime.services.impl.OrderManagerImpl;

public class OrderManagerTest extends BaseEmfServiceComponentTest<OrderManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.OrderManagerImpl";
		file = "test.order";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

}
