package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
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
	public ResourceType getResourceTypeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceType> getResourceTypesByManufacturer(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceType> getResourceTypesByCapability(Capability capability) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceType> getAllResourceTypes() {
		return getAllEntities(ResourcetypePackage.eINSTANCE.getResourceType(), false);
	}

}
