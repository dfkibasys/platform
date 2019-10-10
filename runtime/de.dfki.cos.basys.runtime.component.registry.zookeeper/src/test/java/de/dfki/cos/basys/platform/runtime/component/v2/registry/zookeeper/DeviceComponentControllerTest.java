package de.dfki.cos.basys.platform.runtime.component.v2.registry.zookeeper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;
import de.dfki.cos.basys.platform.model.runtime.component.State;
import de.dfki.cos.basys.platform.runtime.component.device.DeviceComponentController;
import de.dfki.cos.basys.platform.runtime.component.device.TestDeviceComponent;
import de.dfki.cos.basys.platform.runtime.component.manager.ComponentManagerException;

public class DeviceComponentControllerTest extends BaseComponentTest {

	@Test
	public void testDeviceComponentController() {
		
		printClassPath();
		
		TestDeviceComponent comp = new TestDeviceComponent(config1);
				
		try {
			componentManager.addLocalComponent(comp);
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DeviceComponentController controller = new DeviceComponentController(config1.getComponentId());
		controller.connect(context);
		
		assertEquals(State.STOPPED, comp.getState(true));
		ComponentInfo info = context.getComponentRegistry().getComponentById(ComponentCategory.DEVICE_COMPONENT, config1.getComponentId());
		assertEquals(ControlMode.PRODUCTION, info.getCurrentMode());
		assertEquals(State.STOPPED, info.getCurrentState());		
		
		controller.reset();

		sleep(1);
		
		assertEquals(State.RESETTING, comp.getState(true));
		assertEquals(State.IDLE, comp.getState(true));		
		info = context.getComponentRegistry().getComponentById(ComponentCategory.DEVICE_COMPONENT, config1.getComponentId());
		assertEquals(ControlMode.PRODUCTION, info.getCurrentMode());
		assertEquals(State.IDLE, info.getCurrentState());
		
		controller.stop();
		
		sleep(1);
		
		assertEquals(State.STOPPING, comp.getState(true));
		assertEquals(State.STOPPED, comp.getState(true));		
		info = context.getComponentRegistry().getComponentById(ComponentCategory.DEVICE_COMPONENT, config1.getComponentId());
		assertEquals(ControlMode.PRODUCTION, info.getCurrentMode());
		assertEquals(State.STOPPED, info.getCurrentState());
		
		
	}

}
