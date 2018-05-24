package de.dfki.iui.basys.model.test;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import org.emfjson.jackson.module.EMFModule;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl;

public class JsonSerializationTest {

	@Test
	@Ignore
	public void testJson() {
		
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
		
		
		ComponentRequest cr = new ChangeModeRequestImpl.Builder().componentId("someId").mode(ControlMode.CHANGE_OVER).build();
		String payload;
		try {
			ObjectMapper mapper = EMFModule.setupDefaultMapper();
//			ObjectMapper mapper = new ObjectMapper();
//			EMFModule module = new EMFModule();
//			// ...
//			// configure the module and the mapper here...
//			mapper.registerModule(module);
			String result = mapper.writeValueAsString(cr);
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
