/**
 */
package de.dfki.iui.basys.model.runtime.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Mode Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ChangeModeRequest#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getChangeModeRequest()
 * @model
 * @generated
 */
public interface ChangeModeRequest extends ComponentRequest {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.runtime.component.ControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ControlMode
	 * @see #setMode(ControlMode)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getChangeModeRequest_Mode()
	 * @model
	 * @generated
	 */
	ControlMode getMode();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ChangeModeRequest#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ControlMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ControlMode value);

} // ChangeModeRequest
