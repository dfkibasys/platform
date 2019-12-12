/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import de.dfki.cos.basys.platform.model.base.BasePackage;

import de.dfki.cos.basys.platform.model.data.DataPackage;

import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;

import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;

import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;

import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;

import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;

import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;

import de.dfki.cos.basys.platform.model.pattern.PatternPackage;

import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage;

import de.dfki.cos.basys.platform.model.runtime.communication.impl.CommunicationPackageImpl;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ExecutionState;
import de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel;
import de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest;
import de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.StatusRequest;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;
import de.dfki.cos.basys.platform.model.runtime.component.VariableType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	private EClass componentRequestCollectionEClass = null;

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
	private EClass componentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occupationLevelRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionModeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionCommandRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationModeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionCommandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum occupationLevelEEnum = null;

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
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#eNS_URI
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
		Object registeredComponentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentPackageImpl theComponentPackage = registeredComponentPackage instanceof ComponentPackageImpl ? (ComponentPackageImpl)registeredComponentPackage : new ComponentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		ProductdefinitionPackage.eINSTANCE.eClass();
		TopologyPackage.eINSTANCE.eClass();
		CapabilityPackage.eINSTANCE.eClass();
		MaterialPackage.eINSTANCE.eClass();
		ResourcetypePackage.eINSTANCE.eClass();
		ResourceinstancePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);

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
	@Override
	public EClass getComponentRequestCollection() {
		return componentRequestCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentRequestCollection_ComponentRequests() {
		return (EReference)componentRequestCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentRequest() {
		return componentRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRequest_ComponentId() {
		return (EAttribute)componentRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRequest_CorrelationId() {
		return (EAttribute)componentRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRequest_OccupierId() {
		return (EAttribute)componentRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentRequestStatus() {
		return componentRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRequestStatus_ComponentId() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRequestStatus_Status() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRequestStatus_Message() {
		return (EAttribute)componentRequestStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusRequest() {
		return statusRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentResponse() {
		return componentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentResponse_ComponentId() {
		return (EAttribute)componentResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentResponse_Status() {
		return (EAttribute)componentResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentResponse_StatusCode() {
		return (EAttribute)componentResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentResponse_Message() {
		return (EAttribute)componentResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentResponse_Request() {
		return (EReference)componentResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentResponse_OutputParameters() {
		return (EReference)componentResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOccupationLevelRequest() {
		return occupationLevelRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccupationLevelRequest_OccupationLevel() {
		return (EAttribute)occupationLevelRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionModeRequest() {
		return executionModeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionModeRequest_ExecutionMode() {
		return (EAttribute)executionModeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionCommandRequest() {
		return executionCommandRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionCommandRequest_ExecutionCommand() {
		return (EAttribute)executionCommandRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationModeRequest() {
		return operationModeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationModeRequest_OperationMode() {
		return (EAttribute)operationModeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationModeRequest_InputParameters() {
		return (EReference)operationModeRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationModeRequest_OutputParameters() {
		return (EAttribute)operationModeRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRequestStatus() {
		return requestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResponseStatus() {
		return responseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableType() {
		return variableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExecutionState() {
		return executionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExecutionMode() {
		return executionModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExecutionCommand() {
		return executionCommandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOccupationLevel() {
		return occupationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		componentResponseEClass = createEClass(COMPONENT_RESPONSE);
		createEAttribute(componentResponseEClass, COMPONENT_RESPONSE__COMPONENT_ID);
		createEAttribute(componentResponseEClass, COMPONENT_RESPONSE__STATUS);
		createEAttribute(componentResponseEClass, COMPONENT_RESPONSE__STATUS_CODE);
		createEAttribute(componentResponseEClass, COMPONENT_RESPONSE__MESSAGE);
		createEReference(componentResponseEClass, COMPONENT_RESPONSE__REQUEST);
		createEReference(componentResponseEClass, COMPONENT_RESPONSE__OUTPUT_PARAMETERS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		componentRequestCollectionEClass = createEClass(COMPONENT_REQUEST_COLLECTION);
		createEReference(componentRequestCollectionEClass, COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS);

		componentRequestEClass = createEClass(COMPONENT_REQUEST);
		createEAttribute(componentRequestEClass, COMPONENT_REQUEST__COMPONENT_ID);
		createEAttribute(componentRequestEClass, COMPONENT_REQUEST__CORRELATION_ID);
		createEAttribute(componentRequestEClass, COMPONENT_REQUEST__OCCUPIER_ID);

		componentRequestStatusEClass = createEClass(COMPONENT_REQUEST_STATUS);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__COMPONENT_ID);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__STATUS);
		createEAttribute(componentRequestStatusEClass, COMPONENT_REQUEST_STATUS__MESSAGE);

		statusRequestEClass = createEClass(STATUS_REQUEST);

		occupationLevelRequestEClass = createEClass(OCCUPATION_LEVEL_REQUEST);
		createEAttribute(occupationLevelRequestEClass, OCCUPATION_LEVEL_REQUEST__OCCUPATION_LEVEL);

		executionModeRequestEClass = createEClass(EXECUTION_MODE_REQUEST);
		createEAttribute(executionModeRequestEClass, EXECUTION_MODE_REQUEST__EXECUTION_MODE);

		executionCommandRequestEClass = createEClass(EXECUTION_COMMAND_REQUEST);
		createEAttribute(executionCommandRequestEClass, EXECUTION_COMMAND_REQUEST__EXECUTION_COMMAND);

		operationModeRequestEClass = createEClass(OPERATION_MODE_REQUEST);
		createEAttribute(operationModeRequestEClass, OPERATION_MODE_REQUEST__OPERATION_MODE);
		createEReference(operationModeRequestEClass, OPERATION_MODE_REQUEST__INPUT_PARAMETERS);
		createEAttribute(operationModeRequestEClass, OPERATION_MODE_REQUEST__OUTPUT_PARAMETERS);

		// Create enums
		requestStatusEEnum = createEEnum(REQUEST_STATUS);
		responseStatusEEnum = createEEnum(RESPONSE_STATUS);
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);
		executionStateEEnum = createEEnum(EXECUTION_STATE);
		executionModeEEnum = createEEnum(EXECUTION_MODE);
		executionCommandEEnum = createEEnum(EXECUTION_COMMAND);
		occupationLevelEEnum = createEEnum(OCCUPATION_LEVEL);
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
		statusRequestEClass.getESuperTypes().add(this.getComponentRequest());
		occupationLevelRequestEClass.getESuperTypes().add(this.getComponentRequest());
		executionModeRequestEClass.getESuperTypes().add(this.getComponentRequest());
		executionCommandRequestEClass.getESuperTypes().add(this.getComponentRequest());
		operationModeRequestEClass.getESuperTypes().add(this.getComponentRequest());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentResponseEClass, ComponentResponse.class, "ComponentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentResponse_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentResponse_Status(), this.getResponseStatus(), "status", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentResponse_StatusCode(), theEcorePackage.getEInt(), "statusCode", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentResponse_Message(), theEcorePackage.getEString(), "message", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentResponse_Request(), this.getComponentRequest(), null, "request", null, 0, 1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentResponse_OutputParameters(), this.getVariable(), null, "outputParameters", null, 0, -1, ComponentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getVariableType(), "type", "", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequestCollectionEClass, ComponentRequestCollection.class, "ComponentRequestCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRequestCollection_ComponentRequests(), this.getComponentRequest(), null, "componentRequests", null, 0, -1, ComponentRequestCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequestEClass, ComponentRequest.class, "ComponentRequest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRequest_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequest_CorrelationId(), theEcorePackage.getEString(), "correlationId", null, 0, 1, ComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequest_OccupierId(), theEcorePackage.getEString(), "occupierId", null, 0, 1, ComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequestStatusEClass, ComponentRequestStatus.class, "ComponentRequestStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRequestStatus_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequestStatus_Status(), this.getRequestStatus(), "status", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequestStatus_Message(), theEcorePackage.getEString(), "message", null, 0, 1, ComponentRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusRequestEClass, StatusRequest.class, "StatusRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(occupationLevelRequestEClass, OccupationLevelRequest.class, "OccupationLevelRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccupationLevelRequest_OccupationLevel(), this.getOccupationLevel(), "occupationLevel", null, 0, 1, OccupationLevelRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionModeRequestEClass, ExecutionModeRequest.class, "ExecutionModeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionModeRequest_ExecutionMode(), this.getExecutionMode(), "executionMode", null, 0, 1, ExecutionModeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionCommandRequestEClass, ExecutionCommandRequest.class, "ExecutionCommandRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionCommandRequest_ExecutionCommand(), this.getExecutionCommand(), "executionCommand", null, 0, 1, ExecutionCommandRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationModeRequestEClass, OperationModeRequest.class, "OperationModeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationModeRequest_OperationMode(), theEcorePackage.getEString(), "operationMode", null, 0, 1, OperationModeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationModeRequest_InputParameters(), this.getVariable(), null, "inputParameters", null, 0, -1, OperationModeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationModeRequest_OutputParameters(), theEcorePackage.getEString(), "outputParameters", null, 0, -1, OperationModeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(requestStatusEEnum, RequestStatus.class, "RequestStatus");
		addEEnumLiteral(requestStatusEEnum, RequestStatus.UNDEFINED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.ACCEPTED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.REJECTED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.NOOP);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.QUEUED);
		addEEnumLiteral(requestStatusEEnum, RequestStatus.DONE);

		initEEnum(responseStatusEEnum, ResponseStatus.class, "ResponseStatus");
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.UNDEFINED);
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.OK);
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.NOT_OK);

		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.NULL);
		addEEnumLiteral(variableTypeEEnum, VariableType.BOOLEAN);
		addEEnumLiteral(variableTypeEEnum, VariableType.INTEGER);
		addEEnumLiteral(variableTypeEEnum, VariableType.STRING);
		addEEnumLiteral(variableTypeEEnum, VariableType.DOUBLE);
		addEEnumLiteral(variableTypeEEnum, VariableType.LONG);
		addEEnumLiteral(variableTypeEEnum, VariableType.DATE);

		initEEnum(executionStateEEnum, ExecutionState.class, "ExecutionState");
		addEEnumLiteral(executionStateEEnum, ExecutionState.UNDEFINED);
		addEEnumLiteral(executionStateEEnum, ExecutionState.CLEARING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.STOPPED);
		addEEnumLiteral(executionStateEEnum, ExecutionState.STARTING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.IDLE);
		addEEnumLiteral(executionStateEEnum, ExecutionState.SUSPENDED);
		addEEnumLiteral(executionStateEEnum, ExecutionState.EXECUTE);
		addEEnumLiteral(executionStateEEnum, ExecutionState.STOPPING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.ABORTING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.ABORTED);
		addEEnumLiteral(executionStateEEnum, ExecutionState.HOLDING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.HELD);
		addEEnumLiteral(executionStateEEnum, ExecutionState.UNHOLDING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.SUSPENDING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.UNSUSPENDING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.RESETTING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.COMPLETING);
		addEEnumLiteral(executionStateEEnum, ExecutionState.COMPLETE);

		initEEnum(executionModeEEnum, ExecutionMode.class, "ExecutionMode");
		addEEnumLiteral(executionModeEEnum, ExecutionMode.PRODUCTION);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.MAINTENANCE);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.MANUAL);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.CHANGE_OVER);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.CLEAN);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.SET_UP);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.EMPTY_OUT);
		addEEnumLiteral(executionModeEEnum, ExecutionMode.SIMULATION);

		initEEnum(executionCommandEEnum, ExecutionCommand.class, "ExecutionCommand");
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.RESET);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.START);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.STOP);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.HOLD);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.UNHOLD);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.SUSPEND);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.UNSUSPEND);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.ABORT);
		addEEnumLiteral(executionCommandEEnum, ExecutionCommand.CLEAR);

		initEEnum(occupationLevelEEnum, OccupationLevel.class, "OccupationLevel");
		addEEnumLiteral(occupationLevelEEnum, OccupationLevel.FREE);
		addEEnumLiteral(occupationLevelEEnum, OccupationLevel.OCCUPIED);
		addEEnumLiteral(occupationLevelEEnum, OccupationLevel.PRIORITY);
		addEEnumLiteral(occupationLevelEEnum, OccupationLevel.LOCAL);

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
