package de.dfki.iui.basys.runtime.component.device.packml;

import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ControlMode;

public interface CommandInterface {

	ComponentRequestStatus setMode(ControlMode mode);

	ComponentRequestStatus setUnitConfig(UnitConfiguration config);

	ComponentRequestStatus reset();

	ComponentRequestStatus start();

	ComponentRequestStatus stop();

	ComponentRequestStatus hold();

	ComponentRequestStatus unhold();

	ComponentRequestStatus suspend();

	ComponentRequestStatus unsuspend();

	ComponentRequestStatus abort();

	ComponentRequestStatus clear();
}
