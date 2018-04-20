package de.dfki.iui.basys.osgi.services.internal;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.material.MaterialGroup;
import de.dfki.iui.basys.osgi.services.BasysOsgiComponent;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.services.MaterialManager;
import de.dfki.iui.basys.runtime.services.impl.MaterialManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class MaterialManagerServiceImpl extends BasysOsgiComponent implements MaterialManager {

	ComponentManager componentManager;
	MaterialManagerImpl impl;

	public MaterialManagerServiceImpl() {
		LOGGER.info("MaterialManagerServiceImpl created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new MaterialManagerImpl(config);
		try {
			componentManager.addLocalComponent(impl);
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	@Modified
	public void modified(ComponentContext context, Map<String, Object> properties) {
		if (super.context == null)
			return;

		super.modified(context, properties);
	}

	@Override
	@Deactivate
	public void deactivate(ComponentContext context, int reason) {
		super.deactivate(context, reason);
	}

	@Reference
	void setComponentManager(ComponentManager componentManager) {
		this.componentManager = componentManager;
	}

	void unsetComponentManager(ComponentManager componentManager) {
		this.componentManager = null;
	}


	/*
	 * MaterialManager interface
	 */
	
	@Override
	public List<Material> getAllMaterials() {
		return impl.getAllMaterials();
	}

	@Override
	public Material getMaterial(String id) {
		return impl.getMaterial(id);
	}

	@Override
	public void deleteMaterial(String id) {
		impl.deleteMaterial(id);
	}

	@Override
	public List<MaterialGroup> getMaterialGroups() {
		return impl.getMaterialGroups();
	}

	@Override
	public String addMaterialGroup(MaterialGroup materialGroup) {
		return impl.addMaterialGroup(materialGroup);
	}

	@Override
	public MaterialGroup getMaterialGroup(String id) {
		return impl.getMaterialGroup(id);
	}

	@Override
	public void deleteMaterialGroup(String id) {
		impl.deleteMaterialGroup(id);		
	}

	@Override
	public String addMaterialToGroup(Material material, String materialGroupId) {
		return impl.addMaterialToGroup(material, materialGroupId);
	}

	@Override
	public String addMaterialGroupToGroup(MaterialGroup materialGroup, String materialGroupId) {
		return impl.addMaterialGroupToGroup(materialGroup, materialGroupId);
	}



}
