package de.dfki.cos.basys.platform.runtime.component;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.OperationModeRequest;

public class JsonSerialisationTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testSerializeDeserialize() throws IOException {
		

		BasysComponentContext context = BasysComponentContext.getStaticContext();
		
		OperationModeRequest req = new OperationModeRequest();
		req.setComponentId("componentId");
		req.setCorrelationId("correlationId");
		req.setOccupierId("occupier");
		
		String json = context.getObjectMapper().writeValueAsString(req);
		System.out.println(json);
		
		OperationModeRequest o = context.getObjectMapper().readValue(json, OperationModeRequest.class);

		assertEquals(req.getComponentId(), o.getComponentId());
		assertEquals(req.getCorrelationId(), o.getCorrelationId());
		assertEquals(req.getOccupierId(), o.getOccupierId());
		
	}

	
}
