package de.dfki.iui.basys.runtime.component.registry;

import java.util.List;

import org.apache.curator.x.discovery.ServiceInstance;

public interface ServiceRegistry {
	
	void registerService(ServiceInstance<InstanceDetails> instance);
	
	void unregisterService(String instanceId);
	
	List<ServiceInstance<InstanceDetails>> listServices();
	
	List<ServiceInstance<InstanceDetails>> queryServices(String capability);
	
}
