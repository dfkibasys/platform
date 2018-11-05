/**
 */
package de.dfki.iui.basys.model.domain.linebalancing;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMPathTimeImpl <em>WM Path Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WMPathTimeImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWMPathTime()
	 * @generated
	 */
	int WM_PATH_TIME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PATH_TIME__TIME = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PATH_TIME__TO = 1;

	/**
	 * The number of structural features of the '<em>WM Path Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PATH_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WM Path Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PATH_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.StaticWorldModelImpl <em>Static World Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.StaticWorldModelImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getStaticWorldModel()
	 * @generated
	 */
	int STATIC_WORLD_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Path Times</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_WORLD_MODEL__PATH_TIMES = 0;

	/**
	 * The number of structural features of the '<em>Static World Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_WORLD_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Static World Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_WORLD_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl <em>WM Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWMProductInstance()
	 * @generated
	 */
	int WM_PRODUCT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Serial Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PRODUCT_INSTANCE__SERIAL_ID = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PRODUCT_INSTANCE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>In transit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PRODUCT_INSTANCE__IN_TRANSIT = 2;

	/**
	 * The feature id for the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PRODUCT_INSTANCE__ETA = 3;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PRODUCT_INSTANCE__VARIANT = 4;

	/**
	 * The number of structural features of the '<em>WM Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PRODUCT_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>WM Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PRODUCT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMResourceInstanceImpl <em>WM Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WMResourceInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWMResourceInstance()
	 * @generated
	 */
	int WM_RESOURCE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Serial Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_RESOURCE_INSTANCE__SERIAL_ID = 0;

	/**
	 * The feature id for the '<em><b>From position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_RESOURCE_INSTANCE__FROM_POSITION = 1;

	/**
	 * The feature id for the '<em><b>To position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_RESOURCE_INSTANCE__TO_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_RESOURCE_INSTANCE__ETA = 3;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_RESOURCE_INSTANCE__CAPABILITIES = 4;

	/**
	 * The number of structural features of the '<em>WM Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_RESOURCE_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>WM Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_RESOURCE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WorldModelImpl <em>World Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WorldModelImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWorldModel()
	 * @generated
	 */
	int WORLD_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Product Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MODEL__PRODUCT_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Resource Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MODEL__RESOURCE_INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>World Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>World Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMPathTimesImpl <em>WM Path Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WMPathTimesImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWMPathTimes()
	 * @generated
	 */
	int WM_PATH_TIMES = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PATH_TIMES__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PATH_TIMES__TO = 1;

	/**
	 * The number of structural features of the '<em>WM Path Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PATH_TIMES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WM Path Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WM_PATH_TIMES_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LineBalancingAssignmentImpl <em>Line Balancing Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LineBalancingAssignmentImpl
	 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getLineBalancingAssignment()
	 * @generated
	 */
	int LINE_BALANCING_ASSIGNMENT = 6;

	/**
	 * The feature id for the '<em><b>Resource Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BALANCING_ASSIGNMENT__RESOURCE_INSTANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BALANCING_ASSIGNMENT__ORDER = 1;

	/**
	 * The number of structural features of the '<em>Line Balancing Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BALANCING_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line Balancing Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BALANCING_ASSIGNMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime <em>WM Path Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WM Path Time</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMPathTime
	 * @generated
	 */
	EClass getWMPathTime();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMPathTime#getTime()
	 * @see #getWMPathTime()
	 * @generated
	 */
	EAttribute getWMPathTime_Time();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTime#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMPathTime#getTo()
	 * @see #getWMPathTime()
	 * @generated
	 */
	EReference getWMPathTime_To();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel <em>Static World Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static World Model</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel
	 * @generated
	 */
	EClass getStaticWorldModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel#getPathTimes <em>Path Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Times</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.StaticWorldModel#getPathTimes()
	 * @see #getStaticWorldModel()
	 * @generated
	 */
	EReference getStaticWorldModel_PathTimes();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance <em>WM Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WM Product Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance
	 * @generated
	 */
	EClass getWMProductInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#getSerialId <em>Serial Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#getSerialId()
	 * @see #getWMProductInstance()
	 * @generated
	 */
	EAttribute getWMProductInstance_SerialId();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#getPosition()
	 * @see #getWMProductInstance()
	 * @generated
	 */
	EReference getWMProductInstance_Position();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#isIn_transit <em>In transit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In transit</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#isIn_transit()
	 * @see #getWMProductInstance()
	 * @generated
	 */
	EAttribute getWMProductInstance_In_transit();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#getEta <em>Eta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eta</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#getEta()
	 * @see #getWMProductInstance()
	 * @generated
	 */
	EAttribute getWMProductInstance_Eta();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variant</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMProductInstance#getVariant()
	 * @see #getWMProductInstance()
	 * @generated
	 */
	EReference getWMProductInstance_Variant();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance <em>WM Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WM Resource Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance
	 * @generated
	 */
	EClass getWMResourceInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getSerialId <em>Serial Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getSerialId()
	 * @see #getWMResourceInstance()
	 * @generated
	 */
	EAttribute getWMResourceInstance_SerialId();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getFrom_position <em>From position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From position</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getFrom_position()
	 * @see #getWMResourceInstance()
	 * @generated
	 */
	EReference getWMResourceInstance_From_position();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getTo_position <em>To position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To position</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getTo_position()
	 * @see #getWMResourceInstance()
	 * @generated
	 */
	EReference getWMResourceInstance_To_position();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getEta <em>Eta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eta</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getEta()
	 * @see #getWMResourceInstance()
	 * @generated
	 */
	EAttribute getWMResourceInstance_Eta();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMResourceInstance#getCapabilities()
	 * @see #getWMResourceInstance()
	 * @generated
	 */
	EReference getWMResourceInstance_Capabilities();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.WorldModel <em>World Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Model</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WorldModel
	 * @generated
	 */
	EClass getWorldModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.linebalancing.WorldModel#getProductInstances <em>Product Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Instances</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WorldModel#getProductInstances()
	 * @see #getWorldModel()
	 * @generated
	 */
	EReference getWorldModel_ProductInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.linebalancing.WorldModel#getResourceInstances <em>Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Instances</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WorldModel#getResourceInstances()
	 * @see #getWorldModel()
	 * @generated
	 */
	EReference getWorldModel_ResourceInstances();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes <em>WM Path Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WM Path Times</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes
	 * @generated
	 */
	EClass getWMPathTimes();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes#getFrom()
	 * @see #getWMPathTimes()
	 * @generated
	 */
	EReference getWMPathTimes_From();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.WMPathTimes#getTo()
	 * @see #getWMPathTimes()
	 * @generated
	 */
	EReference getWMPathTimes_To();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment <em>Line Balancing Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Balancing Assignment</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment
	 * @generated
	 */
	EClass getLineBalancingAssignment();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment#getResourceInstanceId <em>Resource Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment#getResourceInstanceId()
	 * @see #getLineBalancingAssignment()
	 * @generated
	 */
	EAttribute getLineBalancingAssignment_ResourceInstanceId();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment#getOrder()
	 * @see #getLineBalancingAssignment()
	 * @generated
	 */
	EReference getLineBalancingAssignment_Order();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMPathTimeImpl <em>WM Path Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WMPathTimeImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWMPathTime()
		 * @generated
		 */
		EClass WM_PATH_TIME = eINSTANCE.getWMPathTime();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WM_PATH_TIME__TIME = eINSTANCE.getWMPathTime_Time();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WM_PATH_TIME__TO = eINSTANCE.getWMPathTime_To();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.StaticWorldModelImpl <em>Static World Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.StaticWorldModelImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getStaticWorldModel()
		 * @generated
		 */
		EClass STATIC_WORLD_MODEL = eINSTANCE.getStaticWorldModel();

		/**
		 * The meta object literal for the '<em><b>Path Times</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_WORLD_MODEL__PATH_TIMES = eINSTANCE.getStaticWorldModel_PathTimes();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl <em>WM Product Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WMProductInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWMProductInstance()
		 * @generated
		 */
		EClass WM_PRODUCT_INSTANCE = eINSTANCE.getWMProductInstance();

		/**
		 * The meta object literal for the '<em><b>Serial Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WM_PRODUCT_INSTANCE__SERIAL_ID = eINSTANCE.getWMProductInstance_SerialId();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WM_PRODUCT_INSTANCE__POSITION = eINSTANCE.getWMProductInstance_Position();

		/**
		 * The meta object literal for the '<em><b>In transit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WM_PRODUCT_INSTANCE__IN_TRANSIT = eINSTANCE.getWMProductInstance_In_transit();

		/**
		 * The meta object literal for the '<em><b>Eta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WM_PRODUCT_INSTANCE__ETA = eINSTANCE.getWMProductInstance_Eta();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WM_PRODUCT_INSTANCE__VARIANT = eINSTANCE.getWMProductInstance_Variant();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMResourceInstanceImpl <em>WM Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WMResourceInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWMResourceInstance()
		 * @generated
		 */
		EClass WM_RESOURCE_INSTANCE = eINSTANCE.getWMResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Serial Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WM_RESOURCE_INSTANCE__SERIAL_ID = eINSTANCE.getWMResourceInstance_SerialId();

		/**
		 * The meta object literal for the '<em><b>From position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WM_RESOURCE_INSTANCE__FROM_POSITION = eINSTANCE.getWMResourceInstance_From_position();

		/**
		 * The meta object literal for the '<em><b>To position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WM_RESOURCE_INSTANCE__TO_POSITION = eINSTANCE.getWMResourceInstance_To_position();

		/**
		 * The meta object literal for the '<em><b>Eta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WM_RESOURCE_INSTANCE__ETA = eINSTANCE.getWMResourceInstance_Eta();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WM_RESOURCE_INSTANCE__CAPABILITIES = eINSTANCE.getWMResourceInstance_Capabilities();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WorldModelImpl <em>World Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WorldModelImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWorldModel()
		 * @generated
		 */
		EClass WORLD_MODEL = eINSTANCE.getWorldModel();

		/**
		 * The meta object literal for the '<em><b>Product Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_MODEL__PRODUCT_INSTANCES = eINSTANCE.getWorldModel_ProductInstances();

		/**
		 * The meta object literal for the '<em><b>Resource Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_MODEL__RESOURCE_INSTANCES = eINSTANCE.getWorldModel_ResourceInstances();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.WMPathTimesImpl <em>WM Path Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.WMPathTimesImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getWMPathTimes()
		 * @generated
		 */
		EClass WM_PATH_TIMES = eINSTANCE.getWMPathTimes();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WM_PATH_TIMES__FROM = eINSTANCE.getWMPathTimes_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WM_PATH_TIMES__TO = eINSTANCE.getWMPathTimes_To();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LineBalancingAssignmentImpl <em>Line Balancing Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LineBalancingAssignmentImpl
		 * @see de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl#getLineBalancingAssignment()
		 * @generated
		 */
		EClass LINE_BALANCING_ASSIGNMENT = eINSTANCE.getLineBalancingAssignment();

		/**
		 * The meta object literal for the '<em><b>Resource Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_BALANCING_ASSIGNMENT__RESOURCE_INSTANCE_ID = eINSTANCE.getLineBalancingAssignment_ResourceInstanceId();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_BALANCING_ASSIGNMENT__ORDER = eINSTANCE.getLineBalancingAssignment_Order();

	}

} //LinebalancingPackage
