package de.dfki.iui.basys.runtime.component.registry;

import java.util.List;

import de.dfki.iui.basys.runtime.component.ServiceComponent;

public interface ServiceRegistry {
	
	ServiceRegistration createRegistration(ServiceComponent instance) throws ServiceRegistrationException;

	List<InstanceDetails> getServices(String name);
	
	InstanceDetails getService(String id);
	
}
