/**
 */
package de.dfki.iui.basys.model.runtime.communication.impl;

import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelPool;
import de.dfki.iui.basys.model.runtime.communication.CommunicationPackage;
import de.dfki.iui.basys.model.runtime.communication.CommunicationProvider;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.communication.ResponseCallback;

import de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CommunicationProviderImpl extends MinimalEObjectImpl.Container implements CommunicationProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void doConnect(ChannelPool pool) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void doDisconnect(ChannelPool pool) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void doOpenChannel(Channel channel) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void doCloseChannel(Channel channel) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void doSendMessage(Channel channel, String msg) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void doSendRequest(Channel channel, Request req, ResponseCallback cb) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Response doSendRequest(Channel channel, Request req) throws ProviderException ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void doSendNotification(Channel channel, Notification not) throws ProviderException ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CommunicationPackage.COMMUNICATION_PROVIDER___DO_CONNECT__CHANNELPOOL:
				try {
					doConnect((ChannelPool)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.COMMUNICATION_PROVIDER___DO_DISCONNECT__CHANNELPOOL:
				try {
					doDisconnect((ChannelPool)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.COMMUNICATION_PROVIDER___DO_OPEN_CHANNEL__CHANNEL:
				try {
					doOpenChannel((Channel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.COMMUNICATION_PROVIDER___DO_CLOSE_CHANNEL__CHANNEL:
				try {
					doCloseChannel((Channel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.COMMUNICATION_PROVIDER___DO_SEND_MESSAGE__CHANNEL_STRING:
				try {
					doSendMessage((Channel)arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.COMMUNICATION_PROVIDER___DO_SEND_REQUEST__CHANNEL_REQUEST_RESPONSECALLBACK:
				try {
					doSendRequest((Channel)arguments.get(0), (Request)arguments.get(1), (ResponseCallback)arguments.get(2));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.COMMUNICATION_PROVIDER___DO_SEND_REQUEST__CHANNEL_REQUEST:
				try {
					return doSendRequest((Channel)arguments.get(0), (Request)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CommunicationPackage.COMMUNICATION_PROVIDER___DO_SEND_NOTIFICATION__CHANNEL_NOTIFICATION:
				try {
					doSendNotification((Channel)arguments.get(0), (Notification)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommunicationProviderImpl
