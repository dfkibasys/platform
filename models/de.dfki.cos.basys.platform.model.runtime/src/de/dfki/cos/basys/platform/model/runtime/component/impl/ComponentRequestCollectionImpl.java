/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection;

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
 * An implementation of the model object '<em><b>Request Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl#getComponentRequests <em>Component Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRequestCollectionImpl extends MinimalEObjectImpl.Container implements ComponentRequestCollection {
	/**
	 * The cached value of the '{@link #getComponentRequests() <em>Component Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentRequest> componentRequests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRequestCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT_REQUEST_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentRequest> getComponentRequests() {
		if (componentRequests == null) {
			componentRequests = new EObjectContainmentEList<ComponentRequest>(ComponentRequest.class, this, ComponentPackage.COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS);
		}
		return componentRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS:
				return ((InternalEList<?>)getComponentRequests()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS:
				return getComponentRequests();
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
			case ComponentPackage.COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS:
				getComponentRequests().clear();
				getComponentRequests().addAll((Collection<? extends ComponentRequest>)newValue);
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
			case ComponentPackage.COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS:
				getComponentRequests().clear();
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
			case ComponentPackage.COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS:
				return componentRequests != null && !componentRequests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentRequestCollectionImpl
