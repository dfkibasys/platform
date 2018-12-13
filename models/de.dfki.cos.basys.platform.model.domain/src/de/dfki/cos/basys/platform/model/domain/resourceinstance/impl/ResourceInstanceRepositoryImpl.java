/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance.impl;

import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstanceRepository;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.util.BasysEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceInstanceRepositoryImpl#getResourceInstances <em>Resource Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInstanceRepositoryImpl extends BasysEObjectImpl implements ResourceInstanceRepository {
	/**
	 * The cached value of the '{@link #getResourceInstances() <em>Resource Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInstance> resourceInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.RESOURCE_INSTANCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInstance> getResourceInstances() {
		if (resourceInstances == null) {
			resourceInstances = new EObjectContainmentEList<ResourceInstance>(ResourceInstance.class, this, ResourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES);
		}
		return resourceInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return ((InternalEList<?>)getResourceInstances()).basicRemove(otherEnd, msgs);
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
			case ResourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return getResourceInstances();
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
			case ResourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				getResourceInstances().clear();
				getResourceInstances().addAll((Collection<? extends ResourceInstance>)newValue);
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
			case ResourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				getResourceInstances().clear();
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
			case ResourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return resourceInstances != null && !resourceInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceInstanceRepositoryImpl
