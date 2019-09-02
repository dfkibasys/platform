/**
 */
package de.dfki.cos.basys.platform.model.domain.capability.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.MoveToLocation;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move To Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.capability.impl.MoveToLocationImpl#getTargetLocation <em>Target Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveToLocationImpl extends GeneralCapabilityImpl implements MoveToLocation {
	/**
	 * The cached value of the '{@link #getTargetLocation() <em>Target Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLocation()
	 * @generated
	 * @ordered
	 */
	protected TopologyElement targetLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveToLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.MOVE_TO_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopologyElement getTargetLocation() {
		if (targetLocation != null && targetLocation.eIsProxy()) {
			InternalEObject oldTargetLocation = (InternalEObject)targetLocation;
			targetLocation = (TopologyElement)eResolveProxy(oldTargetLocation);
			if (targetLocation != oldTargetLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapabilityPackage.MOVE_TO_LOCATION__TARGET_LOCATION, oldTargetLocation, targetLocation));
			}
		}
		return targetLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement basicGetTargetLocation() {
		return targetLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetLocation(TopologyElement newTargetLocation) {
		TopologyElement oldTargetLocation = targetLocation;
		targetLocation = newTargetLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.MOVE_TO_LOCATION__TARGET_LOCATION, oldTargetLocation, targetLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.MOVE_TO_LOCATION__TARGET_LOCATION:
				if (resolve) return getTargetLocation();
				return basicGetTargetLocation();
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
			case CapabilityPackage.MOVE_TO_LOCATION__TARGET_LOCATION:
				setTargetLocation((TopologyElement)newValue);
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
			case CapabilityPackage.MOVE_TO_LOCATION__TARGET_LOCATION:
				setTargetLocation((TopologyElement)null);
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
			case CapabilityPackage.MOVE_TO_LOCATION__TARGET_LOCATION:
				return targetLocation != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveToLocationImpl
