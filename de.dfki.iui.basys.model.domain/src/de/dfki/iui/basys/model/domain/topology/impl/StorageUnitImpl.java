/**
 */
package de.dfki.iui.basys.model.domain.topology.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import de.dfki.iui.basys.model.domain.topology.StorageUnit;
import de.dfki.iui.basys.model.domain.topology.TopologyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.impl.StorageUnitImpl#getEquipmentModules <em>Equipment Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageUnitImpl extends IdentifiableEntityImpl implements StorageUnit {
	/**
	 * The cached value of the '{@link #getEquipmentModules() <em>Equipment Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentModules()
	 * @generated
	 * @ordered
	 */
	protected EList<EquipmentModule> equipmentModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.STORAGE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquipmentModule> getEquipmentModules() {
		if (equipmentModules == null) {
			equipmentModules = new EObjectContainmentEList<EquipmentModule>(EquipmentModule.class, this, TopologyPackage.STORAGE_UNIT__EQUIPMENT_MODULES);
		}
		return equipmentModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyPackage.STORAGE_UNIT__EQUIPMENT_MODULES:
				return ((InternalEList<?>)getEquipmentModules()).basicRemove(otherEnd, msgs);
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
			case TopologyPackage.STORAGE_UNIT__EQUIPMENT_MODULES:
				return getEquipmentModules();
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
			case TopologyPackage.STORAGE_UNIT__EQUIPMENT_MODULES:
				getEquipmentModules().clear();
				getEquipmentModules().addAll((Collection<? extends EquipmentModule>)newValue);
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
			case TopologyPackage.STORAGE_UNIT__EQUIPMENT_MODULES:
				getEquipmentModules().clear();
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
			case TopologyPackage.STORAGE_UNIT__EQUIPMENT_MODULES:
				return equipmentModules != null && !equipmentModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StorageUnitImpl
