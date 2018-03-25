/**
 */
package de.dfki.iui.basys.model.domain.resource.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.capability.Capability;
import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;

import de.dfki.iui.basys.model.domain.resource.ResourcePackage;
import de.dfki.iui.basys.model.domain.resource.ResourceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeImpl#getCapabilityAssertion <em>Capability Assertion</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resource.impl.ResourceTypeImpl#getCapabilityRequirement <em>Capability Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeImpl extends EntityImpl implements ResourceType {
	/**
	 * The cached value of the '{@link #getCapabilityAssertion() <em>Capability Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityAssertion()
	 * @generated
	 * @ordered
	 */
	protected CapabilityAssertion capabilityAssertion;

	/**
	 * The cached value of the '{@link #getCapabilityRequirement() <em>Capability Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityRequirement()
	 * @generated
	 * @ordered
	 */
	protected Capability capabilityRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityAssertion getCapabilityAssertion() {
		return capabilityAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilityAssertion(CapabilityAssertion newCapabilityAssertion, NotificationChain msgs) {
		CapabilityAssertion oldCapabilityAssertion = capabilityAssertion;
		capabilityAssertion = newCapabilityAssertion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION, oldCapabilityAssertion, newCapabilityAssertion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityAssertion(CapabilityAssertion newCapabilityAssertion) {
		if (newCapabilityAssertion != capabilityAssertion) {
			NotificationChain msgs = null;
			if (capabilityAssertion != null)
				msgs = ((InternalEObject)capabilityAssertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION, null, msgs);
			if (newCapabilityAssertion != null)
				msgs = ((InternalEObject)newCapabilityAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION, null, msgs);
			msgs = basicSetCapabilityAssertion(newCapabilityAssertion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION, newCapabilityAssertion, newCapabilityAssertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getCapabilityRequirement() {
		if (capabilityRequirement != null && capabilityRequirement.eIsProxy()) {
			InternalEObject oldCapabilityRequirement = (InternalEObject)capabilityRequirement;
			capabilityRequirement = (Capability)eResolveProxy(oldCapabilityRequirement);
			if (capabilityRequirement != oldCapabilityRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcePackage.RESOURCE_TYPE__CAPABILITY_REQUIREMENT, oldCapabilityRequirement, capabilityRequirement));
			}
		}
		return capabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetCapabilityRequirement() {
		return capabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityRequirement(Capability newCapabilityRequirement) {
		Capability oldCapabilityRequirement = capabilityRequirement;
		capabilityRequirement = newCapabilityRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.RESOURCE_TYPE__CAPABILITY_REQUIREMENT, oldCapabilityRequirement, capabilityRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION:
				return basicSetCapabilityAssertion(null, msgs);
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
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION:
				return getCapabilityAssertion();
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_REQUIREMENT:
				if (resolve) return getCapabilityRequirement();
				return basicGetCapabilityRequirement();
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
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION:
				setCapabilityAssertion((CapabilityAssertion)newValue);
				return;
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_REQUIREMENT:
				setCapabilityRequirement((Capability)newValue);
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
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION:
				setCapabilityAssertion((CapabilityAssertion)null);
				return;
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_REQUIREMENT:
				setCapabilityRequirement((Capability)null);
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
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_ASSERTION:
				return capabilityAssertion != null;
			case ResourcePackage.RESOURCE_TYPE__CAPABILITY_REQUIREMENT:
				return capabilityRequirement != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceTypeImpl
