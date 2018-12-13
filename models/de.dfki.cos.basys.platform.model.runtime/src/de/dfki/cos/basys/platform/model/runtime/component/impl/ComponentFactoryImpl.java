/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.cos.basys.platform.model.runtime.component.*;

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
			case ComponentPackage.COMPONENT_INFO: return createComponentInfo();
			case ComponentPackage.COMPONENT_CONFIGURATION: return createComponentConfiguration();
			case ComponentPackage.PROPERTY: return createProperty();
			case ComponentPackage.COMMAND_REQUEST: return createCommandRequest();
			case ComponentPackage.CHANGE_MODE_REQUEST: return createChangeModeRequest();
			case ComponentPackage.CAPABILITY_REQUEST: return createCapabilityRequest();
			case ComponentPackage.COMPONENT_REQUEST_STATUS: return createComponentRequestStatus();
			case ComponentPackage.STATUS_REQUEST: return createStatusRequest();
			case ComponentPackage.COMPONENT_RESPONSE: return createComponentResponse();
			case ComponentPackage.COMPONENT_REQUEST_COLLECTION: return createComponentRequestCollection();
			case ComponentPackage.VARIABLE: return createVariable();
			case ComponentPackage.SIMULATION_CONFIGURATION: return createSimulationConfiguration();
			case ComponentPackage.PROCESS_REQUEST: return createProcessRequest();
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
			case ComponentPackage.COMPONENT_CATEGORY:
				return createComponentCategoryFromString(eDataType, initialValue);
			case ComponentPackage.STATE:
				return createStateFromString(eDataType, initialValue);
			case ComponentPackage.CONTROL_MODE:
				return createControlModeFromString(eDataType, initialValue);
			case ComponentPackage.CONTROL_COMMAND:
				return createControlCommandFromString(eDataType, initialValue);
			case ComponentPackage.REQUEST_STATUS:
				return createRequestStatusFromString(eDataType, initialValue);
			case ComponentPackage.RESPONSE_STATUS:
				return createResponseStatusFromString(eDataType, initialValue);
			case ComponentPackage.VARIABLE_TYPE:
				return createVariableTypeFromString(eDataType, initialValue);
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
			case ComponentPackage.COMPONENT_CATEGORY:
				return convertComponentCategoryToString(eDataType, instanceValue);
			case ComponentPackage.STATE:
				return convertStateToString(eDataType, instanceValue);
			case ComponentPackage.CONTROL_MODE:
				return convertControlModeToString(eDataType, instanceValue);
			case ComponentPackage.CONTROL_COMMAND:
				return convertControlCommandToString(eDataType, instanceValue);
			case ComponentPackage.REQUEST_STATUS:
				return convertRequestStatusToString(eDataType, instanceValue);
			case ComponentPackage.RESPONSE_STATUS:
				return convertResponseStatusToString(eDataType, instanceValue);
			case ComponentPackage.VARIABLE_TYPE:
				return convertVariableTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInfo createComponentInfo() {
		ComponentInfoImpl componentInfo = new ComponentInfoImpl();
		return componentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentConfiguration createComponentConfiguration() {
		ComponentConfigurationImpl componentConfiguration = new ComponentConfigurationImpl();
		return componentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandRequest createCommandRequest() {
		CommandRequestImpl commandRequest = new CommandRequestImpl();
		return commandRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeModeRequest createChangeModeRequest() {
		ChangeModeRequestImpl changeModeRequest = new ChangeModeRequestImpl();
		return changeModeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRequest createCapabilityRequest() {
		CapabilityRequestImpl capabilityRequest = new CapabilityRequestImpl();
		return capabilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRequestStatus createComponentRequestStatus() {
		ComponentRequestStatusImpl componentRequestStatus = new ComponentRequestStatusImpl();
		return componentRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusRequest createStatusRequest() {
		StatusRequestImpl statusRequest = new StatusRequestImpl();
		return statusRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentResponse createComponentResponse() {
		ComponentResponseImpl componentResponse = new ComponentResponseImpl();
		return componentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRequestCollection createComponentRequestCollection() {
		ComponentRequestCollectionImpl componentRequestCollection = new ComponentRequestCollectionImpl();
		return componentRequestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationConfiguration createSimulationConfiguration() {
		SimulationConfigurationImpl simulationConfiguration = new SimulationConfigurationImpl();
		return simulationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest createProcessRequest() {
		ProcessRequestImpl processRequest = new ProcessRequestImpl();
		return processRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentCategory createComponentCategoryFromString(EDataType eDataType, String initialValue) {
		ComponentCategory result = ComponentCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createStateFromString(EDataType eDataType, String initialValue) {
		State result = State.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlMode createControlModeFromString(EDataType eDataType, String initialValue) {
		ControlMode result = ControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCommand createControlCommandFromString(EDataType eDataType, String initialValue) {
		ControlCommand result = ControlCommand.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlCommandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
