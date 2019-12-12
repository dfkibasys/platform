package de.dfki.cos.basys.platform.runtime.gateway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.communication.provider.MqttCommunicationProvider;
import de.dfki.cos.basys.platform.runtime.component.BasysComponentContext;

public class MqttGatewayTest extends BaseComponentTest {

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

		MqttGatewayComponent gateway = (MqttGatewayComponent) componentManager.getComponentById("mqtt-gateway");
		gateway.installOutgoingChannel("test#gateway#out", "test/gateway/in");

		ChannelPool externalPool = CommFactory.getInstance().connectMqttChannelPool(communicationClient,
				gateway.getInfo().getProperty(StringConstants.serviceConnectionString));
		Channel externalChannel = CommFactory.getInstance().openChannel(externalPool, "test#gateway#in", false,
				new ChannelListener() {

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

		Channel out = CommFactory.getInstance().openChannel(
				BasysComponentContext.getStaticContext().getSharedChannelPool(), "test#gateway#out", false, null);
		out.sendMessage(testMessage);
		sleep(1);
		out.sendMessage(testMessage);

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

		MqttGatewayComponent gateway = (MqttGatewayComponent) componentManager.getComponentById("mqtt-gateway");
		gateway.installIncomingChannel("test/gateway/out", "test#gateway#in");

		ChannelPool externalPool = CommFactory.getInstance().connectMqttChannelPool(communicationClient,
				gateway.getInfo().getProperty(StringConstants.serviceConnectionString));
		Channel externalChannel = CommFactory.getInstance().openChannel(externalPool, "test#gateway#out", false, null);

		Channel in = CommFactory.getInstance().openChannel(
				BasysComponentContext.getStaticContext().getSharedChannelPool(), "test#gateway#in", false,
				new ChannelListener() {

					@Override
					public Response handleRequest(Channel channel, Request req) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public void handleNotification(Channel channel, Notification not) {
						// TODO Auto-generated method stub
						LOGGER.info(not.getPayload());
						assertEquals(testMessage, not.getPayload());
						counter.countDown();
					}

					@Override
					public void handleMessage(Channel channel, String msg) {
						// LOGGER.info(msg);
						// assertEquals(testMessage, msg);
						// counter.countDown();
					}
				});

		externalChannel.sendMessage(testMessage);
		sleep(1);
		externalChannel.sendMessage(testMessage);

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
