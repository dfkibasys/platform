/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.data.DataPackage;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;

import de.dfki.iui.basys.model.domain.capability.impl.CapabilityPackageImpl;

import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl;

import de.dfki.iui.basys.model.domain.material.MaterialPackage;

import de.dfki.iui.basys.model.domain.material.impl.MaterialPackageImpl;

import de.dfki.iui.basys.model.domain.order.OrderPackage;

import de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl;
import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.iui.basys.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl;
import de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage;

import de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl;
import de.dfki.iui.basys.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.iui.basys.model.domain.productdefinition.impl.ProductdefinitionPackageImpl;
import de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage;

import de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.GeneralCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.LogisticsCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ManufacturingCapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstance;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstanceFactory;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;

import de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.iui.basys.model.domain.resourcetype.impl.ResourcetypePackageImpl;
import de.dfki.iui.basys.model.domain.staff.StaffPackage;

import de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl;

import de.dfki.iui.basys.model.domain.topology.TopologyPackage;

import de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl;

import de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage;

import de.dfki.iui.basys.model.domain.workerguidance.impl.WorkerguidancePackageImpl;

import de.dfki.iui.basys.model.domain.workforce.WorkforcePackage;

import de.dfki.iui.basys.model.domain.workforce.impl.WorkforcePackageImpl;

import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;

import de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl;

import de.dfki.iui.basys.model.pattern.PatternPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
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
public class ResourceinstancePackageImpl extends EPackageImpl implements ResourceinstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInstanceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturingCapabilityVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticsCapabilityVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalCapabilityVariantEClass = null;

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
	 * @see de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourceinstancePackageImpl() {
		super(eNS_URI, ResourceinstanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourceinstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourceinstancePackage init() {
		if (isInited) return (ResourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI);

		// Obtain or create and register package
		ResourceinstancePackageImpl theResourceinstancePackage = (ResourceinstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourceinstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourceinstancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		ProductdefinitionPackageImpl theProductdefinitionPackage = (ProductdefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI) instanceof ProductdefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI) : ProductdefinitionPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) : WorkplanPackage.eINSTANCE);
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) : LinebalancingPackage.eINSTANCE);
		CapabilityPackageImpl theCapabilityPackage = (CapabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) instanceof CapabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) : CapabilityPackage.eINSTANCE);
		ProcessdefinitionPackageImpl theProcessdefinitionPackage = (ProcessdefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI) instanceof ProcessdefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI) : ProcessdefinitionPackage.eINSTANCE);
		ProcessinstancePackageImpl theProcessinstancePackage = (ProcessinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) instanceof ProcessinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) : ProcessinstancePackage.eINSTANCE);
		ProductinstancePackageImpl theProductinstancePackage = (ProductinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) instanceof ProductinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) : ProductinstancePackage.eINSTANCE);
		WorkforcePackageImpl theWorkforcePackage = (WorkforcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) instanceof WorkforcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) : WorkforcePackage.eINSTANCE);
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) instanceof MaterialPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) : MaterialPackage.eINSTANCE);
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) : ResourcetypePackage.eINSTANCE);

		// Create package meta-data objects
		theResourceinstancePackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductdefinitionPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();
		theCapabilityPackage.createPackageContents();
		theProcessdefinitionPackage.createPackageContents();
		theProcessinstancePackage.createPackageContents();
		theProductinstancePackage.createPackageContents();
		theWorkforcePackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theResourcetypePackage.createPackageContents();

		// Initialize created meta-data
		theResourceinstancePackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductdefinitionPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();
		theCapabilityPackage.initializePackageContents();
		theProcessdefinitionPackage.initializePackageContents();
		theProcessinstancePackage.initializePackageContents();
		theProductinstancePackage.initializePackageContents();
		theWorkforcePackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourceinstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourceinstancePackage.eNS_URI, theResourceinstancePackage);
		return theResourceinstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInstanceRepository() {
		return resourceInstanceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstanceRepository_ResourceInstances() {
		return (EReference)resourceInstanceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInstance() {
		return resourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceInstance_SerialNumber() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_ResourceType() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_CapabilityApplications() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_Role() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityApplication() {
		return capabilityApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityApplication_CapabilityAssertion() {
		return (EReference)capabilityApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityApplication_CapabilityVariants() {
		return (EReference)capabilityApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityVariant() {
		return capabilityVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityVariant_Capability() {
		return (EReference)capabilityVariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityVariant_AppliedOn() {
		return (EReference)capabilityVariantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManufacturingCapabilityVariant() {
		return manufacturingCapabilityVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogisticsCapabilityVariant() {
		return logisticsCapabilityVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralCapabilityVariant() {
		return generalCapabilityVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceinstanceFactory getResourceinstanceFactory() {
		return (ResourceinstanceFactory)getEFactoryInstance();
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
		resourceInstanceRepositoryEClass = createEClass(RESOURCE_INSTANCE_REPOSITORY);
		createEReference(resourceInstanceRepositoryEClass, RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES);

		resourceInstanceEClass = createEClass(RESOURCE_INSTANCE);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__SERIAL_NUMBER);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__RESOURCE_TYPE);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__ROLE);

		capabilityApplicationEClass = createEClass(CAPABILITY_APPLICATION);
		createEReference(capabilityApplicationEClass, CAPABILITY_APPLICATION__CAPABILITY_ASSERTION);
		createEReference(capabilityApplicationEClass, CAPABILITY_APPLICATION__CAPABILITY_VARIANTS);

		capabilityVariantEClass = createEClass(CAPABILITY_VARIANT);
		createEReference(capabilityVariantEClass, CAPABILITY_VARIANT__CAPABILITY);
		createEReference(capabilityVariantEClass, CAPABILITY_VARIANT__APPLIED_ON);

		manufacturingCapabilityVariantEClass = createEClass(MANUFACTURING_CAPABILITY_VARIANT);

		logisticsCapabilityVariantEClass = createEClass(LOGISTICS_CAPABILITY_VARIANT);

		generalCapabilityVariantEClass = createEClass(GENERAL_CAPABILITY_VARIANT);
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
		ResourcetypePackage theResourcetypePackage = (ResourcetypePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		CapabilityPackage theCapabilityPackage = (CapabilityPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI);
		ProductdefinitionPackage theProductdefinitionPackage = (ProductdefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI);

		// Create type parameters
		ETypeParameter capabilityVariantEClass_T = addETypeParameter(capabilityVariantEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theBasePackage.getEntity());
		capabilityVariantEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		resourceInstanceEClass.getESuperTypes().add(theBasePackage.getEntity());
		g1 = createEGenericType(this.getCapabilityVariant());
		EGenericType g2 = createEGenericType(theProductdefinitionPackage.getBOMEntry());
		g1.getETypeArguments().add(g2);
		manufacturingCapabilityVariantEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCapabilityVariant());
		g2 = createEGenericType(theTopologyPackage.getTopologyElement());
		g1.getETypeArguments().add(g2);
		logisticsCapabilityVariantEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCapabilityVariant());
		g2 = createEGenericType(theBasePackage.getEntity());
		g1.getETypeArguments().add(g2);
		generalCapabilityVariantEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceInstanceRepositoryEClass, ResourceInstanceRepository.class, "ResourceInstanceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInstanceRepository_ResourceInstances(), this.getResourceInstance(), null, "resourceInstances", null, 0, -1, ResourceInstanceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceInstanceEClass, ResourceInstance.class, "ResourceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceInstance_SerialNumber(), ecorePackage.getEString(), "serialNumber", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_ResourceType(), theResourcetypePackage.getResourceType(), null, "resourceType", null, 1, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_CapabilityApplications(), this.getCapabilityApplication(), null, "capabilityApplications", null, 0, -1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_Role(), theTopologyPackage.getEquipmentModule(), theTopologyPackage.getEquipmentModule_AssignedResourceInstance(), "role", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityApplicationEClass, CapabilityApplication.class, "CapabilityApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityApplication_CapabilityAssertion(), theCapabilityPackage.getCapabilityAssertion(), null, "capabilityAssertion", null, 0, 1, CapabilityApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getCapabilityVariant());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getCapabilityApplication_CapabilityVariants(), g1, null, "capabilityVariants", null, 0, -1, CapabilityApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityVariantEClass, CapabilityVariant.class, "CapabilityVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityVariant_Capability(), theCapabilityPackage.getCapability(), null, "capability", null, 0, 1, CapabilityVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(capabilityVariantEClass_T);
		initEReference(getCapabilityVariant_AppliedOn(), g1, null, "appliedOn", null, 0, -1, CapabilityVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manufacturingCapabilityVariantEClass, ManufacturingCapabilityVariant.class, "ManufacturingCapabilityVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logisticsCapabilityVariantEClass, LogisticsCapabilityVariant.class, "LogisticsCapabilityVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalCapabilityVariantEClass, GeneralCapabilityVariant.class, "GeneralCapabilityVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //ResourceinstancePackageImpl
