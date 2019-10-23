package de.dfki.cos.basys.platform.runtime.gateway.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.FunctionalClient;
import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.Property;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.service.ServiceComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.BasysComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.StringConstants;
import de.dfki.cos.basys.platform.runtime.gateway.Gateway;

public class JmsClient implements FunctionalClient {

	public final Logger LOGGER;
	private String id = null;
	
	// JMS
	private Connection connection;
	private Session session;

	public JmsClient(Properties config) {
		this.id = config.getProperty(StringConstants.id);
		this.LOGGER = LoggerFactory.getLogger("basys.component." + id.replaceAll(" ", "-"));
	}


	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(connectionString);
		try {
			connection = connectionFactory.createConnection();
			connection.setClientID(id);
			connection.start();
			connection.setExceptionListener(new ExceptionListener() {				
				@Override
				public void onException(JMSException e) {
					LOGGER.info("JmsClient \"" + id + "\": " + e.getLocalizedMessage() );					
				}
			});

			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			LOGGER.info("JmsClient \"" + id + "\" connected to \"" + connectionString + "\"");
			return true;
		} catch (JMSException e) {
			LOGGER.warn("JmsClient \"" + id + "\" cannot connect to \"" + connectionString + "\"", e);
			return false;
		}
	}

	@Override
	public boolean disconnect() {
		try {
			session.close();
			connection.close();
			return true;
		} catch (JMSException e) {
			LOGGER.warn("JmsClient \"" + id + "\"" + " cannot disconnect", e);
			return false;
		}
	}
	
	public Session getSession() {
		return session;
	}

}
