package de.dfki.iui.basys.runtime.component.packml;

public interface StatusInterface {

	String getId();

	State getState();
	
	Mode getMode();	

	UnitConfiguration getConfig();
}
