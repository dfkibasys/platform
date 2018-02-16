/**
 */
package de.dfki.iui.basys.model.domain.process.impl;

import de.dfki.iui.basys.model.domain.process.ProcessPackage;
import de.dfki.iui.basys.model.domain.process.TaskFlow;
import de.dfki.iui.basys.model.domain.process.TaskStateEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.impl.TaskFlowImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.impl.TaskFlowImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.process.impl.TaskFlowImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskFlowImpl extends EdgeImpl implements TaskFlow {
	/**
	 * The default value of the '{@link #getSourceState() <em>Source State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected static final TaskStateEnum SOURCE_STATE_EDEFAULT = TaskStateEnum.SUCCESSFUL;

	/**
	 * The cached value of the '{@link #getSourceState() <em>Source State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected TaskStateEnum sourceState = SOURCE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetState() <em>Target State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected static final TaskStateEnum TARGET_STATE_EDEFAULT = TaskStateEnum.ACTIVE;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected TaskStateEnum targetState = TARGET_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.TASK_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum getSourceState() {
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceState(TaskStateEnum newSourceState) {
		TaskStateEnum oldSourceState = sourceState;
		sourceState = newSourceState == null ? SOURCE_STATE_EDEFAULT : newSourceState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK_FLOW__SOURCE_STATE, oldSourceState, sourceState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum getTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(TaskStateEnum newTargetState) {
		TaskStateEnum oldTargetState = targetState;
		targetState = newTargetState == null ? TARGET_STATE_EDEFAULT : newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK_FLOW__TARGET_STATE, oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK_FLOW__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.TASK_FLOW__SOURCE_STATE:
				return getSourceState();
			case ProcessPackage.TASK_FLOW__TARGET_STATE:
				return getTargetState();
			case ProcessPackage.TASK_FLOW__CONDITION:
				return getCondition();
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
			case ProcessPackage.TASK_FLOW__SOURCE_STATE:
				setSourceState((TaskStateEnum)newValue);
				return;
			case ProcessPackage.TASK_FLOW__TARGET_STATE:
				setTargetState((TaskStateEnum)newValue);
				return;
			case ProcessPackage.TASK_FLOW__CONDITION:
				setCondition((String)newValue);
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
			case ProcessPackage.TASK_FLOW__SOURCE_STATE:
				setSourceState(SOURCE_STATE_EDEFAULT);
				return;
			case ProcessPackage.TASK_FLOW__TARGET_STATE:
				setTargetState(TARGET_STATE_EDEFAULT);
				return;
			case ProcessPackage.TASK_FLOW__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case ProcessPackage.TASK_FLOW__SOURCE_STATE:
				return sourceState != SOURCE_STATE_EDEFAULT;
			case ProcessPackage.TASK_FLOW__TARGET_STATE:
				return targetState != TARGET_STATE_EDEFAULT;
			case ProcessPackage.TASK_FLOW__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (sourceState: ");
		result.append(sourceState);
		result.append(", targetState: ");
		result.append(targetState);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //TaskFlowImpl
