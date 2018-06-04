package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.yumi.PickException;
import de.dfki.iui.hrc.yumi.QAException;
import de.dfki.iui.hrc.yumi.Yumi;
import de.dfki.iui.hrc.yumi.YumiState;
import de.dfki.tecs.Event;

public class YumiComponent extends TecsDeviceComponent{

	protected YumiTECS client;
	private final String businessKey;
	
	public YumiComponent(ComponentConfiguration config, String businessKey) {
		super(config);
		this.businessKey = businessKey;
	}
	
	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new YumiTECS(protocol, businessKey);
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		UnitConfiguration config = new UnitConfiguration();

		// TODO: translate
		int positionIndex = 0;
		config.setRecipe(positionIndex);

		return config;
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
		try {
			client.performQA("PERFORM QA");
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
			while(executing) {
				CommandResponse cr = client.getCommandState();
				YumiState ys = client.getState();
				
				if (ys == YumiState.Error || ys == YumiState.Manual) {
					executing = false;
					setErrorCode(1);
					stop();
					break;
				}
				
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
	public void onCompleting() {
		sendComponentResponse(ResponseStatus.OK, 0);
	}

	@Override
	public void onStopping() {
		sendComponentResponse(ResponseStatus.NOT_OK, getErrorCode());
	}

	@Override
	public void onAborting() {}

	@Override
	public void onClearing() {
		// perform reconnect
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
	
	private class YumiTECS extends Yumi.Client{

		private TProtocol protocol;
		private final String businessKey;
		
		public YumiTECS(TProtocol prot, String businessKey) {
			super(prot);
			protocol = prot;
			this.businessKey = businessKey;
		}
		
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState(businessKey);
		}
		
		@Override
		public YumiState getState() throws TException {
			return super.getState();
		}
		
		public CommandResponse performPick(String objectId, String sourceLocation) throws PickException, TException {
			return super.performPick(objectId, sourceLocation, businessKey);
		}
		
		public CommandResponse performPut(String objectId, String sourceLocation) throws PickException, TException {
			return super.performPut(objectId, sourceLocation, businessKey);
		}
		
		public CommandResponse performQA(String objectId) throws QAException, TException {
			return super.performQA(objectId, businessKey);
		}
	}

	@Override
	protected void handleTecsEvent(Event event) {
		// TODO Auto-generated method stub
		// nothing to do
	}
}
