/**
 */
package de.dfki.iui.basys.model.runtime.component.impl;

import de.dfki.iui.basys.model.runtime.component.*;

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
			case ComponentPackage.COMPONENT_INFO: return createComponentInfo();
			case ComponentPackage.COMPONENT_CONFIGURATION: return createComponentConfiguration();
			case ComponentPackage.COMMAND_REQUEST: return createCommandRequest();
			case ComponentPackage.CHANGE_MODE_REQUEST: return createChangeModeRequest();
			case ComponentPackage.CAPABILITY_REQUEST: return createCapabilityRequest();
			case ComponentPackage.COMPONENT_REQUEST_STATUS: return createComponentRequestStatus();
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
