package de.dfki.iui.basys.runtime.connector;

public interface BasysConnector {

	final String ATSMsgType = "ATSMsgType";
	final String ResourceId = "ResourceID";
	
	String getInTopic();
	String getOutTopic();

	int getResourceId();

	void handleMSG10(String payload);
	void handleMSG13(String payload);
	void handleMSG16(String payload);
	void handleMSG19(String payload);
	
}
