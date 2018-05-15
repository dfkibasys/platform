package de.dfki.iui.basys.runtime.component.device.laser;

import java.util.concurrent.CountDownLatch;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.model.data.CartesianCoordinate;
import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.ProjectETA;
import de.dfki.iui.basys.model.domain.capability.ProjectPath;
import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.component.device.laser.action.Projection;
import de.dfki.iui.basys.runtime.component.device.laser.action.StopProjection;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEMovingArrows;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEMovingETA;
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

	private Projection createPathProjection(ProjectPath cap) {
		Projection p = new Projection();

		p.addEntity(new PEMovingArrows(cap.getPath().getCoordinates(), cap.getArrowCount(), cap.getDelay(),
				EProjectionColor.getColorByIndex(cap.getColor())));

		return p;
	}

	private Projection createEtaProjection(ProjectETA cap) {
		Projection p = new Projection();

		CartesianCoordinate center = cap.getPosition();
		p.addEntity(new PEMovingETA(center.getX(), center.getY(), center.getZ(), cap.getRadius(), cap.getOrientation(),
				60 * 1000, cap.getEta(), EProjectionColor.getColorByIndex(cap.getColor())));

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
		// client.target(getConfig().getExternalConnectionString()).request(MediaType.APPLICATION_JSON)
		// .put(Entity.entity(p, MediaType.APPLICATION_JSON));

	}

	@Override
	public void onExecute() {
		try {
			counter.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onStopping() {
		counter.countDown();

		LOGGER.info("call rest client");
		// client.target(getConfig().getExternalConnectionString()).request(MediaType.APPLICATION_JSON)
		// .put(Entity.entity(new StopProjection(), MediaType.APPLICATION_JSON));
	}
}
