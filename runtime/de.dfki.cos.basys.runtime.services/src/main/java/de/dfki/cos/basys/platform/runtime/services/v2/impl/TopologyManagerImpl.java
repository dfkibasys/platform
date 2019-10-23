package de.dfki.cos.basys.platform.runtime.services.v2.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.topology.Enterprise;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyElement;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl;
import de.dfki.cos.basys.platform.model.domain.topology.util.TopologyResourceFactoryImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;
import de.dfki.cos.basys.platform.runtime.component.v2.emf.EmfBasysComponent;
import de.dfki.cos.basys.platform.runtime.services.TopologyManager;

public class TopologyManagerImpl extends EmfBasysComponent implements TopologyManager {

	public TopologyManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public Enterprise getEnterprise() {
		return client.getFirstEntity(TopologyPackage.eINSTANCE.getEnterprise()); 
	}

	@Override
	public TopologyElement getTopologyElement(String id) {
		return client.getEntity(id);
	}

	@Override
	public TopologyElement getParentTopologyElement(String id) {
		TopologyElement element = client.getEntity(id);
		if (element.eContainer() != null)
			return (TopologyElement) element.eContainer();
		else 
			return null;		
	}

}
