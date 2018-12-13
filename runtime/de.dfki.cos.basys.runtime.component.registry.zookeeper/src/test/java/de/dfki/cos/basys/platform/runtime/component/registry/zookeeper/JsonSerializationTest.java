package de.dfki.cos.basys.platform.runtime.component.registry.zookeeper;

import java.net.URL;
import java.net.URLClassLoader;

import org.junit.Test;

import de.dfki.cos.basys.common.emf.json.JsonUtils;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;
import de.dfki.cos.basys.platform.model.runtime.component.impl.ChangeModeRequestImpl;

public class JsonSerializationTest {

	@Test
	public void testJson() {
		
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
		
		ComponentRequest cr = new ChangeModeRequestImpl.Builder().componentId("someId").mode(ControlMode.CHANGE_OVER).build();
		String payload = null;
		try {
			payload = JsonUtils.toString(cr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(payload);
	}

	
}
