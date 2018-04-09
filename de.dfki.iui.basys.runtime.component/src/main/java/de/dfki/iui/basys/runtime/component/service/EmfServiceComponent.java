package de.dfki.iui.basys.runtime.component.service;

import java.io.IOException;

import org.bouncycastle.math.ec.ECCurve.Config;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.service.component.annotations.Activate;

import de.dfki.iui.basys.common.emf.EmfPersistence;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class EmfServiceComponent extends ServiceComponent {

	protected ResourceSet resourceSet;
	URI uri;
	
	public EmfServiceComponent(ComponentConfiguration config) {
		super(config);
	}
	
	@Override
	public void connectToExternal() throws ComponentException {
		resourceSet = new ResourceSetImpl();
		//TODO configure URIConverter URIMap
		
		String resourceUri = getConfig().getExternalConnectionString();
		uri = URI.createPlatformPluginURI(resourceUri, false);
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
	

	protected EObject getEntity(String id) {
		return resourceSet.getEObject(uri.appendFragment(id), true);
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
