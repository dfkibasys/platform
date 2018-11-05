/**
 */
package de.dfki.iui.basys.model.domain.processdefinition.util;

import de.dfki.iui.basys.model.domain.processdefinition.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage
 * @generated
 */
public class ProcessdefinitionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProcessdefinitionValidator INSTANCE = new ProcessdefinitionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.dfki.iui.basys.model.domain.processdefinition";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessdefinitionValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProcessdefinitionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ProcessdefinitionPackage.PROCESS_DEFINITION:
				return validateProcessDefinition((ProcessDefinition)value, diagnostics, context);
			case ProcessdefinitionPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case ProcessdefinitionPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case ProcessdefinitionPackage.FLOW_NODE:
				return validateFlowNode((FlowNode)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_FLOW:
				return validateTaskFlow((TaskFlow)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_DEPENDENCY:
				return validateTaskDependency((TaskDependency)value, diagnostics, context);
			case ProcessdefinitionPackage.GATEWAY:
				return validateGateway((Gateway)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case ProcessdefinitionPackage.DATA_FLOW:
				return validateDataFlow((DataFlow)value, diagnostics, context);
			case ProcessdefinitionPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case ProcessdefinitionPackage.DATA_MAPPING:
				return validateDataMapping((DataMapping)value, diagnostics, context);
			case ProcessdefinitionPackage.DATA_TRANSFORMATION:
				return validateDataTransformation((DataTransformation)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_STATE:
				return validateTaskState((TaskState)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_INACTIVE:
				return validateTaskInactive((TaskInactive)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_ACTIVE:
				return validateTaskActive((TaskActive)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_PAUSED:
				return validateTaskPaused((TaskPaused)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_EXECUTING:
				return validateTaskExecuting((TaskExecuting)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_FINISHED:
				return validateTaskFinished((TaskFinished)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_SUCCESSFUL:
				return validateTaskSuccessful((TaskSuccessful)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_FAILED:
				return validateTaskFailed((TaskFailed)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_CANCELLED:
				return validateTaskCancelled((TaskCancelled)value, diagnostics, context);
			case ProcessdefinitionPackage.USED_MATERIAL:
				return validateUsedMaterial((UsedMaterial)value, diagnostics, context);
			case ProcessdefinitionPackage.GATEWAY_TYPE_ENUM:
				return validateGatewayTypeEnum((GatewayTypeEnum)value, diagnostics, context);
			case ProcessdefinitionPackage.TASK_STATE_ENUM:
				return validateTaskStateEnum((TaskStateEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessDefinition(ProcessDefinition processDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowNode(FlowNode flowNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskFlow(TaskFlow taskFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(taskFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(taskFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(taskFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(taskFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(taskFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(taskFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(taskFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(taskFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(taskFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaskFlow_typeCheck(taskFlow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeCheck constraint of '<em>Task Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK_FLOW__TYPE_CHECK__EEXPRESSION = "self.sourceRef.oclIsKindOf(FlowNode) and self.targetRef.oclIsKindOf(FlowNode)";

	/**
	 * Validates the typeCheck constraint of '<em>Task Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskFlow_typeCheck(TaskFlow taskFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProcessdefinitionPackage.Literals.TASK_FLOW,
				 taskFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "typeCheck",
				 TASK_FLOW__TYPE_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskDependency(TaskDependency taskDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(taskDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(taskDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(taskDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(taskDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(taskDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(taskDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(taskDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(taskDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(taskDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaskDependency_typeCheck(taskDependency, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeCheck constraint of '<em>Task Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK_DEPENDENCY__TYPE_CHECK__EEXPRESSION = "self.sourceRef.oclIsKindOf(Task) and self.targetRef.oclIsKindOf(Task)";

	/**
	 * Validates the typeCheck constraint of '<em>Task Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskDependency_typeCheck(TaskDependency taskDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProcessdefinitionPackage.Literals.TASK_DEPENDENCY,
				 taskDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "typeCheck",
				 TASK_DEPENDENCY__TYPE_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlow(DataFlow dataFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataFlow_typeCheck(dataFlow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeCheck constraint of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_FLOW__TYPE_CHECK__EEXPRESSION = "self.sourceRef.oclIsKindOf(Data) and self.targetRef.oclIsKindOf(Data)";

	/**
	 * Validates the typeCheck constraint of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlow_typeCheck(DataFlow dataFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProcessdefinitionPackage.Literals.DATA_FLOW,
				 dataFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "typeCheck",
				 DATA_FLOW__TYPE_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMapping(DataMapping dataMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTransformation(DataTransformation dataTransformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTransformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskState(TaskState taskState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskInactive(TaskInactive taskInactive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskInactive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskActive(TaskActive taskActive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskActive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskPaused(TaskPaused taskPaused, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskPaused, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskExecuting(TaskExecuting taskExecuting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskExecuting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskFinished(TaskFinished taskFinished, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskFinished, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskSuccessful(TaskSuccessful taskSuccessful, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskSuccessful, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskFailed(TaskFailed taskFailed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskFailed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskCancelled(TaskCancelled taskCancelled, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskCancelled, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsedMaterial(UsedMaterial usedMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usedMaterial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGatewayTypeEnum(GatewayTypeEnum gatewayTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStateEnum(TaskStateEnum taskStateEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProcessdefinitionValidator
