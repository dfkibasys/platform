/**
 */
package de.dfki.iui.basys.model.domain.productinstance.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl#getProductVariant <em>Product Variant</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.productinstance.impl.ProductInstanceImpl#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductInstanceImpl extends EntityImpl implements ProductInstance {
	/**
	 * The cached value of the '{@link #getProductVariant() <em>Product Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVariant()
	 * @generated
	 * @ordered
	 */
	protected de.dfki.iui.basys.model.domain.productdefinition.ProductVariant productVariant;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order;

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
	public de.dfki.iui.basys.model.domain.productdefinition.ProductVariant getProductVariant() {
		if (productVariant != null && productVariant.eIsProxy()) {
			InternalEObject oldProductVariant = (InternalEObject)productVariant;
			productVariant = (de.dfki.iui.basys.model.domain.productdefinition.ProductVariant)eResolveProxy(oldProductVariant);
			if (productVariant != oldProductVariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT, oldProductVariant, productVariant));
			}
		}
		return productVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.dfki.iui.basys.model.domain.productdefinition.ProductVariant basicGetProductVariant() {
		return productVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVariant(de.dfki.iui.basys.model.domain.productdefinition.ProductVariant newProductVariant) {
		de.dfki.iui.basys.model.domain.productdefinition.ProductVariant oldProductVariant = productVariant;
		productVariant = newProductVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT, oldProductVariant, productVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		if (order != null && order.eIsProxy()) {
			InternalEObject oldOrder = (InternalEObject)order;
			order = (Order)eResolveProxy(oldOrder);
			if (order != oldOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductinstancePackage.PRODUCT_INSTANCE__ORDER, oldOrder, order));
			}
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order basicGetOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		Order oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductinstancePackage.PRODUCT_INSTANCE__ORDER, oldOrder, order));
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
			case ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT:
				if (resolve) return getProductVariant();
				return basicGetProductVariant();
			case ProductinstancePackage.PRODUCT_INSTANCE__ORDER:
				if (resolve) return getOrder();
				return basicGetOrder();
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
			case ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT:
				setProductVariant((de.dfki.iui.basys.model.domain.productdefinition.ProductVariant)newValue);
				return;
			case ProductinstancePackage.PRODUCT_INSTANCE__ORDER:
				setOrder((Order)newValue);
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
			case ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT:
				setProductVariant((de.dfki.iui.basys.model.domain.productdefinition.ProductVariant)null);
				return;
			case ProductinstancePackage.PRODUCT_INSTANCE__ORDER:
				setOrder((Order)null);
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
			case ProductinstancePackage.PRODUCT_INSTANCE__PRODUCT_VARIANT:
				return productVariant != null;
			case ProductinstancePackage.PRODUCT_INSTANCE__ORDER:
				return order != null;
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
		result.append(" (serialNumber: ");
		result.append(serialNumber);
		result.append(')');
		return result.toString();
	}

} //ProductInstanceImpl
