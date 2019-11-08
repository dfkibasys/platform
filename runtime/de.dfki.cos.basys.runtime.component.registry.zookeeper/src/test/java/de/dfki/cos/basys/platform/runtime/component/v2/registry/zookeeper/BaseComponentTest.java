package de.dfki.cos.basys.platform.runtime.component.v2.registry.zookeeper;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.communication.provider.JmsCommunicationProvider;
import de.dfki.cos.basys.platform.runtime.component.v2.registry.zookeeper.ZookeeperComponentRegistry;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponentContext;
import de.dfki.cos.basys.platform.runtime.component.v2.StringConstants;

public class BaseComponentTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected ComponentManagerImpl componentManager;
	
	protected Client communicationClient;
	protected ChannelPool sharedChannelPool;
	protected BasysComponentContext context;
	protected Properties managerConfig, registryConfig;
	protected Properties config1, config2, config3;
	
	protected ZookeeperComponentRegistry componentRegistry;
	
	@Before
	public void setUp() throws Exception {
		
		managerConfig = new Properties();
		managerConfig.put(StringConstants.id, "component-manager");
		managerConfig.put(StringConstants.name, "component-manager");
		managerConfig.put(StringConstants.category, StringConstants.categoryManagement);
		managerConfig.put(StringConstants.serviceConnectionString, StringConstants.testConfigurationFolder);
		managerConfig.put("recursive", "true");
		
		registryConfig = new Properties();
		registryConfig.put(StringConstants.id, "component-registry");
		registryConfig.put(StringConstants.name, "component-registry");
		registryConfig.put(StringConstants.category, StringConstants.categoryManagement);
		registryConfig.put(StringConstants.serviceConnectionString, ZookeeperComponentRegistry.defaultConnectionString);

		config1 = new Properties();
		config1.put(StringConstants.id, "component-1");
		config1.put(StringConstants.name, "component-1");
		config1.put(StringConstants.category, StringConstants.categoryDevice);
		config1.put(StringConstants.inChannelName, "component-1#in");
		config1.put(StringConstants.outChannelName, "component-1#out");

		config2 = new Properties();
		config2.put(StringConstants.id, "component-2");
		config2.put(StringConstants.name, "component-2");
		config2.put(StringConstants.category, StringConstants.categoryDevice);
		config1.put(StringConstants.inChannelName, "component-2#in");
		config1.put(StringConstants.outChannelName, "component-2#out");

		config3 = new Properties();
		config3.put(StringConstants.id, "component-3");
		config3.put(StringConstants.name, "component-3");
		config3.put(StringConstants.category, StringConstants.categoryDevice);
		config1.put(StringConstants.inChannelName, "component-3#in");
		config1.put(StringConstants.outChannelName, "component-3#out");
				
		communicationClient = CommFactory.getInstance().createClient("client", null);
		sharedChannelPool = CommFactory.getInstance().connectJmsChannelPool(communicationClient, null);	
		componentRegistry = new ZookeeperComponentRegistry(registryConfig);
		//componentManager = new ComponentManagerImpl(managerConfig);
		
		context = BasysComponentContext.getStaticContext();
		context.setSharedChannelPool(sharedChannelPool);
		context.setComponentRegistry(componentRegistry);
		context.setComponentManager(componentManager);
				
		componentRegistry.activate(context);		
		//componentManager.activate(context);
	}

	@After
	public void tearDown() throws Exception {
		//componentManager.deactivate();
		//componentManager = null;
		
		componentRegistry.deactivate();
		componentRegistry = null;
		
		communicationClient.disconnect();
		communicationClient = null;
		
		context = null;
	}
	
	protected void printClassPath() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        System.out.println("####################################################");
        System.out.println("");
        for(URL url: urls){
        	System.out.println(url.getFile());
        }
        System.out.println("");
        System.out.println("####################################################");
	}
	
	protected void sleep(long seconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
