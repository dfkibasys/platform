package de.dfki.cos.basys.platform.runtime.services.v2.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.material.Material;
import de.dfki.cos.basys.platform.model.domain.material.MaterialCatalogue;
import de.dfki.cos.basys.platform.model.domain.material.MaterialGroup;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.cos.basys.platform.model.domain.material.util.MaterialResourceFactoryImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.emf.EmfBasysComponent;
import de.dfki.cos.basys.platform.runtime.services.MaterialManager;

public class MaterialManagerImpl extends EmfBasysComponent implements MaterialManager {

	public MaterialManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public MaterialCatalogue getMaterialCatalogue() {
		MaterialCatalogue catalogue = client.getFirstEntity(MaterialPackage.eINSTANCE.getMaterialCatalogue());
		return catalogue;
	}

	@Override
	public Material getMaterial(String id) {
		return client.getEntity(id);
	}

	@Override
	public MaterialGroup getMaterialGroup(String id) {
		return client.getEntity(id);
	}

}
