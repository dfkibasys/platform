package de.dfki.cos.basys.platform.runtime.services.impl;

import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogueCollection;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.cos.basys.platform.model.domain.resourcetype.impl.ResourcetypePackageImpl;
import de.dfki.cos.basys.platform.model.domain.resourcetype.util.ResourcetypeResourceFactoryImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.ResourceTypeManager;

public class ResourceTypeManagerImpl extends EmfServiceComponent implements ResourceTypeManager {

	public ResourceTypeManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public ResourceType getResourceType(String id) {
		return getEntity(id);
	}

	@Override
	public ResourceTypeCatalogue getResourceTypeCatalogue(String manufacturerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceTypeCatalogueCollection getResourceTypeCatalogueCollection() {
		ResourceTypeCatalogueCollection catalogueCollection = getFirstEntity(ResourcetypePackage.eINSTANCE.getResourceTypeCatalogueCollection());
		return catalogueCollection;
	}

}
