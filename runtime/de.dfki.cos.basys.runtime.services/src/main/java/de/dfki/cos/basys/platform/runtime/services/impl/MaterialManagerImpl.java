package de.dfki.cos.basys.platform.runtime.services.impl;

import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.MaterialManager;
import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialCatalogue;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;
import de.dfki.iui.basys.model.domain.material.MaterialPackage;
import de.dfki.iui.basys.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.iui.basys.model.domain.material.util.MaterialResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;

public class MaterialManagerImpl extends EmfServiceComponent implements MaterialManager {

	public MaterialManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public MaterialCatalogue getMaterialCatalogue() {
		MaterialCatalogue catalogue = getFirstEntity(MaterialPackage.eINSTANCE.getMaterialCatalogue());
		return catalogue;
	}

	@Override
	public Material getMaterial(String id) {
		return getEntity(id);
	}

	@Override
	public MaterialGroup getMaterialGroup(String id) {
		return getEntity(id);
	}

}
