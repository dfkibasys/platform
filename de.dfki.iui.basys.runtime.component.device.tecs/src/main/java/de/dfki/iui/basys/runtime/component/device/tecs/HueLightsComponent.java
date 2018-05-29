package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.tecs.Event;

public class HueLightsComponent extends TecsDeviceComponent {

	private HueLightsNotifier client;
	private final String lid;
	
	public HueLightsComponent(ComponentConfiguration config, String lid) {
		super(config);
		this.lid = lid;
	}

	@Override
	protected void handleTecsEvent(Event event) {/* do nothing */}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest arg0) {
		UnitConfiguration config = new UnitConfiguration();

		// TODO: translate
		int positionIndex = 0;
		config.setRecipe(positionIndex);

		return config;
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
		} catch (TTransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onStarting() {
		//?
	}

	@Override
	public void onExecute() {
		
	}

	@Override
	public void onCompleting() {
		// mir is in the position. nothing to do
	}

	@Override
	public void onStopping() {
		//
	}

	@Override
	public void onAborting() {
		// somehow trigger real emergency stop?!
		// if emergency stop is released, trigger a clear() command
	}

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
	public void onHolding() {
		// should be triggered when CommandState is in PAUSE. NOT IN THE MAIN PATH!
	}

	@Override
	public void onUnholding() {
		// should continue to execute. NOT IN THE MAIN PATH!
	}

	@Override
	public void onSuspending() {
		// NOT IN THE MAIN PATH!
	}

	@Override
	public void onUnsuspending() {
		// NOT IN THE MAIN PATH!
	}

}
