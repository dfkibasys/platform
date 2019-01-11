/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getProcessInstanceId <em>Process Instance Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getBusinessKey <em>Business Key</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getMessage <em>Message</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getResultVariables <em>Result Variables</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessResponse()
 * @model
 * @generated
 */
public interface ProcessResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Process Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Instance Id</em>' attribute.
	 * @see #setProcessInstanceId(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessResponse_ProcessInstanceId()
	 * @model
	 * @generated
	 */
	String getProcessInstanceId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getProcessInstanceId <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Instance Id</em>' attribute.
	 * @see #getProcessInstanceId()
	 * @generated
	 */
	void setProcessInstanceId(String value);

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
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessResponse_BusinessKey()
	 * @model
	 * @generated
	 */
	String getBusinessKey();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getBusinessKey <em>Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Key</em>' attribute.
	 * @see #getBusinessKey()
	 * @generated
	 */
	void setBusinessKey(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus
	 * @see #setStatus(ResponseStatus)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessResponse_Status()
	 * @model
	 * @generated
	 */
	ResponseStatus getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus
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
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessResponse_StatusCode()
	 * @model
	 * @generated
	 */
	int getStatusCode();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getStatusCode <em>Status Code</em>}' attribute.
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
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessResponse_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(ProcessRequest)
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessResponse_Request()
	 * @model
	 * @generated
	 */
	ProcessRequest getRequest();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(ProcessRequest value);

	/**
	 * Returns the value of the '<em><b>Result Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.runtime.component.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Variables</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage#getProcessResponse_ResultVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getResultVariables();

} // ProcessResponse
