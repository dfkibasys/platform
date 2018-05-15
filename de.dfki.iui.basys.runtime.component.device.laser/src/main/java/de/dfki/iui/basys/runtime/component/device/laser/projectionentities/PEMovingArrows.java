package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.model.data.CartesianCoordinate;
import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;

public class PEMovingArrows extends ProjectionEntity {

	@JsonProperty
	private List<CartesianCoordinate> points;

	@JsonProperty
	private int arrowCount;

	@JsonProperty
	private long delay;

	public PEMovingArrows(List<CartesianCoordinate> points, int arrowCount, long delay, EProjectionColor color) {
		super(0, 0, 0, color);
		type = "movingArrows";
		this.points = points;
		this.arrowCount = arrowCount;
		this.delay = delay;

	}

}
