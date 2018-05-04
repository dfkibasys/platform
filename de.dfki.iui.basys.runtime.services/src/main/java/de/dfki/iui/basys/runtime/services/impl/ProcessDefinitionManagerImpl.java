package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import de.dfki.iui.basys.model.domain.processdefinition.ProcessDefinition;
import de.dfki.iui.basys.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl;
import de.dfki.iui.basys.model.domain.processdefinition.util.ProcessdefinitionResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProcessDefinitionManager;

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
