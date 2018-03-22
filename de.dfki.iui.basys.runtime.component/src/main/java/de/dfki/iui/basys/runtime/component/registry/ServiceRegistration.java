package de.dfki.iui.basys.runtime.component.registry;

import java.io.IOException;

public interface ServiceRegistration {

	void register() throws ServiceRegistrationException;

	void unregister() throws ServiceRegistrationException;

}