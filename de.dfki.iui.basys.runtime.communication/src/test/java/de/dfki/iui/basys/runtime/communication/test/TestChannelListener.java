package de.dfki.iui.basys.runtime.communication.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.runtime.communication.ClientFactory;

public class TestChannelListener implements ChannelListener {

	private Logger LOGGER = LoggerFactory.getLogger(TestChannelListener.class.getName());

	boolean success;
	String expectedMessage;

	public TestChannelListener() {

	}

	public TestChannelListener(String msg) {
		expectedMessage = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getExpectedMessage() {
		return expectedMessage;
	}

	public void setExpectedMessage(String expectedMessage) {
		this.expectedMessage = expectedMessage;
	}

	@Override
	public void handleMessage(String msg) {
		LOGGER.info("handleMessage: " + msg);
		if (msg.equals(expectedMessage))
			success = true;
	}

	@Override
	public void handleNotification(de.dfki.iui.basys.model.runtime.communication.Notification not) {
		LOGGER.info("handleNotification: " + not.getPayload());
		if (not.getPayload().equals(expectedMessage))
			success = true;
	}

	@Override
	public Response handleRequest(Request req) {
		LOGGER.info("handleRequest: " + req.getPayload());
		if (req.getPayload().equals(expectedMessage))
			success = true;

		Response response = ClientFactory.getInstance().createResponse(req.getId(), expectedMessage.toUpperCase());
		return response;
	}

}
