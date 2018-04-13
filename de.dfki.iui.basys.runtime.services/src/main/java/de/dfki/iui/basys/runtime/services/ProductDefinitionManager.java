package de.dfki.iui.basys.runtime.services;

import java.util.List;

import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;

public interface ProductDefinitionManager {

	ProductVariant getProductVariant(String id);

	ProductVariant getProductVariantByName(String name);

	List<ProductVariant> getProductVariants(String productGroupName);	

	List<ProductVariant> getAllProductVariants();
	
}
