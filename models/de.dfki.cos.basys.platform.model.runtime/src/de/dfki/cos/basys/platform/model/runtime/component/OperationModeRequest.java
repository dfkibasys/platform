/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getOutputParameters <em>Output Parameters</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.runtime.component.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getOperationModeRequest_InputParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInputParameters();

	/**
	 * Returns the value of the '<em><b>Output Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameters</em>' attribute list.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getOperationModeRequest_OutputParameters()
	 * @model
	 * @generated
	 */
	EList<String> getOutputParameters();

} // OperationModeRequest
