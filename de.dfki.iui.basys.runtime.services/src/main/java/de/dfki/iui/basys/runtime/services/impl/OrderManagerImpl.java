package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl;
import de.dfki.iui.basys.model.domain.order.util.OrderResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.OrderManager;

public class OrderManagerImpl extends EmfServiceComponent implements OrderManager {

	public OrderManagerImpl(ComponentConfiguration config) {
		super(config);
		OrderPackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("order", new OrderResourceFactoryImpl());
	}

	@Override
	public Order getOrder(String id) {
		return getEntity(id);
	}

	@Override
	public List<Order> getOrdersByManufacturedComponent(String manufacturedComponentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
