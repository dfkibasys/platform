package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;
import de.dfki.iui.basys.runtime.component.device.laser.Vec2D;

public class PEMovingArrows extends ProjectionEntity {

	@JsonProperty
	private List<Vec2D> points;

	@JsonProperty
	private int arrowCount;

	@JsonProperty
	private int delay;

	public PEMovingArrows(List<Vec2D> points, int arrowCount, int delay, EProjectionColor color) {
		super(0, 0, 0, color);
		type = "movingArrows";
		this.points = points;
		this.arrowCount = arrowCount;
		this.delay = delay;

	}

}
