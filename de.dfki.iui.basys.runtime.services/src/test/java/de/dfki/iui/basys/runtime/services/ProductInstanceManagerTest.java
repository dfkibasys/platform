package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;

import de.dfki.iui.basys.runtime.services.impl.ProductInstanceManagerImpl;

public class ProductInstanceManagerTest extends BaseEmfServiceComponentTest<ProductInstanceManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ProductInstanceManagerImpl";
		file = "test.productinstance";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
}
