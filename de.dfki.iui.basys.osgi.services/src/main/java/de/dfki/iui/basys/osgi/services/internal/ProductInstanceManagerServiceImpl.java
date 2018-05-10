package de.dfki.iui.basys.osgi.services.internal;

import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStore;
import de.dfki.iui.basys.osgi.services.BasysOsgiComponent;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.services.ProductInstanceManager;
import de.dfki.iui.basys.runtime.services.impl.ProductInstanceManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class ProductInstanceManagerServiceImpl extends BasysOsgiComponent implements ProductInstanceManager {

	ComponentManager componentManager;
	ProductInstanceManagerImpl impl;

	public ProductInstanceManagerServiceImpl() {
		LOGGER.info(getClass().getSimpleName() + " created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new ProductInstanceManagerImpl(config);
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
	public ProductInstance getProductInstance(String id) {
		return impl.getProductInstance(id);
	}

	@Override
	public ProductInstanceStore getProductInstanceStore() {
		return impl.getProductInstanceStore();
	}

	
}
