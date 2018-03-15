package de.dfki.iui.basys.runtime.communication.provider.jms.helper;

import de.dfki.iui.basys.runtime.communication.provider.jms.destination.JmsQueue;
import de.dfki.iui.basys.runtime.communication.provider.jms.destination.JmsTopic;

public final class ChannelHelper {

	public static JmsQueue createQueue(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		JmsQueue jmsQueue = new JmsQueue(name);
		return jmsQueue;
	}

	public static JmsTopic createTopic(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		JmsTopic jmsTopic = new JmsTopic(name);
		return jmsTopic;
	}

}
