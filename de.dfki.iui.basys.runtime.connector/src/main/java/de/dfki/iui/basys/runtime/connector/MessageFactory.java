package de.dfki.iui.basys.runtime.connector;

import java.util.HashMap;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

public class MessageFactory {
	
	private Session session;
	
	// error code/message map
	Map<Integer, String> jobErrorText = new HashMap<>();

	
	public MessageFactory(Session session) {
		this.session = session;
		
		jobErrorText.put(0, "In Ordnung");
		jobErrorText.put(1, "Lichtgitter durchbrochen");
		jobErrorText.put(2, "Magazin A leer");
		jobErrorText.put(3, "Magazin A falsch bestückt oder Deckel verklemmt");
		jobErrorText.put(4, "Magazin B leer");
		jobErrorText.put(5, "Magazin B falsch bestückt oder Deckel verklemmt");
		jobErrorText.put(6, "Baugruppe nicht bestückt");
		jobErrorText.put(7, "Baugruppe bereits mit Deckel bestückt");
		jobErrorText.put(8, "Nicht erlaubte Achsposition");
		jobErrorText.put(9, "Greifen fehlgeschlagen");
		jobErrorText.put(10, "Achsen blockiert");
		jobErrorText.put(11, "Notaus betätigt");
		jobErrorText.put(13, "Deckel während des Greifens verloren");
	}
	
	private String getJobErrorText(int jobErrorCode) {
		if (jobErrorText.containsKey(jobErrorCode)) {
			return jobErrorText.get(jobErrorCode);
		}
		return "Unbekannter Fehlercode";
	}


	public TextMessage createMSG(String atsMsgType, int resourceId, String payload) {
		TextMessage msg = null;

		try {
			msg = session.createTextMessage();
			msg.setStringProperty(BasysConnector.ATSMsgType, atsMsgType);
			msg.setIntProperty(BasysConnector.ResourceId, resourceId);
			msg.setText(payload);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;
	}

	public TextMessage createMSG(String atsMsgType, int resourceId) {
		String text = "<Message><Parameter name=\"reserve\" value=\"0\" /></Message>";
		TextMessage msg = createMSG(atsMsgType, resourceId, text);
		return msg;
	}

	public TextMessage createMSG10(int resourceId, int functionId, int capType) {
		String text = 
				"<Message>"
				+ "<Parameter name=\"functionID\" value=\"" + functionId + "\" />"
				+ "<Parameter name=\"capType\" value=\"" + capType + "\" />"
				//+ "<Parameter name=\"matNr\" value=\"?\" /> "
				//+ "<Parameter name=\"serialNr\" value=\"?\" /> "
				//+ "<Parameter name=\"orderNr\" value=\"?\" />"
				+ "</Message>";
		TextMessage msg = createMSG("MSG10", resourceId, text);
		return msg;
	}

	public TextMessage createMSG10(int resourceId, int functionId, int capType, int matNr, int serialNr, int orderNr) {
		String text = 
				"<Message>"
				+ "<Parameter name=\"functionID\" value=\"" + functionId + "\" />"
				+ "<Parameter name=\"capType\" value=\"" + capType + "\" />"
				+ "<Parameter name=\"matNr\" value=\"" + matNr + "\" /> "
				+ "<Parameter name=\"serialNr\" value=\"" + serialNr + "\" /> "
				+ "<Parameter name=\"orderNr\" value=\"" + orderNr + "\" />"
				+ "</Message>";
		TextMessage msg = createMSG("MSG10", resourceId, text);
		return msg;
	}

	
	public TextMessage createMSG11(int resourceId) {
		TextMessage msg = createMSG("MSG11", resourceId);
		return msg;
	}

	public TextMessage createMSG12(int resourceId, int jobStatus, int jobErrorCode) {
		String text = 
				"<Message>"
				+ "<Parameter name=\"jobStatus\" value=\"" + jobStatus + "\" />"
				+ "<Parameter name=\"jobErrorCode\" value=\"" + jobErrorCode + "\" />"
				+ "<Parameter name=\"jobErrorText\" value=\"" + getJobErrorText(jobErrorCode) + "\" />"
				+ "</Message>";
		TextMessage msg = createMSG("MSG12", resourceId, text);
		return msg;
	}

	public TextMessage createMSG13(int resourceId, int jobStatus, int jobErrorCode) {
		String text = 
				"<Message>"
				+ "<Parameter name=\"jobStatus\" value=\"" + jobStatus + "\" />"
				+ "<Parameter name=\"jobErrorCode\" value=\"" + jobErrorCode + "\" />"
				+ "<Parameter name=\"jobErrorText\" value=\"" + getJobErrorText(jobErrorCode) + "\" />"
				+ "</Message>";
		TextMessage msg = createMSG("MSG13", resourceId, text);
		return msg;
	}

	public TextMessage createMSG16(int resourceId) {
		TextMessage msg = createMSG("MSG16", resourceId);
		return msg;
	}

	public TextMessage createMSG17(int resourceId) {
		TextMessage msg = createMSG("MSG17", resourceId);
		return msg;
	}

	public TextMessage createMSG18(int resourceId) {
		TextMessage msg = createMSG("MSG18", resourceId);
		return msg;
	}

	public TextMessage createMSG19(int resourceId) {
		TextMessage msg = createMSG("MSG19", resourceId);
		return msg;
	}
	
}
