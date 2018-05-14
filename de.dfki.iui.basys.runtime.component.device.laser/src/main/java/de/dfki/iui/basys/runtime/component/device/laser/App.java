package de.dfki.iui.basys.runtime.component.device.laser;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import de.dfki.iui.basys.runtime.component.device.laser.action.Projection;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEChar;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PECircle;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEEllipse;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PELine;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEMovingArrows;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PERectangle;
import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.PEString;

public class App {

	private static final String REST_URI = "http://192.168.100.3:9000/laserControl";

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();

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

		//p.addEntity(new PEMovingArrows(points, 5, 1000, EProjectionColor.RED));
		//p.addEntity(new PEMovingArrows(points, 1, 5000, EProjectionColor.RED));

		client.target(REST_URI).request(MediaType.APPLICATION_JSON).put(Entity.entity(p, MediaType.APPLICATION_JSON));
		// client.target(REST_URI).request(MediaType.APPLICATION_JSON).put(Entity.entity(new
		// StopProjection(), MediaType.APPLICATION_JSON));

	}
}
