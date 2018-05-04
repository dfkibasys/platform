package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialCatalogue;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;
import de.dfki.iui.basys.model.domain.material.MaterialPackage;
import de.dfki.iui.basys.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.iui.basys.model.domain.material.util.MaterialResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.MaterialManager;

public class MaterialManagerImpl extends EmfServiceComponent implements MaterialManager {

	public MaterialManagerImpl(ComponentConfiguration config) {
		super(config);
		MaterialPackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("material", new MaterialResourceFactoryImpl());
	}

	@Override
	public List<Material> getAllMaterials() {
		return getAllEntities(MaterialPackage.eINSTANCE.getMaterial(), true);
	}

	@Override
	public Material getMaterial(String id) {
		return getEntity(id);
	}

	@Override
	public void deleteMaterial(String id) {
		deleteEntity(id);
	}

	@Override
	public List<MaterialGroup> getMaterialGroups() {
		return getAllEntities(MaterialPackage.eINSTANCE.getMaterialGroup(), false);
	}

	@Override
	public String addMaterialGroup(MaterialGroup materialGroup) {
		MaterialCatalogue catalogue = getFirstEntity(MaterialPackage.eINSTANCE.getMaterialCatalogue());
		catalogue.getMaterialGroups().add(materialGroup);
		return materialGroup.getId();
	}

	@Override
	public MaterialGroup getMaterialGroup(String id) {
		return getEntity(id);
	}

	@Override
	public void deleteMaterialGroup(String id) {
		deleteEntity(id);
	}

	@Override
	public String addMaterialToGroup(Material material, String materialGroupId) {
		MaterialGroup parentGroup = getEntity(materialGroupId);
		if (parentGroup != null) {
			parentGroup.getMaterials().add(material);
			return material.getId();
		}
		return null;
	}

	@Override
	public String addMaterialGroupToGroup(MaterialGroup materialGroup, String materialGroupId) {
		MaterialGroup parentGroup = getEntity(materialGroupId);
		if (parentGroup != null) {
			parentGroup.getMaterialGroups().add(materialGroup);
			return materialGroup.getId();
		}
		return null;
	}

}
