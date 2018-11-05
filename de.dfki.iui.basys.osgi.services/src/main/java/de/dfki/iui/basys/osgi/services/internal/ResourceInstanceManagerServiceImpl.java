package de.dfki.iui.basys.osgi.services.internal;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.iui.basys.osgi.services.BasysOsgiComponent;
import de.dfki.iui.basys.osgi.services.ResourceSetProvider;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.services.ResourceInstanceManager;
import de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class ResourceInstanceManagerServiceImpl extends BasysOsgiComponent implements ResourceInstanceManager {

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
		impl.setSharedResourceSet(provider.getSharedResourceSet());
		try {
			componentManager.addLocalComponent(impl);
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

	ResourceSetProvider provider;
	
	@Reference
	void setResourceSetProvider(ResourceSetProvider provider) {
		this.provider = provider;
	}
	
	void unsetResourceSetProvider(ResourceSetProvider provider) {
		this.provider = null;
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
	public CapabilityVariant<?> getCapabilityVariant(String id, String assertionId, String variantId) {
		return  impl.getCapabilityVariant(id, assertionId, variantId);
	}

	@Override
	public void addCapabilityVariant(String id, String assertionId, CapabilityVariant<?> variant) {
		impl.addCapabilityVariant(id, assertionId, variant);		
	}

	@Override
	public void deleteCapabilityVariant(String id, String assertionId, String variantId) {
		impl.deleteCapabilityVariant(id, assertionId, variantId);		
	}

}
