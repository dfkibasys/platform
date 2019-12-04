package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogueCollection;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.cos.basys.platform.runtime.services.ResourceTypeManager;

public class ResourceTypeManagerImpl extends EmfBasysComponent implements ResourceTypeManager {

	public ResourceTypeManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public ResourceType getResourceType(String id) {
		return service.getEntity(id);
	}

	@Override
	public ResourceTypeCatalogue getResourceTypeCatalogue(String manufacturerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceTypeCatalogueCollection getResourceTypeCatalogueCollection() {
		ResourceTypeCatalogueCollection catalogueCollection = service.getFirstEntity(ResourcetypePackage.eINSTANCE.getResourceTypeCatalogueCollection());
		return catalogueCollection;
	}

}
