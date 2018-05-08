/**
 */
package de.dfki.iui.basys.model.domain.processinstance.impl;

import de.dfki.iui.basys.model.domain.processinstance.ProcessInstance;
import de.dfki.iui.basys.model.domain.processinstance.ProcessInstanceStore;
import de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage;

import de.dfki.iui.basys.model.util.BasysEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Instance Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.impl.ProcessInstanceStoreImpl#getProcessInstances <em>Process Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessInstanceStoreImpl extends BasysEObjectImpl implements ProcessInstanceStore {
	/**
	 * The cached value of the '{@link #getProcessInstances() <em>Process Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessInstance> processInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessInstanceStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessinstancePackage.Literals.PROCESS_INSTANCE_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessInstance> getProcessInstances() {
		if (processInstances == null) {
			processInstances = new EObjectContainmentEList<ProcessInstance>(ProcessInstance.class, this, ProcessinstancePackage.PROCESS_INSTANCE_STORE__PROCESS_INSTANCES);
		}
		return processInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessinstancePackage.PROCESS_INSTANCE_STORE__PROCESS_INSTANCES:
				return ((InternalEList<?>)getProcessInstances()).basicRemove(otherEnd, msgs);
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
			case ProcessinstancePackage.PROCESS_INSTANCE_STORE__PROCESS_INSTANCES:
				return getProcessInstances();
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
			case ProcessinstancePackage.PROCESS_INSTANCE_STORE__PROCESS_INSTANCES:
				getProcessInstances().clear();
				getProcessInstances().addAll((Collection<? extends ProcessInstance>)newValue);
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
			case ProcessinstancePackage.PROCESS_INSTANCE_STORE__PROCESS_INSTANCES:
				getProcessInstances().clear();
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
			case ProcessinstancePackage.PROCESS_INSTANCE_STORE__PROCESS_INSTANCES:
				return processInstances != null && !processInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessInstanceStoreImpl
