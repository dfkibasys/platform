package de.dfki.iui.basys.runtime.component.registry;

import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.UriSpec;

import de.dfki.iui.basys.runtime.component.ServiceComponent;

public class ZookeeperServiceRegistration implements ServiceRegistration {

	private final ServiceDiscovery<InstanceDetails> serviceDiscovery;
	private final ServiceComponent component;

	private ServiceInstance<InstanceDetails> registeredInstance;

	private final String serviceName;

	public ZookeeperServiceRegistration(ServiceDiscovery<InstanceDetails> serviceDiscovery, String serviceName,
			ServiceComponent component) throws Exception {
		this.serviceDiscovery = serviceDiscovery;
		this.serviceName = serviceName;
		this.component = component;
	}

	private ServiceInstance<InstanceDetails> createServiceInstance(ServiceComponent component) throws ServiceRegistrationException {
		InstanceDetails details = new InstanceDetails(component,"in", "out");
		// in a real application, you'd have a convention of some kind for the URI layout
		UriSpec uriSpec = new UriSpec("{scheme}://foo.com:{port}");
		try {
			ServiceInstance<InstanceDetails> inst = ServiceInstance.<InstanceDetails>builder().name(this.serviceName).id(component.getId()).payload(details)
					.port((int) (65535 * Math.random())) // in a real application, you'd use a common port
					.uriSpec(uriSpec).build();
			return inst;
		} catch (Exception e) {
			throw new ServiceRegistrationException(e);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.dfki.iui.basys.runtime.component.registry.ServiceRegistration#register()
	 */
	@Override
	public void register() throws ServiceRegistrationException {
		try {			
			registeredInstance = createServiceInstance(component);			
			serviceDiscovery.registerService(registeredInstance);
		} catch (Exception e) {
			throw new ServiceRegistrationException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.dfki.iui.basys.runtime.component.registry.ServiceRegistration#update()
	 */
	@Override
	public void update() throws ServiceRegistrationException {
		try {
			registeredInstance = createServiceInstance(component);	
			serviceDiscovery.updateService(registeredInstance);
		} catch (Exception e) {
			throw new ServiceRegistrationException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.dfki.iui.basys.runtime.component.registry.ServiceRegistration#unregister()
	 */
	@Override
	public void unregister() throws ServiceRegistrationException {
		try {
			serviceDiscovery.unregisterService(registeredInstance);
			registeredInstance = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServiceRegistrationException(e);
		}
	}
}
