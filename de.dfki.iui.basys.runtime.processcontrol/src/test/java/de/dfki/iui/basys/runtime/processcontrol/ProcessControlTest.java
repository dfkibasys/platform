package de.dfki.iui.basys.runtime.processcontrol;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl;
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
				.externalConnectionString("http://localhost:8080/engine-rest/engine/default/external-task/")
				.build();
	}
	
	@Test
	//@Ignore
	public void testCamundaRestClient() {
		CamundaRestClient camundaClient = new CamundaRestClient(taskSchedulerConfig.getComponentId(), taskSchedulerConfig.getExternalConnectionString());
		List<ExternalServiceTaskDto> tasks = camundaClient.getExternalTasks("BasysTask", 30 * 1000, "assignee", "command", "parameters");
		 
		assertEquals(1,	tasks.size());
		
	}
	
	
	@Override
	public void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	
}
