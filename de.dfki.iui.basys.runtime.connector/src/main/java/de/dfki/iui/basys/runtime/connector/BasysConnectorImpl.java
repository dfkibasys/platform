package de.dfki.iui.basys.runtime.connector;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.json.JSONObject;
import org.json.XML;

import de.dfki.iui.basys.runtime.connector.dummy.DummyBasysConnector;
import de.dfki.iui.basys.runtime.connector.dummy.DummyBasysConnectorListener;
import de.dfki.iui.basys.runtime.connector.dummy.DummyBasysConnectorReactStatus;

public class BasysConnectorImpl implements BasysConnector, MessageListener {

	protected String inTopic;
	protected String outTopic;

	protected int resourceId;

	private MessageFactory messageFactory;

	// JMS
	Session session;
	MessageProducer sender;
	MessageConsumer receiver;

	public BasysConnectorImpl(String connectorInTopic, String connectorOutTopic, int resourceId, Session session)
			throws JMSException {
		this.inTopic = connectorInTopic;
		this.outTopic = connectorOutTopic;
		this.resourceId = resourceId;

		this.session = session;
		this.messageFactory = new MessageFactory(session);
	}

	public void activate() {

		try {
			Topic jmsTopicProducer = session.createTopic(outTopic);
			sender = session.createProducer(jmsTopicProducer);

			Topic jmsTopicConsumer = session.createTopic(inTopic);
			receiver = session.createConsumer(jmsTopicConsumer);

			receiver.setMessageListener(this);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deactivate() {
		try {
			sender.close();
			receiver.close();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getInTopic() {
		return inTopic;
	}

	@Override
	public String getOutTopic() {
		return outTopic;
	}

	@Override
	public int getResourceId() {
		return resourceId;
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

			if (resourceID != this.resourceId) {
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

		TextMessage msg11 = messageFactory.createMSG11(resourceId);
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

		TextMessage msg17 = messageFactory.createMSG17(resourceId);
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
