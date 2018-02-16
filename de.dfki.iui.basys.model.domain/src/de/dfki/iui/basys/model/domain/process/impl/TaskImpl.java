/**
 */
package de.dfki.iui.basys.model.domain.process.impl;

import de.dfki.iui.basys.model.domain.process.Data;
import de.dfki.iui.basys.model.domain.process.ProcessPackage;
import de.dfki.iui.basys.model.domain.process.Task;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.impl.TaskImpl#getMinIterations <em>Min Iterations</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.impl.TaskImpl#getMaxIterations <em>Max Iterations</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.impl.TaskImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.impl.TaskImpl#getInputData <em>Input Data</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.impl.TaskImpl#getOutputData <em>Output Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends FlowNodeImpl implements Task {
	/**
	 * The default value of the '{@link #getMinIterations() <em>Min Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ITERATIONS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinIterations() <em>Min Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIterations()
	 * @generated
	 * @ordered
	 */
	protected int minIterations = MIN_ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxIterations() <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITERATIONS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxIterations() <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIterations()
	 * @generated
	 * @ordered
	 */
	protected int maxIterations = MAX_ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputData() <em>Input Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> inputData;

	/**
	 * The cached value of the '{@link #getOutputData() <em>Output Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> outputData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinIterations() {
		return minIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinIterations(int newMinIterations) {
		int oldMinIterations = minIterations;
		minIterations = newMinIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK__MIN_ITERATIONS, oldMinIterations, minIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxIterations() {
		return maxIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIterations(int newMaxIterations) {
		int oldMaxIterations = maxIterations;
		maxIterations = newMaxIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK__MAX_ITERATIONS, oldMaxIterations, maxIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getInputData() {
		if (inputData == null) {
			inputData = new EObjectContainmentEList<Data>(Data.class, this, ProcessPackage.TASK__INPUT_DATA);
		}
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getOutputData() {
		if (outputData == null) {
			outputData = new EObjectContainmentEList<Data>(Data.class, this, ProcessPackage.TASK__OUTPUT_DATA);
		}
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.TASK__INPUT_DATA:
				return ((InternalEList<?>)getInputData()).basicRemove(otherEnd, msgs);
			case ProcessPackage.TASK__OUTPUT_DATA:
				return ((InternalEList<?>)getOutputData()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TASK__MIN_ITERATIONS:
				return getMinIterations();
			case ProcessPackage.TASK__MAX_ITERATIONS:
				return getMaxIterations();
			case ProcessPackage.TASK__URI:
				return getUri();
			case ProcessPackage.TASK__INPUT_DATA:
				return getInputData();
			case ProcessPackage.TASK__OUTPUT_DATA:
				return getOutputData();
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
			case ProcessPackage.TASK__MIN_ITERATIONS:
				setMinIterations((Integer)newValue);
				return;
			case ProcessPackage.TASK__MAX_ITERATIONS:
				setMaxIterations((Integer)newValue);
				return;
			case ProcessPackage.TASK__URI:
				setUri((String)newValue);
				return;
			case ProcessPackage.TASK__INPUT_DATA:
				getInputData().clear();
				getInputData().addAll((Collection<? extends Data>)newValue);
				return;
			case ProcessPackage.TASK__OUTPUT_DATA:
				getOutputData().clear();
				getOutputData().addAll((Collection<? extends Data>)newValue);
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
			case ProcessPackage.TASK__MIN_ITERATIONS:
				setMinIterations(MIN_ITERATIONS_EDEFAULT);
				return;
			case ProcessPackage.TASK__MAX_ITERATIONS:
				setMaxIterations(MAX_ITERATIONS_EDEFAULT);
				return;
			case ProcessPackage.TASK__URI:
				setUri(URI_EDEFAULT);
				return;
			case ProcessPackage.TASK__INPUT_DATA:
				getInputData().clear();
				return;
			case ProcessPackage.TASK__OUTPUT_DATA:
				getOutputData().clear();
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
			case ProcessPackage.TASK__MIN_ITERATIONS:
				return minIterations != MIN_ITERATIONS_EDEFAULT;
			case ProcessPackage.TASK__MAX_ITERATIONS:
				return maxIterations != MAX_ITERATIONS_EDEFAULT;
			case ProcessPackage.TASK__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case ProcessPackage.TASK__INPUT_DATA:
				return inputData != null && !inputData.isEmpty();
			case ProcessPackage.TASK__OUTPUT_DATA:
				return outputData != null && !outputData.isEmpty();
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
		result.append(" (minIterations: ");
		result.append(minIterations);
		result.append(", maxIterations: ");
		result.append(maxIterations);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
