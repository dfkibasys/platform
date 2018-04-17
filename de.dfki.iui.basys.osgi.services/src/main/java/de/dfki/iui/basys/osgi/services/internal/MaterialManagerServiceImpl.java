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
import de.dfki.iui.basys.osgi.services.BasysOsgiComponent;
import de.dfki.iui.basys.runtime.component.manager.ComponentManager;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;
import de.dfki.iui.basys.runtime.services.MaterialManager;
import de.dfki.iui.basys.runtime.services.impl.MaterialManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class MaterialManagerServiceImpl extends BasysOsgiComponent implements MaterialManager {

	ComponentManager componentManager;
	MaterialManagerImpl manager;

	public MaterialManagerServiceImpl() {
		LOGGER.info("MaterialManagerServiceImpl created");
	}

	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		manager = new MaterialManagerImpl(config);
		try {
			componentManager.addLocalComponent(manager);
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Modified
	public void modified(ComponentContext context, Map<String, Object> properties) {
		if (super.context == null)
			return;

		super.modified(context, properties);
	}

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

	@Override
	public Material getMaterial(String id) {
		Material result = manager.getMaterial(id);
		return result;
	}

	@Override
	public List<Material> getAllMaterials() {
		return manager.getAllMaterials();
	}

	@Override
	public void addMaterial(Material material) {
		manager.addMaterial(material);
	}

	// @Override
	// public Response getMaterials() {
	// return Response.ok("{\"all\": \"materials\"}").build();
	// }
	//
	// @Override
	// public Response getMaterial(String id) {
	//
	// return responseBuilder(getEntity(id));
	//
	// }
	//
	// @Override
	// public Response getAllMaterials() {
	// // TODO Auto-generated method stub
	// return null;
	// }

}
