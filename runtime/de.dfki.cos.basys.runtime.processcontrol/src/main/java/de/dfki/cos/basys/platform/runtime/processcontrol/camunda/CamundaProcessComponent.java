package de.dfki.cos.basys.platform.runtime.processcontrol.camunda;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.process.ProcessComponent;

public class CamundaProcessComponent extends ProcessComponent {

	protected CamundaRestClient client;
	
	public CamundaProcessComponent(ComponentConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void connectToExternal() throws ComponentException {	
		client = new CamundaRestClient(getConfig().getComponentId(), getConfig().getExternalConnectionString());
	}
	
	@Override
	public void disconnectFromExternal() {
		client = null;
	}
	
	@Override
	public void onStarting() {
	}
	
	@Override
	public void onExecute() {
	}
	
	@Override
	public void onCompleting() {
	}
	
	@Override
	public void onStopping() {
	}
}
