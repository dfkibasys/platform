package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;

public class PEEllipse extends ProjectionEntity {

	@JsonProperty
	private double majorRadius;

	@JsonProperty
	private double minorRadius;

	@JsonProperty
	private double angleStart;

	@JsonProperty
	private double angleLength;

	public PEEllipse(double x, double y, double z, double majorRadius, double minorRadius, double angleStart,
			double angleLength, EProjectionColor color) {
		super(x, y, z, color);
		type = "ellipse";
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
		this.angleStart = angleStart;
		this.angleLength = angleLength;
	}

}
