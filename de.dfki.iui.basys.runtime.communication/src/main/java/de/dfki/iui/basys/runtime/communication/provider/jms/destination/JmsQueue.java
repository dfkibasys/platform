package de.dfki.iui.basys.runtime.communication.provider.jms.destination;

import javax.jms.Queue;

public class JmsQueue extends JmsDestination {

	private String name;

	Queue jmsQueue;

	@Override
	public String getName() {
		return this.name;
	}

	public JmsQueue(String name) {
		this.name = name;
	}

}
