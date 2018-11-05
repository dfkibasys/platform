package de.dfki.iui.basys.runtime.processcontrol;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.Variable;
import de.dfki.iui.basys.model.runtime.component.VariableType;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.model.runtime.component.impl.VariableImpl;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.processcontrol.impl.CamundaRestClient;
import de.dfki.iui.basys.runtime.processcontrol.impl.ExternalServiceTaskDto;

public class ProcessControlTest extends BaseComponentTest {

	protected ComponentConfiguration taskSchedulerConfig;
	
	@Override
	public void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		
		taskSchedulerConfig = new ComponentConfigurationImpl.Builder()
				.componentId("task-scheduler")
				.componentName("task-scheduler")
				.componentCategory(ComponentCategory.SERVICE_COMPONENT)
				.componentImplementationJavaClass("de.dfki.iui.basys.runtime.processcontrol.impl.CamundaTaskScheduler")
				//.inChannelName("component1#in")
				//.outChannelName("component1#out")
				.externalConnectionString("http://localhost:8081/engine-rest/engine/default/")
				.build();
	}
	
	@Test
	@Ignore
	public void testCamundaRestClient() {
		CamundaRestClient camundaClient = new CamundaRestClient(taskSchedulerConfig.getComponentId(), taskSchedulerConfig.getExternalConnectionString());
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
		 
		assertEquals(1,	tasks.size());
		
	}

	@Test
	@Ignore
	public void testCamundaSchedulerOk() throws Exception {

		componentManager.createLocalComponent(config1);
		DeviceComponent d1 = (DeviceComponent)componentManager.getLocalComponentById(config1.getComponentId());
		d1.reset();
		
		componentManager.createLocalComponent(config2);
		DeviceComponent d2 = (DeviceComponent)componentManager.getLocalComponentById(config2.getComponentId());
		d2.reset();
		
		componentManager.createLocalComponent(config3);
		DeviceComponent d3 = (DeviceComponent)componentManager.getLocalComponentById(config3.getComponentId());
		d3.reset();
		
		componentManager.createLocalComponent(taskSchedulerConfig);
		
		Thread.currentThread().sleep(60*10*1000);
				
	}
	
	@Test
	@Ignore
	public void testCamundaSchedulerNotOk() throws Exception {

		componentManager.createLocalComponent(config1);
		componentManager.createLocalComponent(config2);
		componentManager.createLocalComponent(config3);

		componentManager.createLocalComponent(taskSchedulerConfig);
		
		Thread.currentThread().sleep(60*10*1000);
				
	}
	
	@Test
	@Ignore
	public void testStartAndWalkThroughProcess() throws Exception {
		CamundaRestClient camundaClient = new CamundaRestClient(taskSchedulerConfig.getComponentId(), taskSchedulerConfig.getExternalConnectionString());
		for (int i = 0; i<3; i++) {
			List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
			assertEquals(1,	tasks.size());
			for (ExternalServiceTaskDto task : tasks)
				camundaClient.complete(task.getId());
		}
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
		assertEquals(true, tasks.isEmpty());
	}
	
	@Test
	@Ignore
	public void testSetProcessVariables() throws Exception {

		List<Variable> vars = new LinkedList<>();
		vars.add(new VariableImpl.Builder().name("StringVariable").value("aValueUpdate").type(VariableType.STRING).build());
		vars.add(new VariableImpl.Builder().name("IntVariable").value("55").type(VariableType.INTEGER).build());
		vars.add(new VariableImpl.Builder().name("BoolVariable").value("true").type(VariableType.BOOLEAN).build());
		
		CamundaRestClient camundaClient = new CamundaRestClient(taskSchedulerConfig.getComponentId(), taskSchedulerConfig.getExternalConnectionString());
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
		assertEquals(1,	tasks.size());
		for (ExternalServiceTaskDto task : tasks)
			camundaClient.complete(task.getId(), vars);
		Thread.currentThread().sleep(60*1000);
	}
	
	
	@Test
	@Ignore
	public void testSetProcessVariablesAlt() throws Exception {
		
		List<Variable> vars = new LinkedList<>();
		vars.add(new VariableImpl.Builder().name("StringVariable").value("aValueUpdate").type(VariableType.STRING).build());
		vars.add(new VariableImpl.Builder().name("IntVariable").value("55").type(VariableType.INTEGER).build());
		vars.add(new VariableImpl.Builder().name("BoolVariable").value("true").type(VariableType.BOOLEAN).build());
		
		CamundaRestClient camundaClient = new CamundaRestClient(taskSchedulerConfig.getComponentId(), taskSchedulerConfig.getExternalConnectionString());
		
		//String processdefinitionId = "";
		//camundaClient.startProcessInstance(processdefinitionId);
		
		while (true) {
			List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
			assertEquals(1,	tasks.size());
			for (ExternalServiceTaskDto task : tasks) {
				camundaClient.complete(task.getId(), vars);
				Thread.currentThread().sleep(250);
			}

			Thread.currentThread().sleep(250);
		}

	}
	
	@Override
	public void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	
}
