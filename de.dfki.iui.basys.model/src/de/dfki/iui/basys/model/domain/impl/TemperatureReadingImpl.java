/**
 */
package de.dfki.iui.basys.model.domain.impl;

import de.dfki.iui.basys.model.domain.DomainPackage;
import de.dfki.iui.basys.model.domain.TemperatureReading;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temperature Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.TemperatureReadingImpl#getMeasuredValue <em>Measured Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemperatureReadingImpl extends MinimalEObjectImpl.Container implements TemperatureReading {
	/**
	 * The default value of the '{@link #getMeasuredValue() <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MEASURED_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMeasuredValue() <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredValue()
	 * @generated
	 * @ordered
	 */
	protected float measuredValue = MEASURED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemperatureReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.TEMPERATURE_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMeasuredValue() {
		return measuredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredValue(float newMeasuredValue) {
		float oldMeasuredValue = measuredValue;
		measuredValue = newMeasuredValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TEMPERATURE_READING__MEASURED_VALUE, oldMeasuredValue, measuredValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.TEMPERATURE_READING__MEASURED_VALUE:
				return getMeasuredValue();
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
			case DomainPackage.TEMPERATURE_READING__MEASURED_VALUE:
				setMeasuredValue((Float)newValue);
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
			case DomainPackage.TEMPERATURE_READING__MEASURED_VALUE:
				setMeasuredValue(MEASURED_VALUE_EDEFAULT);
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
			case DomainPackage.TEMPERATURE_READING__MEASURED_VALUE:
				return measuredValue != MEASURED_VALUE_EDEFAULT;
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
		result.append(" (measuredValue: ");
		result.append(measuredValue);
		result.append(')');
		return result.toString();
	}

} //TemperatureReadingImpl
