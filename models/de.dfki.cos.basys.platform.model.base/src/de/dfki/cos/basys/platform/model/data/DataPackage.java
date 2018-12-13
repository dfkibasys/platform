/**
 */
package de.dfki.cos.basys.platform.model.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.data.DataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = de.dfki.cos.basys.platform.model.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.data.impl.CartesianCoordinateImpl <em>Cartesian Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.data.impl.CartesianCoordinateImpl
	 * @see de.dfki.cos.basys.platform.model.data.impl.DataPackageImpl#getCartesianCoordinate()
	 * @generated
	 */
	int CARTESIAN_COORDINATE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE__Z = 2;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cartesian Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.data.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.data.impl.PathImpl
	 * @see de.dfki.cos.basys.platform.model.data.impl.DataPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 1;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__COORDINATES = 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.data.impl.RobotPositionInformationImpl <em>Robot Position Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.data.impl.RobotPositionInformationImpl
	 * @see de.dfki.cos.basys.platform.model.data.impl.DataPackageImpl#getRobotPositionInformation()
	 * @generated
	 */
	int ROBOT_POSITION_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_POSITION_INFORMATION__ETA = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_POSITION_INFORMATION__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Robot Position Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_POSITION_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Robot Position Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_POSITION_INFORMATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate <em>Cartesian Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinate</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.CartesianCoordinate
	 * @generated
	 */
	EClass getCartesianCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getX()
	 * @see #getCartesianCoordinate()
	 * @generated
	 */
	EAttribute getCartesianCoordinate_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getY()
	 * @see #getCartesianCoordinate()
	 * @generated
	 */
	EAttribute getCartesianCoordinate_Y();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.CartesianCoordinate#getZ()
	 * @see #getCartesianCoordinate()
	 * @generated
	 */
	EAttribute getCartesianCoordinate_Z();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.data.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.data.Path#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinates</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.Path#getCoordinates()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Coordinates();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.data.RobotPositionInformation <em>Robot Position Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Position Information</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.RobotPositionInformation
	 * @generated
	 */
	EClass getRobotPositionInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.data.RobotPositionInformation#getEta <em>Eta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eta</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.RobotPositionInformation#getEta()
	 * @see #getRobotPositionInformation()
	 * @generated
	 */
	EAttribute getRobotPositionInformation_Eta();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.data.RobotPositionInformation#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.dfki.cos.basys.platform.model.data.RobotPositionInformation#getPosition()
	 * @see #getRobotPositionInformation()
	 * @generated
	 */
	EReference getRobotPositionInformation_Position();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.data.impl.CartesianCoordinateImpl <em>Cartesian Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.data.impl.CartesianCoordinateImpl
		 * @see de.dfki.cos.basys.platform.model.data.impl.DataPackageImpl#getCartesianCoordinate()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATE = eINSTANCE.getCartesianCoordinate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATE__X = eINSTANCE.getCartesianCoordinate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATE__Y = eINSTANCE.getCartesianCoordinate_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATE__Z = eINSTANCE.getCartesianCoordinate_Z();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.data.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.data.impl.PathImpl
		 * @see de.dfki.cos.basys.platform.model.data.impl.DataPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__COORDINATES = eINSTANCE.getPath_Coordinates();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.data.impl.RobotPositionInformationImpl <em>Robot Position Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.data.impl.RobotPositionInformationImpl
		 * @see de.dfki.cos.basys.platform.model.data.impl.DataPackageImpl#getRobotPositionInformation()
		 * @generated
		 */
		EClass ROBOT_POSITION_INFORMATION = eINSTANCE.getRobotPositionInformation();

		/**
		 * The meta object literal for the '<em><b>Eta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_POSITION_INFORMATION__ETA = eINSTANCE.getRobotPositionInformation_Eta();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_POSITION_INFORMATION__POSITION = eINSTANCE.getRobotPositionInformation_Position();

	}

} //DataPackage
