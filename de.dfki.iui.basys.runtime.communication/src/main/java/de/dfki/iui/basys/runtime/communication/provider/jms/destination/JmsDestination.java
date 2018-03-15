package de.dfki.iui.basys.runtime.communication.provider.jms.destination;

import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;


public abstract class JmsDestination  {

	private MessageConsumer messageConsumer;
	private MessageProducer messageProducer;
	
	public void setMessageConsumer(MessageConsumer messageConsumer) {
		this.messageConsumer = messageConsumer;
	}

	public MessageConsumer getMessageConsumer() {
		return messageConsumer;
	}
	
	public void setMessageProducer(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}
	
	public MessageProducer getMessageProducer() {
		return messageProducer;
	}
	
	abstract String getName();
}
