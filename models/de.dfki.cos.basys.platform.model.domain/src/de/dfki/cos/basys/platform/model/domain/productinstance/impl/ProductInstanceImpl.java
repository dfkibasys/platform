/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.order.Order;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ManufacturedComponent;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage;

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
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.impl.ProductInstanceImpl#getManufacturedComponent <em>Manufactured Component</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.impl.ProductInstanceImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.productinstance.impl.ProductInstanceImpl#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductInstanceImpl extends EntityImpl implements ProductInstance {
	/**
	 * The cached value of the '{@link #getManufacturedComponent() <em>Manufactured Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedComponent()
	 * @generated
	 * @ordered
	 */
	protected ManufacturedComponent manufacturedComponent;

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
	public ManufacturedComponent getManufacturedComponent() {
		if (manufacturedComponent != null && manufacturedComponent.eIsProxy()) {
			InternalEObject oldManufacturedComponent = (InternalEObject)manufacturedComponent;
			manufacturedComponent = (ManufacturedComponent)eResolveProxy(oldManufacturedComponent);
			if (manufacturedComponent != oldManufacturedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductinstancePackage.PRODUCT_INSTANCE__MANUFACTURED_COMPONENT, oldManufacturedComponent, manufacturedComponent));
			}
		}
		return manufacturedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedComponent basicGetManufacturedComponent() {
		return manufacturedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturedComponent(ManufacturedComponent newManufacturedComponent) {
		ManufacturedComponent oldManufacturedComponent = manufacturedComponent;
		manufacturedComponent = newManufacturedComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductinstancePackage.PRODUCT_INSTANCE__MANUFACTURED_COMPONENT, oldManufacturedComponent, manufacturedComponent));
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
			case ProductinstancePackage.PRODUCT_INSTANCE__MANUFACTURED_COMPONENT:
				if (resolve) return getManufacturedComponent();
				return basicGetManufacturedComponent();
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
			case ProductinstancePackage.PRODUCT_INSTANCE__MANUFACTURED_COMPONENT:
				setManufacturedComponent((ManufacturedComponent)newValue);
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
			case ProductinstancePackage.PRODUCT_INSTANCE__MANUFACTURED_COMPONENT:
				setManufacturedComponent((ManufacturedComponent)null);
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
			case ProductinstancePackage.PRODUCT_INSTANCE__MANUFACTURED_COMPONENT:
				return manufacturedComponent != null;
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
