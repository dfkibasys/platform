package de.dfki.iui.basys.runtime.component.device.tecs.deprecated;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.data.Path;
import de.dfki.iui.basys.model.data.RobotPositionInformation;
import de.dfki.iui.basys.model.data.impl.CartesianCoordinateImpl;
import de.dfki.iui.basys.model.data.impl.DataFactoryImpl;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.general3d.Point3d;

public class SimulatedMirComponent extends DeviceComponent {

	public SimulatedMirComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);

		JFrame meinFrame = new JFrame("Beispiel JFrame");
		meinFrame.setSize(300, 230);
		JButton btn = new JButton("Beispiel");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<Point3d> path = new ArrayList<>();
				path.add(new Point3d(0, 0, 0));
				path.add(new Point3d(0.1, 0, 0));
				path.add(new Point3d(0.2, 0, 0));
				path.add(new Point3d(0.3, 0, 0));
				path.add(new Point3d(0.4, 0, 0));
				path.add(new Point3d(0.5, 0, 0));
				path.add(new Point3d(0.6, 0, 0));
				path.add(new Point3d(0.7, 0, 0));
				path.add(new Point3d(0.8, 0, 0));
				path.add(new Point3d(0.9, 0, 0));
				path.add(new Point3d(1.1, 0, 0));
				simulatePath(path);

				for (int i = 0; i < 100; i++) {
					Thread t = new Thread(new Runnable() {

						@Override
						public void run() {
							simulatePosition(new Point3d(1, 2, 3));

						}
					});
					t.start();
				}

			}
		});
		meinFrame.add(btn);
		meinFrame.setVisible(true);

	}

	private void simulatePath(List<Point3d> ePath) {

		System.out.println("SIMULATED PATH STARTED");

		Path path = DataFactoryImpl.eINSTANCE.createPath();
		for (Point3d p : ePath) {
			path.getCoordinates().add(new CartesianCoordinateImpl.Builder().x(p.x).y(p.y).z(p.z).build());
		}

		try {
			String payload = JsonUtils.toString(path);
			Notification not = CommFactory.getInstance().createNotification(payload);

			outChannel.sendNotification(not);
			System.out.println("SIMULATED PATH SENT");
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
	}

	private void simulatePosition(Point3d p) {

		System.out.println("SIMULATED POSITION STARTED");
		RobotPositionInformation robotPosition = new DataFactoryImpl().createRobotPositionInformation();
		robotPosition.setPosition(new CartesianCoordinateImpl.Builder().x(p.x).y(p.y).z(p.z).build());

		try {
			String payload = JsonUtils.toString(robotPosition);
			Notification not = CommFactory.getInstance().createNotification(payload);
			outChannel.sendNotification(not);
			System.out.println("SIMULATED POSITION SENT");

		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {

		return new UnitConfiguration();
	}

}
