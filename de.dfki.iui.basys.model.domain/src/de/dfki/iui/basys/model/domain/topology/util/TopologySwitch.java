/**
 */
package de.dfki.iui.basys.model.domain.topology.util;

import de.dfki.iui.basys.model.base.BObject;
import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.domain.topology.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage
 * @generated
 */
public class TopologySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TopologyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologySwitch() {
		if (modelPackage == null) {
			modelPackage = TopologyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TopologyPackage.ENTERPRISE: {
				Enterprise enterprise = (Enterprise)theEObject;
				T result = caseEnterprise(enterprise);
				if (result == null) result = caseEntity(enterprise);
				if (result == null) result = caseBObject(enterprise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.SITE: {
				Site site = (Site)theEObject;
				T result = caseSite(site);
				if (result == null) result = caseEntity(site);
				if (result == null) result = caseBObject(site);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = caseEntity(area);
				if (result == null) result = caseBObject(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.WORK_CENTER: {
				WorkCenter workCenter = (WorkCenter)theEObject;
				T result = caseWorkCenter(workCenter);
				if (result == null) result = caseEntity(workCenter);
				if (result == null) result = caseBObject(workCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PROCESS_CELL: {
				ProcessCell processCell = (ProcessCell)theEObject;
				T result = caseProcessCell(processCell);
				if (result == null) result = caseWorkCenter(processCell);
				if (result == null) result = caseEntity(processCell);
				if (result == null) result = caseBObject(processCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PRODUCTION_UNIT: {
				ProductionUnit productionUnit = (ProductionUnit)theEObject;
				T result = caseProductionUnit(productionUnit);
				if (result == null) result = caseWorkCenter(productionUnit);
				if (result == null) result = caseEntity(productionUnit);
				if (result == null) result = caseBObject(productionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PRODUCTION_LINE: {
				ProductionLine productionLine = (ProductionLine)theEObject;
				T result = caseProductionLine(productionLine);
				if (result == null) result = caseWorkCenter(productionLine);
				if (result == null) result = caseEntity(productionLine);
				if (result == null) result = caseBObject(productionLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STORAGE_ZONE: {
				StorageZone storageZone = (StorageZone)theEObject;
				T result = caseStorageZone(storageZone);
				if (result == null) result = caseWorkCenter(storageZone);
				if (result == null) result = caseEntity(storageZone);
				if (result == null) result = caseBObject(storageZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.WORK_UNIT: {
				WorkUnit workUnit = (WorkUnit)theEObject;
				T result = caseWorkUnit(workUnit);
				if (result == null) result = caseEntity(workUnit);
				if (result == null) result = caseBObject(workUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseWorkUnit(unit);
				if (result == null) result = caseEntity(unit);
				if (result == null) result = caseBObject(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.WORK_CELL: {
				WorkCell workCell = (WorkCell)theEObject;
				T result = caseWorkCell(workCell);
				if (result == null) result = caseWorkUnit(workCell);
				if (result == null) result = caseEntity(workCell);
				if (result == null) result = caseBObject(workCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STORAGE_UNIT: {
				StorageUnit storageUnit = (StorageUnit)theEObject;
				T result = caseStorageUnit(storageUnit);
				if (result == null) result = caseWorkUnit(storageUnit);
				if (result == null) result = caseEntity(storageUnit);
				if (result == null) result = caseBObject(storageUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.EQUIPMENT_MODULE: {
				EquipmentModule equipmentModule = (EquipmentModule)theEObject;
				T result = caseEquipmentModule(equipmentModule);
				if (result == null) result = caseEntity(equipmentModule);
				if (result == null) result = caseBObject(equipmentModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.CONTROL_MODULE: {
				ControlModule controlModule = (ControlModule)theEObject;
				T result = caseControlModule(controlModule);
				if (result == null) result = caseEntity(controlModule);
				if (result == null) result = caseBObject(controlModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STATION: {
				Station station = (Station)theEObject;
				T result = caseStation(station);
				if (result == null) result = caseEntity(station);
				if (result == null) result = caseBObject(station);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.ASSEMBLY_STATION: {
				AssemblyStation assemblyStation = (AssemblyStation)theEObject;
				T result = caseAssemblyStation(assemblyStation);
				if (result == null) result = caseStation(assemblyStation);
				if (result == null) result = caseEntity(assemblyStation);
				if (result == null) result = caseBObject(assemblyStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.BUFFER_STATION: {
				BufferStation bufferStation = (BufferStation)theEObject;
				T result = caseBufferStation(bufferStation);
				if (result == null) result = caseStation(bufferStation);
				if (result == null) result = caseEntity(bufferStation);
				if (result == null) result = caseBObject(bufferStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PROCESS_UNIT: {
				ProcessUnit processUnit = (ProcessUnit)theEObject;
				T result = caseProcessUnit(processUnit);
				if (result == null) result = caseWorkUnit(processUnit);
				if (result == null) result = caseEntity(processUnit);
				if (result == null) result = caseBObject(processUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.DISCRETE_MANUFACTURING_EQUIPMENT_MODULE: {
				DiscreteManufacturingEquipmentModule discreteManufacturingEquipmentModule = (DiscreteManufacturingEquipmentModule)theEObject;
				T result = caseDiscreteManufacturingEquipmentModule(discreteManufacturingEquipmentModule);
				if (result == null) result = caseEquipmentModule(discreteManufacturingEquipmentModule);
				if (result == null) result = caseEntity(discreteManufacturingEquipmentModule);
				if (result == null) result = caseBObject(discreteManufacturingEquipmentModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(tool);
				if (result == null) result = caseEquipmentModule(tool);
				if (result == null) result = caseEntity(tool);
				if (result == null) result = caseBObject(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STATIONARY_TOOL: {
				StationaryTool stationaryTool = (StationaryTool)theEObject;
				T result = caseStationaryTool(stationaryTool);
				if (result == null) result = caseTool(stationaryTool);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(stationaryTool);
				if (result == null) result = caseEquipmentModule(stationaryTool);
				if (result == null) result = caseEntity(stationaryTool);
				if (result == null) result = caseBObject(stationaryTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.MOVABLE_TOOL: {
				MovableTool movableTool = (MovableTool)theEObject;
				T result = caseMovableTool(movableTool);
				if (result == null) result = caseTool(movableTool);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(movableTool);
				if (result == null) result = caseEquipmentModule(movableTool);
				if (result == null) result = caseEntity(movableTool);
				if (result == null) result = caseBObject(movableTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.TRANSPORT: {
				Transport transport = (Transport)theEObject;
				T result = caseTransport(transport);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(transport);
				if (result == null) result = caseEquipmentModule(transport);
				if (result == null) result = caseEntity(transport);
				if (result == null) result = caseBObject(transport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(storage);
				if (result == null) result = caseEquipmentModule(storage);
				if (result == null) result = caseEntity(storage);
				if (result == null) result = caseBObject(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.FIXTURE: {
				Fixture fixture = (Fixture)theEObject;
				T result = caseFixture(fixture);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(fixture);
				if (result == null) result = caseEquipmentModule(fixture);
				if (result == null) result = caseEntity(fixture);
				if (result == null) result = caseBObject(fixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(gate);
				if (result == null) result = caseEquipmentModule(gate);
				if (result == null) result = caseEntity(gate);
				if (result == null) result = caseBObject(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.ROBOT: {
				Robot robot = (Robot)theEObject;
				T result = caseRobot(robot);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(robot);
				if (result == null) result = caseEquipmentModule(robot);
				if (result == null) result = caseEntity(robot);
				if (result == null) result = caseBObject(robot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.CARRIER: {
				Carrier carrier = (Carrier)theEObject;
				T result = caseCarrier(carrier);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(carrier);
				if (result == null) result = caseEquipmentModule(carrier);
				if (result == null) result = caseEntity(carrier);
				if (result == null) result = caseBObject(carrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(machine);
				if (result == null) result = caseEquipmentModule(machine);
				if (result == null) result = caseEntity(machine);
				if (result == null) result = caseBObject(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.STATIC_OBJECT: {
				StaticObject staticObject = (StaticObject)theEObject;
				T result = caseStaticObject(staticObject);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(staticObject);
				if (result == null) result = caseEquipmentModule(staticObject);
				if (result == null) result = caseEntity(staticObject);
				if (result == null) result = caseBObject(staticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.TURNABLE: {
				Turnable turnable = (Turnable)theEObject;
				T result = caseTurnable(turnable);
				if (result == null) result = caseHorizontalTransport(turnable);
				if (result == null) result = caseTransport(turnable);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(turnable);
				if (result == null) result = caseEquipmentModule(turnable);
				if (result == null) result = caseEntity(turnable);
				if (result == null) result = caseBObject(turnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.CONVEYOR: {
				Conveyor conveyor = (Conveyor)theEObject;
				T result = caseConveyor(conveyor);
				if (result == null) result = caseHorizontalTransport(conveyor);
				if (result == null) result = caseTransport(conveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(conveyor);
				if (result == null) result = caseEquipmentModule(conveyor);
				if (result == null) result = caseEntity(conveyor);
				if (result == null) result = caseBObject(conveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.LIFTING_TABLE: {
				LiftingTable liftingTable = (LiftingTable)theEObject;
				T result = caseLiftingTable(liftingTable);
				if (result == null) result = caseVerticalTransport(liftingTable);
				if (result == null) result = caseTransport(liftingTable);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(liftingTable);
				if (result == null) result = caseEquipmentModule(liftingTable);
				if (result == null) result = caseEntity(liftingTable);
				if (result == null) result = caseBObject(liftingTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.AVG: {
				AVG avg = (AVG)theEObject;
				T result = caseAVG(avg);
				if (result == null) result = caseHorizontalTransport(avg);
				if (result == null) result = caseTransport(avg);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(avg);
				if (result == null) result = caseEquipmentModule(avg);
				if (result == null) result = caseEntity(avg);
				if (result == null) result = caseBObject(avg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.TRANSPOSER: {
				Transposer transposer = (Transposer)theEObject;
				T result = caseTransposer(transposer);
				if (result == null) result = caseTransport(transposer);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(transposer);
				if (result == null) result = caseEquipmentModule(transposer);
				if (result == null) result = caseEntity(transposer);
				if (result == null) result = caseBObject(transposer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.CARRIER_HANDLING_SYSTEM: {
				CarrierHandlingSystem carrierHandlingSystem = (CarrierHandlingSystem)theEObject;
				T result = caseCarrierHandlingSystem(carrierHandlingSystem);
				if (result == null) result = caseTransport(carrierHandlingSystem);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(carrierHandlingSystem);
				if (result == null) result = caseEquipmentModule(carrierHandlingSystem);
				if (result == null) result = caseEntity(carrierHandlingSystem);
				if (result == null) result = caseBObject(carrierHandlingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.LIFT: {
				Lift lift = (Lift)theEObject;
				T result = caseLift(lift);
				if (result == null) result = caseVerticalTransport(lift);
				if (result == null) result = caseTransport(lift);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(lift);
				if (result == null) result = caseEquipmentModule(lift);
				if (result == null) result = caseEntity(lift);
				if (result == null) result = caseBObject(lift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.VERTICAL_TRANSPORT: {
				VerticalTransport verticalTransport = (VerticalTransport)theEObject;
				T result = caseVerticalTransport(verticalTransport);
				if (result == null) result = caseTransport(verticalTransport);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(verticalTransport);
				if (result == null) result = caseEquipmentModule(verticalTransport);
				if (result == null) result = caseEntity(verticalTransport);
				if (result == null) result = caseBObject(verticalTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.HORIZONTAL_TRANSPORT: {
				HorizontalTransport horizontalTransport = (HorizontalTransport)theEObject;
				T result = caseHorizontalTransport(horizontalTransport);
				if (result == null) result = caseTransport(horizontalTransport);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(horizontalTransport);
				if (result == null) result = caseEquipmentModule(horizontalTransport);
				if (result == null) result = caseEntity(horizontalTransport);
				if (result == null) result = caseBObject(horizontalTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.ROLLERBED: {
				Rollerbed rollerbed = (Rollerbed)theEObject;
				T result = caseRollerbed(rollerbed);
				if (result == null) result = caseHorizontalTransport(rollerbed);
				if (result == null) result = caseTransport(rollerbed);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(rollerbed);
				if (result == null) result = caseEquipmentModule(rollerbed);
				if (result == null) result = caseEntity(rollerbed);
				if (result == null) result = caseBObject(rollerbed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.LOADER: {
				Loader loader = (Loader)theEObject;
				T result = caseLoader(loader);
				if (result == null) result = caseStorage(loader);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(loader);
				if (result == null) result = caseEquipmentModule(loader);
				if (result == null) result = caseEntity(loader);
				if (result == null) result = caseBObject(loader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.UNLOADER: {
				Unloader unloader = (Unloader)theEObject;
				T result = caseUnloader(unloader);
				if (result == null) result = caseStorage(unloader);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(unloader);
				if (result == null) result = caseEquipmentModule(unloader);
				if (result == null) result = caseEntity(unloader);
				if (result == null) result = caseBObject(unloader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.BODY_STORE: {
				BodyStore bodyStore = (BodyStore)theEObject;
				T result = caseBodyStore(bodyStore);
				if (result == null) result = caseStorage(bodyStore);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(bodyStore);
				if (result == null) result = caseEquipmentModule(bodyStore);
				if (result == null) result = caseEntity(bodyStore);
				if (result == null) result = caseBObject(bodyStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.CLAMP: {
				Clamp clamp = (Clamp)theEObject;
				T result = caseClamp(clamp);
				if (result == null) result = caseFixture(clamp);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(clamp);
				if (result == null) result = caseEquipmentModule(clamp);
				if (result == null) result = caseEntity(clamp);
				if (result == null) result = caseBObject(clamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.BELT_CONVEYOR: {
				BeltConveyor beltConveyor = (BeltConveyor)theEObject;
				T result = caseBeltConveyor(beltConveyor);
				if (result == null) result = caseConveyor(beltConveyor);
				if (result == null) result = caseHorizontalTransport(beltConveyor);
				if (result == null) result = caseTransport(beltConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(beltConveyor);
				if (result == null) result = caseEquipmentModule(beltConveyor);
				if (result == null) result = caseEntity(beltConveyor);
				if (result == null) result = caseBObject(beltConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.ROLL_CONVEYOR: {
				RollConveyor rollConveyor = (RollConveyor)theEObject;
				T result = caseRollConveyor(rollConveyor);
				if (result == null) result = caseConveyor(rollConveyor);
				if (result == null) result = caseHorizontalTransport(rollConveyor);
				if (result == null) result = caseTransport(rollConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(rollConveyor);
				if (result == null) result = caseEquipmentModule(rollConveyor);
				if (result == null) result = caseEntity(rollConveyor);
				if (result == null) result = caseBObject(rollConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.CHAIN_CONVEYOR: {
				ChainConveyor chainConveyor = (ChainConveyor)theEObject;
				T result = caseChainConveyor(chainConveyor);
				if (result == null) result = caseConveyor(chainConveyor);
				if (result == null) result = caseHorizontalTransport(chainConveyor);
				if (result == null) result = caseTransport(chainConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(chainConveyor);
				if (result == null) result = caseEquipmentModule(chainConveyor);
				if (result == null) result = caseEntity(chainConveyor);
				if (result == null) result = caseBObject(chainConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.PALLET_CONVEYOR: {
				PalletConveyor palletConveyor = (PalletConveyor)theEObject;
				T result = casePalletConveyor(palletConveyor);
				if (result == null) result = caseConveyor(palletConveyor);
				if (result == null) result = caseHorizontalTransport(palletConveyor);
				if (result == null) result = caseTransport(palletConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(palletConveyor);
				if (result == null) result = caseEquipmentModule(palletConveyor);
				if (result == null) result = caseEntity(palletConveyor);
				if (result == null) result = caseBObject(palletConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyPackage.OVERHEAD_CONVEYOR: {
				OverheadConveyor overheadConveyor = (OverheadConveyor)theEObject;
				T result = caseOverheadConveyor(overheadConveyor);
				if (result == null) result = caseConveyor(overheadConveyor);
				if (result == null) result = caseHorizontalTransport(overheadConveyor);
				if (result == null) result = caseTransport(overheadConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(overheadConveyor);
				if (result == null) result = caseEquipmentModule(overheadConveyor);
				if (result == null) result = caseEntity(overheadConveyor);
				if (result == null) result = caseBObject(overheadConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enterprise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterprise(Enterprise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSite(Site object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkCenter(WorkCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessCell(ProcessCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionUnit(ProductionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionLine(ProductionLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageZone(StorageZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkUnit(WorkUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkCell(WorkCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageUnit(StorageUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipmentModule(EquipmentModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlModule(ControlModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStation(Station object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyStation(AssemblyStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferStation(BufferStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessUnit(ProcessUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Manufacturing Equipment Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Manufacturing Equipment Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteManufacturingEquipmentModule(DiscreteManufacturingEquipmentModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stationary Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stationary Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationaryTool(StationaryTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movable Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movable Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovableTool(MovableTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransport(Transport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixture(Fixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrier(Carrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticObject(StaticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnable(Turnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyor(Conveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifting Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifting Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiftingTable(LiftingTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVG(AVG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transposer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transposer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransposer(Transposer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Handling System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Handling System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierHandlingSystem(CarrierHandlingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLift(Lift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalTransport(VerticalTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalTransport(HorizontalTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rollerbed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rollerbed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollerbed(Rollerbed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoader(Loader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unloader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unloader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnloader(Unloader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyStore(BodyStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClamp(Clamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belt Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belt Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeltConveyor(BeltConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roll Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roll Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollConveyor(RollConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainConveyor(ChainConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pallet Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pallet Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePalletConveyor(PalletConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overhead Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overhead Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverheadConveyor(OverheadConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TopologySwitch
