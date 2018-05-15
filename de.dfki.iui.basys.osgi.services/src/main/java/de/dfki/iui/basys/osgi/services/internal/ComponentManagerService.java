package de.dfki.iui.basys.osgi.services.internal;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.osgi.services.BasysOsgiComponent;
import de.dfki.iui.basys.osgi.services.ChannelPoolProvider;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.component.manager.impl.ComponentManagerImpl;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistry;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public class ComponentManagerService extends BasysOsgiComponent implements ComponentManager {

	ComponentRegistry registry;
	ChannelPoolProvider channelPoolProvider;

	ComponentManagerImpl manager;

	public ComponentManagerService() {

	}

	@Override
	@Activate
	protected void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		manager = new ComponentManagerImpl(config);
				
		de.dfki.iui.basys.runtime.component.ComponentContext basysComponentContext = new de.dfki.iui.basys.runtime.component.ComponentContext.Builder()
				.sharedChannelPool(channelPoolProvider.getSharedChannelPool()).componentRegistry(registry).build();
		
		try {
			manager.activate(basysComponentContext);
		} catch (ComponentException e) {
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
	protected void deactivate(ComponentContext context, int reason) {
		super.deactivate(context, reason);
		try {
			manager.deactivate();
		} catch (ComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Reference
	void setComponentRegistry(ComponentRegistry registry) {
		this.registry = registry;
	}

	void unsetComponentRegistry(ComponentRegistry registry) {
		this.registry = null;
	}

	@Reference
	public void setChannelPoolProvider(ChannelPoolProvider channelPoolProvider) {
		this.channelPoolProvider = channelPoolProvider;
	}

	public void unsetChannelPoolProvider(ChannelPoolProvider channelPoolProvider) {
		this.channelPoolProvider = null;
	}

	/*
	 * ComponentManager interface
	 */

	@Override
	public List<de.dfki.iui.basys.runtime.component.Component> getLocalComponents() {
		return manager.getLocalComponents();
	}

	@Override
	public de.dfki.iui.basys.runtime.component.Component getLocalComponentById(String id) {
		return manager.getLocalComponentById(id);
	}

	@Override
	public de.dfki.iui.basys.runtime.component.Component getLocalComponentByName(String name) {
		return manager.getLocalComponentByName(name);
	}

	@Override
	public void createLocalComponent(ComponentConfiguration config) throws ComponentManagerException {
		manager.createLocalComponent(config);
	}

	@Override
	public void addLocalComponent(de.dfki.iui.basys.runtime.component.Component component) throws ComponentManagerException {
		manager.addLocalComponent(component);
	}

	@Override
	public void deleteLocalComponent(String id) throws ComponentManagerException {
		manager.deleteLocalComponent(id);
	}

	@Override
	public void createLocalComponent(File configFile) throws ComponentManagerException {
		manager.createLocalComponent(configFile);		
	}

	@Override
	public void createLocalComponents(File configFolder, boolean recursive) throws ComponentManagerException {
		manager.createLocalComponents(configFolder, recursive);
	}

}
