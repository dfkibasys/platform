/**
 */
package de.dfki.cos.basys.platform.runtime.component.model;

import de.dfki.cos.basys.controlcomponent.OccupationLevel;

public class OccupationLevelRequest extends ComponentRequest {
	
	OccupationLevel occupationLevel;

	public OccupationLevel getOccupationLevel() {
		return occupationLevel;
	}

	public void setOccupationLevel(OccupationLevel occupationLevel) {
		this.occupationLevel = occupationLevel;
	}

}