package de.dfki.cos.basys.platform.runtime.component.registry;

import de.dfki.iui.basys.model.runtime.component.ComponentInfo;

public interface ComponentRegistration {

	void register() throws ComponentRegistrationException;

	void update() throws ComponentRegistrationException;

	void unregister() throws ComponentRegistrationException;
	
	ComponentInfo getComponentInfo();

}
