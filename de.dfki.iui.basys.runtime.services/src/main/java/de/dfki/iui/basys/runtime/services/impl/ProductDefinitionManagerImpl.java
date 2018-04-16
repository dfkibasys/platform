package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;
import de.dfki.iui.basys.model.domain.productdefinition.impl.ProductdefinitionPackageImpl;
import de.dfki.iui.basys.model.domain.productdefinition.util.ProductdefinitionResourceFactoryImpl;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProductDefinitionManager;

public class ProductDefinitionManagerImpl extends EmfServiceComponent implements ProductDefinitionManager {

	public ProductDefinitionManagerImpl(ComponentConfiguration config) {
		super(config);
		ProductdefinitionPackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("productdefinition", new ProductdefinitionResourceFactoryImpl());
	}

	@Override
	public ProductVariant getProductVariant(String id) {
		return getEntity(id);
	}

	@Override
	public ProductVariant getProductVariantByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductVariant> getProductVariants(String productGroupName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductVariant> getAllProductVariants() {
		// TODO Auto-generated method stub
		return null;
	}

}
