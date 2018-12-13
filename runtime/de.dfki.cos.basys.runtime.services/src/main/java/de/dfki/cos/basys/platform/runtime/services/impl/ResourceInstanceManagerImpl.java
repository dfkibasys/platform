package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.ArrayList;
import java.util.List;

import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.ResourceInstanceManager;

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
	public List<CapabilityApplication> getCapabilityApplications(String id) {
		List<CapabilityApplication> applications= getResourceInstance(id).getCapabilityApplications();
		return new ArrayList<CapabilityApplication>(applications);
	}

	@Override
	public CapabilityApplication getCapabilityApplication(String id, String assertionId) {
		for (CapabilityApplication ca : getResourceInstance(id).getCapabilityApplications()) {
			if (ca.getCapabilityAssertion().getId().equals(assertionId))
				return ca;
		}
		return null;
	}

	@Override
	public CapabilityVariant<?,?> getCapabilityVariant(String id, String assertionId, String variantId) {
		CapabilityApplication ca = getCapabilityApplication(id, assertionId);
		if (ca != null) {
			for (CapabilityVariant<?,?> cv : ca.getCapabilityVariants()) {
				if (cv.getId().equals(variantId))
					return cv;
			}
		}			
		return null;
	}

	@Override
	public void addCapabilityVariant(String id, String assertionId, CapabilityVariant<?,?> variant) {
		CapabilityApplication ca = getCapabilityApplication(id, assertionId);
		ca.getCapabilityVariants().add(variant);		
	}

	@Override
	public void deleteCapabilityVariant(String id, String assertionId, String variantId) {
		CapabilityApplication ca = getCapabilityApplication(id, assertionId);
		ca.getCapabilityVariants().removeIf(cv -> cv.getId().equals(variantId));
	}

}
