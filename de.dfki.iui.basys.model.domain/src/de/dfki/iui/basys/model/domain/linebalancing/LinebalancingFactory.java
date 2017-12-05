/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage
 * @generated
 */
public interface LinebalancingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinebalancingFactory eINSTANCE = de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LB Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LB Product Instance</em>'.
	 * @generated
	 */
	LBProductInstance createLBProductInstance();

	/**
	 * Returns a new object of class '<em>LB Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LB Staff</em>'.
	 * @generated
	 */
	LBStaff createLBStaff();

	/**
	 * Returns a new object of class '<em>LB Locations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LB Locations</em>'.
	 * @generated
	 */
	LBLocations createLBLocations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LinebalancingPackage getLinebalancingPackage();

} //LinebalancingFactory
