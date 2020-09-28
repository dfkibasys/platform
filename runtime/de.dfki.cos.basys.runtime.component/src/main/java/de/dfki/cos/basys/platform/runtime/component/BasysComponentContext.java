package de.dfki.cos.basys.platform.runtime.component;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import de.dfki.cos.basys.aas.component.AasComponentContext;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;

public class BasysComponentContext extends AasComponentContext {

	protected ChannelPool sharedChannelPool;
	protected ResourceSet sharedResourceSet;
	protected ObjectMapper objectMapper;

	private static BasysComponentContext staticContext = null;

	public static BasysComponentContext getStaticContext() {
		if (staticContext == null) {
			staticContext = new BasysComponentContext();
			staticContext.setEventBus(AasComponentContext.getStaticContext().getEventBus());
			staticContext.setScheduledExecutorService(AasComponentContext.getStaticContext().getScheduledExecutorService());
			staticContext.setAasRegistry(AasComponentContext.getStaticContext().getAasRegistry());
			//staticContext.setSharedResourceSet(new BasysResourceSetImpl.Factory().createResourceSet());
		
			final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
			dateFormat.setTimeZone(TimeZone.getDefault());
			
			staticContext.setObjectMapper(new ObjectMapper()
					.enable(SerializationFeature.INDENT_OUTPUT)
					.setDateFormat(dateFormat)
					.setTimeZone(TimeZone.getDefault()));
					//.enableDefaultTypingAsProperty(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT,"@class")
					//.enableDefaultTyping());		
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
