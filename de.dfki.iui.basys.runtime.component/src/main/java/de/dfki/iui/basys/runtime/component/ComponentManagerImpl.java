package de.dfki.iui.basys.runtime.component;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;
import de.dfki.iui.basys.runtime.component.registry.ZookeeperServiceRegistry;

public class ComponentManagerImpl implements ComponentManager {

	private Map<String, ServiceComponent> serviceComponents = new HashMap<>();
	private ComponentContext context;

	public ComponentManagerImpl(ComponentContext context) {
		this.context = context;
	}
	
	@Override
	public List<ServiceComponent> getServiceComponents() {
		return new ArrayList<ServiceComponent>(serviceComponents.values());
	}

	@Override
	public ServiceComponent getServiceComponent(String id) {
		return serviceComponents.get(id);
	}

	@Override
	public void addServiceComponent(ComponentConfiguration config) throws ComponentManagerException {

		Class c = null;
		try {
			c = Class.forName(config.getImplementationJavaClass());
		} catch (ClassNotFoundException e) {
			throw new ComponentManagerException(e);
		}

		ServiceComponent component = null;

		try {
			Constructor<ServiceComponent> constructor = c.getConstructor(ComponentConfiguration.class);
			component = constructor.newInstance(config);
			serviceComponents.put(component.getId(), component);				
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			throw new ComponentManagerException(e);
		}

		component.activate(context);
		
	}

	@Override
	public void removeServiceComponent(String id) throws ComponentManagerException {
		ServiceComponent c = serviceComponents.remove(id);
		if (c != null)
			c.deactivate();
		else 
			throw new ComponentManagerException(String.format("No service component registered with id %s", id));

	}

}
