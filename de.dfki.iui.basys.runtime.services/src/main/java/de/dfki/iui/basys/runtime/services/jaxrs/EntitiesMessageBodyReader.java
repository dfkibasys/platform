package de.dfki.iui.basys.runtime.services.jaxrs;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.eclipse.emf.ecore.resource.Resource;

import de.dfki.iui.basys.common.emf.JsonUtils;
import de.dfki.iui.basys.model.base.Entity;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class EntitiesMessageBodyReader implements MessageBodyReader<List<Entity>> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		if (genericType instanceof ParameterizedType) {
			Type t = ((ParameterizedType) genericType).getActualTypeArguments()[0];
			return Entity.class.isAssignableFrom(t.getClass());
		}
		return false;
	}

	@Override
	public List<Entity> readFrom(Class<List<Entity>> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {

		Resource resource = JsonUtils.fromStream(entityStream);
		return Arrays.asList(resource.getContents().toArray(new Entity[0]));
	}

}
