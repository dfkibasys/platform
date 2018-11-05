/**
 */
package de.dfki.iui.basys.model.domain.workplan.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatus;
import de.dfki.iui.basys.model.domain.workplan.WorkstepInstanceStatusEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workstep Instance Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusImpl#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.WorkstepInstanceStatusImpl#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkstepInstanceStatusImpl extends EntityImpl implements WorkstepInstanceStatus {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final WorkstepInstanceStatusEnum STATUS_EDEFAULT = WorkstepInstanceStatusEnum.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected WorkstepInstanceStatusEnum status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductInstanceId() <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductInstanceId() <em>Product Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String productInstanceId = PRODUCT_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkstepInstanceId() <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKSTEP_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkstepInstanceId() <em>Workstep Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String workstepInstanceId = WORKSTEP_INSTANCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkstepInstanceStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkplanPackage.Literals.WORKSTEP_INSTANCE_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstepInstanceStatusEnum getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(WorkstepInstanceStatusEnum newStatus) {
		WorkstepInstanceStatusEnum oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.WORKSTEP_INSTANCE_STATUS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductInstanceId() {
		return productInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductInstanceId(String newProductInstanceId) {
		String oldProductInstanceId = productInstanceId;
		productInstanceId = newProductInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID, oldProductInstanceId, productInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkstepInstanceId() {
		return workstepInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkstepInstanceId(String newWorkstepInstanceId) {
		String oldWorkstepInstanceId = workstepInstanceId;
		workstepInstanceId = newWorkstepInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID, oldWorkstepInstanceId, workstepInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__STATUS:
				return getStatus();
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID:
				return getProductInstanceId();
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID:
				return getWorkstepInstanceId();
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
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__STATUS:
				setStatus((WorkstepInstanceStatusEnum)newValue);
				return;
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID:
				setProductInstanceId((String)newValue);
				return;
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID:
				setWorkstepInstanceId((String)newValue);
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
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID:
				setProductInstanceId(PRODUCT_INSTANCE_ID_EDEFAULT);
				return;
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID:
				setWorkstepInstanceId(WORKSTEP_INSTANCE_ID_EDEFAULT);
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
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__STATUS:
				return status != STATUS_EDEFAULT;
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__PRODUCT_INSTANCE_ID:
				return PRODUCT_INSTANCE_ID_EDEFAULT == null ? productInstanceId != null : !PRODUCT_INSTANCE_ID_EDEFAULT.equals(productInstanceId);
			case WorkplanPackage.WORKSTEP_INSTANCE_STATUS__WORKSTEP_INSTANCE_ID:
				return WORKSTEP_INSTANCE_ID_EDEFAULT == null ? workstepInstanceId != null : !WORKSTEP_INSTANCE_ID_EDEFAULT.equals(workstepInstanceId);
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
		result.append(" (status: ");
		result.append(status);
		result.append(", productInstanceId: ");
		result.append(productInstanceId);
		result.append(", workstepInstanceId: ");
		result.append(workstepInstanceId);
		result.append(')');
		return result.toString();
	}

} //WorkstepInstanceStatusImpl
