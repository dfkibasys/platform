package de.dfki.iui.basys.runtime.services.worldmodelManager;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance;
import de.dfki.iui.basys.model.domain.linebalancing.WorldModel;
import de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.TestDeviceComponent;
import de.dfki.iui.basys.runtime.component.device.tecs.MirComponent;
import de.dfki.iui.basys.runtime.services.impl.ProductInstanceManagerImpl;
import de.dfki.iui.basys.runtime.services.impl.ResourceInstanceManagerImpl;
import de.dfki.iui.basys.runtime.services.impl.ResourceTypeManagerImpl;
import de.dfki.iui.basys.runtime.services.worldmodelManager.impl.WorldModelManagerImpl;

public class WorldModelManagerTest extends BaseComponentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// not really needed
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// not really needed
	}

	private ComponentConfiguration config1, config2, config3, config4, config5, config6;
	private WorldModelManagerImpl wmm;

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();

		config1 = new ComponentConfigurationImpl.Builder().componentId("product-instance-manager")
				.componentName("product-instance-manager").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.ProductInstanceManager")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.productinstance")
				.inChannelName("product-instance-manager#in").outChannelName("product-instance-manager#out").build();

		config2 = new ComponentConfigurationImpl.Builder().componentId("resource-instance-manager")
				.componentName("resource-instance-manager").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.RessourcetInstanceManager")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.resourceinstance")
				.inChannelName("resource-instance-manager#in").outChannelName("resource-instance-manager#out").build();

		config3 = new ComponentConfigurationImpl.Builder().componentId("_rUJzsDJhEei1p5hKOf5Slw")
				.componentName("My MiR 100").componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.tecs.MirComponent")
				.inChannelName("_rUJzsDJhEei1p5hKOf5Slw#in").outChannelName("_rUJzsDJhEei1p5hKOf5Slw#out").build();

		config4 = new ComponentConfigurationImpl.Builder().componentId("_jJdx4DD7EeiuBvcKgWzd3Q")
				.componentName("My UR3").componentCategory(ComponentCategory.DEVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.component.device.TestDeviceComponent")
				.inChannelName("_jJdx4DD7EeiuBvcKgWzd3Q#in").outChannelName("_jJdx4DD7EeiuBvcKgWzd3Q#out").build();

		config5 = new ComponentConfigurationImpl.Builder().componentId("worldmodel-manager")
				.componentName("worldmodel-manager").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass(
						"de.dfki.iui.basys.runtime.services.worldmodelManager.WorldModelManager")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.linebalancing")
				.inChannelName("worldmodel-manager#in").outChannelName("worldmodel-manager#out").build();

		config6 = new ComponentConfigurationImpl.Builder().componentId("resource-type-manager")
				.componentName("resource-type-manager").componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.services.ResourceTypeManager")
				.externalConnectionString(
						"file:/" + new File(".").getAbsolutePath() + "/src/test/resources/model/model.resourcetype")
				.inChannelName("resource-type-manager#in").outChannelName("resource-type-manager#out").build();

		ProductInstanceManagerImpl pim = new ProductInstanceManagerImpl(config1);
		ResourceTypeManagerImpl rtm = new ResourceTypeManagerImpl(config6);
		ResourceInstanceManagerImpl rim = new ResourceInstanceManagerImpl(config2);
		MirComponent mir = new MirComponent(config3);
		TestDeviceComponent ur3 = new TestDeviceComponent(config4);
		wmm = new WorldModelManagerImpl(config5);

		componentManager.addLocalComponent(pim);
		componentManager.addLocalComponent(rtm);
		componentManager.addLocalComponent(rim);
		componentManager.addLocalComponent(mir);
		// componentManager.addLocalComponent(ur3);
		componentManager.addLocalComponent(wmm);

	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testRegisterDeviceComponentsAndList() throws ComponentException, InterruptedException, JsonProcessingException {
		LOGGER.info("testRegisterServicesAndList - start");

	//	WMProductInstance wmpi = new LinebalancingFactoryImpl().createWMProductInstance();
	//	System.out.println(JsonUtils.toString(wmpi));
		
		
		
		WorldModel wm = wmm.getCurrentWorld();

		
			System.out.println("");
			System.out.println("");

			System.out.println("");
			System.out.println("");
			System.out.println(JsonUtils.toString(wm));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");

	

		LOGGER.info("testServiceLifecycle - complete");
	}

}
