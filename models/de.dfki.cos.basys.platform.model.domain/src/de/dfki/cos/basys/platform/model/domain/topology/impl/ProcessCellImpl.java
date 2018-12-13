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

import de.dfki.cos.basys.platform.model.domain.topology.ProcessCell;
import de.dfki.cos.basys.platform.model.domain.topology.ProcessUnit;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessCellImpl#getProcessUnits <em>Process Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessCellImpl extends WorkCenterImpl implements ProcessCell {
	/**
	 * The cached value of the '{@link #getProcessUnits() <em>Process Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessUnit> processUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.PROCESS_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessUnit> getProcessUnits() {
		if (processUnits == null) {
			processUnits = new EObjectContainmentEList<ProcessUnit>(ProcessUnit.class, this, TopologyPackage.PROCESS_CELL__PROCESS_UNITS);
		}
		return processUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyPackage.PROCESS_CELL__PROCESS_UNITS:
				return ((InternalEList<?>)getProcessUnits()).basicRemove(otherEnd, msgs);
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
			case TopologyPackage.PROCESS_CELL__PROCESS_UNITS:
				return getProcessUnits();
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
			case TopologyPackage.PROCESS_CELL__PROCESS_UNITS:
				getProcessUnits().clear();
				getProcessUnits().addAll((Collection<? extends ProcessUnit>)newValue);
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
			case TopologyPackage.PROCESS_CELL__PROCESS_UNITS:
				getProcessUnits().clear();
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
			case TopologyPackage.PROCESS_CELL__PROCESS_UNITS:
				return processUnits != null && !processUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessCellImpl
