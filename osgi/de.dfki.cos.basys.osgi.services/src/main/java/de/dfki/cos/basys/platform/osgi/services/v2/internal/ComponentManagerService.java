package de.dfki.cos.basys.platform.osgi.services.v2.internal;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ScheduledExecutorService;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.manager.ComponentManager;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.common.component.registry.ComponentRegistry;
import de.dfki.cos.basys.platform.osgi.services.ChannelPoolProvider;
import de.dfki.cos.basys.platform.osgi.services.v2.OsgiComponentWrapper;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponentContext;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public class ComponentManagerService extends OsgiComponentWrapper implements ComponentManager {

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
				
		BasysComponentContext basysComponentContext = BasysComponentContext.getStaticContext();
		basysComponentContext.setSharedChannelPool(channelPoolProvider.getSharedChannelPool());
		basysComponentContext.setComponentRegistry(registry);
		basysComponentContext.setComponentManager(impl);

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
	public List<de.dfki.cos.basys.common.component.Component> getComponents() {
		return impl.getComponents();
	}

	@Override
	public de.dfki.cos.basys.common.component.Component getComponentById(String id) {
		return impl.getComponentById(id);
	}

	@Override
	public de.dfki.cos.basys.common.component.Component getComponentByName(String name) {
		return impl.getComponentByName(name);
	}

	@Override
	public de.dfki.cos.basys.common.component.Component createComponent(Properties config) throws ComponentManagerException {
		return impl.createComponent(config);
	}

	@Override
	public void addComponent(de.dfki.cos.basys.common.component.Component component) throws ComponentManagerException {
		impl.addComponent(component);
	}

	@Override
	public void deleteComponent(String id) throws ComponentManagerException {
		impl.deleteComponent(id);
	}

//	@Override
//	public de.dfki.cos.basys.common.component.Component createComponent(File configFile) throws ComponentManagerException {
//		return impl.createComponent(configFile);		
//	}
//
//	@Override
//	public void createComponents(File configFolder, boolean recursive) throws ComponentManagerException {
//		impl.createComponents(configFolder, recursive);
//	}



}
