package de.dfki.iui.basys.runtime.services.jaxrs;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import de.dfki.iui.basys.common.emf.JsonUtils;
import de.dfki.iui.basys.model.base.Entity;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class EntityMessageBodyWriter implements MessageBodyWriter<Entity> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return Entity.class.isAssignableFrom(type);
	}

	@Override
	public long getSize(Entity enitity, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediatype) {
		return -1;
	}

	@Override
	public void writeTo(Entity entity, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		JsonUtils.toStream(entityStream, entity);
	}
}
