package de.dfki.cos.basys.platform.runtime.services.worldmodelManager;

import java.io.File;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.services.OrderManager;
import de.dfki.cos.basys.platform.runtime.services.ProductDefinitionManager;
import de.dfki.cos.basys.platform.runtime.services.ProductInstanceManager;
import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.order.OrderStatus;
import de.dfki.iui.basys.model.domain.order.OrderStatusEnum;
import de.dfki.iui.basys.model.domain.order.impl.OrderFactoryImpl;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstanceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;

public class WorldModelManagerTest extends BaseComponentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// not really needed
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// not really needed
	}

	private ComponentConfiguration productInstanceManagerConfig, resourceManagerInstanceConfig, mirComponentConfig,
			ur3ComponentConfig, worldModelManagerConfig, resourceTypeManagerConfig, orderManagerConfig;
	private ComponentConfiguration productDefinitionManagerConfig;

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();

		productInstanceManagerConfig = new ComponentConfigurationImpl.Builder().componentId("product-instance-manager")
				.componentName("product-instance-manager").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.impl.ProductInstanceManagerImpl")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.productinstance")
				.inChannelName("product-instance-manager#in").outChannelName("product-instance-manager#out").build();

		resourceManagerInstanceConfig = new ComponentConfigurationImpl.Builder()
				.componentId("resource-instance-manager").componentName("resource-instance-manager")
				.componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.resourceinstance")
				.inChannelName("resource-instance-manager#in").outChannelName("resource-instance-manager#out").build();

		mirComponentConfig = new ComponentConfigurationImpl.Builder().componentId("_rUJzsDJhEei1p5hKOf5Slw")
				.componentName("My MiR 100").componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass(
						"de.dfki.iui.basys.runtime.component.device.tecs.deprecated.SimulatedMirComponent")
				.inChannelName("_rUJzsDJhEei1p5hKOf5Slw#in").outChannelName("_rUJzsDJhEei1p5hKOf5Slw#out").build();

		ur3ComponentConfig = new ComponentConfigurationImpl.Builder().componentId("_jJdx4DD7EeiuBvcKgWzd3Q")
				.componentName("My UR3").componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.TestDeviceComponent")
				.inChannelName("_jJdx4DD7EeiuBvcKgWzd3Q#in").outChannelName("_jJdx4DD7EeiuBvcKgWzd3Q#out").build();

		worldModelManagerConfig = new ComponentConfigurationImpl.Builder().componentId("worldmodel-manager")
				.componentName("worldmodel-manager").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass(
						"de.dfki.iui.basys.runtime.services.worldmodelManager.impl.WorldModelManagerImpl")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.linebalancing")
				.inChannelName("worldmodel-manager#in").outChannelName("worldmodel-manager#out").build();

		resourceTypeManagerConfig = new ComponentConfigurationImpl.Builder().componentId("resource-type-manager")
				.componentName("resource-type-manager").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.impl.ResourceTypeManagerImpl")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.resourcetype")
				.inChannelName("resource-type-manager#in").outChannelName("resource-type-manager#out").build();

		orderManagerConfig = new ComponentConfigurationImpl.Builder().componentId("order-manager")
				.componentName("order-manager").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.impl.OrderManagerImpl")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.order")
				.outChannelName("order-manager#out").build();

		productDefinitionManagerConfig = new ComponentConfigurationImpl.Builder()
				.componentId("product-definition-manager").componentName("product-definition-manager")
				.componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.impl.ProductDefinitionManagerImpl")
				.externalConnectionString("file:/" + new File(".").getAbsolutePath()
						+ "/src/test/resources/model/model.productdefinition")
				.build();

		componentManager.createLocalComponent(productInstanceManagerConfig);
		componentManager.createLocalComponent(resourceTypeManagerConfig);
		componentManager.createLocalComponent(resourceManagerInstanceConfig);
		componentManager.createLocalComponent(mirComponentConfig);
		componentManager.createLocalComponent(ur3ComponentConfig);
		componentManager.createLocalComponent(worldModelManagerConfig);
		componentManager.createLocalComponent(orderManagerConfig);
		componentManager.createLocalComponent(productDefinitionManagerConfig);

	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	public class LinebalancingAnswer {

		@JsonProperty
		private String resourceInstanceId;

	}
	
	@Test
	@Ignore
	public void testAddOrder() throws ComponentException, InterruptedException, JsonProcessingException {
		LOGGER.info("testAddOrder - start");

		OrderManager om = (OrderManager) componentManager.getLocalComponentById("order-manager");
		ProductInstanceManager pim = (ProductInstanceManager) componentManager
				.getLocalComponentById("product-instance-manager");
		ProductDefinitionManager pdm = (ProductDefinitionManager) componentManager
				.getLocalComponentById("product-definition-manager");
		ProductInstance productInstance = ProductinstanceFactoryImpl.eINSTANCE.createProductInstance();
		productInstance.setManufacturedComponent(pdm.getProductVariant("_6odhQEjIEei9sPQ0bCp2Ew"));
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

		//FIXME: nächste Zeile rein, alles danach raus
		om.addOrder(order);

//		Client client = ClientBuilder.newClient();
//		/*LinebalancingAnswer lba = client.target("http://10.2.0.81:9001/services/optimizer/")
//				.request(MediaType.APPLICATION_JSON).accept("application/json")
//				.get(LinebalancingAnswer.class);
//
//		System.out.println("\n\n\n\n===============================");
//		System.out.println(lba.resourceInstanceId);
//		System.out.println("===============================\n\n\n\n");
//*/
//		CamundaTaskScheduler cts = (CamundaTaskScheduler) context.getComponentManager()
//				.getLocalComponentById("task-scheduler");
//		TopologyManager tm = (TopologyManager) context.getComponentManager()
//				.getLocalComponentById("topology-manager");
//
//		MoveToLocation moveRequest = CapabilityFactory.eINSTANCE.createMoveToLocation();
//		moveRequest.setTargetLocation(tm.getTopologyElement("_zzNG4V2TEeit97PGgoQOAQ"));
//
//		GeneralCapabilityVariant variant = ResourceinstanceFactory.eINSTANCE
//				.createGeneralCapabilityVariant();
//		variant.setCapability(moveRequest);
//
//		de.dfki.iui.basys.model.runtime.component.CapabilityRequest req = ComponentFactory.eINSTANCE
//				.createCapabilityRequest();
//		req.setCapabilityVariant(variant);
//		req.setComponentId("_rUJzsDJhEei1p5hKOf5Slw");
//
//		TaskDescription task = new TaskDescription(req);
	/*	if (lba.resourceInstanceId.equals("_jJdx4DD7EeiuBvcKgWzd3Q")) {
			cts.scheduleTask(task);
		} else {
			cts.scheduleTask(task, 10000); // TODO fine tuning
		}
	*/	
		while (true) {
			Thread.sleep(1000);
		}
		
		
	}

}
