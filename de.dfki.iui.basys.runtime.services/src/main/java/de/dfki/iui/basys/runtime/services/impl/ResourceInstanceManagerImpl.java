package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.util.ResourceinstanceResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ResourceInstanceManager;

public class ResourceInstanceManagerImpl extends EmfServiceComponent implements ResourceInstanceManager {

	public ResourceInstanceManagerImpl(ComponentConfiguration config) {
		super(config);	
	}

	@Override
	public ResourceInstance getResourceInstance(String id) {
		return getEntity(id);
	}

	@Override
	public List<ResourceInstance> getResourceInstancesByCapability(Capability capability) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceInstanceRepository getResourceInstanceRepository() {
		ResourceInstanceRepository repository = getFirstEntity(ResourceinstancePackage.eINSTANCE.getResourceInstanceRepository());
		return repository;
	}

	@Override
	protected void initPackageAndregisterResourceFactory() {
		ResourceinstancePackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("resourceinstance",
				new ResourceinstanceResourceFactoryImpl());
	}

}
