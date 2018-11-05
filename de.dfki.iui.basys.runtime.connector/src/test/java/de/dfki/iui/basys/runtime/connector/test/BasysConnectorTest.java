package de.dfki.iui.basys.runtime.connector.test;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

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
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.model.runtime.component.impl.PropertyImpl;
import de.dfki.iui.basys.runtime.communication.provider.JmsCommunicationProvider;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.connector.BasysConnector;
import de.dfki.iui.basys.runtime.connector.MessageFactory;

public class BasysConnectorTest extends BaseComponentTest {

	//private static final String brokerUri = "failover:(tcp://10.2.100.1:61616)?randomize=false&priorityBackup=true";
	private static final String brokerUri = JmsCommunicationProvider.defaultConnectionString;//"tcp://10.2.100.1:61616";
	private static Connection connection = null;
	private Session session;
	private MessageFactory messageFactory;
	private MessageProducer wfe_sender;
	private MessageConsumer wfe_receiver;

	// Data
	private int caaResourceId = 300999013;
	private int basysMatNr = 815;
	private int festoMatNr = 0;

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
	ComponentConfiguration connectorConfig;
	
	
	DeviceComponent component1;
	
	@Override
	@Before
	public void setUp() throws Exception {		
		super.setUp();
		
		
		connectorConfig = new ComponentConfigurationImpl.Builder()			
				.componentId("basys-connector")
				.componentName("basys-connector")
				.componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.connector.BasysConnectorImpl")
				//.inChannelName("connector.in")
				//.outChannelName("connector.out")
				.externalConnectionString(brokerUri)
				.build();
				
		

		connectorConfig.getProperties().add(new PropertyImpl.Builder().key("caaResourceId").value(caaResourceId+"").build());
		connectorConfig.getProperties().add(new PropertyImpl.Builder().key("caaInTopic").value("Sbr.Line.003.Basys.Preassembly.Iss.OpcUa.In").build());
		connectorConfig.getProperties().add(new PropertyImpl.Builder().key("caaOutTopic").value("Sbr.Line.003.Basys.Preassembly.Iss.OpcUa.Out").build());
		connectorConfig.getProperties().add(new PropertyImpl.Builder().key("basysMatNr").value(basysMatNr+"").build());
		//connectorConfig.getProperties().add(new PropertyImpl.Builder().key("festoComponentId").value("_SE5NIDB4Eei1bbwBPPZWOA").build());
		connectorConfig.getProperties().add(new PropertyImpl.Builder().key("festoComponentId").value("component-1").build());
		//connectorConfig.getProperties().add(new PropertyImpl.Builder().key("debugJobStatus").value("1").build());
		//connectorConfig.getProperties().add(new PropertyImpl.Builder().key("debugErrorCode").value("0").build());

		System.out.println(JsonUtils.toString(connectorConfig));
		
		component1 = (DeviceComponent) componentManager.createLocalComponent(config1);
	
		componentManager.createLocalComponent(connectorConfig);
		
		
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);		
		messageFactory = new MessageFactory(session);

		Topic jmsTopicProducer = session.createTopic(connectorConfig.getProperty("caaInTopic").getValue());
		wfe_sender = session.createProducer(jmsTopicProducer);

		Topic jmsTopicConsumer = session.createTopic(connectorConfig.getProperty("caaOutTopic").getValue());
		wfe_receiver = session.createConsumer(jmsTopicConsumer);
	}

	@Override
	@After
	public void tearDown() throws Exception {		
		super.tearDown();
		
		/*
		wfe_sender.close();
		wfe_receiver.close();
		session.close();
		*/
	}

	@Test
	@Ignore
	public void testNewOrderFesto() {
		TestListener testCallback = new TestListener();
		
		int functionId = 0;
		int capType = 0;
		int matNr = festoMatNr;

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, functionId, capType, matNr, 1, 1);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 1, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
		} catch (JMSException e) {
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
	@Ignore
	public void testNewOrderBasys() {
		TestListener testCallback = new TestListener();

		int functionId = 0;
		int capType = 0;
		int matNr = basysMatNr;

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, functionId, capType, matNr, 1, 1);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 1, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
		} catch (JMSException e) {
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
	@Ignore
	public void testResetFestoIO() {
		TestListener testCallback = new TestListener();

		int functionId = 1;
		int capType = 0;
		int matNr = festoMatNr;

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, functionId, capType, matNr, 1, 1);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 1, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
		} catch (JMSException e) {
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
	@Ignore
	public void testResetBasysIO() {
		TestListener testCallback = new TestListener();

		int functionId = 1;
		int capType = 0;
		int matNr = basysMatNr;

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, functionId, capType, matNr, 1, 1);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 1, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
		} catch (JMSException e) {
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
	//@Ignore
	public void testExecuteJobFestoDarkBlueIO() {
		TestListener testCallback = new TestListener();
		
		int functionId = 2;
		int capType = 1;
		int matNr = festoMatNr;

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, functionId, capType, matNr, 1, 1);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 1, 0);

		component1.reset();
		
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
		} catch (JMSException e) {
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
	@Ignore
	public void testExecuteJobFestoLightBlueIO() {
		TestListener testCallback = new TestListener();
		
		int functionId = 2;
		int capType = 2;
		int matNr = festoMatNr;

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, functionId, capType, matNr, 1, 1);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 1, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
		} catch (JMSException e) {
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
	@Ignore
	public void testExecuteJobBasysDarkBlueIO() {
		TestListener testCallback = new TestListener();
		
		int functionId = 2;
		int capType = 1;
		int matNr = basysMatNr;

		TextMessage msg10 = messageFactory.createMSG10(caaResourceId, functionId, capType, matNr, 1, 1);
		TextMessage msg11 = messageFactory.createMSG11(caaResourceId);
		TextMessage msg12 = messageFactory.createMSG12(caaResourceId, 1, 0);
		TextMessage msg13 = messageFactory.createMSG13(caaResourceId, 1, 0);

		try {
			wfe_receiver.setMessageListener(testCallback);
			wfe_sender.send(msg10);
		} catch (JMSException e) {
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
	
	class TestListener implements MessageListener {

		private BlockingQueue<Message> receivedList = new LinkedBlockingQueue<Message>();

		@Override
		public void onMessage(Message message) {
			this.receivedList.add(message);
		}

		public boolean equalsLastReceived(TextMessage expected) {
			TextMessage received = null;
			try {
				received = (TextMessage)receivedList.poll(2,TimeUnit.MINUTES);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if (received == null)
				return false;
			
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
