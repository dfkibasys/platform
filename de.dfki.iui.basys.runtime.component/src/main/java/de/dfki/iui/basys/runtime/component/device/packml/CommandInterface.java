package de.dfki.iui.basys.runtime.component.device.packml;

public interface CommandInterface {
	
	void setMode(Mode mode) throws PackMLException;
	
	void setUnitConfig(UnitConfiguration config) throws PackMLException;
	
	void reset();
	void start();
	void stop();
	void hold();
	void unhold();
	void suspend();
	void unsuspend();
	void abort();
	void clear();
}
