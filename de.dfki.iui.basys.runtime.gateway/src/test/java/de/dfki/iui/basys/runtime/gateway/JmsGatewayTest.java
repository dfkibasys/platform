package de.dfki.iui.basys.runtime.gateway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;

public class JmsGatewayTest extends BaseComponentTest {


	private String testMessage = "this message is sent via a gateway.";
	
	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
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
			
			componentManager.createLocalComponent(jmsGatewayConfig);
			
			JmsGatewayComponent gateway = (JmsGatewayComponent) componentManager.getLocalComponentById(jmsGatewayConfig.getComponentId());
			gateway.installOutgoingChannel("test#gateway#out", "test.gateway.in");
			
			ChannelPool externalPool = ClientFactory.getInstance().connectJmsChannelPool(communicationClient, communicationProviderConnectionString);
			Channel externalChannel = ClientFactory.getInstance().openChannel(externalPool, "test#gateway#in", false, new ChannelListener() {
				
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
			
			
			Channel out = ClientFactory.getInstance().openChannel(sharedPool, "test#gateway#out", false, null);
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
			
			componentManager.createLocalComponent(jmsGatewayConfig);
			
			JmsGatewayComponent gateway = (JmsGatewayComponent) componentManager.getLocalComponentById(jmsGatewayConfig.getComponentId());
			gateway.installIncomingChannel("test.gateway.out", "test#gateway#in");
			
			ChannelPool externalPool = ClientFactory.getInstance().connectJmsChannelPool(communicationClient, communicationProviderConnectionString);
			Channel externalChannel = ClientFactory.getInstance().openChannel(externalPool, "test#gateway#out", false, null); 
					
				
					
			Channel in = ClientFactory.getInstance().openChannel(sharedPool, "test#gateway#in", false, new ChannelListener() {
				
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
