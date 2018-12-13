/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getSourceState <em>Source State</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTaskFlow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeCheck'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL typeCheck='self.sourceRef.oclIsKindOf(FlowNode) and self.targetRef.oclIsKindOf(FlowNode)'"
 * @generated
 */
public interface TaskFlow extends Edge {
	/**
	 * Returns the value of the '<em><b>Source State</b></em>' attribute.
	 * The default value is <code>"SUCCESSFUL"</code>.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
	 * @see #setSourceState(TaskStateEnum)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTaskFlow_SourceState()
	 * @model default="SUCCESSFUL" required="true"
	 * @generated
	 */
	TaskStateEnum getSourceState();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getSourceState <em>Source State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
	 * @see #getSourceState()
	 * @generated
	 */
	void setSourceState(TaskStateEnum value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' attribute.
	 * The default value is <code>"ACTIVE"</code>.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
	 * @see #setTargetState(TaskStateEnum)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTaskFlow_TargetState()
	 * @model default="ACTIVE" required="true"
	 * @generated
	 */
	TaskStateEnum getTargetState();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getTargetState <em>Target State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.TaskStateEnum
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(TaskStateEnum value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getTaskFlow_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.TaskFlow#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // TaskFlow
