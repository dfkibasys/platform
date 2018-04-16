package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.iui.basys.model.domain.material.util.MaterialResourceFactoryImpl;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.MaterialManager;

public class MaterialManagerImpl extends EmfServiceComponent implements MaterialManager {

	public MaterialManagerImpl(ComponentConfiguration config) {
		super(config);
		MaterialPackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("material", new MaterialResourceFactoryImpl());
	}

	@Override
	public Material getMaterial(String id) {
		return getEntity(id);
	}

	@Override
	public List<Material> getAllMaterials() {
		// TODO Auto-generated method stub
		return null;
	}

}
