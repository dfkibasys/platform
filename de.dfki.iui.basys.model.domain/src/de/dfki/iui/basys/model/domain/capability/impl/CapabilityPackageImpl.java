/**
 */
package de.dfki.iui.basys.model.domain.capability.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.capability.AnEinpressen;
import de.dfki.iui.basys.model.domain.capability.Beschichten;
import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;
import de.dfki.iui.basys.model.domain.capability.CapabilityFactory;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.Fügen;
import de.dfki.iui.basys.model.domain.capability.HandlingCapability;
import de.dfki.iui.basys.model.domain.capability.InformationTransferCapability;
import de.dfki.iui.basys.model.domain.capability.ManufacturingCapability;
import de.dfki.iui.basys.model.domain.capability.Pressen;
import de.dfki.iui.basys.model.domain.capability.ProvideInformation;
import de.dfki.iui.basys.model.domain.capability.QoSCapability;
import de.dfki.iui.basys.model.domain.capability.Schrauben;
import de.dfki.iui.basys.model.domain.capability.Stoffeigenschaften;
import de.dfki.iui.basys.model.domain.capability.Trennen;
import de.dfki.iui.basys.model.domain.capability.Umformen;
import de.dfki.iui.basys.model.domain.capability.Urformen;

import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl;

import de.dfki.iui.basys.model.domain.material.MaterialPackage;
import de.dfki.iui.basys.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.iui.basys.model.domain.order.OrderPackage;

import de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl;

import de.dfki.iui.basys.model.domain.process.ProcessPackage;

import de.dfki.iui.basys.model.domain.process.impl.ProcessPackageImpl;

import de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage;

import de.dfki.iui.basys.model.domain.processinstance.impl.ProcessinstancePackageImpl;

import de.dfki.iui.basys.model.domain.product.ProductPackage;

import de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl;

import de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage;

import de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl;

import de.dfki.iui.basys.model.domain.resource.ResourcePackage;
import de.dfki.iui.basys.model.domain.resource.impl.ResourcePackageImpl;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage;
import de.dfki.iui.basys.model.domain.roletopology.impl.RoletopologyPackageImpl;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityPackageImpl extends EPackageImpl implements CapabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlingCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturingCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fügenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urformenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umformenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trennenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beschichtenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stoffeigenschaftenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anEinpressenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schraubenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationTransferCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provideInformationEClass = null;

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
	 * @see de.dfki.iui.basys.model.domain.capability.CapabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapabilityPackageImpl() {
		super(eNS_URI, CapabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CapabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapabilityPackage init() {
		if (isInited) return (CapabilityPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI);

		// Obtain or create and register package
		CapabilityPackageImpl theCapabilityPackage = (CapabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CapabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CapabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) : WorkplanPackage.eINSTANCE);
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) : LinebalancingPackage.eINSTANCE);
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);
		ProcessinstancePackageImpl theProcessinstancePackage = (ProcessinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) instanceof ProcessinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) : ProcessinstancePackage.eINSTANCE);
		ProductinstancePackageImpl theProductinstancePackage = (ProductinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) instanceof ProductinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI) : ProductinstancePackage.eINSTANCE);
		WorkforcePackageImpl theWorkforcePackage = (WorkforcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) instanceof WorkforcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) : WorkforcePackage.eINSTANCE);
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) instanceof MaterialPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) : MaterialPackage.eINSTANCE);
		RoletopologyPackageImpl theRoletopologyPackage = (RoletopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoletopologyPackage.eNS_URI) instanceof RoletopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoletopologyPackage.eNS_URI) : RoletopologyPackage.eINSTANCE);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI) instanceof ResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI) : ResourcePackage.eINSTANCE);
		ResourceinstancePackageImpl theResourceinstancePackage = (ResourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) instanceof ResourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) : ResourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theCapabilityPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theProcessinstancePackage.createPackageContents();
		theProductinstancePackage.createPackageContents();
		theWorkforcePackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theRoletopologyPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theResourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theCapabilityPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theProcessinstancePackage.initializePackageContents();
		theProductinstancePackage.initializePackageContents();
		theWorkforcePackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theRoletopologyPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theResourceinstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapabilityPackage.eNS_URI, theCapabilityPackage);
		return theCapabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityAssertion() {
		return capabilityAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityAssertion_Pattern() {
		return (EReference)capabilityAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlingCapability() {
		return handlingCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManufacturingCapability() {
		return manufacturingCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFügen() {
		return fügenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressen() {
		return pressenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPressen_Druck() {
		return (EAttribute)pressenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPressen_Hub() {
		return (EAttribute)pressenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSCapability() {
		return qoSCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrformen() {
		return urformenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmformen() {
		return umformenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrennen() {
		return trennenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeschichten() {
		return beschichtenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoffeigenschaften() {
		return stoffeigenschaftenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnEinpressen() {
		return anEinpressenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchrauben() {
		return schraubenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchrauben_Drehmoment() {
		return (EAttribute)schraubenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationTransferCapability() {
		return informationTransferCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvideInformation() {
		return provideInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityFactory getCapabilityFactory() {
		return (CapabilityFactory)getEFactoryInstance();
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
		capabilityAssertionEClass = createEClass(CAPABILITY_ASSERTION);
		createEReference(capabilityAssertionEClass, CAPABILITY_ASSERTION__PATTERN);

		capabilityEClass = createEClass(CAPABILITY);

		handlingCapabilityEClass = createEClass(HANDLING_CAPABILITY);

		manufacturingCapabilityEClass = createEClass(MANUFACTURING_CAPABILITY);

		fügenEClass = createEClass(FÜGEN);

		pressenEClass = createEClass(PRESSEN);
		createEAttribute(pressenEClass, PRESSEN__DRUCK);
		createEAttribute(pressenEClass, PRESSEN__HUB);

		qoSCapabilityEClass = createEClass(QO_SCAPABILITY);

		urformenEClass = createEClass(URFORMEN);

		umformenEClass = createEClass(UMFORMEN);

		trennenEClass = createEClass(TRENNEN);

		beschichtenEClass = createEClass(BESCHICHTEN);

		stoffeigenschaftenEClass = createEClass(STOFFEIGENSCHAFTEN);

		anEinpressenEClass = createEClass(AN_EINPRESSEN);

		schraubenEClass = createEClass(SCHRAUBEN);
		createEAttribute(schraubenEClass, SCHRAUBEN__DREHMOMENT);

		informationTransferCapabilityEClass = createEClass(INFORMATION_TRANSFER_CAPABILITY);

		provideInformationEClass = createEClass(PROVIDE_INFORMATION);
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
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capabilityAssertionEClass.getESuperTypes().add(theBasePackage.getEntity());
		capabilityEClass.getESuperTypes().add(theBasePackage.getEntity());
		handlingCapabilityEClass.getESuperTypes().add(this.getCapability());
		manufacturingCapabilityEClass.getESuperTypes().add(this.getCapability());
		fügenEClass.getESuperTypes().add(this.getManufacturingCapability());
		pressenEClass.getESuperTypes().add(this.getAnEinpressen());
		qoSCapabilityEClass.getESuperTypes().add(this.getCapability());
		urformenEClass.getESuperTypes().add(this.getManufacturingCapability());
		umformenEClass.getESuperTypes().add(this.getManufacturingCapability());
		trennenEClass.getESuperTypes().add(this.getManufacturingCapability());
		beschichtenEClass.getESuperTypes().add(this.getManufacturingCapability());
		stoffeigenschaftenEClass.getESuperTypes().add(this.getManufacturingCapability());
		anEinpressenEClass.getESuperTypes().add(this.getFügen());
		schraubenEClass.getESuperTypes().add(this.getAnEinpressen());
		informationTransferCapabilityEClass.getESuperTypes().add(this.getCapability());
		provideInformationEClass.getESuperTypes().add(this.getInformationTransferCapability());

		// Initialize classes, features, and operations; add parameters
		initEClass(capabilityAssertionEClass, CapabilityAssertion.class, "CapabilityAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityAssertion_Pattern(), thePatternPackage.getPObject(), null, "pattern", null, 0, 1, CapabilityAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(handlingCapabilityEClass, HandlingCapability.class, "HandlingCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manufacturingCapabilityEClass, ManufacturingCapability.class, "ManufacturingCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fügenEClass, Fügen.class, "Fügen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressenEClass, Pressen.class, "Pressen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressen_Druck(), ecorePackage.getEInt(), "druck", null, 0, 1, Pressen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPressen_Hub(), ecorePackage.getEInt(), "hub", null, 0, 1, Pressen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSCapabilityEClass, QoSCapability.class, "QoSCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(urformenEClass, Urformen.class, "Urformen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umformenEClass, Umformen.class, "Umformen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trennenEClass, Trennen.class, "Trennen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beschichtenEClass, Beschichten.class, "Beschichten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stoffeigenschaftenEClass, Stoffeigenschaften.class, "Stoffeigenschaften", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anEinpressenEClass, AnEinpressen.class, "AnEinpressen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schraubenEClass, Schrauben.class, "Schrauben", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchrauben_Drehmoment(), ecorePackage.getEInt(), "drehmoment", null, 0, 1, Schrauben.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationTransferCapabilityEClass, InformationTransferCapability.class, "InformationTransferCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(provideInformationEClass, ProvideInformation.class, "ProvideInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //CapabilityPackageImpl
