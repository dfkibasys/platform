/**
 */
package de.dfki.iui.basys.model.domain.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.DomainPackage;
import de.dfki.iui.basys.model.domain.RecognitionEnum;
import de.dfki.iui.basys.model.domain.StaffRecognition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Recognition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.StaffRecognitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.StaffRecognitionImpl#getWorkerId <em>Worker Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.StaffRecognitionImpl#getComponentId <em>Component Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffRecognitionImpl extends EntityImpl implements StaffRecognition {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RecognitionEnum TYPE_EDEFAULT = RecognitionEnum.PRESENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RecognitionEnum type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkerId() <em>Worker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkerId() <em>Worker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerId()
	 * @generated
	 * @ordered
	 */
	protected String workerId = WORKER_ID_EDEFAULT;

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
	protected StaffRecognitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.STAFF_RECOGNITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognitionEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RecognitionEnum newType) {
		RecognitionEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STAFF_RECOGNITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkerId() {
		return workerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerId(String newWorkerId) {
		String oldWorkerId = workerId;
		workerId = newWorkerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STAFF_RECOGNITION__WORKER_ID, oldWorkerId, workerId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STAFF_RECOGNITION__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.STAFF_RECOGNITION__TYPE:
				return getType();
			case DomainPackage.STAFF_RECOGNITION__WORKER_ID:
				return getWorkerId();
			case DomainPackage.STAFF_RECOGNITION__COMPONENT_ID:
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
			case DomainPackage.STAFF_RECOGNITION__TYPE:
				setType((RecognitionEnum)newValue);
				return;
			case DomainPackage.STAFF_RECOGNITION__WORKER_ID:
				setWorkerId((String)newValue);
				return;
			case DomainPackage.STAFF_RECOGNITION__COMPONENT_ID:
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
			case DomainPackage.STAFF_RECOGNITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DomainPackage.STAFF_RECOGNITION__WORKER_ID:
				setWorkerId(WORKER_ID_EDEFAULT);
				return;
			case DomainPackage.STAFF_RECOGNITION__COMPONENT_ID:
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
			case DomainPackage.STAFF_RECOGNITION__TYPE:
				return type != TYPE_EDEFAULT;
			case DomainPackage.STAFF_RECOGNITION__WORKER_ID:
				return WORKER_ID_EDEFAULT == null ? workerId != null : !WORKER_ID_EDEFAULT.equals(workerId);
			case DomainPackage.STAFF_RECOGNITION__COMPONENT_ID:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", workerId: ");
		result.append(workerId);
		result.append(", componentId: ");
		result.append(componentId);
		result.append(')');
		return result.toString();
	}

} //StaffRecognitionImpl
