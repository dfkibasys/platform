/**
 */
package de.dfki.cos.basys.platform.model.domain.capability.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.Screwing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screwing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.ScrewingImpl#getTorque <em>Torque</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrewingImpl extends AnEinpressenImpl implements Screwing {
	/**
	 * The default value of the '{@link #getTorque() <em>Torque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorque()
	 * @generated
	 * @ordered
	 */
	protected static final double TORQUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTorque() <em>Torque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorque()
	 * @generated
	 * @ordered
	 */
	protected double torque = TORQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrewingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.SCREWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTorque() {
		return torque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorque(double newTorque) {
		double oldTorque = torque;
		torque = newTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.SCREWING__TORQUE, oldTorque, torque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.SCREWING__TORQUE:
				return getTorque();
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
			case CapabilityPackage.SCREWING__TORQUE:
				setTorque((Double)newValue);
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
			case CapabilityPackage.SCREWING__TORQUE:
				setTorque(TORQUE_EDEFAULT);
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
			case CapabilityPackage.SCREWING__TORQUE:
				return torque != TORQUE_EDEFAULT;
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
		result.append(" (torque: ");
		result.append(torque);
		result.append(')');
		return result.toString();
	}

} //ScrewingImpl
