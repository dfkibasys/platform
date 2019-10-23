package de.dfki.cos.basys.platform.runtime.services.v2.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.productdefinition.AssemblyGroup;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductCatalogue;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductGroup;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductVariant;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.productdefinition.impl.ProductdefinitionPackageImpl;
import de.dfki.cos.basys.platform.model.domain.productdefinition.util.ProductdefinitionResourceFactoryImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.emf.EmfBasysComponent;
import de.dfki.cos.basys.platform.runtime.services.ProductDefinitionManager;

public class ProductDefinitionManagerImpl extends EmfBasysComponent implements ProductDefinitionManager {

	public ProductDefinitionManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public ProductVariant getProductVariant(String id) {
		return client.getEntity(id);
	}

	@Override
	public AssemblyGroup getAssemblyGroup(String assemblyGroupId) {
		return client.getEntity(assemblyGroupId);
	}

	@Override
	public ProductGroup getProductGroup(String productGroupId) {
		return client.getEntity(productGroupId);
	}

	@Override
	public ProductCatalogue getProductCatalogue() {
		ProductCatalogue catalogue = client.getFirstEntity(ProductdefinitionPackage.eINSTANCE.getProductCatalogue());
		return catalogue;
	}

}
