package de.dfki.iui.basys.runtime.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.Response;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition;
import de.dfki.iui.basys.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl;
import de.dfki.iui.basys.model.domain.processdefinition.util.ProcessdefinitionResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.productdefinition.ProductVariant;
import de.dfki.iui.basys.model.domain.productdefinition.impl.ProductdefinitionPackageImpl;
import de.dfki.iui.basys.model.domain.productdefinition.util.ProductdefinitionResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.util.ResourceinstanceResourceFactoryImpl;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProcessDefinitionManager;
import de.dfki.iui.basys.runtime.services.ProductDefinitionManager;
import de.dfki.iui.basys.runtime.services.ResourceInstanceManager;

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
