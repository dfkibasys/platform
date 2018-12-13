/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication;

import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ChannelException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.Channel#getListener <em>Listener</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.Channel#getPool <em>Pool</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.Channel#isOpen <em>Open</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.communication.Channel#isQueued <em>Queued</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends Entity {
	/**
	 * Returns the value of the '<em><b>Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listener</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener</em>' reference.
	 * @see #setListener(ChannelListener)
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getChannel_Listener()
	 * @model
	 * @generated
	 */
	ChannelListener getListener();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.communication.Channel#getListener <em>Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listener</em>' reference.
	 * @see #getListener()
	 * @generated
	 */
	void setListener(ChannelListener value);

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' reference.
	 * @see #setPool(ChannelPool)
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getChannel_Pool()
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool#getChannels
	 * @model opposite="channels" required="true"
	 * @generated
	 */
	ChannelPool getPool();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.communication.Channel#getPool <em>Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool</em>' reference.
	 * @see #getPool()
	 * @generated
	 */
	void setPool(ChannelPool value);

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getChannel_Open()
	 * @model changeable="false"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Returns the value of the '<em><b>Queued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queued</em>' attribute.
	 * @see #setQueued(boolean)
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getChannel_Queued()
	 * @model
	 * @generated
	 */
	boolean isQueued();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.runtime.communication.Channel#isQueued <em>Queued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queued</em>' attribute.
	 * @see #isQueued()
	 * @generated
	 */
	void setQueued(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void open() throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void close() throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void sendMessage(String msg) throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void sendNotification(Notification not) throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ChannelException"
	 * @generated
	 */
	Response sendRequest(Request req) throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void sendRequest(Request req, ResponseCallback cb) throws ChannelException;

} // Channel
