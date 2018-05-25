package de.dfki.iui.basys.runtime.processcontrol;

import java.util.concurrent.ExecutionException;

import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentResponse;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.device.DeviceComponentController;

public class TaskExecutor2 {

	ComponentRequest request;
	DeviceComponentController device;	

	public TaskExecutor2(ComponentRequest request) {
		this.request = request;
		device = new DeviceComponentController(request.getComponentId());
	}
	
	public ComponentResponse execute(ComponentContext context) {
		ComponentResponse response = null;
		
		device.connect(context);
		
		try {
			response = device.executeComponentRequest(request).get();			
		} catch (InterruptedException | ExecutionException e) {		
			e.printStackTrace();
		}
		
		device.disconnect();
		return response;
	}
	
}
