package de.dfki.iui.basys.runtime.services.impl;

import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStore;
import de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage;
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
		return getEntity(id);
	}

	@Override
	public ProductInstanceStore getProductInstanceStore() {
		ProductInstanceStore store = getFirstEntity(ProductinstancePackage.eINSTANCE.getProductInstanceStore());
		return store;
	}

}
