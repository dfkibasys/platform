package de.dfki.iui.basys.runtime.component.device.laser;

public enum EProjectionColor {

	RED(0x0FFF0000), GREEN(0x0F00FF00), YELLOW(0x0FFFFF00);

	private final int mColor;

	private EProjectionColor(int color) {

		mColor = color;

	}

	public int getColor() {
		return mColor;
	}

}
