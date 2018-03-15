/**
 */
package de.dfki.iui.basys.model.domain.process.util;

import de.dfki.iui.basys.model.base.BObject;
import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.process.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.process.ProcessPackage
 * @generated
 */
public class ProcessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcessPackage.PROCESS_DEFINITION: {
				ProcessDefinition processDefinition = (ProcessDefinition)theEObject;
				T result = caseProcessDefinition(processDefinition);
				if (result == null) result = caseEntity(processDefinition);
				if (result == null) result = caseBObject(processDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseEntity(node);
				if (result == null) result = caseBObject(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseEntity(edge);
				if (result == null) result = caseBObject(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.FLOW_NODE: {
				FlowNode flowNode = (FlowNode)theEObject;
				T result = caseFlowNode(flowNode);
				if (result == null) result = caseNode(flowNode);
				if (result == null) result = caseEntity(flowNode);
				if (result == null) result = caseBObject(flowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_FLOW: {
				TaskFlow taskFlow = (TaskFlow)theEObject;
				T result = caseTaskFlow(taskFlow);
				if (result == null) result = caseEdge(taskFlow);
				if (result == null) result = caseEntity(taskFlow);
				if (result == null) result = caseBObject(taskFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_DEPENDENCY: {
				TaskDependency taskDependency = (TaskDependency)theEObject;
				T result = caseTaskDependency(taskDependency);
				if (result == null) result = caseEdge(taskDependency);
				if (result == null) result = caseEntity(taskDependency);
				if (result == null) result = caseBObject(taskDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.GATEWAY: {
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = caseFlowNode(gateway);
				if (result == null) result = caseNode(gateway);
				if (result == null) result = caseEntity(gateway);
				if (result == null) result = caseBObject(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseFlowNode(task);
				if (result == null) result = caseNode(task);
				if (result == null) result = caseEntity(task);
				if (result == null) result = caseBObject(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = caseEdge(dataFlow);
				if (result == null) result = caseEntity(dataFlow);
				if (result == null) result = caseBObject(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseNode(data);
				if (result == null) result = caseEntity(data);
				if (result == null) result = caseBObject(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DATA_MAPPING: {
				DataMapping dataMapping = (DataMapping)theEObject;
				T result = caseDataMapping(dataMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DATA_TRANSFORMATION: {
				DataTransformation dataTransformation = (DataTransformation)theEObject;
				T result = caseDataTransformation(dataTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_STATE: {
				TaskState taskState = (TaskState)theEObject;
				T result = caseTaskState(taskState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_INACTIVE: {
				TaskInactive taskInactive = (TaskInactive)theEObject;
				T result = caseTaskInactive(taskInactive);
				if (result == null) result = caseTaskState(taskInactive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_ACTIVE: {
				TaskActive taskActive = (TaskActive)theEObject;
				T result = caseTaskActive(taskActive);
				if (result == null) result = caseTaskState(taskActive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_PAUSED: {
				TaskPaused taskPaused = (TaskPaused)theEObject;
				T result = caseTaskPaused(taskPaused);
				if (result == null) result = caseTaskActive(taskPaused);
				if (result == null) result = caseTaskState(taskPaused);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_EXECUTING: {
				TaskExecuting taskExecuting = (TaskExecuting)theEObject;
				T result = caseTaskExecuting(taskExecuting);
				if (result == null) result = caseTaskActive(taskExecuting);
				if (result == null) result = caseTaskState(taskExecuting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_FINISHED: {
				TaskFinished taskFinished = (TaskFinished)theEObject;
				T result = caseTaskFinished(taskFinished);
				if (result == null) result = caseTaskState(taskFinished);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_SUCCESSFUL: {
				TaskSuccessful taskSuccessful = (TaskSuccessful)theEObject;
				T result = caseTaskSuccessful(taskSuccessful);
				if (result == null) result = caseTaskFinished(taskSuccessful);
				if (result == null) result = caseTaskState(taskSuccessful);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_FAILED: {
				TaskFailed taskFailed = (TaskFailed)theEObject;
				T result = caseTaskFailed(taskFailed);
				if (result == null) result = caseTaskFinished(taskFailed);
				if (result == null) result = caseTaskState(taskFailed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASK_CANCELLED: {
				TaskCancelled taskCancelled = (TaskCancelled)theEObject;
				T result = caseTaskCancelled(taskCancelled);
				if (result == null) result = caseTaskFinished(taskCancelled);
				if (result == null) result = caseTaskState(taskCancelled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.USED_MATERIAL: {
				UsedMaterial usedMaterial = (UsedMaterial)theEObject;
				T result = caseUsedMaterial(usedMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessDefinition(ProcessDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskFlow(TaskFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskDependency(TaskDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMapping(DataMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTransformation(DataTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskState(TaskState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Inactive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Inactive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInactive(TaskInactive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Active</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Active</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskActive(TaskActive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Paused</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Paused</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskPaused(TaskPaused object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Executing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Executing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskExecuting(TaskExecuting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Finished</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Finished</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskFinished(TaskFinished object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Successful</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Successful</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskSuccessful(TaskSuccessful object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Failed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Failed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskFailed(TaskFailed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Cancelled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Cancelled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskCancelled(TaskCancelled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Used Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Used Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsedMaterial(UsedMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProcessSwitch
