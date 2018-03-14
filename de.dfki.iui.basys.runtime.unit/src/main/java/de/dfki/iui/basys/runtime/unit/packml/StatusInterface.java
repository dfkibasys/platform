package de.dfki.iui.basys.runtime.unit.packml;

public interface StatusInterface {

	String getId();

	State getState();
	
	Mode getMode();	

	UnitConfiguration getConfig();
}
