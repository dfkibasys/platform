package de.dfki.iui.basys.runtime.connector;

import java.io.StringReader;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.activemq.ActiveMQConnectionFactory;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.Property;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponentController;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;

public class BasysConnectorImpl extends ServiceComponent implements BasysConnector, MessageListener {

	// JMS
	private Connection connection;
	private Session session;
	private MessageProducer sender;
	private MessageConsumer receiver;
	private MessageFactory messageFactory;

	private String festoComponentId;
	private DeviceComponentController festoController;
	private int basysMatNr = 0;

	private boolean cancelled = false;
	
	public BasysConnectorImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void connectToExternal() throws ComponentException {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(getConfig().getExternalConnectionString());
		try {
			connection = connectionFactory.createConnection();
			connection.setClientID(getId());
			connection.start();

			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			messageFactory = new MessageFactory(session);

			Topic jmsTopicProducer = session.createTopic(getCaaOutTopic());
			sender = session.createProducer(jmsTopicProducer);

			Topic jmsTopicConsumer = session.createTopic(getCaaInTopic());
			receiver = session.createConsumer(jmsTopicConsumer);

			receiver.setMessageListener(this);

			basysMatNr = Integer.parseInt(componentConfig.getProperty("basysMatNr").getValue());

			festoController = new DeviceComponentController(festoComponentId);
			festoController.lazyConnect(context);

		} catch (JMSException e) {
			throw new ComponentException(e);
		}

	}

	@Override
	public void disconnectFromExternal() {
		try {
			sender.close();
			receiver.close();
			session.close();
			connection.close();
			messageFactory = null;
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCaaInTopic() {
		return componentConfig.getProperty("caaInTopic").getValue();
	}

	@Override
	public String getCaaOutTopic() {
		return componentConfig.getProperty("caaOutTopic").getValue();
	}

	@Override
	public int getCaaResourceId() {
		return Integer.parseInt(componentConfig.getProperty("caaResourceId").getValue());
	}

	@Override
	public void onMessage(Message message) {

		try {
			String atsMessageType = message.getStringProperty(BasysConnector.ATSMsgType);
			int resourceID = message.getIntProperty(BasysConnector.ResourceId);

			if (resourceID != getCaaResourceId()) {
				// skip message
				return;
			}

			if (atsMessageType == null || !atsMessageType.matches("^MSG.*")) {
				throw new BasysConnectorException("ATSMsgType not set correctly: " + atsMessageType);
			}

			int msgId = Integer.parseInt(atsMessageType.substring(3, atsMessageType.length()));

			String payload = ((TextMessage) message).getText();

			CaaMessage caaMessage;
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(CaaMessage.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				StringReader reader = new StringReader(payload);
				caaMessage = (CaaMessage) jaxbUnmarshaller.unmarshal(reader);

			} catch (Exception e) {
				e.printStackTrace();
				return;
			}

			switch (msgId) {
			case 10: // execute job
				handleMSG10(caaMessage);
				break;
			case 13: // ACK
				handleMSG13(caaMessage);
				break;
			case 16: // abort running job
				handleMSG16(caaMessage);
				break;
			case 19: // ACK
				handleMSG19(caaMessage);
				break;
			default:
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void handleMSG10(CaaMessage msg) {

		LOGGER.info("MSG10 received");
		
		cancelled = false;
		// JSONObject json = XML.toJSONObject(payload);
		// String jsonPrettyPrintString = json.toString(4);
		// System.out.println(jsonPrettyPrintString);

		try {
			Thread.currentThread().sleep(50);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		// Quittiere Nachrichtenerhalt
		TextMessage msg11 = messageFactory.createMSG11(getCaaResourceId());
		try {
			sender.send(msg11);
			LOGGER.info("MSG11 sent to " + sender.getDestination().toString());
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
		TextMessage msg12 = messageFactory.createMSG12(getCaaResourceId(), 1, 0);

		if (msg.getMatNr() == basysMatNr) {
			switch (msg.getFunctionId()) {
			case 0: // Neuer Auftrag

				// Auftrag und Produktinstanz anlegen.

				// Melde IO
				try {
					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 1: // Homeposition anfahren

				// Falls UR3: ignorieren
				// Falls Festokomponente: ebenfalls ignorieren, s.u.

				// Melde IO
				try {
					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {
					e.printStackTrace();
				}

				break;
			case 2: // Deckel fügen	
				
				if (!checkDebug(msg)) {
					// Prozess für restliche Produktion incl. QA und ggf. Colarun starten
					// Entscheiden, wer den Job ausführt
					// Rückmeldung abwarten
				};				
				
				break;

			default:
				break;
			}
		} else {
			switch (msg.getFunctionId()) {
			case 0: // Neuer Auftrag

				// ignorieren, da nicht Basys-relevant
				try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				if (cancelled)
					return;
				
				// Melde IO
				try {					
					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {
					e.printStackTrace();
				}

				break;
			case 1: // Homeposition anfahren

				// Festokomponente explizit in Homeposition fahren
				// irrelevant, da durch Komponente sichergestellt
				// festoController.reset();

				
				try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				if (cancelled)
					return;				
				
				// Melde IO
				try {
					
					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {
					e.printStackTrace();
				}

				break;
			case 2: // Deckel fügen
				
				try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				if (cancelled)
					return;
				
				if (!checkDebug(msg)) {
					// Befehl direkt an Festokomponente ohne weiterführende Prozessinstanz
					// Demo nach Deckel fügen beendet
					//Capability capability = null;
					//festoController.executeCapability(capability);
				};	

				break;

			default:
				break;
			}
		}
	}

	@Override
	public void handleMSG13(CaaMessage msg) {
		// ignore Caa-Quittierung

		LOGGER.info("MSG13 received");
	}

	@Override
	public void handleMSG16(CaaMessage msg) {

		LOGGER.info("MSG16 received");
		cancelled = true;
		
		try {
			Thread.currentThread().sleep(50);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Quittiere Nachrichtenerhalt
		TextMessage msg17 = messageFactory.createMSG17(getCaaResourceId());
		try {
			sender.send(msg17);
			LOGGER.info("MSG17 sent to " + sender.getDestination().toString());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		// Job abbrechen
		if (msg.getMatNr() == basysMatNr) {
			// Falls UR3: ignorieren
			// Falls Festokomponente: ebenfalls ignorieren, s.u.
		} else {
			// Festokomponente: Job abbrechen ist irrelevant, weil die Dauer des Jobs sehr kurz (< 10 sek)
		}

		// Melde Abbruch nicht möglich
		TextMessage msg12 = messageFactory.createMSG12(getCaaResourceId(), 2, 0);
		try {
			sender.send(msg12);
			LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void handleMSG19(CaaMessage msg) {
		// ignore Caa-Quittierung

		LOGGER.info("MSG19 received");
	}

	private boolean checkDebug(CaaMessage msg) {
		Property debugJobStatus = componentConfig.getProperty("debugJobStatus");
		if (debugJobStatus != null) {
			int status = Integer.parseInt(debugJobStatus.getValue());
			if (status == 1) {
				try {
					TextMessage msg12 = messageFactory.createMSG12(getCaaResourceId(), 1, 0);
					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (status == 2) {
				Property debugErrorCode = componentConfig.getProperty("debugErrorCode");
				if (debugErrorCode != null) {
					int code = Integer.parseInt(debugErrorCode.getValue());
					TextMessage msg12 = messageFactory.createMSG12(getCaaResourceId(), 2, code);
					try {
						sender.send(msg12);
						LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
					} catch (JMSException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return true;
		}
		return false;	
	}

}
