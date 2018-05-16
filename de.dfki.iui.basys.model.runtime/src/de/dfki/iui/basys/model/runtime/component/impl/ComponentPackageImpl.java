/**
 */
package de.dfki.iui.basys.model.runtime.component.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.runtime.communication.CommunicationPackage;

import de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ChangeModeRequest;
import de.dfki.iui.basys.model.runtime.component.CommandRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentFactory;
import de.dfki.iui.basys.model.runtime.component.ComponentInfo;
import de.dfki.iui.basys.model.runtime.component.ControlMode;
import de.dfki.iui.basys.model.runtime.component.Property;
import de.dfki.iui.basys.model.runtime.component.RequestStatus;
import de.dfki.iui.basys.model.runtime.component.State;
import de.dfki.iui.basys.model.runtime.component.StatusRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentPackage;
import de.dfki.iui.basys.model.runtime.component.ComponentRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus;
import de.dfki.iui.basys.model.runtime.component.ControlCommand;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPackageImpl extends EPackageImpl implements ComponentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeModeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlCommandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentPackageImpl() {
		super(eNS_URI, ComponentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComponentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentPackage init() {
		if (isInited) return (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

		// Obtain or create and register package
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentPackage.eNS_URI, theComponentPackage);
		return theComponentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInfo() {
		return componentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ComponentId() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ComponentName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ComponentCategory() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_InChannelName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_OutChannelName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_StatusChannelName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_CurrentState() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_CurrentMode() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_CommunicationProvider() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ConnectionString() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_HostName() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_UriSpec() {
		return (EAttribute)componentInfoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentConfiguration() {
		return componentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ComponentId() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ComponentName() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ComponentCategory() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ComponentImplementationJavaClass() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_CommunicationProviderImplementationJavaClass() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_CommunicationProviderConnectionString() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_InChannelName() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_OutChannelName() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_ExternalConnectionString() {
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentConfiguration_Properties() {
		return (EReference)componentConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentConfiguration__GetProperty__String() {
		return componentConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRequest() {
		return componentRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequest_ComponentId() {
		return (EAttribute)componentRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandRequest() {
		return commandRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandRequest_ControlCommand() {
		return (EAttribute)commandRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeModeRequest() {
		return changeModeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeModeRequest_Mode() {
		return (EAttribute)changeModeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityRequest() {
		return capabilityRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityRequest_Capability() {
		return (EReference)capabilityRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRequestStatus() {
		return componentRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequestStatus_ComponentId() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequestStatus_Status() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRequestStatus_Message() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusRequest() {
		return statusRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentCategory() {
		return componentCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlMode() {
		return controlModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlCommand() {
		return controlCommandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestStatus() {
		return requestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactory getComponentFactory() {
		return (ComponentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentInfoEClass = createEClass(COMPONENT_INFO);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__COMPONENT_ID);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__COMPONENT_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__COMPONENT_CATEGORY);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__IN_CHANNEL_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__OUT_CHANNEL_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__STATUS_CHANNEL_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__CURRENT_STATE);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__CURRENT_MODE);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__COMMUNICATION_PROVIDER);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__CONNECTION_STRING);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__HOST_NAME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__URI_SPEC);

		componentConfigurationEClass = createEClass(COMPONENT_CONFIGURATION);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_ID);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_NAME);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_CATEGORY);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__IN_CHANNEL_NAME);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__PROPERTIES);
		createEOperation(componentConfigurationEClass, COMPONENT_CONFIGURATION___GET_PROPERTY__STRING);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		componentRequestEClass = createEClass(COMPONENT_REQUEST);
		createEAttribute(componentRequestEClass, COMPONENT_REQUEST__COMPONENT_ID);

		commandRequestEClass = createEClass(COMMAND_REQUEST);
		createEAttribute(commandRequestEClass, COMMAND_REQUEST__CONTROL_COMMAND);

		changeModeRequestEClass = createEClass(CHANGE_MODE_REQUEST);
		createEAttribute(changeModeRequestEClass, CHANGE_MODE_REQUEST__MODE);

		capabilityRequestEClass = createEClass(CAPABILITY_REQUEST);
		createEReference(capabilityRequestEClass, CAPABILITY_REQUEST__CAPABILITY);

		componentRequestStatusEClass = createEClass(COMPONENT_REQUEST_STATUS);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__COMPONENT_ID);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__STATUS);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__MESSAGE);

		statusRequestEClass = createEClass(STATUS_REQUEST);

		// Create enums
		componentCategoryEEnum = createEEnum(COMPONENT_CATEGORY);
		stateEEnum = createEEnum(STATE);
		controlModeEEnum = createEEnum(CONTROL_MODE);
		controlCommandEEnum = createEEnum(CONTROL_COMMAND);
		requestStatusEEnum = createEEnum(REQUEST_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commandRequestEClass.getESuperTypes().add(this.getComponentRequest());
		changeModeRequestEClass.getESuperTypes().add(this.getComponentRequest());
		capabilityRequestEClass.getESuperTypes().add(this.getComponentRequest());
		statusRequestEClass.getESuperTypes().add(this.getComponentRequest());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentInfoEClass, ComponentInfo.class, "ComponentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentInfo_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_ComponentName(), theEcorePackage.getEString(), "componentName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_ComponentCategory(), this.getComponentCategory(), "componentCategory", "NONE", 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_InChannelName(), theEcorePackage.getEString(), "inChannelName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_OutChannelName(), theEcorePackage.getEString(), "outChannelName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_StatusChannelName(), theEcorePackage.getEString(), "statusChannelName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_CurrentState(), this.getState(), "currentState", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_CurrentMode(), this.getControlMode(), "currentMode", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_CommunicationProvider(), theEcorePackage.getEString(), "communicationProvider", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_ConnectionString(), theEcorePackage.getEString(), "connectionString", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_HostName(), theEcorePackage.getEString(), "hostName", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_UriSpec(), theEcorePackage.getEString(), "uriSpec", null, 0, 1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentConfigurationEClass, ComponentConfiguration.class, "ComponentConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentConfiguration_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_ComponentName(), theEcorePackage.getEString(), "componentName", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_ComponentCategory(), this.getComponentCategory(), "componentCategory", "NONE", 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_ComponentImplementationJavaClass(), theEcorePackage.getEString(), "componentImplementationJavaClass", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_CommunicationProviderImplementationJavaClass(), theEcorePackage.getEString(), "communicationProviderImplementationJavaClass", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_CommunicationProviderConnectionString(), theEcorePackage.getEString(), "communicationProviderConnectionString", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_InChannelName(), theEcorePackage.getEString(), "inChannelName", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_OutChannelName(), theEcorePackage.getEString(), "outChannelName", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_ExternalConnectionString(), theEcorePackage.getEString(), "externalConnectionString", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_Properties(), this.getProperty(), null, "properties", null, 0, -1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getComponentConfiguration__GetProperty__String(), this.getProperty(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequestEClass, ComponentRequest.class, "ComponentRequest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRequest_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandRequestEClass, CommandRequest.class, "CommandRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandRequest_ControlCommand(), this.getControlCommand(), "controlCommand", null, 0, 1, CommandRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeModeRequestEClass, ChangeModeRequest.class, "ChangeModeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeModeRequest_Mode(), this.getControlMode(), "mode", null, 0, 1, ChangeModeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityRequestEClass, CapabilityRequest.class, "CapabilityRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityRequest_Capability(), theEcorePackage.getEObject(), null, "capability", null, 0, 1, CapabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequestStatusEClass, ComponentRequestStatus.class, "ComponentRequestStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRequestStatus_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequestStatus_Status(), this.getRequestStatus(), "status", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequestStatus_Message(), theEcorePackage.getEString(), "message", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusRequestEClass, StatusRequest.class, "StatusRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(componentCategoryEEnum, ComponentCategory.class, "ComponentCategory");
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.NONE);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.SERVICE_COMPONENT);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.DEVICE_COMPONENT);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.MANAGEMENT_COMPONENT);

		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.UNDEFINED);
		addEEnumLiteral(stateEEnum, State.CLEARING);
		addEEnumLiteral(stateEEnum, State.STOPPED);
		addEEnumLiteral(stateEEnum, State.STARTING);
		addEEnumLiteral(stateEEnum, State.IDLE);
		addEEnumLiteral(stateEEnum, State.SUSPENDED);
		addEEnumLiteral(stateEEnum, State.EXECUTE);
		addEEnumLiteral(stateEEnum, State.STOPPING);
		addEEnumLiteral(stateEEnum, State.ABORTING);
		addEEnumLiteral(stateEEnum, State.ABORTED);
		addEEnumLiteral(stateEEnum, State.HOLDING);
		addEEnumLiteral(stateEEnum, State.HELD);
		addEEnumLiteral(stateEEnum, State.UNHOLDING);
		addEEnumLiteral(stateEEnum, State.SUSPENDING);
		addEEnumLiteral(stateEEnum, State.UNSUSPENDING);
		addEEnumLiteral(stateEEnum, State.RESETTING);
		addEEnumLiteral(stateEEnum, State.COMPLETING);
		addEEnumLiteral(stateEEnum, State.COMPLETE);

		initEEnum(controlModeEEnum, ControlMode.class, "ControlMode");
		addEEnumLiteral(controlModeEEnum, ControlMode.UNDEFINED);
		addEEnumLiteral(controlModeEEnum, ControlMode.PRODUCTION);
		addEEnumLiteral(controlModeEEnum, ControlMode.MAINTENANCE);
		addEEnumLiteral(controlModeEEnum, ControlMode.MANUAL);
		addEEnumLiteral(controlModeEEnum, ControlMode.CHANGE_OVER);
		addEEnumLiteral(controlModeEEnum, ControlMode.CLEAN);
		addEEnumLiteral(controlModeEEnum, ControlMode.SET_UP);
		addEEnumLiteral(controlModeEEnum, ControlMode.EMPTY_OUT);
		addEEnumLiteral(controlModeEEnum, ControlMode.SIMULATION);

		initEEnum(controlCommandEEnum, ControlCommand.class, "ControlCommand");
		addEEnumLiteral(controlCommandEEnum, ControlCommand.NO_COMMAND);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.RESET);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.START);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.STOP);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.HOLD);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.UNHOLD);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.SUSPEND);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.UNSUSPEND);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.ABORT);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.CLEAR);

		initEEnum(requestStatusEEnum, RequestStatus.class, "RequestStatus");
		addEEnumLiteral(requestStatusEEnum, RequestStatus.UNDEFINED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.ACCEPTED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.REJECTED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui.mmds/CoreModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCoreModelAnnotations() {
		String source = "http://de.dfki.iui.mmds/CoreModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //ComponentPackageImpl
