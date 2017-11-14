/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.product.ProductInstanceDetectionEnum;
import de.dfki.iui.basys.model.domain.product.ProductInstanceLocation;
import de.dfki.iui.basys.model.domain.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationImpl#getDetectionType <em>Detection Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationImpl#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceLocationImpl#getComponentId <em>Component Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductInstanceLocationImpl extends EntityImpl implements ProductInstanceLocation {
	/**
	 * The default value of the '{@link #getDetectionType() <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectionType()
	 * @generated
	 * @ordered
	 */
	protected static final ProductInstanceDetectionEnum DETECTION_TYPE_EDEFAULT = ProductInstanceDetectionEnum.UNKNOWN;

	/**
	 * The cached value of the '{@link #getDetectionType() <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectionType()
	 * @generated
	 * @ordered
	 */
	protected ProductInstanceDetectionEnum detectionType = DETECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductInstanceId() <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductInstanceId() <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String productInstanceId = PRODUCT_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected String componentId = COMPONENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_INSTANCE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceDetectionEnum getDetectionType() {
		return detectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetectionType(ProductInstanceDetectionEnum newDetectionType) {
		ProductInstanceDetectionEnum oldDetectionType = detectionType;
		detectionType = newDetectionType == null ? DETECTION_TYPE_EDEFAULT : newDetectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE, oldDetectionType, detectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductInstanceId() {
		return productInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductInstanceId(String newProductInstanceId) {
		String oldProductInstanceId = productInstanceId;
		productInstanceId = newProductInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID, oldProductInstanceId, productInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_INSTANCE_LOCATION__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE:
				return getDetectionType();
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID:
				return getProductInstanceId();
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__COMPONENT_ID:
				return getComponentId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE:
				setDetectionType((ProductInstanceDetectionEnum)newValue);
				return;
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID:
				setProductInstanceId((String)newValue);
				return;
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE:
				setDetectionType(DETECTION_TYPE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID:
				setProductInstanceId(PRODUCT_INSTANCE_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE:
				return detectionType != DETECTION_TYPE_EDEFAULT;
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID:
				return PRODUCT_INSTANCE_ID_EDEFAULT == null ? productInstanceId != null : !PRODUCT_INSTANCE_ID_EDEFAULT.equals(productInstanceId);
			case ProductPackage.PRODUCT_INSTANCE_LOCATION__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (detectionType: ");
		result.append(detectionType);
		result.append(", productInstanceId: ");
		result.append(productInstanceId);
		result.append(", componentId: ");
		result.append(componentId);
		result.append(')');
		return result.toString();
	}

} //ProductInstanceLocationImpl
