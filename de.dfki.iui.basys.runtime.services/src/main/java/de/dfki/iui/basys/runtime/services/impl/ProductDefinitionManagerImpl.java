package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

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
	public List<ProductGroup> getProductGroups() {
		return getAllEntities(ProductdefinitionPackage.eINSTANCE.getProductGroup(), false);
	}
	
	
	@Override
	public List<ProductVariant> getProductVariants(String productGroupId) {
		ProductGroup group = getEntity(productGroupId);
		return group.getProductVariants();
	}

	@Override
	public List<ProductVariant> getAllProductVariants() {
		return getAllEntities(ProductdefinitionPackage.eINSTANCE.getProductVariant(), false);
	}

}
