/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Failed</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTaskFailed()
 * @model
 * @generated
 */
public interface TaskFailed extends TaskFinished {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return TaskStateEnum.FAILED;'"
	 * @generated
	 */
	TaskStateEnum toEnum();

} // TaskFailed
