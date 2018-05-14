package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;

public class PECircle extends ProjectionEntity {

	@JsonProperty
	private double radius;

	@JsonProperty
	private double angleStart;

	@JsonProperty
	private double angleLength;

	public PECircle(double x, double y, double z, double radius, double angleStart, double angleLength,
			EProjectionColor color) {
		super(x, y, z, color);
		type = "circle";
		this.radius = radius;
		this.angleStart = angleStart;
		this.angleLength = angleLength;
	}

}
