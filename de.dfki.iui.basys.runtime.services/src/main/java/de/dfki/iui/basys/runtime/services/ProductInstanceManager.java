package de.dfki.iui.basys.runtime.services;

import java.util.List;

import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;

public interface ProductInstanceManager {

	ProductInstance getProductInstance(String id);

	List<ProductInstance> getAllProductInstances();

}
