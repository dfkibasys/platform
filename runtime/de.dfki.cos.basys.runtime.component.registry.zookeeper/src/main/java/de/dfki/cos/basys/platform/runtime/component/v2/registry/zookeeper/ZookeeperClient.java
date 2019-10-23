package de.dfki.cos.basys.platform.runtime.component.v2.registry.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.CloseableUtils;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.details.InstanceSerializer;
import org.apache.curator.x.discovery.details.JsonInstanceSerializer;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.common.component.FunctionalClient;
import de.dfki.cos.basys.platform.runtime.component.v2.StringConstants;
import de.dfki.cos.basys.platform.runtime.component.v2.registry.ComponentRegistryObserver;

public class ZookeeperClient implements FunctionalClient, PathChildrenCacheListener {

	public static final String PATH = "/basys/registry";
	
	protected CuratorFramework client;	
	private ServiceDiscovery<ComponentInfo> serviceDiscovery;
	private InstanceSerializer<ComponentInfo> serializer;
	private PathChildrenCache managementCache, serviceCache, deviceCache;
	
	private ComponentRegistryObserver observer = null;
	
	public ZookeeperClient() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		serializer = new JsonInstanceSerializer<ComponentInfo>(ComponentInfo.class);
		client = CuratorFrameworkFactory.newClient(connectionString, new ExponentialBackoffRetry(1000, 3));
		serviceDiscovery = ServiceDiscoveryBuilder.builder(ComponentInfo.class).client(client).basePath(PATH).serializer(serializer).build();
		managementCache = new PathChildrenCache(client, PATH + "/" + StringConstants.categoryManagement, true);
		serviceCache = new PathChildrenCache(client, PATH + "/" + StringConstants.categoryService, true);
		deviceCache = new PathChildrenCache(client, PATH + "/" + StringConstants.categoryDevice, true);
		addListener(this);
//		managementCache.getListenable().addListener(this);
//		serviceCache.getListenable().addListener(this);
//		deviceCache.getListenable().addListener(this);	
		
		try {
			client.start();
			serviceDiscovery.start();
			managementCache.start();
			serviceCache.start();
			deviceCache.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean disconnect() {
		CloseableUtils.closeQuietly(managementCache);
		CloseableUtils.closeQuietly(serviceCache);
		CloseableUtils.closeQuietly(deviceCache);
		CloseableUtils.closeQuietly(serviceDiscovery);
		CloseableUtils.closeQuietly(client);
		return true;
	}

	public ServiceDiscovery<ComponentInfo> getServiceDiscovery() {
		return serviceDiscovery;
	}
	
	public void setObserver(ComponentRegistryObserver observer) {
		this.observer = observer;		
	}
	
	public ComponentRegistryObserver getObserver() {
		return observer;
	}
	
	@Override
	public void childEvent(CuratorFramework client, PathChildrenCacheEvent event) throws Exception {
		if (observer == null)
			return;
		
		switch (event.getType()) {
		case CHILD_ADDED: {
			//LOGGER.info(event.getType() + ": " + event.getData().getPath());
			ServiceInstance<ComponentInfo> info = serializer.deserialize(event.getData().getData());
			observer.handleComponentAdded(info.getPayload());
			break;
		}
		case CHILD_UPDATED: {
			//LOGGER.info(event.getType() + ": " + event.getData().getPath());
			ServiceInstance<ComponentInfo> info = serializer.deserialize(event.getData().getData());
			observer.handleComponentUpdated(info.getPayload());
			break;
		}
		case CHILD_REMOVED: {
			//LOGGER.info(event.getType() + ": " + event.getData().getPath());
			ServiceInstance<ComponentInfo> info = serializer.deserialize(event.getData().getData());
			observer.handleComponentRemoved(info.getPayload());
			break;
		}
		default:
		}
	}
	
	public void addListener(PathChildrenCacheListener listener) {
		managementCache.getListenable().addListener(listener);
		serviceCache.getListenable().addListener(listener);
		deviceCache.getListenable().addListener(listener);	
	}
	
	public void removeListener(PathChildrenCacheListener listener) {
		managementCache.getListenable().removeListener(listener);
		serviceCache.getListenable().removeListener(listener);
		deviceCache.getListenable().removeListener(listener);	
	}
}
