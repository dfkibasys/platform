/**
 */
package de.dfki.iui.basys.model.service.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;
import de.dfki.iui.basys.model.service.ServiceEndpoint;
import de.dfki.iui.basys.model.service.ServiceInstance;
import de.dfki.iui.basys.model.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceInstanceImpl#getServiceDescriptionId <em>Service Description Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceInstanceImpl#getServiceImplementationId <em>Service Implementation Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceInstanceImpl#getEndpoints <em>Endpoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInstanceImpl extends EntityImpl implements ServiceInstance {
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
	 * The default value of the '{@link #getServiceImplementationId() <em>Service Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceImplementationId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_IMPLEMENTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceImplementationId() <em>Service Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceImplementationId()
	 * @generated
	 * @ordered
	 */
	protected String serviceImplementationId = SERVICE_IMPLEMENTATION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceEndpoint> endpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_INSTANCE__SERVICE_DESCRIPTION_ID, oldServiceDescriptionId, serviceDescriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceImplementationId() {
		return serviceImplementationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceImplementationId(String newServiceImplementationId) {
		String oldServiceImplementationId = serviceImplementationId;
		serviceImplementationId = newServiceImplementationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_INSTANCE__SERVICE_IMPLEMENTATION_ID, oldServiceImplementationId, serviceImplementationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceEndpoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<ServiceEndpoint>(ServiceEndpoint.class, this, ServicePackage.SERVICE_INSTANCE__ENDPOINTS);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE_INSTANCE__ENDPOINTS:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.SERVICE_INSTANCE__SERVICE_DESCRIPTION_ID:
				return getServiceDescriptionId();
			case ServicePackage.SERVICE_INSTANCE__SERVICE_IMPLEMENTATION_ID:
				return getServiceImplementationId();
			case ServicePackage.SERVICE_INSTANCE__ENDPOINTS:
				return getEndpoints();
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
			case ServicePackage.SERVICE_INSTANCE__SERVICE_DESCRIPTION_ID:
				setServiceDescriptionId((String)newValue);
				return;
			case ServicePackage.SERVICE_INSTANCE__SERVICE_IMPLEMENTATION_ID:
				setServiceImplementationId((String)newValue);
				return;
			case ServicePackage.SERVICE_INSTANCE__ENDPOINTS:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends ServiceEndpoint>)newValue);
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
			case ServicePackage.SERVICE_INSTANCE__SERVICE_DESCRIPTION_ID:
				setServiceDescriptionId(SERVICE_DESCRIPTION_ID_EDEFAULT);
				return;
			case ServicePackage.SERVICE_INSTANCE__SERVICE_IMPLEMENTATION_ID:
				setServiceImplementationId(SERVICE_IMPLEMENTATION_ID_EDEFAULT);
				return;
			case ServicePackage.SERVICE_INSTANCE__ENDPOINTS:
				getEndpoints().clear();
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
			case ServicePackage.SERVICE_INSTANCE__SERVICE_DESCRIPTION_ID:
				return SERVICE_DESCRIPTION_ID_EDEFAULT == null ? serviceDescriptionId != null : !SERVICE_DESCRIPTION_ID_EDEFAULT.equals(serviceDescriptionId);
			case ServicePackage.SERVICE_INSTANCE__SERVICE_IMPLEMENTATION_ID:
				return SERVICE_IMPLEMENTATION_ID_EDEFAULT == null ? serviceImplementationId != null : !SERVICE_IMPLEMENTATION_ID_EDEFAULT.equals(serviceImplementationId);
			case ServicePackage.SERVICE_INSTANCE__ENDPOINTS:
				return endpoints != null && !endpoints.isEmpty();
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
		result.append(", serviceImplementationId: ");
		result.append(serviceImplementationId);
		result.append(')');
		return result.toString();
	}

} //ServiceInstanceImpl
