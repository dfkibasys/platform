/**
 */
package de.dfki.iui.basys.model.service.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.service.ServiceImplementation;
import de.dfki.iui.basys.model.service.ServicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceImplementationImpl#getDescriptionId <em>Description Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceImplementationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceImplementationImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceImplementationImpl#getBundleLocation <em>Bundle Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImplementationImpl extends IdentifiableEntityImpl implements ServiceImplementation {
	/**
	 * The default value of the '{@link #getDescriptionId() <em>Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionId() <em>Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionId()
	 * @generated
	 * @ordered
	 */
	protected String descriptionId = DESCRIPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected String platform = PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBundleLocation() <em>Bundle Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundleLocation() <em>Bundle Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleLocation()
	 * @generated
	 * @ordered
	 */
	protected String bundleLocation = BUNDLE_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionId() {
		return descriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionId(String newDescriptionId) {
		String oldDescriptionId = descriptionId;
		descriptionId = newDescriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_IMPLEMENTATION__DESCRIPTION_ID, oldDescriptionId, descriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_IMPLEMENTATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(String newPlatform) {
		String oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_IMPLEMENTATION__PLATFORM, oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundleLocation() {
		return bundleLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleLocation(String newBundleLocation) {
		String oldBundleLocation = bundleLocation;
		bundleLocation = newBundleLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_IMPLEMENTATION__BUNDLE_LOCATION, oldBundleLocation, bundleLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE_IMPLEMENTATION__DESCRIPTION_ID:
				return getDescriptionId();
			case ServicePackage.SERVICE_IMPLEMENTATION__VERSION:
				return getVersion();
			case ServicePackage.SERVICE_IMPLEMENTATION__PLATFORM:
				return getPlatform();
			case ServicePackage.SERVICE_IMPLEMENTATION__BUNDLE_LOCATION:
				return getBundleLocation();
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
			case ServicePackage.SERVICE_IMPLEMENTATION__DESCRIPTION_ID:
				setDescriptionId((String)newValue);
				return;
			case ServicePackage.SERVICE_IMPLEMENTATION__VERSION:
				setVersion((String)newValue);
				return;
			case ServicePackage.SERVICE_IMPLEMENTATION__PLATFORM:
				setPlatform((String)newValue);
				return;
			case ServicePackage.SERVICE_IMPLEMENTATION__BUNDLE_LOCATION:
				setBundleLocation((String)newValue);
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
			case ServicePackage.SERVICE_IMPLEMENTATION__DESCRIPTION_ID:
				setDescriptionId(DESCRIPTION_ID_EDEFAULT);
				return;
			case ServicePackage.SERVICE_IMPLEMENTATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ServicePackage.SERVICE_IMPLEMENTATION__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case ServicePackage.SERVICE_IMPLEMENTATION__BUNDLE_LOCATION:
				setBundleLocation(BUNDLE_LOCATION_EDEFAULT);
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
			case ServicePackage.SERVICE_IMPLEMENTATION__DESCRIPTION_ID:
				return DESCRIPTION_ID_EDEFAULT == null ? descriptionId != null : !DESCRIPTION_ID_EDEFAULT.equals(descriptionId);
			case ServicePackage.SERVICE_IMPLEMENTATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ServicePackage.SERVICE_IMPLEMENTATION__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case ServicePackage.SERVICE_IMPLEMENTATION__BUNDLE_LOCATION:
				return BUNDLE_LOCATION_EDEFAULT == null ? bundleLocation != null : !BUNDLE_LOCATION_EDEFAULT.equals(bundleLocation);
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
		result.append(" (descriptionId: ");
		result.append(descriptionId);
		result.append(", version: ");
		result.append(version);
		result.append(", platform: ");
		result.append(platform);
		result.append(", bundleLocation: ");
		result.append(bundleLocation);
		result.append(')');
		return result.toString();
	}

} //ServiceImplementationImpl
