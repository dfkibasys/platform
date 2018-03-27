package de.dfki.iui.basys.runtime.component;

import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;

public class ComponentContext {
	
	ServiceRegistry serviceRegistry;
	ChannelPool sharedChannelPool;

	/**
	 * @return the serviceRegistry
	 */
	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	/**
	 * @return the sharedChannelPool
	 */
	public ChannelPool getSharedChannelPool() {
		return sharedChannelPool;
	}

	/**
	 * @param serviceRegistry the serviceRegistry to set
	 * @return the ComponentContext instance
	 */
	public ComponentContext setServiceRegistry(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
		return this;
	}
	
	/**
	 * @param sharedChannelPool the sharedChannelPool to set
	 * @return the ComponentContext instance
	 */
	public ComponentContext setSharedChannelPool(ChannelPool sharedChannelPool) {
		this.sharedChannelPool = sharedChannelPool;
		return this;
	}
	
}
