package de.dfki.cos.basys.platform.runtime.processcontrol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.dfki.cos.basys.platform.runtime.component.model.Variable;
import de.dfki.cos.basys.platform.runtime.component.model.VariableType;
import de.dfki.cos.basys.platform.runtime.processcontrol.camunda.CamundaRestClient;
import de.dfki.cos.basys.platform.runtime.processcontrol.camunda.ExternalServiceTaskDto;

public class CamundaClientTest {

	String connectionString = "http://lns-90165.sb.dfki.de:9080/engine-rest";
	
	CamundaRestClient camundaClient;
	
	@Before
	public void setUp() throws Exception {
		camundaClient = new CamundaRestClient("test", connectionString);
	}

	@After
	public void tearDown() throws Exception {

	}
	
	@Test
	public void testExternalServiceTaskDto() throws Exception {
	
		List<Variable> vars = new LinkedList<>();
		vars.add(new Variable.Builder().name("StringVariable").valueString("aValueUpdate").type(VariableType.STRING).build());
		vars.add(new Variable.Builder().name("IntVariable").valueString("55").type(VariableType.INTEGER).build());
		vars.add(new Variable.Builder().name("BoolVariable").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("qaResult").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("colaRequest").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("emptyBottle").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("qaRequest").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("milkrunRequest").valueString("true").type(VariableType.BOOLEAN).build());
				
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("ControlComponent", 5, 10 * 1000, 2000, "requestType", "token", "componentId", "parameters", "outputParameters");
		//assertTrue(tasks.size()>0);
		for (ExternalServiceTaskDto task : tasks) {
			
			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String,Object> input = mapper.readValue(task.variables.parameters.value,new TypeReference<Map<String,Object>>(){});
				List<String> output = mapper.readValue(task.variables.outputParameters.value,new TypeReference<List<String>>(){});

				System.out.println("------------------------");
				System.out.println(input);
				System.out.println(output);
				System.out.println("------------------------");
				
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			camundaClient.complete(task.id, vars);			
			Thread.sleep(250);
		}
	}
	
	
	@Test
	@Ignore
	public void testSetProcessVariablesAlt() throws Exception {

		List<Variable> vars = new LinkedList<>();
		vars.add(new Variable.Builder().name("StringVariable").valueString("aValueUpdate").type(VariableType.STRING).build());
		vars.add(new Variable.Builder().name("IntVariable").valueString("55").type(VariableType.INTEGER).build());
		vars.add(new Variable.Builder().name("BoolVariable").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("qaResult").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("colaRequest").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("emptyBottle").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("qaRequest").valueString("true").type(VariableType.BOOLEAN).build());
		vars.add(new Variable.Builder().name("milkrunRequest").valueString("true").type(VariableType.BOOLEAN).build());
		
		
		//String processdefinitionId = "";
		//camundaClient.startProcessInstance(processdefinitionId);
		
		while (true) {
			List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
			assertTrue(tasks.size()>0);
			for (ExternalServiceTaskDto task : tasks) {
				camundaClient.complete(task.id, vars);
				Thread.currentThread().sleep(250);
			}

			Thread.currentThread().sleep(250);
		}

	}
	
	@Test
	@Ignore
	public void testCamundaRestClient() {
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
		 
		assertEquals(1,	tasks.size());
		
	}

	@Test
	@Ignore
	public void testStartAndWalkThroughProcess() throws Exception {
		for (int i = 0; i<3; i++) {
			List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
			assertEquals(1,	tasks.size());
			for (ExternalServiceTaskDto task : tasks)
				camundaClient.complete(task.id);
		}
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
		assertEquals(true, tasks.isEmpty());
	}
	
	@Test
	@Ignore
	public void testSetProcessVariables() throws Exception {

		List<Variable> vars = new LinkedList<>();
		vars.add(new Variable.Builder().name("StringVariable").valueString("aValueUpdate").type(VariableType.STRING).build());
		vars.add(new Variable.Builder().name("IntVariable").valueString("55").type(VariableType.INTEGER).build());
		vars.add(new Variable.Builder().name("BoolVariable").valueString("true").type(VariableType.BOOLEAN).build());
		
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
		assertEquals(1,	tasks.size());
		for (ExternalServiceTaskDto task : tasks)
			camundaClient.complete(task.id, vars);
		Thread.currentThread().sleep(60*1000);
	}
	
	@Test
	@Ignore
	public void testSpawnProcess() throws Exception {		
	
//		CamundaRestClient camundaClient = new CamundaRestClient("test", "http://localhost:8081/engine-rest");
//		
//		ProcessRequest request = ComponentFactory.eINSTANCE.createProcessRequest();
//		request.setName("Process.Manufacture");
//		request.setBusinessKey(UUID.randomUUID().toString());
//		
//		Variable var = new VariableImpl.Builder().name("resourceInstanceId").value("testResouceId").type(VariableType.STRING).build();
//		request.getVariables().add(var);
//		
//		if (!request.getVariables().isEmpty()) {
//			camundaClient.createProcessInstanceByKey(request.getName(), request.getBusinessKey(), request.getVariables());
//		} else {
//			camundaClient.createProcessInstanceByKey(request.getName(), request.getBusinessKey());
//		}
	

	}

}
