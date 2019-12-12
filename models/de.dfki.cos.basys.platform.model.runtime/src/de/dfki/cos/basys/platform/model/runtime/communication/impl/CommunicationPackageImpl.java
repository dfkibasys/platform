/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication.impl;

import de.dfki.cos.basys.platform.model.base.BasePackage;
import de.dfki.cos.basys.platform.model.data.DataPackage;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.model.pattern.PatternPackage;
import de.dfki.cos.basys.platform.model.runtime.communication.Authentication;
import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationFactory;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage;
import de.dfki.cos.basys.platform.model.runtime.communication.CommunicationProvider;
import de.dfki.cos.basys.platform.model.runtime.communication.Message;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.model.runtime.communication.ResponseCallback;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ChannelException;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ChannelPoolException;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ClientException;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.CommunicationException;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.MessageException;
import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ProviderException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationPackageImpl extends EPackageImpl implements CommunicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseCallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType communicationExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType channelPoolExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType providerExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clientExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType channelExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationPackageImpl() {
		super(eNS_URI, CommunicationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommunicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationPackage init() {
		if (isInited) return (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);

		// Obtain or create and register package
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommunicationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		ProductdefinitionPackage.eINSTANCE.eClass();
		TopologyPackage.eINSTANCE.eClass();
		CapabilityPackage.eINSTANCE.eClass();
		MaterialPackage.eINSTANCE.eClass();
		ResourcetypePackage.eINSTANCE.eClass();
		ResourceinstancePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

	
		// Create package meta-data objects
		theCommunicationPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationPackage.eNS_URI, theCommunicationPackage);
		return theCommunicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Authentication() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Pools() {
		return (EReference)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__Connect() {
		return clientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__Disconnect() {
		return clientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__IsConnected() {
		return clientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__GetChannel__String() {
		return clientEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__SendMessage__String_String() {
		return clientEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__SendRequest__String_Request_ResponseCallback() {
		return clientEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__SendRequest__String_Request() {
		return clientEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__SendNotification__String_Notification() {
		return clientEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__GetPool__String() {
		return clientEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelPool() {
		return channelPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelPool_Channels() {
		return (EReference)channelPoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelPool_Provider() {
		return (EReference)channelPoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelPool_Uri() {
		return (EAttribute)channelPoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelPool_Client() {
		return (EReference)channelPoolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelPool_Connected() {
		return (EAttribute)channelPoolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannelPool__Connect() {
		return channelPoolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannelPool__Disconnect() {
		return channelPoolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannelPool__GetChannel__String() {
		return channelPoolEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannelPool__GetChannelByName__String() {
		return channelPoolEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Listener() {
		return (EReference)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Pool() {
		return (EReference)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Open() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Queued() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannel__Open() {
		return channelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannel__Close() {
		return channelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannel__SendMessage__String() {
		return channelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannel__SendNotification__Notification() {
		return channelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannel__SendRequest__Request() {
		return channelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannel__SendRequest__Request_ResponseCallback() {
		return channelEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelListener() {
		return channelListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannelListener__HandleMessage__Channel_String() {
		return channelListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannelListener__HandleNotification__Channel_Notification() {
		return channelListenerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannelListener__HandleRequest__Channel_Request() {
		return channelListenerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationProvider() {
		return communicationProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__DoConnect__ChannelPool() {
		return communicationProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__DoDisconnect__ChannelPool() {
		return communicationProviderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__DoOpenChannel__Channel() {
		return communicationProviderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__DoCloseChannel__Channel() {
		return communicationProviderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__DoSendMessage__Channel_String() {
		return communicationProviderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__DoSendRequest__Channel_Request_ResponseCallback() {
		return communicationProviderEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__DoSendRequest__Channel_Request() {
		return communicationProviderEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__DoSendNotification__Channel_Notification() {
		return communicationProviderEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommunicationProvider__SupportQueuedChannels() {
		return communicationProviderEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Payload() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_RequestId() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseCallback() {
		return responseCallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResponseCallback__HandleResponse__Response() {
		return responseCallbackEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_Username() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_Password() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_Certificate() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommunicationException() {
		return communicationExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChannelPoolException() {
		return channelPoolExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProviderException() {
		return providerExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageException() {
		return messageExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClientException() {
		return clientExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChannelException() {
		return channelExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationFactory getCommunicationFactory() {
		return (CommunicationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__AUTHENTICATION);
		createEReference(clientEClass, CLIENT__POOLS);
		createEOperation(clientEClass, CLIENT___CONNECT);
		createEOperation(clientEClass, CLIENT___DISCONNECT);
		createEOperation(clientEClass, CLIENT___IS_CONNECTED);
		createEOperation(clientEClass, CLIENT___GET_CHANNEL__STRING);
		createEOperation(clientEClass, CLIENT___SEND_MESSAGE__STRING_STRING);
		createEOperation(clientEClass, CLIENT___SEND_REQUEST__STRING_REQUEST_RESPONSECALLBACK);
		createEOperation(clientEClass, CLIENT___SEND_REQUEST__STRING_REQUEST);
		createEOperation(clientEClass, CLIENT___SEND_NOTIFICATION__STRING_NOTIFICATION);
		createEOperation(clientEClass, CLIENT___GET_POOL__STRING);

		channelPoolEClass = createEClass(CHANNEL_POOL);
		createEReference(channelPoolEClass, CHANNEL_POOL__CHANNELS);
		createEReference(channelPoolEClass, CHANNEL_POOL__PROVIDER);
		createEAttribute(channelPoolEClass, CHANNEL_POOL__URI);
		createEReference(channelPoolEClass, CHANNEL_POOL__CLIENT);
		createEAttribute(channelPoolEClass, CHANNEL_POOL__CONNECTED);
		createEOperation(channelPoolEClass, CHANNEL_POOL___CONNECT);
		createEOperation(channelPoolEClass, CHANNEL_POOL___DISCONNECT);
		createEOperation(channelPoolEClass, CHANNEL_POOL___GET_CHANNEL__STRING);
		createEOperation(channelPoolEClass, CHANNEL_POOL___GET_CHANNEL_BY_NAME__STRING);

		channelEClass = createEClass(CHANNEL);
		createEReference(channelEClass, CHANNEL__LISTENER);
		createEReference(channelEClass, CHANNEL__POOL);
		createEAttribute(channelEClass, CHANNEL__OPEN);
		createEAttribute(channelEClass, CHANNEL__QUEUED);
		createEOperation(channelEClass, CHANNEL___OPEN);
		createEOperation(channelEClass, CHANNEL___CLOSE);
		createEOperation(channelEClass, CHANNEL___SEND_MESSAGE__STRING);
		createEOperation(channelEClass, CHANNEL___SEND_NOTIFICATION__NOTIFICATION);
		createEOperation(channelEClass, CHANNEL___SEND_REQUEST__REQUEST);
		createEOperation(channelEClass, CHANNEL___SEND_REQUEST__REQUEST_RESPONSECALLBACK);

		channelListenerEClass = createEClass(CHANNEL_LISTENER);
		createEOperation(channelListenerEClass, CHANNEL_LISTENER___HANDLE_MESSAGE__CHANNEL_STRING);
		createEOperation(channelListenerEClass, CHANNEL_LISTENER___HANDLE_NOTIFICATION__CHANNEL_NOTIFICATION);
		createEOperation(channelListenerEClass, CHANNEL_LISTENER___HANDLE_REQUEST__CHANNEL_REQUEST);

		communicationProviderEClass = createEClass(COMMUNICATION_PROVIDER);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___DO_CONNECT__CHANNELPOOL);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___DO_DISCONNECT__CHANNELPOOL);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___DO_OPEN_CHANNEL__CHANNEL);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___DO_CLOSE_CHANNEL__CHANNEL);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___DO_SEND_MESSAGE__CHANNEL_STRING);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___DO_SEND_REQUEST__CHANNEL_REQUEST_RESPONSECALLBACK);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___DO_SEND_REQUEST__CHANNEL_REQUEST);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___DO_SEND_NOTIFICATION__CHANNEL_NOTIFICATION);
		createEOperation(communicationProviderEClass, COMMUNICATION_PROVIDER___SUPPORT_QUEUED_CHANNELS);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__PAYLOAD);

		notificationEClass = createEClass(NOTIFICATION);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__REQUEST_ID);

		requestEClass = createEClass(REQUEST);

		responseCallbackEClass = createEClass(RESPONSE_CALLBACK);
		createEOperation(responseCallbackEClass, RESPONSE_CALLBACK___HANDLE_RESPONSE__RESPONSE);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEAttribute(authenticationEClass, AUTHENTICATION__USERNAME);
		createEAttribute(authenticationEClass, AUTHENTICATION__PASSWORD);
		createEAttribute(authenticationEClass, AUTHENTICATION__CERTIFICATE);

		// Create data types
		communicationExceptionEDataType = createEDataType(COMMUNICATION_EXCEPTION);
		channelPoolExceptionEDataType = createEDataType(CHANNEL_POOL_EXCEPTION);
		providerExceptionEDataType = createEDataType(PROVIDER_EXCEPTION);
		messageExceptionEDataType = createEDataType(MESSAGE_EXCEPTION);
		clientExceptionEDataType = createEDataType(CLIENT_EXCEPTION);
		channelExceptionEDataType = createEDataType(CHANNEL_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clientEClass.getESuperTypes().add(theBasePackage.getEntity());
		channelPoolEClass.getESuperTypes().add(theBasePackage.getEntity());
		channelEClass.getESuperTypes().add(theBasePackage.getEntity());
		messageEClass.getESuperTypes().add(theBasePackage.getEntity());
		notificationEClass.getESuperTypes().add(this.getMessage());
		responseEClass.getESuperTypes().add(this.getMessage());
		requestEClass.getESuperTypes().add(this.getMessage());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Authentication(), this.getAuthentication(), null, "authentication", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Pools(), this.getChannelPool(), this.getChannelPool_Client(), "pools", null, 0, -1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getClient__Connect(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getClientException());

		op = initEOperation(getClient__Disconnect(), null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getClientException());

		initEOperation(getClient__IsConnected(), ecorePackage.getEBoolean(), "isConnected", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClient__GetChannel__String(), this.getChannel(), "getChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClient__SendMessage__String_String(), null, "sendMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channelId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getClientException());

		op = initEOperation(getClient__SendRequest__String_Request_ResponseCallback(), null, "sendRequest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channelId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequest(), "req", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResponseCallback(), "cb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getClientException());

		op = initEOperation(getClient__SendRequest__String_Request(), this.getResponse(), "sendRequest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channelId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequest(), "req", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getClientException());

		op = initEOperation(getClient__SendNotification__String_Notification(), null, "sendNotification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "channelId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "not", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getClientException());

		op = initEOperation(getClient__GetPool__String(), this.getChannelPool(), "getPool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(channelPoolEClass, ChannelPool.class, "ChannelPool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelPool_Channels(), this.getChannel(), this.getChannel_Pool(), "channels", null, 0, -1, ChannelPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelPool_Provider(), this.getCommunicationProvider(), null, "provider", null, 1, 1, ChannelPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelPool_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ChannelPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelPool_Client(), this.getClient(), this.getClient_Pools(), "client", null, 1, 1, ChannelPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelPool_Connected(), ecorePackage.getEBoolean(), "connected", null, 0, 1, ChannelPool.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getChannelPool__Connect(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelPoolException());

		op = initEOperation(getChannelPool__Disconnect(), null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelPoolException());

		op = initEOperation(getChannelPool__GetChannel__String(), this.getChannel(), "getChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getChannelPool__GetChannelByName__String(), this.getChannel(), "getChannelByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_Listener(), this.getChannelListener(), null, "listener", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Pool(), this.getChannelPool(), this.getChannelPool_Channels(), "pool", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Open(), ecorePackage.getEBoolean(), "open", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Queued(), theEcorePackage.getEBoolean(), "queued", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getChannel__Open(), null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelException());

		op = initEOperation(getChannel__Close(), null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelException());

		op = initEOperation(getChannel__SendMessage__String(), null, "sendMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelException());

		op = initEOperation(getChannel__SendNotification__Notification(), null, "sendNotification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "not", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelException());

		op = initEOperation(getChannel__SendRequest__Request(), this.getResponse(), "sendRequest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequest(), "req", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelException());

		op = initEOperation(getChannel__SendRequest__Request_ResponseCallback(), null, "sendRequest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequest(), "req", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResponseCallback(), "cb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getChannelException());

		initEClass(channelListenerEClass, ChannelListener.class, "ChannelListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getChannelListener__HandleMessage__Channel_String(), null, "handleMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getChannelListener__HandleNotification__Channel_Notification(), null, "handleNotification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "not", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getChannelListener__HandleRequest__Channel_Request(), this.getResponse(), "handleRequest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequest(), "req", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(communicationProviderEClass, CommunicationProvider.class, "CommunicationProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCommunicationProvider__DoConnect__ChannelPool(), null, "doConnect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannelPool(), "pool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProviderException());

		op = initEOperation(getCommunicationProvider__DoDisconnect__ChannelPool(), null, "doDisconnect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannelPool(), "pool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProviderException());

		op = initEOperation(getCommunicationProvider__DoOpenChannel__Channel(), null, "doOpenChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProviderException());

		op = initEOperation(getCommunicationProvider__DoCloseChannel__Channel(), null, "doCloseChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProviderException());

		op = initEOperation(getCommunicationProvider__DoSendMessage__Channel_String(), null, "doSendMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProviderException());

		op = initEOperation(getCommunicationProvider__DoSendRequest__Channel_Request_ResponseCallback(), null, "doSendRequest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequest(), "req", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResponseCallback(), "cb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProviderException());

		op = initEOperation(getCommunicationProvider__DoSendRequest__Channel_Request(), this.getResponse(), "doSendRequest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequest(), "req", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProviderException());

		op = initEOperation(getCommunicationProvider__DoSendNotification__Channel_Notification(), null, "doSendNotification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "not", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProviderException());

		initEOperation(getCommunicationProvider__SupportQueuedChannels(), theEcorePackage.getEBoolean(), "supportQueuedChannels", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Payload(), ecorePackage.getEString(), "payload", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_RequestId(), theEcorePackage.getEString(), "requestId", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseCallbackEClass, ResponseCallback.class, "ResponseCallback", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getResponseCallback__HandleResponse__Response(), null, "handleResponse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResponse(), "res", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthentication_Username(), ecorePackage.getEString(), "username", null, 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_Password(), ecorePackage.getEString(), "password", null, 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_Certificate(), ecorePackage.getEString(), "certificate", null, 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(communicationExceptionEDataType, CommunicationException.class, "CommunicationException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(channelPoolExceptionEDataType, ChannelPoolException.class, "ChannelPoolException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(providerExceptionEDataType, ProviderException.class, "ProviderException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageExceptionEDataType, MessageException.class, "MessageException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(clientExceptionEDataType, ClientException.class, "ClientException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(channelExceptionEDataType, ChannelException.class, "ChannelException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui.mmds/CoreModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCoreModelAnnotations() {
		String source = "http://de.dfki.iui.mmds/CoreModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //CommunicationPackageImpl
