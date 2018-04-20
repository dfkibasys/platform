package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.processinstance.ProcessInstance;
import de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl;
import de.dfki.iui.basys.model.domain.processinstance.util.ProcessinstanceResourceFactoryImpl;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProcessDefinitionManager;
import de.dfki.iui.basys.runtime.services.ProcessInstanceManager;

public class ProcessInstanceManagerImpl extends EmfServiceComponent implements ProcessInstanceManager {

	public ProcessInstanceManagerImpl(ComponentConfiguration config) {
		super(config);
		ProcessinstancePackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("processinstance", new ProcessinstanceResourceFactoryImpl());
	}

	@Override
	public ProcessInstance getProcessInstance(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessInstance getProcessInstanceByProductInstance(String productInstanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessInstance> getAllProcessInstances() {
		// TODO Auto-generated method stub
		return null;
	}

}
