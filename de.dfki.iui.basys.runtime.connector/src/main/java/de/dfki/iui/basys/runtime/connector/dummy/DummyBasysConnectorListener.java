package de.dfki.iui.basys.runtime.connector.dummy;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import de.dfki.iui.basys.runtime.connector.BasysConnector;
import de.dfki.iui.basys.runtime.connector.BasysConnectorException;
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

	
	private void _handleMessage(Message message) throws JMSException, BasysConnectorException {
		String atsMessageType = message.getStringProperty(BasysConnector.ATSMsgType);
		int resourceID = message.getIntProperty(BasysConnector.ResourceId);
		
        if(atsMessageType ==null || !atsMessageType.matches("^MSG.*")) {
            throw new BasysConnectorException("ATSMsgType not set correctly: "+ atsMessageType);
        }
                                                        
        int msgId = Integer.parseInt(atsMessageType.substring(3, atsMessageType.length()));
		
		
		if (resourceID != connector.resourceId) {
			return;
		}
		
		String content = ((TextMessage)message).getText();
		
		switch (msgId) {
		case 10: // execute job
			handleMSG10(resourceID, content);
			break;
		case 13: // ACK
			handleMSG13(resourceID, content);
			break;
		case 16: // abort running job
			handleMSG16(resourceID, content);
			break;
		case 19: // ACK
			handleMSG19(resourceID, content);
			break;
		default:
		}
	
	}

	private void handleMSG10(int resourceID, String content) {
		// TODO Auto-generated method stub
		
	}

	private void handleMSG13(int resourceID, String content) {
		// TODO Auto-generated method stub
		
	}
	
	private void handleMSG16(int resourceID, String content) {
		// TODO Auto-generated method stub
		
	}
	
	private void handleMSG19(int resourceID, String content) {
		// TODO Auto-generated method stub
		
	}
	
	private void handleMessage(Message message) throws JMSException {
		String atsMessageType = message.getStringProperty(BasysConnector.ATSMsgType);
		int resourceID = message.getIntProperty(BasysConnector.ResourceId);

		if (resourceID != connector.resourceId) {
			return;
		}

		switch (connector.reactStatus) {
		case IO:
			handleIO(resourceID, atsMessageType);
			break;
		case NIO:
			handleNIO(resourceID, atsMessageType);
			break;
		case ABORT:
			handleAbort(resourceID, atsMessageType);
			break;
		case ABORT_NOT_POSSIBLE:
			handleAbortNotPossible(resourceID, atsMessageType);
			break;
		}
	}

	private void handleIO(int resourceID, String aTSMsgType) throws JMSException {
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

	private void handleNIO(int resourceID, String aTSMsgType) throws JMSException {
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

	private void handleAbort(int resourceID, String aTSMsgType) throws JMSException {
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

	private void handleAbortNotPossible(int resourceID, String aTSMsgType) throws JMSException {
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
