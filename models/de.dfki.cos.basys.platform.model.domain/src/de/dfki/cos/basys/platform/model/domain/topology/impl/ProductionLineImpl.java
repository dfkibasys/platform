/**
 */
package de.dfki.cos.basys.platform.model.domain.topology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.cos.basys.platform.model.domain.topology.ProductionLine;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.model.domain.topology.WorkCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionLineImpl#getWorkCells <em>Work Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionLineImpl extends WorkCenterImpl implements ProductionLine {
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
		return TopologyPackage.Literals.PRODUCTION_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCell> getWorkCells() {
		if (workCells == null) {
			workCells = new EObjectContainmentEList<WorkCell>(WorkCell.class, this, TopologyPackage.PRODUCTION_LINE__WORK_CELLS);
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
			case TopologyPackage.PRODUCTION_LINE__WORK_CELLS:
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
			case TopologyPackage.PRODUCTION_LINE__WORK_CELLS:
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
			case TopologyPackage.PRODUCTION_LINE__WORK_CELLS:
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
			case TopologyPackage.PRODUCTION_LINE__WORK_CELLS:
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
			case TopologyPackage.PRODUCTION_LINE__WORK_CELLS:
				return workCells != null && !workCells.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductionLineImpl
