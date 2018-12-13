package de.dfki.cos.basys.platform.runtime.component.registry.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.CloseableUtils;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.details.JsonInstanceSerializer;

import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.BaseComponent;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.registry.ComponentRegistryObserver;

public class ZookeeperComponentRegistryObserver extends BaseComponent implements ComponentRegistryObserver, PathChildrenCacheListener {

	public static final String defaultConnectionString = "10.2.10.4:2181";
	public static final String PATH = "/basys/registry";
	private CuratorFramework client;
	private JsonInstanceSerializer<ComponentInfo> serializer;
	private PathChildrenCache managementCache, serviceCache, deviceCache;

	public ZookeeperComponentRegistryObserver(ComponentConfiguration config) {
		super(config);

		String connectionString = defaultConnectionString;
		if (componentConfig.getExternalConnectionString() != null) {
			connectionString = componentConfig.getExternalConnectionString();
		}
		client = CuratorFrameworkFactory.newClient(connectionString, new ExponentialBackoffRetry(1000, 3));

		serializer = new JsonInstanceSerializer<ComponentInfo>(ComponentInfo.class);

		managementCache = new PathChildrenCache(client, PATH + "/" + ComponentCategory.MANAGEMENT_COMPONENT.getName(), true);
		managementCache.getListenable().addListener(this);
		
		serviceCache = new PathChildrenCache(client, PATH + "/" + ComponentCategory.SERVICE_COMPONENT.getName(), true);
		serviceCache.getListenable().addListener(this);
		
		deviceCache = new PathChildrenCache(client, PATH + "/" + ComponentCategory.DEVICE_COMPONENT.getName(), true);
		deviceCache.getListenable().addListener(this);

	}

	@Override
	public void connectToExternal() throws ComponentException {
		try {
			client.start();
			managementCache.start();
			serviceCache.start();
			deviceCache.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void disconnectFromExternal() {
		CloseableUtils.closeQuietly(managementCache);
		CloseableUtils.closeQuietly(serviceCache);
		CloseableUtils.closeQuietly(deviceCache);
		CloseableUtils.closeQuietly(client);
	}

	@Override
	public void childEvent(CuratorFramework client, PathChildrenCacheEvent event) throws Exception {
		switch (event.getType()) {
		case CHILD_ADDED: {
			LOGGER.info(event.getType() + ": " + event.getData().getPath());
			ServiceInstance<ComponentInfo> info = serializer.deserialize(event.getData().getData());			
			handleComponentAdded(info.getPayload());
			break;
		}
		case CHILD_UPDATED: {
			LOGGER.info(event.getType() + ": " + event.getData().getPath());
			ServiceInstance<ComponentInfo> info = serializer.deserialize(event.getData().getData());			
			handleComponentUpdated(info.getPayload());
			break;
		}
		case CHILD_REMOVED: {
			LOGGER.info(event.getType() + ": " + event.getData().getPath());
			ServiceInstance<ComponentInfo> info = serializer.deserialize(event.getData().getData());			
			handleComponentRemoved(info.getPayload());
			break;
		}
		}
	}

	@Override
	public void handleComponentAdded(ComponentInfo info) {		
		if (outChannel != null) {
			Notification not = CommFactory.getInstance().createNotification("");
			outChannel.sendNotification(not);
		}
	}

	@Override
	public void handleComponentUpdated(ComponentInfo info) {
		if (outChannel != null) {
			Notification not = CommFactory.getInstance().createNotification("");
			outChannel.sendNotification(not);
		}
	}

	@Override
	public void handleComponentRemoved(ComponentInfo info) {
		if (outChannel != null) {
			Notification not = CommFactory.getInstance().createNotification("");
			outChannel.sendNotification(not);
		}
	}

}
