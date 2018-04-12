package de.dfki.iui.basys.runtime.component.registry.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.CloseableUtils;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.details.JsonInstanceSerializer;

import de.dfki.iui.basys.runtime.component.BaseComponent;
import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.ComponentCategory;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.registry.ComponentInfo;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistration;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistrationException;
import de.dfki.iui.basys.runtime.component.registry.ComponentRegistry;

public class ZookeeperComponentRegistry extends BaseComponent implements ComponentRegistry {

	public ZookeeperComponentRegistry(ComponentConfiguration config) {
		super(config);
	}

	public static final String defaultConnectionString = "lns-90165.sb.dfki.de:2181";
	public static final String PATH = "basys";
	protected CuratorFramework client;

	private ServiceDiscovery<ComponentInfo> serviceDiscovery;

	@Override
	public void connectToExternal() throws ComponentException {
		String connectionString = defaultConnectionString;
		if (componentConfig.getExternalConnectionString() != null) {
			connectionString = componentConfig.getExternalConnectionString();
		}
		client = CuratorFrameworkFactory.newClient(connectionString, new ExponentialBackoffRetry(1000, 3));
		client.start();

		JsonInstanceSerializer<ComponentInfo> serializer = new JsonInstanceSerializer<ComponentInfo>(ComponentInfo.class);

        serviceDiscovery = ServiceDiscoveryBuilder.builder(ComponentInfo.class)
            .client(client)
            .basePath(PATH)
            .serializer(serializer)
            .build();
     
        try {
			serviceDiscovery.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void disconnectFromExternal() {
		CloseableUtils.closeQuietly(serviceDiscovery);
		CloseableUtils.closeQuietly(client);
	}

	@Override
	public ComponentRegistration createRegistration(Component component) throws ComponentRegistrationException {
		try {
			return new ZookeeperComponentRegistration(serviceDiscovery, component);
		} catch (Exception e) {
			throw new ComponentRegistrationException(e);
		}
	}

	@Override
	public List<ComponentInfo> getComponents(ComponentCategory category) {
		try {			
			Collection<ServiceInstance<ComponentInfo>> instances = serviceDiscovery.queryForInstances(category.toString());
			List<ComponentInfo> result = new ArrayList<>(instances.size());
			instances.forEach(i -> result.add(i.getPayload()));
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return new ArrayList<ComponentInfo>();
	}

	@Override
	public ComponentInfo getComponentById(ComponentCategory category, String id) {
		try {
			ServiceInstance<ComponentInfo> instance = serviceDiscovery.queryForInstance(category.toString(), id);
			if (instance != null) 
				return instance.getPayload();				 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ComponentInfo getComponentByName(ComponentCategory category, String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
