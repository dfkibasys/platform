package de.dfki.cos.basys.platform.runtime.processcontrol.impl;

import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.BasysComponent;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentRequestExecutionManager;
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentRequestIssuer;

public abstract class AbstractComponentRequestExecutionManager extends BasysComponent<ComponentRequestIssuer>
		implements ComponentRequestExecutionManager, Runnable {

	public AbstractComponentRequestExecutionManager(Properties config) {
		super(config);

//		ControlComponentWorker serviceProvider = new ControlComponentWorker(config);
//		serviceManager = new ServiceManagerImpl<ComponentRequestIssuer>(config, serviceProvider);		
	}
	
	@Override
	public void activate(ComponentContext context) throws ComponentException {	
		super.activate(context);
		
		if (isActivated()) {
			context.getScheduledExecutorService().schedule(this, 5000, TimeUnit.MILLISECONDS);			
		}		
	}

    @Override
    public void run() {    	
    	while (isActivated()) {
    		ComponentRequest request = getService().pollNewComponentRequest();
			if (request != null) {
				//TODO: put method call on thread or execute/schedule/submit it with the executor service
				executeComponentRequest(request);
			} else {
				LOGGER.debug("no requests polled");
			}
    	}
    	LOGGER.info("Loop left");
    	
    }


}
