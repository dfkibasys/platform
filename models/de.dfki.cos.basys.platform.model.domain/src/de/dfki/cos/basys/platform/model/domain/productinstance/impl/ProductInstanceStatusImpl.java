/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusEnum;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Instance Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.impl.ProductInstanceStatusImpl#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.impl.ProductInstanceStatusImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductInstanceStatusImpl extends EntityImpl implements ProductInstanceStatus {
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
	protected ProductInstanceStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductinstancePackage.Literals.PRODUCT_INSTANCE_STATUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductinstancePackage.PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID, oldProductInstanceId, productInstanceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductinstancePackage.PRODUCT_INSTANCE_STATUS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID:
				return getProductInstanceId();
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS__STATUS:
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
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID:
				setProductInstanceId((String)newValue);
				return;
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS__STATUS:
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
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID:
				setProductInstanceId(PRODUCT_INSTANCE_ID_EDEFAULT);
				return;
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS__STATUS:
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
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID:
				return PRODUCT_INSTANCE_ID_EDEFAULT == null ? productInstanceId != null : !PRODUCT_INSTANCE_ID_EDEFAULT.equals(productInstanceId);
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS__STATUS:
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

} //ProductInstanceStatusImpl
