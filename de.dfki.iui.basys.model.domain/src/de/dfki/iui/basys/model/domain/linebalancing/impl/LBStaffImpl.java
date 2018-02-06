/**
 */
package de.dfki.iui.basys.model.domain.linebalancing.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;
import de.dfki.iui.basys.model.domain.linebalancing.LBStaff;
import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LB Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl#getComponentId_src <em>Component Id src</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl#getComponentId_target <em>Component Id target</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl#getCurrentProductInstanceId <em>Current Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBStaffImpl#getRemainingMovementTime <em>Remaining Movement Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LBStaffImpl extends EntityImpl implements LBStaff {
	/**
	 * The default value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected String assignment = ASSIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentId_src() <em>Component Id src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId_src()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId_src() <em>Component Id src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId_src()
	 * @generated
	 * @ordered
	 */
	protected String componentId_src = COMPONENT_ID_SRC_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentId_target() <em>Component Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId_target()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId_target() <em>Component Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId_target()
	 * @generated
	 * @ordered
	 */
	protected String componentId_target = COMPONENT_ID_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentProductInstanceId() <em>Current Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentProductInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_PRODUCT_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentProductInstanceId() <em>Current Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentProductInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String currentProductInstanceId = CURRENT_PRODUCT_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingMovementTime() <em>Remaining Movement Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingMovementTime()
	 * @generated
	 * @ordered
	 */
	protected static final long REMAINING_MOVEMENT_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRemainingMovementTime() <em>Remaining Movement Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingMovementTime()
	 * @generated
	 * @ordered
	 */
	protected long remainingMovementTime = REMAINING_MOVEMENT_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LBStaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinebalancingPackage.Literals.LB_STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(String newAssignment) {
		String oldAssignment = assignment;
		assignment = newAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LB_STAFF__ASSIGNMENT, oldAssignment, assignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId_src() {
		return componentId_src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId_src(String newComponentId_src) {
		String oldComponentId_src = componentId_src;
		componentId_src = newComponentId_src;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LB_STAFF__COMPONENT_ID_SRC, oldComponentId_src, componentId_src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId_target() {
		return componentId_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId_target(String newComponentId_target) {
		String oldComponentId_target = componentId_target;
		componentId_target = newComponentId_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LB_STAFF__COMPONENT_ID_TARGET, oldComponentId_target, componentId_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentProductInstanceId() {
		return currentProductInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentProductInstanceId(String newCurrentProductInstanceId) {
		String oldCurrentProductInstanceId = currentProductInstanceId;
		currentProductInstanceId = newCurrentProductInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LB_STAFF__CURRENT_PRODUCT_INSTANCE_ID, oldCurrentProductInstanceId, currentProductInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRemainingMovementTime() {
		return remainingMovementTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingMovementTime(long newRemainingMovementTime) {
		long oldRemainingMovementTime = remainingMovementTime;
		remainingMovementTime = newRemainingMovementTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.LB_STAFF__REMAINING_MOVEMENT_TIME, oldRemainingMovementTime, remainingMovementTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinebalancingPackage.LB_STAFF__ASSIGNMENT:
				return getAssignment();
			case LinebalancingPackage.LB_STAFF__COMPONENT_ID_SRC:
				return getComponentId_src();
			case LinebalancingPackage.LB_STAFF__COMPONENT_ID_TARGET:
				return getComponentId_target();
			case LinebalancingPackage.LB_STAFF__CURRENT_PRODUCT_INSTANCE_ID:
				return getCurrentProductInstanceId();
			case LinebalancingPackage.LB_STAFF__REMAINING_MOVEMENT_TIME:
				return getRemainingMovementTime();
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
			case LinebalancingPackage.LB_STAFF__ASSIGNMENT:
				setAssignment((String)newValue);
				return;
			case LinebalancingPackage.LB_STAFF__COMPONENT_ID_SRC:
				setComponentId_src((String)newValue);
				return;
			case LinebalancingPackage.LB_STAFF__COMPONENT_ID_TARGET:
				setComponentId_target((String)newValue);
				return;
			case LinebalancingPackage.LB_STAFF__CURRENT_PRODUCT_INSTANCE_ID:
				setCurrentProductInstanceId((String)newValue);
				return;
			case LinebalancingPackage.LB_STAFF__REMAINING_MOVEMENT_TIME:
				setRemainingMovementTime((Long)newValue);
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
			case LinebalancingPackage.LB_STAFF__ASSIGNMENT:
				setAssignment(ASSIGNMENT_EDEFAULT);
				return;
			case LinebalancingPackage.LB_STAFF__COMPONENT_ID_SRC:
				setComponentId_src(COMPONENT_ID_SRC_EDEFAULT);
				return;
			case LinebalancingPackage.LB_STAFF__COMPONENT_ID_TARGET:
				setComponentId_target(COMPONENT_ID_TARGET_EDEFAULT);
				return;
			case LinebalancingPackage.LB_STAFF__CURRENT_PRODUCT_INSTANCE_ID:
				setCurrentProductInstanceId(CURRENT_PRODUCT_INSTANCE_ID_EDEFAULT);
				return;
			case LinebalancingPackage.LB_STAFF__REMAINING_MOVEMENT_TIME:
				setRemainingMovementTime(REMAINING_MOVEMENT_TIME_EDEFAULT);
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
			case LinebalancingPackage.LB_STAFF__ASSIGNMENT:
				return ASSIGNMENT_EDEFAULT == null ? assignment != null : !ASSIGNMENT_EDEFAULT.equals(assignment);
			case LinebalancingPackage.LB_STAFF__COMPONENT_ID_SRC:
				return COMPONENT_ID_SRC_EDEFAULT == null ? componentId_src != null : !COMPONENT_ID_SRC_EDEFAULT.equals(componentId_src);
			case LinebalancingPackage.LB_STAFF__COMPONENT_ID_TARGET:
				return COMPONENT_ID_TARGET_EDEFAULT == null ? componentId_target != null : !COMPONENT_ID_TARGET_EDEFAULT.equals(componentId_target);
			case LinebalancingPackage.LB_STAFF__CURRENT_PRODUCT_INSTANCE_ID:
				return CURRENT_PRODUCT_INSTANCE_ID_EDEFAULT == null ? currentProductInstanceId != null : !CURRENT_PRODUCT_INSTANCE_ID_EDEFAULT.equals(currentProductInstanceId);
			case LinebalancingPackage.LB_STAFF__REMAINING_MOVEMENT_TIME:
				return remainingMovementTime != REMAINING_MOVEMENT_TIME_EDEFAULT;
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
		result.append(" (assignment: ");
		result.append(assignment);
		result.append(", componentId_src: ");
		result.append(componentId_src);
		result.append(", componentId_target: ");
		result.append(componentId_target);
		result.append(", currentProductInstanceId: ");
		result.append(currentProductInstanceId);
		result.append(", remainingMovementTime: ");
		result.append(remainingMovementTime);
		result.append(')');
		return result.toString();
	}

} //LBStaffImpl
