/**
 */
package de.dfki.iui.basys.model.runtime.communication;

import de.dfki.iui.basys.model.base.Entity;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelPoolException;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getChannels <em>Channels</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getProvider <em>Provider</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getUri <em>Uri</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getClient <em>Client</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannelPool()
 * @model
 * @generated
 */
public interface ChannelPool extends Entity {
	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.runtime.communication.Channel}.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.runtime.communication.Channel#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannelPool_Channels()
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#getPool
	 * @model opposite="pool"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(CommunicationProvider)
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannelPool_Provider()
	 * @model required="true"
	 * @generated
	 */
	CommunicationProvider getProvider();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(CommunicationProvider value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannelPool_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.runtime.communication.Client#getPools <em>Pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannelPool_Client()
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#getPools
	 * @model opposite="pools" required="true"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannelPool_Connected()
	 * @model changeable="false"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.communication.ChannelPoolException"
	 * @generated
	 */
	void connect() throws ChannelPoolException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.communication.ChannelPoolException"
	 * @generated
	 */
	void disconnect() throws ChannelPoolException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Channel getChannel(String id);

} // ChannelPool
