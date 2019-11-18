package de.dfki.cos.basys.platform.runtime.component.v2.registry.zookeeper;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.curator.x.discovery.ServiceInstance;

import de.dfki.cos.basys.platform.runtime.communication.CommUtils;
import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.impl.BaseComponent;
import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.common.component.registry.ComponentRegistration;
import de.dfki.cos.basys.common.component.registry.ComponentRegistrationException;
import de.dfki.cos.basys.common.component.registry.ComponentRegistry;
import de.dfki.cos.basys.common.component.registry.ComponentRegistryObserver;

public class ZookeeperComponentRegistry extends BaseComponent implements ComponentRegistry, ComponentRegistryObserver {

	public static String defaultConnectionString;

	private Map<String, ComponentInfo> componentCache = new HashMap<>();
	
	static {
		try {
			String serverName = CommUtils.getPreferredBasysMiddleware();
			defaultConnectionString = String.format("%s:2181", serverName);			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	public ZookeeperComponentRegistry(Properties config) {
		super(config);	
		
		if (!config.contains(StringConstants.serviceConnectionString)) {
			config.setProperty(StringConstants.serviceConnectionString, defaultConnectionString);			
			LOGGER.warn("External connection string not provided. Defaulting to " + defaultConnectionString);
		}
		
		serviceManager = new ServiceManagerImpl<ZookeeperClient>(config, ZookeeperClient::new);
		ZookeeperClient client = getService();		
		client.setObserver(this);
	}

	

	@Override
	public ComponentRegistration createRegistration(Component component) throws ComponentRegistrationException {
		try {
			ZookeeperClient client = getService();
			return new ZookeeperComponentRegistration(client.getServiceDiscovery(), component);
		} catch (Exception e) {
			throw new ComponentRegistrationException(e);
		}
	}

	@Override
	public List<ComponentInfo> getComponents(String category) {
		try {		 			
			ZookeeperClient client = getService();
			Collection<ServiceInstance<ComponentInfo>> instances = client.getServiceDiscovery().queryForInstances(category.toString());
			List<ComponentInfo> result = new ArrayList<>(instances.size());
			instances.forEach(i -> result.add(i.getPayload()));
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<ComponentInfo>();
	}

	@Override
	public ComponentInfo getComponentById(String category, String id) {
		try {
			ZookeeperClient client = getService();
			ServiceInstance<ComponentInfo> instance = client.getServiceDiscovery().queryForInstance(category.toString(), id);
			if (instance != null)
				return instance.getPayload();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ComponentInfo getComponentByName(String category, String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * ComponentRegistryObserver
	 */
	

	@Override
	public ComponentInfo getComponentInfo(String componentId) {
		return componentCache.get(componentId);
	}
	
	@Override
	public void handleComponentAdded(ComponentInfo info) {
		componentCache.put(info.getId(), info);
//		if (outChannel != null) {
//			Notification not = CommFactory.getInstance().createNotification("");
//			outChannel.sendNotification(not);
//		}
	}

	@Override
	public void handleComponentUpdated(ComponentInfo info) {
		componentCache.put(info.getId(), info);
//		if (outChannel != null) {
//			Notification not = CommFactory.getInstance().createNotification("");
//			outChannel.sendNotification(not);
//		}
	}

	@Override
	public void handleComponentRemoved(ComponentInfo info) {
		componentCache.remove(info.getId(), info);
//		if (outChannel != null) {
//			Notification not = CommFactory.getInstance().createNotification("");
//			outChannel.sendNotification(not);
//		}
	}

}
