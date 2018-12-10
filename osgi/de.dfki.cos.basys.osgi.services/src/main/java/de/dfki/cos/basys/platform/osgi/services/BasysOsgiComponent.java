package de.dfki.cos.basys.platform.osgi.services;

import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
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

		//Map<String, Object> props = new HashMap<String, Object>(properties);
		//props.remove("component.id");
		//props.remove("component.name");
		//props.remove("service.pid");
		
		ComponentConfiguration config = new ComponentConfigurationImpl.Builder()
			.componentId((String)properties.get("componentId"))
			.componentName((String)properties.get("componentName"))
			.componentCategory(ComponentCategory.get((String)properties.get("componentCategory")))
			.componentImplementationJavaClass((String)properties.get("componentImplementationJavaClass"))
			.communicationProviderImplementationJavaClass((String)properties.get("communicationProviderImplementationJavaClass"))
			.communicationProviderConnectionString((String)properties.get("communicationProviderConnectionString"))
			.inChannelName((String)properties.get("inChannelName"))
			.outChannelName((String)properties.get("outChannelName"))
			.externalConnectionString(StrSubstitutor.replaceSystemProperties((properties.get("externalConnectionString"))))
			.build();

		return config;
	}

}
