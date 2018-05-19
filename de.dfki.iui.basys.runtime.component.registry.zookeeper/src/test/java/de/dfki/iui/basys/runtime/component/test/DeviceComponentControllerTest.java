package de.dfki.iui.basys.runtime.component.test;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.net.URLClassLoader;

import org.junit.Test;

import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentInfo;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.runtime.component.device.DeviceComponentController;
import de.dfki.iui.basys.runtime.component.manager.ComponentManagerException;

public class DeviceComponentControllerTest extends BaseComponentTest {

	@Test
	public void testDeviceComponentController() {
		
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
		
		
		try {
			componentManager.createLocalComponent(config1);
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DeviceComponentController controller = new DeviceComponentController(config1.getComponentId());
		controller.connect(context);
		
		ComponentInfo info = context.getComponentRegistry().getComponentById(ComponentCategory.DEVICE_COMPONENT, config1.getComponentId());
		assertEquals(ControlMode.PRODUCTION, info.getCurrentMode());
		assertEquals(State.STOPPED, info.getCurrentState());		
		
		controller.reset();
		sleep(5);
		
		info = context.getComponentRegistry().getComponentById(ComponentCategory.DEVICE_COMPONENT, config1.getComponentId());
		assertEquals(ControlMode.PRODUCTION, info.getCurrentMode());
		assertEquals(State.IDLE, info.getCurrentState());
		
		controller.stop();		
		sleep(5);
		
		info = context.getComponentRegistry().getComponentById(ComponentCategory.DEVICE_COMPONENT, config1.getComponentId());
		assertEquals(ControlMode.PRODUCTION, info.getCurrentMode());
		assertEquals(State.STOPPED, info.getCurrentState());
		
		
	}

}
