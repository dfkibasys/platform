package de.dfki.cos.basys.platform.osgi.services.v2.internal;

import java.util.Map;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.cos.basys.common.component.manager.ComponentManager;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstance;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstanceStore;
import de.dfki.cos.basys.platform.osgi.services.v2.OsgiComponentWrapper;
import de.dfki.cos.basys.platform.runtime.services.ProcessInstanceManager;
import de.dfki.cos.basys.platform.runtime.services.v2.impl.ProcessInstanceManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class ProcessInstanceManagerServiceImpl extends OsgiComponentWrapper implements ProcessInstanceManager {

	ComponentManager componentManager;
	ProcessInstanceManagerImpl impl;

	public ProcessInstanceManagerServiceImpl() {
		LOGGER.info(getClass().getSimpleName() + " created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new ProcessInstanceManagerImpl(config);
		try {
			componentManager.addComponent(impl);
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
	 * Service interface
	 */

	@Override
	public ProcessInstanceStore getProcessInstanceStore() {
		return impl.getProcessInstanceStore();
	}

	@Override
	public ProcessInstance getProcessInstance(String id) {
		return impl.getProcessInstance(id);
	}

	@Override
	public ProcessInstance getProcessInstanceByProductInstance(String productInstanceId) {
		return impl.getProcessInstanceByProductInstance(productInstanceId);
	}
	
}
