/**
 */
package de.dfki.iui.basys.model.domain.order.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.domain.order.Order;
import de.dfki.iui.basys.model.domain.order.OrderPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.impl.OrderImpl#getProductVariantId <em>Product Variant Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.impl.OrderImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.impl.OrderImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.impl.OrderImpl#getPieces <em>Pieces</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.order.impl.OrderImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends IdentifiableEntityImpl implements Order {
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
	 * The default value of the '{@link #getPieces() <em>Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieces()
	 * @generated
	 * @ordered
	 */
	protected static final int PIECES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPieces() <em>Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieces()
	 * @generated
	 * @ordered
	 */
	protected int pieces = PIECES_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__PRODUCT_VARIANT_ID, oldProductVariantId, productVariantId));
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
	public int getPieces() {
		return pieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPieces(int newPieces) {
		int oldPieces = pieces;
		pieces = newPieces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER__PIECES, oldPieces, pieces));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER__PRODUCT_VARIANT_ID:
				return getProductVariantId();
			case OrderPackage.ORDER__START_DATE:
				return getStartDate();
			case OrderPackage.ORDER__END_DATE:
				return getEndDate();
			case OrderPackage.ORDER__PIECES:
				return getPieces();
			case OrderPackage.ORDER__PRIORITY:
				return getPriority();
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
			case OrderPackage.ORDER__PRODUCT_VARIANT_ID:
				setProductVariantId((String)newValue);
				return;
			case OrderPackage.ORDER__START_DATE:
				setStartDate((Date)newValue);
				return;
			case OrderPackage.ORDER__END_DATE:
				setEndDate((Date)newValue);
				return;
			case OrderPackage.ORDER__PIECES:
				setPieces((Integer)newValue);
				return;
			case OrderPackage.ORDER__PRIORITY:
				setPriority((Integer)newValue);
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
			case OrderPackage.ORDER__PRODUCT_VARIANT_ID:
				setProductVariantId(PRODUCT_VARIANT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER__PIECES:
				setPieces(PIECES_EDEFAULT);
				return;
			case OrderPackage.ORDER__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case OrderPackage.ORDER__PRODUCT_VARIANT_ID:
				return PRODUCT_VARIANT_ID_EDEFAULT == null ? productVariantId != null : !PRODUCT_VARIANT_ID_EDEFAULT.equals(productVariantId);
			case OrderPackage.ORDER__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case OrderPackage.ORDER__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case OrderPackage.ORDER__PIECES:
				return pieces != PIECES_EDEFAULT;
			case OrderPackage.ORDER__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", pieces: ");
		result.append(pieces);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
