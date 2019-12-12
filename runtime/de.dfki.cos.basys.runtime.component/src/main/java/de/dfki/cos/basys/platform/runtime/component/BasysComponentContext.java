package de.dfki.cos.basys.platform.runtime.component;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.runtime.component.util.BasysResourceSetImpl;

public class BasysComponentContext extends ComponentContext {

	protected ChannelPool sharedChannelPool;
	protected ResourceSet sharedResourceSet;
	protected ObjectMapper objectMapper;

	private static BasysComponentContext staticContext = null;

	public static BasysComponentContext getStaticContext() {
		if (staticContext == null) {
			staticContext = new BasysComponentContext();
			staticContext.setEventBus(ComponentContext.getStaticContext().getEventBus());
			staticContext.setScheduledExecutorService(ComponentContext.getStaticContext().getScheduledExecutorService());
			staticContext.setSharedResourceSet(new BasysResourceSetImpl.Factory().createResourceSet());
			staticContext.setObjectMapper(new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT));		
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

	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}
	
	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
	
}
