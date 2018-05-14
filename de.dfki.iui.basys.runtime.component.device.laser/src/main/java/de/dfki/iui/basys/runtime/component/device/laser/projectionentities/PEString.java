package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;

public class PEString extends ProjectionEntity {

	@JsonProperty
	private String text;

	@JsonProperty
	private double height;

	public PEString(double x, double y, double z, String text, double height, EProjectionColor color) {
		super(x, y, z, color);
		type = "string";
		this.text = text;
		this.height = height;
	}

}
