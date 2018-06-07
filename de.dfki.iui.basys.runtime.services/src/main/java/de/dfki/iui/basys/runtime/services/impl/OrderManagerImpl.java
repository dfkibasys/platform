package de.dfki.iui.basys.runtime.services.impl;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.order.OrderPackage;
import de.dfki.iui.basys.model.domain.order.OrderStatus;
import de.dfki.iui.basys.model.domain.order.OrderStatusEnum;
import de.dfki.iui.basys.model.domain.order.OrderStore;
import de.dfki.iui.basys.model.domain.order.impl.OrderFactoryImpl;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstanceFactoryImpl;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.OrderManager;
import de.dfki.iui.basys.runtime.services.ProductDefinitionManager;
import de.dfki.iui.basys.runtime.services.ProductInstanceManager;

public class OrderManagerImpl extends EmfServiceComponent implements OrderManager {

	public OrderManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		super.activate(context);

		ExecutorService executor = Executors.newCachedThreadPool();

		CommFactory.getInstance().openChannel(context.getSharedChannelPool(), "basys-connector#out", false,
				new ChannelListener() {

					@Override
					public Response handleRequest(Channel channel, Request req) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public void handleNotification(Channel channel, Notification not) {
						// TODO Auto-generated method stub
					}

					@Override
					public void handleMessage(Channel channel, String msg) {

						if (msg.equals("NEW_ORDER")) {

							CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();

							executor.submit(() -> {

								ProductDefinitionManager pdm = (ProductDefinitionManager) context.getComponentManager()
										.getLocalComponentById("product-definition-manager");

								ProductInstanceManager pim = (ProductInstanceManager) context.getComponentManager()
										.getLocalComponentById("product-instance-manager");
								ProductInstance productInstance = ProductinstanceFactoryImpl.eINSTANCE
										.createProductInstance();
								productInstance
										.setManufacturedComponent(pdm.getProductVariant("_6odhQEjIEei9sPQ0bCp2Ew"));
								Order order = OrderFactoryImpl.eINSTANCE.createOrder();
								order.setManufacturedComponent(pdm.getProductVariant("_6odhQEjIEei9sPQ0bCp2Ew"));
								order.setCustomer("CEBIT");
								order.setDueDate(new Date(System.currentTimeMillis() + 1000 * 60 * 60));
								order.setPriority(1);
								String orderId = "Order" + System.currentTimeMillis();
								order.setId(orderId);
								order.setQuantity(1);
								order.setStartDate(new Date(System.currentTimeMillis()));

								OrderStatus orderStatus = OrderFactoryImpl.eINSTANCE.createOrderStatus();
								orderStatus.setOrderId(orderId);
								orderStatus.setPieceCount(0);
								orderStatus.setStatus(OrderStatusEnum.STARTED);
								order.setStatus(orderStatus);

								productInstance.setOrder(order);
								productInstance.setSerialNumber("ID" + System.currentTimeMillis());
								pim.addProductInstance(productInstance);

								addOrder(order);

								cf.complete(true);
							});
						}
					}

				});

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
			
			Order copiedOrder = EcoreUtil.copy(order);
			//Order copiedOrder = EmfUtils.clone(order);
			String payload = JsonUtils.toString(copiedOrder);
			System.out.println(payload);
			//Order deserializedOrder = JsonUtils.fromString(payload, Order.class);
			
			Notification not = CommFactory.getInstance().createNotification(payload);
			outChannel.sendNotification(not);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
