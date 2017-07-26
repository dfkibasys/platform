/**
 */
package de.dfki.iui.basys.model.service.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

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
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceInstanceImpl#getDescriptionId <em>Description Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceInstanceImpl#getImplementationId <em>Implementation Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceInstanceImpl#getEndpoints <em>Endpoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInstanceImpl extends IdentifiableEntityImpl implements ServiceInstance {
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
	 * The default value of the '{@link #getImplementationId() <em>Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationId() <em>Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationId()
	 * @generated
	 * @ordered
	 */
	protected String implementationId = IMPLEMENTATION_ID_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_INSTANCE__DESCRIPTION_ID, oldDescriptionId, descriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationId() {
		return implementationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationId(String newImplementationId) {
		String oldImplementationId = implementationId;
		implementationId = newImplementationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_INSTANCE__IMPLEMENTATION_ID, oldImplementationId, implementationId));
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
			case ServicePackage.SERVICE_INSTANCE__DESCRIPTION_ID:
				return getDescriptionId();
			case ServicePackage.SERVICE_INSTANCE__IMPLEMENTATION_ID:
				return getImplementationId();
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
			case ServicePackage.SERVICE_INSTANCE__DESCRIPTION_ID:
				setDescriptionId((String)newValue);
				return;
			case ServicePackage.SERVICE_INSTANCE__IMPLEMENTATION_ID:
				setImplementationId((String)newValue);
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
			case ServicePackage.SERVICE_INSTANCE__DESCRIPTION_ID:
				setDescriptionId(DESCRIPTION_ID_EDEFAULT);
				return;
			case ServicePackage.SERVICE_INSTANCE__IMPLEMENTATION_ID:
				setImplementationId(IMPLEMENTATION_ID_EDEFAULT);
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
			case ServicePackage.SERVICE_INSTANCE__DESCRIPTION_ID:
				return DESCRIPTION_ID_EDEFAULT == null ? descriptionId != null : !DESCRIPTION_ID_EDEFAULT.equals(descriptionId);
			case ServicePackage.SERVICE_INSTANCE__IMPLEMENTATION_ID:
				return IMPLEMENTATION_ID_EDEFAULT == null ? implementationId != null : !IMPLEMENTATION_ID_EDEFAULT.equals(implementationId);
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
		result.append(" (descriptionId: ");
		result.append(descriptionId);
		result.append(", implementationId: ");
		result.append(implementationId);
		result.append(')');
		return result.toString();
	}

} //ServiceInstanceImpl
