package de.dfki.iui.basys.runtime.services.impl;

import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogueCollection;
import de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl;
import de.dfki.iui.basys.model.domain.resourcetype.util.ResourcetypeResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ResourceTypeManager;

public class ResourceTypeManagerImpl extends EmfServiceComponent implements ResourceTypeManager {

	public ResourceTypeManagerImpl(ComponentConfiguration config) {
		super(config);
		ResourcetypePackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("resourcetype",
				new ResourcetypeResourceFactoryImpl());

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
