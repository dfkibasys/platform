package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.huelights.Color;
import de.dfki.iui.hrc.huelights.HueBridge;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.ur.URState;
import de.dfki.tecs.Event;

public class HueLightsComponent extends TecsDeviceComponent {

	private HueLightsTECS client;
	
	public HueLightsComponent(ComponentConfiguration config) {
		super(config);
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
		client = new HueLightsTECS(protocol);
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
	
	private class HueLightsTECS extends HueBridge.Client{

		private TProtocol protocol;
		
		public HueLightsTECS(TProtocol prot) {
			super(prot);
			protocol = prot;
		}
		
		@Override
		public void setState(String id, boolean state) throws TException {
			super.setState(id, state);
		}

		@Override
		public void setColorXY(String id, double x, double y) throws TException {
			super.setColorXY(id, x, y);
		}

		@Override
		public void setColorRGB(String id, int r, int g, int b) throws TException {
			super.setColorRGB(id, r, g, b);
		}

		@Override
		public void setColor(String id, Color color) throws TException {
			super.setColor(id, color);
		}

		@Override
		public void setBrightness(String id, int bri) throws TException {
			super.setBrightness(id, bri);
		}

		
	}
}
