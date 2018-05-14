package de.dfki.iui.basys.runtime.component.device.laser.action;

import java.util.ArrayList;
import java.util.List;

import de.dfki.iui.basys.runtime.component.device.laser.projectionentities.ProjectionEntity;

public class Projection extends LaserAction {

	public List<ProjectionEntity> data = new ArrayList<>();

	public Projection() {

		action = "projection";
	}

	public void addEntity(ProjectionEntity entity) {
		data.add(entity);
	}

}
