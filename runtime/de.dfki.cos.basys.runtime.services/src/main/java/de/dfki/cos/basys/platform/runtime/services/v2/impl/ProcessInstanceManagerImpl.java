package de.dfki.cos.basys.platform.runtime.services.v2.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstance;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstanceStore;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.processinstance.util.ProcessinstanceResourceFactoryImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.ProcessInstanceManager;

public class ProcessInstanceManagerImpl extends EmfBasysComponent implements ProcessInstanceManager {

	public ProcessInstanceManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public ProcessInstance getProcessInstance(String id) {
		return service.getEntity(id);
	}

	@Override
	public ProcessInstance getProcessInstanceByProductInstance(String productInstanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessInstanceStore getProcessInstanceStore() {
		ProcessInstanceStore store = service.getFirstEntity(ProcessinstancePackage.eINSTANCE.getProcessInstanceStore());
		return store;
	}
	
}
