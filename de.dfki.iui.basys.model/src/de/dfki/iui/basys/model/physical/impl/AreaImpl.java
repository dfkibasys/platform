/**
 */
package de.dfki.iui.basys.model.physical.impl;

import de.dfki.iui.basys.model.base.impl.IdentifiableEntityImpl;

import de.dfki.iui.basys.model.physical.Area;
import de.dfki.iui.basys.model.physical.PhysicalPackage;
import de.dfki.iui.basys.model.physical.WorkCenter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.physical.impl.AreaImpl#getWorkCenters <em>Work Centers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaImpl extends IdentifiableEntityImpl implements Area {
	/**
	 * The cached value of the '{@link #getWorkCenters() <em>Work Centers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCenters()
	 * @generated
	 * @ordered
	 */
	protected WorkCenter workCenters;

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
		return PhysicalPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCenter getWorkCenters() {
		return workCenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkCenters(WorkCenter newWorkCenters, NotificationChain msgs) {
		WorkCenter oldWorkCenters = workCenters;
		workCenters = newWorkCenters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhysicalPackage.AREA__WORK_CENTERS, oldWorkCenters, newWorkCenters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkCenters(WorkCenter newWorkCenters) {
		if (newWorkCenters != workCenters) {
			NotificationChain msgs = null;
			if (workCenters != null)
				msgs = ((InternalEObject)workCenters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhysicalPackage.AREA__WORK_CENTERS, null, msgs);
			if (newWorkCenters != null)
				msgs = ((InternalEObject)newWorkCenters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhysicalPackage.AREA__WORK_CENTERS, null, msgs);
			msgs = basicSetWorkCenters(newWorkCenters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalPackage.AREA__WORK_CENTERS, newWorkCenters, newWorkCenters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalPackage.AREA__WORK_CENTERS:
				return basicSetWorkCenters(null, msgs);
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
			case PhysicalPackage.AREA__WORK_CENTERS:
				return getWorkCenters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhysicalPackage.AREA__WORK_CENTERS:
				setWorkCenters((WorkCenter)newValue);
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
			case PhysicalPackage.AREA__WORK_CENTERS:
				setWorkCenters((WorkCenter)null);
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
			case PhysicalPackage.AREA__WORK_CENTERS:
				return workCenters != null;
		}
		return super.eIsSet(featureID);
	}

} //AreaImpl
