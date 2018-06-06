package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum;
import de.dfki.iui.basys.model.domain.capability.PickAndPlace;
import de.dfki.iui.basys.model.domain.resourceinstance.LogisticsCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.general3d.TransformationMatrix;
import de.dfki.iui.hrc.generalrobots.RobotState;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.ur.ActionException;
import de.dfki.iui.hrc.ur.LoadException;
import de.dfki.iui.hrc.ur.MoveException;
import de.dfki.iui.hrc.ur.UR;
import de.dfki.iui.hrc.ur.URState;
import de.dfki.iui.hrc.ur.URStatus;
import de.dfki.iui.hrc.ur.urConstants;
import de.dfki.tecs.Event;

public class Ur10Component extends TecsDeviceComponent {

	private Ur10TECS client;

	public Ur10Component(ComponentConfiguration config) {
		super(config);
	}

	@Override
	protected void handleTecsEvent(Event event) {
		/* nothing to do */}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		UnitConfiguration config = new UnitConfiguration();

		if (req.getCapabilityVariant().eClass()
				.equals(ResourceinstancePackage.eINSTANCE.getLogisticsCapabilityVariant())) {
			LogisticsCapabilityVariant variant = (LogisticsCapabilityVariant) req.getCapabilityVariant();
			if (variant.getCapability().eClass().equals(CapabilityPackage.eINSTANCE.getPickAndPlace())) {
				PickAndPlace capability = (PickAndPlace) variant.getCapability();
				if (capability.getLoadCarrierUnit() == LoadCarrierUnitEnum.RKLT_3215) {
					if (variant.getAppliedOn().size() == 2) {
						TopologyElement from = variant.getAppliedOn().get(0);
						TopologyElement to = variant.getAppliedOn().get(1);
						if (from.getId().equals("_xHhjwV2TEeit97PGgoQOAQ" /* QA AGV STATION */)
								&& to.getId().equals("_F6qPdzB5Eei1bbwBPPZWOA" /* QA WORKCELL */)) {
							// Unload MiR (KLT)
							config.setPayload(urConstants.KNOWN_POSE_4);
						}
						if (from.getId().equals("_F6qPdzB5Eei1bbwBPPZWOA") 
								&& to.getId().equals("_xHhjwV2TEeit97PGgoQOAQ")) {
							// Load MiR (KLT)
							config.setPayload(urConstants.KNOWN_POSE_2);
						}
						if (from.getId().equals("_F6qPdzB5Eei1bbwBPPZWOA")
								&& to.getId().equals("_7yRYkmmvEei3B5AQTC2gAw")) {
							// KLT from QA to table
							config.setPayload(urConstants.KNOWN_POSE_3);
						}
					}
				}
			}
		}

		
		return config;
	}

	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new Ur10TECS(protocol);
	}

	@Override
	public void onResetting() {
//		close();
//		try {
//			open();
//			if (!simulated) {
//				client.MoveToKnownPosition(urConstants.KNOWN_POSE_1);
//				onExecute(); // block until in KnownPose1
//			}
//		} catch (TTransportException e) {
//			setErrorCode(1);
//			stop();
//			e.printStackTrace();
//		} catch (MoveException e) {
//			e.printStackTrace();
//			setErrorCode(1);
//			stop();
//		} catch (TException e) {
//			e.printStackTrace();
//			setErrorCode(1);
//			stop();
//		}
	}

	@Override
	public void onStarting() {
		try {
			String pose = (String) getUnitConfig().getPayload();
			client.Load(pose);
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
			while (executing) {
				CommandResponse cr = client.getCommandState();
				LOGGER.debug("CommandState is " + cr.state);
				
//				URState urs = client.getState();
//				if (urs == URState.Error || urs == URState.Manual) {
//					executing = false;
//					setErrorCode(1);
//					stop();
//					break;
//				}

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
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
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

//	@Override
//	public void onAborting() {
//	}
//
//	@Override
//	public void onClearing() {
//		// perform reconecct
//		close();
//		try {
//			open();
//		} catch (TTransportException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void onHolding() {
//	}
//
//	@Override
//	public void onUnholding() {
//	}
//
//	@Override
//	public void onSuspending() {
//	}
//
//	@Override
//	public void onUnsuspending() {
//	}

	private class Ur10TECS extends UR.Client {

		private TProtocol protocol;

		public Ur10TECS(TProtocol prot) {
			super(prot);
			protocol = prot;
		}

		@Override
		public TransformationMatrix requestM() throws TException {
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
		public CommandResponse EnterTeachMode(String action) throws ActionException, TException {
			return super.EnterTeachMode(action);
		}

		@Override
		public CommandResponse ExitTeachMode(String action) throws ActionException, TException {
			return super.ExitTeachMode(action);
		}
	}

}
