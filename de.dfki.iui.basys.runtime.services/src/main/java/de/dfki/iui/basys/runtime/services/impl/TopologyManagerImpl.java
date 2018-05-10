package de.dfki.iui.basys.runtime.services.impl;

import de.dfki.iui.basys.model.domain.topology.Enterprise;
import de.dfki.iui.basys.model.domain.topology.TopologyElement;
import de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl;
import de.dfki.iui.basys.model.domain.topology.util.TopologyResourceFactoryImpl;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.TopologyManager;

public class TopologyManagerImpl extends EmfServiceComponent implements TopologyManager {

	public TopologyManagerImpl(ComponentConfiguration config) {
		super(config);
		TopologyPackageImpl.init();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("topology", new TopologyResourceFactoryImpl());

	}

	@Override
	public Enterprise getEnterprise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopologyElement getTopologyElement(String id) {
		return getEntity(id);
	}

	@Override
	public TopologyElement getParentTopologyElement(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
