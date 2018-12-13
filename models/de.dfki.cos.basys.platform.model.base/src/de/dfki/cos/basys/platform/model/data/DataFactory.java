/**
 */
package de.dfki.cos.basys.platform.model.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = de.dfki.cos.basys.platform.model.data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinate</em>'.
	 * @generated
	 */
	CartesianCoordinate createCartesianCoordinate();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Robot Position Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot Position Information</em>'.
	 * @generated
	 */
	RobotPositionInformation createRobotPositionInformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
