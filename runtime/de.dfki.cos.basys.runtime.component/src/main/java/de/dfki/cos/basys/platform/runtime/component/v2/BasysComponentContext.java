package de.dfki.cos.basys.platform.runtime.component.v2;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManager;
import de.dfki.cos.basys.platform.runtime.component.v2.registry.ComponentRegistry;

public class BasysComponentContext extends ComponentContext {

	private ComponentRegistry componentRegistry;
	private ComponentManager componentManager;
	private ChannelPool sharedChannelPool;

	public BasysComponentContext() {
	}
	
	public BasysComponentContext(BasysComponentContext context) {
		super(context);
		this.componentRegistry = context.getComponentRegistry();
		this.componentManager = context.getComponentManager();
		this.sharedChannelPool = context.getSharedChannelPool();
	}
	
	public ComponentRegistry getComponentRegistry() {
		return componentRegistry;
	}

	public void setComponentRegistry(ComponentRegistry componentRegistry) {
		this.componentRegistry = componentRegistry;
	}

	public ComponentManager getComponentManager() {
		return componentManager;
	}

	public void setComponentManager(ComponentManager componentManager) {
		this.componentManager = componentManager;
	}

	public ChannelPool getSharedChannelPool() {
		return sharedChannelPool;
	}

	public void setSharedChannelPool(ChannelPool sharedChannelPool) {
		this.sharedChannelPool = sharedChannelPool;
	}
	
}
