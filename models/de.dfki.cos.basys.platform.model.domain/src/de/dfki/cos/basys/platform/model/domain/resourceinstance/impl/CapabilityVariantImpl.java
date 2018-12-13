/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance.impl;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.CapabilityVariantImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.CapabilityVariantImpl#getAppliedOn <em>Applied On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityVariantImpl<T extends Entity, C extends Capability> extends EntityImpl implements CapabilityVariant<T, C> {
	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected C capability;

	/**
	 * The cached value of the '{@link #getAppliedOn() <em>Applied On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<T> appliedOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.CAPABILITY_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C getCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapability(C newCapability, NotificationChain msgs) {
		C oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY, oldCapability, newCapability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(C newCapability) {
		if (newCapability != capability) {
			NotificationChain msgs = null;
			if (capability != null)
				msgs = ((InternalEObject)capability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY, null, msgs);
			if (newCapability != null)
				msgs = ((InternalEObject)newCapability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY, null, msgs);
			msgs = basicSetCapability(newCapability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY, newCapability, newCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getAppliedOn() {
		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<T>(Entity.class, this, ResourceinstancePackage.CAPABILITY_VARIANT__APPLIED_ON);
		}
		return appliedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY:
				return basicSetCapability(null, msgs);
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
			case ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY:
				return getCapability();
			case ResourceinstancePackage.CAPABILITY_VARIANT__APPLIED_ON:
				return getAppliedOn();
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
			case ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY:
				setCapability((C)newValue);
				return;
			case ResourceinstancePackage.CAPABILITY_VARIANT__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends T>)newValue);
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
			case ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY:
				setCapability((C)null);
				return;
			case ResourceinstancePackage.CAPABILITY_VARIANT__APPLIED_ON:
				getAppliedOn().clear();
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
			case ResourceinstancePackage.CAPABILITY_VARIANT__CAPABILITY:
				return capability != null;
			case ResourceinstancePackage.CAPABILITY_VARIANT__APPLIED_ON:
				return appliedOn != null && !appliedOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityVariantImpl
