package de.dfki.iui.basys.runtime.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.Response;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition;
import de.dfki.iui.basys.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl;
import de.dfki.iui.basys.model.domain.processdefinition.util.ProcessdefinitionResourceFactoryImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.util.ResourceinstanceResourceFactoryImpl;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProcessDefinitionManager;
import de.dfki.iui.basys.runtime.services.ResourceInstanceManager;

public class ProcessDefinitionManagerImpl extends EmfServiceComponent implements ProcessDefinitionManager {

	public ProcessDefinitionManagerImpl(ComponentConfiguration config) {
		super(config);
		ProcessdefinitionPackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("processdefinition", new ProcessdefinitionResourceFactoryImpl());
	}

	@Override
	public ProcessDefinition getProcessDefinition(String id) {
	return getEntity(id);
	}

	@Override
	public ProcessDefinition getProcessDefinitionByProductVariant(String productVariantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessDefinition> getAllProcessDefinitions() {
		// TODO Auto-generated method stub
		return null;
	}

	



}
