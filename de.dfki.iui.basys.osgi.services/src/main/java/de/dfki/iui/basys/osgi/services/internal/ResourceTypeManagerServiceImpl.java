package de.dfki.iui.basys.osgi.services.internal;

import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogueCollection;
import de.dfki.iui.basys.osgi.services.BasysOsgiComponent;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.services.ResourceTypeManager;
import de.dfki.iui.basys.runtime.services.impl.ResourceTypeManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class ResourceTypeManagerServiceImpl extends BasysOsgiComponent implements ResourceTypeManager {

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
