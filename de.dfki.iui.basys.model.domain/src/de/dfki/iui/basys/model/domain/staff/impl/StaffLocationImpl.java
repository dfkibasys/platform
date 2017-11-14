/**
 */
package de.dfki.iui.basys.model.domain.staff.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.staff.StaffDetectionEnum;
import de.dfki.iui.basys.model.domain.staff.StaffLocation;
import de.dfki.iui.basys.model.domain.staff.StaffPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.StaffLocationImpl#getDetectionType <em>Detection Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.StaffLocationImpl#getStaffid <em>Staffid</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.staff.impl.StaffLocationImpl#getComponentId <em>Component Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffLocationImpl extends EntityImpl implements StaffLocation {
	/**
	 * The default value of the '{@link #getDetectionType() <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectionType()
	 * @generated
	 * @ordered
	 */
	protected static final StaffDetectionEnum DETECTION_TYPE_EDEFAULT = StaffDetectionEnum.UNKNOWN;

	/**
	 * The cached value of the '{@link #getDetectionType() <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectionType()
	 * @generated
	 * @ordered
	 */
	protected StaffDetectionEnum detectionType = DETECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaffid() <em>Staffid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffid()
	 * @generated
	 * @ordered
	 */
	protected static final String STAFFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaffid() <em>Staffid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffid()
	 * @generated
	 * @ordered
	 */
	protected String staffid = STAFFID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaffPackage.Literals.STAFF_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffDetectionEnum getDetectionType() {
		return detectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetectionType(StaffDetectionEnum newDetectionType) {
		StaffDetectionEnum oldDetectionType = detectionType;
		detectionType = newDetectionType == null ? DETECTION_TYPE_EDEFAULT : newDetectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF_LOCATION__DETECTION_TYPE, oldDetectionType, detectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaffid() {
		return staffid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffid(String newStaffid) {
		String oldStaffid = staffid;
		staffid = newStaffid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF_LOCATION__STAFFID, oldStaffid, staffid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF_LOCATION__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaffPackage.STAFF_LOCATION__DETECTION_TYPE:
				return getDetectionType();
			case StaffPackage.STAFF_LOCATION__STAFFID:
				return getStaffid();
			case StaffPackage.STAFF_LOCATION__COMPONENT_ID:
				return getComponentId();
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
			case StaffPackage.STAFF_LOCATION__DETECTION_TYPE:
				setDetectionType((StaffDetectionEnum)newValue);
				return;
			case StaffPackage.STAFF_LOCATION__STAFFID:
				setStaffid((String)newValue);
				return;
			case StaffPackage.STAFF_LOCATION__COMPONENT_ID:
				setComponentId((String)newValue);
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
			case StaffPackage.STAFF_LOCATION__DETECTION_TYPE:
				setDetectionType(DETECTION_TYPE_EDEFAULT);
				return;
			case StaffPackage.STAFF_LOCATION__STAFFID:
				setStaffid(STAFFID_EDEFAULT);
				return;
			case StaffPackage.STAFF_LOCATION__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
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
			case StaffPackage.STAFF_LOCATION__DETECTION_TYPE:
				return detectionType != DETECTION_TYPE_EDEFAULT;
			case StaffPackage.STAFF_LOCATION__STAFFID:
				return STAFFID_EDEFAULT == null ? staffid != null : !STAFFID_EDEFAULT.equals(staffid);
			case StaffPackage.STAFF_LOCATION__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
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
		result.append(" (detectionType: ");
		result.append(detectionType);
		result.append(", staffid: ");
		result.append(staffid);
		result.append(", componentId: ");
		result.append(componentId);
		result.append(')');
		return result.toString();
	}

} //StaffLocationImpl
