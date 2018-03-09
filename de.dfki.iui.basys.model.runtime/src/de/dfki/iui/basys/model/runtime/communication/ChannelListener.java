/**
 */
package de.dfki.iui.basys.model.runtime.communication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannelListener()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface ChannelListener {
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
	Response handleRequest(Request req);

} // ChannelListener
