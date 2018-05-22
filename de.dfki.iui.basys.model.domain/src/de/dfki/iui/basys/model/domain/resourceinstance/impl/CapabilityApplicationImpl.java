/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.impl;

import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.iui.basys.model.domain.resourceinstance.CapabilityVariant;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;

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
 * An implementation of the model object '<em><b>Capability Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityApplicationImpl#getCapabilityAssertion <em>Capability Assertion</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.CapabilityApplicationImpl#getCapabilityVariants <em>Capability Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityApplicationImpl extends BasysEObjectImpl implements CapabilityApplication {
	/**
	 * The cached value of the '{@link #getCapabilityAssertion() <em>Capability Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityAssertion()
	 * @generated
	 * @ordered
	 */
	protected CapabilityAssertion capabilityAssertion;
	/**
	 * The cached value of the '{@link #getCapabilityVariants() <em>Capability Variants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityVariant<?>> capabilityVariants;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.CAPABILITY_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityAssertion getCapabilityAssertion() {
		if (capabilityAssertion != null && capabilityAssertion.eIsProxy()) {
			InternalEObject oldCapabilityAssertion = (InternalEObject)capabilityAssertion;
			capabilityAssertion = (CapabilityAssertion)eResolveProxy(oldCapabilityAssertion);
			if (capabilityAssertion != oldCapabilityAssertion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_ASSERTION, oldCapabilityAssertion, capabilityAssertion));
			}
		}
		return capabilityAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityAssertion basicGetCapabilityAssertion() {
		return capabilityAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityAssertion(CapabilityAssertion newCapabilityAssertion) {
		CapabilityAssertion oldCapabilityAssertion = capabilityAssertion;
		capabilityAssertion = newCapabilityAssertion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_ASSERTION, oldCapabilityAssertion, capabilityAssertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityVariant<?>> getCapabilityVariants() {
		if (capabilityVariants == null) {
			capabilityVariants = new EObjectContainmentEList<CapabilityVariant<?>>(CapabilityVariant.class, this, ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS);
		}
		return capabilityVariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS:
				return ((InternalEList<?>)getCapabilityVariants()).basicRemove(otherEnd, msgs);
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
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_ASSERTION:
				if (resolve) return getCapabilityAssertion();
				return basicGetCapabilityAssertion();
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS:
				return getCapabilityVariants();
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
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_ASSERTION:
				setCapabilityAssertion((CapabilityAssertion)newValue);
				return;
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS:
				getCapabilityVariants().clear();
				getCapabilityVariants().addAll((Collection<? extends CapabilityVariant<?>>)newValue);
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
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_ASSERTION:
				setCapabilityAssertion((CapabilityAssertion)null);
				return;
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS:
				getCapabilityVariants().clear();
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
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_ASSERTION:
				return capabilityAssertion != null;
			case ResourceinstancePackage.CAPABILITY_APPLICATION__CAPABILITY_VARIANTS:
				return capabilityVariants != null && !capabilityVariants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityApplicationImpl
