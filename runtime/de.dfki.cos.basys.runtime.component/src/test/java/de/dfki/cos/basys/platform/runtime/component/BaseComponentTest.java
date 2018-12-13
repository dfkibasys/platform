package de.dfki.cos.basys.platform.runtime.component;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.communication.provider.JmsCommunicationProvider;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.manager.impl.ComponentManagerImpl;

public class BaseComponentTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected ComponentManagerImpl componentManager;
	
	protected Client communicationClient;
	protected ChannelPool sharedPool;
	protected ComponentContext context;
	protected ComponentConfiguration config1, config2, config3, managerConfig; 
	
	@Before
	public void setUp() throws Exception {
				
		managerConfig = new ComponentConfigurationImpl.Builder()
				.componentId("component-manager")
				.componentName("component-manager")
				.componentCategory(ComponentCategory.MANAGEMENT_COMPONENT)
				.build();	

		config1 = new ComponentConfigurationImpl.Builder()
				.componentId("component-1")
				.componentName("component-1")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.TestDeviceComponent")
				.inChannelName("component1#in")
				.outChannelName("component1#out")
				.build();		
		
		config2 = new ComponentConfigurationImpl.Builder()
				.componentId("component-2")
				.componentName("component-2")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.TestDeviceComponent")
				.inChannelName("component2#in")
				.outChannelName("component2#out")
				.build();	
				
		config3 = new ComponentConfigurationImpl.Builder()
				.componentId("component-3")
				.componentName("component-3")
				.componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.TestDeviceComponent")
				.inChannelName("component3#in")
				.outChannelName("component3#out")
				.build();	
				
		communicationClient = CommFactory.getInstance().createClient("client", null);
		sharedPool = CommFactory.getInstance().connectJmsChannelPool(communicationClient, null);	

		context = new ComponentContext.Builder().sharedChannelPool(sharedPool).build();
		
		componentManager = new ComponentManagerImpl(managerConfig);				
		componentManager.activate(context);
	}

	@After
	public void tearDown() throws Exception {
		componentManager.deactivate();
		componentManager = null;
		
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
