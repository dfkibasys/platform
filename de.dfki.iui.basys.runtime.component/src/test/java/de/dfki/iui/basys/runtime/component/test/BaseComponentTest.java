package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.OpcUaDeviceComponent;
import de.dfki.iui.basys.runtime.component.device.packml.Mode;
import de.dfki.iui.basys.runtime.component.device.packml.State;
import de.dfki.iui.basys.runtime.component.registry.ZookeeperComponentRegistry;

public class BaseComponentTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	protected ZookeeperComponentRegistry registry;
	protected Client communicationClient;
	protected ChannelPool sharedPool;
	protected ComponentContext context;
	protected ComponentConfiguration config1, config2, config3; 
	
	
	protected static final String jmsProviderImplementationJavaClass = "de.dfki.iui.basys.runtime.communication.provider.JmsCommunicationProvider";
	
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
		ComponentConfiguration regConfig = new ComponentConfiguration.Builder()
				.componentId("registry")
				.componentName("registry")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(jmsProviderImplementationJavaClass)
				.externalConnectionString(ZookeeperComponentRegistry.defaultConnectionString)
				.build();	
		registry = new ZookeeperComponentRegistry(regConfig);
		registry.activate(null);
		
		communicationClient = ClientFactory.getInstance().createClient("client", null);
		sharedPool = ClientFactory.getInstance().connectJmsChannelPool(communicationClient, null);
		
		context = new ComponentContext.Builder().componentRegistry(registry).sharedChannelPool(sharedPool).build();
		
		config1 = new ComponentConfiguration.Builder()
				.componentId("service1")
				.componentName("service1")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(jmsProviderImplementationJavaClass)
				.build();		
		
		config2 = new ComponentConfiguration.Builder()
				.componentId("service2")
				.componentName("service2")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(jmsProviderImplementationJavaClass)
				.build();	
				
		config3 = new ComponentConfiguration.Builder()
				.componentId("service3")
				.componentName("service3")
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.test.TestDeviceComponent")
				.communicationProviderImplementationJavaClass(jmsProviderImplementationJavaClass)
				.build();	
	}

	@After
	public void tearDown() throws Exception {
		registry.deactivate();
		registry = null;
		
		communicationClient.disconnect();
	}
	
	
}
