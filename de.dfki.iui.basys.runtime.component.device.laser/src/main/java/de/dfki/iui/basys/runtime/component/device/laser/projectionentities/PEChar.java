package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;

public class PEChar extends ProjectionEntity {

	@JsonProperty
	private char chr;
	
	@JsonProperty
	private double height;

	public PEChar(double x, double y, double z, char chr, double height, EProjectionColor color) {
		super(x, y, z, color);
		type = "char";
		this.chr = chr;
		this.height = height;
	}
}
