/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus;
import de.dfki.cos.basys.platform.model.runtime.component.RequestStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRequestStatusImpl extends MinimalEObjectImpl.Container implements ComponentRequestStatus {
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
	protected ComponentRequestStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT_REQUEST_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_REQUEST_STATUS__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(RequestStatus newStatus) {
		RequestStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_REQUEST_STATUS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_REQUEST_STATUS__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_REQUEST_STATUS__COMPONENT_ID:
				return getComponentId();
			case ComponentPackage.COMPONENT_REQUEST_STATUS__STATUS:
				return getStatus();
			case ComponentPackage.COMPONENT_REQUEST_STATUS__MESSAGE:
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
			case ComponentPackage.COMPONENT_REQUEST_STATUS__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case ComponentPackage.COMPONENT_REQUEST_STATUS__STATUS:
				setStatus((RequestStatus)newValue);
				return;
			case ComponentPackage.COMPONENT_REQUEST_STATUS__MESSAGE:
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
			case ComponentPackage.COMPONENT_REQUEST_STATUS__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_REQUEST_STATUS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_REQUEST_STATUS__MESSAGE:
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
			case ComponentPackage.COMPONENT_REQUEST_STATUS__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case ComponentPackage.COMPONENT_REQUEST_STATUS__STATUS:
				return status != STATUS_EDEFAULT;
			case ComponentPackage.COMPONENT_REQUEST_STATUS__MESSAGE:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(", status: ");
		result.append(status);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

	public static class Builder {
		private String componentId;
		private RequestStatus status;
		private String message;

		public Builder componentId(String componentId) {
			this.componentId = componentId;
			return this;
		}

		public Builder status(RequestStatus status) {
			this.status = status;
			return this;
		}

		public Builder message(String message) {
			this.message = message;
			return this;
		}

		public ComponentRequestStatus build() {
			return new ComponentRequestStatusImpl(this);
		}
	}

	private ComponentRequestStatusImpl(Builder builder) {
		this.componentId = builder.componentId;
		this.status = builder.status;
		this.message = builder.message;
	}
}
