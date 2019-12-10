package de.dfki.cos.basys.platform.runtime.processcontrol;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.BasysComponentContext;

public class BaseComponentTest {


	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected ComponentManagerImpl componentManager;
	
	protected Client communicationClient;
	protected ChannelPool sharedChannelPool;
	protected BasysComponentContext context;
	protected Properties managerConfig;
	boolean enableComm = false;
	
	@Before
	public void setUp() throws Exception {

		context = BasysComponentContext.getStaticContext();
		
		managerConfig = new Properties();
		managerConfig.put(StringConstants.id, "component-manager");
		managerConfig.put(StringConstants.name, "component-manager");
		managerConfig.put(StringConstants.category, StringConstants.categoryManagement);
		managerConfig.put(StringConstants.serviceConnectionString, StringConstants.testConfigurationFolder);
		
		if (enableComm) {
			communicationClient = CommFactory.getInstance().createClient("client", null);
			sharedChannelPool = CommFactory.getInstance().connectJmsChannelPool(communicationClient, null);
			context.setSharedChannelPool(sharedChannelPool);
		}
		
		componentManager = new ComponentManagerImpl(managerConfig);		
		componentManager.activate(context);
		
	}

	@After
	public void tearDown() throws Exception {
		componentManager.deactivate();
		componentManager = null;
		
		if (communicationClient != null) {
			communicationClient.disconnect();
			communicationClient = null;
		}
		
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
