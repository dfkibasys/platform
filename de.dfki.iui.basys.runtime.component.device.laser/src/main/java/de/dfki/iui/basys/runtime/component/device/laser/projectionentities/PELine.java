package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;

public class PELine extends ProjectionEntity {

	@JsonProperty
	private double x2;

	@JsonProperty
	private double y2;

	@JsonProperty
	private double z2;

	public PELine(double x, double y, double z, double x2, double y2, double z2, EProjectionColor color) {
		super(x, y, z, color);
		type = "line";
		this.x2 = x2;
		this.y2 = y2;
		this.z2 = z2;
	}

}
