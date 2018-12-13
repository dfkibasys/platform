/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getChannelListener()
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
	void handleMessage(Channel channel, String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleNotification(Channel channel, Notification not);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Response handleRequest(Channel channel, Request req);

} // ChannelListener
