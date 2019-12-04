package de.dfki.cos.basys.platform.osgi.services;

import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.text.StrSubstitutor;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OsgiComponentWrapper {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	protected ComponentContext context;
	protected Properties config;

	protected void activate(ComponentContext context, Map<String, Object> properties) {
		this.context = context;
		this.config = propsToComponentConfig(properties);
	}

	protected void modified(ComponentContext context, Map<String, Object> properties) {
		this.context = context;
	}

	protected void deactivate(ComponentContext context, int reason) {

	}

	protected Properties propsToComponentConfig(Map<String, Object> properties) {
		Properties config = new Properties();
		for (String key : properties.keySet()) {
			config.setProperty(key, properties.get(key).toString());
		};
		return config;
	}

}
