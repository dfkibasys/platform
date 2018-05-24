package de.dfki.iui.basys.runtime.component.test;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.EmfPersistence;
import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;

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
		String payload = null;
		try {
			payload = JsonUtils.toString(cr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(payload);
	}

	@Test
	@Ignore
	public void testSerializeComponentRequests() {
		
		ResourceSet resourceSet = EmfServiceComponent.createResourceSet();

			
		
		
		//URI uri = URI.createPlatformPluginURI("/de.dfki.iui.basys.osgi.services.config/src/main/resources/model/requestcollection.component", true);
		
		
		URI uri = URI.createFileURI("C:\\Tools\\basys-develop\\ws\\osgi\\de.dfki.iui.basys.osgi.services.config\\src\\main\\resources\\model\\requestcollection.component");
		
		Resource resource = resourceSet.createResource(uri);
		try {
			EmfPersistence.read(resource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		EObject collection = resource.getContents().get(0);
		
		try {
			String json = JsonUtils.toString(collection);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
