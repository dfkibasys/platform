package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.data.Path;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
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

	protected enum OBJECT_ID{
		// fill enums here
		;
		
		private final String objectId;
		
		private OBJECT_ID(String id) {
			objectId = id;
		}
		
		@Override
		public String toString() {
			return objectId;
		}
	}
	
	protected enum SOURCE_LOCATION{
		// fill enums here
		;
		
		private final String location;
		
		private SOURCE_LOCATION(String loc) {
			location = loc;
		}
		
		@Override
		public String toString() {
			return location;
		}
	}
	
	public YumiComponent(ComponentConfiguration config) {
		super(config);
	}
	
	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new YumiTECS(protocol);
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
		// mir is in the position. nothing to do
	}

	@Override
	public void onStopping() {
		// no action
	}

	@Override
	public void onAborting() {
		// somehow trigger real emergency stop?!
		// if emergency stop is released, trigger a clear() command
	}

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
	
	private class YumiTECS extends Yumi.Client{

		private TProtocol protocol;
		
		public YumiTECS(TProtocol prot) {
			super(prot);
			protocol = prot;
		}
		
		@Override
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState();
		}
		
		@Override
		public YumiState getState() throws TException {
			return super.getState();
		}
		
		@Override
		public CommandResponse performPick(String objectId, String sourceLocation) throws PickException, TException {
			return super.performPick(objectId, sourceLocation);
		}
		
		@Override
		public CommandResponse performPut(String objectId, String sourceLocation) throws PickException, TException {
			return super.performPut(objectId, sourceLocation);
		}
		
		@Override
		public CommandResponse performQA(String objectId) throws QAException, TException {
			return super.performQA(objectId);
		}
	}

	@Override
	protected void handleTecsEvent(Event event) {
		// TODO Auto-generated method stub
		// nothing to do
	}
}
