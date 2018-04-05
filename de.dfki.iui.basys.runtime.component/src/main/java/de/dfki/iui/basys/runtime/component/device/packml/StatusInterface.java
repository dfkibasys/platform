package de.dfki.iui.basys.runtime.component.device.packml;

public interface StatusInterface {

	String getId();

	State getState();
	
	Mode getMode();	

	UnitConfiguration getUnitConfig();
}
