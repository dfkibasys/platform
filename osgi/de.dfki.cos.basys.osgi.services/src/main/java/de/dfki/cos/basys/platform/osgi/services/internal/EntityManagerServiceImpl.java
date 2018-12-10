package de.dfki.cos.basys.platform.osgi.services.internal;

import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.cos.basys.platform.osgi.services.BasysOsgiComponent;
import de.dfki.cos.basys.platform.osgi.services.ResourceSetProvider;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManager;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.runtime.services.EntityManager;
import de.dfki.cos.basys.platform.runtime.services.MaterialManager;
import de.dfki.cos.basys.platform.runtime.services.impl.EntityManagerImpl;
import de.dfki.cos.basys.platform.runtime.services.impl.MaterialManagerImpl;
import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialCatalogue;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class EntityManagerServiceImpl extends BasysOsgiComponent implements EntityManager {

	ComponentManager componentManager;
	EntityManagerImpl impl;

	public EntityManagerServiceImpl() {
		LOGGER.info("EntityManagerServiceImpl created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new EntityManagerImpl(config);
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
	 * EntityManager interface
	 */
	
	@Override
	public Entity getEntity(String id) {
		return impl.getEntity(id);
	}


}
