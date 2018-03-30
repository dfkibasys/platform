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
import de.dfki.iui.basys.runtime.component.OpcUaComponent;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration.CommunicationProviderEnum;
import de.dfki.iui.basys.runtime.component.packml.Mode;
import de.dfki.iui.basys.runtime.component.packml.State;
import de.dfki.iui.basys.runtime.component.registry.InstanceDetails;
import de.dfki.iui.basys.runtime.component.registry.ServiceRegistry;
import de.dfki.iui.basys.runtime.component.registry.ZookeeperServiceRegistry;

public class BaseComponentTest {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	protected ZookeeperServiceRegistry registry;
	protected Client communicationClient;
	protected ChannelPool sharedPool;
	protected ComponentContext context;
	
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
		registry = new ZookeeperServiceRegistry();
		registry.activate();
		
		communicationClient = ClientFactory.getInstance().createClient("client", null);
		sharedPool = ClientFactory.getInstance().connectJmsChannelPool(communicationClient, null);
		
		context = new ComponentContext().setServiceRegistry(registry).setSharedChannelPool(sharedPool);
	}

	@After
	public void tearDown() throws Exception {
		registry.deactivate();
		registry = null;
		
		communicationClient.disconnect();
	}
	
	
}
