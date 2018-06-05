package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.LoadCarrierUnitEnum;
import de.dfki.iui.basys.model.domain.capability.PickAndPlace;
import de.dfki.iui.basys.model.domain.productdefinition.BOMEntry;
import de.dfki.iui.basys.model.domain.resourceinstance.LogisticsCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ManufacturingCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.franka.FrankaConstants;
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
import de.dfki.iui.hrc.ur.urConstants;

public class Ur3Component extends TecsDeviceComponent{

	private Ur3TECS client;
	
	private String variant = "{\r\n" + 
			"    \"eClass\" : \"http://www.dfki.de/iui/basys/model/component#//CapabilityRequest\",\r\n" + 
			"    \"capabilityVariant\" : {\r\n" + 
			"      \"eClass\" : \"http://www.dfki.de/iui/basys/model/resourceinstance#//ManufacturingCapabilityVariant\",\r\n" + 
			"      \"id\" : \"_gTSWsV-lEeixtLE-b5nbbQ\",\r\n" + 
			"      \"name\" : \"Apply dark blue cap\",\r\n" + 
			"      \"capability\" : {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/capability#//PickAndPlace\",\r\n" + 
			"        \"id\" : \"_xio67l8yEeiUo-65_7rTBQ\",\r\n" + 
			"        \"loadCarrierUnit\" : \"MATERIAL\"\r\n" + 
			"      },\r\n" + 
			"      \"appliedOn\" : [ {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\r\n" + 
			"        \"$ref\" : \"http://localhost:8080/services/entity/_IpqbzV29EeixDOGCyjgf_g\"\r\n" + 
			"      }, {\r\n" + 
			"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//AssemblyGroupEntry\",\r\n" + 
			"        \"$ref\" : \"http://localhost:8080/services/entity/_IpqbzF29EeixDOGCyjgf_g\"\r\n" + 
			"      } ]\r\n" + 
			"    }\r\n" + 
			"  }";
	
	public Ur3Component(ComponentConfiguration config) {
		super(config);
	}

	@Override
	protected void handleTecsEvent(Event event) {/* nothing to do */}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		UnitConfiguration config = new UnitConfiguration();
		
		if (req.getCapabilityVariant().eClass().equals(ResourceinstancePackage.eINSTANCE.getManufacturingCapabilityVariant())) {
			ManufacturingCapabilityVariant variant = (ManufacturingCapabilityVariant) req.getCapabilityVariant();
			if (variant.getCapability().eClass().equals(CapabilityPackage.eINSTANCE.getPickAndPlace())) {
				PickAndPlace capability = (PickAndPlace) variant.getCapability();
				if (capability.getLoadCarrierUnit() == LoadCarrierUnitEnum.MATERIAL) {
					if (variant.getAppliedOn().size() == 2) {
						BOMEntry bom1 = variant.getAppliedOn().get(0);
						BOMEntry bom2 = variant.getAppliedOn().get(1);
						if (bom1.getId().equals("_IpqbzV29EeixDOGCyjgf_g") && bom2.getId().equals("_IpqbzF29EeixDOGCyjgf_g")) {
							// Unload MiR (bottle)
							config.setPayload(urConstants.KNOWN_POSE_2);
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
		client = new Ur3TECS(protocol);
	}
	
	@Override
	public void onResetting() {
		close();
		try {
			open();
			LOGGER.info("Moving to home position");
			if (!simulated) {
				client.MoveToKnownPosition(urConstants.KNOWN_POSE_1);
				onExecute(); // block until in KnownPose1
			}
		} catch (TTransportException e) {
			setErrorCode(1);
			stop();
			e.printStackTrace();
		} catch (MoveException e) {
			e.printStackTrace();
			setErrorCode(1);
			stop();
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(1);
			stop();
		}
	}

	@Override
	public void onStarting() {
		try {
			String pose = (String)getUnitConfig().getPayload();
			LOGGER.info("Start executing pose: " + pose);
			if (!simulated) {				
				client.MoveToKnownPosition(pose);
			}			
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
