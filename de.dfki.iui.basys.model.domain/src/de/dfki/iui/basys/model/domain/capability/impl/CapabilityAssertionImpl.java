/**
 */
package de.dfki.iui.basys.model.domain.capability.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;
import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;

import de.dfki.iui.basys.model.pattern.PObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityAssertionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.capability.impl.CapabilityAssertionImpl#getPrerequisites <em>Prerequisites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityAssertionImpl extends EntityImpl implements CapabilityAssertion {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected PObject pattern;

	/**
	 * The cached value of the '{@link #getPrerequisites() <em>Prerequisites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisites()
	 * @generated
	 * @ordered
	 */
	protected CapabilityAssertion prerequisites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PObject getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PObject newPattern, NotificationChain msgs) {
		PObject oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_ASSERTION__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PObject newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.CAPABILITY_ASSERTION__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.CAPABILITY_ASSERTION__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_ASSERTION__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityAssertion getPrerequisites() {
		return prerequisites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrerequisites(CapabilityAssertion newPrerequisites, NotificationChain msgs) {
		CapabilityAssertion oldPrerequisites = prerequisites;
		prerequisites = newPrerequisites;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES, oldPrerequisites, newPrerequisites);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrerequisites(CapabilityAssertion newPrerequisites) {
		if (newPrerequisites != prerequisites) {
			NotificationChain msgs = null;
			if (prerequisites != null)
				msgs = ((InternalEObject)prerequisites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES, null, msgs);
			if (newPrerequisites != null)
				msgs = ((InternalEObject)newPrerequisites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES, null, msgs);
			msgs = basicSetPrerequisites(newPrerequisites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES, newPrerequisites, newPrerequisites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_ASSERTION__PATTERN:
				return basicSetPattern(null, msgs);
			case CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES:
				return basicSetPrerequisites(null, msgs);
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
			case CapabilityPackage.CAPABILITY_ASSERTION__PATTERN:
				return getPattern();
			case CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES:
				return getPrerequisites();
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
			case CapabilityPackage.CAPABILITY_ASSERTION__PATTERN:
				setPattern((PObject)newValue);
				return;
			case CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES:
				setPrerequisites((CapabilityAssertion)newValue);
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
			case CapabilityPackage.CAPABILITY_ASSERTION__PATTERN:
				setPattern((PObject)null);
				return;
			case CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES:
				setPrerequisites((CapabilityAssertion)null);
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
			case CapabilityPackage.CAPABILITY_ASSERTION__PATTERN:
				return pattern != null;
			case CapabilityPackage.CAPABILITY_ASSERTION__PREREQUISITES:
				return prerequisites != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityAssertionImpl
