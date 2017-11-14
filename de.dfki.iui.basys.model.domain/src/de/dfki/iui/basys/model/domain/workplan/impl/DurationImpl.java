/**
 */
package de.dfki.iui.basys.model.domain.workplan.impl;

import de.dfki.iui.basys.model.domain.workplan.Duration;
import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getWorkstepInstanceId <em>Workstep Instance Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getAgentId <em>Agent Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.workplan.impl.DurationImpl#getStandardDeviation <em>Standard Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationImpl extends MinimalEObjectImpl.Container implements Duration {
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
	 * The default value of the '{@link #getAgentId() <em>Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentId() <em>Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentId()
	 * @generated
	 * @ordered
	 */
	protected String agentId = AGENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected double average = AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double STANDARD_DEVIATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected double standardDeviation = STANDARD_DEVIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkplanPackage.Literals.DURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID, oldWorkstepInstanceId, workstepInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentId() {
		return agentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentId(String newAgentId) {
		String oldAgentId = agentId;
		agentId = newAgentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__AGENT_ID, oldAgentId, agentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverage(double newAverage) {
		double oldAverage = average;
		average = newAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__AVERAGE, oldAverage, average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStandardDeviation() {
		return standardDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardDeviation(double newStandardDeviation) {
		double oldStandardDeviation = standardDeviation;
		standardDeviation = newStandardDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkplanPackage.DURATION__STANDARD_DEVIATION, oldStandardDeviation, standardDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID:
				return getWorkstepInstanceId();
			case WorkplanPackage.DURATION__AGENT_ID:
				return getAgentId();
			case WorkplanPackage.DURATION__AVERAGE:
				return getAverage();
			case WorkplanPackage.DURATION__STANDARD_DEVIATION:
				return getStandardDeviation();
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
			case WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID:
				setWorkstepInstanceId((String)newValue);
				return;
			case WorkplanPackage.DURATION__AGENT_ID:
				setAgentId((String)newValue);
				return;
			case WorkplanPackage.DURATION__AVERAGE:
				setAverage((Double)newValue);
				return;
			case WorkplanPackage.DURATION__STANDARD_DEVIATION:
				setStandardDeviation((Double)newValue);
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
			case WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID:
				setWorkstepInstanceId(WORKSTEP_INSTANCE_ID_EDEFAULT);
				return;
			case WorkplanPackage.DURATION__AGENT_ID:
				setAgentId(AGENT_ID_EDEFAULT);
				return;
			case WorkplanPackage.DURATION__AVERAGE:
				setAverage(AVERAGE_EDEFAULT);
				return;
			case WorkplanPackage.DURATION__STANDARD_DEVIATION:
				setStandardDeviation(STANDARD_DEVIATION_EDEFAULT);
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
			case WorkplanPackage.DURATION__WORKSTEP_INSTANCE_ID:
				return WORKSTEP_INSTANCE_ID_EDEFAULT == null ? workstepInstanceId != null : !WORKSTEP_INSTANCE_ID_EDEFAULT.equals(workstepInstanceId);
			case WorkplanPackage.DURATION__AGENT_ID:
				return AGENT_ID_EDEFAULT == null ? agentId != null : !AGENT_ID_EDEFAULT.equals(agentId);
			case WorkplanPackage.DURATION__AVERAGE:
				return average != AVERAGE_EDEFAULT;
			case WorkplanPackage.DURATION__STANDARD_DEVIATION:
				return standardDeviation != STANDARD_DEVIATION_EDEFAULT;
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
		result.append(" (workstepInstanceId: ");
		result.append(workstepInstanceId);
		result.append(", agentId: ");
		result.append(agentId);
		result.append(", average: ");
		result.append(average);
		result.append(", standardDeviation: ");
		result.append(standardDeviation);
		result.append(')');
		return result.toString();
	}

} //DurationImpl
