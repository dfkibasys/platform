/**
 */
package de.dfki.iui.basys.model.physical.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.physical.PhysicalPackage;
import de.dfki.iui.basys.model.physical.StorageUnit;
import de.dfki.iui.basys.model.physical.StorageZone;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.physical.impl.StorageZoneImpl#getStorageUnits <em>Storage Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageZoneImpl extends IdentifiableEntityImpl implements StorageZone {
	/**
	 * The cached value of the '{@link #getStorageUnits() <em>Storage Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageUnit> storageUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalPackage.Literals.STORAGE_ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StorageUnit> getStorageUnits() {
		if (storageUnits == null) {
			storageUnits = new EObjectContainmentEList<StorageUnit>(StorageUnit.class, this, PhysicalPackage.STORAGE_ZONE__STORAGE_UNITS);
		}
		return storageUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalPackage.STORAGE_ZONE__STORAGE_UNITS:
				return ((InternalEList<?>)getStorageUnits()).basicRemove(otherEnd, msgs);
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
			case PhysicalPackage.STORAGE_ZONE__STORAGE_UNITS:
				return getStorageUnits();
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
			case PhysicalPackage.STORAGE_ZONE__STORAGE_UNITS:
				getStorageUnits().clear();
				getStorageUnits().addAll((Collection<? extends StorageUnit>)newValue);
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
			case PhysicalPackage.STORAGE_ZONE__STORAGE_UNITS:
				getStorageUnits().clear();
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
			case PhysicalPackage.STORAGE_ZONE__STORAGE_UNITS:
				return storageUnits != null && !storageUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StorageZoneImpl
