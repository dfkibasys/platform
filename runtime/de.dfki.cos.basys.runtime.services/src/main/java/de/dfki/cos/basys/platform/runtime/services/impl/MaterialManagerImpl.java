package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.material.Material;
import de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue;
import de.dfki.cos.basys.platform.model.domain.material.MaterialGroup;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.runtime.services.MaterialManager;

public class MaterialManagerImpl extends EmfBasysComponent implements MaterialManager {

	public MaterialManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public MaterialCatalogue getMaterialCatalogue() {
		MaterialCatalogue catalogue = service.getFirstEntity(MaterialPackage.eINSTANCE.getMaterialCatalogue());
		return catalogue;
	}

	@Override
	public Material getMaterial(String id) {
		return service.getEntity(id);
	}

	@Override
	public MaterialGroup getMaterialGroup(String id) {
		return service.getEntity(id);
	}

}
