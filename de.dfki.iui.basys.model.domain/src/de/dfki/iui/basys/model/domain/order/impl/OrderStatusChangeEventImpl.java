/**
 */
package de.dfki.iui.basys.model.domain.order.impl;

import de.dfki.iui.basys.model.base.impl.EventImpl;

import de.dfki.iui.basys.model.domain.order.OrderPackage;
import de.dfki.iui.basys.model.domain.order.OrderStatus;
import de.dfki.iui.basys.model.domain.order.OrderStatusChangeEvent;
import de.dfki.iui.basys.model.domain.order.OrderStatusEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Change Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.impl.OrderStatusChangeEventImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.impl.OrderStatusChangeEventImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.impl.OrderStatusChangeEventImpl#getPieceCount <em>Piece Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderStatusChangeEventImpl extends EventImpl implements OrderStatusChangeEvent {
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final OrderStatusEnum STATUS_EDEFAULT = OrderStatusEnum.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected OrderStatusEnum status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPieceCount() <em>Piece Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PIECE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPieceCount() <em>Piece Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieceCount()
	 * @generated
	 * @ordered
	 */
	protected int pieceCount = PIECE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderStatusChangeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_STATUS_CHANGE_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS_CHANGE_EVENT__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatusEnum getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(OrderStatusEnum newStatus) {
		OrderStatusEnum oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS_CHANGE_EVENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPieceCount() {
		return pieceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPieceCount(int newPieceCount) {
		int oldPieceCount = pieceCount;
		pieceCount = newPieceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_STATUS_CHANGE_EVENT__PIECE_COUNT, oldPieceCount, pieceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__ORDER_ID:
				return getOrderId();
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__STATUS:
				return getStatus();
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__PIECE_COUNT:
				return getPieceCount();
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
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__STATUS:
				setStatus((OrderStatusEnum)newValue);
				return;
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__PIECE_COUNT:
				setPieceCount((Integer)newValue);
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
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__PIECE_COUNT:
				setPieceCount(PIECE_COUNT_EDEFAULT);
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
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__STATUS:
				return status != STATUS_EDEFAULT;
			case OrderPackage.ORDER_STATUS_CHANGE_EVENT__PIECE_COUNT:
				return pieceCount != PIECE_COUNT_EDEFAULT;
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
		if (baseClass == OrderStatus.class) {
			switch (derivedFeatureID) {
				case OrderPackage.ORDER_STATUS_CHANGE_EVENT__ORDER_ID: return OrderPackage.ORDER_STATUS__ORDER_ID;
				case OrderPackage.ORDER_STATUS_CHANGE_EVENT__STATUS: return OrderPackage.ORDER_STATUS__STATUS;
				case OrderPackage.ORDER_STATUS_CHANGE_EVENT__PIECE_COUNT: return OrderPackage.ORDER_STATUS__PIECE_COUNT;
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
		if (baseClass == OrderStatus.class) {
			switch (baseFeatureID) {
				case OrderPackage.ORDER_STATUS__ORDER_ID: return OrderPackage.ORDER_STATUS_CHANGE_EVENT__ORDER_ID;
				case OrderPackage.ORDER_STATUS__STATUS: return OrderPackage.ORDER_STATUS_CHANGE_EVENT__STATUS;
				case OrderPackage.ORDER_STATUS__PIECE_COUNT: return OrderPackage.ORDER_STATUS_CHANGE_EVENT__PIECE_COUNT;
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", status: ");
		result.append(status);
		result.append(", pieceCount: ");
		result.append(pieceCount);
		result.append(')');
		return result.toString();
	}

} //OrderStatusChangeEventImpl
