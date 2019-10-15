/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Mode Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getOperationMode <em>Operation Mode</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getOperationModeRequest()
 * @model
 * @generated
 */
public interface OperationModeRequest extends ComponentRequest {
	/**
	 * Returns the value of the '<em><b>Operation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Mode</em>' attribute.
	 * @see #setOperationMode(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getOperationModeRequest_OperationMode()
	 * @model
	 * @generated
	 */
	String getOperationMode();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getOperationMode <em>Operation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Mode</em>' attribute.
	 * @see #getOperationMode()
	 * @generated
	 */
	void setOperationMode(String value);

} // OperationModeRequest
