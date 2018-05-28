package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.franka.FrankaState;
import de.dfki.iui.hrc.general3d.TransformationMatrix;
import de.dfki.iui.hrc.generalrobots.RobotState;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.ur.ActionException;
import de.dfki.iui.hrc.ur.LoadException;
import de.dfki.iui.hrc.ur.MoveException;
import de.dfki.iui.hrc.ur.UR;
import de.dfki.iui.hrc.ur.URState;
import de.dfki.iui.hrc.ur.URStatus;
import de.dfki.tecs.Event;

public class Ur3Component extends TecsDeviceComponent{

	private Ur3TECS client;
	
	public Ur3Component(ComponentConfiguration config) {
		super(config);
	}

	@Override
	protected void handleTecsEvent(Event event) {/* nothing to do */}

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
		client = new Ur3TECS(protocol);
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
		try {
			boolean executing = true;
			while(executing) {
				CommandResponse cr = client.getCommandState();
				 URState urs = client.getState();
				
				if (urs == URState.Error || urs == URState.Manual) {
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

	private class Ur3TECS extends UR.Client{

		private TProtocol protocol;
		
		public Ur3TECS(TProtocol prot) {
			super(prot);
			protocol = prot;
		}
		
		@Override
		public TransformationMatrix requestM() throws TException{
			return super.requestM();
		}
		
		@Override 
		public URStatus getStatus() throws TException {
			return super.getStatus();
		}
		
		@Override
		public URState getState() throws TException {
			return super.getState();
		}
		
		@Override
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState();
		}
		
		@Override
		public RobotState getRobotState() throws TException {
			return super.getRobotState();
		}
		
		@Override
		public RobotState setRobotState(RobotState state) throws TException {
			return super.setRobotState(state);
		}
		
		@Override
		public CommandResponse Load(String targetPosition) throws LoadException, TException {
			return super.Load(targetPosition);
		}
		
		@Override
		public CommandResponse Calibrate() throws TException {
			return super.Calibrate();
		}
		
		@Override
		public CommandResponse MoveToKnownPosition(String knownPosition) throws MoveException, TException {
			return super.MoveToKnownPosition(knownPosition);
		}
		
		@Override
		public CommandResponse Recover(String action) throws ActionException, TException {
			return super.Recover(action);
		}
		
		@Override
		public CommandResponse EnterTeachMode(String action) throws ActionException, TException{
			return super.EnterTeachMode(action);
		}
		
		@Override
		public CommandResponse ExitTeachMode(String action) throws ActionException, TException {
			return super.ExitTeachMode(action);
		}

		
	}
	
}
