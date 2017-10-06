/**
 */
package de.dfki.iui.basys.model.domain.workplan.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workstep Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl#getStationId <em>Station Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceImpl#isIsAutomatic <em>Is Automatic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkstepInstanceImpl extends IdentifiableEntityImpl implements WorkstepInstance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStationId() <em>Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStationId() <em>Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationId()
	 * @generated
	 * @ordered
	 */
	protected String stationId = STATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAutomatic() <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutomatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTOMATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutomatic() <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutomatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutomatic = IS_AUTOMATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkstepInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkplanPackage.Literals.WORKSTEP_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.WORKSTEP_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStationId() {
		return stationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationId(String newStationId) {
		String oldStationId = stationId;
		stationId = newStationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.WORKSTEP_INSTANCE__STATION_ID, oldStationId, stationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAutomatic() {
		return isAutomatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutomatic(boolean newIsAutomatic) {
		boolean oldIsAutomatic = isAutomatic;
		isAutomatic = newIsAutomatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.WORKSTEP_INSTANCE__IS_AUTOMATIC, oldIsAutomatic, isAutomatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkplanPackage.WORKSTEP_INSTANCE__NAME:
				return getName();
			case WorkplanPackage.WORKSTEP_INSTANCE__STATION_ID:
				return getStationId();
			case WorkplanPackage.WORKSTEP_INSTANCE__IS_AUTOMATIC:
				return isIsAutomatic();
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
			case WorkplanPackage.WORKSTEP_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case WorkplanPackage.WORKSTEP_INSTANCE__STATION_ID:
				setStationId((String)newValue);
				return;
			case WorkplanPackage.WORKSTEP_INSTANCE__IS_AUTOMATIC:
				setIsAutomatic((Boolean)newValue);
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
			case WorkplanPackage.WORKSTEP_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkplanPackage.WORKSTEP_INSTANCE__STATION_ID:
				setStationId(STATION_ID_EDEFAULT);
				return;
			case WorkplanPackage.WORKSTEP_INSTANCE__IS_AUTOMATIC:
				setIsAutomatic(IS_AUTOMATIC_EDEFAULT);
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
			case WorkplanPackage.WORKSTEP_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkplanPackage.WORKSTEP_INSTANCE__STATION_ID:
				return STATION_ID_EDEFAULT == null ? stationId != null : !STATION_ID_EDEFAULT.equals(stationId);
			case WorkplanPackage.WORKSTEP_INSTANCE__IS_AUTOMATIC:
				return isAutomatic != IS_AUTOMATIC_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", stationId: ");
		result.append(stationId);
		result.append(", isAutomatic: ");
		result.append(isAutomatic);
		result.append(')');
		return result.toString();
	}

} //WorkstepInstanceImpl
