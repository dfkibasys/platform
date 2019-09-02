/**
 */
package de.dfki.cos.basys.platform.model.domain.capability.impl;

import de.dfki.cos.basys.platform.model.base.BasePackage;
import de.dfki.cos.basys.platform.model.data.DataPackage;
import de.dfki.cos.basys.platform.model.domain.capability.AnEinpressen;
import de.dfki.cos.basys.platform.model.domain.capability.Beschichten;
import de.dfki.cos.basys.platform.model.domain.capability.Buffering;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityAssertion;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityFactory;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityRequest;
import de.dfki.cos.basys.platform.model.domain.capability.ChangingQuantity;
import de.dfki.cos.basys.platform.model.domain.capability.Checking;
import de.dfki.cos.basys.platform.model.domain.capability.ConfirmationCapability;
import de.dfki.cos.basys.platform.model.domain.capability.Conveying;
import de.dfki.cos.basys.platform.model.domain.capability.Fügen;
import de.dfki.cos.basys.platform.model.domain.capability.GeneralCapability;
import de.dfki.cos.basys.platform.model.domain.capability.Guiding;
import de.dfki.cos.basys.platform.model.domain.capability.Handling;
import de.dfki.cos.basys.platform.model.domain.capability.Inspect;
import de.dfki.cos.basys.platform.model.domain.capability.InteractionCapability;
import de.dfki.cos.basys.platform.model.domain.capability.LoadCarrierUnitEnum;
import de.dfki.cos.basys.platform.model.domain.capability.LogisticsCapability;
import de.dfki.cos.basys.platform.model.domain.capability.ManufacturingCapability;
import de.dfki.cos.basys.platform.model.domain.capability.MoveToLocation;
import de.dfki.cos.basys.platform.model.domain.capability.Moving;
import de.dfki.cos.basys.platform.model.domain.capability.NotifyWorker;
import de.dfki.cos.basys.platform.model.domain.capability.Ordering;
import de.dfki.cos.basys.platform.model.domain.capability.Orientating;
import de.dfki.cos.basys.platform.model.domain.capability.PassingOn;
import de.dfki.cos.basys.platform.model.domain.capability.PickAndPlace;
import de.dfki.cos.basys.platform.model.domain.capability.Placing;
import de.dfki.cos.basys.platform.model.domain.capability.Pressing;
import de.dfki.cos.basys.platform.model.domain.capability.ProductionCapability;
import de.dfki.cos.basys.platform.model.domain.capability.ProjectETA;
import de.dfki.cos.basys.platform.model.domain.capability.ProjectPath;
import de.dfki.cos.basys.platform.model.domain.capability.Provisioning;
import de.dfki.cos.basys.platform.model.domain.capability.QAVisualisationCapability;
import de.dfki.cos.basys.platform.model.domain.capability.QoSCapability;
import de.dfki.cos.basys.platform.model.domain.capability.Screwing;
import de.dfki.cos.basys.platform.model.domain.capability.Securing;
import de.dfki.cos.basys.platform.model.domain.capability.Stoffeigenschaften;
import de.dfki.cos.basys.platform.model.domain.capability.SwitchConfirmationCapability;
import de.dfki.cos.basys.platform.model.domain.capability.Swivel;
import de.dfki.cos.basys.platform.model.domain.capability.Take;
import de.dfki.cos.basys.platform.model.domain.capability.TestCapability;
import de.dfki.cos.basys.platform.model.domain.capability.Transport;
import de.dfki.cos.basys.platform.model.domain.capability.Trennen;
import de.dfki.cos.basys.platform.model.domain.capability.Umformen;
import de.dfki.cos.basys.platform.model.domain.capability.Urformen;
import de.dfki.cos.basys.platform.model.domain.capability.VisualisationCapability;
import de.dfki.cos.basys.platform.model.domain.capability.WorkerAssistenceCapability;
import de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.cos.basys.platform.model.domain.linebalancing.impl.LinebalancingPackageImpl;
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
	private EClass capabilityRequestEClass = null;

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
	private EClass handlingEClass = null;

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
	private EClass pressingEClass = null;

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
	private EClass inspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workerAssistenceCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmationCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchConfirmationCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveToLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectETAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualisationCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qaVisualisationCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provisioningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notifyWorkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changingQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swivelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientatingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passingOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass takeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loadCarrierUnitEnumEEnum = null;

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
	private EClass screwingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticsCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pickAndPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferingEClass = null;

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
	 * @see de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage#eNS_URI
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
		Object registeredCapabilityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CapabilityPackageImpl theCapabilityPackage = registeredCapabilityPackage instanceof CapabilityPackageImpl ? (CapabilityPackageImpl)registeredCapabilityPackage : new CapabilityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(registeredPackage instanceof OrderPackageImpl ? registeredPackage : OrderPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI);
		ProductdefinitionPackageImpl theProductdefinitionPackage = (ProductdefinitionPackageImpl)(registeredPackage instanceof ProductdefinitionPackageImpl ? registeredPackage : ProductdefinitionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(registeredPackage instanceof StaffPackageImpl ? registeredPackage : StaffPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(registeredPackage instanceof TopologyPackageImpl ? registeredPackage : TopologyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(registeredPackage instanceof WorkerguidancePackageImpl ? registeredPackage : WorkerguidancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(registeredPackage instanceof WorkplanPackageImpl ? registeredPackage : WorkplanPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI);
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(registeredPackage instanceof LinebalancingPackageImpl ? registeredPackage : LinebalancingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI);
		ProcessdefinitionPackageImpl theProcessdefinitionPackage = (ProcessdefinitionPackageImpl)(registeredPackage instanceof ProcessdefinitionPackageImpl ? registeredPackage : ProcessdefinitionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI);
		ProcessinstancePackageImpl theProcessinstancePackage = (ProcessinstancePackageImpl)(registeredPackage instanceof ProcessinstancePackageImpl ? registeredPackage : ProcessinstancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI);
		ProductinstancePackageImpl theProductinstancePackage = (ProductinstancePackageImpl)(registeredPackage instanceof ProductinstancePackageImpl ? registeredPackage : ProductinstancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI);
		WorkforcePackageImpl theWorkforcePackage = (WorkforcePackageImpl)(registeredPackage instanceof WorkforcePackageImpl ? registeredPackage : WorkforcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI);
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(registeredPackage instanceof MaterialPackageImpl ? registeredPackage : MaterialPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(registeredPackage instanceof ResourcetypePackageImpl ? registeredPackage : ResourcetypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI);
		ResourceinstancePackageImpl theResourceinstancePackage = (ResourceinstancePackageImpl)(registeredPackage instanceof ResourceinstancePackageImpl ? registeredPackage : ResourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theCapabilityPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductdefinitionPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();
		theProcessdefinitionPackage.createPackageContents();
		theProcessinstancePackage.createPackageContents();
		theProductinstancePackage.createPackageContents();
		theWorkforcePackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		theResourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theCapabilityPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductdefinitionPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();
		theProcessdefinitionPackage.initializePackageContents();
		theProcessinstancePackage.initializePackageContents();
		theProductinstancePackage.initializePackageContents();
		theWorkforcePackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
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
	@Override
	public EClass getCapabilityAssertion() {
		return capabilityAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityAssertion_Pattern() {
		return (EReference)capabilityAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityAssertion_Prerequisites() {
		return (EReference)capabilityAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityRequest() {
		return capabilityRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityRequest_Who() {
		return (EReference)capabilityRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityRequest_What() {
		return (EReference)capabilityRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityRequest_Whom() {
		return (EReference)capabilityRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityRequest_Where() {
		return (EReference)capabilityRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapabilityRequest_When() {
		return (EAttribute)capabilityRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityRequest_How() {
		return (EReference)capabilityRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHandling() {
		return handlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManufacturingCapability() {
		return manufacturingCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFügen() {
		return fügenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPressing() {
		return pressingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPressing_Pressure() {
		return (EAttribute)pressingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPressing_Stroke() {
		return (EAttribute)pressingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQoSCapability() {
		return qoSCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInspect() {
		return inspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkerAssistenceCapability() {
		return workerAssistenceCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractionCapability() {
		return interactionCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteractionCapability_Topic() {
		return (EAttribute)interactionCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfirmationCapability() {
		return confirmationCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchConfirmationCapability() {
		return switchConfirmationCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwitchConfirmationCapability_State() {
		return (EAttribute)switchConfirmationCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralCapability() {
		return generalCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoveToLocation() {
		return moveToLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMoveToLocation_TargetLocation() {
		return (EReference)moveToLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectPath() {
		return projectPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectPath_Path() {
		return (EReference)projectPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectPath_Delay() {
		return (EAttribute)projectPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectPath_ArrowCount() {
		return (EAttribute)projectPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectPath_Color() {
		return (EAttribute)projectPathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectPath_Eta() {
		return (EAttribute)projectPathEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectETA() {
		return projectETAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectETA_Eta() {
		return (EAttribute)projectETAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectETA_Position() {
		return (EReference)projectETAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectETA_Radius() {
		return (EAttribute)projectETAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectETA_Color() {
		return (EAttribute)projectETAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectETA_Orientation() {
		return (EAttribute)projectETAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisualisationCapability() {
		return visualisationCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQAVisualisationCapability() {
		return qaVisualisationCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQAVisualisationCapability_QaResult() {
		return (EAttribute)qaVisualisationCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvisioning() {
		return provisioningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotifyWorker() {
		return notifyWorkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotifyWorker_Content() {
		return (EAttribute)notifyWorkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangingQuantity() {
		return changingQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoving() {
		return movingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecuring() {
		return securingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChecking() {
		return checkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwivel() {
		return swivelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrientating() {
		return orientatingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlacing() {
		return placingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrdering() {
		return orderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGuiding() {
		return guidingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassingOn() {
		return passingOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConveying() {
		return conveyingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTake() {
		return takeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestCapability() {
		return testCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLoadCarrierUnitEnum() {
		return loadCarrierUnitEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUrformen() {
		return urformenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmformen() {
		return umformenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrennen() {
		return trennenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeschichten() {
		return beschichtenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoffeigenschaften() {
		return stoffeigenschaftenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnEinpressen() {
		return anEinpressenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScrewing() {
		return screwingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScrewing_Torque() {
		return (EAttribute)screwingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductionCapability() {
		return productionCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticsCapability() {
		return logisticsCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticsCapability_LoadCarrierUnit() {
		return (EAttribute)logisticsCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticsCapability_Capacity() {
		return (EAttribute)logisticsCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticsCapability_Payload() {
		return (EAttribute)logisticsCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPickAndPlace() {
		return pickAndPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPickAndPlace_Reach() {
		return (EAttribute)pickAndPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPickAndPlace_PositionRepeatability() {
		return (EAttribute)pickAndPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransport() {
		return transportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransport_Distance() {
		return (EAttribute)transportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuffering() {
		return bufferingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		createEReference(capabilityAssertionEClass, CAPABILITY_ASSERTION__PREREQUISITES);

		capabilityRequestEClass = createEClass(CAPABILITY_REQUEST);
		createEReference(capabilityRequestEClass, CAPABILITY_REQUEST__WHO);
		createEReference(capabilityRequestEClass, CAPABILITY_REQUEST__WHAT);
		createEReference(capabilityRequestEClass, CAPABILITY_REQUEST__WHOM);
		createEReference(capabilityRequestEClass, CAPABILITY_REQUEST__WHERE);
		createEAttribute(capabilityRequestEClass, CAPABILITY_REQUEST__WHEN);
		createEReference(capabilityRequestEClass, CAPABILITY_REQUEST__HOW);

		capabilityEClass = createEClass(CAPABILITY);

		handlingEClass = createEClass(HANDLING);

		manufacturingCapabilityEClass = createEClass(MANUFACTURING_CAPABILITY);

		fügenEClass = createEClass(FÜGEN);

		pressingEClass = createEClass(PRESSING);
		createEAttribute(pressingEClass, PRESSING__PRESSURE);
		createEAttribute(pressingEClass, PRESSING__STROKE);

		urformenEClass = createEClass(URFORMEN);

		umformenEClass = createEClass(UMFORMEN);

		trennenEClass = createEClass(TRENNEN);

		beschichtenEClass = createEClass(BESCHICHTEN);

		stoffeigenschaftenEClass = createEClass(STOFFEIGENSCHAFTEN);

		anEinpressenEClass = createEClass(AN_EINPRESSEN);

		screwingEClass = createEClass(SCREWING);
		createEAttribute(screwingEClass, SCREWING__TORQUE);

		productionCapabilityEClass = createEClass(PRODUCTION_CAPABILITY);

		logisticsCapabilityEClass = createEClass(LOGISTICS_CAPABILITY);
		createEAttribute(logisticsCapabilityEClass, LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT);
		createEAttribute(logisticsCapabilityEClass, LOGISTICS_CAPABILITY__CAPACITY);
		createEAttribute(logisticsCapabilityEClass, LOGISTICS_CAPABILITY__PAYLOAD);

		pickAndPlaceEClass = createEClass(PICK_AND_PLACE);
		createEAttribute(pickAndPlaceEClass, PICK_AND_PLACE__REACH);
		createEAttribute(pickAndPlaceEClass, PICK_AND_PLACE__POSITION_REPEATABILITY);

		transportEClass = createEClass(TRANSPORT);
		createEAttribute(transportEClass, TRANSPORT__DISTANCE);

		bufferingEClass = createEClass(BUFFERING);

		qoSCapabilityEClass = createEClass(QO_SCAPABILITY);

		inspectEClass = createEClass(INSPECT);

		workerAssistenceCapabilityEClass = createEClass(WORKER_ASSISTENCE_CAPABILITY);

		interactionCapabilityEClass = createEClass(INTERACTION_CAPABILITY);
		createEAttribute(interactionCapabilityEClass, INTERACTION_CAPABILITY__TOPIC);

		confirmationCapabilityEClass = createEClass(CONFIRMATION_CAPABILITY);

		switchConfirmationCapabilityEClass = createEClass(SWITCH_CONFIRMATION_CAPABILITY);
		createEAttribute(switchConfirmationCapabilityEClass, SWITCH_CONFIRMATION_CAPABILITY__STATE);

		generalCapabilityEClass = createEClass(GENERAL_CAPABILITY);

		moveToLocationEClass = createEClass(MOVE_TO_LOCATION);
		createEReference(moveToLocationEClass, MOVE_TO_LOCATION__TARGET_LOCATION);

		projectPathEClass = createEClass(PROJECT_PATH);
		createEReference(projectPathEClass, PROJECT_PATH__PATH);
		createEAttribute(projectPathEClass, PROJECT_PATH__DELAY);
		createEAttribute(projectPathEClass, PROJECT_PATH__ARROW_COUNT);
		createEAttribute(projectPathEClass, PROJECT_PATH__COLOR);
		createEAttribute(projectPathEClass, PROJECT_PATH__ETA);

		projectETAEClass = createEClass(PROJECT_ETA);
		createEAttribute(projectETAEClass, PROJECT_ETA__ETA);
		createEReference(projectETAEClass, PROJECT_ETA__POSITION);
		createEAttribute(projectETAEClass, PROJECT_ETA__RADIUS);
		createEAttribute(projectETAEClass, PROJECT_ETA__COLOR);
		createEAttribute(projectETAEClass, PROJECT_ETA__ORIENTATION);

		visualisationCapabilityEClass = createEClass(VISUALISATION_CAPABILITY);

		qaVisualisationCapabilityEClass = createEClass(QA_VISUALISATION_CAPABILITY);
		createEAttribute(qaVisualisationCapabilityEClass, QA_VISUALISATION_CAPABILITY__QA_RESULT);

		provisioningEClass = createEClass(PROVISIONING);

		notifyWorkerEClass = createEClass(NOTIFY_WORKER);
		createEAttribute(notifyWorkerEClass, NOTIFY_WORKER__CONTENT);

		changingQuantityEClass = createEClass(CHANGING_QUANTITY);

		movingEClass = createEClass(MOVING);

		securingEClass = createEClass(SECURING);

		checkingEClass = createEClass(CHECKING);

		swivelEClass = createEClass(SWIVEL);

		orientatingEClass = createEClass(ORIENTATING);

		placingEClass = createEClass(PLACING);

		orderingEClass = createEClass(ORDERING);

		guidingEClass = createEClass(GUIDING);

		passingOnEClass = createEClass(PASSING_ON);

		conveyingEClass = createEClass(CONVEYING);

		takeEClass = createEClass(TAKE);

		testCapabilityEClass = createEClass(TEST_CAPABILITY);

		// Create enums
		loadCarrierUnitEnumEEnum = createEEnum(LOAD_CARRIER_UNIT_ENUM);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capabilityAssertionEClass.getESuperTypes().add(theBasePackage.getEntity());
		capabilityEClass.getESuperTypes().add(theBasePackage.getEntity());
		handlingEClass.getESuperTypes().add(this.getCapability());
		manufacturingCapabilityEClass.getESuperTypes().add(this.getProductionCapability());
		fügenEClass.getESuperTypes().add(this.getManufacturingCapability());
		pressingEClass.getESuperTypes().add(this.getAnEinpressen());
		urformenEClass.getESuperTypes().add(this.getManufacturingCapability());
		umformenEClass.getESuperTypes().add(this.getManufacturingCapability());
		trennenEClass.getESuperTypes().add(this.getManufacturingCapability());
		beschichtenEClass.getESuperTypes().add(this.getManufacturingCapability());
		stoffeigenschaftenEClass.getESuperTypes().add(this.getManufacturingCapability());
		anEinpressenEClass.getESuperTypes().add(this.getFügen());
		screwingEClass.getESuperTypes().add(this.getAnEinpressen());
		productionCapabilityEClass.getESuperTypes().add(this.getCapability());
		logisticsCapabilityEClass.getESuperTypes().add(this.getCapability());
		pickAndPlaceEClass.getESuperTypes().add(this.getLogisticsCapability());
		transportEClass.getESuperTypes().add(this.getLogisticsCapability());
		bufferingEClass.getESuperTypes().add(this.getHandling());
		qoSCapabilityEClass.getESuperTypes().add(this.getCapability());
		inspectEClass.getESuperTypes().add(this.getQoSCapability());
		workerAssistenceCapabilityEClass.getESuperTypes().add(this.getCapability());
		interactionCapabilityEClass.getESuperTypes().add(this.getWorkerAssistenceCapability());
		confirmationCapabilityEClass.getESuperTypes().add(this.getWorkerAssistenceCapability());
		switchConfirmationCapabilityEClass.getESuperTypes().add(this.getConfirmationCapability());
		generalCapabilityEClass.getESuperTypes().add(this.getCapability());
		moveToLocationEClass.getESuperTypes().add(this.getGeneralCapability());
		projectPathEClass.getESuperTypes().add(this.getWorkerAssistenceCapability());
		projectETAEClass.getESuperTypes().add(this.getWorkerAssistenceCapability());
		visualisationCapabilityEClass.getESuperTypes().add(this.getWorkerAssistenceCapability());
		qaVisualisationCapabilityEClass.getESuperTypes().add(this.getVisualisationCapability());
		provisioningEClass.getESuperTypes().add(this.getLogisticsCapability());
		notifyWorkerEClass.getESuperTypes().add(this.getWorkerAssistenceCapability());
		changingQuantityEClass.getESuperTypes().add(this.getHandling());
		movingEClass.getESuperTypes().add(this.getHandling());
		securingEClass.getESuperTypes().add(this.getHandling());
		checkingEClass.getESuperTypes().add(this.getHandling());
		swivelEClass.getESuperTypes().add(this.getMoving());
		orientatingEClass.getESuperTypes().add(this.getMoving());
		placingEClass.getESuperTypes().add(this.getMoving());
		orderingEClass.getESuperTypes().add(this.getMoving());
		guidingEClass.getESuperTypes().add(this.getMoving());
		passingOnEClass.getESuperTypes().add(this.getMoving());
		conveyingEClass.getESuperTypes().add(this.getMoving());
		takeEClass.getESuperTypes().add(this.getGeneralCapability());
		testCapabilityEClass.getESuperTypes().add(this.getCapability());

		// Initialize classes, features, and operations; add parameters
		initEClass(capabilityAssertionEClass, CapabilityAssertion.class, "CapabilityAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityAssertion_Pattern(), thePatternPackage.getPObject(), null, "pattern", null, 0, 1, CapabilityAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityAssertion_Prerequisites(), this.getCapabilityAssertion(), null, "prerequisites", null, 0, 1, CapabilityAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityRequestEClass, CapabilityRequest.class, "CapabilityRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityRequest_Who(), theBasePackage.getEntity(), null, "who", null, 0, 1, CapabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityRequest_What(), this.getCapability(), null, "what", null, 0, 1, CapabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityRequest_Whom(), theBasePackage.getEntity(), null, "whom", null, 0, -1, CapabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityRequest_Where(), theBasePackage.getEntity(), null, "where", null, 0, -1, CapabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityRequest_When(), ecorePackage.getEDate(), "when", null, 0, 1, CapabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityRequest_How(), theBasePackage.getEntity(), null, "how", null, 0, -1, CapabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(handlingEClass, Handling.class, "Handling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manufacturingCapabilityEClass, ManufacturingCapability.class, "ManufacturingCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fügenEClass, Fügen.class, "Fügen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressingEClass, Pressing.class, "Pressing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressing_Pressure(), ecorePackage.getEDouble(), "pressure", null, 0, 1, Pressing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPressing_Stroke(), ecorePackage.getEDouble(), "stroke", null, 0, 1, Pressing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urformenEClass, Urformen.class, "Urformen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umformenEClass, Umformen.class, "Umformen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trennenEClass, Trennen.class, "Trennen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beschichtenEClass, Beschichten.class, "Beschichten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stoffeigenschaftenEClass, Stoffeigenschaften.class, "Stoffeigenschaften", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anEinpressenEClass, AnEinpressen.class, "AnEinpressen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingEClass, Screwing.class, "Screwing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScrewing_Torque(), ecorePackage.getEDouble(), "torque", null, 0, 1, Screwing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionCapabilityEClass, ProductionCapability.class, "ProductionCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logisticsCapabilityEClass, LogisticsCapability.class, "LogisticsCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogisticsCapability_LoadCarrierUnit(), this.getLoadCarrierUnitEnum(), "loadCarrierUnit", "UNDEFINED", 0, 1, LogisticsCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogisticsCapability_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, LogisticsCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogisticsCapability_Payload(), ecorePackage.getEDouble(), "payload", null, 0, 1, LogisticsCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pickAndPlaceEClass, PickAndPlace.class, "PickAndPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPickAndPlace_Reach(), ecorePackage.getEDouble(), "reach", "0.0", 0, 1, PickAndPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPickAndPlace_PositionRepeatability(), ecorePackage.getEDouble(), "positionRepeatability", null, 0, 1, PickAndPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportEClass, Transport.class, "Transport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransport_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1, Transport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bufferingEClass, Buffering.class, "Buffering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qoSCapabilityEClass, QoSCapability.class, "QoSCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inspectEClass, Inspect.class, "Inspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workerAssistenceCapabilityEClass, WorkerAssistenceCapability.class, "WorkerAssistenceCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionCapabilityEClass, InteractionCapability.class, "InteractionCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionCapability_Topic(), theEcorePackage.getEString(), "topic", null, 0, 1, InteractionCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confirmationCapabilityEClass, ConfirmationCapability.class, "ConfirmationCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchConfirmationCapabilityEClass, SwitchConfirmationCapability.class, "SwitchConfirmationCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchConfirmationCapability_State(), theEcorePackage.getEInt(), "State", null, 0, 1, SwitchConfirmationCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalCapabilityEClass, GeneralCapability.class, "GeneralCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveToLocationEClass, MoveToLocation.class, "MoveToLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveToLocation_TargetLocation(), theTopologyPackage.getTopologyElement(), null, "targetLocation", null, 0, 1, MoveToLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectPathEClass, ProjectPath.class, "ProjectPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectPath_Path(), theDataPackage.getPath(), null, "path", null, 0, 1, ProjectPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectPath_Delay(), theEcorePackage.getELong(), "delay", null, 0, 1, ProjectPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectPath_ArrowCount(), theEcorePackage.getEInt(), "arrowCount", null, 0, 1, ProjectPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectPath_Color(), theEcorePackage.getEInt(), "color", null, 0, 1, ProjectPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectPath_Eta(), theEcorePackage.getELong(), "eta", null, 0, 1, ProjectPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectETAEClass, ProjectETA.class, "ProjectETA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectETA_Eta(), theEcorePackage.getELong(), "eta", null, 0, 1, ProjectETA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectETA_Position(), theDataPackage.getCartesianCoordinate(), null, "position", null, 0, 1, ProjectETA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectETA_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, ProjectETA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectETA_Color(), theEcorePackage.getEInt(), "color", null, 0, 1, ProjectETA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectETA_Orientation(), theEcorePackage.getEInt(), "orientation", null, 0, 1, ProjectETA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualisationCapabilityEClass, VisualisationCapability.class, "VisualisationCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qaVisualisationCapabilityEClass, QAVisualisationCapability.class, "QAVisualisationCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQAVisualisationCapability_QaResult(), theEcorePackage.getEBoolean(), "qaResult", null, 0, 1, QAVisualisationCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provisioningEClass, Provisioning.class, "Provisioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notifyWorkerEClass, NotifyWorker.class, "NotifyWorker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotifyWorker_Content(), theEcorePackage.getEString(), "content", null, 0, 1, NotifyWorker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changingQuantityEClass, ChangingQuantity.class, "ChangingQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(movingEClass, Moving.class, "Moving", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securingEClass, Securing.class, "Securing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkingEClass, Checking.class, "Checking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swivelEClass, Swivel.class, "Swivel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orientatingEClass, Orientating.class, "Orientating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placingEClass, Placing.class, "Placing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderingEClass, Ordering.class, "Ordering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guidingEClass, Guiding.class, "Guiding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passingOnEClass, PassingOn.class, "PassingOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conveyingEClass, Conveying.class, "Conveying", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(takeEClass, Take.class, "Take", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testCapabilityEClass, TestCapability.class, "TestCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(loadCarrierUnitEnumEEnum, LoadCarrierUnitEnum.class, "LoadCarrierUnitEnum");
		addEEnumLiteral(loadCarrierUnitEnumEEnum, LoadCarrierUnitEnum.UNDEFINED);
		addEEnumLiteral(loadCarrierUnitEnumEEnum, LoadCarrierUnitEnum.MATERIAL);
		addEEnumLiteral(loadCarrierUnitEnumEEnum, LoadCarrierUnitEnum.RKLT_3215);
		addEEnumLiteral(loadCarrierUnitEnumEEnum, LoadCarrierUnitEnum.BOTTLE);
		addEEnumLiteral(loadCarrierUnitEnumEEnum, LoadCarrierUnitEnum.TOOL);

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
