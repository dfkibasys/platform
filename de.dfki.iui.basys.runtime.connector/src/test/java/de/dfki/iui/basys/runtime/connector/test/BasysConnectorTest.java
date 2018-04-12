package de.dfki.iui.basys.runtime.connector.test;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.UUID;

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

import de.dfki.iui.basys.runtime.component.ComponentCategory;
import de.dfki.iui.basys.runtime.component.registry.impl.ZookeeperComponentRegistry;
import de.dfki.iui.basys.runtime.connector.BasysConnector;
import de.dfki.iui.basys.runtime.connector.BasysConnectorConfiguration;
import de.dfki.iui.basys.runtime.connector.MessageFactory;

public class BasysConnectorTest extends BaseComponentTest {

	private static final String brokerUri = "vm://localhost?broker.persistent=false";
	private static Connection connection = null;
	private Session session;
	private MessageFactory messageFactory;
	private MessageProducer wfe_sender;
	private MessageConsumer wfe_receiver;

	// Data
	private String connectorComponentId;
	private int caaResourceId = 2000815;

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
		connectorComponentId = UUID.randomUUID().toString();
		
		BasysConnectorConfiguration connectorConfig = (BasysConnectorConfiguration) new BasysConnectorConfiguration.Builder()
				.caaResourceId(caaResourceId)
				.caaInTopic("Caa.In")
				.caaOutTopic("Caa.Out")
				.componentId(connectorComponentId)
				.componentName("basys-connector")
				.componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.connector.test.TestBasysConnector")
				.communicationProviderImplementationJavaClass(communicationProviderImplementationJavaClass)
				.communicationProviderConnectionString(communicationProviderConnectionString)
				//.inChannelName("connector.in")
				//.outChannelName("connector.out")
				.externalConnectionString(brokerUri)
				.build();
				
		
		componentManager.createLocalComponent(connectorConfig);
		
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);		
		messageFactory = new MessageFactory(session);

		Topic jmsTopicProducer = session.createTopic(connectorConfig.getCaaInTopic());
		wfe_sender = session.createProducer(jmsTopicProducer);

		Topic jmsTopicConsumer = session.createTopic(connectorConfig.getCaaOutTopic());
		wfe_receiver = session.createConsumer(jmsTopicConsumer);
	}

	@After
	public void tearDown() throws Exception {
		wfe_sender.close();
		wfe_receiver.close();
		session.close();
		
		componentManager.deleteLocalComponent(connectorComponentId);
	}

	@Test
	public void testExecutionIO() {
		TestListener testCallback = new TestListener();

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, 0, 0);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 1, 0);

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

		TestListener testCallback = new TestListener();

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, 0, 0);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 2, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 2, 0);

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

		TestListener testCallback = new TestListener();

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, 0, 0);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg16 = messageFactory.createMSG16(caaResourceId);
		TextMessage msg17 = messageFactory.createMSG17(caaResourceId);
		TextMessage msg18 = messageFactory.createMSG18(caaResourceId);
		TextMessage msg19 = messageFactory.createMSG19(caaResourceId);

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

		TestListener testCallback = new TestListener();

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, 0, 0);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg16 = messageFactory.createMSG16(caaResourceId);
		TextMessage msg17 = messageFactory.createMSG17(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 2, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 2, 0);

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
