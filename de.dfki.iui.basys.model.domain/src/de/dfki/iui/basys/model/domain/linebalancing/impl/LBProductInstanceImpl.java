/**
 */
package de.dfki.iui.basys.model.domain.linebalancing.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance;
import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LB Product Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBProductInstanceImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBProductInstanceImpl#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBProductInstanceImpl#getRemainingTime <em>Remaining Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LBProductInstanceImpl extends EntityImpl implements LBProductInstance {
	/**
	 * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected String componentId = COMPONENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkstepInstanceId() <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKSTEP_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkstepInstanceId() <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String workstepInstanceId = WORKSTEP_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected static final long REMAINING_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected long remainingTime = REMAINING_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LBProductInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinebalancingPackage.Literals.LB_PRODUCT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LB_PRODUCT_INSTANCE__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkstepInstanceId() {
		return workstepInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkstepInstanceId(String newWorkstepInstanceId) {
		String oldWorkstepInstanceId = workstepInstanceId;
		workstepInstanceId = newWorkstepInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LB_PRODUCT_INSTANCE__WORKSTEP_INSTANCE_ID, oldWorkstepInstanceId, workstepInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRemainingTime() {
		return remainingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingTime(long newRemainingTime) {
		long oldRemainingTime = remainingTime;
		remainingTime = newRemainingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LB_PRODUCT_INSTANCE__REMAINING_TIME, oldRemainingTime, remainingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__COMPONENT_ID:
				return getComponentId();
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__WORKSTEP_INSTANCE_ID:
				return getWorkstepInstanceId();
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__REMAINING_TIME:
				return getRemainingTime();
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
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__WORKSTEP_INSTANCE_ID:
				setWorkstepInstanceId((String)newValue);
				return;
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__REMAINING_TIME:
				setRemainingTime((Long)newValue);
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
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__WORKSTEP_INSTANCE_ID:
				setWorkstepInstanceId(WORKSTEP_INSTANCE_ID_EDEFAULT);
				return;
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__REMAINING_TIME:
				setRemainingTime(REMAINING_TIME_EDEFAULT);
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
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__WORKSTEP_INSTANCE_ID:
				return WORKSTEP_INSTANCE_ID_EDEFAULT == null ? workstepInstanceId != null : !WORKSTEP_INSTANCE_ID_EDEFAULT.equals(workstepInstanceId);
			case LinebalancingPackage.LB_PRODUCT_INSTANCE__REMAINING_TIME:
				return remainingTime != REMAINING_TIME_EDEFAULT;
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
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(", workstepInstanceId: ");
		result.append(workstepInstanceId);
		result.append(", remainingTime: ");
		result.append(remainingTime);
		result.append(')');
		return result.toString();
	}

} //LBProductInstanceImpl
