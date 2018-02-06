/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.dfki.iui.basys.model.domain.product.ProductFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ProductPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "product";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/product";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "product";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductPackage eINSTANCE = de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductGroup()
	 * @generated
	 */
	int PRODUCT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__NAME = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductVariant()
	 * @generated
	 */
	int PRODUCT_VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__NAME = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__PRODUCT_GROUP_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstance()
	 * @generated
	 */
	int PRODUCT_INSTANCE = 2;

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
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Product Variant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PRODUCT_VARIANT_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ORDER_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__SERIAL_NUMBER = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusImpl <em>Instance Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceStatus()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS = 3;

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
	 * The number of structural features of the '<em>Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusChangeEventImpl <em>Instance Status Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusChangeEventImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceStatusChangeEvent()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT = 4;

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
	 * The number of structural features of the '<em>Instance Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT_FEATURE_COUNT = PRODUCT_INSTANCE_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_CHANGE_EVENT_OPERATION_COUNT = PRODUCT_INSTANCE_STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationImpl <em>Instance Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceLocation()
	 * @generated
	 */
	int PRODUCT_INSTANCE_LOCATION = 5;

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
	 * The number of structural features of the '<em>Instance Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationChangeEventImpl <em>Instance Location Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationChangeEventImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceLocationChangeEvent()
	 * @generated
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT = 6;

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
	 * The number of structural features of the '<em>Instance Location Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT_FEATURE_COUNT = PRODUCT_INSTANCE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Location Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT_OPERATION_COUNT = PRODUCT_INSTANCE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum <em>Instance Detection Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceDetectionEnum()
	 * @generated
	 */
	int PRODUCT_INSTANCE_DETECTION_ENUM = 7;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum <em>Instance Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceStatusEnum()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS_ENUM = 8;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductGroup
	 * @generated
	 */
	EClass getProductGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductGroup#getName()
	 * @see #getProductGroup()
	 * @generated
	 */
	EAttribute getProductGroup_Name();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductVariant
	 * @generated
	 */
	EClass getProductVariant();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductVariant#getName()
	 * @see #getProductVariant()
	 * @generated
	 */
	EAttribute getProductVariant_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductVariant#getProductGroupId <em>Product Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Group Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductVariant#getProductGroupId()
	 * @see #getProductVariant()
	 * @generated
	 */
	EAttribute getProductVariant_ProductGroupId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstance
	 * @generated
	 */
	EClass getProductInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getProductVariantId <em>Product Variant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Variant Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstance#getProductVariantId()
	 * @see #getProductInstance()
	 * @generated
	 */
	EAttribute getProductInstance_ProductVariantId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstance#getOrderId()
	 * @see #getProductInstance()
	 * @generated
	 */
	EAttribute getProductInstance_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstance#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstance#getSerialNumber()
	 * @see #getProductInstance()
	 * @generated
	 */
	EAttribute getProductInstance_SerialNumber();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus <em>Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatus
	 * @generated
	 */
	EClass getProductInstanceStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getProductInstanceId()
	 * @see #getProductInstanceStatus()
	 * @generated
	 */
	EAttribute getProductInstanceStatus_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getStatus()
	 * @see #getProductInstanceStatus()
	 * @generated
	 */
	EAttribute getProductInstanceStatus_Status();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatusChangeEvent <em>Instance Status Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Status Change Event</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatusChangeEvent
	 * @generated
	 */
	EClass getProductInstanceStatusChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatusChangeEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatusChangeEvent#getTimestamp()
	 * @see #getProductInstanceStatusChangeEvent()
	 * @generated
	 */
	EAttribute getProductInstanceStatusChangeEvent_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation <em>Instance Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Location</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceLocation
	 * @generated
	 */
	EClass getProductInstanceLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getDetectionType <em>Detection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detection Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getDetectionType()
	 * @see #getProductInstanceLocation()
	 * @generated
	 */
	EAttribute getProductInstanceLocation_DetectionType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getProductInstanceId()
	 * @see #getProductInstanceLocation()
	 * @generated
	 */
	EAttribute getProductInstanceLocation_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceLocation#getComponentId()
	 * @see #getProductInstanceLocation()
	 * @generated
	 */
	EAttribute getProductInstanceLocation_ComponentId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocationChangeEvent <em>Instance Location Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Location Change Event</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceLocationChangeEvent
	 * @generated
	 */
	EClass getProductInstanceLocationChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceLocationChangeEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceLocationChangeEvent#getTimestamp()
	 * @see #getProductInstanceLocationChangeEvent()
	 * @generated
	 */
	EAttribute getProductInstanceLocationChangeEvent_Timestamp();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum <em>Instance Detection Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Detection Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum
	 * @generated
	 */
	EEnum getProductInstanceDetectionEnum();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum <em>Instance Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Status Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum
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
	ProductFactory getProductFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductGroupImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductGroup()
		 * @generated
		 */
		EClass PRODUCT_GROUP = eINSTANCE.getProductGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_GROUP__NAME = eINSTANCE.getProductGroup_Name();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductVariantImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductVariant()
		 * @generated
		 */
		EClass PRODUCT_VARIANT = eINSTANCE.getProductVariant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VARIANT__NAME = eINSTANCE.getProductVariant_Name();

		/**
		 * The meta object literal for the '<em><b>Product Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VARIANT__PRODUCT_GROUP_ID = eINSTANCE.getProductVariant_ProductGroupId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstance()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE = eINSTANCE.getProductInstance();

		/**
		 * The meta object literal for the '<em><b>Product Variant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE__PRODUCT_VARIANT_ID = eINSTANCE.getProductInstance_ProductVariantId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE__ORDER_ID = eINSTANCE.getProductInstance_OrderId();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE__SERIAL_NUMBER = eINSTANCE.getProductInstance_SerialNumber();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusImpl <em>Instance Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceStatus()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusChangeEventImpl <em>Instance Status Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusChangeEventImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceStatusChangeEvent()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationImpl <em>Instance Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceLocation()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationChangeEventImpl <em>Instance Location Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationChangeEventImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceLocationChangeEvent()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum <em>Instance Detection Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceDetectionEnum()
		 * @generated
		 */
		EEnum PRODUCT_INSTANCE_DETECTION_ENUM = eINSTANCE.getProductInstanceDetectionEnum();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum <em>Instance Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceStatusEnum()
		 * @generated
		 */
		EEnum PRODUCT_INSTANCE_STATUS_ENUM = eINSTANCE.getProductInstanceStatusEnum();

	}

} //ProductPackage
