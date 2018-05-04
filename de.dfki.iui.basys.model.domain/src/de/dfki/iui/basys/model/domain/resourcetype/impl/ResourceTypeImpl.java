/**
 */
package de.dfki.iui.basys.model.domain.resourcetype.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;
import de.dfki.iui.basys.model.domain.capability.CapabilityAssertion;

import de.dfki.iui.basys.model.domain.resourcetype.ResourceType;
import de.dfki.iui.basys.model.domain.resourcetype.ResourcetypePackage;

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
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeImpl#getCapabilityAssertions <em>Capability Assertions</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourcetype.impl.ResourceTypeImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeImpl extends EntityImpl implements ResourceType {
	/**
	 * The cached value of the '{@link #getCapabilityAssertions() <em>Capability Assertions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityAssertions()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityAssertion> capabilityAssertions;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

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
		return ResourcetypePackage.Literals.RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityAssertion> getCapabilityAssertions() {
		if (capabilityAssertions == null) {
			capabilityAssertions = new EObjectContainmentEList<CapabilityAssertion>(CapabilityAssertion.class, this, ResourcetypePackage.RESOURCE_TYPE__CAPABILITY_ASSERTIONS);
		}
		return capabilityAssertions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcetypePackage.RESOURCE_TYPE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcetypePackage.RESOURCE_TYPE__CAPABILITY_ASSERTIONS:
				return ((InternalEList<?>)getCapabilityAssertions()).basicRemove(otherEnd, msgs);
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
			case ResourcetypePackage.RESOURCE_TYPE__CAPABILITY_ASSERTIONS:
				return getCapabilityAssertions();
			case ResourcetypePackage.RESOURCE_TYPE__DOCUMENTATION:
				return getDocumentation();
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
			case ResourcetypePackage.RESOURCE_TYPE__CAPABILITY_ASSERTIONS:
				getCapabilityAssertions().clear();
				getCapabilityAssertions().addAll((Collection<? extends CapabilityAssertion>)newValue);
				return;
			case ResourcetypePackage.RESOURCE_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
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
			case ResourcetypePackage.RESOURCE_TYPE__CAPABILITY_ASSERTIONS:
				getCapabilityAssertions().clear();
				return;
			case ResourcetypePackage.RESOURCE_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
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
			case ResourcetypePackage.RESOURCE_TYPE__CAPABILITY_ASSERTIONS:
				return capabilityAssertions != null && !capabilityAssertions.isEmpty();
			case ResourcetypePackage.RESOURCE_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //ResourceTypeImpl
