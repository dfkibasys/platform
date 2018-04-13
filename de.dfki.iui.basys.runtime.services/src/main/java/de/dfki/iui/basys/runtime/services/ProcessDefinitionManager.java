package de.dfki.iui.basys.runtime.services;

import java.util.List;

import de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition;

public interface ProcessDefinitionManager {

	ProcessDefinition getProcessDefinition(String id);
	
	ProcessDefinition getProcessDefinitionByProductVariant(String productVariantId);

	List<ProcessDefinition> getAllProcessDefinitions();
	
}
