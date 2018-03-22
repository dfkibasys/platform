package de.dfki.iui.basys.runtime.component.registry;

import java.io.Closeable;
import java.io.IOException;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.utils.CloseableUtils;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.UriSpec;
import org.apache.curator.x.discovery.details.JsonInstanceSerializer;

public class ZookeeperServiceRegistration implements Closeable, ServiceRegistration {

    private final ServiceDiscovery<InstanceDetails> serviceDiscovery;
    private final ServiceInstance<InstanceDetails> thisInstance;

    public ZookeeperServiceRegistration(CuratorFramework client, String path, String serviceName, InstanceDetails details) throws Exception
    {
        // in a real application, you'd have a convention of some kind for the URI layout
        UriSpec     uriSpec = new UriSpec("{scheme}://foo.com:{port}");

        thisInstance = ServiceInstance.<InstanceDetails>builder()
            .name(serviceName)
            .payload(details)
            .port((int)(65535 * Math.random())) // in a real application, you'd use a common port
            .uriSpec(uriSpec)
            .build();

        // if you mark your payload class with @JsonRootName the provided JsonInstanceSerializer will work
        JsonInstanceSerializer<InstanceDetails> serializer = new JsonInstanceSerializer<InstanceDetails>(InstanceDetails.class);

        serviceDiscovery = ServiceDiscoveryBuilder.builder(InstanceDetails.class)
            .client(client)
            .basePath(path)
            .serializer(serializer)
            .thisInstance(thisInstance)
            .build();
    }

    public ServiceInstance<InstanceDetails> getThisInstance()
    {
        return thisInstance;
    }

    /* (non-Javadoc)
	 * @see de.dfki.iui.basys.runtime.component.registry.ServiceRegistration#register()
	 */
    @Override
	public void register() throws ServiceRegistrationException
    {
        try {
			serviceDiscovery.start();
		} catch (Exception e) {
			throw new ServiceRegistrationException(e);
		}
    }

	/* (non-Javadoc)
	 * @see de.dfki.iui.basys.runtime.component.registry.ServiceRegistration#unregister()
	 */
    @Override
	public void unregister() throws ServiceRegistrationException
    {
        try {
			close();
		} catch (IOException e) {
			throw new ServiceRegistrationException(e);
		}
    }
    

	@Override
	public void close() throws IOException {
		CloseableUtils.closeQuietly(serviceDiscovery);
		
	}
	
}
