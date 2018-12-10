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
import de.dfki.cos.basys.platform.runtime.services.worldmodelManager.WorldModelManager;
import de.dfki.cos.basys.platform.runtime.services.worldmodelManager.impl.WorldModelManagerImpl;
import de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel;
import de.dfki.iui.basys.model.domain.linebalancing.WorldModel;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class WorldModelManagerServiceImpl extends BasysOsgiComponent implements WorldModelManager {

	ComponentManager componentManager;
	WorldModelManagerImpl impl;

	public WorldModelManagerServiceImpl() {
		LOGGER.info("WorldModelManagerServiceImpl created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new WorldModelManagerImpl(config);
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
	 * WorldmodelManager interface
	 */
	@Override
	public WorldModel getCurrentWorld() {
		return impl.getCurrentWorld();
	}

	@Override
	public StaticWorldModel getStaticWorld() {
		return impl.getStaticWorld();
	}

	@Override
	public long getEstimatedETA(TopologyElement sourceLocation, TopologyElement targetLocation) {

		return impl.getEstimatedETA(sourceLocation, targetLocation);
	}

}