package de.dfki.cos.basys.platform.runtime.services.impl;

import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstance;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstanceStore;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.processinstance.util.ProcessinstanceResourceFactoryImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.ProcessInstanceManager;

public class ProcessInstanceManagerImpl extends EmfServiceComponent implements ProcessInstanceManager {

	public ProcessInstanceManagerImpl(ComponentConfiguration config) {
		super(config);
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
	public ProcessInstanceStore getProcessInstanceStore() {
		ProcessInstanceStore store = getFirstEntity(ProcessinstancePackage.eINSTANCE.getProcessInstanceStore());
		return store;
	}
	
}
