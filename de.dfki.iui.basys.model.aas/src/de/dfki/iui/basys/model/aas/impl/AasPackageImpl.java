/**
 */
package de.dfki.iui.basys.model.aas.impl;

import de.dfki.iui.basys.model.aas.AasFactory;
import de.dfki.iui.basys.model.aas.AasPackage;
import de.dfki.iui.basys.model.aas.AdministrationShell;
import de.dfki.iui.basys.model.aas.InformationMapping;
import de.dfki.iui.basys.model.aas.OperationalServiceMapping;
import de.dfki.iui.basys.model.aas.ParameterMapping;
import de.dfki.iui.basys.model.aas.ServiceCall;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.service.ServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AasPackageImpl extends EPackageImpl implements AasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrationShellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalServiceMappingEClass = null;

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
	 * @see de.dfki.iui.basys.model.aas.AasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AasPackageImpl() {
		super(eNS_URI, AasFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AasPackage init() {
		if (isInited) return (AasPackage)EPackage.Registry.INSTANCE.getEPackage(AasPackage.eNS_URI);

		// Obtain or create and register package
		AasPackageImpl theAasPackage = (AasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AasPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();
		CapabilityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAasPackage.createPackageContents();

		// Initialize created meta-data
		theAasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AasPackage.eNS_URI, theAasPackage);
		return theAasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrationShell() {
		return administrationShellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrationShell_Mappings() {
		return (EReference)administrationShellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrationShell_OperationalServiceMappings() {
		return (EReference)administrationShellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrationShell_AssetId() {
		return (EAttribute)administrationShellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdministrationShell__Get() {
		return administrationShellEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationMapping() {
		return informationMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationMapping_EntityType() {
		return (EReference)informationMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationMapping_ServiceCall() {
		return (EReference)informationMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCall() {
		return serviceCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCall_ServiceInstanceId() {
		return (EAttribute)serviceCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCall_Operation() {
		return (EReference)serviceCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCall_ParameterMappings() {
		return (EReference)serviceCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterMapping() {
		return parameterMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterMapping_Parameter() {
		return (EReference)parameterMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMapping_Value() {
		return (EAttribute)parameterMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalServiceMapping() {
		return operationalServiceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationalServiceMapping_ServiceDescriptionId() {
		return (EAttribute)operationalServiceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationalServiceMapping_ServiceInstanceId() {
		return (EAttribute)operationalServiceMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AasFactory getAasFactory() {
		return (AasFactory)getEFactoryInstance();
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
		administrationShellEClass = createEClass(ADMINISTRATION_SHELL);
		createEAttribute(administrationShellEClass, ADMINISTRATION_SHELL__ASSET_ID);
		createEReference(administrationShellEClass, ADMINISTRATION_SHELL__MAPPINGS);
		createEReference(administrationShellEClass, ADMINISTRATION_SHELL__OPERATIONAL_SERVICE_MAPPINGS);
		createEOperation(administrationShellEClass, ADMINISTRATION_SHELL___GET);

		informationMappingEClass = createEClass(INFORMATION_MAPPING);
		createEReference(informationMappingEClass, INFORMATION_MAPPING__ENTITY_TYPE);
		createEReference(informationMappingEClass, INFORMATION_MAPPING__SERVICE_CALL);

		serviceCallEClass = createEClass(SERVICE_CALL);
		createEAttribute(serviceCallEClass, SERVICE_CALL__SERVICE_INSTANCE_ID);
		createEReference(serviceCallEClass, SERVICE_CALL__OPERATION);
		createEReference(serviceCallEClass, SERVICE_CALL__PARAMETER_MAPPINGS);

		parameterMappingEClass = createEClass(PARAMETER_MAPPING);
		createEReference(parameterMappingEClass, PARAMETER_MAPPING__PARAMETER);
		createEAttribute(parameterMappingEClass, PARAMETER_MAPPING__VALUE);

		operationalServiceMappingEClass = createEClass(OPERATIONAL_SERVICE_MAPPING);
		createEAttribute(operationalServiceMappingEClass, OPERATIONAL_SERVICE_MAPPING__SERVICE_DESCRIPTION_ID);
		createEAttribute(operationalServiceMappingEClass, OPERATIONAL_SERVICE_MAPPING__SERVICE_INSTANCE_ID);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		administrationShellEClass.getESuperTypes().add(theBasePackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(administrationShellEClass, AdministrationShell.class, "AdministrationShell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdministrationShell_AssetId(), theEcorePackage.getEString(), "assetId", null, 0, 1, AdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdministrationShell_Mappings(), this.getInformationMapping(), null, "mappings", null, 0, -1, AdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdministrationShell_OperationalServiceMappings(), this.getOperationalServiceMapping(), null, "operationalServiceMappings", null, 0, -1, AdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAdministrationShell__Get(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(theBasePackage.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(informationMappingEClass, InformationMapping.class, "InformationMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationMapping_EntityType(), theEcorePackage.getEClass(), null, "entityType", null, 1, 1, InformationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationMapping_ServiceCall(), this.getServiceCall(), null, "serviceCall", null, 1, 1, InformationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceCallEClass, ServiceCall.class, "ServiceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCall_ServiceInstanceId(), theEcorePackage.getEString(), "serviceInstanceId", null, 0, 1, ServiceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceCall_Operation(), theServicePackage.getOperation(), null, "operation", null, 0, 1, ServiceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceCall_ParameterMappings(), this.getParameterMapping(), null, "parameterMappings", null, 0, -1, ServiceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterMappingEClass, ParameterMapping.class, "ParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterMapping_Parameter(), theEcorePackage.getEParameter(), null, "parameter", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMapping_Value(), theEcorePackage.getEString(), "value", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalServiceMappingEClass, OperationalServiceMapping.class, "OperationalServiceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationalServiceMapping_ServiceDescriptionId(), theEcorePackage.getEString(), "serviceDescriptionId", null, 0, 1, OperationalServiceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationalServiceMapping_ServiceInstanceId(), theEcorePackage.getEString(), "serviceInstanceId", null, 0, 1, OperationalServiceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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

} //AasPackageImpl
