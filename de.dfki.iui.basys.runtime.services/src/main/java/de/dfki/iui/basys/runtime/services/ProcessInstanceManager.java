package de.dfki.iui.basys.runtime.services;

import java.util.List;

import de.dfki.iui.basys.model.domain.processinstance.ProcessInstance;

public interface ProcessInstanceManager {

	ProcessInstance getProcessInstance(String id);

	ProcessInstance getProcessInstanceByProductInstance(String productInstanceId);

	List<ProcessInstance> getAllProcessInstances();

}
