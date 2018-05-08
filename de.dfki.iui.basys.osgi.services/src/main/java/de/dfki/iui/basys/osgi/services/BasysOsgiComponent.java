package de.dfki.iui.basys.osgi.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;

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
			config = mapper.readValue(asText, ComponentConfigurationImpl.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return config;
	}

}
