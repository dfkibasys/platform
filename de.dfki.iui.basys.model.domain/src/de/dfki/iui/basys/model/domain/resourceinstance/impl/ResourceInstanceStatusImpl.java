/**
 */
package de.dfki.iui.basys.model.domain.resourceinstance.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.resourceinstance.ResourceInstanceStatus;
import de.dfki.iui.basys.model.domain.resourceinstance.ResourceinstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.resourceinstance.impl.ResourceInstanceStatusImpl#getResourceInstanceId <em>Resource Instance Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInstanceStatusImpl extends EntityImpl implements ResourceInstanceStatus {
	/**
	 * The default value of the '{@link #getResourceInstanceId() <em>Resource Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceInstanceId() <em>Resource Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String resourceInstanceId = RESOURCE_INSTANCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.RESOURCE_INSTANCE_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceInstanceId() {
		return resourceInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceInstanceId(String newResourceInstanceId) {
		String oldResourceInstanceId = resourceInstanceId;
		resourceInstanceId = newResourceInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.RESOURCE_INSTANCE_STATUS__RESOURCE_INSTANCE_ID, oldResourceInstanceId, resourceInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceinstancePackage.RESOURCE_INSTANCE_STATUS__RESOURCE_INSTANCE_ID:
				return getResourceInstanceId();
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
			case ResourceinstancePackage.RESOURCE_INSTANCE_STATUS__RESOURCE_INSTANCE_ID:
				setResourceInstanceId((String)newValue);
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
			case ResourceinstancePackage.RESOURCE_INSTANCE_STATUS__RESOURCE_INSTANCE_ID:
				setResourceInstanceId(RESOURCE_INSTANCE_ID_EDEFAULT);
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
			case ResourceinstancePackage.RESOURCE_INSTANCE_STATUS__RESOURCE_INSTANCE_ID:
				return RESOURCE_INSTANCE_ID_EDEFAULT == null ? resourceInstanceId != null : !RESOURCE_INSTANCE_ID_EDEFAULT.equals(resourceInstanceId);
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
		result.append(" (resourceInstanceId: ");
		result.append(resourceInstanceId);
		result.append(')');
		return result.toString();
	}

} //ResourceInstanceStatusImpl
