package de.dfki.cos.basys.platform.runtime.component.v2.registry;

import de.dfki.cos.basys.common.component.ComponentInfo;

public interface ComponentRegistryObserver {

	ComponentInfo getComponentInfo(String componentId);
	
	void handleComponentAdded(ComponentInfo info);

	void handleComponentUpdated(ComponentInfo info);

	void handleComponentRemoved(ComponentInfo info);
}
