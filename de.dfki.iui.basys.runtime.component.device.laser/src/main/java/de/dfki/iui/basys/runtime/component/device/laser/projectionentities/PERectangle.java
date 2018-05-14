package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;

public class PERectangle extends ProjectionEntity {

	@JsonProperty
	private double width;

	@JsonProperty
	private double height;

	public PERectangle(double x, double y, double z, double width, double height, EProjectionColor color) {
		super(x, y, z, color);
		type = "rectangle";
		this.width = width;
		this.height = height;
	}

}
