package de.dfki.iui.basys.runtime.component.device.tecs;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.InteractionCapability;
import de.dfki.iui.basys.model.domain.resourceinstance.GeneralCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.model.runtime.component.Variable;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.siam.CeBITDialogue;
import de.dfki.tecs.Event;

public class SiAMComponent extends TecsDeviceComponent {

	private SiAMTECS client;
	private final String businessKey;

	public SiAMComponent(ComponentConfiguration config) {
		super(config);
		this.businessKey = UUID.randomUUID().toString();
	}

	private String capability = "{\n" + "    \"eClass\" : \"http://www.dfki.de/iui/basys/model/component#//CapabilityRequest\",\n" + "    \"capabilityVariant\" : {\n"
			+ "      \"eClass\" : \"http://www.dfki.de/iui/basys/model/resourceinstance#//GeneralCapabilityVariant\",\n" + "      \"id\" : \"_VrxwEmsXEeiHwulcobhZhw\",\n"
			+ "      \"name\" : \"Intention Dialogue\",\n" + "      \"capability\" : {\n" + "        \"eClass\" : \"http://www.dfki.de/iui/basys/model/capability#//InteractionCapability\",\n"
			+ "        \"id\" : \"_bQ7lVGsYEeixZrynCv8ohQ\",\n" + "        \"topic\" : \"intention\"\n" + "      }\n" + "    }\n" + "  }";

	@Override
	protected void handleTecsEvent(Event event) {
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		UnitConfiguration config = new UnitConfiguration();

		if (req.getCapabilityVariant().eClass().equals(ResourceinstancePackage.eINSTANCE.getGeneralCapabilityVariant())) {
			GeneralCapabilityVariant variant = (GeneralCapabilityVariant) req.getCapabilityVariant();
			if (variant.getCapability().eClass().equals(CapabilityPackage.eINSTANCE.getInteractionCapability())) {
				InteractionCapability capability = (InteractionCapability) variant.getCapability();
				config.setPayload(capability.getTopic());
			}
		}

		return config;
	}

	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new SiAMTECS(protocol, businessKey);
	}

	// @Override
	// public void onResetting() {
	// close();
	// try {
	// open();
	// } catch (TException e) {
	// e.printStackTrace();
	// setErrorCode(1);
	// stop();
	// }
	// }

	@Override
	public void onStarting() {
		String topic = (String) getUnitConfig().getPayload();
		LOGGER.info("Performing dialogue " + topic);
		try {
			if ("intention".equals(topic)) {
				client.performIntentionDialog();
			} else if ("cola".equals(topic)) {
				client.performColaDialog();
			} else if ("delivery".equals(topic)) {
				client.performDeliveryDialog();
			} else {
				setErrorCode(1);
				stop();
			}
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(3);
			stop();
		}
	}

	@Override
	public void onExecute() {
		try {
			boolean executing = true;
			while (executing) {
				CommandResponse cr = client.getCommandState();

				switch (cr.state) {
				case ACCEPTED:
					// wait
					break;
				case ABORTED:
					executing = false;
					setErrorCode(1);
					stop();
					break;
				case EXECUTING:
					// wait
					break;
				case FINISHED:
					executing = false;
					break;
				case PAUSED:
					// ?
					break;
				case READY:
					// ?
					break;
				case REJECTED:
					executing = false;
					setErrorCode(2);
					stop();
					break;
				default:
					break;
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(3);
			stop();
		}
	}

	@Override
	public void onCompleting() {
		try {
			CommandResponse cr = client.getCommandState();
			LOGGER.info("Dialogue result was " + cr.getDescription());

//			JsonParser parser = new JsonParser();
//			JsonObject json = parser.parse(cr.getDescription()).getAsJsonObject();

			String[] props = new String[] { "colaRequest", "emptyBottle", "milkrunRequest", "qaRequest" };

			List<Variable> variables = new ArrayList<>(4);
//			for (String prop : props) {
//				Variable var = new VariableImpl.Builder()
//						.name("prop").type(VariableType.BOOLEAN).value("false")
//						.build();
//				if (json.has(prop)) {
//					String value = json.get(prop).getAsString();
//					var.setValue(value);
//				}
//				variables.add(var);
//			}

			sendComponentResponse(ResponseStatus.OK, 0, variables);

		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onStopping() {
		sendComponentResponse(ResponseStatus.NOT_OK, getErrorCode());
	}

	// @Override
	// public void onAborting() {}
	//
	// @Override
	// public void onClearing() {
	// // perform reconecct
	// close();
	// try {
	// open();
	// } catch (TTransportException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// @Override
	// public void onHolding() {}
	//
	// @Override
	// public void onUnholding() {}
	//
	// @Override
	// public void onSuspending() {}
	//
	// @Override
	// public void onUnsuspending() {}

	private class SiAMTECS extends CeBITDialogue.Client {
		private final String businessKey;

		public SiAMTECS(TProtocol prot, String businessKey) {
			super(prot);
			this.businessKey = businessKey;
		}

		public CommandResponse performColaDialog() throws TException {
			return super.performColaDialog(businessKey);
		}

		public CommandResponse performIntentionDialog() throws TException {
			return super.performIntentionDialog(businessKey);
		}

		public CommandResponse performDeliveryDialog() throws TException {
			return super.performDeliveryDialog(businessKey);
		}

		public CommandResponse getCommandState() throws TException {
			return super.getCommandState(businessKey);
		}

	}

}
