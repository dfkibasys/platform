package de.dfki.iui.basys.runtime.connector.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.manager.impl.ComponentManagerImpl;
import de.dfki.iui.basys.runtime.component.registry.impl.ZookeeperComponentRegistry;

public class BaseComponentTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	protected ZookeeperComponentRegistry registry;
	protected ComponentManagerImpl componentManager;
	
	protected Client communicationClient;
	protected ChannelPool sharedPool;
	protected ComponentContext context;
	protected ComponentConfiguration config1, config2, config3, registryConfig, managerConfig; 
	

	protected static final String communicationProviderImplementationJavaClass = "de.dfki.iui.basys.runtime.communication.provider.JmsCommunicationProvider";
	protected static final String communicationProviderConnectionString = "vm://localhost?broker.persistent=false";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// not really needed
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// not really needed
	}

	@Before
	public void setUp() throws Exception {
		registryConfig = new ComponentConfigurationImpl.Builder()
				.componentId("component-registry")
				.componentName("component-registry")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.externalConnectionString(ZookeeperComponentRegistry.defaultConnectionString)
				.build();	
		
		managerConfig = new ComponentConfigurationImpl.Builder()
				.componentId("component-manager")
				.componentName("component-manager")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.build();	

		config1 = new ComponentConfigurationImpl.Builder()
				.componentId("component-1")
				.componentName("component-1")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.build();		
		
		config2 = new ComponentConfigurationImpl.Builder()
				.componentId("component-2")
				.componentName("component-2")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.build();	
				
		config3 = new ComponentConfigurationImpl.Builder()
				.componentId("component-3")
				.componentName("component-3")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				.build();	
		
		
		

		
		communicationClient = ClientFactory.getInstance().createClient("client", null);
		sharedPool = ClientFactory.getInstance().connectJmsChannelPool(communicationClient, null);
		
		registry = new ZookeeperComponentRegistry(registryConfig);
		
		context = new ComponentContext.Builder().componentRegistry(registry).sharedChannelPool(sharedPool).build();
		
		registry.activate(context);
		
		componentManager = new ComponentManagerImpl(managerConfig);
		componentManager.activate(context);
	}

	@After
	public void tearDown() throws Exception {
		componentManager.deactivate();
		componentManager = null;
		
		communicationClient.disconnect();
		communicationClient = null;
				
		registry.deactivate();
		registry = null;
		
		context = null;
	}
	
	
}
