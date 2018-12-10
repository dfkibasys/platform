package de.dfki.cos.basys.platform.runtime.services.worldmodelManager;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.communication.provider.JmsCommunicationProvider;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.platform.runtime.component.registry.zookeeper.ZookeeperComponentRegistry;
import de.dfki.cos.basys.platform.runtime.component.registry.zookeeper.ZookeeperComponentRegistryObserver;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Client;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;

public class BaseComponentTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected ComponentManagerImpl componentManager;

	protected Client communicationClient;
	protected ChannelPool sharedPool;
	protected ComponentContext context;
	protected ComponentConfiguration managerConfig;

	protected ZookeeperComponentRegistry registry;
	protected ZookeeperComponentRegistryObserver observer;

	protected ComponentConfiguration registryConfig, observerConfig;

	@Before
	public void setUp() throws Exception {

		managerConfig = new ComponentConfigurationImpl.Builder().componentId("component-manager")
				.componentName("component-manager").componentCategory(ComponentCategory.MANAGEMENT_COMPONENT).build();

		registryConfig = new ComponentConfigurationImpl.Builder().componentId("component-registry")
				.componentName("component-registry").componentCategory(ComponentCategory.MANAGEMENT_COMPONENT)
				.externalConnectionString(ZookeeperComponentRegistry.defaultConnectionString).build();

		observerConfig = new ComponentConfigurationImpl.Builder().componentId("component-registry-observer")
				.componentName("component-registry-observer").componentCategory(ComponentCategory.MANAGEMENT_COMPONENT)
				.externalConnectionString(ZookeeperComponentRegistry.defaultConnectionString).build();

		registry = new ZookeeperComponentRegistry(registryConfig);
		observer = new ZookeeperComponentRegistryObserver(observerConfig);
		componentManager = new ComponentManagerImpl(managerConfig);

		communicationClient = CommFactory.getInstance().createClient("client", null);
		sharedPool = CommFactory.getInstance().connectJmsChannelPool(communicationClient, null);
		context = new ComponentContext.Builder().sharedChannelPool(sharedPool).componentRegistry(registry)
				.componentManager(componentManager).build();

		registry.activate(context);
		observer.activate(context);
		componentManager.activate(context);
	}

	@After
	public void tearDown() throws Exception {
		componentManager.deactivate();
		componentManager = null;

		observer.deactivate();
		observer = null;

		registry.deactivate();
		registry = null;

		communicationClient.disconnect();
		communicationClient = null;

		context = null;
	}

	protected void printClassPath() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();

		URL[] urls = ((URLClassLoader) cl).getURLs();

		System.out.println("####################################################");
		System.out.println("");
		for (URL url : urls) {
			System.out.println(url.getFile());
		}
		System.out.println("");
		System.out.println("####################################################");
	}

}