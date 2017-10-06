/**
 */
package de.dfki.iui.basys.model.domain.workplan.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.order.OrderPackage;

import de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl;

import de.dfki.iui.basys.model.domain.product.ProductPackage;

import de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl;

import de.dfki.iui.basys.model.domain.staff.StaffPackage;

import de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl;

import de.dfki.iui.basys.model.domain.topology.TopologyPackage;

import de.dfki.iui.basys.model.domain.topology.impl.TopologyPackageImpl;

import de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage;

import de.dfki.iui.basys.model.domain.workerguidance.impl.WorkerguidancePackageImpl;

import de.dfki.iui.basys.model.domain.workplan.Duration;
import de.dfki.iui.basys.model.domain.workplan.WorkplanFactory;
import de.dfki.iui.basys.model.domain.workplan.WorkplanInstance;
import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstance;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeEvent;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceChangeType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkplanPackageImpl extends EPackageImpl implements WorkplanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workplanInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workstepInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workstepInstanceChangeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workstepInstanceChangeTypeEEnum = null;

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
	 * @see de.dfki.iui.basys.model.domain.workplan.WorkplanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkplanPackageImpl() {
		super(eNS_URI, WorkplanFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkplanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkplanPackage init() {
		if (isInited) return (WorkplanPackage)EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI);

		// Obtain or create and register package
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkplanPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);

		// Create package meta-data objects
		theWorkplanPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();

		// Initialize created meta-data
		theWorkplanPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkplanPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkplanPackage.eNS_URI, theWorkplanPackage);
		return theWorkplanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkplanInstance() {
		return workplanInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkplanInstance_ProductInstanceId() {
		return (EAttribute)workplanInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkplanInstance_WorkstepInstances() {
		return (EReference)workplanInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkstepInstance() {
		return workstepInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstance_Name() {
		return (EAttribute)workstepInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstance_StationId() {
		return (EAttribute)workstepInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstance_IsAutomatic() {
		return (EAttribute)workstepInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkstepInstanceChangeEvent() {
		return workstepInstanceChangeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstanceChangeEvent_Type() {
		return (EAttribute)workstepInstanceChangeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstanceChangeEvent_ProductInstanceId() {
		return (EAttribute)workstepInstanceChangeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstanceChangeEvent_WorkstepInstanceId() {
		return (EAttribute)workstepInstanceChangeEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_WorkstepInstanceId() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_BeginnerLevel() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_BeginnerLevelDeviance() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_ExpertLevel() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_ExpertLevelDeviance() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkstepInstanceChangeType() {
		return workstepInstanceChangeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkplanFactory getWorkplanFactory() {
		return (WorkplanFactory)getEFactoryInstance();
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
		workplanInstanceEClass = createEClass(WORKPLAN_INSTANCE);
		createEAttribute(workplanInstanceEClass, WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID);
		createEReference(workplanInstanceEClass, WORKPLAN_INSTANCE__WORKSTEP_INSTANCES);

		workstepInstanceEClass = createEClass(WORKSTEP_INSTANCE);
		createEAttribute(workstepInstanceEClass, WORKSTEP_INSTANCE__NAME);
		createEAttribute(workstepInstanceEClass, WORKSTEP_INSTANCE__STATION_ID);
		createEAttribute(workstepInstanceEClass, WORKSTEP_INSTANCE__IS_AUTOMATIC);

		workstepInstanceChangeEventEClass = createEClass(WORKSTEP_INSTANCE_CHANGE_EVENT);
		createEAttribute(workstepInstanceChangeEventEClass, WORKSTEP_INSTANCE_CHANGE_EVENT__TYPE);
		createEAttribute(workstepInstanceChangeEventEClass, WORKSTEP_INSTANCE_CHANGE_EVENT__PRODUCT_INSTANCE_ID);
		createEAttribute(workstepInstanceChangeEventEClass, WORKSTEP_INSTANCE_CHANGE_EVENT__WORKSTEP_INSTANCE_ID);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__WORKSTEP_INSTANCE_ID);
		createEAttribute(durationEClass, DURATION__BEGINNER_LEVEL);
		createEAttribute(durationEClass, DURATION__BEGINNER_LEVEL_DEVIANCE);
		createEAttribute(durationEClass, DURATION__EXPERT_LEVEL);
		createEAttribute(durationEClass, DURATION__EXPERT_LEVEL_DEVIANCE);

		// Create enums
		workstepInstanceChangeTypeEEnum = createEEnum(WORKSTEP_INSTANCE_CHANGE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workplanInstanceEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		workstepInstanceEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		workstepInstanceChangeEventEClass.getESuperTypes().add(theBasePackage.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(workplanInstanceEClass, WorkplanInstance.class, "WorkplanInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkplanInstance_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, WorkplanInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkplanInstance_WorkstepInstances(), this.getWorkstepInstance(), null, "workstepInstances", null, 0, -1, WorkplanInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workstepInstanceEClass, WorkstepInstance.class, "WorkstepInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkstepInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkstepInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstance_StationId(), ecorePackage.getEString(), "stationId", null, 0, 1, WorkstepInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstance_IsAutomatic(), ecorePackage.getEBoolean(), "isAutomatic", null, 0, 1, WorkstepInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workstepInstanceChangeEventEClass, WorkstepInstanceChangeEvent.class, "WorkstepInstanceChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkstepInstanceChangeEvent_Type(), this.getWorkstepInstanceChangeType(), "type", null, 0, 1, WorkstepInstanceChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstanceChangeEvent_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, WorkstepInstanceChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstanceChangeEvent_WorkstepInstanceId(), ecorePackage.getEString(), "workstepInstanceId", null, 0, 1, WorkstepInstanceChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_WorkstepInstanceId(), ecorePackage.getEString(), "workstepInstanceId", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_BeginnerLevel(), ecorePackage.getEInt(), "beginnerLevel", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_BeginnerLevelDeviance(), ecorePackage.getEInt(), "beginnerLevelDeviance", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_ExpertLevel(), ecorePackage.getEInt(), "expertLevel", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_ExpertLevelDeviance(), ecorePackage.getEInt(), "expertLevelDeviance", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(workstepInstanceChangeTypeEEnum, WorkstepInstanceChangeType.class, "WorkstepInstanceChangeType");
		addEEnumLiteral(workstepInstanceChangeTypeEEnum, WorkstepInstanceChangeType.UNKNOWN);
		addEEnumLiteral(workstepInstanceChangeTypeEEnum, WorkstepInstanceChangeType.STARTED);
		addEEnumLiteral(workstepInstanceChangeTypeEEnum, WorkstepInstanceChangeType.PAUSED);
		addEEnumLiteral(workstepInstanceChangeTypeEEnum, WorkstepInstanceChangeType.REPEATING);
		addEEnumLiteral(workstepInstanceChangeTypeEEnum, WorkstepInstanceChangeType.FINISHED);
		addEEnumLiteral(workstepInstanceChangeTypeEEnum, WorkstepInstanceChangeType.ABORTED);

		// Create resource
		createResource(eNS_URI);
	}

} //WorkplanPackageImpl
