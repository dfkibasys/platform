package de.dfki.iui.basys.runtime.component.test;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.iui.basys.common.emf.EmfPersistence;
import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.domain.material.Material;
import de.dfki.iui.basys.model.domain.productdefinition.MaterialEntry;
import de.dfki.iui.basys.model.domain.resourceinstance.ManufacturingCapabilityVariant;
import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl;
import de.dfki.iui.basys.model.util.BasysResourceImpl;
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
		
		
		//URI uri = URI.createFileURI("C:\\Projekte\\BaSys\\Dev\\basys-develop\\ws\\osgi\\de.dfki.iui.basys.osgi.services.config\\src\\main\\resources\\model\\requestcollection.component");
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
	
	@Test
	public void testSerializeDeserializeComponentRequests() {
		
		ResourceSet resourceSet = EmfServiceComponent.createResourceSet();

			
		
		
		//URI uri = URI.createPlatformPluginURI("/de.dfki.iui.basys.osgi.services.config/src/main/resources/model/requestcollection.component", true);
		
		
		//URI uri = URI.createFileURI("C:\\Projekte\\BaSys\\Dev\\basys-develop\\ws\\osgi\\de.dfki.iui.basys.osgi.services.config\\src\\main\\resources\\model\\requestcollection.component");
		URI uri = URI.createFileURI("C:\\Tools\\basys-develop\\ws\\osgi\\de.dfki.iui.basys.osgi.services.config\\src\\main\\resources\\model\\requestcollection.component");
			
		Resource resource = resourceSet.createResource(uri);
		try {
			EmfPersistence.read(resource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		EObject collection = resource.getContents().get(0);
		
		
		String json = "";
		try {
			json = JsonUtils.toString(collection);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Resource resource2 = JsonUtils.fromString(json);
			EObject collection2 = resource2.getContents().get(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void testDeserialization() {
		String json = "{\n" + 
				"	\"eClass\": \"http://www.dfki.de/iui/basys/model/resourceinstance#//ManufacturingCapabilityVariant\",\n" + 
				"	\"capability\": {\n" + 
				"		\"eClass\": \"http://www.dfki.de/iui/basys/model/capability#//PickAndPlace\",\n" + 
				"		\"id\": \"_xio67l8yEeiUo-65_7rTBS\",\n" + 
				"		\"loadCarrierUnit\": \"MATERIAL\"\n" + 
				"	},\n" + 
				"	\"appliedOn\": [{\n" + 
				"		\"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\n" + 
				"		\"$ref\": \"http://localhost:8080/services/entity/_IpqbzV29EeixDOGCyjgf_g\"\n" + 
				"	},\n" + 
				"	{\n" + 
				"		\"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//AssemblyGroupEntry\",\n" + 
				"		\"$ref\": \"http://localhost:8080/services/entity/_IpqbzF29EeixDOGCyjgf_g\"\n" + 
				"	}]\n" + 
				"}";
		
		
		String json2 = "{\r\n" + 
				"	\"eClass\": \"http://www.dfki.de/iui/basys/model/resourceinstance#//ManufacturingCapabilityVariant\",\r\n" + 
				"	\"id\": \"_gTP6cF-lEeixtLE-b5nbbQ\",\r\n" + 
				"	\"name\": \"Apply light blue cap\",\r\n" + 
				"	\"capability\": {\r\n" + 
				"		\"eClass\": \"http://www.dfki.de/iui/basys/model/capability#//PickAndPlace\",\r\n" + 
				"		\"id\": \"_xio67l8yEeiUo-65_7rTBS\",\r\n" + 
				"		\"loadCarrierUnit\": \"MATERIAL\"\r\n" + 
				"	},\r\n" + 
				"	\"appliedOn\": [{\r\n" + 
				"		\"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\r\n" + 
				"		\"$ref\": \"platform:/plugin/de.dfki.iui.basys.osgi.services.config/model/model.productdefinition#_IpqbzV29EeixDOGCyjgf_g\"\r\n" + 
				"	},\r\n" + 
				"	{\r\n" + 
				"		\"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//AssemblyGroupEntry\",\r\n" + 
				"		\"$ref\": \"platform:/plugin/de.dfki.iui.basys.osgi.services.config/model/model.productdefinition#_IpqbzF29EeixDOGCyjgf_g\"\r\n" + 
				"	}]\r\n" + 
				"}";
		
		String json3 = "{\r\n" + 
				"    \"eClass\": \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\r\n" + 
				"    \"id\": \"_IpqbzV29EeixDOGCyjgf_g\",\r\n" + 
				"    \"material\": {\r\n" + 
				"        \"eClass\": \"http://www.dfki.de/iui/basys/model/material#//Material\",\r\n" + 
				"        \"$ref\": \"platform:/plugin/de.dfki.iui.basys.osgi.services.config/model/model.material#_b9ZKABMxEeiF0dM20lRpcg\"\r\n" + 
				"    }\r\n" + 
				"}";
		
		// TODO this JSON fails during parsing (sk, 30.05.2018)
		String json4 = "{\n" + 
				"    \"eClass\" : \"http://www.dfki.de/iui/basys/model/component#//CapabilityRequest\",\n" + 
				"    \"capabilityVariant\" : {\n" + 
				"      \"eClass\" : \"http://www.dfki.de/iui/basys/model/resourceinstance#//ManufacturingCapabilityVariant\",\n" + 
				"      \"id\" : \"_gTSWsV-lEeixtLE-b5nbbQ\",\n" + 
				"      \"name\" : \"Apply dark blue cap\",\n" + 
				"      \"capability\" : {\n" + 
				"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/capability#//PickAndPlace\",\n" + 
				"        \"id\" : \"_xio67l8yEeiUo-65_7rTBQ\",\n" + 
				"        \"loadCarrierUnit\" : \"MATERIAL\"\n" + 
				"      },\n" + 
				"      \"appliedOn\" : [ {\n" + 
				"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\n" + 
				"        \"id\" : \"_IpqbzV29EeixDOGCyjgf_g\",\n" + 
				"        \"material\" : {\n" + 
				"          \"eClass\" : \"http://www.dfki.de/iui/basys/model/material#//Material\",\n" + 
				"          \"id\" : \"_Ecka12QAEei-E8pQkAQC4Q\"\n" + 
				"        }\n" + 
				"      }, {\n" + 
				"        \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//AssemblyGroupEntry\",\n" + 
				"        \"id\" : \"_IpqbzF29EeixDOGCyjgf_g\",\n" + 
				"        \"assemblyGroup\" : {\n" + 
				"          \"id\" : \"_lGGrsUjLEei9sPQ0bCp2Ew\",\n" + 
				"          \"name\" : \"HousingWithAbsorber\",\n" + 
				"          \"bom\" : {\n" + 
				"            \"id\" : \"_oPgFkEjLEei9sPQ0bCp2Ew\",\n" + 
				"            \"entries\" : [ {\n" + 
				"              \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//AssemblyGroupEntry\",\n" + 
				"              \"id\" : \"_IpqbxV29EeixDOGCyjgf_g\",\n" + 
				"              \"assemblyGroup\" : {\n" + 
				"                \"id\" : \"_tZoTAUjJEei9sPQ0bCp2Ew\",\n" + 
				"                \"name\" : \"Housing\",\n" + 
				"                \"bom\" : {\n" + 
				"                  \"id\" : \"_ImdecEjPEeiKNvOOp20QBg\",\n" + 
				"                  \"entries\" : [ {\n" + 
				"                    \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\n" + 
				"                    \"id\" : \"_IpomkF29EeixDOGCyjgf_g\",\n" + 
				"                    \"material\" : {\n" + 
				"                      \"eClass\" : \"http://www.dfki.de/iui/basys/model/material#//Material\",\n" + 
				"                      \"id\" : \"_Ecka42QAEei-E8pQkAQC4Q\"\n" + 
				"                    }\n" + 
				"                  }, {\n" + 
				"                    \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\n" + 
				"                    \"id\" : \"_IpqbwV29EeixDOGCyjgf_g\",\n" + 
				"                    \"material\" : {\n" + 
				"                      \"eClass\" : \"http://www.dfki.de/iui/basys/model/material#//Material\",\n" + 
				"                      \"id\" : \"_Ecka5WQAEei-E8pQkAQC4Q\"\n" + 
				"                    }\n" + 
				"                  } ]\n" + 
				"                }\n" + 
				"              }\n" + 
				"            }, {\n" + 
				"              \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\n" + 
				"              \"id\" : \"_Ipqbxl29EeixDOGCyjgf_g\",\n" + 
				"              \"material\" : {\n" + 
				"                \"eClass\" : \"http://www.dfki.de/iui/basys/model/material#//Material\",\n" + 
				"                \"id\" : \"_Ecka6mQAEei-E8pQkAQC4Q\"\n" + 
				"              }\n" + 
				"            }, {\n" + 
				"              \"eClass\" : \"http://www.dfki.de/iui/basys/model/productdefinition#//MaterialEntry\",\n" + 
				"              \"id\" : \"_IpqbyF29EeixDOGCyjgf_g\",\n" + 
				"              \"count\" : 4,\n" + 
				"              \"material\" : {\n" + 
				"                \"eClass\" : \"http://www.dfki.de/iui/basys/model/material#//Material\",\n" + 
				"                \"id\" : \"_Ecka7GQAEei-E8pQkAQC4Q\"\n" + 
				"              }\n" + 
				"            } ]\n" + 
				"          }\n" + 
				"        }\n" + 
				"      } ]\n" + 
				"    }\n" + 
				"  }";
		
		try {

			ResourceSet rs = EmfServiceComponent.createResourceSet();
			BasysResourceImpl r = new BasysResourceImpl(URI.createURI("http://localhost:8080/services/entity"));
			
			r.basicSetResourceSet(rs, null);
			
			//MaterialEntry mat = JsonUtils.fromStringResource(json3, MaterialEntry.class, rs);

			ManufacturingCapabilityVariant var = JsonUtils.fromString(json, ManufacturingCapabilityVariant.class);
			EcoreUtil.resolveAll(var);
			MaterialEntry entry =(MaterialEntry) var.getAppliedOn().get(0);
			int count = entry.getCount();
			Material mat = entry.getMaterial();
			var = JsonUtils.fromString(json2, ManufacturingCapabilityVariant.class);
			System.out.println(var);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
}
