/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Command Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest#getExecutionCommand <em>Execution Command</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getExecutionCommandRequest()
 * @model
 * @generated
 */
public interface ExecutionCommandRequest extends ComponentRequest {
	/**
	 * Returns the value of the '<em><b>Execution Command</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Command</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand
	 * @see #setExecutionCommand(ExecutionCommand)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getExecutionCommandRequest_ExecutionCommand()
	 * @model
	 * @generated
	 */
	ExecutionCommand getExecutionCommand();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest#getExecutionCommand <em>Execution Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Command</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand
	 * @see #getExecutionCommand()
	 * @generated
	 */
	void setExecutionCommand(ExecutionCommand value);

} // ExecutionCommandRequest
