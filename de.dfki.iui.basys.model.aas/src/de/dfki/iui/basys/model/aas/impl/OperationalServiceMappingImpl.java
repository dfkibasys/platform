/**
 */
package de.dfki.iui.basys.model.aas.impl;

import de.dfki.iui.basys.model.aas.AasPackage;
import de.dfki.iui.basys.model.aas.OperationalServiceMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Service Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.aas.impl.OperationalServiceMappingImpl#getServiceDescriptionId <em>Service Description Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.impl.OperationalServiceMappingImpl#getServiceInstanceId <em>Service Instance Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalServiceMappingImpl extends MinimalEObjectImpl.Container implements OperationalServiceMapping {
	/**
	 * The default value of the '{@link #getServiceDescriptionId() <em>Service Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DESCRIPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDescriptionId() <em>Service Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionId()
	 * @generated
	 * @ordered
	 */
	protected String serviceDescriptionId = SERVICE_DESCRIPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceInstanceId() <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInstanceId() <em>Service Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String serviceInstanceId = SERVICE_INSTANCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalServiceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.OPERATIONAL_SERVICE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDescriptionId() {
		return serviceDescriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescriptionId(String newServiceDescriptionId) {
		String oldServiceDescriptionId = serviceDescriptionId;
		serviceDescriptionId = newServiceDescriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_DESCRIPTION_ID, oldServiceDescriptionId, serviceDescriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInstanceId() {
		return serviceInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstanceId(String newServiceInstanceId) {
		String oldServiceInstanceId = serviceInstanceId;
		serviceInstanceId = newServiceInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_INSTANCE_ID, oldServiceInstanceId, serviceInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_DESCRIPTION_ID:
				return getServiceDescriptionId();
			case AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_INSTANCE_ID:
				return getServiceInstanceId();
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
			case AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_DESCRIPTION_ID:
				setServiceDescriptionId((String)newValue);
				return;
			case AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_INSTANCE_ID:
				setServiceInstanceId((String)newValue);
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
			case AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_DESCRIPTION_ID:
				setServiceDescriptionId(SERVICE_DESCRIPTION_ID_EDEFAULT);
				return;
			case AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_INSTANCE_ID:
				setServiceInstanceId(SERVICE_INSTANCE_ID_EDEFAULT);
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
			case AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_DESCRIPTION_ID:
				return SERVICE_DESCRIPTION_ID_EDEFAULT == null ? serviceDescriptionId != null : !SERVICE_DESCRIPTION_ID_EDEFAULT.equals(serviceDescriptionId);
			case AasPackage.OPERATIONAL_SERVICE_MAPPING__SERVICE_INSTANCE_ID:
				return SERVICE_INSTANCE_ID_EDEFAULT == null ? serviceInstanceId != null : !SERVICE_INSTANCE_ID_EDEFAULT.equals(serviceInstanceId);
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
		result.append(" (serviceDescriptionId: ");
		result.append(serviceDescriptionId);
		result.append(", serviceInstanceId: ");
		result.append(serviceInstanceId);
		result.append(')');
		return result.toString();
	}

} //OperationalServiceMappingImpl
