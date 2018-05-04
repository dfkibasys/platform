package de.dfki.iui.basys.runtime.component;

import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistry;

public class ComponentContext {

	private ComponentRegistry componentRegistry;
	private ChannelPool sharedChannelPool;

	/**
	 * @return the serviceRegistry
	 */
	public ComponentRegistry getComponentRegistry() {
		return componentRegistry;
	}

	/**
	 * @return the sharedChannelPool
	 */
	public ChannelPool getSharedChannelPool() {
		return sharedChannelPool;
	}
	
	public void setComponentRegistry(ComponentRegistry componentRegistry) {
		this.componentRegistry = componentRegistry;
	}
	
	public void setSharedChannelPool(ChannelPool sharedChannelPool) {
		this.sharedChannelPool = sharedChannelPool;
	}

	public static class Builder {
		private ComponentRegistry componentRegistry;
		private ChannelPool sharedChannelPool;

		public Builder componentRegistry(ComponentRegistry componentRegistry) {
			this.componentRegistry = componentRegistry;
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
		this.sharedChannelPool = builder.sharedChannelPool;
	}
	
	public ComponentContext(ComponentContext context) {
		this.componentRegistry = context.componentRegistry;
		this.sharedChannelPool = context.sharedChannelPool;
	}
}
