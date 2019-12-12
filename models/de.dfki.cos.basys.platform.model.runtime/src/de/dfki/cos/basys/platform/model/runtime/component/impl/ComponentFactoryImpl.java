/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import de.dfki.cos.basys.platform.model.runtime.component.*;

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
public class ComponentFactoryImpl extends EFactoryImpl implements ComponentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentFactory init() {
		try {
			ComponentFactory theComponentFactory = (ComponentFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentPackage.eNS_URI);
			if (theComponentFactory != null) {
				return theComponentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactoryImpl() {
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
			case ComponentPackage.COMPONENT_RESPONSE: return createComponentResponse();
			case ComponentPackage.VARIABLE: return createVariable();
			case ComponentPackage.COMPONENT_REQUEST_COLLECTION: return createComponentRequestCollection();
			case ComponentPackage.COMPONENT_REQUEST_STATUS: return createComponentRequestStatus();
			case ComponentPackage.STATUS_REQUEST: return createStatusRequest();
			case ComponentPackage.OCCUPATION_LEVEL_REQUEST: return createOccupationLevelRequest();
			case ComponentPackage.EXECUTION_MODE_REQUEST: return createExecutionModeRequest();
			case ComponentPackage.EXECUTION_COMMAND_REQUEST: return createExecutionCommandRequest();
			case ComponentPackage.OPERATION_MODE_REQUEST: return createOperationModeRequest();
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
			case ComponentPackage.REQUEST_STATUS:
				return createRequestStatusFromString(eDataType, initialValue);
			case ComponentPackage.RESPONSE_STATUS:
				return createResponseStatusFromString(eDataType, initialValue);
			case ComponentPackage.VARIABLE_TYPE:
				return createVariableTypeFromString(eDataType, initialValue);
			case ComponentPackage.EXECUTION_STATE:
				return createExecutionStateFromString(eDataType, initialValue);
			case ComponentPackage.EXECUTION_MODE:
				return createExecutionModeFromString(eDataType, initialValue);
			case ComponentPackage.EXECUTION_COMMAND:
				return createExecutionCommandFromString(eDataType, initialValue);
			case ComponentPackage.OCCUPATION_LEVEL:
				return createOccupationLevelFromString(eDataType, initialValue);
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
			case ComponentPackage.REQUEST_STATUS:
				return convertRequestStatusToString(eDataType, instanceValue);
			case ComponentPackage.RESPONSE_STATUS:
				return convertResponseStatusToString(eDataType, instanceValue);
			case ComponentPackage.VARIABLE_TYPE:
				return convertVariableTypeToString(eDataType, instanceValue);
			case ComponentPackage.EXECUTION_STATE:
				return convertExecutionStateToString(eDataType, instanceValue);
			case ComponentPackage.EXECUTION_MODE:
				return convertExecutionModeToString(eDataType, instanceValue);
			case ComponentPackage.EXECUTION_COMMAND:
				return convertExecutionCommandToString(eDataType, instanceValue);
			case ComponentPackage.OCCUPATION_LEVEL:
				return convertOccupationLevelToString(eDataType, instanceValue);
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
	public ComponentRequestCollection createComponentRequestCollection() {
		ComponentRequestCollectionImpl componentRequestCollection = new ComponentRequestCollectionImpl();
		return componentRequestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRequestStatus createComponentRequestStatus() {
		ComponentRequestStatusImpl componentRequestStatus = new ComponentRequestStatusImpl();
		return componentRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusRequest createStatusRequest() {
		StatusRequestImpl statusRequest = new StatusRequestImpl();
		return statusRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentResponse createComponentResponse() {
		ComponentResponseImpl componentResponse = new ComponentResponseImpl();
		return componentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccupationLevelRequest createOccupationLevelRequest() {
		OccupationLevelRequestImpl occupationLevelRequest = new OccupationLevelRequestImpl();
		return occupationLevelRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionModeRequest createExecutionModeRequest() {
		ExecutionModeRequestImpl executionModeRequest = new ExecutionModeRequestImpl();
		return executionModeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionCommandRequest createExecutionCommandRequest() {
		ExecutionCommandRequestImpl executionCommandRequest = new ExecutionCommandRequestImpl();
		return executionCommandRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationModeRequest createOperationModeRequest() {
		OperationModeRequestImpl operationModeRequest = new OperationModeRequestImpl();
		return operationModeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatus createRequestStatusFromString(EDataType eDataType, String initialValue) {
		RequestStatus result = RequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseStatus createResponseStatusFromString(EDataType eDataType, String initialValue) {
		ResponseStatus result = ResponseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue) {
		VariableType result = VariableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionState createExecutionStateFromString(EDataType eDataType, String initialValue) {
		ExecutionState result = ExecutionState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionMode createExecutionModeFromString(EDataType eDataType, String initialValue) {
		ExecutionMode result = ExecutionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionCommand createExecutionCommandFromString(EDataType eDataType, String initialValue) {
		ExecutionCommand result = ExecutionCommand.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionCommandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupationLevel createOccupationLevelFromString(EDataType eDataType, String initialValue) {
		OccupationLevel result = OccupationLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOccupationLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPackage getComponentPackage() {
		return (ComponentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentPackage getPackage() {
		return ComponentPackage.eINSTANCE;
	}

} //ComponentFactoryImpl
