package de.dfki.cos.basys.platform.runtime.component;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;
import de.dfki.cos.basys.platform.model.runtime.component.State;

public interface Component {

	final String baseStatusChannelName = "basys#components#status";

	String getId();

	String getName();

	ComponentCategory getCategory();

	ComponentConfiguration getConfig();
	
	ComponentInfo getComponentInfo();

	State getState();

	ControlMode getMode();

	void activate(ComponentContext context) throws ComponentException;

	void deactivate() throws ComponentException;
	
	boolean isActivated();

}
