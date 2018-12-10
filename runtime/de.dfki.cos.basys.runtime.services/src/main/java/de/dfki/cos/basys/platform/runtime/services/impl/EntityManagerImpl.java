package de.dfki.cos.basys.platform.runtime.services.impl;

import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.EntityManager;
import de.dfki.cos.basys.platform.runtime.services.MaterialManager;
import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialCatalogue;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;
import de.dfki.iui.basys.model.domain.material.MaterialPackage;
import de.dfki.iui.basys.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.iui.basys.model.domain.material.util.MaterialResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;

public class EntityManagerImpl extends EmfServiceComponent implements EntityManager {

	public EntityManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public Entity getEntity(String id) {
		return super.getEntity(id);
	}

}
