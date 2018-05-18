package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.data.CartesianCoordinate;
import de.dfki.iui.basys.model.data.DataFactory;
import de.dfki.iui.basys.model.data.Path;
import de.dfki.iui.basys.model.data.impl.CartesianCoordinateImpl;
import de.dfki.iui.basys.model.data.impl.DataFactoryImpl;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.communication.ClientFactory;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.general3d.Point3d;
import de.dfki.iui.hrc.general3d.Pose;
import de.dfki.iui.hrc.generalrobots.KnownPositions;
import de.dfki.iui.hrc.generalrobots.RobotStateEvent;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.mir100.GotoException;
import de.dfki.iui.hrc.mir100.MIR;
import de.dfki.iui.hrc.mir100.MIRPathEvent;
import de.dfki.iui.hrc.mir100.MIRState;
import de.dfki.iui.hrc.mir100.MIRStatus;
import de.dfki.tecs.Event;

public class MirComponent extends TecsDeviceComponent {

	private boolean first = true;

	protected static final String[] POSITION = { "Station-QA", "Station-TeachIn", "Station-Cola", "Station-BaSys",
			"Station-Wait", "Station-Festo" };
	/*
	 * 0: Station-QA 1: Station-TeachIn 2: Station-Cola 3: Station-BaSys 4:
	 * Station-Wait 5: Station-Festo
	 */

	// from dieter: besser string enums?
	protected enum Position {
		STATION_QA("Station-QA"), STATION_TEACHIN("Station-TeachIn"), STATION_COLA("Station-Cola"), STATION_BASYS(
				"Station-BaSys"), STATION_WAIT("Station-Wait"), STATION_FESTO("Station-Festo");

		private final String stationName;

		private Position(String name) {
			stationName = name;
		}

		@Override
		public String toString() {
			return stationName;
		}
	}

	public MirComponent(ComponentConfiguration config) {
		super(config);
		// connect to tecs
		String[] subscribeTo = new String[2];
		subscribeTo[0] = "MIRPathEvent";
		subscribeTo[1] = "RobotStateEvent";
		connectToTecs("robot-mir-01", subscribeTo, "tecs", 9000);

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.basys.runtime.component.device.tecs.TecsDeviceComponent#
	 * handleTecsEvent(de.dfki.tecs.Event) handle tecs events here
	 */
	@Override
	protected void handleTecsEvent(Event event) {

		String payload;

		if (event.is("MIRPathEvent")) {

			System.out.println("MIRPATH RECEIVED");

			MIRPathEvent e = new MIRPathEvent();
			event.parseData(e);

			Path path = DataFactoryImpl.eINSTANCE.createPath();
			for (Point3d p : e.path.path) {
				path.getCoordinates().add(new CartesianCoordinateImpl.Builder().x(p.x).y(p.y).z(p.z).build());
			}

			try {
				payload = JsonUtils.toString(path);
				Notification not = ClientFactory.getInstance().createNotification(payload);
				while (!outChannel.isOpen()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e2) {
						e2.printStackTrace();
					}
				}
				outChannel.sendNotification(not);
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}

		}

		if (event.is("RobotStateEvent")) {

			System.out.println("ROBOTSTATEEVENT RECEIVED");

			RobotStateEvent e = new RobotStateEvent();
			event.parseData(e);

			Point3d p = e.pose.position;
			CartesianCoordinate position = new CartesianCoordinateImpl.Builder().x(p.x).y(p.y).z(p.z).build();

			try {
				payload = JsonUtils.toString(position);
				Notification not = ClientFactory.getInstance().createNotification(payload);
				while (!outChannel.isOpen()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e2) {
						e2.printStackTrace();
					}
				}
				outChannel.sendNotification(not);

			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}

		}

	}

	@Override
	public void onResetting() {
		System.out.println("onResetting - begin");
		try {
			client.setState(MIRState.Ready);
			int x = 0;
		} catch (TException e) {
			e.printStackTrace();
			stop();
		}
		System.out.println("onResetting - end");
	}

	@Override
	public void onStarting() {
		System.out.println("onStarting - begin");
		/*
		 * try {
		 * //client.gotoNamedPositionDelayed(POSITION[getUnitConfig().getRecipe()]);
		 * client.gotoNamedPosition(Position.STATION_COLA.toString()); } catch
		 * (TException e) { e.printStackTrace(); stop(); }
		 */

		System.out.println("onStarting - end");
	}

	@Override
	public void onExecute() {
		System.out.println("onExecute - begin");
		try {
			boolean executing = true;
			while (executing) {
				CommandResponse cs = client.getCommandState();
				String robotState = client.getRobotState();
				System.out.println("STRING " + robotState);
				if (robotState.equals("Error") || robotState.equals("Manual")) {
					executing = false;
					setErrorCode(1);
					stop();
					break;
				}

				switch (cs.state) {
				case ABORTED:
					System.out.println("Mir status: ABORTED");
					executing = false;
					setErrorCode(1);
					stop();
					break;
				case ACCEPTED:
					System.out.println("Mir status: ACCEPTED");
					// nothing to do, wait until finished
					break;
				case EXECUTING:
					System.out.println("Mir status: EXECUTING");
					// nothing to do, wait until finished
					break;
				case FINISHED:
					System.out.println("Mir status: FINISHED");
					executing = false;
					break;
				case PAUSED:
					System.out.println("Mir status: PAUSED");
					/* what to do */ break;
				case READY:
					System.out.println("Mir status: READY");
					/* what to do */ break;
				case REJECTED:
					System.out.println("Mir status: REJECTED");
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

				System.out.println("Mir status: " + cs.state + " --");
			}
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(3);
			stop();
		}
		System.out.println("onExecute - end");

		try {
			System.out.println("Last RobotState" + client.getRobotState());
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("Last Command State: " + client.getCommandState().state);
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	 * Get the path of the mir. Returns an array with values where: values[i * 3] is
	 * the X coordinate of the i-th point, values[i * 3 + 1] is the Y coordinate of
	 * the i-th point and values[i * 3 + 2] is the Z coordinate of the i-th point.
	 * (values / 3) is the number of points.
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
			de.dfki.iui.hrc.generalrobots.Path tecsPath = (client.getPath());
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
		 * get the status of the mir. fields are: double batteryPercentage String
		 * batteryTimeLeft double distanceMoved double eta String mode String state
		 * String message
		 */
		@Override
		public MIRStatus getStatus() throws TException {
			return super.getStatus();
		}

		/*
		 * Get the path of the mir. Path has a field path which is a list of 3d points.
		 * A 3d point has the fields: double x double y double z
		 */
		@Override
		public de.dfki.iui.hrc.generalrobots.Path getPath() throws TException {
			return super.getPath();
		}

		/*
		 * Get the command response. CommandResponse has the fields: String description
		 * CommandState state: CommandState is an enum: ACCEPTED, EXECUTING, FINISHED,
		 * ABORTED, PAUSED, REJECTED, READY
		 */
		@Override
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState();
		}

		/*
		 * Get the pose of the mir. Pose has the fields: Point3d position: Point3d has
		 * the fields: double x double y double z EulerAngles orientation: EulerAngles
		 * has the fields: double x double y double z
		 */
		@Override
		public Pose getPose() throws TException {
			return super.getPose();
		}

		/*
		 * Set the state of the mir. MIRState is an enum: Error, Executing, Ready,
		 * Paused, Manual
		 */
		@Override
		public void setState(MIRState state) throws TException {
			// Not implemented yet
			// super.setState(state);
		}

		/*
		 * Get the known positions. KnownPosition has the fields: map<String, Pose>
		 * positions Pose has the fields: Point3d position: Point3d has the fields:
		 * double x double y double z EulerAngles orientation: EulerAngles has the
		 * fields: double x double y double z
		 */
		@Override
		public KnownPositions getKnownPositions() throws TException {
			return super.getKnownPositions();
		}

		/*
		 * Set the state of the mir. MIRState is an enum: Error, Executing, Ready,
		 * Paused, Manual
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

		@Override
		public void gotoNamedPositionDelayed(String positionName, double delay) throws GotoException, TException {
			super.gotoNamedPositionDelayed(positionName, delay);
		}
	}

}
