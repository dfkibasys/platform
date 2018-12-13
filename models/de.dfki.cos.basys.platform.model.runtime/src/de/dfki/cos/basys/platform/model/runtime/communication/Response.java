/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.Response#getRequestId <em>Request Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends Message {

	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getResponse_RequestId()
	 * @model
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.communication.Response#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);
} // Response
