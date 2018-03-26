/**
 */
package de.dfki.iui.basys.model.domain.processinstance;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.TaskInstance#getState <em>State</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processinstance.TaskInstance#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getTaskInstance()
 * @model
 * @generated
 */
public interface TaskInstance extends Entity {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum
	 * @see #setState(de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getTaskInstance_State()
	 * @model
	 * @generated
	 */
	de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum getState();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.TaskInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum
	 * @see #getState()
	 * @generated
	 */
	void setState(de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(de.dfki.iui.basys.model.domain.processdefinition.Task)
	 * @see de.dfki.iui.basys.model.domain.processinstance.ProcessinstancePackage#getTaskInstance_Task()
	 * @model required="true"
	 * @generated
	 */
	de.dfki.iui.basys.model.domain.processdefinition.Task getTask();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processinstance.TaskInstance#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(de.dfki.iui.basys.model.domain.processdefinition.Task value);

} // TaskInstance
