/**
 */
package de.dfki.iui.basys.model.runtime.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl#getCapabilityVariant <em>Capability Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityRequestImpl extends MinimalEObjectImpl.Container implements CapabilityRequest {
	/**
	 * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected String componentId = COMPONENT_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getCapabilityVariant() <em>Capability Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityVariant()
	 * @generated
	 * @ordered
	 */
	protected EObject capabilityVariant;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.CAPABILITY_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CAPABILITY_REQUEST__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getCapabilityVariant() {
		return capabilityVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilityVariant(EObject newCapabilityVariant, NotificationChain msgs) {
		EObject oldCapabilityVariant = capabilityVariant;
		capabilityVariant = newCapabilityVariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT, oldCapabilityVariant, newCapabilityVariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapabilityVariant(EObject newCapabilityVariant) {
		if (newCapabilityVariant != capabilityVariant) {
			NotificationChain msgs = null;
			if (capabilityVariant != null)
				msgs = ((InternalEObject)capabilityVariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT, null, msgs);
			if (newCapabilityVariant != null)
				msgs = ((InternalEObject)newCapabilityVariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT, null, msgs);
			msgs = basicSetCapabilityVariant(newCapabilityVariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT, newCapabilityVariant, newCapabilityVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT:
				return basicSetCapabilityVariant(null, msgs);
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
			case ComponentPackage.CAPABILITY_REQUEST__COMPONENT_ID:
				return getComponentId();
			case ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT:
				return getCapabilityVariant();
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
			case ComponentPackage.CAPABILITY_REQUEST__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT:
				setCapabilityVariant((EObject)newValue);
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
			case ComponentPackage.CAPABILITY_REQUEST__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT:
				setCapabilityVariant((EObject)null);
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
			case ComponentPackage.CAPABILITY_REQUEST__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case ComponentPackage.CAPABILITY_REQUEST__CAPABILITY_VARIANT:
				return capabilityVariant != null;
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
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(')');
		return result.toString();
	}

	public static class Builder {
		private String componentId;
		private EObject capabilityVariant;

		public Builder componentId(String componentId) {
			this.componentId = componentId;
			return this;
		}

		public Builder capabilityVariant(EObject capabilityVariant) {
			this.capabilityVariant = capabilityVariant;
			return this;
		}

		public CapabilityRequestImpl build() {
			return new CapabilityRequestImpl(this);
		}
	}

	private CapabilityRequestImpl(Builder builder) {
		this.componentId = builder.componentId;
		this.capabilityVariant = builder.capabilityVariant;
	}
}
