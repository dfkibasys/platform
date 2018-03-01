/**
 */
package de.dfki.iui.basys.model.runtime.communication;

import de.dfki.iui.basys.model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface CommunicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/communication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "communication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationPackage eINSTANCE = de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.ClientImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__AUTHENTICATION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__POOLS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___CONNECT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___DISCONNECT = BasePackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Connected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___IS_CONNECTED = BasePackage.ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Channel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___GET_CHANNEL__STRING = BasePackage.ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___SEND_MESSAGE__STRING_STRING = BasePackage.ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___SEND_REQUEST__STRING_REQUEST_RESPONSECALLBACK = BasePackage.ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___SEND_REQUEST__STRING_REQUEST = BasePackage.ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Send Notification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___SEND_NOTIFICATION__STRING_NOTIFICATION = BasePackage.ENTITY_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.ChannelPoolImpl <em>Channel Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.ChannelPoolImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannelPool()
	 * @generated
	 */
	int CHANNEL_POOL = 1;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL__CHANNELS = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL__URI = 2;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL__CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL__CONNECTED = 4;

	/**
	 * The number of structural features of the '<em>Channel Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL___CONNECT = 0;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL___DISCONNECT = 1;

	/**
	 * The operation id for the '<em>Get Channel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL___GET_CHANNEL__STRING = 2;

	/**
	 * The number of operations of the '<em>Channel Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_POOL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.ChannelImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__LISTENER = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__POOL = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__OPEN = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL___OPEN = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL___CLOSE = BasePackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL___SEND_MESSAGE__STRING = BasePackage.ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Send Notification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL___SEND_NOTIFICATION__NOTIFICATION = BasePackage.ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL___SEND_REQUEST__REQUEST = BasePackage.ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL___SEND_REQUEST__REQUEST_RESPONSECALLBACK = BasePackage.ENTITY_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.TopicImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__BINDING = CHANNEL__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__ID = CHANNEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__METADATA = CHANNEL__METADATA;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__LISTENER = CHANNEL__LISTENER;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__POOL = CHANNEL__POOL;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__OPEN = CHANNEL__OPEN;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___OPEN = CHANNEL___OPEN;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___CLOSE = CHANNEL___CLOSE;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___SEND_MESSAGE__STRING = CHANNEL___SEND_MESSAGE__STRING;

	/**
	 * The operation id for the '<em>Send Notification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___SEND_NOTIFICATION__NOTIFICATION = CHANNEL___SEND_NOTIFICATION__NOTIFICATION;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___SEND_REQUEST__REQUEST = CHANNEL___SEND_REQUEST__REQUEST;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___SEND_REQUEST__REQUEST_RESPONSECALLBACK = CHANNEL___SEND_REQUEST__REQUEST_RESPONSECALLBACK;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.QueueImpl <em>Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.QueueImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__BINDING = CHANNEL__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__ID = CHANNEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__NAME = CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__METADATA = CHANNEL__METADATA;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__LISTENER = CHANNEL__LISTENER;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__POOL = CHANNEL__POOL;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__OPEN = CHANNEL__OPEN;

	/**
	 * The number of structural features of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_FEATURE_COUNT = CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE___OPEN = CHANNEL___OPEN;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE___CLOSE = CHANNEL___CLOSE;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE___SEND_MESSAGE__STRING = CHANNEL___SEND_MESSAGE__STRING;

	/**
	 * The operation id for the '<em>Send Notification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE___SEND_NOTIFICATION__NOTIFICATION = CHANNEL___SEND_NOTIFICATION__NOTIFICATION;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE___SEND_REQUEST__REQUEST = CHANNEL___SEND_REQUEST__REQUEST;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE___SEND_REQUEST__REQUEST_RESPONSECALLBACK = CHANNEL___SEND_REQUEST__REQUEST_RESPONSECALLBACK;

	/**
	 * The number of operations of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_OPERATION_COUNT = CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.DirectLinkImpl <em>Direct Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.DirectLinkImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getDirectLink()
	 * @generated
	 */
	int DIRECT_LINK = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK__BINDING = CHANNEL__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK__ID = CHANNEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK__NAME = CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK__METADATA = CHANNEL__METADATA;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK__LISTENER = CHANNEL__LISTENER;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK__POOL = CHANNEL__POOL;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK__OPEN = CHANNEL__OPEN;

	/**
	 * The number of structural features of the '<em>Direct Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK_FEATURE_COUNT = CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK___OPEN = CHANNEL___OPEN;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK___CLOSE = CHANNEL___CLOSE;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK___SEND_MESSAGE__STRING = CHANNEL___SEND_MESSAGE__STRING;

	/**
	 * The operation id for the '<em>Send Notification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK___SEND_NOTIFICATION__NOTIFICATION = CHANNEL___SEND_NOTIFICATION__NOTIFICATION;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK___SEND_REQUEST__REQUEST = CHANNEL___SEND_REQUEST__REQUEST;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK___SEND_REQUEST__REQUEST_RESPONSECALLBACK = CHANNEL___SEND_REQUEST__REQUEST_RESPONSECALLBACK;

	/**
	 * The number of operations of the '<em>Direct Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_LINK_OPERATION_COUNT = CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelListener <em>Channel Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelListener
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannelListener()
	 * @generated
	 */
	int CHANNEL_LISTENER = 6;

	/**
	 * The number of structural features of the '<em>Channel Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Handle Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_LISTENER___HANDLE_MESSAGE__STRING = 0;

	/**
	 * The operation id for the '<em>Handle Notification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_LISTENER___HANDLE_NOTIFICATION__NOTIFICATION = 1;

	/**
	 * The operation id for the '<em>Handle Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_LISTENER___HANDLE_REQUEST__REQUEST = 2;

	/**
	 * The number of operations of the '<em>Channel Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_LISTENER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.CommunicationProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationProviderImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getCommunicationProvider()
	 * @generated
	 */
	int COMMUNICATION_PROVIDER = 7;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Do Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER___DO_CONNECT__CHANNELPOOL = 0;

	/**
	 * The operation id for the '<em>Do Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER___DO_DISCONNECT__CHANNELPOOL = 1;

	/**
	 * The operation id for the '<em>Do Open Channel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER___DO_OPEN_CHANNEL__CHANNEL = 2;

	/**
	 * The operation id for the '<em>Do Close Channel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER___DO_CLOSE_CHANNEL__CHANNEL = 3;

	/**
	 * The operation id for the '<em>Do Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER___DO_SEND_MESSAGE__CHANNEL_STRING = 4;

	/**
	 * The operation id for the '<em>Do Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER___DO_SEND_REQUEST__CHANNEL_REQUEST_RESPONSECALLBACK = 5;

	/**
	 * The operation id for the '<em>Do Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER___DO_SEND_REQUEST__CHANNEL_REQUEST = 6;

	/**
	 * The operation id for the '<em>Do Send Notification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER___DO_SEND_NOTIFICATION__CHANNEL_NOTIFICATION = 7;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROVIDER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.MessageImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PAYLOAD = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.NotificationImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__BINDING = MESSAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__METADATA = MESSAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__PAYLOAD = MESSAGE__PAYLOAD;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.ResponseImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__BINDING = MESSAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__NAME = MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__METADATA = MESSAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__PAYLOAD = MESSAGE__PAYLOAD;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.RequestImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__BINDING = MESSAGE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__METADATA = MESSAGE__METADATA;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__PAYLOAD = MESSAGE__PAYLOAD;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.ResponseCallback <em>Response Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.ResponseCallback
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getResponseCallback()
	 * @generated
	 */
	int RESPONSE_CALLBACK = 12;

	/**
	 * The number of structural features of the '<em>Response Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CALLBACK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Handle Response</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CALLBACK___HANDLE_RESPONSE__RESPONSE = 0;

	/**
	 * The number of operations of the '<em>Response Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CALLBACK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.AuthenticationImpl
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 13;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__CERTIFICATE = 2;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.CommunicationException
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getCommunicationException()
	 * @generated
	 */
	int COMMUNICATION_EXCEPTION = 14;

	/**
	 * The meta object id for the '<em>Channel Pool Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelPoolException
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannelPoolException()
	 * @generated
	 */
	int CHANNEL_POOL_EXCEPTION = 15;

	/**
	 * The meta object id for the '<em>Provider Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getProviderException()
	 * @generated
	 */
	int PROVIDER_EXCEPTION = 16;

	/**
	 * The meta object id for the '<em>Message Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.MessageException
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getMessageException()
	 * @generated
	 */
	int MESSAGE_EXCEPTION = 17;

	/**
	 * The meta object id for the '<em>Client Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ClientException
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getClientException()
	 * @generated
	 */
	int CLIENT_EXCEPTION = 18;

	/**
	 * The meta object id for the '<em>Channel Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException
	 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannelException()
	 * @generated
	 */
	int CHANNEL_EXCEPTION = 19;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.basys.model.runtime.communication.Client#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authentication</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#getAuthentication()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Authentication();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.runtime.communication.Client#getPools <em>Pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pools</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#getPools()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Pools();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Client#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#connect()
	 * @generated
	 */
	EOperation getClient__Connect();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Client#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#disconnect()
	 * @generated
	 */
	EOperation getClient__Disconnect();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Client#isConnected() <em>Is Connected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Connected</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#isConnected()
	 * @generated
	 */
	EOperation getClient__IsConnected();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Client#getChannel(java.lang.String) <em>Get Channel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Channel</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#getChannel(java.lang.String)
	 * @generated
	 */
	EOperation getClient__GetChannel__String();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Client#sendMessage(java.lang.String, java.lang.String) <em>Send Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Message</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#sendMessage(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getClient__SendMessage__String_String();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Client#sendRequest(java.lang.String, de.dfki.iui.basys.model.runtime.communication.Request, de.dfki.iui.basys.model.runtime.communication.ResponseCallback) <em>Send Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Request</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#sendRequest(java.lang.String, de.dfki.iui.basys.model.runtime.communication.Request, de.dfki.iui.basys.model.runtime.communication.ResponseCallback)
	 * @generated
	 */
	EOperation getClient__SendRequest__String_Request_ResponseCallback();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Client#sendRequest(java.lang.String, de.dfki.iui.basys.model.runtime.communication.Request) <em>Send Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Request</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#sendRequest(java.lang.String, de.dfki.iui.basys.model.runtime.communication.Request)
	 * @generated
	 */
	EOperation getClient__SendRequest__String_Request();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Client#sendNotification(java.lang.String, de.dfki.iui.basys.model.runtime.communication.Notification) <em>Send Notification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Notification</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Client#sendNotification(java.lang.String, de.dfki.iui.basys.model.runtime.communication.Notification)
	 * @generated
	 */
	EOperation getClient__SendNotification__String_Notification();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool <em>Channel Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Pool</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool
	 * @generated
	 */
	EClass getChannelPool();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#getChannels()
	 * @see #getChannelPool()
	 * @generated
	 */
	EReference getChannelPool_Channels();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#getProvider()
	 * @see #getChannelPool()
	 * @generated
	 */
	EReference getChannelPool_Provider();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#getUri()
	 * @see #getChannelPool()
	 * @generated
	 */
	EAttribute getChannelPool_Uri();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#getClient()
	 * @see #getChannelPool()
	 * @generated
	 */
	EReference getChannelPool_Client();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#isConnected()
	 * @see #getChannelPool()
	 * @generated
	 */
	EAttribute getChannelPool_Connected();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#connect()
	 * @generated
	 */
	EOperation getChannelPool__Connect();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#disconnect()
	 * @generated
	 */
	EOperation getChannelPool__Disconnect();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelPool#getChannel(java.lang.String) <em>Get Channel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Channel</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelPool#getChannel(java.lang.String)
	 * @generated
	 */
	EOperation getChannelPool__GetChannel__String();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.runtime.communication.Channel#getListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Listener</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#getListener()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Listener();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.basys.model.runtime.communication.Channel#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pool</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#getPool()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Pool();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.communication.Channel#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#isOpen()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Open();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Channel#open() <em>Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#open()
	 * @generated
	 */
	EOperation getChannel__Open();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Channel#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#close()
	 * @generated
	 */
	EOperation getChannel__Close();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Channel#sendMessage(java.lang.String) <em>Send Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Message</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#sendMessage(java.lang.String)
	 * @generated
	 */
	EOperation getChannel__SendMessage__String();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Channel#sendNotification(de.dfki.iui.basys.model.runtime.communication.Notification) <em>Send Notification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Notification</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#sendNotification(de.dfki.iui.basys.model.runtime.communication.Notification)
	 * @generated
	 */
	EOperation getChannel__SendNotification__Notification();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Channel#sendRequest(de.dfki.iui.basys.model.runtime.communication.Request) <em>Send Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Request</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#sendRequest(de.dfki.iui.basys.model.runtime.communication.Request)
	 * @generated
	 */
	EOperation getChannel__SendRequest__Request();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.Channel#sendRequest(de.dfki.iui.basys.model.runtime.communication.Request, de.dfki.iui.basys.model.runtime.communication.ResponseCallback) <em>Send Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Request</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.Channel#sendRequest(de.dfki.iui.basys.model.runtime.communication.Request, de.dfki.iui.basys.model.runtime.communication.ResponseCallback)
	 * @generated
	 */
	EOperation getChannel__SendRequest__Request_ResponseCallback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Queue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Queue
	 * @generated
	 */
	EClass getQueue();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.DirectLink <em>Direct Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Link</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.DirectLink
	 * @generated
	 */
	EClass getDirectLink();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.ChannelListener <em>Channel Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Listener</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelListener
	 * @generated
	 */
	EClass getChannelListener();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelListener#handleMessage(java.lang.String) <em>Handle Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Message</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelListener#handleMessage(java.lang.String)
	 * @generated
	 */
	EOperation getChannelListener__HandleMessage__String();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelListener#handleNotification(de.dfki.iui.basys.model.runtime.communication.Notification) <em>Handle Notification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Notification</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelListener#handleNotification(de.dfki.iui.basys.model.runtime.communication.Notification)
	 * @generated
	 */
	EOperation getChannelListener__HandleNotification__Notification();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelListener#handleRequest(de.dfki.iui.basys.model.runtime.communication.Request) <em>Handle Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Request</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.ChannelListener#handleRequest(de.dfki.iui.basys.model.runtime.communication.Request)
	 * @generated
	 */
	EOperation getChannelListener__HandleRequest__Request();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider
	 * @generated
	 */
	EClass getCommunicationProvider();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doConnect(de.dfki.iui.basys.model.runtime.communication.ChannelPool) <em>Do Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Connect</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doConnect(de.dfki.iui.basys.model.runtime.communication.ChannelPool)
	 * @generated
	 */
	EOperation getCommunicationProvider__DoConnect__ChannelPool();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doDisconnect(de.dfki.iui.basys.model.runtime.communication.ChannelPool) <em>Do Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Disconnect</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doDisconnect(de.dfki.iui.basys.model.runtime.communication.ChannelPool)
	 * @generated
	 */
	EOperation getCommunicationProvider__DoDisconnect__ChannelPool();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doOpenChannel(de.dfki.iui.basys.model.runtime.communication.Channel) <em>Do Open Channel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Open Channel</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doOpenChannel(de.dfki.iui.basys.model.runtime.communication.Channel)
	 * @generated
	 */
	EOperation getCommunicationProvider__DoOpenChannel__Channel();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doCloseChannel(de.dfki.iui.basys.model.runtime.communication.Channel) <em>Do Close Channel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Close Channel</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doCloseChannel(de.dfki.iui.basys.model.runtime.communication.Channel)
	 * @generated
	 */
	EOperation getCommunicationProvider__DoCloseChannel__Channel();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doSendMessage(de.dfki.iui.basys.model.runtime.communication.Channel, java.lang.String) <em>Do Send Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Send Message</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doSendMessage(de.dfki.iui.basys.model.runtime.communication.Channel, java.lang.String)
	 * @generated
	 */
	EOperation getCommunicationProvider__DoSendMessage__Channel_String();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doSendRequest(de.dfki.iui.basys.model.runtime.communication.Channel, de.dfki.iui.basys.model.runtime.communication.Request, de.dfki.iui.basys.model.runtime.communication.ResponseCallback) <em>Do Send Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Send Request</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doSendRequest(de.dfki.iui.basys.model.runtime.communication.Channel, de.dfki.iui.basys.model.runtime.communication.Request, de.dfki.iui.basys.model.runtime.communication.ResponseCallback)
	 * @generated
	 */
	EOperation getCommunicationProvider__DoSendRequest__Channel_Request_ResponseCallback();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doSendRequest(de.dfki.iui.basys.model.runtime.communication.Channel, de.dfki.iui.basys.model.runtime.communication.Request) <em>Do Send Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Send Request</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doSendRequest(de.dfki.iui.basys.model.runtime.communication.Channel, de.dfki.iui.basys.model.runtime.communication.Request)
	 * @generated
	 */
	EOperation getCommunicationProvider__DoSendRequest__Channel_Request();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doSendNotification(de.dfki.iui.basys.model.runtime.communication.Channel, de.dfki.iui.basys.model.runtime.communication.Notification) <em>Do Send Notification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Send Notification</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.CommunicationProvider#doSendNotification(de.dfki.iui.basys.model.runtime.communication.Channel, de.dfki.iui.basys.model.runtime.communication.Notification)
	 * @generated
	 */
	EOperation getCommunicationProvider__DoSendNotification__Channel_Notification();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.communication.Message#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Message#getPayload()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Payload();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.ResponseCallback <em>Response Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Callback</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.ResponseCallback
	 * @generated
	 */
	EClass getResponseCallback();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.basys.model.runtime.communication.ResponseCallback#handleResponse(de.dfki.iui.basys.model.runtime.communication.Response) <em>Handle Response</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Response</em>' operation.
	 * @see de.dfki.iui.basys.model.runtime.communication.ResponseCallback#handleResponse(de.dfki.iui.basys.model.runtime.communication.Response)
	 * @generated
	 */
	EOperation getResponseCallback__HandleResponse__Response();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.communication.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.communication.Authentication#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Authentication#getUsername()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_Username();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.communication.Authentication#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Authentication#getPassword()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_Password();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.communication.Authentication#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.Authentication#getCertificate()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_Certificate();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.runtime.communication.exceptions.CommunicationException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.CommunicationException
	 * @model instanceClass="de.dfki.iui.basys.model.runtime.communication.exceptions.CommunicationException"
	 * @generated
	 */
	EDataType getCommunicationException();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelPoolException <em>Channel Pool Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Channel Pool Exception</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelPoolException
	 * @model instanceClass="de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelPoolException"
	 * @generated
	 */
	EDataType getChannelPoolException();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException <em>Provider Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Provider Exception</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException
	 * @model instanceClass="de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException"
	 * @generated
	 */
	EDataType getProviderException();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.runtime.communication.exceptions.MessageException <em>Message Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Exception</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.MessageException
	 * @model instanceClass="de.dfki.iui.basys.model.runtime.communication.exceptions.MessageException"
	 * @generated
	 */
	EDataType getMessageException();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.runtime.communication.exceptions.ClientException <em>Client Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Client Exception</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ClientException
	 * @model instanceClass="de.dfki.iui.basys.model.runtime.communication.exceptions.ClientException"
	 * @generated
	 */
	EDataType getClientException();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException <em>Channel Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Channel Exception</em>'.
	 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException
	 * @model instanceClass="de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException"
	 * @generated
	 */
	EDataType getChannelException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationFactory getCommunicationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.ClientImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__AUTHENTICATION = eINSTANCE.getClient_Authentication();

		/**
		 * The meta object literal for the '<em><b>Pools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__POOLS = eINSTANCE.getClient_Pools();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___CONNECT = eINSTANCE.getClient__Connect();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___DISCONNECT = eINSTANCE.getClient__Disconnect();

		/**
		 * The meta object literal for the '<em><b>Is Connected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___IS_CONNECTED = eINSTANCE.getClient__IsConnected();

		/**
		 * The meta object literal for the '<em><b>Get Channel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___GET_CHANNEL__STRING = eINSTANCE.getClient__GetChannel__String();

		/**
		 * The meta object literal for the '<em><b>Send Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___SEND_MESSAGE__STRING_STRING = eINSTANCE.getClient__SendMessage__String_String();

		/**
		 * The meta object literal for the '<em><b>Send Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___SEND_REQUEST__STRING_REQUEST_RESPONSECALLBACK = eINSTANCE.getClient__SendRequest__String_Request_ResponseCallback();

		/**
		 * The meta object literal for the '<em><b>Send Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___SEND_REQUEST__STRING_REQUEST = eINSTANCE.getClient__SendRequest__String_Request();

		/**
		 * The meta object literal for the '<em><b>Send Notification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___SEND_NOTIFICATION__STRING_NOTIFICATION = eINSTANCE.getClient__SendNotification__String_Notification();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.ChannelPoolImpl <em>Channel Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.ChannelPoolImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannelPool()
		 * @generated
		 */
		EClass CHANNEL_POOL = eINSTANCE.getChannelPool();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_POOL__CHANNELS = eINSTANCE.getChannelPool_Channels();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_POOL__PROVIDER = eINSTANCE.getChannelPool_Provider();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_POOL__URI = eINSTANCE.getChannelPool_Uri();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_POOL__CLIENT = eINSTANCE.getChannelPool_Client();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_POOL__CONNECTED = eINSTANCE.getChannelPool_Connected();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL_POOL___CONNECT = eINSTANCE.getChannelPool__Connect();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL_POOL___DISCONNECT = eINSTANCE.getChannelPool__Disconnect();

		/**
		 * The meta object literal for the '<em><b>Get Channel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL_POOL___GET_CHANNEL__STRING = eINSTANCE.getChannelPool__GetChannel__String();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.ChannelImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Listener</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__LISTENER = eINSTANCE.getChannel_Listener();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__POOL = eINSTANCE.getChannel_Pool();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__OPEN = eINSTANCE.getChannel_Open();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL___OPEN = eINSTANCE.getChannel__Open();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL___CLOSE = eINSTANCE.getChannel__Close();

		/**
		 * The meta object literal for the '<em><b>Send Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL___SEND_MESSAGE__STRING = eINSTANCE.getChannel__SendMessage__String();

		/**
		 * The meta object literal for the '<em><b>Send Notification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL___SEND_NOTIFICATION__NOTIFICATION = eINSTANCE.getChannel__SendNotification__Notification();

		/**
		 * The meta object literal for the '<em><b>Send Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL___SEND_REQUEST__REQUEST = eINSTANCE.getChannel__SendRequest__Request();

		/**
		 * The meta object literal for the '<em><b>Send Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL___SEND_REQUEST__REQUEST_RESPONSECALLBACK = eINSTANCE.getChannel__SendRequest__Request_ResponseCallback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.TopicImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.QueueImpl <em>Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.QueueImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getQueue()
		 * @generated
		 */
		EClass QUEUE = eINSTANCE.getQueue();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.DirectLinkImpl <em>Direct Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.DirectLinkImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getDirectLink()
		 * @generated
		 */
		EClass DIRECT_LINK = eINSTANCE.getDirectLink();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.ChannelListener <em>Channel Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.ChannelListener
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannelListener()
		 * @generated
		 */
		EClass CHANNEL_LISTENER = eINSTANCE.getChannelListener();

		/**
		 * The meta object literal for the '<em><b>Handle Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL_LISTENER___HANDLE_MESSAGE__STRING = eINSTANCE.getChannelListener__HandleMessage__String();

		/**
		 * The meta object literal for the '<em><b>Handle Notification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL_LISTENER___HANDLE_NOTIFICATION__NOTIFICATION = eINSTANCE.getChannelListener__HandleNotification__Notification();

		/**
		 * The meta object literal for the '<em><b>Handle Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL_LISTENER___HANDLE_REQUEST__REQUEST = eINSTANCE.getChannelListener__HandleRequest__Request();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.CommunicationProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationProviderImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getCommunicationProvider()
		 * @generated
		 */
		EClass COMMUNICATION_PROVIDER = eINSTANCE.getCommunicationProvider();

		/**
		 * The meta object literal for the '<em><b>Do Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_PROVIDER___DO_CONNECT__CHANNELPOOL = eINSTANCE.getCommunicationProvider__DoConnect__ChannelPool();

		/**
		 * The meta object literal for the '<em><b>Do Disconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_PROVIDER___DO_DISCONNECT__CHANNELPOOL = eINSTANCE.getCommunicationProvider__DoDisconnect__ChannelPool();

		/**
		 * The meta object literal for the '<em><b>Do Open Channel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_PROVIDER___DO_OPEN_CHANNEL__CHANNEL = eINSTANCE.getCommunicationProvider__DoOpenChannel__Channel();

		/**
		 * The meta object literal for the '<em><b>Do Close Channel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_PROVIDER___DO_CLOSE_CHANNEL__CHANNEL = eINSTANCE.getCommunicationProvider__DoCloseChannel__Channel();

		/**
		 * The meta object literal for the '<em><b>Do Send Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_PROVIDER___DO_SEND_MESSAGE__CHANNEL_STRING = eINSTANCE.getCommunicationProvider__DoSendMessage__Channel_String();

		/**
		 * The meta object literal for the '<em><b>Do Send Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_PROVIDER___DO_SEND_REQUEST__CHANNEL_REQUEST_RESPONSECALLBACK = eINSTANCE.getCommunicationProvider__DoSendRequest__Channel_Request_ResponseCallback();

		/**
		 * The meta object literal for the '<em><b>Do Send Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_PROVIDER___DO_SEND_REQUEST__CHANNEL_REQUEST = eINSTANCE.getCommunicationProvider__DoSendRequest__Channel_Request();

		/**
		 * The meta object literal for the '<em><b>Do Send Notification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_PROVIDER___DO_SEND_NOTIFICATION__CHANNEL_NOTIFICATION = eINSTANCE.getCommunicationProvider__DoSendNotification__Channel_Notification();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.MessageImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__PAYLOAD = eINSTANCE.getMessage_Payload();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.NotificationImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.ResponseImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.RequestImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.ResponseCallback <em>Response Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.ResponseCallback
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getResponseCallback()
		 * @generated
		 */
		EClass RESPONSE_CALLBACK = eINSTANCE.getResponseCallback();

		/**
		 * The meta object literal for the '<em><b>Handle Response</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESPONSE_CALLBACK___HANDLE_RESPONSE__RESPONSE = eINSTANCE.getResponseCallback__HandleResponse__Response();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.communication.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.AuthenticationImpl
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__USERNAME = eINSTANCE.getAuthentication_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__PASSWORD = eINSTANCE.getAuthentication_Password();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__CERTIFICATE = eINSTANCE.getAuthentication_Certificate();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.CommunicationException
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getCommunicationException()
		 * @generated
		 */
		EDataType COMMUNICATION_EXCEPTION = eINSTANCE.getCommunicationException();

		/**
		 * The meta object literal for the '<em>Channel Pool Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelPoolException
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannelPoolException()
		 * @generated
		 */
		EDataType CHANNEL_POOL_EXCEPTION = eINSTANCE.getChannelPoolException();

		/**
		 * The meta object literal for the '<em>Provider Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ProviderException
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getProviderException()
		 * @generated
		 */
		EDataType PROVIDER_EXCEPTION = eINSTANCE.getProviderException();

		/**
		 * The meta object literal for the '<em>Message Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.MessageException
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getMessageException()
		 * @generated
		 */
		EDataType MESSAGE_EXCEPTION = eINSTANCE.getMessageException();

		/**
		 * The meta object literal for the '<em>Client Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ClientException
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getClientException()
		 * @generated
		 */
		EDataType CLIENT_EXCEPTION = eINSTANCE.getClientException();

		/**
		 * The meta object literal for the '<em>Channel Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.communication.exceptions.ChannelException
		 * @see de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl#getChannelException()
		 * @generated
		 */
		EDataType CHANNEL_EXCEPTION = eINSTANCE.getChannelException();

	}

} //CommunicationPackage
