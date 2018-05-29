package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.QAVisualisationCapability;
import de.dfki.iui.basys.model.domain.capability.SwitchConfirmationCapability;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.tecs.Event;

public class HueLightsComponent extends TecsDeviceComponent {

	private HueLightsNotifier client;
	private final String lid;
	private final long MS = 5000;
	
	public HueLightsComponent(ComponentConfiguration config, String lid) {
		super(config);
		this.lid = lid;
	}

	@Override
	protected void handleTecsEvent(Event event) {/* do nothing */}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {

		CapabilityVariant<?> variant = (CapabilityVariant<?>)req.getCapabilityVariant();
		Capability c = variant.getCapability();

		QAVisualisationCapability qaVisualisationCapability = null;
		if (c.eClass().equals(CapabilityPackage.eINSTANCE.getSwitchConfirmationCapability()))
			qaVisualisationCapability = (QAVisualisationCapability) c;

		UnitConfiguration uc = new UnitConfiguration();
		if (qaVisualisationCapability!=null)
			uc.setPayload(qaVisualisationCapability.getOK());
		
		return uc;

	}

	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new HueLightsNotifier(protocol, lid);
	}
	
	@Override
	public void onResetting() {
		close();
		try {
			open();
			client.disable();
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onStarting() {
		UnitConfiguration unitConfiguration = getUnitConfig();
		int state = (int) unitConfiguration.getPayload();
		client.enableForTime(state > 0, MS);
	}

	@Override
	public void onExecute() {
		while(client.isOn()) {/* wait until off */}
	}

	@Override
	public void onCompleting() {}

	@Override
	public void onStopping() {}

	@Override
	public void onAborting() {}

	@Override
	public void onClearing() {
		// perform reconecct
		close();
		try {
			open();
		} catch (TTransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onHolding() {}

	@Override
	public void onUnholding() {}

	@Override
	public void onSuspending() {}

	@Override
	public void onUnsuspending() {}

}
