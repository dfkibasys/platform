/**
 */
package de.dfki.cos.basys.platform.model.domain.topology.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.topology.Area;
import de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.model.domain.topology.WorkCenter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.AreaImpl#getWorkCenters <em>Work Centers</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.AreaImpl#getEquipmentModules <em>Equipment Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaImpl extends EntityImpl implements Area {
	/**
	 * The cached value of the '{@link #getWorkCenters() <em>Work Centers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCenters()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCenter> workCenters;

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
	protected AreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCenter> getWorkCenters() {
		if (workCenters == null) {
			workCenters = new EObjectContainmentEList<WorkCenter>(WorkCenter.class, this, TopologyPackage.AREA__WORK_CENTERS);
		}
		return workCenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquipmentModule> getEquipmentModules() {
		if (equipmentModules == null) {
			equipmentModules = new EObjectContainmentEList<EquipmentModule>(EquipmentModule.class, this, TopologyPackage.AREA__EQUIPMENT_MODULES);
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
			case TopologyPackage.AREA__WORK_CENTERS:
				return ((InternalEList<?>)getWorkCenters()).basicRemove(otherEnd, msgs);
			case TopologyPackage.AREA__EQUIPMENT_MODULES:
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
			case TopologyPackage.AREA__WORK_CENTERS:
				return getWorkCenters();
			case TopologyPackage.AREA__EQUIPMENT_MODULES:
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
			case TopologyPackage.AREA__WORK_CENTERS:
				getWorkCenters().clear();
				getWorkCenters().addAll((Collection<? extends WorkCenter>)newValue);
				return;
			case TopologyPackage.AREA__EQUIPMENT_MODULES:
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
			case TopologyPackage.AREA__WORK_CENTERS:
				getWorkCenters().clear();
				return;
			case TopologyPackage.AREA__EQUIPMENT_MODULES:
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
			case TopologyPackage.AREA__WORK_CENTERS:
				return workCenters != null && !workCenters.isEmpty();
			case TopologyPackage.AREA__EQUIPMENT_MODULES:
				return equipmentModules != null && !equipmentModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AreaImpl
