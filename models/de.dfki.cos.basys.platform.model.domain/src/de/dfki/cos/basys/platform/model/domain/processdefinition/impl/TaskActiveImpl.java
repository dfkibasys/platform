/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskActive;
import de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Active</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskActiveImpl extends TaskStateImpl implements TaskActive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskActiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.TASK_ACTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum toEnum() {
		return TaskStateEnum.ACTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessdefinitionPackage.TASK_ACTIVE___TO_ENUM:
				return toEnum();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskActiveImpl
