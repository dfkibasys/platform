/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

import de.dfki.iui.basys.model.base.BasePackage;

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
 * @see de.dfki.iui.basys.model.domain.linebalancing.LinebalancingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface LinebalancingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linebalancing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/linebalancing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "linebalancing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinebalancingPackage eINSTANCE = de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBProductInstanceImpl <em>LB Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LBProductInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getLBProductInstance()
	 * @generated
	 */
	int LB_PRODUCT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_PRODUCT_INSTANCE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_PRODUCT_INSTANCE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_PRODUCT_INSTANCE__COMPONENT_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_PRODUCT_INSTANCE__WORKSTEP_INSTANCE_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_PRODUCT_INSTANCE__REMAINING_TIME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LB Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_PRODUCT_INSTANCE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>LB Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_PRODUCT_INSTANCE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl <em>LB Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getLBStaff()
	 * @generated
	 */
	int LB_STAFF = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF__ASSIGNMENT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Id src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF__COMPONENT_ID_SRC = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Id target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF__COMPONENT_ID_TARGET = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF__CURRENT_PRODUCT_INSTANCE_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remaining Movement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF__REMAINING_MOVEMENT_TIME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>LB Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>LB Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_STAFF_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBLocationsImpl <em>LB Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LBLocationsImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getLBLocations()
	 * @generated
	 */
	int LB_LOCATIONS = 2;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_LOCATIONS__STAFF = 0;

	/**
	 * The feature id for the '<em><b>Product Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_LOCATIONS__PRODUCT_INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>LB Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_LOCATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LB Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LB_LOCATIONS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance <em>LB Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LB Product Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance
	 * @generated
	 */
	EClass getLBProductInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getComponentId()
	 * @see #getLBProductInstance()
	 * @generated
	 */
	EAttribute getLBProductInstance_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getWorkstepInstanceId <em>Workstep Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getWorkstepInstanceId()
	 * @see #getLBProductInstance()
	 * @generated
	 */
	EAttribute getLBProductInstance_WorkstepInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getRemainingTime <em>Remaining Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Time</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance#getRemainingTime()
	 * @see #getLBProductInstance()
	 * @generated
	 */
	EAttribute getLBProductInstance_RemainingTime();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff <em>LB Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LB Staff</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBStaff
	 * @generated
	 */
	EClass getLBStaff();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getAssignment()
	 * @see #getLBStaff()
	 * @generated
	 */
	EAttribute getLBStaff_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getComponentId_src <em>Component Id src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id src</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getComponentId_src()
	 * @see #getLBStaff()
	 * @generated
	 */
	EAttribute getLBStaff_ComponentId_src();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getComponentId_target <em>Component Id target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id target</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getComponentId_target()
	 * @see #getLBStaff()
	 * @generated
	 */
	EAttribute getLBStaff_ComponentId_target();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getCurrentProductInstanceId <em>Current Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getCurrentProductInstanceId()
	 * @see #getLBStaff()
	 * @generated
	 */
	EAttribute getLBStaff_CurrentProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getRemainingMovementTime <em>Remaining Movement Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Movement Time</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBStaff#getRemainingMovementTime()
	 * @see #getLBStaff()
	 * @generated
	 */
	EAttribute getLBStaff_RemainingMovementTime();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.LBLocations <em>LB Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LB Locations</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBLocations
	 * @generated
	 */
	EClass getLBLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.linebalancing.LBLocations#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBLocations#getStaff()
	 * @see #getLBLocations()
	 * @generated
	 */
	EReference getLBLocations_Staff();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.linebalancing.LBLocations#getProductInstances <em>Product Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Instances</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LBLocations#getProductInstances()
	 * @see #getLBLocations()
	 * @generated
	 */
	EReference getLBLocations_ProductInstances();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinebalancingFactory getLinebalancingFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBProductInstanceImpl <em>LB Product Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LBProductInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getLBProductInstance()
		 * @generated
		 */
		EClass LB_PRODUCT_INSTANCE = eINSTANCE.getLBProductInstance();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LB_PRODUCT_INSTANCE__COMPONENT_ID = eINSTANCE.getLBProductInstance_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Workstep Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LB_PRODUCT_INSTANCE__WORKSTEP_INSTANCE_ID = eINSTANCE.getLBProductInstance_WorkstepInstanceId();

		/**
		 * The meta object literal for the '<em><b>Remaining Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LB_PRODUCT_INSTANCE__REMAINING_TIME = eINSTANCE.getLBProductInstance_RemainingTime();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl <em>LB Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getLBStaff()
		 * @generated
		 */
		EClass LB_STAFF = eINSTANCE.getLBStaff();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LB_STAFF__ASSIGNMENT = eINSTANCE.getLBStaff_Assignment();

		/**
		 * The meta object literal for the '<em><b>Component Id src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LB_STAFF__COMPONENT_ID_SRC = eINSTANCE.getLBStaff_ComponentId_src();

		/**
		 * The meta object literal for the '<em><b>Component Id target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LB_STAFF__COMPONENT_ID_TARGET = eINSTANCE.getLBStaff_ComponentId_target();

		/**
		 * The meta object literal for the '<em><b>Current Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LB_STAFF__CURRENT_PRODUCT_INSTANCE_ID = eINSTANCE.getLBStaff_CurrentProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Remaining Movement Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LB_STAFF__REMAINING_MOVEMENT_TIME = eINSTANCE.getLBStaff_RemainingMovementTime();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBLocationsImpl <em>LB Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LBLocationsImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getLBLocations()
		 * @generated
		 */
		EClass LB_LOCATIONS = eINSTANCE.getLBLocations();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LB_LOCATIONS__STAFF = eINSTANCE.getLBLocations_Staff();

		/**
		 * The meta object literal for the '<em><b>Product Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LB_LOCATIONS__PRODUCT_INSTANCES = eINSTANCE.getLBLocations_ProductInstances();

	}

} //LinebalancingPackage
