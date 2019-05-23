#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.device.${artifactId};

import de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration;
import de.dfki.cos.basys.platform.runtime.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.device.rest.RestDeviceComponent;
import de.dfki.cos.basys.platform.runtime.component.packml.UnitConfiguration;

public class NexoDeviceComponent extends RestDeviceComponent {

	public NexoDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void activate(ComponentContext context) throws ComponentException {
		// handle custom config properties first before call super (if there are any)
		super.activate(context);	
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		return new UnitConfiguration();
	}
	
	@Override
	public void onResetting() {		
	}

	@Override
	public void onStarting() {
	}

	@Override
	public void onExecute() {		
	}
	
	@Override
	public void onCompleting() {
		// if we override this method, we have to call super. 
		super.onCompleting();
	}

	@Override
	public void onStopping() {
		// if we override this method, we have to call super.
		super.onStopping();
	}

}
