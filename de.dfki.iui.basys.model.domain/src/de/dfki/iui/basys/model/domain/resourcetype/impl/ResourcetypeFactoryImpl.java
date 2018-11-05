/**
 */
package de.dfki.iui.basys.model.domain.resourcetype.impl;

import de.dfki.iui.basys.model.domain.resourcetype.*;

import org.eclipse.emf.ecore.EClass;
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
public class ResourcetypeFactoryImpl extends EFactoryImpl implements ResourcetypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourcetypeFactory init() {
		try {
			ResourcetypeFactory theResourcetypeFactory = (ResourcetypeFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcetypePackage.eNS_URI);
			if (theResourcetypeFactory != null) {
				return theResourcetypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcetypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcetypeFactoryImpl() {
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
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE_COLLECTION: return createResourceTypeCatalogueCollection();
			case ResourcetypePackage.RESOURCE_TYPE_CATALOGUE: return createResourceTypeCatalogue();
			case ResourcetypePackage.RESOURCE_TYPE: return createResourceType();
			case ResourcetypePackage.DISCRETE_MANUFACTURING_EQUIPMENT_MODULE: return createDiscreteManufacturingEquipmentModule();
			case ResourcetypePackage.TOOL: return createTool();
			case ResourcetypePackage.STATIONARY_TOOL: return createStationaryTool();
			case ResourcetypePackage.MOVABLE_TOOL: return createMovableTool();
			case ResourcetypePackage.TRANSPORT: return createTransport();
			case ResourcetypePackage.STORAGE: return createStorage();
			case ResourcetypePackage.FIXTURE: return createFixture();
			case ResourcetypePackage.GATE: return createGate();
			case ResourcetypePackage.ROBOT: return createRobot();
			case ResourcetypePackage.CARRIER: return createCarrier();
			case ResourcetypePackage.MACHINE: return createMachine();
			case ResourcetypePackage.STATIC_OBJECT: return createStaticObject();
			case ResourcetypePackage.TURNABLE: return createTurnable();
			case ResourcetypePackage.CONVEYOR: return createConveyor();
			case ResourcetypePackage.LIFTING_TABLE: return createLiftingTable();
			case ResourcetypePackage.AVG: return createAVG();
			case ResourcetypePackage.TRANSPOSER: return createTransposer();
			case ResourcetypePackage.CARRIER_HANDLING_SYSTEM: return createCarrierHandlingSystem();
			case ResourcetypePackage.LIFT: return createLift();
			case ResourcetypePackage.VERTICAL_TRANSPORT: return createVerticalTransport();
			case ResourcetypePackage.HORIZONTAL_TRANSPORT: return createHorizontalTransport();
			case ResourcetypePackage.ROLLERBED: return createRollerbed();
			case ResourcetypePackage.LOADER: return createLoader();
			case ResourcetypePackage.UNLOADER: return createUnloader();
			case ResourcetypePackage.BODY_STORE: return createBodyStore();
			case ResourcetypePackage.CLAMP: return createClamp();
			case ResourcetypePackage.BELT_CONVEYOR: return createBeltConveyor();
			case ResourcetypePackage.ROLL_CONVEYOR: return createRollConveyor();
			case ResourcetypePackage.CHAIN_CONVEYOR: return createChainConveyor();
			case ResourcetypePackage.PALLET_CONVEYOR: return createPalletConveyor();
			case ResourcetypePackage.OVERHEAD_CONVEYOR: return createOverheadConveyor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeCatalogueCollection createResourceTypeCatalogueCollection() {
		ResourceTypeCatalogueCollectionImpl resourceTypeCatalogueCollection = new ResourceTypeCatalogueCollectionImpl();
		return resourceTypeCatalogueCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeCatalogue createResourceTypeCatalogue() {
		ResourceTypeCatalogueImpl resourceTypeCatalogue = new ResourceTypeCatalogueImpl();
		return resourceTypeCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteManufacturingEquipmentModule createDiscreteManufacturingEquipmentModule() {
		DiscreteManufacturingEquipmentModuleImpl discreteManufacturingEquipmentModule = new DiscreteManufacturingEquipmentModuleImpl();
		return discreteManufacturingEquipmentModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationaryTool createStationaryTool() {
		StationaryToolImpl stationaryTool = new StationaryToolImpl();
		return stationaryTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovableTool createMovableTool() {
		MovableToolImpl movableTool = new MovableToolImpl();
		return movableTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport createTransport() {
		TransportImpl transport = new TransportImpl();
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixture createFixture() {
		FixtureImpl fixture = new FixtureImpl();
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier createCarrier() {
		CarrierImpl carrier = new CarrierImpl();
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticObject createStaticObject() {
		StaticObjectImpl staticObject = new StaticObjectImpl();
		return staticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnable createTurnable() {
		TurnableImpl turnable = new TurnableImpl();
		return turnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiftingTable createLiftingTable() {
		LiftingTableImpl liftingTable = new LiftingTableImpl();
		return liftingTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVG createAVG() {
		AVGImpl avg = new AVGImpl();
		return avg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transposer createTransposer() {
		TransposerImpl transposer = new TransposerImpl();
		return transposer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierHandlingSystem createCarrierHandlingSystem() {
		CarrierHandlingSystemImpl carrierHandlingSystem = new CarrierHandlingSystemImpl();
		return carrierHandlingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lift createLift() {
		LiftImpl lift = new LiftImpl();
		return lift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalTransport createVerticalTransport() {
		VerticalTransportImpl verticalTransport = new VerticalTransportImpl();
		return verticalTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalTransport createHorizontalTransport() {
		HorizontalTransportImpl horizontalTransport = new HorizontalTransportImpl();
		return horizontalTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rollerbed createRollerbed() {
		RollerbedImpl rollerbed = new RollerbedImpl();
		return rollerbed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loader createLoader() {
		LoaderImpl loader = new LoaderImpl();
		return loader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unloader createUnloader() {
		UnloaderImpl unloader = new UnloaderImpl();
		return unloader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyStore createBodyStore() {
		BodyStoreImpl bodyStore = new BodyStoreImpl();
		return bodyStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clamp createClamp() {
		ClampImpl clamp = new ClampImpl();
		return clamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeltConveyor createBeltConveyor() {
		BeltConveyorImpl beltConveyor = new BeltConveyorImpl();
		return beltConveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollConveyor createRollConveyor() {
		RollConveyorImpl rollConveyor = new RollConveyorImpl();
		return rollConveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConveyor createChainConveyor() {
		ChainConveyorImpl chainConveyor = new ChainConveyorImpl();
		return chainConveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalletConveyor createPalletConveyor() {
		PalletConveyorImpl palletConveyor = new PalletConveyorImpl();
		return palletConveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadConveyor createOverheadConveyor() {
		OverheadConveyorImpl overheadConveyor = new OverheadConveyorImpl();
		return overheadConveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcetypePackage getResourcetypePackage() {
		return (ResourcetypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcetypePackage getPackage() {
		return ResourcetypePackage.eINSTANCE;
	}

} //ResourcetypeFactoryImpl
