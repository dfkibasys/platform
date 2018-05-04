package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl;
import de.dfki.iui.basys.model.domain.productinstance.util.ProductinstanceResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProductInstanceManager;

public class ProductInstanceManagerImpl extends EmfServiceComponent implements ProductInstanceManager {

	public ProductInstanceManagerImpl(ComponentConfiguration config) {
		super(config);
		ProductinstancePackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("productinstance", new ProductinstanceResourceFactoryImpl());
	}

	@Override
	public ProductInstance getProductInstance(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductInstance> getAllProductInstances() {
		// TODO Auto-generated method stub
		return null;
	}

}
