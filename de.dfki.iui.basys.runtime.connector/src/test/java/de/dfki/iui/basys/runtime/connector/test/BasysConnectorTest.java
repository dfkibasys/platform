package de.dfki.iui.basys.runtime.connector.test;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.connector.BasysConnector;
import de.dfki.iui.basys.runtime.connector.MessageFactory;
import de.dfki.iui.basys.runtime.connector.dummy.DummyBasysConnector;
import de.dfki.iui.basys.runtime.connector.dummy.DummyBasysConnectorReactStatus;

public class BasysConnectorTest {

	private static final String brokerUri = "vm://localhost?broker.persistent=false";
	private static Connection connection = null;
	private Session session;
	private MessageFactory messageFactory;
	private MessageProducer wfe_sender;
	private MessageConsumer wfe_receiver;

	private DummyBasysConnector connector;

	// Data
	private String connectorInTopic = ".In";
	private String connectorOutTopic = ".Out";
	private int resourceID = 2000815;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerUri);
		connection = connectionFactory.createConnection();

		connection.setClientID("CAA-Simulation");
		connection.start();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		connection.close();
	}

	@Before
	public void setUp() throws Exception {
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		connector = new DummyBasysConnector(connectorInTopic, connectorOutTopic, resourceID, session);
		messageFactory = new MessageFactory(session);

		Topic jmsTopicProducer = session.createTopic(connectorInTopic);
		wfe_sender = session.createProducer(jmsTopicProducer);

		Topic jmsTopicConsumer = session.createTopic(connectorOutTopic);
		wfe_receiver = session.createConsumer(jmsTopicConsumer);
	}

	@After
	public void tearDown() throws Exception {
		wfe_sender.close();
		wfe_receiver.close();
		session.close();
	}

	@Test
	public void testExecutionIO() {
		connector.setReactStatus(DummyBasysConnectorReactStatus.IO);

		TestListener testCallback = new TestListener();

		TextMessage msg10 = messageFactory.createMSG10(resourceID, 0, 0);
		TextMessage msg11 = messageFactory.createMSG11(resourceID);
		TextMessage msg12 = messageFactory.createMSG12(resourceID, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(resourceID, 1, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
			Thread.currentThread().join(1000);
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertTrue(testCallback.equalsLastReceived(msg11));
		assertTrue(testCallback.equalsLastReceived(msg12));

		try {
			wfe_sender.send(msg13);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutionNIO() {
		connector.setReactStatus(DummyBasysConnectorReactStatus.NIO);

		TestListener testCallback = new TestListener();

		TextMessage msg10 = messageFactory.createMSG10(resourceID, 0, 0);
		TextMessage msg11 = messageFactory.createMSG11(resourceID);
		TextMessage msg12 = messageFactory.createMSG12(resourceID, 2, 0);
		TextMessage msg13 = messageFactory.createMSG13(resourceID, 2, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
			Thread.currentThread().join(1000);
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertTrue(testCallback.equalsLastReceived(msg11));
		assertTrue(testCallback.equalsLastReceived(msg12));

		try {
			wfe_sender.send(msg13);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutionAbortSuccess() {
		connector.setReactStatus(DummyBasysConnectorReactStatus.ABORT);

		TestListener testCallback = new TestListener();

		TextMessage msg10 = messageFactory.createMSG10(resourceID, 0, 0);
		TextMessage msg11 = messageFactory.createMSG11(resourceID);
		TextMessage msg16 = messageFactory.createMSG16(resourceID);
		TextMessage msg17 = messageFactory.createMSG17(resourceID);
		TextMessage msg18 = messageFactory.createMSG18(resourceID);
		TextMessage msg19 = messageFactory.createMSG19(resourceID);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
			Thread.currentThread().join(1000);
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertTrue(testCallback.equalsLastReceived(msg11));

		try {
			wfe_sender.send(msg16);
			Thread.currentThread().join(1000);
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertTrue(testCallback.equalsLastReceived(msg17));
		assertTrue(testCallback.equalsLastReceived(msg18));

		try {
			wfe_sender.send(msg19);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutionAbortNotPossible() {
		connector.setReactStatus(DummyBasysConnectorReactStatus.ABORT_NOT_POSSIBLE);

		TestListener testCallback = new TestListener();

		TextMessage msg10 = messageFactory.createMSG10(resourceID, 0, 0);
		TextMessage msg11 = messageFactory.createMSG11(resourceID);
		TextMessage msg16 = messageFactory.createMSG16(resourceID);
		TextMessage msg17 = messageFactory.createMSG17(resourceID);
		TextMessage msg12 = messageFactory.createMSG12(resourceID, 2, 0);
		TextMessage msg13 = messageFactory.createMSG13(resourceID, 2, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
			Thread.currentThread().join(1000);
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertTrue(testCallback.equalsLastReceived(msg11));

		try {
			wfe_sender.send(msg16);
			Thread.currentThread().join(1000);
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertTrue(testCallback.equalsLastReceived(msg17));
		assertTrue(testCallback.equalsLastReceived(msg12));

		try {
			wfe_sender.send(msg13);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	class TestListener implements MessageListener {

		private LinkedList<Message> receivedList = new LinkedList<Message>();

		@Override
		public synchronized void onMessage(Message message) {
			this.receivedList.add(message);
		}

		public synchronized boolean equalsLastReceived(TextMessage expected) {
			TextMessage received = (TextMessage)receivedList.remove();

			try {
				return received.getStringProperty(BasysConnector.ATSMsgType).equals(expected.getStringProperty(BasysConnector.ATSMsgType))
						&& received.getIntProperty(BasysConnector.ResourceId) == expected.getIntProperty(BasysConnector.ResourceId) &&
						received.getText().equals(expected.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}

			return false;
		}
	}
}
