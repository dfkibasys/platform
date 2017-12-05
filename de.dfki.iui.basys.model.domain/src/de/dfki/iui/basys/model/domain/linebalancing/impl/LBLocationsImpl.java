/**
 */
package de.dfki.iui.basys.model.domain.linebalancing.impl;

import de.dfki.iui.basys.model.domain.linebalancing.LBLocations;
import de.dfki.iui.basys.model.domain.linebalancing.LBProductInstance;
import de.dfki.iui.basys.model.domain.linebalancing.LBStaff;
import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

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
 * An implementation of the model object '<em><b>LB Locations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBLocationsImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.linebalancing.impl.LBLocationsImpl#getProductInstances <em>Product Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LBLocationsImpl extends MinimalEObjectImpl.Container implements LBLocations {
	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<LBStaff> staff;

	/**
	 * The cached value of the '{@link #getProductInstances() <em>Product Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<LBProductInstance> productInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LBLocationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinebalancingPackage.Literals.LB_LOCATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LBStaff> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<LBStaff>(LBStaff.class, this, LinebalancingPackage.LB_LOCATIONS__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LBProductInstance> getProductInstances() {
		if (productInstances == null) {
			productInstances = new EObjectContainmentEList<LBProductInstance>(LBProductInstance.class, this, LinebalancingPackage.LB_LOCATIONS__PRODUCT_INSTANCES);
		}
		return productInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinebalancingPackage.LB_LOCATIONS__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
			case LinebalancingPackage.LB_LOCATIONS__PRODUCT_INSTANCES:
				return ((InternalEList<?>)getProductInstances()).basicRemove(otherEnd, msgs);
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
			case LinebalancingPackage.LB_LOCATIONS__STAFF:
				return getStaff();
			case LinebalancingPackage.LB_LOCATIONS__PRODUCT_INSTANCES:
				return getProductInstances();
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
			case LinebalancingPackage.LB_LOCATIONS__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends LBStaff>)newValue);
				return;
			case LinebalancingPackage.LB_LOCATIONS__PRODUCT_INSTANCES:
				getProductInstances().clear();
				getProductInstances().addAll((Collection<? extends LBProductInstance>)newValue);
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
			case LinebalancingPackage.LB_LOCATIONS__STAFF:
				getStaff().clear();
				return;
			case LinebalancingPackage.LB_LOCATIONS__PRODUCT_INSTANCES:
				getProductInstances().clear();
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
			case LinebalancingPackage.LB_LOCATIONS__STAFF:
				return staff != null && !staff.isEmpty();
			case LinebalancingPackage.LB_LOCATIONS__PRODUCT_INSTANCES:
				return productInstances != null && !productInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LBLocationsImpl
