/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getResponseCallback()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface ResponseCallback {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleResponse(Response res);

} // ResponseCallback
