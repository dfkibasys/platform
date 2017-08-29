/**
 */
package de.dfki.iui.basys.model.service.impl;

import de.dfki.iui.basys.model.service.ServiceDescription;
import de.dfki.iui.basys.model.service.ServiceDescriptionStore;
import de.dfki.iui.basys.model.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.impl.ServiceDescriptionStoreImpl#getServiceDescriptions <em>Service Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDescriptionStoreImpl extends MinimalEObjectImpl.Container implements ServiceDescriptionStore {
	/**
	 * The cached value of the '{@link #getServiceDescriptions() <em>Service Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDescription> serviceDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDescriptionStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_DESCRIPTION_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDescription> getServiceDescriptions() {
		if (serviceDescriptions == null) {
			serviceDescriptions = new EObjectContainmentEList<ServiceDescription>(ServiceDescription.class, this, ServicePackage.SERVICE_DESCRIPTION_STORE__SERVICE_DESCRIPTIONS);
		}
		return serviceDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE_DESCRIPTION_STORE__SERVICE_DESCRIPTIONS:
				return ((InternalEList<?>)getServiceDescriptions()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.SERVICE_DESCRIPTION_STORE__SERVICE_DESCRIPTIONS:
				return getServiceDescriptions();
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
			case ServicePackage.SERVICE_DESCRIPTION_STORE__SERVICE_DESCRIPTIONS:
				getServiceDescriptions().clear();
				getServiceDescriptions().addAll((Collection<? extends ServiceDescription>)newValue);
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
			case ServicePackage.SERVICE_DESCRIPTION_STORE__SERVICE_DESCRIPTIONS:
				getServiceDescriptions().clear();
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
			case ServicePackage.SERVICE_DESCRIPTION_STORE__SERVICE_DESCRIPTIONS:
				return serviceDescriptions != null && !serviceDescriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceDescriptionStoreImpl
