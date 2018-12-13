/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing.impl;

import de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMProductInstance;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMResourceInstance;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WorldModel;
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
 * An implementation of the model object '<em><b>World Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WorldModelImpl#getProductInstances <em>Product Instances</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WorldModelImpl#getResourceInstances <em>Resource Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldModelImpl extends BasysEObjectImpl implements WorldModel {
	/**
	 * The cached value of the '{@link #getProductInstances() <em>Product Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<WMProductInstance> productInstances;

	/**
	 * The cached value of the '{@link #getResourceInstances() <em>Resource Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<WMResourceInstance> resourceInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinebalancingPackage.Literals.WORLD_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WMProductInstance> getProductInstances() {
		if (productInstances == null) {
			productInstances = new EObjectContainmentEList<WMProductInstance>(WMProductInstance.class, this, LinebalancingPackage.WORLD_MODEL__PRODUCT_INSTANCES);
		}
		return productInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WMResourceInstance> getResourceInstances() {
		if (resourceInstances == null) {
			resourceInstances = new EObjectContainmentEList<WMResourceInstance>(WMResourceInstance.class, this, LinebalancingPackage.WORLD_MODEL__RESOURCE_INSTANCES);
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
			case LinebalancingPackage.WORLD_MODEL__PRODUCT_INSTANCES:
				return ((InternalEList<?>)getProductInstances()).basicRemove(otherEnd, msgs);
			case LinebalancingPackage.WORLD_MODEL__RESOURCE_INSTANCES:
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
			case LinebalancingPackage.WORLD_MODEL__PRODUCT_INSTANCES:
				return getProductInstances();
			case LinebalancingPackage.WORLD_MODEL__RESOURCE_INSTANCES:
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
			case LinebalancingPackage.WORLD_MODEL__PRODUCT_INSTANCES:
				getProductInstances().clear();
				getProductInstances().addAll((Collection<? extends WMProductInstance>)newValue);
				return;
			case LinebalancingPackage.WORLD_MODEL__RESOURCE_INSTANCES:
				getResourceInstances().clear();
				getResourceInstances().addAll((Collection<? extends WMResourceInstance>)newValue);
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
			case LinebalancingPackage.WORLD_MODEL__PRODUCT_INSTANCES:
				getProductInstances().clear();
				return;
			case LinebalancingPackage.WORLD_MODEL__RESOURCE_INSTANCES:
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
			case LinebalancingPackage.WORLD_MODEL__PRODUCT_INSTANCES:
				return productInstances != null && !productInstances.isEmpty();
			case LinebalancingPackage.WORLD_MODEL__RESOURCE_INSTANCES:
				return resourceInstances != null && !resourceInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorldModelImpl
