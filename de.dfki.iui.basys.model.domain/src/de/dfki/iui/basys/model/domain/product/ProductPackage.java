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
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__NAME = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT__PRODUCT_GROUP_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VARIANT_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__METADATA = BasePackage.IDENTIFIABLE_ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ID = BasePackage.IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Product Variant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PRODUCT_VARIANT_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ORDER_ID = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__SERIAL_NUMBER = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_FEATURE_COUNT = BasePackage.IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_OPERATION_COUNT = BasePackage.IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Workstep Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_STATUS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductRecognitionImpl <em>Recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductRecognitionImpl
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductRecognition()
	 * @generated
	 */
	int PRODUCT_RECOGNITION = 4;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION__EVENT_TYPE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION__PRODUCT_INSTANCE_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION__COMPONENT_ID = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RECOGNITION_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.RecognitionEnum <em>Recognition Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.RecognitionEnum
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getRecognitionEnum()
	 * @generated
	 */
	int RECOGNITION_ENUM = 5;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum <em>Instance Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum
	 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductInstanceStatusEnum()
	 * @generated
	 */
	int PRODUCT_INSTANCE_STATUS_ENUM = 6;


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
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getWorkstepInstanceId <em>Workstep Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstep Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductInstanceStatus#getWorkstepInstanceId()
	 * @see #getProductInstanceStatus()
	 * @generated
	 */
	EAttribute getProductInstanceStatus_WorkstepInstanceId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.product.ProductRecognition <em>Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recognition</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductRecognition
	 * @generated
	 */
	EClass getProductRecognition();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductRecognition#getEventType()
	 * @see #getProductRecognition()
	 * @generated
	 */
	EAttribute getProductRecognition_EventType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getProductInstanceId <em>Product Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Instance Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductRecognition#getProductInstanceId()
	 * @see #getProductRecognition()
	 * @generated
	 */
	EAttribute getProductRecognition_ProductInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.product.ProductRecognition#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.ProductRecognition#getComponentId()
	 * @see #getProductRecognition()
	 * @generated
	 */
	EAttribute getProductRecognition_ComponentId();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.product.RecognitionEnum <em>Recognition Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recognition Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.product.RecognitionEnum
	 * @generated
	 */
	EEnum getRecognitionEnum();

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
		 * The meta object literal for the '<em><b>Workstep Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID = eINSTANCE.getProductInstanceStatus_WorkstepInstanceId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.impl.ProductRecognitionImpl <em>Recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductRecognitionImpl
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getProductRecognition()
		 * @generated
		 */
		EClass PRODUCT_RECOGNITION = eINSTANCE.getProductRecognition();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_RECOGNITION__EVENT_TYPE = eINSTANCE.getProductRecognition_EventType();

		/**
		 * The meta object literal for the '<em><b>Product Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_RECOGNITION__PRODUCT_INSTANCE_ID = eINSTANCE.getProductRecognition_ProductInstanceId();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_RECOGNITION__COMPONENT_ID = eINSTANCE.getProductRecognition_ComponentId();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.product.RecognitionEnum <em>Recognition Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.product.RecognitionEnum
		 * @see de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl#getRecognitionEnum()
		 * @generated
		 */
		EEnum RECOGNITION_ENUM = eINSTANCE.getRecognitionEnum();

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
