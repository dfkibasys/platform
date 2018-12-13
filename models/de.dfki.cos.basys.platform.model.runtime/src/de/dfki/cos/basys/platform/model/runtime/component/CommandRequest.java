/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.CommandRequest#getControlCommand <em>Control Command</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getCommandRequest()
 * @model
 * @generated
 */
public interface CommandRequest extends ComponentRequest {
	/**
	 * Returns the value of the '<em><b>Control Command</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.runtime.component.ControlCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Command</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ControlCommand
	 * @see #setControlCommand(ControlCommand)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getCommandRequest_ControlCommand()
	 * @model
	 * @generated
	 */
	ControlCommand getControlCommand();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.CommandRequest#getControlCommand <em>Control Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Command</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ControlCommand
	 * @see #getControlCommand()
	 * @generated
	 */
	void setControlCommand(ControlCommand value);

} // CommandRequest
