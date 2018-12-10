package de.dfki.cos.basys.platform.osgi.services.internal;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.cos.basys.platform.osgi.services.BasysOsgiComponent;
import de.dfki.cos.basys.platform.osgi.services.ChannelPoolProvider;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistration;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistrationException;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistry;
import de.dfki.cos.basys.platform.runtime.component.registry.zookeeper.ZookeeperComponentRegistry;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentInfo;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public class ComponentRegistryService extends BasysOsgiComponent implements ComponentRegistry {

	ZookeeperComponentRegistry registry;
	ChannelPoolProvider channelPoolProvider;

	public ComponentRegistryService() {

	}

	@Override
	@Activate
	protected void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		registry = new ZookeeperComponentRegistry(config);
		//modified(context, properties);
		
		de.dfki.cos.basys.platform.runtime.component.ComponentContext basysComponentContext = new de.dfki.cos.basys.platform.runtime.component.ComponentContext.Builder()
				.sharedChannelPool(channelPoolProvider.getSharedChannelPool()).componentRegistry(registry).build();

		try {
			registry.activate(basysComponentContext);
		} catch (ComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	@Modified
	public void modified(ComponentContext context, Map<String, Object> properties) {
		super.modified(context, properties);

		

	}

	@Override
	@Deactivate
	protected void deactivate(ComponentContext context, int reason) {
		try {
			registry.deactivate();
		} catch (ComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Reference
	public void setChannelPoolProvider(ChannelPoolProvider channelPoolProvider) {
		this.channelPoolProvider = channelPoolProvider;
	}

	public void unsetChannelPoolProvider(ChannelPoolProvider channelPoolProvider) {
		this.channelPoolProvider = null;
	}

	/*
	 * ComponentRegistry interface
	 */

	@Override
	public ComponentRegistration createRegistration(de.dfki.cos.basys.platform.runtime.component.Component instance) throws ComponentRegistrationException {
		return registry.createRegistration(instance);
	}

	@Override
	public List<ComponentInfo> getComponents(ComponentCategory category) {
		//Strange, but it works
		//https://stackoverflow.com/questions/19694928/jackson-jersey-deserialize-exception-for-id-type-id-class-no-such-class?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa

		//ClassLoader cl = getClass().getClassLoader();
		// different from
		ClassLoader old = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
			return registry.getComponents(category);
		} finally {
			Thread.currentThread().setContextClassLoader(old);
		}

	}

	@Override
	public ComponentInfo getComponentById(ComponentCategory category, String id) {
		
		ClassLoader old = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
			return registry.getComponentById(category, id);
		} finally {
			Thread.currentThread().setContextClassLoader(old);
		}
	}

	@Override
	public ComponentInfo getComponentByName(ComponentCategory category, String name) {
		
		ClassLoader old = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
			return registry.getComponentByName(category, name);
		} finally {
			Thread.currentThread().setContextClassLoader(old);
		}
	}
}
