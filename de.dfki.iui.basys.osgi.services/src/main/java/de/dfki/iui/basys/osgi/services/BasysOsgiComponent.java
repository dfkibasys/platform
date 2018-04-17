package de.dfki.iui.basys.osgi.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;

import de.dfki.iui.basys.common.emf.JsonUtils;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;

public class BasysOsgiComponent {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected ComponentContext context;
	protected ComponentConfiguration config;

	protected void activate(ComponentContext context, Map<String, Object> properties) {
		this.context = context;
		this.config = propsToComponentConfig(properties);
	}

	protected void modified(ComponentContext context, Map<String, Object> properties) {
		this.context = context;
	}

	protected void deactivate(ComponentContext context, int reason) {

	}

	protected ComponentConfiguration propsToComponentConfig(Map<String, Object> properties) {
		ComponentConfiguration config = null;
		try {

			// SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.serializeAllExcept("component", "component.id", "component.name", "service.pid", "service");
			// FilterProvider filterProvider = new SimpleFilterProvider().addFilter("component", filter);

			Map<String, Object> props = new HashMap<String, Object>(properties);
			props.remove("component.id");
			props.remove("component.name");
			props.remove("service.pid");

			JavaPropsMapper mapper = new JavaPropsMapper();
			String asText = mapper.writeValueAsString(props);
			config = mapper.readValue(asText, ComponentConfiguration.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return config;
	}

	protected Response responseBuilder(EObject obj) {
		if (obj != null) {
			try {
				return Response.ok(JsonUtils.toJsonString(obj)).build();
			} catch (IOException e) {
				e.printStackTrace();
				return Response.serverError().build();
			}
		} else {
			return Response.status(Status.NOT_FOUND).build();
		}
	}

	// public synchronized void modified(ComponentContext context, Map<String, Object> properties) {
	//
	// if (properties.containsKey("resourceUri")) {
	// String resourceUri = (String) context.getProperties().get("resourceUri");
	// uri = URI.createPlatformPluginURI(resourceUri, false);
	// Resource resource = resourceSet.createResource(uri);
	// try {
	// EmfPersistence.read(resource, null);
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// }

}
