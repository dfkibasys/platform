/**
 */
package de.dfki.cos.basys.platform.model.domain.linebalancing.impl;

import de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMPathTime;
import de.dfki.cos.basys.platform.model.domain.linebalancing.WMPathTimes;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyElement;
import de.dfki.cos.basys.platform.model.util.BasysEObjectImpl;

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
 * An implementation of the model object '<em><b>WM Path Times</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WMPathTimesImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.linebalancing.impl.WMPathTimesImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WMPathTimesImpl extends BasysEObjectImpl implements WMPathTimes {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected TopologyElement from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<WMPathTime> to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMPathTimesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinebalancingPackage.Literals.WM_PATH_TIMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (TopologyElement)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinebalancingPackage.WM_PATH_TIMES__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyElement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(TopologyElement newFrom) {
		TopologyElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinebalancingPackage.WM_PATH_TIMES__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WMPathTime> getTo() {
		if (to == null) {
			to = new EObjectContainmentEList<WMPathTime>(WMPathTime.class, this, LinebalancingPackage.WM_PATH_TIMES__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinebalancingPackage.WM_PATH_TIMES__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
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
			case LinebalancingPackage.WM_PATH_TIMES__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case LinebalancingPackage.WM_PATH_TIMES__TO:
				return getTo();
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
			case LinebalancingPackage.WM_PATH_TIMES__FROM:
				setFrom((TopologyElement)newValue);
				return;
			case LinebalancingPackage.WM_PATH_TIMES__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends WMPathTime>)newValue);
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
			case LinebalancingPackage.WM_PATH_TIMES__FROM:
				setFrom((TopologyElement)null);
				return;
			case LinebalancingPackage.WM_PATH_TIMES__TO:
				getTo().clear();
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
			case LinebalancingPackage.WM_PATH_TIMES__FROM:
				return from != null;
			case LinebalancingPackage.WM_PATH_TIMES__TO:
				return to != null && !to.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WMPathTimesImpl
