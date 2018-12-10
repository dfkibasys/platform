package de.dfki.cos.basys.platform.runtime.services.impl;

import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.services.TopologyManager;
import de.dfki.iui.basys.model.domain.topology.Enterprise;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;
import de.dfki.iui.basys.model.domain.topology.TopologyPackage;
import de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl;
import de.dfki.iui.basys.model.domain.topology.util.TopologyResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;

public class TopologyManagerImpl extends EmfServiceComponent implements TopologyManager {

	public TopologyManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public Enterprise getEnterprise() {
		return getFirstEntity(TopologyPackage.eINSTANCE.getEnterprise()); 
	}

	@Override
	public TopologyElement getTopologyElement(String id) {
		return getEntity(id);
	}

	@Override
	public TopologyElement getParentTopologyElement(String id) {
		TopologyElement element = getEntity(id);
		if (element.eContainer() != null)
			return (TopologyElement) element.eContainer();
		else 
			return null;		
	}

}
