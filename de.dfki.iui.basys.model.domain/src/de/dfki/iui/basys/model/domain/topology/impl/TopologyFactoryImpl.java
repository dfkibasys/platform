/**
 */
package de.dfki.iui.basys.model.domain.topology.impl;

import de.dfki.iui.basys.model.domain.topology.*;

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
public class TopologyFactoryImpl extends EFactoryImpl implements TopologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopologyFactory init() {
		try {
			TopologyFactory theTopologyFactory = (TopologyFactory)EPackage.Registry.INSTANCE.getEFactory(TopologyPackage.eNS_URI);
			if (theTopologyFactory != null) {
				return theTopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyFactoryImpl() {
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
			case TopologyPackage.ENTERPRISE: return createEnterprise();
			case TopologyPackage.SITE: return createSite();
			case TopologyPackage.AREA: return createArea();
			case TopologyPackage.PROCESS_CELL: return createProcessCell();
			case TopologyPackage.PRODUCTION_UNIT: return createProductionUnit();
			case TopologyPackage.PRODUCTION_LINE: return createProductionLine();
			case TopologyPackage.STORAGE_ZONE: return createStorageZone();
			case TopologyPackage.UNIT: return createUnit();
			case TopologyPackage.WORK_CELL: return createWorkCell();
			case TopologyPackage.STORAGE_UNIT: return createStorageUnit();
			case TopologyPackage.STATION: return createStation();
			case TopologyPackage.TRANSITION: return createTransition();
			case TopologyPackage.ASSEMBLY_STATION: return createAssemblyStation();
			case TopologyPackage.BUFFER_STATION: return createBufferStation();
			case TopologyPackage.PROCESS_UNIT: return createProcessUnit();
			case TopologyPackage.TOOL: return createTool();
			case TopologyPackage.STATIONARY_TOOL: return createStationaryTool();
			case TopologyPackage.MOVABLE_TOOL: return createMovableTool();
			case TopologyPackage.TRANSPORT: return createTransport();
			case TopologyPackage.STORAGE: return createStorage();
			case TopologyPackage.FIXTURE: return createFixture();
			case TopologyPackage.GATE: return createGate();
			case TopologyPackage.ROBOT: return createRobot();
			case TopologyPackage.CARRIER: return createCarrier();
			case TopologyPackage.MACHINE: return createMachine();
			case TopologyPackage.STATIC_OBJECT: return createStaticObject();
			case TopologyPackage.TURNABLE: return createTurnable();
			case TopologyPackage.CONVEYOR: return createConveyor();
			case TopologyPackage.LIFTING_TABLE: return createLiftingTable();
			case TopologyPackage.AVG: return createAVG();
			case TopologyPackage.TRANSPOSER: return createTransposer();
			case TopologyPackage.CARRIER_HANDLING_SYSTEM: return createCarrierHandlingSystem();
			case TopologyPackage.LIFT: return createLift();
			case TopologyPackage.VERTICAL_TRANSPORT: return createVerticalTransport();
			case TopologyPackage.HORIZONTAL_TRANSPORT: return createHorizontalTransport();
			case TopologyPackage.ROLLERBED: return createRollerbed();
			case TopologyPackage.LOADER: return createLoader();
			case TopologyPackage.UNLOADER: return createUnloader();
			case TopologyPackage.BODY_STORE: return createBodyStore();
			case TopologyPackage.CLAMP: return createClamp();
			case TopologyPackage.BELT_CONVEYOR: return createBeltConveyor();
			case TopologyPackage.ROLL_CONVEYOR: return createRollConveyor();
			case TopologyPackage.CHAIN_CONVEYOR: return createChainConveyor();
			case TopologyPackage.PALLET_CONVEYOR: return createPalletConveyor();
			case TopologyPackage.OVERHEAD_CONVEYOR: return createOverheadConveyor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enterprise createEnterprise() {
		EnterpriseImpl enterprise = new EnterpriseImpl();
		return enterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessCell createProcessCell() {
		ProcessCellImpl processCell = new ProcessCellImpl();
		return processCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionUnit createProductionUnit() {
		ProductionUnitImpl productionUnit = new ProductionUnitImpl();
		return productionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLine createProductionLine() {
		ProductionLineImpl productionLine = new ProductionLineImpl();
		return productionLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageZone createStorageZone() {
		StorageZoneImpl storageZone = new StorageZoneImpl();
		return storageZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCell createWorkCell() {
		WorkCellImpl workCell = new WorkCellImpl();
		return workCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageUnit createStorageUnit() {
		StorageUnitImpl storageUnit = new StorageUnitImpl();
		return storageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station createStation() {
		StationImpl station = new StationImpl();
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyStation createAssemblyStation() {
		AssemblyStationImpl assemblyStation = new AssemblyStationImpl();
		return assemblyStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferStation createBufferStation() {
		BufferStationImpl bufferStation = new BufferStationImpl();
		return bufferStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessUnit createProcessUnit() {
		ProcessUnitImpl processUnit = new ProcessUnitImpl();
		return processUnit;
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
	public TopologyPackage getTopologyPackage() {
		return (TopologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopologyPackage getPackage() {
		return TopologyPackage.eINSTANCE;
	}

} //TopologyFactoryImpl
