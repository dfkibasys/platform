package de.dfki.iui.basys.runtime.services.impl;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.WorldModelManager;

public class WorldModelManagerImpl extends EmfServiceComponent implements WorldModelManager {

	public WorldModelManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public WorldModel getCurrentWorld() {
		
		return null;

	}

	@Override
	public StaticWorldModel getStaticWorld() {
		return null;
	}

}
