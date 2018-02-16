/**
 */
package de.dfki.iui.basys.model.domain.productinstance.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl#getProductVariantId <em>Product Variant Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductInstanceImpl extends EntityImpl implements ProductInstance {
	/**
	 * The default value of the '{@link #getProductVariantId() <em>Product Variant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVariantId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VARIANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVariantId() <em>Product Variant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVariantId()
	 * @generated
	 * @ordered
	 */
	protected String productVariantId = PRODUCT_VARIANT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductinstancePackage.Literals.PRODUCT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductVariantId() {
		return productVariantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVariantId(String newProductVariantId) {
		String oldProductVariantId = productVariantId;
		productVariantId = newProductVariantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT_ID, oldProductVariantId, productVariantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductinstancePackage.PRODUCT_INSTANCE__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductinstancePackage.PRODUCT_INSTANCE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT_ID:
				return getProductVariantId();
			case ProductinstancePackage.PRODUCT_INSTANCE__ORDER_ID:
				return getOrderId();
			case ProductinstancePackage.PRODUCT_INSTANCE__SERIAL_NUMBER:
				return getSerialNumber();
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
			case ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT_ID:
				setProductVariantId((String)newValue);
				return;
			case ProductinstancePackage.PRODUCT_INSTANCE__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case ProductinstancePackage.PRODUCT_INSTANCE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
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
			case ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT_ID:
				setProductVariantId(PRODUCT_VARIANT_ID_EDEFAULT);
				return;
			case ProductinstancePackage.PRODUCT_INSTANCE__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case ProductinstancePackage.PRODUCT_INSTANCE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
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
			case ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT_ID:
				return PRODUCT_VARIANT_ID_EDEFAULT == null ? productVariantId != null : !PRODUCT_VARIANT_ID_EDEFAULT.equals(productVariantId);
			case ProductinstancePackage.PRODUCT_INSTANCE__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case ProductinstancePackage.PRODUCT_INSTANCE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
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
		result.append(" (productVariantId: ");
		result.append(productVariantId);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(')');
		return result.toString();
	}

} //ProductInstanceImpl
