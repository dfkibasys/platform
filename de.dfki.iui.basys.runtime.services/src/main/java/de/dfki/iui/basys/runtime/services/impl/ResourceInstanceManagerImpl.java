package de.dfki.iui.basys.runtime.services.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ResourceInstanceManager;

public class ResourceInstanceManagerImpl extends EmfServiceComponent implements ResourceInstanceManager {

	public ResourceInstanceManagerImpl(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ResourceInstance> getAllResourceInstances() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getAllResourceInstancesRest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceInstance getResourceInstance(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getResourceInstanceRest(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
