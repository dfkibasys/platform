/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getBusinessKey <em>Business Key</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequest()
 * @model
 * @generated
 */
public interface ProcessRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Business Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Key</em>' attribute.
	 * @see #setBusinessKey(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequest_BusinessKey()
	 * @model
	 * @generated
	 */
	String getBusinessKey();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getBusinessKey <em>Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Key</em>' attribute.
	 * @see #getBusinessKey()
	 * @generated
	 */
	void setBusinessKey(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.runtime.component.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessRequest_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // ProcessRequest
