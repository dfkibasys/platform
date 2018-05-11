package de.dfki.iui.basys.runtime.component;

import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.State;

public interface Component {

	final String statusChannelName = "basys#components#status";

	String getId();

	String getName();

	ComponentCategory getCategory();

	ComponentConfiguration getConfig();

	State getState();

	ControlMode getMode();

	void activate(ComponentContext context) throws ComponentException;

	void deactivate() throws ComponentException;
	
	boolean isActivated();

}
