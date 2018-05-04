package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.processinstance.ProcessInstance;
import de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl;
import de.dfki.iui.basys.model.domain.processinstance.util.ProcessinstanceResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProcessInstanceManager;

public class ProcessInstanceManagerImpl extends EmfServiceComponent implements ProcessInstanceManager {

	public ProcessInstanceManagerImpl(ComponentConfiguration config) {
		super(config);
		ProcessinstancePackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("processinstance", new ProcessinstanceResourceFactoryImpl());
	}

	@Override
	public ProcessInstance getProcessInstance(String id) {
		return getEntity(id);
	}

	@Override
	public ProcessInstance getProcessInstanceByProductInstance(String productInstanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessInstance> getAllProcessInstances() {
		return getAllEntities(ProcessinstancePackage.eINSTANCE.getProcessInstance(), false);
	}

}
