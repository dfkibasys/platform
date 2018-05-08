package de.dfki.iui.basys.runtime.component.device.tecs;

import javax.ws.rs.core.Form;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import com.sun.istack.logging.Logger;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.hrc.general3d.Pose;
import de.dfki.iui.hrc.generalrobots.KnownPositions;
import de.dfki.iui.hrc.generalrobots.Path;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.hybritcommand.CommandState;
import de.dfki.iui.hrc.mir100.GotoException;
//import de.dfki.iui.hrc.mir100.GotoException;
//import de.dfki.iui.hrc.mir100.MIR;
import de.dfki.iui.hrc.mir100.MIR;
import de.dfki.iui.hrc.mir100.MIRState;
import de.dfki.iui.hrc.mir100.MIRStatus;

//for debug
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mir100 extends DeviceComponent{

	/*
	 * For testing
	 */
	static Mir100 m;
	
	/*
	 * Just for debug. Let Mir drive to a position
	 */
	public static void main(String[] args) {
		ComponentConfiguration opcuaConfig = new ComponentConfiguration.Builder().componentId("test-opcua-component")
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
			mirTECS.setState(MIRState.Ready);
		} catch (TException e) {
			e.printStackTrace();
			onAborting();
		}
	}

	@Override
	public void onStarting() {
		try {
			mirTECS.gotoNamedPosition(POSITION[5]);
			onExecute(); // ?
		} catch (TException e) {
			e.printStackTrace();
			onAborting();
		}
	}

	@Override
	public void onExecute() {
		try {
			CommandResponse cs = mirTECS.getCommandState();
			boolean executing = true;
			while (executing) {
				switch (cs.state) {
				case ABORTED: executing = false; onAborting(); break;
				case ACCEPTED: /* nothing to do, wait until finished */ break;
				case EXECUTING: /* nothing to do, wait until finished */ break;
				case FINISHED: executing = false; /* SEND FINISH SIGNAL */ onCompleting(); break;
				case PAUSED: /* what to do */ break;
				case READY: /* what to do */ break;
				case REJECTED: executing = false; onAborting(); break;
				default: break;
				}
				Thread.sleep(10);
			}
		} catch (TException e) {
			e.printStackTrace();
			onAborting();
		} catch (InterruptedException e) {
			e.printStackTrace();
			onAborting();
		}
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
			mirTECS.stopMovement();
		} catch (TException e) {
			e.printStackTrace();
			// nothing we can do.
		}
	}

	@Override
	public void onClearing() {
		// nothing to clear. Move Mir to default position?
	}

	@Override
	public void onStopping() {
		try {
			mirTECS.stopMovement();
		} catch (TException e) {
			e.printStackTrace();
			onAborting();
		}
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
		 * Get the path of the mir. Path is a list of 3d points.
		 * A 3d point has the fields: x, y and z.
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
