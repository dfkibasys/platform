package de.dfki.iui.basys.runtime.component;

import de.dfki.iui.basys.runtime.component.device.packml.Mode;
import de.dfki.iui.basys.runtime.component.device.packml.State;

public interface Component {

	String getId();

	String getName();

	ComponentCategory getCategory();

	ComponentConfiguration getConfig();

	State getState();

	Mode getMode();

	void activate(ComponentContext context) throws ComponentException;

	void deactivate() throws ComponentException;

}
