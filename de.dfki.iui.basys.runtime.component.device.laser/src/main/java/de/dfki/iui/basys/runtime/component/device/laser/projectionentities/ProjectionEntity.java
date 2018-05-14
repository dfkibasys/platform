package de.dfki.iui.basys.runtime.component.device.laser.projectionentities;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.dfki.iui.basys.runtime.component.device.laser.EProjectionColor;

public abstract class ProjectionEntity {

	@JsonProperty
	protected String type;

	@JsonProperty
	private double x;

	@JsonProperty
	private double y;

	@JsonProperty
	private double z;

	@JsonProperty
	private int color;

	public ProjectionEntity(double x, double y, double z, EProjectionColor color) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.color = color.getColor();

	}

}
