package de.dfki.iui.basys.runtime.connector.test;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.manager.impl.ComponentManagerImpl;
import de.dfki.iui.basys.runtime.component.registry.impl.ZookeeperComponentRegistry;
import de.dfki.iui.basys.runtime.component.registry.impl.ZookeeperComponentRegistryObserver;

public class BaseComponentTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected ZookeeperComponentRegistry registry;
	protected ZookeeperComponentRegistryObserver observer;
	protected ComponentManagerImpl componentManager;
	
	protected Client communicationClient;
	protected ChannelPool sharedPool;
	protected ComponentContext context;
	protected ComponentConfiguration config1, config2, config3, registryConfig, observerConfig, managerConfig; 
	

	protected static final String communicationProviderImplementationJavaClass = "de.dfki.iui.basys.runtime.communication.provider.JmsCommunicationProvider";
	protected static final String communicationProviderConnectionString = "tcp://10.2.10.4:61616";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// not really needed
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// not really needed
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
	
	@Before
	public void setUp() throws Exception {
		
		registryConfig = new ComponentConfigurationImpl.Builder()
				.componentId("component-registry")
				.componentName("component-registry")
				.componentCategory(ComponentCategory.MANAGEMENT_COMPONENT)
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.externalConnectionString(ZookeeperComponentRegistry.defaultConnectionString)
				.build();	
		
		observerConfig = new ComponentConfigurationImpl.Builder()
				.componentId("component-registry-observer")
				.componentName("component-registry-observer")
				.componentCategory(ComponentCategory.MANAGEMENT_COMPONENT)
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.externalConnectionString(ZookeeperComponentRegistry.defaultConnectionString)
				.build();	
		
		
		managerConfig = new ComponentConfigurationImpl.Builder()
				.componentId("component-manager")
				.componentName("component-manager")
				.componentCategory(ComponentCategory.MANAGEMENT_COMPONENT)
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.build();	

		config1 = new ComponentConfigurationImpl.Builder()
				.componentId("component-1")
				.componentName("component-1")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.inChannelName("component1#in")
				.outChannelName("component1#out")
				.build();		
		
		config2 = new ComponentConfigurationImpl.Builder()
				.componentId("component-2")
				.componentName("component-2")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.inChannelName("component2#in")
				.outChannelName("component2#out")
				.build();	
				
		config3 = new ComponentConfigurationImpl.Builder()
				.componentId("component-3")
				.componentName("component-3")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.inChannelName("component3#in")
				.outChannelName("component3#out")
				.build();	
		
		
		

		
		communicationClient = ClientFactory.getInstance().createClient("client", null);
		sharedPool = ClientFactory.getInstance().connectJmsChannelPool(communicationClient, communicationProviderConnectionString);
		
		registry = new ZookeeperComponentRegistry(registryConfig);
		observer = new ZookeeperComponentRegistryObserver(observerConfig);
		componentManager = new ComponentManagerImpl(managerConfig);
		
		context = new ComponentContext.Builder().componentRegistry(registry).sharedChannelPool(sharedPool).build();
		
		registry.activate(context);
		observer.activate(context);
		
		componentManager.activate(context);
	}

	@After
	public void tearDown() throws Exception {
		componentManager.deactivate();
		componentManager = null;
		
		communicationClient.disconnect();
		communicationClient = null;
				
		observer.deactivate();
		observer = null;
		
		registry.deactivate();
		registry = null;
		
		context = null;
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
