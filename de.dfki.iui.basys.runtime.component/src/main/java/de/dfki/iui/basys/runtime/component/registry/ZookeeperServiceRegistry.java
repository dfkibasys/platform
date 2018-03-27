package de.dfki.iui.basys.runtime.component.registry;

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

import de.dfki.iui.basys.runtime.component.ServiceComponent;

public class ZookeeperServiceRegistry implements ServiceRegistry {

	public static final String connectionString = "lns-90165.sb.dfki.de:2181";
	public static final String PATH = "basys";
	protected CuratorFramework client;

	private ServiceDiscovery<InstanceDetails> serviceDiscovery;

	public void activate() {
		client = CuratorFrameworkFactory.newClient(connectionString, new ExponentialBackoffRetry(1000, 3));
		client.start();

		JsonInstanceSerializer<InstanceDetails> serializer = new JsonInstanceSerializer<InstanceDetails>(InstanceDetails.class);

        serviceDiscovery = ServiceDiscoveryBuilder.builder(InstanceDetails.class)
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

	public void deactivate() {
		CloseableUtils.closeQuietly(serviceDiscovery);
		CloseableUtils.closeQuietly(client);
	}

	@Override
	public ZookeeperServiceRegistration createRegistration(ServiceComponent instance)
			throws ServiceRegistrationException {
		try {
			return new ZookeeperServiceRegistration(serviceDiscovery, "device", instance);
		} catch (Exception e) {
			throw new ServiceRegistrationException(e);
		}
	}

	@Override
	public List<InstanceDetails> getServices(String name) {		
		try {			
			Collection<ServiceInstance<InstanceDetails>> instances = serviceDiscovery.queryForInstances(name);
			List<InstanceDetails> result = new ArrayList<>(instances.size());
			instances.forEach(i -> result.add(i.getPayload()));
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return new ArrayList<InstanceDetails>();
	}

	@Override
	public InstanceDetails getService(String id) {
		try {
			ServiceInstance<InstanceDetails> instance = serviceDiscovery.queryForInstance("device", id);
			if (instance != null) 
				return instance.getPayload();				 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
