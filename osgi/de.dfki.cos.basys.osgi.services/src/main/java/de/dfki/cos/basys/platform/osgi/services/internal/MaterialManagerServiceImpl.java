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
import de.dfki.cos.basys.platform.model.domain.material.Material;
import de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue;
import de.dfki.cos.basys.platform.model.domain.material.MaterialGroup;
import de.dfki.cos.basys.platform.osgi.services.OsgiComponentWrapper;
import de.dfki.cos.basys.platform.runtime.services.MaterialManager;
import de.dfki.cos.basys.platform.runtime.services.impl.MaterialManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class MaterialManagerServiceImpl extends OsgiComponentWrapper implements MaterialManager {

	ComponentManager componentManager;
	MaterialManagerImpl impl;

	public MaterialManagerServiceImpl() {
		LOGGER.info("MaterialManagerServiceImpl created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new MaterialManagerImpl(config);
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
	 * MaterialManager interface
	 */

	@Override
	public MaterialCatalogue getMaterialCatalogue() {
		return impl.getMaterialCatalogue();
	}

	@Override
	public Material getMaterial(String id) {
		return impl.getMaterial(id);
	}

	@Override
	public MaterialGroup getMaterialGroup(String id) {
		return impl.getMaterialGroup(id);
	}


	


}
