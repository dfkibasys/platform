package de.dfki.cos.basys.platform.runtime.processcontrol;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import org.junit.Ignore;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import de.dfki.cos.basys.platform.model.runtime.component.VariableType;
import de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl;
import de.dfki.cos.basys.platform.runtime.processcontrol.camunda.CamundaRestClient;
import de.dfki.cos.basys.platform.runtime.processcontrol.camunda.ExternalServiceTaskDto;

public class CamundaClientTest {

	@Test
	@Ignore
	public void testSetProcessVariablesAlt() throws Exception {
		
		List<Variable> vars = new LinkedList<>();
		vars.add(new VariableImpl.Builder().name("StringVariable").value("aValueUpdate").type(VariableType.STRING).build());
		vars.add(new VariableImpl.Builder().name("IntVariable").value("55").type(VariableType.INTEGER).build());
		vars.add(new VariableImpl.Builder().name("BoolVariable").value("true").type(VariableType.BOOLEAN).build());
		vars.add(new VariableImpl.Builder().name("qaResult").value("true").type(VariableType.BOOLEAN).build());
		vars.add(new VariableImpl.Builder().name("colaRequest").value("true").type(VariableType.BOOLEAN).build());
		vars.add(new VariableImpl.Builder().name("emptyBottle").value("true").type(VariableType.BOOLEAN).build());
		vars.add(new VariableImpl.Builder().name("qaRequest").value("true").type(VariableType.BOOLEAN).build());
		vars.add(new VariableImpl.Builder().name("milkrunRequest").value("true").type(VariableType.BOOLEAN).build());
		
		CamundaRestClient camundaClient = new CamundaRestClient("test", "http://localhost:8081/engine-rest/");
		
		//String processdefinitionId = "";
		//camundaClient.startProcessInstance(processdefinitionId);
		
		while (true) {
			List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
			assertTrue(tasks.size()>0);
			for (ExternalServiceTaskDto task : tasks) {
				camundaClient.complete(task.getId(), vars);
				Thread.currentThread().sleep(250);
			}

			Thread.currentThread().sleep(250);
		}

	}
	
	
	@Test
	@Ignore
	public void testSpawnProcess() throws Exception {		
	
		CamundaRestClient camundaClient = new CamundaRestClient("test", "http://localhost:8081/engine-rest");
		
		ProcessRequest request = ComponentFactory.eINSTANCE.createProcessRequest();
		request.setName("Process.Manufacture");
		request.setBusinessKey(UUID.randomUUID().toString());
		
		Variable var = new VariableImpl.Builder().name("resourceInstanceId").value("testResouceId").type(VariableType.STRING).build();
		request.getVariables().add(var);
		
		if (!request.getVariables().isEmpty()) {
			camundaClient.createProcessInstanceByKey(request.getName(), request.getBusinessKey(), request.getVariables());
		} else {
			camundaClient.createProcessInstanceByKey(request.getName(), request.getBusinessKey());
		}
	

	}

}
