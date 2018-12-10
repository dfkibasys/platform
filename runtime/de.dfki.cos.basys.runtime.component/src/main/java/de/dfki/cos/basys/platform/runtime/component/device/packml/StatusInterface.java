package de.dfki.cos.basys.platform.runtime.component.device.packml;

import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.State;

public interface StatusInterface {

	String getId();

	State getState();

	ControlMode getMode();

	UnitConfiguration getUnitConfig();
}