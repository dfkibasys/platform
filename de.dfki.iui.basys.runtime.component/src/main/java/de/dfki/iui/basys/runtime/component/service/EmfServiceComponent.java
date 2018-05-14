package de.dfki.iui.basys.runtime.component.service;

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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dfki.iui.basys.common.emf.EmfPersistence;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class EmfServiceComponent extends ServiceComponent {

	protected ResourceSet resourceSet;
	URI uri;

	public EmfServiceComponent(ComponentConfiguration config) {
		super(config);
		resourceSet = new ResourceSetImpl();
		
		//TODO: get real network endpoint or even urispec for each individual service from component registry
		String BASE_URL = "http://localhost:8080/services/";
		String fileName = "model";
				
		String [] modelNames = new String [] {"material", "order", "processdefinition", "processinstance", "productdefinition", "productinstance", "resourceinstance", "resourcetype", "topology" };
		for (String model : Arrays.asList(modelNames)) {
			resourceSet.getURIConverter().getURIMap().put(URI.createURI(fileName + "." + model), URI.createURI(BASE_URL + model));			
		}
		
	}

	@Override
	public void connectToExternal() throws ComponentException {
		String resourceUri = getConfig().getExternalConnectionString();
		uri = URI.createURI(resourceUri);
		Resource resource = resourceSet.createResource(uri);
		try {
			EmfPersistence.read(resource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void disconnectFromExternal() {
		resourceSet = null;
	}

	protected <T extends EObject> T getEntity(String id) {
		return (T) resourceSet.getEObject(uri.appendFragment(id), true);
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
