/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Cancelled</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTaskCancelled()
 * @model
 * @generated
 */
public interface TaskCancelled extends TaskFinished {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return TaskStateEnum.CANCELLED;'"
	 * @generated
	 */
	TaskStateEnum toEnum();

} // TaskCancelled
