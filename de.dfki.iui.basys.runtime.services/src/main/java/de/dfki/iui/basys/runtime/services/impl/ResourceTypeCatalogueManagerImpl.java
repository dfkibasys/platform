package de.dfki.iui.basys.runtime.services.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.ws.rs.core.Response;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ResourceTypeCatalogueManager;

public class ResourceTypeCatalogueManagerImpl extends EmfServiceComponent implements ResourceTypeCatalogueManager {

	public ResourceTypeCatalogueManagerImpl(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ResourceTypeCatalogue> getAllResourceTypeCatalogues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceTypeCatalogue getTypeCatalogue(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceType> getAllResourceTypes(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceType getResourceType(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getAllResourceTypeCataloguesRest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getTypeCatalogueRest(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getAllResourceTypesRest(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getResourceTypeRest(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
