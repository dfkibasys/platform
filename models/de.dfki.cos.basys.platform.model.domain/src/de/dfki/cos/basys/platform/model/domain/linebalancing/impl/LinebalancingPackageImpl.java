/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing.impl;

import de.dfki.cos.basys.platform.model.base.BasePackage;
import de.dfki.cos.basys.platform.model.data.DataPackage;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityPackageImpl;
import de.dfki.cos.basys.platform.model.domain.linebalancing.LineBalancingAssignment;
import de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingFactory;
import de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.cos.basys.platform.model.domain.linebalancing.StaticWorldModel;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMPathTime;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMPathTimes;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMResourceInstance;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WorldModel;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.cos.basys.platform.model.domain.order.OrderPackage;
import de.dfki.cos.basys.platform.model.domain.order.impl.OrderPackageImpl;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.productdefinition.impl.ProductdefinitionPackageImpl;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage;
import de.dfki.cos.basys.platform.model.domain.productinstance.impl.ProductinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.cos.basys.platform.model.domain.resourcetype.impl.ResourcetypePackageImpl;
import de.dfki.cos.basys.platform.model.domain.staff.StaffPackage;
import de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl;
import de.dfki.cos.basys.platform.model.domain.workerguidance.WorkerguidancePackage;
import de.dfki.cos.basys.platform.model.domain.workerguidance.impl.WorkerguidancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage;
import de.dfki.cos.basys.platform.model.domain.workforce.impl.WorkforcePackageImpl;
import de.dfki.cos.basys.platform.model.domain.workplan.WorkplanPackage;
import de.dfki.cos.basys.platform.model.domain.workplan.impl.WorkplanPackageImpl;
import de.dfki.cos.basys.platform.model.pattern.PatternPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class LinebalancingPackageImpl extends EPackageImpl implements LinebalancingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmPathTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticWorldModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmProductInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmResourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worldModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmPathTimesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineBalancingAssignmentEClass = null;

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
	 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LinebalancingPackageImpl() {
		super(eNS_URI, LinebalancingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LinebalancingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LinebalancingPackage init() {
		if (isInited) return (LinebalancingPackage)EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI);

		// Obtain or create and register package
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LinebalancingPackageImpl());

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
		CapabilityPackageImpl theCapabilityPackage = (CapabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) instanceof CapabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) : CapabilityPackage.eINSTANCE);
		ProcessdefinitionPackageImpl theProcessdefinitionPackage = (ProcessdefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI) instanceof ProcessdefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI) : ProcessdefinitionPackage.eINSTANCE);
		ProcessinstancePackageImpl theProcessinstancePackage = (ProcessinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) instanceof ProcessinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) : ProcessinstancePackage.eINSTANCE);
		ProductinstancePackageImpl theProductinstancePackage = (ProductinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) instanceof ProductinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) : ProductinstancePackage.eINSTANCE);
		WorkforcePackageImpl theWorkforcePackage = (WorkforcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) instanceof WorkforcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) : WorkforcePackage.eINSTANCE);
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) instanceof MaterialPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) : MaterialPackage.eINSTANCE);
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) : ResourcetypePackage.eINSTANCE);
		ResourceinstancePackageImpl theResourceinstancePackage = (ResourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) instanceof ResourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) : ResourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theLinebalancingPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductdefinitionPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theCapabilityPackage.createPackageContents();
		theProcessdefinitionPackage.createPackageContents();
		theProcessinstancePackage.createPackageContents();
		theProductinstancePackage.createPackageContents();
		theWorkforcePackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		theResourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theLinebalancingPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductdefinitionPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theCapabilityPackage.initializePackageContents();
		theProcessdefinitionPackage.initializePackageContents();
		theProcessinstancePackage.initializePackageContents();
		theProductinstancePackage.initializePackageContents();
		theWorkforcePackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
		theResourceinstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLinebalancingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LinebalancingPackage.eNS_URI, theLinebalancingPackage);
		return theLinebalancingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWMPathTime() {
		return wmPathTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMPathTime_Time() {
		return (EAttribute)wmPathTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMPathTime_To() {
		return (EReference)wmPathTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticWorldModel() {
		return staticWorldModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticWorldModel_PathTimes() {
		return (EReference)staticWorldModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWMProductInstance() {
		return wmProductInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMProductInstance_SerialId() {
		return (EAttribute)wmProductInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMProductInstance_Position() {
		return (EReference)wmProductInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMProductInstance_In_transit() {
		return (EAttribute)wmProductInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMProductInstance_Eta() {
		return (EAttribute)wmProductInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMProductInstance_Variant() {
		return (EReference)wmProductInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWMResourceInstance() {
		return wmResourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMResourceInstance_SerialId() {
		return (EAttribute)wmResourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMResourceInstance_From_position() {
		return (EReference)wmResourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMResourceInstance_To_position() {
		return (EReference)wmResourceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMResourceInstance_Eta() {
		return (EAttribute)wmResourceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMResourceInstance_Capabilities() {
		return (EReference)wmResourceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorldModel() {
		return worldModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldModel_ProductInstances() {
		return (EReference)worldModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldModel_ResourceInstances() {
		return (EReference)worldModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWMPathTimes() {
		return wmPathTimesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMPathTimes_From() {
		return (EReference)wmPathTimesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMPathTimes_To() {
		return (EReference)wmPathTimesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineBalancingAssignment() {
		return lineBalancingAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineBalancingAssignment_ResourceInstanceId() {
		return (EAttribute)lineBalancingAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineBalancingAssignment_Order() {
		return (EReference)lineBalancingAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebalancingFactory getLinebalancingFactory() {
		return (LinebalancingFactory)getEFactoryInstance();
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
		wmPathTimeEClass = createEClass(WM_PATH_TIME);
		createEAttribute(wmPathTimeEClass, WM_PATH_TIME__TIME);
		createEReference(wmPathTimeEClass, WM_PATH_TIME__TO);

		staticWorldModelEClass = createEClass(STATIC_WORLD_MODEL);
		createEReference(staticWorldModelEClass, STATIC_WORLD_MODEL__PATH_TIMES);

		wmProductInstanceEClass = createEClass(WM_PRODUCT_INSTANCE);
		createEAttribute(wmProductInstanceEClass, WM_PRODUCT_INSTANCE__SERIAL_ID);
		createEReference(wmProductInstanceEClass, WM_PRODUCT_INSTANCE__POSITION);
		createEAttribute(wmProductInstanceEClass, WM_PRODUCT_INSTANCE__IN_TRANSIT);
		createEAttribute(wmProductInstanceEClass, WM_PRODUCT_INSTANCE__ETA);
		createEReference(wmProductInstanceEClass, WM_PRODUCT_INSTANCE__VARIANT);

		wmResourceInstanceEClass = createEClass(WM_RESOURCE_INSTANCE);
		createEAttribute(wmResourceInstanceEClass, WM_RESOURCE_INSTANCE__SERIAL_ID);
		createEReference(wmResourceInstanceEClass, WM_RESOURCE_INSTANCE__FROM_POSITION);
		createEReference(wmResourceInstanceEClass, WM_RESOURCE_INSTANCE__TO_POSITION);
		createEAttribute(wmResourceInstanceEClass, WM_RESOURCE_INSTANCE__ETA);
		createEReference(wmResourceInstanceEClass, WM_RESOURCE_INSTANCE__CAPABILITIES);

		worldModelEClass = createEClass(WORLD_MODEL);
		createEReference(worldModelEClass, WORLD_MODEL__PRODUCT_INSTANCES);
		createEReference(worldModelEClass, WORLD_MODEL__RESOURCE_INSTANCES);

		wmPathTimesEClass = createEClass(WM_PATH_TIMES);
		createEReference(wmPathTimesEClass, WM_PATH_TIMES__FROM);
		createEReference(wmPathTimesEClass, WM_PATH_TIMES__TO);

		lineBalancingAssignmentEClass = createEClass(LINE_BALANCING_ASSIGNMENT);
		createEAttribute(lineBalancingAssignmentEClass, LINE_BALANCING_ASSIGNMENT__RESOURCE_INSTANCE_ID);
		createEReference(lineBalancingAssignmentEClass, LINE_BALANCING_ASSIGNMENT__ORDER);
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
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		ProductdefinitionPackage theProductdefinitionPackage = (ProductdefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI);
		ResourceinstancePackage theResourceinstancePackage = (ResourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI);
		OrderPackage theOrderPackage = (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(wmPathTimeEClass, WMPathTime.class, "WMPathTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMPathTime_Time(), theEcorePackage.getELong(), "time", null, 0, 1, WMPathTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMPathTime_To(), theTopologyPackage.getTopologyElement(), null, "to", null, 0, 1, WMPathTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticWorldModelEClass, StaticWorldModel.class, "StaticWorldModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticWorldModel_PathTimes(), this.getWMPathTimes(), null, "pathTimes", null, 0, -1, StaticWorldModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmProductInstanceEClass, WMProductInstance.class, "WMProductInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMProductInstance_SerialId(), ecorePackage.getEString(), "serialId", null, 0, 1, WMProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMProductInstance_Position(), theTopologyPackage.getTopologyElement(), null, "position", null, 0, 1, WMProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMProductInstance_In_transit(), ecorePackage.getEBoolean(), "in_transit", null, 0, 1, WMProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMProductInstance_Eta(), theEcorePackage.getELong(), "eta", null, 0, 1, WMProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMProductInstance_Variant(), theProductdefinitionPackage.getManufacturedComponent(), null, "variant", null, 0, 1, WMProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmResourceInstanceEClass, WMResourceInstance.class, "WMResourceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMResourceInstance_SerialId(), theEcorePackage.getEString(), "serialId", null, 0, 1, WMResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMResourceInstance_From_position(), theTopologyPackage.getTopologyElement(), null, "from_position", null, 0, 1, WMResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMResourceInstance_To_position(), theTopologyPackage.getTopologyElement(), null, "to_position", null, 0, 1, WMResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMResourceInstance_Eta(), theEcorePackage.getELong(), "eta", null, 0, 1, WMResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMResourceInstance_Capabilities(), theResourceinstancePackage.getCapabilityApplication(), null, "capabilities", null, 0, -1, WMResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worldModelEClass, WorldModel.class, "WorldModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorldModel_ProductInstances(), this.getWMProductInstance(), null, "productInstances", null, 0, -1, WorldModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldModel_ResourceInstances(), this.getWMResourceInstance(), null, "resourceInstances", null, 0, -1, WorldModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmPathTimesEClass, WMPathTimes.class, "WMPathTimes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMPathTimes_From(), theTopologyPackage.getTopologyElement(), null, "from", null, 0, 1, WMPathTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMPathTimes_To(), this.getWMPathTime(), null, "to", null, 0, -1, WMPathTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineBalancingAssignmentEClass, LineBalancingAssignment.class, "LineBalancingAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineBalancingAssignment_ResourceInstanceId(), theEcorePackage.getEString(), "resourceInstanceId", null, 0, 1, LineBalancingAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineBalancingAssignment_Order(), theOrderPackage.getOrder(), null, "order", null, 0, 1, LineBalancingAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //LinebalancingPackageImpl
