package de.dfki.iui.basys.runtime.connector.dummy;

import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.Topic;

import de.dfki.iui.basys.runtime.connector.BasysConnector;

public class DummyBasysConnector implements BasysConnector {

	protected String inTopic;
	protected String outTopic;

	protected String resourceId;

	protected DummyBasysConnectorReactStatus reactStatus = DummyBasysConnectorReactStatus.IO;

	protected DummyBasysConnectorStatus status = DummyBasysConnectorStatus.NOT_STARTED;

	// JMS
	Session session;
	MessageProducer sender;
	MessageConsumer receiver;

	public DummyBasysConnector(String connectorInTopic, String connectorOutTopic, String resourceID, Session session)
			throws JMSException {
		this.inTopic = connectorInTopic;
		this.outTopic = connectorOutTopic;
		this.resourceId = resourceID;

		this.session = session;

		setup();
	}

	private void setup() throws JMSException {
		Topic jmsTopicProducer = session.createTopic(outTopic);
		sender = session.createProducer(jmsTopicProducer);

		Topic jmsTopicConsumer = session.createTopic(inTopic);
		receiver = session.createConsumer(jmsTopicConsumer);

		receiver.setMessageListener(new DummyBasysConnectorListener(this));
	}

	@Override
	public String getInTopic() {
		return this.inTopic;
	}

	@Override
	public String getOutTopic() {
		return this.outTopic;
	}

	@Override
	public String getResourceId() {
		return this.resourceId;
	}

	public void setReactStatus(DummyBasysConnectorReactStatus reactStatus) {
		this.reactStatus = reactStatus;
	}

	public DummyBasysConnectorReactStatus getReactStatus() {
		return this.reactStatus;
	}
}
