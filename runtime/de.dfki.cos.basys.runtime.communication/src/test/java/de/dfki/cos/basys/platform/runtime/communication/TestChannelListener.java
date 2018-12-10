package de.dfki.cos.basys.platform.runtime.communication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;

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
	public void handleMessage(Channel channel, String msg) {
		LOGGER.info("handleMessage: " + msg);
		if (msg.equals(expectedMessage))
			success = true;
	}

	@Override
	public void handleNotification(Channel channel, de.dfki.iui.basys.model.runtime.communication.Notification not) {
		LOGGER.info("handleNotification: " + not.getPayload());
		if (not.getPayload().equals(expectedMessage))
			success = true;
	}

	@Override
	public Response handleRequest(Channel channel, Request req) {
		LOGGER.info("handleRequest: " + req.getPayload());
		if (req.getPayload().equals(expectedMessage))
			success = true;

		Response response = CommFactory.getInstance().createResponse(req.getId(), expectedMessage.toUpperCase());
		return response;
	}

}
