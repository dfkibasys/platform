package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.List;

import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl;
import de.dfki.cos.basys.platform.model.domain.processdefinition.util.ProcessdefinitionResourceFactoryImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.ProcessDefinitionManager;

public class ProcessDefinitionManagerImpl extends EmfServiceComponent implements ProcessDefinitionManager {

	public ProcessDefinitionManagerImpl(ComponentConfiguration config) {
		super(config);
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
		return getAllEntities(ProcessdefinitionPackage.eINSTANCE.getProcessDefinition(), false);
	}

}
