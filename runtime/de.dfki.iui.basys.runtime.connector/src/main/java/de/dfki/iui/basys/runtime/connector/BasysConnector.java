package de.dfki.iui.basys.runtime.connector;

public interface BasysConnector {

	final String ATSMsgType = "ATSMsgType";
	final String ResourceId = "ResourceID";
	
	String getCaaInTopic();
	String getCaaOutTopic();
	int getCaaResourceId();

	void handleMSG10(CaaMessage msg);
	void handleMSG13(CaaMessage msg);
	void handleMSG16(CaaMessage msg);
	void handleMSG19(CaaMessage msg);
	
}
