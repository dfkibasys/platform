package de.dfki.cos.basys.platform.osgi.services.internal;

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
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceTypeCatalogueCollection;
import de.dfki.cos.basys.platform.osgi.services.OsgiComponentWrapper;
import de.dfki.cos.basys.platform.runtime.services.ResourceTypeManager;
import de.dfki.cos.basys.platform.runtime.services.impl.ResourceTypeManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class ResourceTypeManagerServiceImpl extends OsgiComponentWrapper implements ResourceTypeManager {

	ComponentManager componentManager;
	ResourceTypeManagerImpl impl;

	public ResourceTypeManagerServiceImpl() {
		LOGGER.info(getClass().getSimpleName() + " created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new ResourceTypeManagerImpl(config);
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
	public ResourceType getResourceType(String id) {
		return impl.getResourceType(id);
	}

	@Override
	public ResourceTypeCatalogue getResourceTypeCatalogue(String manufacturerName) {
		return impl.getResourceTypeCatalogue(manufacturerName);
	}

	@Override
	public ResourceTypeCatalogueCollection getResourceTypeCatalogueCollection() {
		return impl.getResourceTypeCatalogueCollection();
	}

}
