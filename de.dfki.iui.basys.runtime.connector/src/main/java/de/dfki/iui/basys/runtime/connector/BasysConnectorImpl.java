package de.dfki.iui.basys.runtime.connector;

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
import org.json.JSONObject;
import org.json.XML;

import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;

public class BasysConnectorImpl extends ServiceComponent implements BasysConnector, MessageListener {

	// JMS
	Connection connection;
	Session session;
	MessageProducer sender;
	MessageConsumer receiver;
	private MessageFactory messageFactory;
	
	public BasysConnectorImpl(BasysConnectorConfiguration config) {
		super(config);
	}

	@Override
	public void connectToExternal() throws ComponentException {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(getConfig().getExternalConnectionString());
		try {
			connection = connectionFactory.createConnection();
			connection.setClientID(getId());
			connection.start();
			
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			messageFactory = new MessageFactory(session);
			
			Topic jmsTopicProducer = session.createTopic(getCaaOutTopic());
			sender = session.createProducer(jmsTopicProducer);

			Topic jmsTopicConsumer = session.createTopic(getCaaInTopic());
			receiver = session.createConsumer(jmsTopicConsumer);

			receiver.setMessageListener(this);
			
		} catch (JMSException e) {
			throw new ComponentException(e);
		}

	}
	
	@Override
	public void disconnectFromExternal() {
		try {
			sender.close();
			receiver.close();
			session.close();
			connection.close();
			messageFactory = null;
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}


	@Override
	public String getCaaInTopic() {
		return ((BasysConnectorConfiguration)getConfig()).getCaaInTopic();
	}

	@Override
	public String getCaaOutTopic() {
		return ((BasysConnectorConfiguration)getConfig()).getCaaOutTopic();
	}

	@Override
	public int getCaaResourceId() {
		return ((BasysConnectorConfiguration)getConfig()).getCaaResourceId();
	}

	@Override
	public void onMessage(Message message) {

		try {
			String atsMessageType = message.getStringProperty(BasysConnector.ATSMsgType);
			int resourceID = message.getIntProperty(BasysConnector.ResourceId);

			if (atsMessageType == null || !atsMessageType.matches("^MSG.*")) {
				throw new BasysConnectorException("ATSMsgType not set correctly: " + atsMessageType);
			}

			int msgId = Integer.parseInt(atsMessageType.substring(3, atsMessageType.length()));

			if (resourceID != getCaaResourceId()) {
				return;
			}

			String payload = ((TextMessage) message).getText();

			switch (msgId) {
			case 10: // execute job
				handleMSG10(payload);
				break;
			case 13: // ACK
				handleMSG13(payload);
				break;
			case 16: // abort running job
				handleMSG16(payload);
				break;
			case 19: // ACK
				handleMSG19(payload);
				break;
			default:
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void handleMSG10(String payload) {

		JSONObject xmlJSONObj = XML.toJSONObject(payload);
		String jsonPrettyPrintString = xmlJSONObj.toString(4);
		System.out.println(jsonPrettyPrintString);
		
		// TODO: perform job

		TextMessage msg11 = messageFactory.createMSG11(getCaaResourceId());
		try {
			sender.send(msg11);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void handleMSG13(String payload) {
		// ignore
	}

	@Override
	public void handleMSG16(String payload) {
	
		// TODO: cancel job

		TextMessage msg17 = messageFactory.createMSG17(getCaaResourceId());
		try {
			sender.send(msg17);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void handleMSG19(String payload) {
		// ignore
	}

}
