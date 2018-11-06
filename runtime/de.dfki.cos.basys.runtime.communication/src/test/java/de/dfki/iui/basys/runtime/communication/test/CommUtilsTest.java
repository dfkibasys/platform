package de.dfki.iui.basys.runtime.communication.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.dfki.iui.basys.runtime.communication.provider.JmsCommunicationProvider;
import de.dfki.iui.basys.runtime.communication.provider.MqttCommunicationProvider;

public class CommUtilsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		System.out.println("JMS  Connection String: " + JmsCommunicationProvider.defaultConnectionString);
		System.out.println("MQTT Connection String: " + MqttCommunicationProvider.defaultConnectionString);

	}

}
