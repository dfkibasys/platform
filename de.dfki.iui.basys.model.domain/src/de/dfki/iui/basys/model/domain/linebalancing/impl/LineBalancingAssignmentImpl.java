/**
 */
package de.dfki.iui.basys.model.domain.linebalancing.impl;

import de.dfki.iui.basys.model.domain.linebalancing.LineBalancingAssignment;
import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import de.dfki.iui.basys.model.domain.order.Order;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Balancing Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LineBalancingAssignmentImpl#getResourceInstanceId <em>Resource Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LineBalancingAssignmentImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineBalancingAssignmentImpl extends BasysEObjectImpl implements LineBalancingAssignment {
	/**
	 * The default value of the '{@link #getResourceInstanceId() <em>Resource Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceInstanceId() <em>Resource Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String resourceInstanceId = RESOURCE_INSTANCE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineBalancingAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinebalancingPackage.Literals.LINE_BALANCING_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceInstanceId() {
		return resourceInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceInstanceId(String newResourceInstanceId) {
		String oldResourceInstanceId = resourceInstanceId;
		resourceInstanceId = newResourceInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__RESOURCE_INSTANCE_ID, oldResourceInstanceId, resourceInstanceId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__ORDER, oldOrder, order));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__RESOURCE_INSTANCE_ID:
				return getResourceInstanceId();
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__ORDER:
				if (resolve) return getOrder();
				return basicGetOrder();
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
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__RESOURCE_INSTANCE_ID:
				setResourceInstanceId((String)newValue);
				return;
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__ORDER:
				setOrder((Order)newValue);
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
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__RESOURCE_INSTANCE_ID:
				setResourceInstanceId(RESOURCE_INSTANCE_ID_EDEFAULT);
				return;
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__ORDER:
				setOrder((Order)null);
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
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__RESOURCE_INSTANCE_ID:
				return RESOURCE_INSTANCE_ID_EDEFAULT == null ? resourceInstanceId != null : !RESOURCE_INSTANCE_ID_EDEFAULT.equals(resourceInstanceId);
			case LinebalancingPackage.LINE_BALANCING_ASSIGNMENT__ORDER:
				return order != null;
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
		result.append(" (resourceInstanceId: ");
		result.append(resourceInstanceId);
		result.append(')');
		return result.toString();
	}

} //LineBalancingAssignmentImpl
