package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import de.dfki.iui.basys.model.data.CartesianCoordinate;
import de.dfki.iui.basys.model.data.DataFactory;
import de.dfki.iui.basys.model.data.Path;
import de.dfki.iui.basys.model.data.impl.CartesianCoordinateImpl;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.general3d.Point3d;
import de.dfki.iui.hrc.general3d.Pose;
import de.dfki.iui.hrc.generalrobots.KnownPositions;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.mir100.GotoException;
import de.dfki.iui.hrc.mir100.MIR;
import de.dfki.iui.hrc.mir100.MIRState;
import de.dfki.iui.hrc.mir100.MIRStatus;

public class MirComponent extends TecsDeviceComponent {

	protected static final String[] POSITION = { "Station-QA", "Station-TeachIn", "Station-Cola", "Station-BaSys", "Station-Wait", "Station-Festo" };
	/*
	 * 0: Station-QA 1: Station-TeachIn 2: Station-Cola 3: Station-BaSys 4: Station-Wait 5: Station-Festo
	 */

	public MirComponent(ComponentConfiguration config) {
		super(config);
	}

	protected MirTECS client;

	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new MirTECS(protocol);
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

		try {
			client.setState(MIRState.Ready);
		} catch (TException e) {
			e.printStackTrace();
			stop();
		}

	}

	@Override
	public void onStarting() {

		try {
			client.gotoNamedPosition(POSITION[getUnitConfig().getRecipe()]);
			
			Path path = getPath();
			
			
		} catch (TException e) {
			e.printStackTrace();
			stop();
		}

	}

	@Override
	public void onExecute() {

		try {
			boolean executing = true;
			while (executing) {
				CommandResponse cs = client.getCommandState();
				String robotState = client.getRobotState();

				switch (cs.state) {
				case ABORTED:
					executing = false;
					setErrorCode(1);
					stop();
					break;
				case ACCEPTED:
					// nothing to do, wait until finished
					break;
				case EXECUTING:
					// nothing to do, wait until finished
					break;
				case FINISHED:
					executing = false;
					break;
				case PAUSED:
					/* what to do */ break;
				case READY:
					/* what to do */ break;
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
					// TODO Auto-generated catch block
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
		// mir is in the position. nothing to do
	}

	@Override
	public void onStopping() {
		try {
			client.stopMovement();
		} catch (TException e) {
			e.printStackTrace();
			abort();
		}
	}

	@Override
	public void onAborting() {
		// somehow trigger real emergency stop?!
		// if emergency stop is released, trigger a clear() command
	}

	@Override
	public void onClearing() {
		// nothing to clear. Move Mir to default position?
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

	/*
	 * Get the path of the mir. Returns an array with values where: values[i * 3] is the X coordinate of the i-th point, values[i * 3 + 1] is the Y coordinate of the i-th point and values[i * 3 + 2]
	 * is the Z coordinate of the i-th point. (values / 3) is the number of points.
	 */
	// public double[] getPath() {
	// try {
	// Path path = client.getPath();
	// Point3d[] points = (Point3d[])(path.path.toArray());
	// double[] values = new double[points.length * 3];
	// for (int i = 0; i < points.length; i++) {
	// values[i * 3] = points[i].x;
	// values[i * 3 + 1] = points[i].y;
	// values[i * 3 + 2] = points[i].z;
	// }
	// return values;
	// } catch (TException e) {
	// e.printStackTrace();
	// return new double[0];
	// }
	// }

	public Path getPath() {

		Path path = DataFactory.eINSTANCE.createPath();

		try {
			de.dfki.iui.hrc.generalrobots.Path  tecsPath = (client.getPath());
			for (Point3d point : tecsPath.path) {
				CartesianCoordinate c = new CartesianCoordinateImpl.Builder().x(point.x).y(point.y).z(point.z).build();
				path.getCoordinates().add(c);
			}
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return path;
	}

	/*
	 * Helper class to communicate with TECS
	 */
	private class MirTECS extends MIR.Client {

		private TProtocol protocol;

		public MirTECS(TProtocol prot) {
			super(prot);
			protocol = prot;
		}

		/*
		 * get the status of the mir. fields are: double batteryPercentage String batteryTimeLeft double distanceMoved double eta String mode String state String message
		 */
		@Override
		public MIRStatus getStatus() throws TException {
			return super.getStatus();
		}

		/*
		 * Get the path of the mir. Path has a field path which is a list of 3d points. A 3d point has the fields: double x double y double z
		 */
		@Override
		public de.dfki.iui.hrc.generalrobots.Path getPath() throws TException {
			return super.getPath();
		}

		/*
		 * Get the command response. CommandResponse has the fields: String description CommandState state: CommandState is an enum: ACCEPTED, EXECUTING, FINISHED, ABORTED, PAUSED, REJECTED, READY
		 */
		@Override
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState();
		}

		/*
		 * Get the pose of the mir. Pose has the fields: Point3d position: Point3d has the fields: double x double y double z EulerAngles orientation: EulerAngles has the fields: double x double y
		 * double z
		 */
		@Override
		public Pose getPose() throws TException {
			return super.getPose();
		}

		/*
		 * Set the state of the mir. MIRState is an enum: Error, Executing, Ready, Paused, Manual
		 */
		@Override
		public void setState(MIRState state) throws TException {
			super.setState(state);
		}

		/*
		 * Get the known positions. KnownPosition has the fields: map<String, Pose> positions Pose has the fields: Point3d position: Point3d has the fields: double x double y double z EulerAngles
		 * orientation: EulerAngles has the fields: double x double y double z
		 */
		@Override
		public KnownPositions getKnownPositions() throws TException {
			return super.getKnownPositions();
		}

		/*
		 * Set the state of the mir. MIRState is an enum: Error, Executing, Ready, Paused, Manual
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
