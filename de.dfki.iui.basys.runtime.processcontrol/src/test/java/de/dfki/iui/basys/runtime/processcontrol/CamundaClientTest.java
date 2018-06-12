package de.dfki.iui.basys.runtime.processcontrol;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.model.runtime.component.ProcessRequest;
import de.dfki.iui.basys.model.runtime.component.Variable;
import de.dfki.iui.basys.model.runtime.component.VariableType;
import de.dfki.iui.basys.model.runtime.component.impl.VariableImpl;
import de.dfki.iui.basys.runtime.processcontrol.impl.CamundaRestClient;
import de.dfki.iui.basys.runtime.processcontrol.impl.ExternalServiceTaskDto;

public class CamundaClientTest {

	@Test
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
	public void testSpawnProcess() throws Exception {
		
	
		CamundaRestClient camundaClient = new CamundaRestClient("test", "http://localhost:8081/engine-rest/");
		
		ProcessRequest request = ComponentFactory.eINSTANCE.createProcessRequest();
		request.setName("Process.Manufacture");
		request.setBusinessKey(UUID.randomUUID().toString());
		
		Variable var = new VariableImpl.Builder().name("resourceInstanceId").value("testResouceId").type(VariableType.STRING).build();
		request.setVariable(var);
		
		if (request.getVariable() != null) {
			camundaClient.sendMessage(request.getName(), request.getBusinessKey(), request.getVariable());
		} else {
			camundaClient.sendMessage(request.getName(), request.getBusinessKey());
		}
	

	}

}
