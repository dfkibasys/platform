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

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.util.ResourceinstanceResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.resourcetype.ResourceTypeCatalogue;
import de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl;
import de.dfki.iui.basys.model.domain.resourcetype.util.ResourcetypeResourceFactoryImpl;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ResourceTypeManager;

public class ResourceTypeManagerImpl extends EmfServiceComponent implements ResourceTypeManager {

	public ResourceTypeManagerImpl(ComponentConfiguration config) {
		super(config);
		ResourcetypePackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("resourcetype", new ResourcetypeResourceFactoryImpl());
	
	}

	@Override
	public ResourceType getResourceType(String id) {
		return getEntity(id);
	}

	@Override
	public ResourceType getResourceTypeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceType> getResourceTypesByManufacturer(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceType> getResourceTypesByCapability(Capability capability) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceType> getAllResourceTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
