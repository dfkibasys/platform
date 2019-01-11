/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse;
import de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus;
import de.dfki.cos.basys.platform.model.runtime.component.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl#getProcessInstanceId <em>Process Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl#getBusinessKey <em>Business Key</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl#getResultVariables <em>Result Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessResponseImpl extends MinimalEObjectImpl.Container implements ProcessResponse {
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
	protected static final ResponseStatus STATUS_EDEFAULT = ResponseStatus.UNDEFINED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ResponseStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusCode() <em>Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected static final int STATUS_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected int statusCode = STATUS_CODE_EDEFAULT;

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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected ProcessRequest request;

	/**
	 * The cached value of the '{@link #getResultVariables() <em>Result Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> resultVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.PROCESS_RESPONSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_RESPONSE__PROCESS_INSTANCE_ID, oldProcessInstanceId, processInstanceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_RESPONSE__BUSINESS_KEY, oldBusinessKey, businessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ResponseStatus newStatus) {
		ResponseStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_RESPONSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(int newStatusCode) {
		int oldStatusCode = statusCode;
		statusCode = newStatusCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_RESPONSE__STATUS_CODE, oldStatusCode, statusCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_RESPONSE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (ProcessRequest)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.PROCESS_RESPONSE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(ProcessRequest newRequest) {
		ProcessRequest oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PROCESS_RESPONSE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getResultVariables() {
		if (resultVariables == null) {
			resultVariables = new EObjectContainmentEList<Variable>(Variable.class, this, ComponentPackage.PROCESS_RESPONSE__RESULT_VARIABLES);
		}
		return resultVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.PROCESS_RESPONSE__RESULT_VARIABLES:
				return ((InternalEList<?>)getResultVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.PROCESS_RESPONSE__PROCESS_INSTANCE_ID:
				return getProcessInstanceId();
			case ComponentPackage.PROCESS_RESPONSE__BUSINESS_KEY:
				return getBusinessKey();
			case ComponentPackage.PROCESS_RESPONSE__STATUS:
				return getStatus();
			case ComponentPackage.PROCESS_RESPONSE__STATUS_CODE:
				return getStatusCode();
			case ComponentPackage.PROCESS_RESPONSE__MESSAGE:
				return getMessage();
			case ComponentPackage.PROCESS_RESPONSE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case ComponentPackage.PROCESS_RESPONSE__RESULT_VARIABLES:
				return getResultVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentPackage.PROCESS_RESPONSE__PROCESS_INSTANCE_ID:
				setProcessInstanceId((String)newValue);
				return;
			case ComponentPackage.PROCESS_RESPONSE__BUSINESS_KEY:
				setBusinessKey((String)newValue);
				return;
			case ComponentPackage.PROCESS_RESPONSE__STATUS:
				setStatus((ResponseStatus)newValue);
				return;
			case ComponentPackage.PROCESS_RESPONSE__STATUS_CODE:
				setStatusCode((Integer)newValue);
				return;
			case ComponentPackage.PROCESS_RESPONSE__MESSAGE:
				setMessage((String)newValue);
				return;
			case ComponentPackage.PROCESS_RESPONSE__REQUEST:
				setRequest((ProcessRequest)newValue);
				return;
			case ComponentPackage.PROCESS_RESPONSE__RESULT_VARIABLES:
				getResultVariables().clear();
				getResultVariables().addAll((Collection<? extends Variable>)newValue);
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
			case ComponentPackage.PROCESS_RESPONSE__PROCESS_INSTANCE_ID:
				setProcessInstanceId(PROCESS_INSTANCE_ID_EDEFAULT);
				return;
			case ComponentPackage.PROCESS_RESPONSE__BUSINESS_KEY:
				setBusinessKey(BUSINESS_KEY_EDEFAULT);
				return;
			case ComponentPackage.PROCESS_RESPONSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ComponentPackage.PROCESS_RESPONSE__STATUS_CODE:
				setStatusCode(STATUS_CODE_EDEFAULT);
				return;
			case ComponentPackage.PROCESS_RESPONSE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case ComponentPackage.PROCESS_RESPONSE__REQUEST:
				setRequest((ProcessRequest)null);
				return;
			case ComponentPackage.PROCESS_RESPONSE__RESULT_VARIABLES:
				getResultVariables().clear();
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
			case ComponentPackage.PROCESS_RESPONSE__PROCESS_INSTANCE_ID:
				return PROCESS_INSTANCE_ID_EDEFAULT == null ? processInstanceId != null : !PROCESS_INSTANCE_ID_EDEFAULT.equals(processInstanceId);
			case ComponentPackage.PROCESS_RESPONSE__BUSINESS_KEY:
				return BUSINESS_KEY_EDEFAULT == null ? businessKey != null : !BUSINESS_KEY_EDEFAULT.equals(businessKey);
			case ComponentPackage.PROCESS_RESPONSE__STATUS:
				return status != STATUS_EDEFAULT;
			case ComponentPackage.PROCESS_RESPONSE__STATUS_CODE:
				return statusCode != STATUS_CODE_EDEFAULT;
			case ComponentPackage.PROCESS_RESPONSE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case ComponentPackage.PROCESS_RESPONSE__REQUEST:
				return request != null;
			case ComponentPackage.PROCESS_RESPONSE__RESULT_VARIABLES:
				return resultVariables != null && !resultVariables.isEmpty();
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
		result.append(", statusCode: ");
		result.append(statusCode);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //ProcessResponseImpl
