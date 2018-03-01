/**
 */
package de.dfki.iui.basys.model.runtime.communication;

import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.Channel#getListener <em>Listener</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.Channel#getPool <em>Pool</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.communication.Channel#isOpen <em>Open</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannel()
 * @model abstract="true"
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
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannel_Listener()
	 * @model changeable="false"
	 * @generated
	 */
	ChannelListener getListener();

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' reference.
	 * @see #setPool(ChannelPool)
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannel_Pool()
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#getChannels
	 * @model opposite="channels" required="true"
	 * @generated
	 */
	ChannelPool getPool();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.communication.Channel#getPool <em>Pool</em>}' reference.
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
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationPackage#getChannel_Open()
	 * @model changeable="false"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void open() throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void close() throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void sendMessage(String msg) throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void sendNotification(Notification not) throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.communication.ChannelException"
	 * @generated
	 */
	Response sendRequest(Request req) throws ChannelException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.iui.basys.model.runtime.communication.ChannelException"
	 * @generated
	 */
	void sendRequest(Request req, ResponseCallback cb) throws ChannelException;

} // Channel
