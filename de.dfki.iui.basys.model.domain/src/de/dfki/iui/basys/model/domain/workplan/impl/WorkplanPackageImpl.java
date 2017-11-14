/**
 */
package de.dfki.iui.basys.model.domain.workplan.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl;

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
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusChangeEvent;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusEnum;

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
	private EClass workstepInstanceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workstepInstanceStatusChangeEventEClass = null;

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
	private EEnum workstepInstanceStatusEnumEEnum = null;

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
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) : LinebalancingPackage.eINSTANCE);

		// Create package meta-data objects
		theWorkplanPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();

		// Initialize created meta-data
		theWorkplanPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();

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
	public EAttribute getWorkstepInstance_ComponentId() {
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
	public EClass getWorkstepInstanceStatus() {
		return workstepInstanceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstanceStatus_Status() {
		return (EAttribute)workstepInstanceStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstanceStatus_ProductInstanceId() {
		return (EAttribute)workstepInstanceStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkstepInstanceStatus_WorkstepInstanceId() {
		return (EAttribute)workstepInstanceStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkstepInstanceStatusChangeEvent() {
		return workstepInstanceStatusChangeEventEClass;
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
	public EAttribute getDuration_AgentId() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Average() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_StandardDeviation() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkstepInstanceStatusEnum() {
		return workstepInstanceStatusEnumEEnum;
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
		createEAttribute(workstepInstanceEClass, WORKSTEP_INSTANCE__COMPONENT_ID);
		createEAttribute(workstepInstanceEClass, WORKSTEP_INSTANCE__IS_AUTOMATIC);

		workstepInstanceStatusEClass = createEClass(WORKSTEP_INSTANCE_STATUS);
		createEAttribute(workstepInstanceStatusEClass, WORKSTEP_INSTANCE_STATUS__STATUS);
		createEAttribute(workstepInstanceStatusEClass, WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID);
		createEAttribute(workstepInstanceStatusEClass, WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID);

		workstepInstanceStatusChangeEventEClass = createEClass(WORKSTEP_INSTANCE_STATUS_CHANGE_EVENT);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__WORKSTEP_INSTANCE_ID);
		createEAttribute(durationEClass, DURATION__AGENT_ID);
		createEAttribute(durationEClass, DURATION__AVERAGE);
		createEAttribute(durationEClass, DURATION__STANDARD_DEVIATION);

		// Create enums
		workstepInstanceStatusEnumEEnum = createEEnum(WORKSTEP_INSTANCE_STATUS_ENUM);
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
		workstepInstanceStatusEClass.getESuperTypes().add(theBasePackage.getEntity());
		workstepInstanceStatusChangeEventEClass.getESuperTypes().add(theBasePackage.getEvent());
		workstepInstanceStatusChangeEventEClass.getESuperTypes().add(this.getWorkstepInstanceStatus());

		// Initialize classes, features, and operations; add parameters
		initEClass(workplanInstanceEClass, WorkplanInstance.class, "WorkplanInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkplanInstance_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, WorkplanInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkplanInstance_WorkstepInstances(), this.getWorkstepInstance(), null, "workstepInstances", null, 0, -1, WorkplanInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workstepInstanceEClass, WorkstepInstance.class, "WorkstepInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkstepInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkstepInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstance_ComponentId(), ecorePackage.getEString(), "componentId", null, 0, 1, WorkstepInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstance_IsAutomatic(), ecorePackage.getEBoolean(), "isAutomatic", null, 0, 1, WorkstepInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workstepInstanceStatusEClass, WorkstepInstanceStatus.class, "WorkstepInstanceStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkstepInstanceStatus_Status(), this.getWorkstepInstanceStatusEnum(), "status", null, 0, 1, WorkstepInstanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstanceStatus_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, WorkstepInstanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkstepInstanceStatus_WorkstepInstanceId(), ecorePackage.getEString(), "workstepInstanceId", null, 0, 1, WorkstepInstanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workstepInstanceStatusChangeEventEClass, WorkstepInstanceStatusChangeEvent.class, "WorkstepInstanceStatusChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_WorkstepInstanceId(), ecorePackage.getEString(), "workstepInstanceId", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_AgentId(), ecorePackage.getEString(), "agentId", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Average(), ecorePackage.getEDouble(), "average", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_StandardDeviation(), ecorePackage.getEDouble(), "standardDeviation", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(workstepInstanceStatusEnumEEnum, WorkstepInstanceStatusEnum.class, "WorkstepInstanceStatusEnum");
		addEEnumLiteral(workstepInstanceStatusEnumEEnum, WorkstepInstanceStatusEnum.UNKNOWN);
		addEEnumLiteral(workstepInstanceStatusEnumEEnum, WorkstepInstanceStatusEnum.STARTED);
		addEEnumLiteral(workstepInstanceStatusEnumEEnum, WorkstepInstanceStatusEnum.PAUSED);
		addEEnumLiteral(workstepInstanceStatusEnumEEnum, WorkstepInstanceStatusEnum.REPEATING);
		addEEnumLiteral(workstepInstanceStatusEnumEEnum, WorkstepInstanceStatusEnum.FINISHED);
		addEEnumLiteral(workstepInstanceStatusEnumEEnum, WorkstepInstanceStatusEnum.ABORTED);

		// Create resource
		createResource(eNS_URI);
	}

} //WorkplanPackageImpl
