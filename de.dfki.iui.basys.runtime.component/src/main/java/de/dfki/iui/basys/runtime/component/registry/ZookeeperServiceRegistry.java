package de.dfki.iui.basys.runtime.component.registry;

import java.util.List;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.CloseableUtils;

import de.dfki.iui.basys.runtime.component.ServiceComponent;

public class ZookeeperServiceRegistry implements ServiceRegistry {

	public static final String connectionString = "lns-90165.sb.dfki.de:2181";
	public static final String PATH = "";
	protected CuratorFramework client;	
	
	
	public void activate() {
		 client = CuratorFrameworkFactory.newClient(connectionString, new ExponentialBackoffRetry(1000, 3));
		 client.start();
	}

	public void deactivate() {
		CloseableUtils.closeQuietly(client);
	}
	
	@Override
	public ZookeeperServiceRegistration createRegistration(ServiceComponent instance) throws ServiceRegistrationException {
		
		InstanceDetails details = new InstanceDetails("in","out");
		
		try {
			return new ZookeeperServiceRegistration(client, PATH, "basys", details);
		} catch (Exception e) {
			throw new ServiceRegistrationException(e);
		}
			
	}

	@Override
	public List<InstanceDetails> getServices(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstanceDetails getService(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
