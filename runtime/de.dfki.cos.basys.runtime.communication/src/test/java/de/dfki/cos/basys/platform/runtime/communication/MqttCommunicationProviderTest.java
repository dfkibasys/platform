package de.dfki.cos.basys.platform.runtime.communication;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.communication.provider.MqttCommunicationProvider;
import junit.framework.TestCase;

public class MqttCommunicationProviderTest extends TestCase {

	protected final Logger LOGGER = LoggerFactory.getLogger(MqttCommunicationProviderTest.class.getName());

	// String brokerUri = "tcp://iot.eclipse.org:1883";
	String brokerUri = null;

	CommFactory fac = CommFactory.getInstance();

	Client client_1, client_2;
	ChannelPool cp_11, cp_12, cp_21, cp_22;

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		LOGGER.info("setUp");

		client_1 = fac.createClient("client_1", null);
		client_2 = fac.createClient("client_2", null);

		cp_11 = fac.connectChannelPool(client_1, brokerUri, new MqttCommunicationProvider());
		cp_12 = fac.connectChannelPool(client_1, brokerUri, new MqttCommunicationProvider());
		cp_21 = fac.connectChannelPool(client_2, brokerUri, new MqttCommunicationProvider());
		cp_22 = fac.connectChannelPool(client_2, brokerUri, new MqttCommunicationProvider());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();

		LOGGER.info("tearDown");

		client_1.disconnect();
		client_2.disconnect();
	}

	public void testConnectDisconnect() {
		LOGGER.info("testConnectDisconnect");

		assertTrue(cp_11.isConnected());
		assertTrue(cp_12.isConnected());
		assertTrue(client_1.isConnected());

		assertTrue(cp_21.isConnected());
		assertTrue(cp_22.isConnected());
		assertTrue(client_2.isConnected());

		client_1.disconnect();
		assertFalse(cp_11.isConnected());
		assertFalse(cp_12.isConnected());
		assertFalse(client_1.isConnected());

		cp_21.disconnect();
		assertFalse(cp_21.isConnected());
		assertTrue(cp_22.isConnected());
		assertFalse(client_2.isConnected());

		cp_22.disconnect();
		assertFalse(cp_22.isConnected());
		assertFalse(cp_22.isConnected());
		assertFalse(client_2.isConnected());
	}

	public void testSubscribeUnsubscribe() {
		LOGGER.info("testSubscribeUnsubscribe");

		Channel ch_11_1 = fac.openChannel(cp_11, "channel_11_1", false, new TestChannelListener());
		Channel ch_11_2 = fac.openChannel(cp_11, "channel_11_2", false, new TestChannelListener());
		Channel ch_12_1 = fac.openChannel(cp_12, "channel_12_1", false, new TestChannelListener());
		Channel ch_12_2 = fac.openChannel(cp_12, "channel_12_2", false, new TestChannelListener());
		Channel ch_21_1 = fac.openChannel(cp_21, "channel_21_1", false, new TestChannelListener());
		Channel ch_21_2 = fac.openChannel(cp_21, "channel_21_2", false, new TestChannelListener());
		Channel ch_22_1 = fac.openChannel(cp_22, "channel_22_1", false, new TestChannelListener());
		Channel ch_22_2 = fac.openChannel(cp_22, "channel_22_2", false, new TestChannelListener());

		assertTrue(ch_11_1.isOpen());
		assertTrue(ch_11_2.isOpen());
		assertTrue(ch_12_1.isOpen());
		assertTrue(ch_12_2.isOpen());
		assertTrue(ch_21_1.isOpen());
		assertTrue(ch_21_2.isOpen());
		assertTrue(ch_22_1.isOpen());
		assertTrue(ch_22_2.isOpen());

		client_1.disconnect();
		assertFalse(ch_11_1.isOpen());
		assertFalse(ch_11_2.isOpen());
		assertFalse(ch_12_1.isOpen());
		assertFalse(ch_12_2.isOpen());
		assertTrue(ch_21_1.isOpen());
		assertTrue(ch_21_2.isOpen());
		assertTrue(ch_22_1.isOpen());
		assertTrue(ch_22_2.isOpen());

		cp_21.disconnect();
		assertFalse(ch_11_1.isOpen());
		assertFalse(ch_11_2.isOpen());
		assertFalse(ch_12_1.isOpen());
		assertFalse(ch_12_2.isOpen());
		assertFalse(ch_21_1.isOpen());
		assertFalse(ch_21_2.isOpen());
		assertTrue(ch_22_1.isOpen());
		assertTrue(ch_22_2.isOpen());

		ch_22_1.close();
		assertFalse(ch_11_1.isOpen());
		assertFalse(ch_11_2.isOpen());
		assertFalse(ch_12_1.isOpen());
		assertFalse(ch_12_2.isOpen());
		assertFalse(ch_21_1.isOpen());
		assertFalse(ch_21_2.isOpen());
		assertFalse(ch_22_1.isOpen());
		assertTrue(ch_22_2.isOpen());

		ch_22_2.close();
		assertFalse(ch_11_1.isOpen());
		assertFalse(ch_11_2.isOpen());
		assertFalse(ch_12_1.isOpen());
		assertFalse(ch_12_2.isOpen());
		assertFalse(ch_21_1.isOpen());
		assertFalse(ch_21_2.isOpen());
		assertFalse(ch_22_1.isOpen());
		assertFalse(ch_22_2.isOpen());
	}

	public void testSendMessage() {
		LOGGER.info("testSendMessage");

		String message = "this is a test message!";
		String prefix = UUID.randomUUID().toString();

		TestChannelListener tester_1 = new TestChannelListener(message);
		TestChannelListener tester_2 = new TestChannelListener(message);

		Channel ch_1_sender = fac.openChannel(cp_11, prefix + "#channel_1", false, null);
		// Channel ch_2_sender = fac.openChannel(cp_21, "channel_2", false, null);

		Channel ch_1_receiver = fac.openChannel(cp_21, prefix + "#channel_1", false, tester_1);
		// Channel ch_2_receiver = fac.openChannel(cp_21, "channel_2", false, tester_2);

		ch_1_sender.sendMessage(message);

		try {
			Thread.currentThread().join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertTrue(tester_1.isSuccess());
		// assertTrue(tester_2.isSuccess());
	}

	public void testSendNotification() {
		LOGGER.info("testSendNotification");

		String message = "this is a test message!";
		String prefix = UUID.randomUUID().toString();

		TestChannelListener tester_1 = new TestChannelListener(message);
		TestChannelListener tester_2 = new TestChannelListener(message);

		Channel ch_1_sender = fac.openChannel(cp_11, prefix + "#channel_1", false, null);
		// Channel ch_2_sender = fac.openChannel(cp_21, "channel_2", false, null);

		Channel ch_1_receiver_1 = fac.openChannel(cp_21, prefix + "#channel_1", false, tester_1);
		Channel ch_1_receiver_2 = fac.openChannel(cp_21, prefix + "#channel_1", false, tester_2);
		// Channel ch_2_receiver = fac.openChannel(cp_21, "channel_2", false, tester_2);

		Notification not = fac.createNotification(message);

		ch_1_sender.sendNotification(not);

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// see: https://github.com/eclipse/paho.mqtt.java/issues/378
		// see: https://github.com/eclipse/paho.mqtt.python/issues/336
		assertTrue(tester_1.isSuccess());
		assertTrue(tester_2.isSuccess());
	}

	public void testSendRequestSync() {
		LOGGER.info("testSendRequestSync");

		String message = "this is a test message!";
		String prefix = UUID.randomUUID().toString();

		TestChannelListener tester_1 = new TestChannelListener(message);
		TestChannelListener tester_2 = new TestChannelListener(message);

		Channel ch_1_sender = fac.openChannel(cp_11, prefix + "#channel_1", false, null);
		// Channel ch_2_sender = fac.openChannel(cp_21, "channel_2", false, null);

		Channel ch_1_receiver = fac.openChannel(cp_21, prefix + "#channel_1", false, tester_1);
		// Channel ch_2_receiver = fac.openChannel(cp_21, "channel_2", false, tester_2);

		Request req = fac.createRequest(message);

		Response res = ch_1_sender.sendRequest(req);

		assertTrue(tester_1.isSuccess());
		assertTrue(res.getPayload().equals(message.toUpperCase()));
	}

}
