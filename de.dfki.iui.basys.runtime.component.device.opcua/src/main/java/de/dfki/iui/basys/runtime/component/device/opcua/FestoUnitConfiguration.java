package de.dfki.iui.basys.runtime.component.device.opcua;

import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;

public class FestoUnitConfiguration implements UnitConfiguration {

	private short lidNumber = -1;
	
	public short getLidNumber() {
		return lidNumber;
	}
	
	public void setLidNumber(short lidNumber) {
		this.lidNumber = lidNumber;
	}
	
}
