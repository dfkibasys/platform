/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Request Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestStatusImpl#getProcessInstanceId <em>Process Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestStatusImpl#getBusinessKey <em>Business Key</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestStatusImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestStatusImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRequestStatusImpl extends MinimalEObjectImpl.Container implements ProcessRequestStatus {
	/**
	 * The default value of the '{@link #getProcessInstanceId() <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessInstanceId() <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String processInstanceId = PROCESS_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessKey() <em>Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessKey()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessKey() <em>Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessKey()
	 * @generated
	 * @ordered
	 */
	protected String businessKey = BUSINESS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RequestStatus STATUS_EDEFAULT = RequestStatus.UNDEFINED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RequestStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequestStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.PROCESS_REQUEST_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessInstanceId() {
		return processInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessInstanceId(String newProcessInstanceId) {
		String oldProcessInstanceId = processInstanceId;
		processInstanceId = newProcessInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_REQUEST_STATUS__PROCESS_INSTANCE_ID, oldProcessInstanceId, processInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessKey() {
		return businessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessKey(String newBusinessKey) {
		String oldBusinessKey = businessKey;
		businessKey = newBusinessKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_REQUEST_STATUS__BUSINESS_KEY, oldBusinessKey, businessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(RequestStatus newStatus) {
		RequestStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_REQUEST_STATUS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_REQUEST_STATUS__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.PROCESS_REQUEST_STATUS__PROCESS_INSTANCE_ID:
				return getProcessInstanceId();
			case ComponentPackage.PROCESS_REQUEST_STATUS__BUSINESS_KEY:
				return getBusinessKey();
			case ComponentPackage.PROCESS_REQUEST_STATUS__STATUS:
				return getStatus();
			case ComponentPackage.PROCESS_REQUEST_STATUS__MESSAGE:
				return getMessage();
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
			case ComponentPackage.PROCESS_REQUEST_STATUS__PROCESS_INSTANCE_ID:
				setProcessInstanceId((String)newValue);
				return;
			case ComponentPackage.PROCESS_REQUEST_STATUS__BUSINESS_KEY:
				setBusinessKey((String)newValue);
				return;
			case ComponentPackage.PROCESS_REQUEST_STATUS__STATUS:
				setStatus((RequestStatus)newValue);
				return;
			case ComponentPackage.PROCESS_REQUEST_STATUS__MESSAGE:
				setMessage((String)newValue);
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
			case ComponentPackage.PROCESS_REQUEST_STATUS__PROCESS_INSTANCE_ID:
				setProcessInstanceId(PROCESS_INSTANCE_ID_EDEFAULT);
				return;
			case ComponentPackage.PROCESS_REQUEST_STATUS__BUSINESS_KEY:
				setBusinessKey(BUSINESS_KEY_EDEFAULT);
				return;
			case ComponentPackage.PROCESS_REQUEST_STATUS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ComponentPackage.PROCESS_REQUEST_STATUS__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case ComponentPackage.PROCESS_REQUEST_STATUS__PROCESS_INSTANCE_ID:
				return PROCESS_INSTANCE_ID_EDEFAULT == null ? processInstanceId != null : !PROCESS_INSTANCE_ID_EDEFAULT.equals(processInstanceId);
			case ComponentPackage.PROCESS_REQUEST_STATUS__BUSINESS_KEY:
				return BUSINESS_KEY_EDEFAULT == null ? businessKey != null : !BUSINESS_KEY_EDEFAULT.equals(businessKey);
			case ComponentPackage.PROCESS_REQUEST_STATUS__STATUS:
				return status != STATUS_EDEFAULT;
			case ComponentPackage.PROCESS_REQUEST_STATUS__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (processInstanceId: ");
		result.append(processInstanceId);
		result.append(", businessKey: ");
		result.append(businessKey);
		result.append(", status: ");
		result.append(status);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //ProcessRequestStatusImpl
