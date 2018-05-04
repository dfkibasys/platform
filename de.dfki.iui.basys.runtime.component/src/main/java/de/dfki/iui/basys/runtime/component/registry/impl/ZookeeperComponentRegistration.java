package de.dfki.iui.basys.runtime.component.registry.impl;

import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.UriSpec;

import de.dfki.iui.basys.model.runtime.component.ComponentInfo;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentInfoImpl;
import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistration;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistrationException;

public class ZookeeperComponentRegistration implements ComponentRegistration {

	private final ServiceDiscovery<ComponentInfo> serviceDiscovery;

	private final Component registeredComponent;
	private ServiceInstance<ComponentInfo> registeredInstance;
	
	private boolean registered;

	public ZookeeperComponentRegistration(ServiceDiscovery<ComponentInfo> serviceDiscovery, Component component)
			throws Exception {
		this.serviceDiscovery = serviceDiscovery;
		this.registeredComponent = component;
	}

	private ServiceInstance<ComponentInfo> createServiceInstance(Component component)
			throws ComponentRegistrationException {
		ComponentInfo componentInfo = new ComponentInfoImpl.Builder()
				.componentId(component.getId())
				.componentName(component.getName())
				.componentCategory(component.getCategory())
				.communicationProvider(component.getConfig().getCommunicationProviderImplementationJavaClass())
				.connectionString(component.getConfig().getCommunicationProviderConnectionString())
				.inChannelName(component.getConfig().getInChannelName())
				.outChannelName(component.getConfig().getOutChannelName())
				.currentState(component.getState())
				.currentMode(component.getMode())
				.build();
		// in a real application, you'd have a convention of some kind for the URI
		// layout
		UriSpec uriSpec = new UriSpec("{scheme}://foo.com:{port}");
		try {
			ServiceInstance<ComponentInfo> inst = ServiceInstance.<ComponentInfo>builder()
					.name(component.getCategory().getName())
					.id(component.getId())
					.payload(componentInfo)
					.port((int) (65535 * Math.random())) // in a real application, you'd use a common port
					.uriSpec(uriSpec).build();
			return inst;
		} catch (Exception e) {
			throw new ComponentRegistrationException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.dfki.iui.basys.runtime.component.registry.ServiceRegistration#register()
	 */
	@Override
	public void register() throws ComponentRegistrationException {
		try {
			registeredInstance = createServiceInstance(registeredComponent);
			serviceDiscovery.registerService(registeredInstance);
			registered = true;
		} catch (Exception e) {
			throw new ComponentRegistrationException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.dfki.iui.basys.runtime.component.registry.ServiceRegistration#update()
	 */
	@Override
	public void update() throws ComponentRegistrationException {
		try {
			if (registered) {
				registeredInstance = createServiceInstance(registeredComponent);
				serviceDiscovery.updateService(registeredInstance);
			}
		} catch (Exception e) {
			throw new ComponentRegistrationException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.dfki.iui.basys.runtime.component.registry.ServiceRegistration#unregister()
	 */
	@Override
	public void unregister() throws ComponentRegistrationException {
		try {
			serviceDiscovery.unregisterService(registeredInstance);
			registeredInstance = null;
			registered = false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ComponentRegistrationException(e);
		}
	}
}
