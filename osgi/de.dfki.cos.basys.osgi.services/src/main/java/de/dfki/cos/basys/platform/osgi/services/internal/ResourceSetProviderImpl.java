package de.dfki.cos.basys.platform.osgi.services.internal;

import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.osgi.services.ResourceSetProvider;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE)
public class ResourceSetProviderImpl implements ResourceSetProvider {

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
	protected ComponentContext context;
	protected ResourceSet resourceSet;

	public ResourceSetProviderImpl() {
	}

	@Activate
	protected void activate(ComponentContext context, Map<String, Object> properties) {
		LOGGER.info("Creating ResourceSetProvider");
		modified(context, properties);

	}

	@Modified
	public synchronized void modified(ComponentContext context, Map<String, Object> properties) {
		this.context = context;

		if (resourceSet == null) {
			resourceSet = EmfServiceComponent.createResourceSet();
		}
		
		// TODO: get real network endpoint or even urispec for each individual service
		// from component registry
//		
//		String baseUrl = "http://localhost:8080/services/";
//		String modelFileName = "model";
//
//		if (properties.containsKey("modelFileName") && properties.containsKey("baseUrl")) {
//			modelFileName = (String) properties.get("modelFileName");
//			baseUrl = (String) properties.get("baseUrl");
//		}
//		
//		resourceSet.getURIConverter().getURIMap().clear();
//		
//		String[] modelNames = new String[] { "material", "order", "processdefinition", "processinstance",
//				"productdefinition", "productinstance", "resourceinstance", "resourcetype", "topology" };
//		
//		for (String model : Arrays.asList(modelNames)) {
//			resourceSet.getURIConverter().getURIMap().put(URI.createURI(modelFileName + "." + model),
//					URI.createURI(baseUrl + model));
//		}

	}

	@Deactivate
	protected void deactivate(ComponentContext context, int reason) {
		resourceSet = null;
	}

	@Override
	public ResourceSet getSharedResourceSet() {
		return resourceSet;
	}

}
