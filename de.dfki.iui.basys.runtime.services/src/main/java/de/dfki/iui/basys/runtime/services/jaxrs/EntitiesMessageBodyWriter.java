package de.dfki.iui.basys.runtime.services.jaxrs;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

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
public class EntitiesMessageBodyWriter implements MessageBodyWriter<List<Entity>> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		if (genericType instanceof ParameterizedType) {
			Type t = ((ParameterizedType) genericType).getActualTypeArguments()[0];
			return Entity.class.isAssignableFrom(t.getClass());
		}
		return true;
	}

	@Override
	public long getSize(List<Entity> entities, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return -1;
	}

	@Override
	public void writeTo(List<Entity> entities, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {

		JsonUtils.toStream(entityStream, entities);

	}

}
