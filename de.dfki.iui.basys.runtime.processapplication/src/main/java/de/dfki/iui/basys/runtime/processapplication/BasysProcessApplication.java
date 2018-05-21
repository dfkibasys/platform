package de.dfki.iui.basys.runtime.processapplication;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.camunda.bpm.ProcessApplicationService;
import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.ProcessApplicationDeploymentInfo;
import org.camunda.bpm.application.ProcessApplicationInfo;
import org.camunda.bpm.application.ProcessApplicationInterface;
import org.camunda.bpm.application.impl.EjbProcessApplication;
import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.cdi.BusinessProcessEvent;
import org.camunda.bpm.engine.cdi.annotation.event.AssignTask;
import org.camunda.bpm.engine.cdi.annotation.event.StartActivity;
import org.camunda.bpm.engine.cdi.impl.event.CdiEventListener;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.repository.Resource;
import org.camunda.bpm.model.bpmn.instance.UserTask;
//import org.jboss.logging.Logger;

@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@ProcessApplication
// @LocalBean
@Local(ProcessApplicationInterface.class)
public class BasysProcessApplication extends EjbProcessApplication {

	private final static Logger LOGGER = Logger.getLogger(BasysProcessApplication.class.getName());

	protected CdiEventListener cdiEventListener = new CdiEventListener();

	protected Map<String, String> properties = new HashMap<String, String>();

	@Inject
	private static RepositoryService repositoryService;

	@Inject
	private static RuntimeService runtimeService;

	@Inject
	private static TaskService taskService;

	@Inject
	private static IdentityService identityService;

	@Inject
	private static FormService formService;

	@Inject
	private static HistoryService historyService;

	@Inject
	private static ManagementService managementService;

	@Inject
	private static ProcessApplicationService processApplicationService;

	@PostConstruct
	public void start() {
		deploy();
	}

	@PostDeploy
	public void postDeploy() {
//		for (String name : processApplicationService.getProcessApplicationNames()) {
//			ProcessApplicationInfo appInfo = processApplicationService.getProcessApplicationInfo(name);
//			for (ProcessApplicationDeploymentInfo deploymentInfo : appInfo.getDeploymentInfo()) {
//				List<Resource> resources = repositoryService.getDeploymentResources(deploymentInfo.getDeploymentId());
//				for (Resource resource : resources) {
//					// InputStream is =
//					// repositoryService.getResourceAsStreamById(deploymentInfo.getDeploymentId(),
//					// resource.getId());
//					LOGGER.info("Found Resource: " + resource.getName());
//				}
//			}
//		}
	}

	@PreDestroy
	public void stop() {
		undeploy();
	}

	@Override
	public Map<String, String> getProperties() {
		return properties;
	}

	@Override
	public ExecutionListener getExecutionListener() {
		// ProcessEngine pe = ProcessEngines.getDefaultProcessEngine();
		return cdiEventListener;
	}

	@Override
	public TaskListener getTaskListener() {
		return cdiEventListener;
	}

//	public static void onTaskAssingment(@Observes @AssignTask("*") BusinessProcessEvent businessProcessEvent) {
//		LOGGER.info("onTaskAssingment");
//	}

	public static void onActivityEvent(@Observes @StartActivity("*") BusinessProcessEvent businessProcessEvent) {
		LOGGER.info("Activity started: " + businessProcessEvent.getActivityId());
	}

	public static void onProcessEvent(@Observes BusinessProcessEvent businessProcessEvent) {
		String separator = "-------------------";

		StringBuffer b = new StringBuffer();
		b.append("\n" + separator + " BusinessProcessEvent " + separator);
		b.append("\n ActivityId          " + businessProcessEvent.getActivityId());
		b.append("\n ExecutionId         " + businessProcessEvent.getExecutionId());
		b.append("\n ProcessInstanceId   " + businessProcessEvent.getProcessInstanceId());
		// b.append("\n TaskDefinitionKey " +
		// businessProcessEvent.getTaskDefinitionKey());
		// b.append("\n TaskId " +
		// businessProcessEvent.getTaskId());
		b.append("\n TimeStamp           " + businessProcessEvent.getTimeStamp());
		b.append("\n TransitionName      " + businessProcessEvent.getTransitionName());
		b.append("\n Type                " + businessProcessEvent.getType());

		if (businessProcessEvent.getTask() != null) {
			b.append("\n" + separator + " DelegateTask " + separator);
			DelegateTask t = businessProcessEvent.getTask();

			b.append("\n Assignee            " + t.getAssignee());
			b.append("\n DeleteReason        " + t.getDeleteReason());
			b.append("\n Description         " + t.getDescription());
			b.append("\n EventName           " + t.getEventName());
			b.append("\n ExecutionId         " + t.getExecutionId());
			b.append("\n Id                  " + t.getId());
			b.append("\n Name                " + t.getName());
			b.append("\n Owner               " + t.getOwner());
			b.append("\n Priority            " + t.getPriority());
			b.append("\n ProcessDefinitionId " + t.getProcessDefinitionId());
			b.append("\n ProcessInstanceId   " + t.getProcessInstanceId());
			b.append("\n TaskDefinitionKey   " + t.getTaskDefinitionKey());
			b.append("\n VariableNames       " + t.getVariableNames().toString());

			if (t.getBpmnModelElementInstance() != null) {
				UserTask ut = t.getBpmnModelElementInstance();
				// TaskFormData tfd =
				// formService.getTaskFormData(businessProcessEvent.getTaskId());

				b.append("\n FormKey             " + ut.getCamundaFormKey());

			}

		}

		LOGGER.info(b.toString());
	}
}