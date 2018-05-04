package de.dfki.iui.basys.runtime.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.util.ResourceinstanceResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ResourceInstanceManager;

public class ResourceInstanceManagerImpl extends EmfServiceComponent implements ResourceInstanceManager {

	public ResourceInstanceManagerImpl(ComponentConfiguration config) {
		super(config);
		ResourceinstancePackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("resourceinstance", new ResourceinstanceResourceFactoryImpl());
	}

	@Override
	public List<ResourceInstance> getAllResourceInstances() {
		List<ResourceInstance> result = new ArrayList<ResourceInstance>();
		for (TreeIterator<Notifier> iter = resourceSet.getAllContents(); iter.hasNext();) {
			EObject eObject = (EObject) iter.next();
			if (ResourceinstancePackage.eINSTANCE.getResourceInstance().isSuperTypeOf(eObject.eClass())) {
				result.add((ResourceInstance) eObject);
			}
		}
		return result;
	}

	@Override
	public ResourceInstance getResourceInstance(String id) {
		return getEntity(id);
	}

	@Override
	public ResourceInstance getResourceInstanceByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceInstance> getResourceInstancesByType(String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceInstance> getResourceInstancesByTypeName(String typeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceInstance> getResourceInstancesByCapability(Capability capability) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addResourceInstance(ResourceInstance resourceInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeResourceInstance(String id) {
		// TODO Auto-generated method stub

	}

}
