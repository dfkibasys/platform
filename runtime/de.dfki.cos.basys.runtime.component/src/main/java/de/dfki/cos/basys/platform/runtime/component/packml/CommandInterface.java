package de.dfki.cos.basys.platform.runtime.component.packml;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;

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
