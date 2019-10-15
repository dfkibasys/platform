/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Mode Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest#getExecutionMode <em>Execution Mode</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getExecutionModeRequest()
 * @model
 * @generated
 */
public interface ExecutionModeRequest extends ComponentRequest {
	/**
	 * Returns the value of the '<em><b>Execution Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Mode</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode
	 * @see #setExecutionMode(ExecutionMode)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getExecutionModeRequest_ExecutionMode()
	 * @model
	 * @generated
	 */
	ExecutionMode getExecutionMode();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest#getExecutionMode <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Mode</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode
	 * @see #getExecutionMode()
	 * @generated
	 */
	void setExecutionMode(ExecutionMode value);

} // ExecutionModeRequest
