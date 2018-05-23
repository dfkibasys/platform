package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.data.CartesianCoordinate;
import de.dfki.iui.basys.model.data.DataFactory;
import de.dfki.iui.basys.model.data.Path;
import de.dfki.iui.basys.model.data.RobotPositionInformation;
import de.dfki.iui.basys.model.data.impl.CartesianCoordinateImpl;
import de.dfki.iui.basys.model.data.impl.DataFactoryImpl;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.MoveToLocation;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.Property;
import de.dfki.iui.basys.model.runtime.component.ResponseStatus;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentFactoryImpl;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.general3d.Point3d;
import de.dfki.iui.hrc.general3d.Pose;
import de.dfki.iui.hrc.generalrobots.KnownPositions;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.iui.hrc.mir100.GotoException;
import de.dfki.iui.hrc.mir100.MIR;
import de.dfki.iui.hrc.mir100.MIRPathEvent;
import de.dfki.iui.hrc.mir100.MIRPoseEvent;
import de.dfki.iui.hrc.mir100.MIRState;
import de.dfki.iui.hrc.mir100.MIRStatus;
import de.dfki.iui.hrc.mir100.MIRStatusEvent;
import de.dfki.tecs.Event;

public class MirComponent extends TecsDeviceComponent {

	protected MirTECS client;
	private double mETA;
	private TopologyElement mTargetLocation;

	public MirComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);
		String[] subscribeTo = new String[3];
		subscribeTo[0] = "MIRPathEvent";
		subscribeTo[1] = "MIRPoseEvent";
		subscribeTo[2] = "MIRStatusEvent";
		connectToTecs("robot-mir-01", subscribeTo, "tecs", 9000);
	}

	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new MirTECS(protocol);
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {

		CapabilityVariant<?> c = (CapabilityVariant<?>) req.getCapabilityVariant();
		TopologyElement te = null;
		if (c.eClass().equals(CapabilityPackage.eINSTANCE.getMoveToLocation())) {
			te = ((MoveToLocation) c.getCapability()).getTargetLocation();

			if (mTargetLocation != null) {
				Property p = componentConfig.getProperty("sourceLocation");
				if (p == null) {
					p = new ComponentFactoryImpl().createProperty();
					p.setKey("sourceLocation");
					componentConfig.getProperties().add(p);
				}
				try {
					p.setValue(JsonUtils.toString(mTargetLocation));
				} catch (JsonProcessingException e1) {
					e1.printStackTrace();
				}
			}

			Property p = componentConfig.getProperty("targetLocation");
			if (p == null) {
				p = new ComponentFactoryImpl().createProperty();
				p.setKey("targetLocation");
				componentConfig.getProperties().add(p);
			}
			try {
				p.setValue(JsonUtils.toString(te));
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
			mTargetLocation = te;

		}

		UnitConfiguration uc = new UnitConfiguration();
		uc.setPayload(te);
		return uc;
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
				Notification not = CommFactory.getInstance().createNotification(payload);

				outChannel.sendNotification(not);
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}

			Property p = componentConfig.getProperty("path");
			if (p == null) {
				p = new ComponentFactoryImpl().createProperty();
				p.setKey("path");
				componentConfig.getProperties().add(p);
			}
			try {
				p.setValue(JsonUtils.toString(path));
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}

		}

		if (event.is("MIRPoseEvent")) {

			System.out.println("MIRPoseEvent RECEIVED");

			MIRPoseEvent e = new MIRPoseEvent();
			event.parseData(e);

			Point3d p = e.pose.position;
			RobotPositionInformation robotPosition = new DataFactoryImpl().createRobotPositionInformation();
			robotPosition.setPosition(new CartesianCoordinateImpl.Builder().x(p.x).y(p.y).z(p.z).build());
			robotPosition.setEta(mETA);

			try {
				payload = JsonUtils.toString(robotPosition);
				Notification not = CommFactory.getInstance().createNotification(payload);
				outChannel.sendNotification(not);

			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}

			Property prop = componentConfig.getProperty("robotPosition");
			if (prop == null) {
				prop = new ComponentFactoryImpl().createProperty();
				prop.setKey("robotPosition");
				componentConfig.getProperties().add(prop);
			}
			try {
				prop.setValue(JsonUtils.toString(robotPosition));
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
		}

		if (event.is("MIRStatusEvent")) {
			System.out.println("MIRStatusEvent RECEIVED");

			MIRStatusEvent e = new MIRStatusEvent();
			event.parseData(e);
			mETA = e.getStatus().eta;
		}
	}

	@Override
	public void onResetting() {
		try {
			client.setState(MIRState.Ready);
		} catch (TException e) {
			e.printStackTrace();
			abort();
		}
	}

	@Override
	public void onStarting() {
		TopologyElement targetElement = ((TopologyElement) getUnitConfig().getPayload());

		try {
			client.gotoNamedPosition(targetElement.getName());

			String payload = JsonUtils.toString(targetElement);
			Notification not = CommFactory.getInstance().createNotification(payload);

			outChannel.sendNotification(not);

		} catch (TException e) {
			e.printStackTrace();
			abort();
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void onExecute() {
		try {
			boolean executing = true;
			while (executing) {
				CommandResponse cs = client.getCommandState();
				String robotState = client.getRobotState();
				
				if (robotState.equals("Error") || robotState.equals("Manual")) {
					executing = false;
					setErrorCode(1);
					abort();
					break;
				}

				switch (cs.state) {
				case ABORTED:
					executing = false;
					setErrorCode(1);
					abort();
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
					/* what to do */ 
					break;
				case READY:
					/* what to do */ 
					break;
				case REJECTED:
					executing = false;
					setErrorCode(2);
					abort();
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
			abort();
		}
	}

	@Override
	public void onCompleting() {
		// mir is in the position. nothing to do

		// send response to basys (dp)
		// TODO: move to base class DeviceComponent
		sendComponentResponse(ResponseStatus.OK, 0);
	}

	@Override
	public void onStopping() {
		mTargetLocation = null;
		try {
			client.stopMovement();

			// send response to basys (dp)
			// TODO: move to base class DeviceComponent; requires a statusCode member
			// variable to be set here
			sendComponentResponse(ResponseStatus.NOT_OK, 0);
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
		// perform reconnect
		close();
		try {
			open();
		} catch (TTransportException e1) {
			e1.printStackTrace();
		}
		
		// clear the error and set mir in a ready status
		try {
			client.setState(MIRState.Ready);
		} catch (TException e) {
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
