/**
 */
package de.dfki.iui.basys.model.domain.capability.impl;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;
import de.dfki.iui.basys.model.domain.capability.Pressen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.PressenImpl#getDruck <em>Druck</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.PressenImpl#getHub <em>Hub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PressenImpl extends AnEinpressenImpl implements Pressen {
	/**
	 * The default value of the '{@link #getDruck() <em>Druck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDruck()
	 * @generated
	 * @ordered
	 */
	protected static final int DRUCK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDruck() <em>Druck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDruck()
	 * @generated
	 * @ordered
	 */
	protected int druck = DRUCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHub() <em>Hub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHub()
	 * @generated
	 * @ordered
	 */
	protected static final int HUB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHub() <em>Hub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHub()
	 * @generated
	 * @ordered
	 */
	protected int hub = HUB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.PRESSEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDruck() {
		return druck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDruck(int newDruck) {
		int oldDruck = druck;
		druck = newDruck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PRESSEN__DRUCK, oldDruck, druck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHub() {
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHub(int newHub) {
		int oldHub = hub;
		hub = newHub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.PRESSEN__HUB, oldHub, hub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.PRESSEN__DRUCK:
				return getDruck();
			case CapabilityPackage.PRESSEN__HUB:
				return getHub();
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
			case CapabilityPackage.PRESSEN__DRUCK:
				setDruck((Integer)newValue);
				return;
			case CapabilityPackage.PRESSEN__HUB:
				setHub((Integer)newValue);
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
			case CapabilityPackage.PRESSEN__DRUCK:
				setDruck(DRUCK_EDEFAULT);
				return;
			case CapabilityPackage.PRESSEN__HUB:
				setHub(HUB_EDEFAULT);
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
			case CapabilityPackage.PRESSEN__DRUCK:
				return druck != DRUCK_EDEFAULT;
			case CapabilityPackage.PRESSEN__HUB:
				return hub != HUB_EDEFAULT;
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
		result.append(" (druck: ");
		result.append(druck);
		result.append(", hub: ");
		result.append(hub);
		result.append(')');
		return result.toString();
	}

} //PressenImpl
