/**
 */
package de.dfki.iui.basys.model.domain.topology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage
 * @generated
 */
public interface TopologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyFactory eINSTANCE = de.dfki.iui.basys.model.domain.topology.impl.TopologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise</em>'.
	 * @generated
	 */
	Enterprise createEnterprise();

	/**
	 * Returns a new object of class '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site</em>'.
	 * @generated
	 */
	Site createSite();

	/**
	 * Returns a new object of class '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area</em>'.
	 * @generated
	 */
	Area createArea();

	/**
	 * Returns a new object of class '<em>Process Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Cell</em>'.
	 * @generated
	 */
	ProcessCell createProcessCell();

	/**
	 * Returns a new object of class '<em>Production Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production Unit</em>'.
	 * @generated
	 */
	ProductionUnit createProductionUnit();

	/**
	 * Returns a new object of class '<em>Production Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production Line</em>'.
	 * @generated
	 */
	ProductionLine createProductionLine();

	/**
	 * Returns a new object of class '<em>Storage Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Zone</em>'.
	 * @generated
	 */
	StorageZone createStorageZone();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Work Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Cell</em>'.
	 * @generated
	 */
	WorkCell createWorkCell();

	/**
	 * Returns a new object of class '<em>Storage Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Unit</em>'.
	 * @generated
	 */
	StorageUnit createStorageUnit();

	/**
	 * Returns a new object of class '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station</em>'.
	 * @generated
	 */
	Station createStation();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Assembly Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Station</em>'.
	 * @generated
	 */
	AssemblyStation createAssemblyStation();

	/**
	 * Returns a new object of class '<em>Buffer Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer Station</em>'.
	 * @generated
	 */
	BufferStation createBufferStation();

	/**
	 * Returns a new object of class '<em>Process Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Unit</em>'.
	 * @generated
	 */
	ProcessUnit createProcessUnit();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Stationary Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stationary Tool</em>'.
	 * @generated
	 */
	StationaryTool createStationaryTool();

	/**
	 * Returns a new object of class '<em>Movable Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Movable Tool</em>'.
	 * @generated
	 */
	MovableTool createMovableTool();

	/**
	 * Returns a new object of class '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport</em>'.
	 * @generated
	 */
	Transport createTransport();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixture</em>'.
	 * @generated
	 */
	Fixture createFixture();

	/**
	 * Returns a new object of class '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate</em>'.
	 * @generated
	 */
	Gate createGate();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier</em>'.
	 * @generated
	 */
	Carrier createCarrier();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Static Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Object</em>'.
	 * @generated
	 */
	StaticObject createStaticObject();

	/**
	 * Returns a new object of class '<em>Turnable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turnable</em>'.
	 * @generated
	 */
	Turnable createTurnable();

	/**
	 * Returns a new object of class '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor</em>'.
	 * @generated
	 */
	Conveyor createConveyor();

	/**
	 * Returns a new object of class '<em>Lifting Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lifting Table</em>'.
	 * @generated
	 */
	LiftingTable createLiftingTable();

	/**
	 * Returns a new object of class '<em>AVG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVG</em>'.
	 * @generated
	 */
	AVG createAVG();

	/**
	 * Returns a new object of class '<em>Transposer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transposer</em>'.
	 * @generated
	 */
	Transposer createTransposer();

	/**
	 * Returns a new object of class '<em>Carrier Handling System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Handling System</em>'.
	 * @generated
	 */
	CarrierHandlingSystem createCarrierHandlingSystem();

	/**
	 * Returns a new object of class '<em>Lift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lift</em>'.
	 * @generated
	 */
	Lift createLift();

	/**
	 * Returns a new object of class '<em>Vertical Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertical Transport</em>'.
	 * @generated
	 */
	VerticalTransport createVerticalTransport();

	/**
	 * Returns a new object of class '<em>Horizontal Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Transport</em>'.
	 * @generated
	 */
	HorizontalTransport createHorizontalTransport();

	/**
	 * Returns a new object of class '<em>Rollerbed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rollerbed</em>'.
	 * @generated
	 */
	Rollerbed createRollerbed();

	/**
	 * Returns a new object of class '<em>Loader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loader</em>'.
	 * @generated
	 */
	Loader createLoader();

	/**
	 * Returns a new object of class '<em>Unloader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unloader</em>'.
	 * @generated
	 */
	Unloader createUnloader();

	/**
	 * Returns a new object of class '<em>Body Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Store</em>'.
	 * @generated
	 */
	BodyStore createBodyStore();

	/**
	 * Returns a new object of class '<em>Clamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clamp</em>'.
	 * @generated
	 */
	Clamp createClamp();

	/**
	 * Returns a new object of class '<em>Belt Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Belt Conveyor</em>'.
	 * @generated
	 */
	BeltConveyor createBeltConveyor();

	/**
	 * Returns a new object of class '<em>Roll Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roll Conveyor</em>'.
	 * @generated
	 */
	RollConveyor createRollConveyor();

	/**
	 * Returns a new object of class '<em>Chain Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Conveyor</em>'.
	 * @generated
	 */
	ChainConveyor createChainConveyor();

	/**
	 * Returns a new object of class '<em>Pallet Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pallet Conveyor</em>'.
	 * @generated
	 */
	PalletConveyor createPalletConveyor();

	/**
	 * Returns a new object of class '<em>Overhead Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overhead Conveyor</em>'.
	 * @generated
	 */
	OverheadConveyor createOverheadConveyor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopologyPackage getTopologyPackage();

} //TopologyFactory
