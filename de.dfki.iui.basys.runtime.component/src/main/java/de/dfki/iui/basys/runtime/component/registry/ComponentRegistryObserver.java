package de.dfki.iui.basys.runtime.component.registry;

public interface ComponentRegistryObserver {

	void handleComponentAdded(ComponentInfo info);

	void handleComponentUpdated(ComponentInfo info);

	void handleComponentRemoved(ComponentInfo info);
}
