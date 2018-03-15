package de.dfki.iui.basys.runtime.communication.provider.jms.listener;

import de.dfki.iui.basys.runtime.communication.provider.jms.destination.JmsQueue;

public 	interface QueueSubscribeListener {

	/**
	 * Processes Received Message without producing a response to the requester
	 * 
	 * @param queue
	 *            the queue on which the message is send
	 * @param message
	 *            the message
	 * @return
	 */
	public void processPublish(final JmsQueue queue, final String message);

	/**
	 * Processes Received Message and returns a response to the requester.
	 * Implements the Request/Response pattern. Because a queue can have many
	 * producers and consumers, a request is nondeterministically send to one
	 * consumer.
	 * 
	 * @param queue
	 *            the queue on which the message is send
	 * @param message
	 *            the message
	 * @return
	 */
	public String processRequest(final JmsQueue queue, final String message);

}