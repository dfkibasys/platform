package de.dfki.iui.basys.runtime.services.impl;

import de.dfki.iui.basys.model.domain.productdefinition.AssemblyGroup;
import de.dfki.iui.basys.model.domain.productdefinition.ProductCatalogue;
import de.dfki.iui.basys.model.domain.productdefinition.ProductGroup;
import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;
import de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.iui.basys.model.domain.productdefinition.impl.ProductdefinitionPackageImpl;
import de.dfki.iui.basys.model.domain.productdefinition.util.ProductdefinitionResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProductDefinitionManager;

public class ProductDefinitionManagerImpl extends EmfServiceComponent implements ProductDefinitionManager {

	public ProductDefinitionManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public ProductVariant getProductVariant(String id) {
		return getEntity(id);
	}

	@Override
	public AssemblyGroup getAssemblyGroup(String assemblyGroupId) {
		return getEntity(assemblyGroupId);
	}

	@Override
	public ProductGroup getProductGroup(String productGroupId) {
		return getEntity(productGroupId);
	}

	@Override
	public ProductCatalogue getProductCatalogue() {
		ProductCatalogue catalogue = getFirstEntity(ProductdefinitionPackage.eINSTANCE.getProductCatalogue());
		return catalogue;
	}

}
