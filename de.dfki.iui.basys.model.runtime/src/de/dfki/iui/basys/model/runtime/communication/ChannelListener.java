/**
 */
package de.dfki.iui.basys.model.runtime.communication;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannelListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ChannelListener extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleMessage(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleNotification(Notification not);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleRequest(Request req);

} // ChannelListener
