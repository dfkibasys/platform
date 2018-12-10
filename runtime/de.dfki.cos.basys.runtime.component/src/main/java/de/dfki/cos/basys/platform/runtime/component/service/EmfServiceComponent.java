package de.dfki.cos.basys.platform.runtime.component.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.dfki.cos.basys.common.emf.EmfPersistence;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.util.BasysResourceSetImpl;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.util.CapabilityResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.iui.basys.model.domain.linebalancing.util.LinebalancingResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.material.MaterialPackage;
import de.dfki.iui.basys.model.domain.material.util.MaterialResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.order.OrderPackage;
import de.dfki.iui.basys.model.domain.order.util.OrderResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.iui.basys.model.domain.processdefinition.util.ProcessdefinitionResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.iui.basys.model.domain.processinstance.util.ProcessinstanceResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.iui.basys.model.domain.productdefinition.util.ProductdefinitionResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage;
import de.dfki.iui.basys.model.domain.productinstance.util.ProductinstanceResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.resourceinstance.util.ResourceinstanceResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.iui.basys.model.domain.resourcetype.util.ResourcetypeResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.topology.TopologyPackage;
import de.dfki.iui.basys.model.domain.topology.util.TopologyResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentPackage;

public abstract class EmfServiceComponent extends ServiceComponent {

	protected ResourceSet resourceSet;
	URI uri;

	public EmfServiceComponent(ComponentConfiguration config) {
		super(config);
	}

	public void setSharedResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	@Override
	public void connectToExternal() throws ComponentException {
		if (resourceSet == null) {
			LOGGER.info("no shared resource set, creating an internal one.");
			resourceSet = createResourceSet();
			
//			//TODO: get real network endpoint or even urispec for each individual service from component registry
//			String BASE_URL = "http://localhost:8080/services/";
//			String fileName = "model";
//					
//			String [] modelNames = new String [] {"material", "order", "processdefinition", "processinstance", "productdefinition", "productinstance", "resourceinstance", "resourcetype", "topology" };
//			for (String model : Arrays.asList(modelNames)) {
//				resourceSet.getURIConverter().getURIMap().put(URI.createURI(fileName + "." + model), URI.createURI(BASE_URL + model));			
//			}
		}		
		
		String resourceUri = getConfig().getExternalConnectionString();
				
		uri = URI.createFileURI(resourceUri);
		LOGGER.debug("loading resource " + uri);
		Resource resource = resourceSet.createResource(uri);
		try {
			EmfPersistence.read(resource, null);
		} catch (IOException e) {
			LOGGER.error("cannot load resource " + resourceUri, e);
			//e.printStackTrace();
		}
		LOGGER.debug("connectToExternal - finished");
	}

	@Override
	public void disconnectFromExternal() {
		resourceSet = null;
	}

	public static ResourceSet createResourceSet() {
		ResourceSet	resourceSet = new BasysResourceSetImpl();
			
		resourceSet.getPackageRegistry().put(CapabilityPackage.eNS_URI,CapabilityPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("capability", new CapabilityResourceFactoryImpl());	
			
		resourceSet.getPackageRegistry().put(MaterialPackage.eNS_URI,MaterialPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("material", new MaterialResourceFactoryImpl());	
		
		resourceSet.getPackageRegistry().put(OrderPackage.eNS_URI,OrderPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("order", new OrderResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ProcessdefinitionPackage.eNS_URI,ProcessdefinitionPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("processdefinition", new ProcessdefinitionResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ProcessinstancePackage.eNS_URI,ProcessinstancePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("processinstance", new ProcessinstanceResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ProductdefinitionPackage.eNS_URI,ProductdefinitionPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("productdefinition", new ProductdefinitionResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ProductinstancePackage.eNS_URI,ProductinstancePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("productinstance", new ProductinstanceResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ResourceinstancePackage.eNS_URI,ResourceinstancePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("resourceinstance", new ResourceinstanceResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ResourcetypePackage.eNS_URI,ResourcetypePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("resourcetype",	new ResourcetypeResourceFactoryImpl());

		resourceSet.getPackageRegistry().put(TopologyPackage.eNS_URI,TopologyPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("topology", new TopologyResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(LinebalancingPackage.eNS_URI,LinebalancingPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("linebalancing", new LinebalancingResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ComponentPackage.eNS_URI,ComponentPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("component", new XMIResourceFactoryImpl());
		
		//TODO: get real network endpoint or even urispec for each individual service from component registry
		String BASE_URL = "http://localhost:8080/services/";
		String fileName = "model";
				
		String [] fileExtensions = new String [] {"material", "order", "processdefinition", "processinstance", "productdefinition", "productinstance", "resourceinstance", "resourcetype", "topology" };
		for (String fileExtension : Arrays.asList(fileExtensions)) {
			resourceSet.getURIConverter().getURIMap().put(URI.createURI(fileName + "." + fileExtension), URI.createURI(BASE_URL + "entity"));			
		}
		
		return resourceSet;		
	}
	
	protected <T extends EObject> T getEntity(String id) {
		if (uri != null) {
			return (T) resourceSet.getEObject(uri.appendFragment(id), true);
		} else {
			for (Resource r : resourceSet.getResources()) {
				T entity = (T) r.getEObject(id);
				if (entity != null) {
					return entity;
				}
			}
		}
		return null;
	}

	protected void deleteEntity(String id) {
		EObject entity = getEntity(id);
		EcoreUtil.delete(entity, true);
	}

	protected <T extends EObject> List<T> getAllEntities(EClass type, boolean pruneSearchOnMatch) {
		List<T> result = new LinkedList<T>();
		TreeIterator<EObject> it = resourceSet.getResource(uri, true).getAllContents();
		while (it.hasNext()) {
			EObject e = it.next();
			if (e.eClass() == type) {				
				//EcoreUtil.resolveAll(e);
				//result.add((T) EcoreUtil.resolveAll(e));
				result.add((T) e);
				if (pruneSearchOnMatch)
					it.prune(); // tiefer im Baum werden je nach Metamodell keine weiteren Entitäten gleichen Typs auftauchen.
			}
		}
		return new ArrayList<T>(result);
	}

	protected <T extends EObject> T getFirstEntity(EClass type) {
		TreeIterator<EObject> it = resourceSet.getResource(uri, true).getAllContents();
		while (it.hasNext()) {
			EObject e = it.next();
			if (e.eClass() == type) {
				return (T) e;
			}
		}
		return null;
	}

	protected EObject findEntity(String property, String value) {
		TreeIterator<EObject> it = resourceSet.getEObject(uri, true).eAllContents();
		while (it.hasNext()) {
			EObject e = it.next();
			if (e.eGet(e.eClass().getEStructuralFeature(property), true).equals(value)) {
				return e;
			}
		}
		return null;
	}

}
