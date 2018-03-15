/**
 */
package de.dfki.iui.basys.model.domain.process.impl;

import de.dfki.iui.basys.model.domain.process.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessFactoryImpl extends EFactoryImpl implements ProcessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessFactory init() {
		try {
			ProcessFactory theProcessFactory = (ProcessFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessPackage.eNS_URI);
			if (theProcessFactory != null) {
				return theProcessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcessPackage.PROCESS_DEFINITION: return createProcessDefinition();
			case ProcessPackage.TASK_FLOW: return createTaskFlow();
			case ProcessPackage.TASK_DEPENDENCY: return createTaskDependency();
			case ProcessPackage.GATEWAY: return createGateway();
			case ProcessPackage.TASK: return createTask();
			case ProcessPackage.DATA_FLOW: return createDataFlow();
			case ProcessPackage.DATA: return createData();
			case ProcessPackage.DATA_MAPPING: return createDataMapping();
			case ProcessPackage.DATA_TRANSFORMATION: return createDataTransformation();
			case ProcessPackage.TASK_INACTIVE: return createTaskInactive();
			case ProcessPackage.TASK_ACTIVE: return createTaskActive();
			case ProcessPackage.TASK_PAUSED: return createTaskPaused();
			case ProcessPackage.TASK_EXECUTING: return createTaskExecuting();
			case ProcessPackage.TASK_FINISHED: return createTaskFinished();
			case ProcessPackage.TASK_SUCCESSFUL: return createTaskSuccessful();
			case ProcessPackage.TASK_FAILED: return createTaskFailed();
			case ProcessPackage.TASK_CANCELLED: return createTaskCancelled();
			case ProcessPackage.USED_MATERIAL: return createUsedMaterial();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessPackage.GATEWAY_TYPE_ENUM:
				return createGatewayTypeEnumFromString(eDataType, initialValue);
			case ProcessPackage.TASK_STATE_ENUM:
				return createTaskStateEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessPackage.GATEWAY_TYPE_ENUM:
				return convertGatewayTypeEnumToString(eDataType, instanceValue);
			case ProcessPackage.TASK_STATE_ENUM:
				return convertTaskStateEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinition createProcessDefinition() {
		ProcessDefinitionImpl processDefinition = new ProcessDefinitionImpl();
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFlow createTaskFlow() {
		TaskFlowImpl taskFlow = new TaskFlowImpl();
		return taskFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDependency createTaskDependency() {
		TaskDependencyImpl taskDependency = new TaskDependencyImpl();
		return taskDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMapping createDataMapping() {
		DataMappingImpl dataMapping = new DataMappingImpl();
		return dataMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransformation createDataTransformation() {
		DataTransformationImpl dataTransformation = new DataTransformationImpl();
		return dataTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInactive createTaskInactive() {
		TaskInactiveImpl taskInactive = new TaskInactiveImpl();
		return taskInactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskActive createTaskActive() {
		TaskActiveImpl taskActive = new TaskActiveImpl();
		return taskActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPaused createTaskPaused() {
		TaskPausedImpl taskPaused = new TaskPausedImpl();
		return taskPaused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExecuting createTaskExecuting() {
		TaskExecutingImpl taskExecuting = new TaskExecutingImpl();
		return taskExecuting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFinished createTaskFinished() {
		TaskFinishedImpl taskFinished = new TaskFinishedImpl();
		return taskFinished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSuccessful createTaskSuccessful() {
		TaskSuccessfulImpl taskSuccessful = new TaskSuccessfulImpl();
		return taskSuccessful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFailed createTaskFailed() {
		TaskFailedImpl taskFailed = new TaskFailedImpl();
		return taskFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCancelled createTaskCancelled() {
		TaskCancelledImpl taskCancelled = new TaskCancelledImpl();
		return taskCancelled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedMaterial createUsedMaterial() {
		UsedMaterialImpl usedMaterial = new UsedMaterialImpl();
		return usedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayTypeEnum createGatewayTypeEnumFromString(EDataType eDataType, String initialValue) {
		GatewayTypeEnum result = GatewayTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum createTaskStateEnumFromString(EDataType eDataType, String initialValue) {
		TaskStateEnum result = TaskStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackage getProcessPackage() {
		return (ProcessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessPackage getPackage() {
		return ProcessPackage.eINSTANCE;
	}

} //ProcessFactoryImpl
