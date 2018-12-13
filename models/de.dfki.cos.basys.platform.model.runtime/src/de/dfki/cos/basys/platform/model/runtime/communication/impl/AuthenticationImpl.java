/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.AuthenticationImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.AuthenticationImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.impl.AuthenticationImpl#getCertificate <em>Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationImpl extends MinimalEObjectImpl.Container implements Authentication {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected String certificate = CERTIFICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.AUTHENTICATION__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.AUTHENTICATION__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificate(String newCertificate) {
		String oldCertificate = certificate;
		certificate = newCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.AUTHENTICATION__CERTIFICATE, oldCertificate, certificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.AUTHENTICATION__USERNAME:
				return getUsername();
			case CommunicationPackage.AUTHENTICATION__PASSWORD:
				return getPassword();
			case CommunicationPackage.AUTHENTICATION__CERTIFICATE:
				return getCertificate();
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
			case CommunicationPackage.AUTHENTICATION__USERNAME:
				setUsername((String)newValue);
				return;
			case CommunicationPackage.AUTHENTICATION__PASSWORD:
				setPassword((String)newValue);
				return;
			case CommunicationPackage.AUTHENTICATION__CERTIFICATE:
				setCertificate((String)newValue);
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
			case CommunicationPackage.AUTHENTICATION__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case CommunicationPackage.AUTHENTICATION__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CommunicationPackage.AUTHENTICATION__CERTIFICATE:
				setCertificate(CERTIFICATE_EDEFAULT);
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
			case CommunicationPackage.AUTHENTICATION__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case CommunicationPackage.AUTHENTICATION__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CommunicationPackage.AUTHENTICATION__CERTIFICATE:
				return CERTIFICATE_EDEFAULT == null ? certificate != null : !CERTIFICATE_EDEFAULT.equals(certificate);
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
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", certificate: ");
		result.append(certificate);
		result.append(')');
		return result.toString();
	}

} //AuthenticationImpl
