/**
 */
package de.dfki.cos.basys.platform.model.domain.order.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.order.Order;
import de.dfki.cos.basys.platform.model.domain.order.OrderPackage;
import de.dfki.cos.basys.platform.model.domain.order.OrderStatus;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ManufacturedComponent;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.impl.OrderImpl#getManufacturedComponent <em>Manufactured Component</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.impl.OrderImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.impl.OrderImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.impl.OrderImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.impl.OrderImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.impl.OrderImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.impl.OrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.impl.OrderImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends EntityImpl implements Order {
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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected OrderStatus status;

	/**
	 * The default value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected String customer = CUSTOMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER__MANUFACTURED_COMPONENT, oldManufacturedComponent, manufacturedComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__MANUFACTURED_COMPONENT, oldManufacturedComponent, manufacturedComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(OrderStatus newStatus, NotificationChain msgs) {
		OrderStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(OrderStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrderPackage.ORDER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrderPackage.ORDER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(String newCustomer) {
		String oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrderPackage.ORDER__STATUS:
				return basicSetStatus(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER__MANUFACTURED_COMPONENT:
				if (resolve) return getManufacturedComponent();
				return basicGetManufacturedComponent();
			case OrderPackage.ORDER__QUANTITY:
				return getQuantity();
			case OrderPackage.ORDER__DUE_DATE:
				return getDueDate();
			case OrderPackage.ORDER__PRIORITY:
				return getPriority();
			case OrderPackage.ORDER__START_DATE:
				return getStartDate();
			case OrderPackage.ORDER__END_DATE:
				return getEndDate();
			case OrderPackage.ORDER__STATUS:
				return getStatus();
			case OrderPackage.ORDER__CUSTOMER:
				return getCustomer();
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
			case OrderPackage.ORDER__MANUFACTURED_COMPONENT:
				setManufacturedComponent((ManufacturedComponent)newValue);
				return;
			case OrderPackage.ORDER__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case OrderPackage.ORDER__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case OrderPackage.ORDER__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case OrderPackage.ORDER__START_DATE:
				setStartDate((Date)newValue);
				return;
			case OrderPackage.ORDER__END_DATE:
				setEndDate((Date)newValue);
				return;
			case OrderPackage.ORDER__STATUS:
				setStatus((OrderStatus)newValue);
				return;
			case OrderPackage.ORDER__CUSTOMER:
				setCustomer((String)newValue);
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
			case OrderPackage.ORDER__MANUFACTURED_COMPONENT:
				setManufacturedComponent((ManufacturedComponent)null);
				return;
			case OrderPackage.ORDER__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case OrderPackage.ORDER__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER__STATUS:
				setStatus((OrderStatus)null);
				return;
			case OrderPackage.ORDER__CUSTOMER:
				setCustomer(CUSTOMER_EDEFAULT);
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
			case OrderPackage.ORDER__MANUFACTURED_COMPONENT:
				return manufacturedComponent != null;
			case OrderPackage.ORDER__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case OrderPackage.ORDER__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case OrderPackage.ORDER__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case OrderPackage.ORDER__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case OrderPackage.ORDER__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case OrderPackage.ORDER__STATUS:
				return status != null;
			case OrderPackage.ORDER__CUSTOMER:
				return CUSTOMER_EDEFAULT == null ? customer != null : !CUSTOMER_EDEFAULT.equals(customer);
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", priority: ");
		result.append(priority);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", customer: ");
		result.append(customer);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
