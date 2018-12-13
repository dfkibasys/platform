/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ClientException;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.Client#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.Client#getPools <em>Pools</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Entity {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getClient_Authentication()
	 * @model containment="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.communication.Client#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Pools</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool}.
	 * It is bidirectional and its opposite is '{@link de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pools</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pools</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getClient_Pools()
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool#getClient
	 * @model opposite="client"
	 * @generated
	 */
	EList<ChannelPool> getPools();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ClientException"
	 * @generated
	 */
	void connect() throws ClientException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ClientException"
	 * @generated
	 */
	void disconnect() throws ClientException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Channel getChannel(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ClientException"
	 * @generated
	 */
	void sendMessage(String channelId, String msg) throws ClientException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ClientException"
	 * @generated
	 */
	void sendRequest(String channelId, Request req, ResponseCallback cb) throws ClientException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ClientException"
	 * @generated
	 */
	Response sendRequest(String channelId, Request req) throws ClientException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ClientException"
	 * @generated
	 */
	void sendNotification(String channelId, Notification not) throws ClientException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ChannelPool getPool(String id);

} // Client
