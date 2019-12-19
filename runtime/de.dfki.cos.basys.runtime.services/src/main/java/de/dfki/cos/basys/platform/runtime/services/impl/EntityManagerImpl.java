package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.runtime.services.EntityManager;

public class EntityManagerImpl extends EmfBasysComponent implements EntityManager {

	public EntityManagerImpl(Properties config) {
		super(config);			
	}

	@Override
	public Entity getEntity(String id) {
		return getService().getEntity(id);
	}

}
