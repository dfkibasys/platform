package de.dfki.cos.basys.platform.osgi.services.internal;

import java.util.Map;

import javax.ws.rs.core.Response;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.cos.basys.platform.osgi.services.BasysOsgiComponent;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManager;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.runtime.services.WorkerGuidanceManager;
import de.dfki.cos.basys.platform.runtime.services.impl.WorkerGuidanceManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class WorkerGuidanceManagerServiceImpl extends BasysOsgiComponent implements WorkerGuidanceManager {

	ComponentManager componentManager;
	WorkerGuidanceManagerImpl impl;

	public WorkerGuidanceManagerServiceImpl() {
		LOGGER.info("EntityManagerServiceImpl created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new WorkerGuidanceManagerImpl(config);
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

	@Override
	public Response presentWorkerGuidance(String id, int order, int serial, int matNr, int errorCode) {
		return impl.presentWorkerGuidance(id, order, serial, matNr, errorCode);
	}

	

	/*
	 * WorkerGuidanceManager interface
	 */
	


}
