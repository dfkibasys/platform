/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.ResponseImpl#getRequestId <em>Request Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MessageImpl implements Response {
	/**
	 * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected String requestId = REQUEST_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(String newRequestId) {
		String oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.RESPONSE__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.RESPONSE__REQUEST_ID:
				return getRequestId();
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
			case CommunicationPackage.RESPONSE__REQUEST_ID:
				setRequestId((String)newValue);
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
			case CommunicationPackage.RESPONSE__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
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
			case CommunicationPackage.RESPONSE__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
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
		result.append(" (requestId: ");
		result.append(requestId);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
