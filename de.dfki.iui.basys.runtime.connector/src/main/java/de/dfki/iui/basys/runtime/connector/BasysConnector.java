package de.dfki.iui.basys.runtime.connector;

public interface BasysConnector {

	final String ATSMsgType = "ATSMsgType";
	final String ResourceId = "ResourceID";
	String getInTopic();

	String getOutTopic();

	int getResourceId();
}
