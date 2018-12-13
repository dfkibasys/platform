/**
 */
package de.dfki.cos.basys.platform.model.domain.workplan.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.workplan.WorkplanInstance;
import de.dfki.cos.basys.platform.model.domain.workplan.WorkplanPackage;
import de.dfki.cos.basys.platform.model.domain.workplan.WorkstepInstance;

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
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workplan.impl.WorkplanInstanceImpl#getProductInstanceId <em>Product Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.workplan.impl.WorkplanInstanceImpl#getWorkstepInstances <em>Workstep Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkplanInstanceImpl extends EntityImpl implements WorkplanInstance {
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
	 * The cached value of the '{@link #getWorkstepInstances() <em>Workstep Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstepInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkstepInstance> workstepInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkplanInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkplanPackage.Literals.WORKPLAN_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID, oldProductInstanceId, productInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkstepInstance> getWorkstepInstances() {
		if (workstepInstances == null) {
			workstepInstances = new EObjectContainmentEList<WorkstepInstance>(WorkstepInstance.class, this, WorkplanPackage.WORKPLAN_INSTANCE__WORKSTEP_INSTANCES);
		}
		return workstepInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkplanPackage.WORKPLAN_INSTANCE__WORKSTEP_INSTANCES:
				return ((InternalEList<?>)getWorkstepInstances()).basicRemove(otherEnd, msgs);
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
			case WorkplanPackage.WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID:
				return getProductInstanceId();
			case WorkplanPackage.WORKPLAN_INSTANCE__WORKSTEP_INSTANCES:
				return getWorkstepInstances();
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
			case WorkplanPackage.WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID:
				setProductInstanceId((String)newValue);
				return;
			case WorkplanPackage.WORKPLAN_INSTANCE__WORKSTEP_INSTANCES:
				getWorkstepInstances().clear();
				getWorkstepInstances().addAll((Collection<? extends WorkstepInstance>)newValue);
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
			case WorkplanPackage.WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID:
				setProductInstanceId(PRODUCT_INSTANCE_ID_EDEFAULT);
				return;
			case WorkplanPackage.WORKPLAN_INSTANCE__WORKSTEP_INSTANCES:
				getWorkstepInstances().clear();
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
			case WorkplanPackage.WORKPLAN_INSTANCE__PRODUCT_INSTANCE_ID:
				return PRODUCT_INSTANCE_ID_EDEFAULT == null ? productInstanceId != null : !PRODUCT_INSTANCE_ID_EDEFAULT.equals(productInstanceId);
			case WorkplanPackage.WORKPLAN_INSTANCE__WORKSTEP_INSTANCES:
				return workstepInstances != null && !workstepInstances.isEmpty();
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
		result.append(" (productInstanceId: ");
		result.append(productInstanceId);
		result.append(')');
		return result.toString();
	}

} //WorkplanInstanceImpl
