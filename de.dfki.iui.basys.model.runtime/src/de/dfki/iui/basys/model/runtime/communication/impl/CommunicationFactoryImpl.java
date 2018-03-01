/**
 */
package de.dfki.iui.basys.model.runtime.communication.impl;

import de.dfki.iui.basys.model.runtime.communication.*;

import de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelPoolException;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ClientException;
import de.dfki.iui.basys.model.runtime.communication.exceptions.CommunicationException;
import de.dfki.iui.basys.model.runtime.communication.exceptions.MessageException;
import de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationFactoryImpl extends EFactoryImpl implements CommunicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationFactory init() {
		try {
			CommunicationFactory theCommunicationFactory = (CommunicationFactory)EPackage.Registry.INSTANCE.getEFactory(CommunicationPackage.eNS_URI);
			if (theCommunicationFactory != null) {
				return theCommunicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommunicationPackage.CLIENT: return createClient();
			case CommunicationPackage.CHANNEL_POOL: return createChannelPool();
			case CommunicationPackage.TOPIC: return createTopic();
			case CommunicationPackage.QUEUE: return createQueue();
			case CommunicationPackage.DIRECT_LINK: return createDirectLink();
			case CommunicationPackage.MESSAGE: return createMessage();
			case CommunicationPackage.NOTIFICATION: return createNotification();
			case CommunicationPackage.RESPONSE: return createResponse();
			case CommunicationPackage.REQUEST: return createRequest();
			case CommunicationPackage.AUTHENTICATION: return createAuthentication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CommunicationPackage.COMMUNICATION_EXCEPTION:
				return createCommunicationExceptionFromString(eDataType, initialValue);
			case CommunicationPackage.CHANNEL_POOL_EXCEPTION:
				return createChannelPoolExceptionFromString(eDataType, initialValue);
			case CommunicationPackage.PROVIDER_EXCEPTION:
				return createProviderExceptionFromString(eDataType, initialValue);
			case CommunicationPackage.MESSAGE_EXCEPTION:
				return createMessageExceptionFromString(eDataType, initialValue);
			case CommunicationPackage.CLIENT_EXCEPTION:
				return createClientExceptionFromString(eDataType, initialValue);
			case CommunicationPackage.CHANNEL_EXCEPTION:
				return createChannelExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CommunicationPackage.COMMUNICATION_EXCEPTION:
				return convertCommunicationExceptionToString(eDataType, instanceValue);
			case CommunicationPackage.CHANNEL_POOL_EXCEPTION:
				return convertChannelPoolExceptionToString(eDataType, instanceValue);
			case CommunicationPackage.PROVIDER_EXCEPTION:
				return convertProviderExceptionToString(eDataType, instanceValue);
			case CommunicationPackage.MESSAGE_EXCEPTION:
				return convertMessageExceptionToString(eDataType, instanceValue);
			case CommunicationPackage.CLIENT_EXCEPTION:
				return convertClientExceptionToString(eDataType, instanceValue);
			case CommunicationPackage.CHANNEL_EXCEPTION:
				return convertChannelExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelPool createChannelPool() {
		ChannelPoolImpl channelPool = new ChannelPoolImpl();
		return channelPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Queue createQueue() {
		QueueImpl queue = new QueueImpl();
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectLink createDirectLink() {
		DirectLinkImpl directLink = new DirectLinkImpl();
		return directLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication createAuthentication() {
		AuthenticationImpl authentication = new AuthenticationImpl();
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationException createCommunicationExceptionFromString(EDataType eDataType, String initialValue) {
		return (CommunicationException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelPoolException createChannelPoolExceptionFromString(EDataType eDataType, String initialValue) {
		return (ChannelPoolException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelPoolExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderException createProviderExceptionFromString(EDataType eDataType, String initialValue) {
		return (ProviderException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageException createMessageExceptionFromString(EDataType eDataType, String initialValue) {
		return (MessageException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientException createClientExceptionFromString(EDataType eDataType, String initialValue) {
		return (ClientException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelException createChannelExceptionFromString(EDataType eDataType, String initialValue) {
		return (ChannelException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPackage getCommunicationPackage() {
		return (CommunicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationPackage getPackage() {
		return CommunicationPackage.eINSTANCE;
	}

} //CommunicationFactoryImpl
