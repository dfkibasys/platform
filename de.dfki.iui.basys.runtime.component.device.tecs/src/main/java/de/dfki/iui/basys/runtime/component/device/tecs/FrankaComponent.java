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
import de.dfki.iui.hrc.franka.ActionException;
import de.dfki.iui.hrc.franka.Franka;
import de.dfki.iui.hrc.franka.FrankaConstants;
import de.dfki.iui.hrc.franka.FrankaState;
import de.dfki.iui.hrc.franka.FrankaStatus;
import de.dfki.iui.hrc.franka.LoadException;
import de.dfki.iui.hrc.franka.MoveException;
import de.dfki.iui.hrc.general3d.TransformationMatrix;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.tecs.Event;

public class FrankaComponent extends TecsDeviceComponent{
	
	private FrankaTECS client;

//	protected enum ACTION{
//		// fill enums here
//		;
//		
//		private final String action;
//		
//		private ACTION(String a) {
//			action = a;
//		}
//		
//		@Override
//		public String toString() {
//			return action;
//		}
//	}
//	
//	protected enum OBJECT_ID{
//		// fill enums here
//		;
//		
//		private final String objectId;
//		
//		private OBJECT_ID(String id) {
//			objectId = id;
//		}
//		
//		@Override
//		public String toString() {
//			return objectId;
//		}
//	}
//	
//	protected enum POSITION{
//		//fill here
//		;
//		
//		private final String position;
//		
//		private POSITION(String p) {
//			position = p;
//		}
//		
//		@Override
//		public String toString() {
//			return position;
//		}
//	}

	private String variant1 = "{\r\n" + 
			"    \"eClass\" : \"http://www.dfki.de/iui/basys/model/component#//CapabilityRequest\",\r\n" + 
			"    \"capabilityVariant\" : {\r\n" + 
			"      \"eClass\" : \"http://www.dfki.de/iui/basys/model/resourceinstance#//LogisticsCapabilityVariant\",\r\n" + 
			"      \"id\" : \"_gTVaBV-lEeixtLE-b5nbbQ\",\r\n" + 
			"      \"name\" : \"Unload MiR (bottle)\",\r\n" + 
			"      \"capability\" : {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/capability#//PickAndPlace\",\r\n" + 
			"        \"id\" : \"_sLcgPl-UEeioxNEjr9hsyQ\",\r\n" + 
			"        \"loadCarrierUnit\" : \"BOTTLE\"\r\n" + 
			"      },\r\n" + 
			"      \"appliedOn\" : [ {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/topology#//AGVStation\",\r\n" + 
			"        \"$ref\" : \"http://localhost:8080/services/entity/_rBfZoV2TEeit97PGgoQOAQ\"\r\n" + 
			"      }, {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/topology#//StorageZone\",\r\n" + 
			"        \"$ref\" : \"http://localhost:8080/services/entity/_NQFk4zB5Eei1bbwBPPZWOA\"\r\n" + 
			"      } ]\r\n" + 
			"    }\r\n" + 
			"  }";

	private String variant2 = "{\r\n" + 
			"    \"eClass\" : \"http://www.dfki.de/iui/basys/model/component#//CapabilityRequest\",\r\n" + 
			"    \"capabilityVariant\" : {\r\n" + 
			"      \"eClass\" : \"http://www.dfki.de/iui/basys/model/resourceinstance#//LogisticsCapabilityVariant\",\r\n" + 
			"      \"id\" : \"_gTWBEV-lEeixtLE-b5nbbQ\",\r\n" + 
			"      \"name\" : \"Load MiR (bottle)\",\r\n" + 
			"      \"capability\" : {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/capability#//PickAndPlace\",\r\n" + 
			"        \"id\" : \"_s_aTzl-UEeioxNEjr9hsyQ\",\r\n" + 
			"        \"loadCarrierUnit\" : \"BOTTLE\"\r\n" + 
			"      },\r\n" + 
			"      \"appliedOn\" : [ {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/topology#//StorageZone\",\r\n" + 
			"        \"$ref\" : \"http://localhost:8080/services/entity/_NQFk4zB5Eei1bbwBPPZWOA\"\r\n" + 
			"      }, {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/topology#//AGVStation\",\r\n" + 
			"        \"$ref\" : \"http://localhost:8080/services/entity/_rBfZoV2TEeit97PGgoQOAQ\"\r\n" + 
			"      } ]\r\n" + 
			"    }\r\n" + 
			"  }";
	
	
	public FrankaComponent(ComponentConfiguration config) {
		super(config);	
		//resetOnComplete = true;
	}
	
	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new FrankaTECS(protocol);
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		UnitConfiguration config = new UnitConfiguration();
		if (req.getCapabilityVariant().eClass().equals(ResourceinstancePackage.eINSTANCE.getLogisticsCapabilityVariant())) {
			LogisticsCapabilityVariant variant = (LogisticsCapabilityVariant) req.getCapabilityVariant();
			if (variant.getCapability().eClass().equals(CapabilityPackage.eINSTANCE.getPickAndPlace())) {
				PickAndPlace capability = (PickAndPlace) variant.getCapability();
				if (capability.getLoadCarrierUnit() == LoadCarrierUnitEnum.BOTTLE) {
					if (variant.getAppliedOn().size() == 2) {
						TopologyElement from = variant.getAppliedOn().get(0);						
						TopologyElement to   = variant.getAppliedOn().get(1);
						if (from.getId().equals("_rBfZoV2TEeit97PGgoQOAQ") && to.getId().equals("_NQFk4zB5Eei1bbwBPPZWOA")) {
							// Unload MiR (bottle)
							config.setPayload(FrankaConstants.KNOWN_POSE_3);
						}
						if (to.getId().equals("_rBfZoV2TEeit97PGgoQOAQ") && from.getId().equals("_NQFk4zB5Eei1bbwBPPZWOA")) {
							// Load MiR (bottle)
							config.setPayload(FrankaConstants.KNOWN_POSE_2);
						} 
					}
				}
			}			
		}
		
		return config;
	}
	
	@Override
	public void onResetting() {
//		close();
//		try {
//			open();
//			LOGGER.info("Moving to home position");			
//			client.MoveToKnownPosition(FrankaConstants.KNOWN_POSE_1);
//			onExecute(); // block until in KnownPose1
//			
//		} catch (TException e) {
//			e.printStackTrace();
//			setErrorCode(1);
//			stop();
//		}
	}

	@Override
	public void onStarting() {
		try {
			String pose = (String)getUnitConfig().getPayload();
			LOGGER.info("Start executing pose: " + pose);
			client.Load(pose);
			//client.MoveToKnownPosition(pose);			
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
				LOGGER.debug("CommandState is " + cr.state);
//				FrankaState fs = client.getState();
//				
//				if (fs == FrankaState.Error || fs == FrankaState.Manual) {
//					executing = false;
//					setErrorCode(1);
//					stop();
//					break;
//				}
				
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
//	public void onAborting() {}
//
//	@Override
//	public void onClearing() {
//		// perform reconnect
//		close();
//		try {
//			open();
//		} catch (TTransportException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void onHolding() {}
//
//	@Override
//	public void onUnholding() {}
//
//	@Override
//	public void onSuspending() {}
//
//	@Override
//	public void onUnsuspending() {}

	private class FrankaTECS extends Franka.Client{

		private TProtocol protocol;
		
		public FrankaTECS(TProtocol prot) {
			super(prot);
			protocol = prot;
		}
		
		@Override
		public TransformationMatrix requestM() throws TException {
			return super.requestM();
		}
		
		@Override
		public FrankaStatus getStatus() throws TException {
			return super.getStatus();
		}
		
		@Override
		public FrankaState getState() throws TException {
			return super.getState();
		}
		
		@Override
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState();
		}
		
		@Override
		public CommandResponse Load(String targetPosition) throws LoadException, TException {
			return super.Load(targetPosition);
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
		public CommandResponse EnterTeachMode(String action) throws TException {
			return super.EnterTeachMode(action);
		}
		
		@Override
		public CommandResponse ExitTeachMode(String action) throws TException {
			return super.ExitTeachMode(action);
		}		
	}

	@Override
	protected void handleTecsEvent(Event event) {}

}
