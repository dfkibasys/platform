package de.dfki.iui.basys.runtime.communication.provider.jms.listener;

import de.dfki.iui.basys.runtime.communication.provider.jms.destination.JmsTopic;

public interface TopicSubscribeListener {

	/**
	 * Processes Received Message without producing a response to the requester
	 * 
	 * @param topic
	 *            the topic on which the message is send
	 * @param message
	 *            the message
	 * @return
	 */
	public void processPublish(final JmsTopic topic, final String message);

}
