package de.dfki.cos.basys.platform.runtime.component.v2;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.manager.ComponentManager;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.runtime.component.service.EmfServiceComponent;

public class BasysComponentContext extends ComponentContext {

	protected ChannelPool sharedChannelPool;
	protected ResourceSet sharedResourceSet;

	private static BasysComponentContext staticContext = null;

	public static BasysComponentContext getStaticContext() {
		if (staticContext == null) {
			staticContext = new BasysComponentContext();
			staticContext.setEventBus(ComponentContext.getStaticContext().getEventBus());
			staticContext.setScheduledExecutorService(ComponentContext.getStaticContext().getScheduledExecutorService());
			staticContext.setSharedResourceSet(EmfServiceComponent.createResourceSet());
		}
		return staticContext;
	}

	public BasysComponentContext() {
	}

	public BasysComponentContext(BasysComponentContext context) {
		super(context);

		this.sharedChannelPool = context.getSharedChannelPool();
		this.sharedResourceSet = context.getSharedResourceSet();
	}

	public ChannelPool getSharedChannelPool() {
		return sharedChannelPool;
	}

	public void setSharedChannelPool(ChannelPool sharedChannelPool) {
		this.sharedChannelPool = sharedChannelPool;
	}

	public ResourceSet getSharedResourceSet() {
		return sharedResourceSet;
	}

	public void setSharedResourceSet(ResourceSet sharedResourceSet) {
		this.sharedResourceSet = sharedResourceSet;
	}

}
