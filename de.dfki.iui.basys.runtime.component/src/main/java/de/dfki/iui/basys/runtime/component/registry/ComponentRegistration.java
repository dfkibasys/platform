package de.dfki.iui.basys.runtime.component.registry;

public interface ComponentRegistration {

	void register() throws ComponentRegistrationException;

	void update() throws ComponentRegistrationException;

	void unregister() throws ComponentRegistrationException;

}
