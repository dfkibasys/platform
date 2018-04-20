package de.dfki.iui.basys.runtime.services;

import org.junit.After;
import org.junit.Before;

import de.dfki.iui.basys.runtime.services.impl.ProductDefinitionManagerImpl;

public class ProductDefinitionManagerTest extends BaseEmfServiceComponentTest<ProductDefinitionManagerImpl> {


	@Override
	@Before
	public void setUp() throws Exception {
		javaClassName = "de.dfki.iui.basys.runtime.services.impl.ProductDefinitionManagerImpl";
		file = "test.productdefinition";

		super.setUp();
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

}
