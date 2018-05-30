package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.franka.FrankaConstants;
import de.dfki.iui.hrc.franka.FrankaState;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.siam.CeBITDialogue;
import de.dfki.iui.hrc.siam.SiAM;
import de.dfki.tecs.Event;

public class SiAMComponent extends TecsDeviceComponent{

	private SiAMTECS client;
	private final String businessKey;
	
	public SiAMComponent(ComponentConfiguration config, String businessKey) {
		super(config);
		this.businessKey = businessKey;
	}

	@Override
	protected void handleTecsEvent(Event event) {}

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
		client = new SiAMTECS(protocol, businessKey);
	}
	
	@Override
	public void onResetting() {
		close();
		try {
			open();
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(1);
			stop();
		}
	}

	@Override
	public void onStarting() {
		try {
			client.performColaDialog();
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(1);
			stop();
		}
	}

	@Override
	public void onExecute() {
		try {
			boolean executing = true;
			while(executing) {
				CommandResponse cr = client.getCommandState();
				
				switch(cr.state) {
				case ACCEPTED: 
					// wait
					break;
				case ABORTED: 
					executing= false;
					setErrorCode(1);
					stop();
					break;
				case EXECUTING:
					// wait
					break;
				case FINISHED: 
					executing=false;
					break;
				case PAUSED: 
					//?
					break;
				case READY: 
					//?
					break;
				case REJECTED: 
					executing=false;
					setErrorCode(2);
					stop();
					break;
				default: break;
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
	
	private class SiAMTECS extends CeBITDialogue.Client{
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
		
		public CommandResponse performDeliveryDialog() throws TException{
			return super.performDeliveryDialog(businessKey);
		}
		
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState(businessKey);
		}

	}

}
