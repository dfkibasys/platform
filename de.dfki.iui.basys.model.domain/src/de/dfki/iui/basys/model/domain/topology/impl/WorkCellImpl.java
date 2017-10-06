/**
 */
package de.dfki.iui.basys.model.domain.topology.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import de.dfki.iui.basys.model.domain.topology.Station;
import de.dfki.iui.basys.model.domain.topology.TopologyPackage;
import de.dfki.iui.basys.model.domain.topology.WorkCell;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.impl.WorkCellImpl#getEquipmentModules <em>Equipment Modules</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.impl.WorkCellImpl#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkCellImpl extends IdentifiableEntityImpl implements WorkCell {
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
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected Station stations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.WORK_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquipmentModule> getEquipmentModules() {
		if (equipmentModules == null) {
			equipmentModules = new EObjectContainmentEList<EquipmentModule>(EquipmentModule.class, this, TopologyPackage.WORK_CELL__EQUIPMENT_MODULES);
		}
		return equipmentModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getStations() {
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStations(Station newStations, NotificationChain msgs) {
		Station oldStations = stations;
		stations = newStations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.WORK_CELL__STATIONS, oldStations, newStations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStations(Station newStations) {
		if (newStations != stations) {
			NotificationChain msgs = null;
			if (stations != null)
				msgs = ((InternalEObject)stations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.WORK_CELL__STATIONS, null, msgs);
			if (newStations != null)
				msgs = ((InternalEObject)newStations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.WORK_CELL__STATIONS, null, msgs);
			msgs = basicSetStations(newStations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.WORK_CELL__STATIONS, newStations, newStations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyPackage.WORK_CELL__EQUIPMENT_MODULES:
				return ((InternalEList<?>)getEquipmentModules()).basicRemove(otherEnd, msgs);
			case TopologyPackage.WORK_CELL__STATIONS:
				return basicSetStations(null, msgs);
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
			case TopologyPackage.WORK_CELL__EQUIPMENT_MODULES:
				return getEquipmentModules();
			case TopologyPackage.WORK_CELL__STATIONS:
				return getStations();
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
			case TopologyPackage.WORK_CELL__EQUIPMENT_MODULES:
				getEquipmentModules().clear();
				getEquipmentModules().addAll((Collection<? extends EquipmentModule>)newValue);
				return;
			case TopologyPackage.WORK_CELL__STATIONS:
				setStations((Station)newValue);
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
			case TopologyPackage.WORK_CELL__EQUIPMENT_MODULES:
				getEquipmentModules().clear();
				return;
			case TopologyPackage.WORK_CELL__STATIONS:
				setStations((Station)null);
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
			case TopologyPackage.WORK_CELL__EQUIPMENT_MODULES:
				return equipmentModules != null && !equipmentModules.isEmpty();
			case TopologyPackage.WORK_CELL__STATIONS:
				return stations != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkCellImpl
