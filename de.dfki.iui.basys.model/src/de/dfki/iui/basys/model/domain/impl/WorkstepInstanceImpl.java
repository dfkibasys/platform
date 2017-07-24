/**
 */
package de.dfki.iui.basys.model.domain.impl;

import de.dfki.iui.basys.model.domain.DomainPackage;
import de.dfki.iui.basys.model.domain.WorkstepInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workstep Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.WorkstepInstanceImpl#getWorkstepId <em>Workstep Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.impl.WorkstepInstanceImpl#getResourceInstanceIds <em>Resource Instance Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkstepInstanceImpl extends MinimalEObjectImpl.Container implements WorkstepInstance {
	/**
	 * The default value of the '{@link #getWorkstepId() <em>Workstep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKSTEP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkstepId() <em>Workstep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepId()
	 * @generated
	 * @ordered
	 */
	protected String workstepId = WORKSTEP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceInstanceIds() <em>Resource Instance Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstanceIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> resourceInstanceIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkstepInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.WORKSTEP_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkstepId() {
		return workstepId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkstepId(String newWorkstepId) {
		String oldWorkstepId = workstepId;
		workstepId = newWorkstepId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.WORKSTEP_INSTANCE__WORKSTEP_ID, oldWorkstepId, workstepId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getResourceInstanceIds() {
		if (resourceInstanceIds == null) {
			resourceInstanceIds = new EDataTypeUniqueEList<String>(String.class, this, DomainPackage.WORKSTEP_INSTANCE__RESOURCE_INSTANCE_IDS);
		}
		return resourceInstanceIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.WORKSTEP_INSTANCE__WORKSTEP_ID:
				return getWorkstepId();
			case DomainPackage.WORKSTEP_INSTANCE__RESOURCE_INSTANCE_IDS:
				return getResourceInstanceIds();
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
			case DomainPackage.WORKSTEP_INSTANCE__WORKSTEP_ID:
				setWorkstepId((String)newValue);
				return;
			case DomainPackage.WORKSTEP_INSTANCE__RESOURCE_INSTANCE_IDS:
				getResourceInstanceIds().clear();
				getResourceInstanceIds().addAll((Collection<? extends String>)newValue);
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
			case DomainPackage.WORKSTEP_INSTANCE__WORKSTEP_ID:
				setWorkstepId(WORKSTEP_ID_EDEFAULT);
				return;
			case DomainPackage.WORKSTEP_INSTANCE__RESOURCE_INSTANCE_IDS:
				getResourceInstanceIds().clear();
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
			case DomainPackage.WORKSTEP_INSTANCE__WORKSTEP_ID:
				return WORKSTEP_ID_EDEFAULT == null ? workstepId != null : !WORKSTEP_ID_EDEFAULT.equals(workstepId);
			case DomainPackage.WORKSTEP_INSTANCE__RESOURCE_INSTANCE_IDS:
				return resourceInstanceIds != null && !resourceInstanceIds.isEmpty();
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
		result.append(" (workstepId: ");
		result.append(workstepId);
		result.append(", resourceInstanceIds: ");
		result.append(resourceInstanceIds);
		result.append(')');
		return result.toString();
	}

} //WorkstepInstanceImpl
