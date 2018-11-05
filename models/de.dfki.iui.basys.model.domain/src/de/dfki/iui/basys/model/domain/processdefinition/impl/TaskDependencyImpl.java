/**
 */
package de.dfki.iui.basys.model.domain.processdefinition.impl;

import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.iui.basys.model.domain.processdefinition.TaskDependency;
import de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.TaskDependencyImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.impl.TaskDependencyImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskDependencyImpl extends EdgeImpl implements TaskDependency {
	/**
	 * The default value of the '{@link #getSourceState() <em>Source State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected static final TaskStateEnum SOURCE_STATE_EDEFAULT = TaskStateEnum.INACTIVE;

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
	protected static final TaskStateEnum TARGET_STATE_EDEFAULT = TaskStateEnum.INACTIVE;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.TASK_DEPENDENCY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.TASK_DEPENDENCY__SOURCE_STATE, oldSourceState, sourceState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessdefinitionPackage.TASK_DEPENDENCY__TARGET_STATE, oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessdefinitionPackage.TASK_DEPENDENCY__SOURCE_STATE:
				return getSourceState();
			case ProcessdefinitionPackage.TASK_DEPENDENCY__TARGET_STATE:
				return getTargetState();
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
			case ProcessdefinitionPackage.TASK_DEPENDENCY__SOURCE_STATE:
				setSourceState((TaskStateEnum)newValue);
				return;
			case ProcessdefinitionPackage.TASK_DEPENDENCY__TARGET_STATE:
				setTargetState((TaskStateEnum)newValue);
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
			case ProcessdefinitionPackage.TASK_DEPENDENCY__SOURCE_STATE:
				setSourceState(SOURCE_STATE_EDEFAULT);
				return;
			case ProcessdefinitionPackage.TASK_DEPENDENCY__TARGET_STATE:
				setTargetState(TARGET_STATE_EDEFAULT);
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
			case ProcessdefinitionPackage.TASK_DEPENDENCY__SOURCE_STATE:
				return sourceState != SOURCE_STATE_EDEFAULT;
			case ProcessdefinitionPackage.TASK_DEPENDENCY__TARGET_STATE:
				return targetState != TARGET_STATE_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //TaskDependencyImpl
