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
	 * Returns a new object of class '<em>Equipment Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipment Module</em>'.
	 * @generated
	 */
	EquipmentModule createEquipmentModule();

	/**
	 * Returns a new object of class '<em>Control Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Module</em>'.
	 * @generated
	 */
	ControlModule createControlModule();

	/**
	 * Returns a new object of class '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station</em>'.
	 * @generated
	 */
	Station createStation();

	/**
	 * Returns a new object of class '<em>Process Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Unit</em>'.
	 * @generated
	 */
	ProcessUnit createProcessUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopologyPackage getTopologyPackage();

} //TopologyFactory
