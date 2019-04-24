package de.dfki.cos.basys.platform.runtime.gateway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.communication.provider.JmsCommunicationProvider;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.runtime.gateway.JmsGatewayComponent;

public class JmsGatewayTest extends BaseComponentTest {


	private String testMessage = "this message is sent via a gateway.";
	
	protected static ComponentConfiguration gatewayConfig; 
	
	
	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		
		gatewayConfig = new ComponentConfigurationImpl.Builder()
				.componentId("jms-gateway")
				.componentName("jms-gateway-component")
				.componentCategory(ComponentCategory.MANAGEMENT_COMPONENT)
				.componentImplementationJavaClass("de.dfki.cos.basys.platform.runtime.gateway.JmsGatewayComponent")
				.inChannelName("jmsgateway#in")
				.outChannelName("jmsgateway#out")
				.externalConnectionString(JmsCommunicationProvider.defaultConnectionString)
				.build();
		
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testInstallOutgoingChannel() {

		CountDownLatch counter = new CountDownLatch(2);
		
		try {
			
			componentManager.createLocalComponent(gatewayConfig);
			
			JmsGatewayComponent gateway = (JmsGatewayComponent) componentManager.getLocalComponentById(gatewayConfig.getComponentId());
			gateway.installOutgoingChannel("test#gateway#out", "test.gateway.in");
			
			ChannelPool externalPool = CommFactory.getInstance().connectJmsChannelPool(communicationClient, gatewayConfig.getExternalConnectionString());
			Channel externalChannel = CommFactory.getInstance().openChannel(externalPool, "test#gateway#in", false, new ChannelListener() {
				
				@Override
				public Response handleRequest(Channel channel, Request req) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void handleNotification(Channel channel, Notification not) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void handleMessage(Channel channel, String msg) {
					LOGGER.info(msg);	
					assertEquals(testMessage, msg);
					counter.countDown();
				}
			});
			
			
			Channel out = CommFactory.getInstance().openChannel(sharedPool, "test#gateway#out", false, null);
			out.sendMessage(testMessage);
			sleep(1);
			out.sendMessage(testMessage);
			
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean ready = false;
		
		try {
			ready = counter.await(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (!ready)
			fail("Did not receive 2 messages in time.");
		
	}

	@Test
	public void testInstallIncomingChannel() {
		CountDownLatch counter = new CountDownLatch(2);
		
		try {
			
			componentManager.createLocalComponent(gatewayConfig);
			
			JmsGatewayComponent gateway = (JmsGatewayComponent) componentManager.getLocalComponentById(gatewayConfig.getComponentId());
			gateway.installIncomingChannel("test.gateway.out", "test#gateway#in");
			
			ChannelPool externalPool = CommFactory.getInstance().connectJmsChannelPool(communicationClient, gatewayConfig.getExternalConnectionString());
			Channel externalChannel = CommFactory.getInstance().openChannel(externalPool, "test#gateway#out", false, null); 
					
				
					
			Channel in = CommFactory.getInstance().openChannel(sharedPool, "test#gateway#in", false, new ChannelListener() {
				
				@Override
				public Response handleRequest(Channel channel, Request req) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void handleNotification(Channel channel, Notification not) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void handleMessage(Channel channel, String msg) {
					LOGGER.info(msg);	
					assertEquals(testMessage, msg);
					counter.countDown();
				}
			});			
			
			
			externalChannel.sendMessage(testMessage);
			sleep(1);
			externalChannel.sendMessage(testMessage);
			
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean ready = false;
		
		try {
			ready = counter.await(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (!ready)
			fail("Did not receive 2 messages in time.");
		
	}

}
