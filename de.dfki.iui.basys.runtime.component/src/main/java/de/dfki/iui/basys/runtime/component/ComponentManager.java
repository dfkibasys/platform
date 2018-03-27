package de.dfki.iui.basys.runtime.component;

import java.util.List;

public interface ComponentManager {

	List<ServiceComponent> getServiceComponents();
	ServiceComponent getServiceComponent(String id);
	
	void addServiceComponent(ComponentConfiguration config) throws ComponentManagerException;
	void removeServiceComponent(String id) throws ComponentManagerException;

}
