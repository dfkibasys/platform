/**
 */
package de.dfki.iui.basys.model.aas.impl;

import de.dfki.iui.basys.model.aas.AasPackage;
import de.dfki.iui.basys.model.aas.InformationMapping;
import de.dfki.iui.basys.model.aas.ServiceCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.aas.impl.InformationMappingImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.aas.impl.InformationMappingImpl#getServiceCall <em>Service Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationMappingImpl extends MinimalEObjectImpl.Container implements InformationMapping {
	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected EClass entityType;

	/**
	 * The cached value of the '{@link #getServiceCall() <em>Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCall()
	 * @generated
	 * @ordered
	 */
	protected ServiceCall serviceCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.INFORMATION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityType() {
		if (entityType != null && entityType.eIsProxy()) {
			InternalEObject oldEntityType = (InternalEObject)entityType;
			entityType = (EClass)eResolveProxy(oldEntityType);
			if (entityType != oldEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.INFORMATION_MAPPING__ENTITY_TYPE, oldEntityType, entityType));
			}
		}
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(EClass newEntityType) {
		EClass oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.INFORMATION_MAPPING__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCall getServiceCall() {
		return serviceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCall(ServiceCall newServiceCall, NotificationChain msgs) {
		ServiceCall oldServiceCall = serviceCall;
		serviceCall = newServiceCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AasPackage.INFORMATION_MAPPING__SERVICE_CALL, oldServiceCall, newServiceCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCall(ServiceCall newServiceCall) {
		if (newServiceCall != serviceCall) {
			NotificationChain msgs = null;
			if (serviceCall != null)
				msgs = ((InternalEObject)serviceCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AasPackage.INFORMATION_MAPPING__SERVICE_CALL, null, msgs);
			if (newServiceCall != null)
				msgs = ((InternalEObject)newServiceCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AasPackage.INFORMATION_MAPPING__SERVICE_CALL, null, msgs);
			msgs = basicSetServiceCall(newServiceCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.INFORMATION_MAPPING__SERVICE_CALL, newServiceCall, newServiceCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AasPackage.INFORMATION_MAPPING__SERVICE_CALL:
				return basicSetServiceCall(null, msgs);
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
			case AasPackage.INFORMATION_MAPPING__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
			case AasPackage.INFORMATION_MAPPING__SERVICE_CALL:
				return getServiceCall();
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
			case AasPackage.INFORMATION_MAPPING__ENTITY_TYPE:
				setEntityType((EClass)newValue);
				return;
			case AasPackage.INFORMATION_MAPPING__SERVICE_CALL:
				setServiceCall((ServiceCall)newValue);
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
			case AasPackage.INFORMATION_MAPPING__ENTITY_TYPE:
				setEntityType((EClass)null);
				return;
			case AasPackage.INFORMATION_MAPPING__SERVICE_CALL:
				setServiceCall((ServiceCall)null);
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
			case AasPackage.INFORMATION_MAPPING__ENTITY_TYPE:
				return entityType != null;
			case AasPackage.INFORMATION_MAPPING__SERVICE_CALL:
				return serviceCall != null;
		}
		return super.eIsSet(featureID);
	}

} //InformationMappingImpl
