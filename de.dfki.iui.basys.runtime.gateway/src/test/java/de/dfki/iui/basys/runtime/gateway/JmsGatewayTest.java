package de.dfki.iui.basys.runtime.gateway;

import static org.junit.Assert.assertEquals;

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

		String testMessage = "this message is sent via a gateway.";
		
		try {
			
			componentManager.createLocalComponent(jmsGatewayConfig);
			
			JmsGatewayComponent gateway = (JmsGatewayComponent) componentManager.getLocalComponentById(jmsGatewayConfig.getComponentId());
			gateway.installOutgoingChannel("test#gateway#out", "test.gateway.in");
			
			ChannelPool externalPool = ClientFactory.getInstance().connectJmsChannelPool(communicationClient, communicationProviderConnectionString);
			Channel externalChannel = ClientFactory.getInstance().openChannel(externalPool, "test#gateway#in", false, new ChannelListener() {
				
				@Override
				public Response handleRequest(Request req) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void handleNotification(Notification not) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void handleMessage(String msg) {
					LOGGER.info(msg);	
					assertEquals(testMessage, msg);
				}
			});
			
			
			Channel out = ClientFactory.getInstance().openChannel(sharedPool, "test#gateway#out", false, null);
			out.sendMessage(testMessage);
			
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Test
	public void testInstallIncomingChannel() {
		//fail("Not yet implemented");
	}

}
