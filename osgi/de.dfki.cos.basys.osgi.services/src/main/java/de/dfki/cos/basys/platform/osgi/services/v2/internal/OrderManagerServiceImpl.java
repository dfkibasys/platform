package de.dfki.cos.basys.platform.osgi.services.v2.internal;

import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.cos.basys.common.component.manager.ComponentManager;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.model.domain.linebalancing.LineBalancingAssignment;
import de.dfki.cos.basys.platform.model.domain.order.Order;
import de.dfki.cos.basys.platform.model.domain.order.OrderStore;
import de.dfki.cos.basys.platform.osgi.services.v2.OsgiComponentWrapper;
import de.dfki.cos.basys.platform.runtime.services.OrderManager;
import de.dfki.cos.basys.platform.runtime.services.v2.impl.OrderManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class OrderManagerServiceImpl extends OsgiComponentWrapper implements OrderManager {

	ComponentManager componentManager;
	OrderManagerImpl impl;

	public OrderManagerServiceImpl() {
		LOGGER.info(getClass().getSimpleName() + " created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new OrderManagerImpl(config);
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
	public OrderStore getOrderStore() {
		return impl.getOrderStore();
	}
	
	@Override
	public Order getOrder(String id) {
		return impl.getOrder(id);
	}

	@Override
	public void addOrder(Order order) {
		impl.addOrder(order);		
	}

	@Override
	public LineBalancingAssignment getOrderAssignment(String id) {
		return impl.getOrderAssignment(id);
	}



}
