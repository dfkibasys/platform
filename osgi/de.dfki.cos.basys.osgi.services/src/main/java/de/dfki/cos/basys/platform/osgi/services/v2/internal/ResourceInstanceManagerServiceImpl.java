package de.dfki.cos.basys.platform.osgi.services.v2.internal;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.cos.basys.common.component.manager.ComponentManager;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.cos.basys.platform.osgi.services.v2.OsgiComponentWrapper;
import de.dfki.cos.basys.platform.runtime.services.ResourceInstanceManager;
import de.dfki.cos.basys.platform.runtime.services.v2.impl.ResourceInstanceManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class ResourceInstanceManagerServiceImpl extends OsgiComponentWrapper implements ResourceInstanceManager {

	ComponentManager componentManager;
	ResourceInstanceManagerImpl impl;

	public ResourceInstanceManagerServiceImpl() {
		LOGGER.info(getClass().getSimpleName() + " created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new ResourceInstanceManagerImpl(config);
		try {
			componentManager.addComponent(impl);
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	@Modified
	public void modified(ComponentContext context, Map<String, Object> properties) {
		if (super.context == null)
			return;

		super.modified(context, properties);
	}

	@Override
	@Deactivate
	public void deactivate(ComponentContext context, int reason) {
		super.deactivate(context, reason);
	}

	@Reference
	void setComponentManager(ComponentManager componentManager) {
		this.componentManager = componentManager;
	}

	void unsetComponentManager(ComponentManager componentManager) {
		this.componentManager = null;
	}

	/*
	 * Service interface
	 */
	
	@Override
	public ResourceInstance getResourceInstance(String id) {
		return impl.getResourceInstance(id);
	}

	@Override
	public List<ResourceInstance> getResourceInstancesByCapability(Capability capability) {
		return impl.getResourceInstancesByCapability(capability);
	}

	@Override
	public ResourceInstanceRepository getResourceInstanceRepository() {
		return impl.getResourceInstanceRepository();
	}

	@Override
	public List<CapabilityApplication> getCapabilityApplications(String id) {
		return impl.getCapabilityApplications(id);
	}

	@Override
	public CapabilityApplication getCapabilityApplication(String id, String assertionId) {
		return impl.getCapabilityApplication(id, assertionId);
	}

	@Override
	public CapabilityVariant<?,?> getCapabilityVariant(String id, String assertionId, String variantId) {
		return  impl.getCapabilityVariant(id, assertionId, variantId);
	}

	@Override
	public void addCapabilityVariant(String id, String assertionId, CapabilityVariant<?,?> variant) {
		impl.addCapabilityVariant(id, assertionId, variant);		
	}

	@Override
	public void deleteCapabilityVariant(String id, String assertionId, String variantId) {
		impl.deleteCapabilityVariant(id, assertionId, variantId);		
	}

}
