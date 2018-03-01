/**
 */
package de.dfki.iui.basys.model.runtime.communication;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getResponseCallback()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResponseCallback extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleResponse(Response res);

} // ResponseCallback
