package de.dfki.iui.basys.runtime.component.device.tecs;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.tecs.Event;
import de.dfki.tecs.ps.PSClient;

public class Test {
	
	public static void main(String[] args) {
		ComponentConfiguration componentConfig;
		ComponentContext emptyContext = new ComponentContext.Builder().build();
		
		componentConfig = new ComponentConfigurationImpl.Builder().componentId("mir-component")
				.externalConnectionString(String.format("tecs.tcp://%s:%s", "10.2.0.40", 9031)).build();
		
		MirComponent component = new MirComponent(componentConfig);
		
		try {
			System.out.println("A");
			component.activate(emptyContext);
			System.out.println("B");
		} catch (ComponentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("C");
		component.onResetting();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		component.onStarting();
		
		while(true) {}
		
	}

}
