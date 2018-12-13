/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance.impl;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.capability.Handling;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.HandlingCapabilityVariant;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handling Capability Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.HandlingCapabilityVariantImpl#getObject <em>Object</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.HandlingCapabilityVariantImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.HandlingCapabilityVariantImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HandlingCapabilityVariantImpl extends CapabilityVariantImpl<Entity, Handling> implements HandlingCapabilityVariant {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected Entity object;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Entity from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Entity to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandlingCapabilityVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.HANDLING_CAPABILITY_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetCapability(Handling newCapability, NotificationChain msgs) {
		return super.basicSetCapability(newCapability, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (Entity)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(Entity newObject) {
		Entity oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Entity)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Entity newFrom) {
		Entity oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Entity)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Entity newTo) {
		Entity oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__OBJECT:
				setObject((Entity)newValue);
				return;
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__FROM:
				setFrom((Entity)newValue);
				return;
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__TO:
				setTo((Entity)newValue);
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
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__OBJECT:
				setObject((Entity)null);
				return;
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__FROM:
				setFrom((Entity)null);
				return;
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__TO:
				setTo((Entity)null);
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
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__OBJECT:
				return object != null;
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__FROM:
				return from != null;
			case ResourceinstancePackage.HANDLING_CAPABILITY_VARIANT__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //HandlingCapabilityVariantImpl
