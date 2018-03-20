/**
 */
package de.dfki.iui.basys.model.domain.roletopology.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.roletopology.Area;
import de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule;
import de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage;
import de.dfki.iui.basys.model.domain.roletopology.WorkCenter;

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
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.impl.AreaImpl#getWorkCenters <em>Work Centers</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.impl.AreaImpl#getDiscretemanufacturingequipmentmodules <em>Discretemanufacturingequipmentmodules</em>}</li>
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
	 * The cached value of the '{@link #getDiscretemanufacturingequipmentmodules() <em>Discretemanufacturingequipmentmodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretemanufacturingequipmentmodules()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteManufacturingEquipmentModule> discretemanufacturingequipmentmodules;

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
		return RoletopologyPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCenter> getWorkCenters() {
		if (workCenters == null) {
			workCenters = new EObjectContainmentEList<WorkCenter>(WorkCenter.class, this, RoletopologyPackage.AREA__WORK_CENTERS);
		}
		return workCenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteManufacturingEquipmentModule> getDiscretemanufacturingequipmentmodules() {
		if (discretemanufacturingequipmentmodules == null) {
			discretemanufacturingequipmentmodules = new EObjectContainmentEList<DiscreteManufacturingEquipmentModule>(DiscreteManufacturingEquipmentModule.class, this, RoletopologyPackage.AREA__DISCRETEMANUFACTURINGEQUIPMENTMODULES);
		}
		return discretemanufacturingequipmentmodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoletopologyPackage.AREA__WORK_CENTERS:
				return ((InternalEList<?>)getWorkCenters()).basicRemove(otherEnd, msgs);
			case RoletopologyPackage.AREA__DISCRETEMANUFACTURINGEQUIPMENTMODULES:
				return ((InternalEList<?>)getDiscretemanufacturingequipmentmodules()).basicRemove(otherEnd, msgs);
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
			case RoletopologyPackage.AREA__WORK_CENTERS:
				return getWorkCenters();
			case RoletopologyPackage.AREA__DISCRETEMANUFACTURINGEQUIPMENTMODULES:
				return getDiscretemanufacturingequipmentmodules();
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
			case RoletopologyPackage.AREA__WORK_CENTERS:
				getWorkCenters().clear();
				getWorkCenters().addAll((Collection<? extends WorkCenter>)newValue);
				return;
			case RoletopologyPackage.AREA__DISCRETEMANUFACTURINGEQUIPMENTMODULES:
				getDiscretemanufacturingequipmentmodules().clear();
				getDiscretemanufacturingequipmentmodules().addAll((Collection<? extends DiscreteManufacturingEquipmentModule>)newValue);
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
			case RoletopologyPackage.AREA__WORK_CENTERS:
				getWorkCenters().clear();
				return;
			case RoletopologyPackage.AREA__DISCRETEMANUFACTURINGEQUIPMENTMODULES:
				getDiscretemanufacturingequipmentmodules().clear();
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
			case RoletopologyPackage.AREA__WORK_CENTERS:
				return workCenters != null && !workCenters.isEmpty();
			case RoletopologyPackage.AREA__DISCRETEMANUFACTURINGEQUIPMENTMODULES:
				return discretemanufacturingequipmentmodules != null && !discretemanufacturingequipmentmodules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AreaImpl
