/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Paused</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTaskPaused()
 * @model
 * @generated
 */
public interface TaskPaused extends TaskActive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return TaskStateEnum.PAUSED;'"
	 * @generated
	 */
	TaskStateEnum toEnum();

} // TaskPaused
