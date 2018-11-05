/**
 */
package de.dfki.iui.basys.model.domain.processdefinition.impl;

import de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.iui.basys.model.domain.processdefinition.TaskFailed;
import de.dfki.iui.basys.model.domain.processdefinition.TaskFinished;
import de.dfki.iui.basys.model.domain.processdefinition.TaskState;
import de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Failed</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskFailedImpl extends TaskFinishedImpl implements TaskFailed {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFailedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.TASK_FAILED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum toEnum() {
		return TaskStateEnum.FAILED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TaskState.class) {
			switch (baseOperationID) {
				case ProcessdefinitionPackage.TASK_STATE___TO_ENUM: return ProcessdefinitionPackage.TASK_FAILED___TO_ENUM;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TaskFinished.class) {
			switch (baseOperationID) {
				case ProcessdefinitionPackage.TASK_FINISHED___TO_ENUM: return ProcessdefinitionPackage.TASK_FAILED___TO_ENUM;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessdefinitionPackage.TASK_FAILED___TO_ENUM:
				return toEnum();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskFailedImpl
