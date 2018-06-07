package de.dfki.iui.basys.runtime.processcontrol;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.processcontrol.impl.CamundaRestClient;
import de.dfki.iui.basys.runtime.processcontrol.impl.ExternalServiceTaskDto;
import de.dfki.iui.basys.runtime.processcontrol.impl.ExternalServiceTaskDto.Variables;

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
				.externalConnectionString("http://localhost:8081/engine-rest/engine/default/external-task/")
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
		HashMap<String,String> varMap = new HashMap<String,String>();
		varMap.put("ProcessVariableOne", "one");
		varMap.put("ProcessVariableTwo", "two");
		CamundaRestClient camundaClient = new CamundaRestClient(taskSchedulerConfig.getComponentId(), taskSchedulerConfig.getExternalConnectionString());
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 5, 30 * 1000, 2000, "assignee", "command", "parameters");
		assertEquals(1,	tasks.size());
		for (ExternalServiceTaskDto task : tasks)
			camundaClient.complete(task.getId(), varMap);
		Thread.currentThread().sleep(60*1000);
	}
	
	
	@Override
	public void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	
}
