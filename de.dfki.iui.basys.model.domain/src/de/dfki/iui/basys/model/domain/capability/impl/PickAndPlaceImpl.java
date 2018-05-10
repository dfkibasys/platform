/**
 */
package de.dfki.iui.basys.model.domain.capability.impl;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.PickAndPlace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pick And Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.PickAndPlaceImpl#getReach <em>Reach</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.PickAndPlaceImpl#getPositionRepeatability <em>Position Repeatability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PickAndPlaceImpl extends LogisticsCapabilityImpl implements PickAndPlace {
	/**
	 * The default value of the '{@link #getReach() <em>Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReach()
	 * @generated
	 * @ordered
	 */
	protected static final double REACH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReach() <em>Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReach()
	 * @generated
	 * @ordered
	 */
	protected double reach = REACH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionRepeatability() <em>Position Repeatability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionRepeatability()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_REPEATABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPositionRepeatability() <em>Position Repeatability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionRepeatability()
	 * @generated
	 * @ordered
	 */
	protected double positionRepeatability = POSITION_REPEATABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PickAndPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.PICK_AND_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReach() {
		return reach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReach(double newReach) {
		double oldReach = reach;
		reach = newReach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PICK_AND_PLACE__REACH, oldReach, reach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPositionRepeatability() {
		return positionRepeatability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionRepeatability(double newPositionRepeatability) {
		double oldPositionRepeatability = positionRepeatability;
		positionRepeatability = newPositionRepeatability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PICK_AND_PLACE__POSITION_REPEATABILITY, oldPositionRepeatability, positionRepeatability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.PICK_AND_PLACE__REACH:
				return getReach();
			case CapabilityPackage.PICK_AND_PLACE__POSITION_REPEATABILITY:
				return getPositionRepeatability();
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
			case CapabilityPackage.PICK_AND_PLACE__REACH:
				setReach((Double)newValue);
				return;
			case CapabilityPackage.PICK_AND_PLACE__POSITION_REPEATABILITY:
				setPositionRepeatability((Double)newValue);
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
			case CapabilityPackage.PICK_AND_PLACE__REACH:
				setReach(REACH_EDEFAULT);
				return;
			case CapabilityPackage.PICK_AND_PLACE__POSITION_REPEATABILITY:
				setPositionRepeatability(POSITION_REPEATABILITY_EDEFAULT);
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
			case CapabilityPackage.PICK_AND_PLACE__REACH:
				return reach != REACH_EDEFAULT;
			case CapabilityPackage.PICK_AND_PLACE__POSITION_REPEATABILITY:
				return positionRepeatability != POSITION_REPEATABILITY_EDEFAULT;
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
		result.append(" (reach: ");
		result.append(reach);
		result.append(", positionRepeatability: ");
		result.append(positionRepeatability);
		result.append(')');
		return result.toString();
	}

} //PickAndPlaceImpl
