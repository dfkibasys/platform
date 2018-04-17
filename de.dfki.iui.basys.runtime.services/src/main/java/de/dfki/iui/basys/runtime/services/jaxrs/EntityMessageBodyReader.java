package de.dfki.iui.basys.runtime.services.jaxrs;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import de.dfki.iui.basys.common.emf.JsonUtils;
import de.dfki.iui.basys.model.base.Entity;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class EntityMessageBodyReader implements MessageBodyReader<Entity> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return Entity.class.isAssignableFrom(type);
	}

	@Override
	public Entity readFrom(Class<Entity> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws WebApplicationException {

		try {
			// String json = Utils.getStringFromInputStream(entityStream);
			// System.out.println(json);
			Entity result = JsonUtils.fromStream(entityStream, Entity.class);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
