package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.general3d.Point3d;
import de.dfki.iui.hrc.general3d.Pose;
import de.dfki.iui.hrc.generalrobots.KnownPositions;
import de.dfki.iui.hrc.generalrobots.Path;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.mir100.GotoException;
import de.dfki.iui.hrc.mir100.MIR;
import de.dfki.iui.hrc.mir100.MIRState;
import de.dfki.iui.hrc.mir100.MIRStatus;


public class Mir100 extends DeviceComponent{

	/*
	 * For testing
	 */
	static Mir100 m;
	
	/*
	 * Just for Debug. Let Mir drive to a position
	 */
	public static void main(String[] args) {
		ComponentConfiguration opcuaConfig = new ComponentConfigurationImpl.Builder().componentId("test-opcua-component")
				.externalConnectionString(String.format("opc.tcp://%s:%s", "localhost", 4841)).build();
		
		m = new Mir100(opcuaConfig);
	
		
		m.onResetting();
		m.onStarting();
	}
	/////////////////END OF MAIN
	
	private static final String[] POSITION = {"Station-QA", "Station-TeachIn", "Station-Cola", "Station-BaSys", "Station-Wait", "Station-Festo"};
	/*
	 * 0: Station-QA
	 * 1: Station-TeachIn
	 * 2: Station-Cola
	 * 3: Station-BaSys
	 * 4: Station-Wait
	 * 5: Station-Festo*/
	
	private MirTECS mirTECS;
	
	public Mir100(ComponentConfiguration config) {
		super(config);
	}
	
	@Override
	public void connectToExternal() throws ComponentException {
		TSocket socket = new TSocket("10.2.0.45", 9031);
		TBinaryProtocol prot = new TBinaryProtocol(socket);
		mirTECS = new MirTECS(prot);
		
		try {
			mirTECS.open();
		} catch (TTransportException e) {
			throw new ComponentException("Could not open the protocol!");
		}
	}
	
	@Override
	public void disconnectFromExternal() {	
		mirTECS.close();
	}

	@Override
	public void onResetting() {
		try {
			mirTECS.open();
			mirTECS.setState(MIRState.Ready);
		} catch (TException e) {
			mirTECS.close();
			e.printStackTrace();
			onAborting();
		}
		mirTECS.close();
	}

	@Override
	public void onStarting() {
		try {
			mirTECS.open();
			mirTECS.gotoNamedPosition(POSITION[5]);
			onExecute(); // ?
		} catch (TException e) {
			mirTECS.close();
			e.printStackTrace();
			onAborting();
		}
		mirTECS.close();
	}

	@Override
	public void onExecute() {
		try {
			mirTECS.open();
			CommandResponse cs = mirTECS.getCommandState();
			boolean executing = true;
			while (executing) {
				switch (cs.state) {
				case ABORTED: executing = false; onAborting(); break;
				case ACCEPTED: /* nothing to do, wait until finished */ break;
				case EXECUTING: /* nothing to do, wait until finished */ break;
				case FINISHED: executing = false; /* SEND FINISH SIGNAL, call onCompleting for now */ onCompleting(); break;
				case PAUSED: /* what to do */ break;
				case READY: /* what to do */ break;
				case REJECTED: executing = false; onAborting(); break;
				default: break;
				}
				Thread.sleep(10);
			}
		} catch (TException e) {
			mirTECS.close();
			e.printStackTrace();
			onAborting();
		} catch (InterruptedException e) {
			mirTECS.close();
			e.printStackTrace();
			onAborting();
		}
		mirTECS.close();
	}

	@Override
	public void onCompleting() {
		// mir is in the position. nothing to do
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

	@Override
	public void onAborting() {
		try {
			mirTECS.open();
			mirTECS.stopMovement();
		} catch (TException e) {
			mirTECS.close();
			e.printStackTrace();
			// nothing we can do.
		}
		mirTECS.close();
	}

	@Override
	public void onClearing() {
		// nothing to clear. Move Mir to default position?
	}

	@Override
	public void onStopping() {
		try {
			mirTECS.open();
			mirTECS.stopMovement();
		} catch (TException e) {
			mirTECS.close();
			e.printStackTrace();
			onAborting();
		}
		mirTECS.close();
	}
	
	/*
	 * Get the path of the mir.
	 * Returns an array with values where:
	 * 	values[i * 3] is the X coordinate of the i-th point,
	 * 	values[i * 3 + 1] is the Y coordinate of the i-th point and 
	 * 	values[i * 3 + 2] is the Z coordinate of the i-th point.
	 * 	(values / 3) is the number of points.
	 */
	public double[] getPath() {
		try {
			mirTECS.open();
			Path path = mirTECS.getPath();
			Point3d[] points = (Point3d[])(path.path.toArray());
			double[] values = new double[points.length * 3];
			for (int i = 0; i < points.length; i++) {
				values[i * 3] = points[i].x;
				values[i * 3 + 1] = points[i].y;
				values[i * 3 + 2] = points[i].z;
			}
			mirTECS.close();
			return values;
		} catch (TException e) {
			mirTECS.close();
			e.printStackTrace();
			return new double[0];
		}
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * Helper class to communicate with TECS
	 */
	private class MirTECS extends MIR.Client{
		
		private TProtocol protocol;
		
		public MirTECS(TProtocol prot) {
			super(prot);
			protocol = prot;
		}
		
		// open communication to TECS
		public void open() throws TTransportException {
			protocol.getTransport().open();
		}
		
		//close communication to TECS
		public void close() {
			protocol.getTransport().close();
		}
		
		/*
		 * get the status of the mir.
		 * fields are:
		 * 	double batteryPercentage
		 * 	String batteryTimeLeft
		 * 	double distanceMoved
		 * 	double eta
		 * 	String mode
		 * 	String state
		 * 	String message
		 */
		@Override
		public MIRStatus getStatus() throws TException {
			return super.getStatus();
		}
		
		/*
		 * Get the path of the mir. Path has a field path which is a list of 3d points.
		 * A 3d point has the fields: 
		 * 	double x
		 * 	double y 
		 * 	double z
		 */
		@Override
		public Path getPath() throws TException {
			return super.getPath();
		}
		
		/*
		 * Get the command response. CommandResponse has the fields:
		 * 	String description
		 * 	CommandState state:
		 * 		CommandState is an enum:
		 * 			ACCEPTED, EXECUTING, FINISHED, ABORTED, PAUSED, REJECTED, READY
		 */
		@Override
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState();
		}
		
		/*
		 * Get the pose of the mir. Pose has the fields:
		 * 	Point3d position:
		 * 		Point3d has the fields:
		 * 			double x
		 * 			double y 
		 * 			double z
		 * 	EulerAngles orientation:
		 * 		EulerAngles has the fields:
		 * 			double x
		 * 			double y
		 * 			double z
		 */
		@Override
		public Pose getPose() throws TException {
			return super.getPose();
		}
		
		/*
		 * Set the state of the mir.
		 * MIRState is an enum:
		 * 	Error, Executing, Ready, Paused, Manual
		 */
		@Override
		public void setState(MIRState state) throws TException {
			super.setState(state);
		}
		
		/*
		 * Get the known positions. KnownPosition has the fields:
		 * 	map<String, Pose> positions
		 * 	Pose has the fields:
		 * 	Point3d position:
		 * 		Point3d has the fields:
		 * 			double x
		 * 			double y 
		 * 			double z
		 * 	EulerAngles orientation:
		 * 		EulerAngles has the fields:
		 * 			double x
		 * 			double y
		 * 			double z
		 */
		@Override
		public KnownPositions getKnownPositions() throws TException {
			return super.getKnownPositions();
		}
		
		/*
		 * Set the state of the mir.
		 * MIRState is an enum:
		 * 	Error, Executing, Ready, Paused, Manual
		 */
		@Override
		public String getRobotState() throws TException {
			return super.getRobotState();
		}
		
		/*
		 * Stop the mir100.
		 */
		@Override
		public void stopMovement() throws TException {
			super.stopMovement();
		}
		
		/*
		 * Move mir to position positionName.
		 */
		@Override
		public void gotoNamedPosition(String positionName) throws GotoException, TException {
			super.gotoNamedPosition(positionName);
		}
	}


	
}
