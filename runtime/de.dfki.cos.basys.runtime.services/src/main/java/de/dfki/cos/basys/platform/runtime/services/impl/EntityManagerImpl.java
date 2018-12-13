package de.dfki.cos.basys.platform.runtime.services.impl;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.material.Material;
import de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue;
import de.dfki.cos.basys.platform.model.domain.material.MaterialGroup;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.cos.basys.platform.model.domain.material.util.MaterialResourceFactoryImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.EntityManager;
import de.dfki.cos.basys.platform.runtime.services.MaterialManager;

public class EntityManagerImpl extends EmfServiceComponent implements EntityManager {

	public EntityManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public Entity getEntity(String id) {
		return super.getEntity(id);
	}

}
