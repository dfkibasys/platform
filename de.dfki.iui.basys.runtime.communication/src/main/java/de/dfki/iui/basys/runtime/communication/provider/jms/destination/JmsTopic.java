package de.dfki.iui.basys.runtime.communication.provider.jms.destination;

public class JmsTopic extends JmsDestination {

	private String name;

	@Override
	public String getName() {
		return this.name;
	}

	public JmsTopic(String name) {
		this.name = name;
	}

}
