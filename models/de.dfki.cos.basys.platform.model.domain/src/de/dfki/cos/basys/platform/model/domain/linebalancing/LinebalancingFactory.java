/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage
 * @generated
 */
public interface LinebalancingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinebalancingFactory eINSTANCE = de.dfki.cos.basys.platform.model.domain.linebalancing.impl.LinebalancingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>WM Path Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WM Path Time</em>'.
	 * @generated
	 */
	WMPathTime createWMPathTime();

	/**
	 * Returns a new object of class '<em>Static World Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static World Model</em>'.
	 * @generated
	 */
	StaticWorldModel createStaticWorldModel();

	/**
	 * Returns a new object of class '<em>WM Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WM Product Instance</em>'.
	 * @generated
	 */
	WMProductInstance createWMProductInstance();

	/**
	 * Returns a new object of class '<em>WM Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WM Resource Instance</em>'.
	 * @generated
	 */
	WMResourceInstance createWMResourceInstance();

	/**
	 * Returns a new object of class '<em>World Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>World Model</em>'.
	 * @generated
	 */
	WorldModel createWorldModel();

	/**
	 * Returns a new object of class '<em>WM Path Times</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WM Path Times</em>'.
	 * @generated
	 */
	WMPathTimes createWMPathTimes();

	/**
	 * Returns a new object of class '<em>Line Balancing Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Balancing Assignment</em>'.
	 * @generated
	 */
	LineBalancingAssignment createLineBalancingAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LinebalancingPackage getLinebalancingPackage();

} //LinebalancingFactory
