/**
 */
package de.dfki.iui.basys.model.domain.product.impl;

import de.dfki.iui.basys.model.base.impl.EventImpl;

import de.dfki.iui.basys.model.domain.product.ProductInstanceStatus;
import de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEnum;
import de.dfki.iui.basys.model.domain.product.ProductInstanceStatusEvent;
import de.dfki.iui.basys.model.domain.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Status Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusEventImpl#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.impl.ProductInstanceStatusEventImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductInstanceStatusEventImpl extends EventImpl implements ProductInstanceStatusEvent {
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ProductInstanceStatusEnum STATUS_EDEFAULT = ProductInstanceStatusEnum.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ProductInstanceStatusEnum status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceStatusEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_INSTANCE_STATUS_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__PRODUCT_INSTANCE_ID, oldProductInstanceId, productInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstanceStatusEnum getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ProductInstanceStatusEnum newStatus) {
		ProductInstanceStatusEnum oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__PRODUCT_INSTANCE_ID:
				return getProductInstanceId();
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__STATUS:
				return getStatus();
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
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__PRODUCT_INSTANCE_ID:
				setProductInstanceId((String)newValue);
				return;
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__STATUS:
				setStatus((ProductInstanceStatusEnum)newValue);
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
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__PRODUCT_INSTANCE_ID:
				setProductInstanceId(PRODUCT_INSTANCE_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__PRODUCT_INSTANCE_ID:
				return PRODUCT_INSTANCE_ID_EDEFAULT == null ? productInstanceId != null : !PRODUCT_INSTANCE_ID_EDEFAULT.equals(productInstanceId);
			case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__STATUS:
				return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ProductInstanceStatus.class) {
			switch (derivedFeatureID) {
				case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__PRODUCT_INSTANCE_ID: return ProductPackage.PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID;
				case ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__STATUS: return ProductPackage.PRODUCT_INSTANCE_STATUS__STATUS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ProductInstanceStatus.class) {
			switch (baseFeatureID) {
				case ProductPackage.PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID: return ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__PRODUCT_INSTANCE_ID;
				case ProductPackage.PRODUCT_INSTANCE_STATUS__STATUS: return ProductPackage.PRODUCT_INSTANCE_STATUS_EVENT__STATUS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (productInstanceId: ");
		result.append(productInstanceId);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ProductInstanceStatusEventImpl
