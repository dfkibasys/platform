package de.dfki.iui.basys.runtime.connector.dummy;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import de.dfki.iui.basys.runtime.connector.MessageFactory;

public class DummyBasysConnectorListener implements MessageListener {

	private final DummyBasysConnector connector;
	private MessageFactory messageFactory;

	public DummyBasysConnectorListener(DummyBasysConnector connector) {
		this.connector = connector;
		this.messageFactory = new MessageFactory(connector.session);
	}

	@Override
	public void onMessage(Message message) {
		try {
			handleMessage(message);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	private void handleMessage(Message message) throws JMSException {
		String ATSMsgType = message.getStringProperty("ATSMsgType");
		String resourceID = message.getStringProperty("ResourceId");

		if (!resourceID.equals(connector.resourceId)) {
			return;
		}

		switch (connector.reactStatus) {
		case IO:
			handleIO(resourceID, ATSMsgType);
			break;
		case NIO:
			handleNIO(resourceID, ATSMsgType);
			break;
		case ABORT:
			handleAbort(resourceID, ATSMsgType);
			break;
		case ABORT_NOT_POSSIBLE:
			handleAbortNotPossible(resourceID, ATSMsgType);
			break;
		}
	}

	private void handleIO(String resourceID, String aTSMsgType) throws JMSException {
		switch (aTSMsgType) {
		case "MSG10": {
			TextMessage msg11 = messageFactory.createMSG11(resourceID);
			TextMessage msg12 = messageFactory.createMSG12(resourceID, 1, 0);
			connector.sender.send(msg11);
			connector.sender.send(msg12);
			break;
		}
		case "MSG13": {
			break;
		}
		}
	}

	private void handleNIO(String resourceID, String aTSMsgType) throws JMSException {
		switch (aTSMsgType) {
		case "MSG10": {
			TextMessage msg11 = messageFactory.createMSG11(resourceID);
			TextMessage msg12 = messageFactory.createMSG12(resourceID, 2, 0);
			connector.sender.send(msg11);
			connector.sender.send(msg12);
			break;
		}
		case "MSG13": {
			break;
		}
		}
	}

	private void handleAbort(String resourceID, String aTSMsgType) throws JMSException {
		switch (aTSMsgType) {
		case "MSG10": {
			TextMessage msg11 = messageFactory.createMSG11(resourceID);
			connector.sender.send(msg11);
			break;
		}
		case "MSG16": {
			TextMessage msg17 = messageFactory.createMSG17(resourceID);
			TextMessage msg18 = messageFactory.createMSG18(resourceID);
			connector.sender.send(msg17);
			connector.sender.send(msg18);
			break;
		}
		case "MSG19": {
			break;
		}
		}
	}

	private void handleAbortNotPossible(String resourceID, String aTSMsgType) throws JMSException {
		switch (aTSMsgType) {
		case "MSG10": {
			TextMessage msg11 = messageFactory.createMSG11(resourceID);
			connector.sender.send(msg11);
			break;
		}
		case "MSG16": {
			TextMessage msg17 = messageFactory.createMSG17(resourceID);
			TextMessage msg12 = messageFactory.createMSG12(resourceID, 2, 0);
			connector.sender.send(msg17);
			connector.sender.send(msg12);
			break;
		}
		case "MSG13": {
			break;
		}
		}
	}

}
