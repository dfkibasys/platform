/**
 */
package de.dfki.iui.basys.model.runtime.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getMessage <em>Message</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentResponse()
 * @model
 * @generated
 */
public interface ComponentResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentResponse_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.runtime.component.ResponseStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ResponseStatus
	 * @see #setStatus(ResponseStatus)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentResponse_Status()
	 * @model
	 * @generated
	 */
	ResponseStatus getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ResponseStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ResponseStatus value);

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' attribute.
	 * @see #setStatusCode(int)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentResponse_StatusCode()
	 * @model
	 * @generated
	 */
	int getStatusCode();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getStatusCode <em>Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' attribute.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(int value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentResponse_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(ComponentRequest)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentResponse_Request()
	 * @model containment="true"
	 * @generated
	 */
	ComponentRequest getRequest();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentResponse#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(ComponentRequest value);

} // ComponentResponse
