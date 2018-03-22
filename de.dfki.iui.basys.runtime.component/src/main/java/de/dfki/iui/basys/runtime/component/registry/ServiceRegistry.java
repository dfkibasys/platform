package de.dfki.iui.basys.runtime.component.registry;

import de.dfki.iui.basys.runtime.component.ServiceComponent;

public interface ServiceRegistry {
	
	ServiceRegistration createRegistration(ServiceComponent instance) throws ServiceRegistrationException;
	
}
