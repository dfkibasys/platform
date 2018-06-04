package de.dfki.iui.basys.runtime.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.order.OrderPackage;
import de.dfki.iui.basys.model.domain.order.OrderStore;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.OrderManager;

public class OrderManagerImpl extends EmfServiceComponent implements OrderManager {

	public OrderManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public OrderStore getOrderStore() {
		OrderStore store = getFirstEntity(OrderPackage.eINSTANCE.getOrderStore());
		return store;
	}

	@Override
	public Order getOrder(String id) {
		return getEntity(id);
	}

	@Override
	public void addOrder(Order order) {
		OrderStore store = getOrderStore();
		store.getOrders().add(order);

		try {
			String payload = JsonUtils.toString(order);
			Notification not = CommFactory.getInstance().createNotification(payload);
			outChannel.sendNotification(not);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
