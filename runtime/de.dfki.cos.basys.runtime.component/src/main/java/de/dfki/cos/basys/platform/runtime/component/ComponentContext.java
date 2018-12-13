package de.dfki.cos.basys.platform.runtime.component;

import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManager;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistry;

public class ComponentContext {

	private ComponentRegistry componentRegistry;
	private ComponentManager componentManager;
	private ChannelPool sharedChannelPool;

	public ComponentContext(ComponentContext context) {
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

	public static class Builder {
		private ComponentRegistry componentRegistry;
		private ComponentManager componentManager;
		private ChannelPool sharedChannelPool;

		public Builder componentRegistry(ComponentRegistry componentRegistry) {
			this.componentRegistry = componentRegistry;
			return this;
		}

		public Builder componentManager(ComponentManager componentManager) {
			this.componentManager = componentManager;
			return this;
		}

		public Builder sharedChannelPool(ChannelPool sharedChannelPool) {
			this.sharedChannelPool = sharedChannelPool;
			return this;
		}

		public ComponentContext build() {
			return new ComponentContext(this);
		}
	}

	private ComponentContext(Builder builder) {
		this.componentRegistry = builder.componentRegistry;
		this.componentManager = builder.componentManager;
		this.sharedChannelPool = builder.sharedChannelPool;
	}
}
