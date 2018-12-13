/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskInactive;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Inactive</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskInactiveImpl extends TaskStateImpl implements TaskInactive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInactiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.TASK_INACTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum toEnum() {
		return TaskStateEnum.INACTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessdefinitionPackage.TASK_INACTIVE___TO_ENUM:
				return toEnum();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskInactiveImpl
