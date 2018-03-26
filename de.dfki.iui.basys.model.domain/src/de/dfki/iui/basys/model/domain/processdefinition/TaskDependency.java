/**
 */
package de.dfki.iui.basys.model.domain.processdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.TaskDependency#getSourceState <em>Source State</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.domain.processdefinition.TaskDependency#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getTaskDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeCheck'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL typeCheck='self.sourceRef.oclIsKindOf(Task) and self.targetRef.oclIsKindOf(Task)'"
 * @generated
 */
public interface TaskDependency extends Edge {
	/**
	 * Returns the value of the '<em><b>Source State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum
	 * @see #setSourceState(TaskStateEnum)
	 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getTaskDependency_SourceState()
	 * @model required="true"
	 * @generated
	 */
	TaskStateEnum getSourceState();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processdefinition.TaskDependency#getSourceState <em>Source State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum
	 * @see #getSourceState()
	 * @generated
	 */
	void setSourceState(TaskStateEnum value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum
	 * @see #setTargetState(TaskStateEnum)
	 * @see de.dfki.iui.basys.model.domain.processdefinition.ProcessdefinitionPackage#getTaskDependency_TargetState()
	 * @model required="true"
	 * @generated
	 */
	TaskStateEnum getTargetState();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.processdefinition.TaskDependency#getTargetState <em>Target State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' attribute.
	 * @see de.dfki.iui.basys.model.domain.processdefinition.TaskStateEnum
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(TaskStateEnum value);

} // TaskDependency
