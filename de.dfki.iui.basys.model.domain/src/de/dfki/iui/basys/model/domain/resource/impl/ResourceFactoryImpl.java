/**
 */
package de.dfki.iui.basys.model.domain.resource.impl;

import de.dfki.iui.basys.model.domain.resource.*;

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
public class ResourceFactoryImpl extends EFactoryImpl implements ResourceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceFactory init() {
		try {
			ResourceFactory theResourceFactory = (ResourceFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcePackage.eNS_URI);
			if (theResourceFactory != null) {
				return theResourceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceFactoryImpl() {
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
			case ResourcePackage.RESOURCE_TYPE_CATALOGUE: return createResourceTypeCatalogue();
			case ResourcePackage.RESOURCE_TYPE: return createResourceType();
			case ResourcePackage.DISCRETE_MANUFACTURING_EQUIPMENT_MODULE: return createDiscreteManufacturingEquipmentModule();
			case ResourcePackage.TOOL: return createTool();
			case ResourcePackage.STATIONARY_TOOL: return createStationaryTool();
			case ResourcePackage.MOVABLE_TOOL: return createMovableTool();
			case ResourcePackage.TRANSPORT: return createTransport();
			case ResourcePackage.STORAGE: return createStorage();
			case ResourcePackage.FIXTURE: return createFixture();
			case ResourcePackage.GATE: return createGate();
			case ResourcePackage.ROBOT: return createRobot();
			case ResourcePackage.CARRIER: return createCarrier();
			case ResourcePackage.MACHINE: return createMachine();
			case ResourcePackage.STATIC_OBJECT: return createStaticObject();
			case ResourcePackage.TURNABLE: return createTurnable();
			case ResourcePackage.CONVEYOR: return createConveyor();
			case ResourcePackage.LIFTING_TABLE: return createLiftingTable();
			case ResourcePackage.AVG: return createAVG();
			case ResourcePackage.TRANSPOSER: return createTransposer();
			case ResourcePackage.CARRIER_HANDLING_SYSTEM: return createCarrierHandlingSystem();
			case ResourcePackage.LIFT: return createLift();
			case ResourcePackage.VERTICAL_TRANSPORT: return createVerticalTransport();
			case ResourcePackage.HORIZONTAL_TRANSPORT: return createHorizontalTransport();
			case ResourcePackage.ROLLERBED: return createRollerbed();
			case ResourcePackage.LOADER: return createLoader();
			case ResourcePackage.UNLOADER: return createUnloader();
			case ResourcePackage.BODY_STORE: return createBodyStore();
			case ResourcePackage.CLAMP: return createClamp();
			case ResourcePackage.BELT_CONVEYOR: return createBeltConveyor();
			case ResourcePackage.ROLL_CONVEYOR: return createRollConveyor();
			case ResourcePackage.CHAIN_CONVEYOR: return createChainConveyor();
			case ResourcePackage.PALLET_CONVEYOR: return createPalletConveyor();
			case ResourcePackage.OVERHEAD_CONVEYOR: return createOverheadConveyor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public ResourcePackage getResourcePackage() {
		return (ResourcePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcePackage getPackage() {
		return ResourcePackage.eINSTANCE;
	}

} //ResourceFactoryImpl
