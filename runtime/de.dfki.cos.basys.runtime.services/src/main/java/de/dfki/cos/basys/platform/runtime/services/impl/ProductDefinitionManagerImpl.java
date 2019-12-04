package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.productdefinition.AssemblyGroup;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductCatalogue;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductGroup;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductVariant;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.cos.basys.platform.runtime.services.ProductDefinitionManager;

public class ProductDefinitionManagerImpl extends EmfBasysComponent implements ProductDefinitionManager {

	public ProductDefinitionManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public ProductVariant getProductVariant(String id) {
		return service.getEntity(id);
	}

	@Override
	public AssemblyGroup getAssemblyGroup(String assemblyGroupId) {
		return service.getEntity(assemblyGroupId);
	}

	@Override
	public ProductGroup getProductGroup(String productGroupId) {
		return service.getEntity(productGroupId);
	}

	@Override
	public ProductCatalogue getProductCatalogue() {
		ProductCatalogue catalogue = service.getFirstEntity(ProductdefinitionPackage.eINSTANCE.getProductCatalogue());
		return catalogue;
	}

}
