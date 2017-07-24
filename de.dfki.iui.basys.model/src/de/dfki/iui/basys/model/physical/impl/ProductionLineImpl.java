/**
 */
package de.dfki.iui.basys.model.physical.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.physical.PhysicalPackage;
import de.dfki.iui.basys.model.physical.ProductionLine;
import de.dfki.iui.basys.model.physical.WorkCell;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.physical.impl.ProductionLineImpl#getWorkCells <em>Work Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionLineImpl extends IdentifiableEntityImpl implements ProductionLine {
	/**
	 * The cached value of the '{@link #getWorkCells() <em>Work Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCells()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCell> workCells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalPackage.Literals.PRODUCTION_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCell> getWorkCells() {
		if (workCells == null) {
			workCells = new EObjectContainmentEList<WorkCell>(WorkCell.class, this, PhysicalPackage.PRODUCTION_LINE__WORK_CELLS);
		}
		return workCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalPackage.PRODUCTION_LINE__WORK_CELLS:
				return ((InternalEList<?>)getWorkCells()).basicRemove(otherEnd, msgs);
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
			case PhysicalPackage.PRODUCTION_LINE__WORK_CELLS:
				return getWorkCells();
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
			case PhysicalPackage.PRODUCTION_LINE__WORK_CELLS:
				getWorkCells().clear();
				getWorkCells().addAll((Collection<? extends WorkCell>)newValue);
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
			case PhysicalPackage.PRODUCTION_LINE__WORK_CELLS:
				getWorkCells().clear();
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
			case PhysicalPackage.PRODUCTION_LINE__WORK_CELLS:
				return workCells != null && !workCells.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductionLineImpl
