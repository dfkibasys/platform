package de.dfki.iui.basys.runtime.connector;

import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.order.OrderStatus;
import de.dfki.iui.basys.model.domain.order.OrderStatusEnum;
import de.dfki.iui.basys.model.domain.order.impl.OrderFactoryImpl;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstanceFactoryImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentResponse;
import de.dfki.iui.basys.model.runtime.component.Property;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponentController;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;
import de.dfki.iui.basys.runtime.services.OrderManager;
import de.dfki.iui.basys.runtime.services.ProductDefinitionManager;
import de.dfki.iui.basys.runtime.services.ProductInstanceManager;

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

	private static boolean cancelled = false;

	private final String jsonVariantLightBlue, jsonVariantDarkBlue;

	public BasysConnectorImpl(ComponentConfiguration config) {
		super(config);

		jsonVariantLightBlue = "{\n"
				+ "	\"eClass\": \"http://www.dfki.de/iui/basys/model/resourceinstance#//ManufacturingCapabilityVariant\",\n"
				+ "	\"capability\": {\n"
				+ "		\"eClass\": \"http://www.dfki.de/iui/basys/model/capability#//PickAndPlace\",\n"
				+ "		\"id\": \"_xio67l8yEeiUo-65_7rTBS\",\n" + "		\"loadCarrierUnit\": \"MATERIAL\"\n"
				+ "	},\n" + "	\"appliedOn\": [{\n"
				+ "		\"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\n"
				+ "		\"$ref\": \"http://localhost:8080/services/entity/_IpqbzV29EeixDOGCyjgf_g\"\n" + "	},\n"
				+ "	{\n"
				+ "		\"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//AssemblyGroupEntry\",\n"
				+ "		\"$ref\": \"http://localhost:8080/services/entity/_IpqbzF29EeixDOGCyjgf_g\"\n" + "	}]\n" + "}";

		jsonVariantDarkBlue = "{\n"
				+ "	\"eClass\": \"http://www.dfki.de/iui/basys/model/resourceinstance#//ManufacturingCapabilityVariant\",\n"
				+ "	\"capability\": {\n"
				+ "		\"eClass\": \"http://www.dfki.de/iui/basys/model/capability#//PickAndPlace\",\n"
				+ "		\"id\": \"_xio67l8yEeiUo-65_7rTBQ\",\n" + "		\"loadCarrierUnit\": \"MATERIAL\"\n"
				+ "	},\n" + "	\"appliedOn\": [{\n"
				+ "		\"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\n"
				+ "		\"$ref\": \"http://localhost:8080/services/entity/_IpqbzV29EeixDOGCyjgf_g\"\n" + "	},\n"
				+ "	{\n"
				+ "		\"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//AssemblyGroupEntry\",\n"
				+ "		\"$ref\": \"http://localhost:8080/services/entity/_IpqbzF29EeixDOGCyjgf_g\"\n" + "	}]\n" + "}";

	}

	@Override
	public void connectToExternal() throws ComponentException {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				getConfig().getExternalConnectionString());
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
			festoComponentId = componentConfig.getProperty("festoComponentId").getValue();

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
			LOGGER.error(e.getMessage(), e);
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
				LOGGER.error(e.getMessage(), e);
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
			LOGGER.error(e.getMessage(), e);
		}
	}

	@Override
	public void handleMSG10(CaaMessage msg) {

		LOGGER.info("MSG10 received");

		cancelled = false;
		// JSONObject json = XML.toJSONObject(payload);
		// String jsonPrettyPrintString = json.toString(4);
		// System.out.println(jsonPrettyPrintString);

		sleep(50);

		// Quittiere Nachrichtenerhalt
		TextMessage msg11 = messageFactory.createMSG11(getCaaResourceId());
		try {
			sender.send(msg11);
			LOGGER.info("MSG11 sent to " + sender.getDestination().toString());
		} catch (JMSException e) {
			LOGGER.error(e.getMessage(), e);
		}

		TextMessage msg12 = messageFactory.createMSG12(getCaaResourceId(), 1, 0);

		if (msg.getMatNr() == basysMatNr) {
			switch (msg.getFunctionId()) {
			case 0: // Neuer Auftrag

				LOGGER.info("Basys: Neuer Auftrag");
				// Auftrag und Produktinstanz anlegen.

				outChannel.sendMessage("NEW_ORDER");

				// Entscheiden, wer den Deckel-Auflege-Job ausführt, Ergebnis ist eine
				// ResourceInstanceId
				// Falls UR3, dann disponierte MiR (früher) zur Festo-Station
				// Falls Festo, dann disponierte MiR (später) zur Festo-Station

				// Melde IO
				try {
					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {

					LOGGER.error(e.getMessage(), e);
				}

				break;
			case 1: // Homeposition anfahren

				LOGGER.info("Basys: Homeposition anfahren");
				// Falls UR3: ignorieren
				// Falls Festokomponente: ebenfalls ignorieren, s.u.

				// Melde IO
				try {
					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {
					LOGGER.error(e.getMessage(), e);
				}

				break;
			case 2: // Deckel fügen

				LOGGER.info("Basys: Deckel fügen");
				if (!checkDebug(msg)) {
					// Es ist bekannt, welche Komponente den Job ausführt,
					// Trigger Werkerführung
					// Werker bestätigt auf GUI die Bestückung der Komponente.
					// Falls Festo: sequezieller Ablauf,
					// nach Auflegen, WF aktualisieren: Gehäuse auf Mir aufladen
					// Falls Mir
					// Gehäuse auflegen
					// Prozess für restliche Produktion incl. QA und ggf. Colarun starten
					// Rückmeldung abwarten
				}
				;

				break;

			default:
				break;
			}
		} else {
			switch (msg.getFunctionId()) {
			case 0:
				LOGGER.info("FESTO: Neuer Auftrag");
				// ignorieren, da nicht Basys-relevant
				sleep(50);

				if (cancelled)
					return;

				// Melde IO
				try {
					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {
					LOGGER.error(e.getMessage(), e);
				}

				break;
			case 1:
				LOGGER.info("FESTO: Homeposition anfahren");
				// Festokomponente explizit in Homeposition fahren
				// irrelevant, da durch Komponente sichergestellt
				festoController.reset();

				sleep(4000);

				if (cancelled)
					return;

				// Melde IO
				try {

					sender.send(msg12);
					LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
				} catch (JMSException e) {
					LOGGER.error(e.getMessage(), e);
				}

				break;
			case 2:
				LOGGER.info("FESTO: Deckel fügen");
				if (cancelled)
					return;

				if (!checkDebug(msg)) {
					// Befehl direkt an Festokomponente ohne weiterführende Prozessinstanz
					// Demo nach Deckel fügen beendet

					try {
						CapabilityVariant<?> variant = null;
						if (msg.getCapType() == 1) {
							variant = JsonUtils.fromString(jsonVariantLightBlue, CapabilityVariant.class);
						} else if (msg.getCapType() == 2) {
							variant = JsonUtils.fromString(jsonVariantDarkBlue, CapabilityVariant.class);
						}
						// TODO: Synchroner Aufruf!
						// festoController.executeCapability(variant);
						// sleep(10000);
						// sende IO/NIO

						CompletableFuture<ComponentResponse> cf = festoController.executeCapabilityFuture(variant)
								.thenApply(response -> {
									if (response.getStatus() == ResponseStatus.OK) {
										try {
											sender.send(msg12);
											LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
										} catch (JMSException e) {
											LOGGER.error(e.getMessage(), e);
										}
									} else {
										TextMessage newMsg12 = messageFactory.createMSG12(getCaaResourceId(), 2,
												response.getStatusCode());
										try {
											sender.send(newMsg12);
											LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
										} catch (JMSException e) {
											LOGGER.error(e.getMessage(), e);
										}
									}
									return response;
								});

						try {
							ComponentResponse response = cf.get(20, TimeUnit.SECONDS);
						} catch (InterruptedException | ExecutionException | TimeoutException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							TextMessage newMsg12 = messageFactory.createMSG12(getCaaResourceId(), 2, 14);
							try {
								sender.send(newMsg12);
								LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
							} catch (JMSException e1) {
								LOGGER.error(e1.getMessage(), e1);
							}
						}

					} catch (IOException e) {
						LOGGER.error(e.getMessage(), e);
					}
				}
				;

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

		sleep(50);

		// Quittiere Nachrichtenerhalt
		TextMessage msg17 = messageFactory.createMSG17(getCaaResourceId());
		try {
			sender.send(msg17);
			LOGGER.info("MSG17 sent to " + sender.getDestination().toString());
		} catch (JMSException e) {
			LOGGER.error(e.getMessage(), e);
		}

		// Job abbrechen
		if (msg.getMatNr() == basysMatNr) {
			// Falls UR3: ignorieren
			// Falls Festokomponente: ebenfalls ignorieren, s.u.
			sleep(1000);
		} else {
			// Festokomponente: Job abbrechen ist irrelevant, weil die Dauer des Jobs sehr
			// kurz (< 10 sek)
			sleep(1000);
		}

		// Melde Abbruch nicht möglich
		TextMessage msg12 = messageFactory.createMSG12(getCaaResourceId(), 2, 0);
		try {
			sender.send(msg12);
			LOGGER.info("MSG12 sent to " + sender.getDestination().toString());
		} catch (JMSException e) {

			LOGGER.error(e.getMessage(), e);
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

					LOGGER.error(e.getMessage(), e);
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

						LOGGER.error(e.getMessage(), e);
					}
				}
			}
			return true;
		}
		return false;
	}

	protected void sleep(long ms) {
		try {
			TimeUnit.MILLISECONDS.sleep(ms);
		} catch (InterruptedException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}
}
