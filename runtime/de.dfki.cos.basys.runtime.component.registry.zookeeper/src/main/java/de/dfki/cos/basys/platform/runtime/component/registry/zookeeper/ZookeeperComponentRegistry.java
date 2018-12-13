package de.dfki.cos.basys.platform.runtime.component.registry.zookeeper;

import java.net.UnknownHostException;
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

import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.runtime.communication.CommUtils;
import de.dfki.cos.basys.platform.runtime.component.BaseComponent;
import de.dfki.cos.basys.platform.runtime.component.Component;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistration;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistrationException;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistry;

public class ZookeeperComponentRegistry extends BaseComponent implements ComponentRegistry {

	public static String defaultConnectionString;
	public static final String PATH = "/basys/registry";
	protected CuratorFramework client;

	private ServiceDiscovery<ComponentInfo> serviceDiscovery;

	static {
		try {
			String serverName = CommUtils.getPreferredBasysMiddleware();
			defaultConnectionString = String.format("%s:2181", serverName);			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	public ZookeeperComponentRegistry(ComponentConfiguration config) {
		super(config);
		
		if (componentConfig.getExternalConnectionString() == null) {
			componentConfig.setExternalConnectionString(defaultConnectionString);			
			LOGGER.warn("External connection string not provided. Defaulting to " + defaultConnectionString);
		} 
		client = CuratorFrameworkFactory.newClient(componentConfig.getExternalConnectionString(), new ExponentialBackoffRetry(1000, 3));

		JsonInstanceSerializer<ComponentInfo> serializer = new JsonInstanceSerializer<ComponentInfo>(ComponentInfo.class, false);

		serviceDiscovery = ServiceDiscoveryBuilder.builder(ComponentInfo.class).client(client).basePath(PATH).serializer(serializer).build();

	}

	@Override
	public void connectToExternal() throws ComponentException {

		try {
			client.start();
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
