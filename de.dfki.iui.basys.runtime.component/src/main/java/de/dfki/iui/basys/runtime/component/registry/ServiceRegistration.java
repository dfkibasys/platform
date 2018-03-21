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

public class ServiceRegistration implements Closeable {

    private final ServiceDiscovery<InstanceDetails> serviceDiscovery;
    private final ServiceInstance<InstanceDetails> thisInstance;

    public ServiceRegistration(CuratorFramework client, String path, String serviceName, String productName, String description, int drillPower) throws Exception
    {
        // in a real application, you'd have a convention of some kind for the URI layout
        UriSpec     uriSpec = new UriSpec("{scheme}://foo.com:{port}");

        thisInstance = ServiceInstance.<InstanceDetails>builder()
            .name(serviceName)
            .payload(new InstanceDetails(productName, description, drillPower))
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

    public void start() throws Exception
    {
        serviceDiscovery.start();
    }

	
	public void close() throws IOException {
		CloseableUtils.closeQuietly(serviceDiscovery);
		
	}
	
}
