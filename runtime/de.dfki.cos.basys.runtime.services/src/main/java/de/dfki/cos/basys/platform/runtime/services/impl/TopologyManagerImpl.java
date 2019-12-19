package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.topology.Enterprise;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyElement;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.runtime.services.TopologyManager;

public class TopologyManagerImpl extends EmfBasysComponent implements TopologyManager {

	public TopologyManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public Enterprise getEnterprise() {
		return getService().getFirstEntity(TopologyPackage.eINSTANCE.getEnterprise()); 
	}

	@Override
	public TopologyElement getTopologyElement(String id) {
		return getService().getEntity(id);
	}

	@Override
	public TopologyElement getParentTopologyElement(String id) {
		TopologyElement element = getService().getEntity(id);
		if (element.eContainer() != null)
			return (TopologyElement) element.eContainer();
		else 
			return null;		
	}

}
