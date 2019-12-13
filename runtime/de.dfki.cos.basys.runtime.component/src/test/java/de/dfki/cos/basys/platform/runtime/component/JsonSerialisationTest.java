package de.dfki.cos.basys.platform.runtime.component;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OperationModeRequest;

public class JsonSerialisationTest extends BaseComponentTest {

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testSerializeDeserialize() throws IOException {
		OperationModeRequest req = new OperationModeRequest();
		req.setComponentId("componentId");
		req.setCorrelationId("correlationId");
		req.setOccupierId("occupier");
		
		String json = context.getObjectMapper().writeValueAsString(req);
		System.out.println(json);
		System.out.println("----");
		
		Object o = context.getObjectMapper().readValue(json, ComponentRequest.class);
		
		System.out.println("----");
		
	}

	
}
