/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskCancelled;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskState;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Cancelled</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskCancelledImpl extends TaskFinishedImpl implements TaskCancelled {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCancelledImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.TASK_CANCELLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum toEnum() {
		return TaskStateEnum.CANCELLED;
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
				case ProcessdefinitionPackage.TASK_STATE___TO_ENUM: return ProcessdefinitionPackage.TASK_CANCELLED___TO_ENUM;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TaskFinished.class) {
			switch (baseOperationID) {
				case ProcessdefinitionPackage.TASK_FINISHED___TO_ENUM: return ProcessdefinitionPackage.TASK_CANCELLED___TO_ENUM;
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
			case ProcessdefinitionPackage.TASK_CANCELLED___TO_ENUM:
				return toEnum();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskCancelledImpl
