/**
 */
package de.dfki.cos.basys.platform.model.domain.capability.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.LoadCarrierUnitEnum;
import de.dfki.cos.basys.platform.model.domain.capability.LogisticsCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistics Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.LogisticsCapabilityImpl#getLoadCarrierUnit <em>Load Carrier Unit</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.LogisticsCapabilityImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.LogisticsCapabilityImpl#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticsCapabilityImpl extends CapabilityImpl implements LogisticsCapability {
	/**
	 * The default value of the '{@link #getLoadCarrierUnit() <em>Load Carrier Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadCarrierUnit()
	 * @generated
	 * @ordered
	 */
	protected static final LoadCarrierUnitEnum LOAD_CARRIER_UNIT_EDEFAULT = LoadCarrierUnitEnum.UNDEFINED;

	/**
	 * The cached value of the '{@link #getLoadCarrierUnit() <em>Load Carrier Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadCarrierUnit()
	 * @generated
	 * @ordered
	 */
	protected LoadCarrierUnitEnum loadCarrierUnit = LOAD_CARRIER_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayload() <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected static final double PAYLOAD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected double payload = PAYLOAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticsCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.LOGISTICS_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadCarrierUnitEnum getLoadCarrierUnit() {
		return loadCarrierUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadCarrierUnit(LoadCarrierUnitEnum newLoadCarrierUnit) {
		LoadCarrierUnitEnum oldLoadCarrierUnit = loadCarrierUnit;
		loadCarrierUnit = newLoadCarrierUnit == null ? LOAD_CARRIER_UNIT_EDEFAULT : newLoadCarrierUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT, oldLoadCarrierUnit, loadCarrierUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.LOGISTICS_CAPABILITY__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPayload() {
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayload(double newPayload) {
		double oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.LOGISTICS_CAPABILITY__PAYLOAD, oldPayload, payload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT:
				return getLoadCarrierUnit();
			case CapabilityPackage.LOGISTICS_CAPABILITY__CAPACITY:
				return getCapacity();
			case CapabilityPackage.LOGISTICS_CAPABILITY__PAYLOAD:
				return getPayload();
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
			case CapabilityPackage.LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT:
				setLoadCarrierUnit((LoadCarrierUnitEnum)newValue);
				return;
			case CapabilityPackage.LOGISTICS_CAPABILITY__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case CapabilityPackage.LOGISTICS_CAPABILITY__PAYLOAD:
				setPayload((Double)newValue);
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
			case CapabilityPackage.LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT:
				setLoadCarrierUnit(LOAD_CARRIER_UNIT_EDEFAULT);
				return;
			case CapabilityPackage.LOGISTICS_CAPABILITY__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case CapabilityPackage.LOGISTICS_CAPABILITY__PAYLOAD:
				setPayload(PAYLOAD_EDEFAULT);
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
			case CapabilityPackage.LOGISTICS_CAPABILITY__LOAD_CARRIER_UNIT:
				return loadCarrierUnit != LOAD_CARRIER_UNIT_EDEFAULT;
			case CapabilityPackage.LOGISTICS_CAPABILITY__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case CapabilityPackage.LOGISTICS_CAPABILITY__PAYLOAD:
				return payload != PAYLOAD_EDEFAULT;
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
		result.append(" (loadCarrierUnit: ");
		result.append(loadCarrierUnit);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", payload: ");
		result.append(payload);
		result.append(')');
		return result.toString();
	}

} //LogisticsCapabilityImpl
