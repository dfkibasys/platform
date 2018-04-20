/**
 */
package de.dfki.iui.basys.model.domain.productinstance;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dfki.iui.basys.model.domain.productinstance.ProductinstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ProductinstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "productinstance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/productinstance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "productinstance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductinstancePackage eINSTANCE = de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstance()
	 * @generated
	 */
	int PRODUCT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Manufactured Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__MANUFACTURED_COMPONENT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ORDER = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__SERIAL_NUMBER = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceStatusImpl <em>Product Instance Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceStatusImpl
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceStatus()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__STATUS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceStatusChangeEventImpl <em>Product Instance Status Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceStatusChangeEventImpl
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceStatusChangeEvent()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__BINDING = PRODUCT_INSTANCE_STATUS__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__ID = PRODUCT_INSTANCE_STATUS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__NAME = PRODUCT_INSTANCE_STATUS__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__METADATA = PRODUCT_INSTANCE_STATUS__METADATA;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__PRODUCT_INSTANCE_ID = PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__STATUS = PRODUCT_INSTANCE_STATUS__STATUS;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__TIMESTAMP = PRODUCT_INSTANCE_STATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Instance Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT_FEATURE_COUNT = PRODUCT_INSTANCE_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Instance Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT_OPERATION_COUNT = PRODUCT_INSTANCE_STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceLocationImpl <em>Product Instance Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceLocationImpl
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceLocation()
	 * @generated
	 */
	int PRODUCT_INSTANCE_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Detection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION__COMPONENT_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Instance Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Instance Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceLocationChangeEventImpl <em>Product Instance Location Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceLocationChangeEventImpl
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceLocationChangeEvent()
	 * @generated
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__BINDING = PRODUCT_INSTANCE_LOCATION__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__ID = PRODUCT_INSTANCE_LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__NAME = PRODUCT_INSTANCE_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__METADATA = PRODUCT_INSTANCE_LOCATION__METADATA;

	/**
	 * The feature id for the '<em><b>Detection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__DETECTION_TYPE = PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__PRODUCT_INSTANCE_ID = PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__COMPONENT_ID = PRODUCT_INSTANCE_LOCATION__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__TIMESTAMP = PRODUCT_INSTANCE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Instance Location Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT_FEATURE_COUNT = PRODUCT_INSTANCE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Instance Location Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT_OPERATION_COUNT = PRODUCT_INSTANCE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceDetectionEnum <em>Product Instance Detection Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceDetectionEnum
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceDetectionEnum()
	 * @generated
	 */
	int PRODUCT_INSTANCE_DETECTION_ENUM = 5;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusEnum <em>Product Instance Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusEnum
	 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceStatusEnum()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS_ENUM = 6;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstance
	 * @generated
	 */
	EClass getProductInstance();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getManufacturedComponent <em>Manufactured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manufactured Component</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getManufacturedComponent()
	 * @see #getProductInstance()
	 * @generated
	 */
	EReference getProductInstance_ManufacturedComponent();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getOrder()
	 * @see #getProductInstance()
	 * @generated
	 */
	EReference getProductInstance_Order();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstance#getSerialNumber()
	 * @see #getProductInstance()
	 * @generated
	 */
	EAttribute getProductInstance_SerialNumber();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatus <em>Product Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatus
	 * @generated
	 */
	EClass getProductInstanceStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatus#getProductInstanceId()
	 * @see #getProductInstanceStatus()
	 * @generated
	 */
	EAttribute getProductInstanceStatus_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatus#getStatus()
	 * @see #getProductInstanceStatus()
	 * @generated
	 */
	EAttribute getProductInstanceStatus_Status();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusChangeEvent <em>Product Instance Status Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance Status Change Event</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusChangeEvent
	 * @generated
	 */
	EClass getProductInstanceStatusChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusChangeEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusChangeEvent#getTimestamp()
	 * @see #getProductInstanceStatusChangeEvent()
	 * @generated
	 */
	EAttribute getProductInstanceStatusChangeEvent_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocation <em>Product Instance Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance Location</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocation
	 * @generated
	 */
	EClass getProductInstanceLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocation#getDetectionType <em>Detection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detection Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocation#getDetectionType()
	 * @see #getProductInstanceLocation()
	 * @generated
	 */
	EAttribute getProductInstanceLocation_DetectionType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocation#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocation#getProductInstanceId()
	 * @see #getProductInstanceLocation()
	 * @generated
	 */
	EAttribute getProductInstanceLocation_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocation#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocation#getComponentId()
	 * @see #getProductInstanceLocation()
	 * @generated
	 */
	EAttribute getProductInstanceLocation_ComponentId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocationChangeEvent <em>Product Instance Location Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance Location Change Event</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocationChangeEvent
	 * @generated
	 */
	EClass getProductInstanceLocationChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocationChangeEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceLocationChangeEvent#getTimestamp()
	 * @see #getProductInstanceLocationChangeEvent()
	 * @generated
	 */
	EAttribute getProductInstanceLocationChangeEvent_Timestamp();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceDetectionEnum <em>Product Instance Detection Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Instance Detection Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceDetectionEnum
	 * @generated
	 */
	EEnum getProductInstanceDetectionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusEnum <em>Product Instance Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Instance Status Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusEnum
	 * @generated
	 */
	EEnum getProductInstanceStatusEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductinstanceFactory getProductinstanceFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstance()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE = eINSTANCE.getProductInstance();

		/**
		 * The meta object literal for the '<em><b>Manufactured Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_INSTANCE__MANUFACTURED_COMPONENT = eINSTANCE.getProductInstance_ManufacturedComponent();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_INSTANCE__ORDER = eINSTANCE.getProductInstance_Order();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE__SERIAL_NUMBER = eINSTANCE.getProductInstance_SerialNumber();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceStatusImpl <em>Product Instance Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceStatusImpl
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceStatus()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE_STATUS = eINSTANCE.getProductInstanceStatus();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID = eINSTANCE.getProductInstanceStatus_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_STATUS__STATUS = eINSTANCE.getProductInstanceStatus_Status();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceStatusChangeEventImpl <em>Product Instance Status Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceStatusChangeEventImpl
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceStatusChangeEvent()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE_STATUS_CHANGE_EVENT = eINSTANCE.getProductInstanceStatusChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__TIMESTAMP = eINSTANCE.getProductInstanceStatusChangeEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceLocationImpl <em>Product Instance Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceLocationImpl
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceLocation()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE_LOCATION = eINSTANCE.getProductInstanceLocation();

		/**
		 * The meta object literal for the '<em><b>Detection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE = eINSTANCE.getProductInstanceLocation_DetectionType();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID = eINSTANCE.getProductInstanceLocation_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_LOCATION__COMPONENT_ID = eINSTANCE.getProductInstanceLocation_ComponentId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceLocationChangeEventImpl <em>Product Instance Location Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceLocationChangeEventImpl
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceLocationChangeEvent()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT = eINSTANCE.getProductInstanceLocationChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__TIMESTAMP = eINSTANCE.getProductInstanceLocationChangeEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceDetectionEnum <em>Product Instance Detection Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceDetectionEnum
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceDetectionEnum()
		 * @generated
		 */
		EEnum PRODUCT_INSTANCE_DETECTION_ENUM = eINSTANCE.getProductInstanceDetectionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusEnum <em>Product Instance Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStatusEnum
		 * @see de.dfki.iui.basys.model.domain.productinstance.impl.ProductinstancePackageImpl#getProductInstanceStatusEnum()
		 * @generated
		 */
		EEnum PRODUCT_INSTANCE_STATUS_ENUM = eINSTANCE.getProductInstanceStatusEnum();

	}

} //ProductinstancePackage
