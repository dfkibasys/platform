/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFinished;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Finished</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskFinishedImpl extends TaskStateImpl implements TaskFinished {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFinishedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.TASK_FINISHED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum toEnum() {
		return TaskStateEnum.FINISHED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessdefinitionPackage.TASK_FINISHED___TO_ENUM:
				return toEnum();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskFinishedImpl
