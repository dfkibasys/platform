package de.dfki.iui.basys.communication.test;

import static org.junit.Assert.*;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasysConnectorTest {

	private static final String brokerUri = "vm://localhost?broker.persistent=false";
	private static Connection connection = null;
	private Session session;

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
	}

	@After
	public void tearDown() throws Exception {
		session.close();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}


}
