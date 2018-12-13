package de.dfki.cos.basys.platform.osgi.services.internal;

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

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.osgi.services.BasysOsgiComponent;
import de.dfki.cos.basys.platform.osgi.services.ChannelPoolProvider;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManager;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.runtime.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistry;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public class ComponentManagerService extends BasysOsgiComponent implements ComponentManager {

	ComponentRegistry registry;
	ChannelPoolProvider channelPoolProvider;

	ComponentManagerImpl impl;

	public ComponentManagerService() {

	}

	@Override
	@Activate
	protected void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new ComponentManagerImpl(config);
				
		de.dfki.cos.basys.platform.runtime.component.ComponentContext basysComponentContext = new de.dfki.cos.basys.platform.runtime.component.ComponentContext.Builder()
				.sharedChannelPool(channelPoolProvider.getSharedChannelPool()).componentRegistry(registry).componentManager(impl).build();
		
		try {
			impl.activate(basysComponentContext);
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
			impl.deactivate();
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
	public List<de.dfki.cos.basys.platform.runtime.component.Component> getLocalComponents() {
		return impl.getLocalComponents();
	}

	@Override
	public de.dfki.cos.basys.platform.runtime.component.Component getLocalComponentById(String id) {
		return impl.getLocalComponentById(id);
	}

	@Override
	public de.dfki.cos.basys.platform.runtime.component.Component getLocalComponentByName(String name) {
		return impl.getLocalComponentByName(name);
	}

	@Override
	public de.dfki.cos.basys.platform.runtime.component.Component createLocalComponent(ComponentConfiguration config) throws ComponentManagerException {
		return impl.createLocalComponent(config);
	}

	@Override
	public void addLocalComponent(de.dfki.cos.basys.platform.runtime.component.Component component) throws ComponentManagerException {
		impl.addLocalComponent(component);
	}

	@Override
	public void deleteLocalComponent(String id) throws ComponentManagerException {
		impl.deleteLocalComponent(id);
	}

	@Override
	public de.dfki.cos.basys.platform.runtime.component.Component createLocalComponent(File configFile) throws ComponentManagerException {
		return impl.createLocalComponent(configFile);		
	}

	@Override
	public void createLocalComponents(File configFolder, boolean recursive) throws ComponentManagerException {
		impl.createLocalComponents(configFolder, recursive);
	}

}
