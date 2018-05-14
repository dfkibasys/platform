package de.dfki.iui.basys.runtime.component.device.laser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.ProjectETA;
import de.dfki.iui.basys.model.domain.capability.ProjectPath;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.component.device.laser.action.Projection;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEChar;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PECircle;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEEllipse;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PELine;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PERectangle;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEString;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class LaserDeviceComponent extends DeviceComponent {

	Client client = ClientBuilder.newClient();

	CountDownLatch counter;

	public LaserDeviceComponent(ComponentConfiguration config) {
		super(config);
		resetOnStopped = true;
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {

		Capability c = (Capability) req.getCapability();

		Projection p;
		if (c.eClass().equals(CapabilityPackage.eINSTANCE.getProjectPath())) {
			p = createPathProjection((ProjectPath) c);
		} else if (c.eClass().equals(CapabilityPackage.eINSTANCE.getProjectETA())) {
			p = createEtaProjection((ProjectETA) c);
		} else {
			p = null;
		}

		UnitConfiguration uc = new UnitConfiguration();
		uc.setPayload(p);
		return uc;

	}

	private Projection createPathProjection(ProjectPath capability) {
		Projection p = new Projection();

		p.addEntity(new PEString(1050, 800, 0, "HA", 40, EProjectionColor.RED));
		p.addEntity(new PEString(1050, 700, 0, "LL", 40, EProjectionColor.YELLOW));
		p.addEntity(new PEString(1050, 600, 0, "O", 40, EProjectionColor.GREEN));
		p.addEntity(new PEChar(1050, 900, 0, 'C', 40, EProjectionColor.RED));
		p.addEntity(new PECircle(1050, 1000, 0, 40, 0.7, 0, EProjectionColor.GREEN));
		p.addEntity(new PEEllipse(1050, 1100, 0, 60, 20, 0, 0, EProjectionColor.YELLOW));
		p.addEntity(new PELine(950, 1200, 0, 1150, 1200, 0, EProjectionColor.RED));
		p.addEntity(new PERectangle(1050, 1200, 0, 100, 100, EProjectionColor.GREEN));

		List<Vec2D> points = new ArrayList<Vec2D>();
		points.add(new Vec2D(100, -140));
		points.add(new Vec2D(100, -125));
		points.add(new Vec2D(100, -100));
		points.add(new Vec2D(96.5, 25.9 - 100));
		points.add(new Vec2D(86.6, -50));
		points.add(new Vec2D(70.7, -29.3));
		points.add(new Vec2D(50.0, -13.4));
		points.add(new Vec2D(25.9, -3.5));
		points.add(new Vec2D(0, 0));
		points.add(new Vec2D(-30, 0));
		points.add(new Vec2D(-60, 0));

		// p.addEntity(new PEMovingArrows(points, 5, 1000, EProjectionColor.RED));
		// p.addEntity(new PEMovingArrows(points, 1, 5000, EProjectionColor.RED));

		return p;
	}

	private Projection createEtaProjection(ProjectETA capability) {
		Projection p = new Projection();

		return p;
	}

	@Override
	public void onResetting() {

		counter = new CountDownLatch(1);
	}

	@Override
	public void onStarting() {


		Projection p = (Projection) (getUnitConfig().getPayload());
		
		LOGGER.info("call rest client");
		// client.target(getConfig().getExternalConnectionString()).request(MediaType.APPLICATION_JSON).put(Entity.entity(p, MediaType.APPLICATION_JSON));

	}

	@Override
	public void onExecute() {
		try {
			counter.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onStopping() {
		counter.countDown();

		LOGGER.info("call rest client");
		//client.target(getConfig().getExternalConnectionString()).request(MediaType.APPLICATION_JSON).put(Entity.entity(new StopProjection(), MediaType.APPLICATION_JSON));
	}
}
