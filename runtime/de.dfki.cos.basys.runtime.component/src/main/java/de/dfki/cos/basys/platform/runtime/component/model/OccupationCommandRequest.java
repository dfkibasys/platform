/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import de.dfki.cos.basys.controlcomponent.OccupationCommand;

public class OccupationCommandRequest extends ControlComponentRequest {
	
	OccupationCommand occupationCommand;

	public OccupationCommandRequest() {}
	
	public OccupationCommand getOccupationCommand() {
		return occupationCommand;
	}

	public void setOccupationCommand(OccupationCommand occupationCommand) {
		this.occupationCommand = occupationCommand;
	}

}