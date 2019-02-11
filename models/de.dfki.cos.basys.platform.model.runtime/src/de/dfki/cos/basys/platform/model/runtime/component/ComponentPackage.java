/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/component";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentPackage eINSTANCE = de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentInfo()
	 * @generated
	 */
	int COMPONENT_INFO = 0;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__COMPONENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Component Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__COMPONENT_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>In Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__IN_CHANNEL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Out Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__OUT_CHANNEL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Status Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__STATUS_CHANNEL_NAME = 5;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__CURRENT_STATE = 6;

	/**
	 * The feature id for the '<em><b>Current Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__CURRENT_MODE = 7;

	/**
	 * The feature id for the '<em><b>Communication Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__COMMUNICATION_PROVIDER = 8;

	/**
	 * The feature id for the '<em><b>Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__CONNECTION_STRING = 9;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__HOST_NAME = 10;

	/**
	 * The feature id for the '<em><b>Uri Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__URI_SPEC = 11;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentConfigurationImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentConfiguration()
	 * @generated
	 */
	int COMPONENT_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__COMPONENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Component Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__COMPONENT_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Component Implementation Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Communication Provider Implementation Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Communication Provider Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING = 5;

	/**
	 * The feature id for the '<em><b>In Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__IN_CHANNEL_NAME = 6;

	/**
	 * The feature id for the '<em><b>Out Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME = 7;

	/**
	 * The feature id for the '<em><b>External Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__PROPERTIES = 9;

	/**
	 * The feature id for the '<em><b>Simulation Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION = 10;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION___GET_PROPERTY__STRING = 0;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.PropertyImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequest()
	 * @generated
	 */
	int COMPONENT_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST__CORRELATION_ID = 1;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.CommandRequestImpl <em>Command Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.CommandRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getCommandRequest()
	 * @generated
	 */
	int COMMAND_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The feature id for the '<em><b>Control Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REQUEST__CONTROL_COMMAND = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ChangeModeRequestImpl <em>Change Mode Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ChangeModeRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getChangeModeRequest()
	 * @generated
	 */
	int CHANGE_MODE_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MODE_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MODE_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MODE_REQUEST__MODE = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Mode Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MODE_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Mode Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MODE_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.CapabilityRequestImpl <em>Capability Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.CapabilityRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getCapabilityRequest()
	 * @generated
	 */
	int CAPABILITY_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The feature id for the '<em><b>Capability Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__CAPABILITY_VARIANT = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl <em>Request Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestStatus()
	 * @generated
	 */
	int COMPONENT_REQUEST_STATUS = 7;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Request Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl <em>Status Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getStatusRequest()
	 * @generated
	 */
	int STATUS_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The number of structural features of the '<em>Status Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentResponse()
	 * @generated
	 */
	int COMPONENT_RESPONSE = 9;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__STATUS_CODE = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Result Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__RESULT_VARIABLES = 5;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl <em>Request Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestCollection()
	 * @generated
	 */
	int COMPONENT_REQUEST_COLLECTION = 10;

	/**
	 * The feature id for the '<em><b>Component Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS = 0;

	/**
	 * The number of structural features of the '<em>Request Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Request Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl <em>Simulation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getSimulationConfiguration()
	 * @generated
	 */
	int SIMULATION_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>On Resetting Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_RESETTING_DURATION = 0;

	/**
	 * The feature id for the '<em><b>On Starting Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_STARTING_DURATION = 1;

	/**
	 * The feature id for the '<em><b>On Execute Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_EXECUTE_DURATION = 2;

	/**
	 * The feature id for the '<em><b>On Completing Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_COMPLETING_DURATION = 3;

	/**
	 * The feature id for the '<em><b>On Stopping Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_STOPPING_DURATION = 4;

	/**
	 * The feature id for the '<em><b>On Aborting Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_ABORTING_DURATION = 5;

	/**
	 * The feature id for the '<em><b>On Clearing Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_CLEARING_DURATION = 6;

	/**
	 * The feature id for the '<em><b>On Holding Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_HOLDING_DURATION = 7;

	/**
	 * The feature id for the '<em><b>On Unholding Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_UNHOLDING_DURATION = 8;

	/**
	 * The feature id for the '<em><b>On Suspending Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_SUSPENDING_DURATION = 9;

	/**
	 * The feature id for the '<em><b>On Unsuspending Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_UNSUSPENDING_DURATION = 10;

	/**
	 * The feature id for the '<em><b>On Completing Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_COMPLETING_VARIABLES = 11;

	/**
	 * The feature id for the '<em><b>On Completing Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_COMPLETING_STATUS_CODE = 12;

	/**
	 * The feature id for the '<em><b>On Stopping Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION__ON_STOPPING_STATUS_CODE = 13;

	/**
	 * The number of structural features of the '<em>Simulation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Simulation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestImpl <em>Process Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getProcessRequest()
	 * @generated
	 */
	int PROCESS_REQUEST = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Business Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST__BUSINESS_KEY = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST__VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Process Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Process Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestStatusImpl <em>Process Request Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestStatusImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getProcessRequestStatus()
	 * @generated
	 */
	int PROCESS_REQUEST_STATUS = 14;

	/**
	 * The feature id for the '<em><b>Process Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST_STATUS__PROCESS_INSTANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Business Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST_STATUS__BUSINESS_KEY = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST_STATUS__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST_STATUS__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Process Request Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST_STATUS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Process Request Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUEST_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl <em>Process Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getProcessResponse()
	 * @generated
	 */
	int PROCESS_RESPONSE = 15;

	/**
	 * The feature id for the '<em><b>Process Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE__PROCESS_INSTANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Business Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE__BUSINESS_KEY = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE__STATUS_CODE = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE__REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Result Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE__RESULT_VARIABLES = 6;

	/**
	 * The number of structural features of the '<em>Process Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Process Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentCategory()
	 * @generated
	 */
	int COMPONENT_CATEGORY = 16;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.State
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getState()
	 * @generated
	 */
	int STATE = 17;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ControlMode <em>Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ControlMode
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getControlMode()
	 * @generated
	 */
	int CONTROL_MODE = 18;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ControlCommand <em>Control Command</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ControlCommand
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getControlCommand()
	 * @generated
	 */
	int CONTROL_COMMAND = 19;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.RequestStatus <em>Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.RequestStatus
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getRequestStatus()
	 * @generated
	 */
	int REQUEST_STATUS = 20;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus <em>Response Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getResponseStatus()
	 * @generated
	 */
	int RESPONSE_STATUS = 21;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.VariableType
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 22;

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo
	 * @generated
	 */
	EClass getComponentInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getComponentId()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getComponentName()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getComponentCategory <em>Component Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Category</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getComponentCategory()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ComponentCategory();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getInChannelName <em>In Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Channel Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getInChannelName()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_InChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getOutChannelName <em>Out Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Channel Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getOutChannelName()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_OutChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getStatusChannelName <em>Status Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Channel Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getStatusChannelName()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_StatusChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current State</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getCurrentState()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getCurrentMode <em>Current Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Mode</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getCurrentMode()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_CurrentMode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getCommunicationProvider <em>Communication Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Provider</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getCommunicationProvider()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_CommunicationProvider();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getConnectionString <em>Connection String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection String</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getConnectionString()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ConnectionString();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getHostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getHostName()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_HostName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getUriSpec <em>Uri Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Spec</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo#getUriSpec()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_UriSpec();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration
	 * @generated
	 */
	EClass getComponentConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getComponentId()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getComponentName()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getComponentCategory <em>Component Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Category</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getComponentCategory()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ComponentCategory();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getComponentImplementationJavaClass <em>Component Implementation Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Implementation Java Class</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getComponentImplementationJavaClass()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ComponentImplementationJavaClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getCommunicationProviderImplementationJavaClass <em>Communication Provider Implementation Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Provider Implementation Java Class</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getCommunicationProviderImplementationJavaClass()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_CommunicationProviderImplementationJavaClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getCommunicationProviderConnectionString <em>Communication Provider Connection String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Provider Connection String</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getCommunicationProviderConnectionString()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_CommunicationProviderConnectionString();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getInChannelName <em>In Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Channel Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getInChannelName()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_InChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getOutChannelName <em>Out Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Channel Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getOutChannelName()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_OutChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getExternalConnectionString <em>External Connection String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Connection String</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getExternalConnectionString()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ExternalConnectionString();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getProperties()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getSimulationConfiguration <em>Simulation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulation Configuration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getSimulationConfiguration()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_SimulationConfiguration();

	/**
	 * Returns the meta object for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property</em>' operation.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentConfiguration#getProperty(java.lang.String)
	 * @generated
	 */
	EOperation getComponentConfiguration__GetProperty__String();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest
	 * @generated
	 */
	EClass getComponentRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getComponentId()
	 * @see #getComponentRequest()
	 * @generated
	 */
	EAttribute getComponentRequest_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getCorrelationId <em>Correlation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getCorrelationId()
	 * @see #getComponentRequest()
	 * @generated
	 */
	EAttribute getComponentRequest_CorrelationId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.CommandRequest <em>Command Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.CommandRequest
	 * @generated
	 */
	EClass getCommandRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.CommandRequest#getControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Command</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.CommandRequest#getControlCommand()
	 * @see #getCommandRequest()
	 * @generated
	 */
	EAttribute getCommandRequest_ControlCommand();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest <em>Change Mode Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Mode Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest
	 * @generated
	 */
	EClass getChangeModeRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ChangeModeRequest#getMode()
	 * @see #getChangeModeRequest()
	 * @generated
	 */
	EAttribute getChangeModeRequest_Mode();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest <em>Capability Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest
	 * @generated
	 */
	EClass getCapabilityRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest#getCapabilityVariant <em>Capability Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Variant</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.CapabilityRequest#getCapabilityVariant()
	 * @see #getCapabilityRequest()
	 * @generated
	 */
	EReference getCapabilityRequest_CapabilityVariant();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus
	 * @generated
	 */
	EClass getComponentRequestStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getComponentId()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getStatus()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getMessage()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_Message();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.StatusRequest <em>Status Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.StatusRequest
	 * @generated
	 */
	EClass getStatusRequest();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse
	 * @generated
	 */
	EClass getComponentResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getComponentId()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EAttribute getComponentResponse_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getStatus()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EAttribute getComponentResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getStatusCode()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EAttribute getComponentResponse_StatusCode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getMessage()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EAttribute getComponentResponse_Message();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getRequest()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EReference getComponentResponse_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getResultVariables <em>Result Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Variables</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getResultVariables()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EReference getComponentResponse_ResultVariables();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection <em>Request Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Collection</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection
	 * @generated
	 */
	EClass getComponentRequestCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection#getComponentRequests <em>Component Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Requests</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection#getComponentRequests()
	 * @see #getComponentRequestCollection()
	 * @generated
	 */
	EReference getComponentRequestCollection_ComponentRequests();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration <em>Simulation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Configuration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration
	 * @generated
	 */
	EClass getSimulationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnResettingDuration <em>On Resetting Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Resetting Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnResettingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnResettingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnStartingDuration <em>On Starting Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Starting Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnStartingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnStartingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnExecuteDuration <em>On Execute Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Execute Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnExecuteDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnExecuteDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnCompletingDuration <em>On Completing Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Completing Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnCompletingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnCompletingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnStoppingDuration <em>On Stopping Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Stopping Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnStoppingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnStoppingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnAbortingDuration <em>On Aborting Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Aborting Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnAbortingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnAbortingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnClearingDuration <em>On Clearing Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Clearing Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnClearingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnClearingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnHoldingDuration <em>On Holding Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Holding Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnHoldingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnHoldingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnUnholdingDuration <em>On Unholding Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Unholding Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnUnholdingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnUnholdingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnSuspendingDuration <em>On Suspending Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Suspending Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnSuspendingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnSuspendingDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnUnsuspendingDuration <em>On Unsuspending Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Unsuspending Duration</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnUnsuspendingDuration()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnUnsuspendingDuration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnCompletingVariables <em>On Completing Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Completing Variables</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnCompletingVariables()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EReference getSimulationConfiguration_OnCompletingVariables();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnCompletingStatusCode <em>On Completing Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Completing Status Code</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnCompletingStatusCode()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnCompletingStatusCode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnStoppingStatusCode <em>On Stopping Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Stopping Status Code</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.SimulationConfiguration#getOnStoppingStatusCode()
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	EAttribute getSimulationConfiguration_OnStoppingStatusCode();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest <em>Process Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest
	 * @generated
	 */
	EClass getProcessRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getName()
	 * @see #getProcessRequest()
	 * @generated
	 */
	EAttribute getProcessRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getBusinessKey <em>Business Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Key</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getBusinessKey()
	 * @see #getProcessRequest()
	 * @generated
	 */
	EAttribute getProcessRequest_BusinessKey();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequest#getVariables()
	 * @see #getProcessRequest()
	 * @generated
	 */
	EReference getProcessRequest_Variables();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus <em>Process Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Request Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus
	 * @generated
	 */
	EClass getProcessRequestStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getProcessInstanceId <em>Process Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Instance Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getProcessInstanceId()
	 * @see #getProcessRequestStatus()
	 * @generated
	 */
	EAttribute getProcessRequestStatus_ProcessInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getBusinessKey <em>Business Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Key</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getBusinessKey()
	 * @see #getProcessRequestStatus()
	 * @generated
	 */
	EAttribute getProcessRequestStatus_BusinessKey();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getStatus()
	 * @see #getProcessRequestStatus()
	 * @generated
	 */
	EAttribute getProcessRequestStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessRequestStatus#getMessage()
	 * @see #getProcessRequestStatus()
	 * @generated
	 */
	EAttribute getProcessRequestStatus_Message();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse <em>Process Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Response</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse
	 * @generated
	 */
	EClass getProcessResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getProcessInstanceId <em>Process Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Instance Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getProcessInstanceId()
	 * @see #getProcessResponse()
	 * @generated
	 */
	EAttribute getProcessResponse_ProcessInstanceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getBusinessKey <em>Business Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Key</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getBusinessKey()
	 * @see #getProcessResponse()
	 * @generated
	 */
	EAttribute getProcessResponse_BusinessKey();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getStatus()
	 * @see #getProcessResponse()
	 * @generated
	 */
	EAttribute getProcessResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getStatusCode()
	 * @see #getProcessResponse()
	 * @generated
	 */
	EAttribute getProcessResponse_StatusCode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getMessage()
	 * @see #getProcessResponse()
	 * @generated
	 */
	EAttribute getProcessResponse_Message();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getRequest()
	 * @see #getProcessResponse()
	 * @generated
	 */
	EReference getProcessResponse_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getResultVariables <em>Result Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Variables</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ProcessResponse#getResultVariables()
	 * @see #getProcessResponse()
	 * @generated
	 */
	EReference getProcessResponse_ResultVariables();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory
	 * @generated
	 */
	EEnum getComponentCategory();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.ControlMode <em>Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Mode</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ControlMode
	 * @generated
	 */
	EEnum getControlMode();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.ControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Command</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ControlCommand
	 * @generated
	 */
	EEnum getControlCommand();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.RequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.RequestStatus
	 * @generated
	 */
	EEnum getRequestStatus();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus <em>Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus
	 * @generated
	 */
	EEnum getResponseStatus();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentFactory getComponentFactory();

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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentInfo()
		 * @generated
		 */
		EClass COMPONENT_INFO = eINSTANCE.getComponentInfo();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__COMPONENT_ID = eINSTANCE.getComponentInfo_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__COMPONENT_NAME = eINSTANCE.getComponentInfo_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Component Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__COMPONENT_CATEGORY = eINSTANCE.getComponentInfo_ComponentCategory();

		/**
		 * The meta object literal for the '<em><b>In Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__IN_CHANNEL_NAME = eINSTANCE.getComponentInfo_InChannelName();

		/**
		 * The meta object literal for the '<em><b>Out Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__OUT_CHANNEL_NAME = eINSTANCE.getComponentInfo_OutChannelName();

		/**
		 * The meta object literal for the '<em><b>Status Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__STATUS_CHANNEL_NAME = eINSTANCE.getComponentInfo_StatusChannelName();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__CURRENT_STATE = eINSTANCE.getComponentInfo_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Current Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__CURRENT_MODE = eINSTANCE.getComponentInfo_CurrentMode();

		/**
		 * The meta object literal for the '<em><b>Communication Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__COMMUNICATION_PROVIDER = eINSTANCE.getComponentInfo_CommunicationProvider();

		/**
		 * The meta object literal for the '<em><b>Connection String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__CONNECTION_STRING = eINSTANCE.getComponentInfo_ConnectionString();

		/**
		 * The meta object literal for the '<em><b>Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__HOST_NAME = eINSTANCE.getComponentInfo_HostName();

		/**
		 * The meta object literal for the '<em><b>Uri Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__URI_SPEC = eINSTANCE.getComponentInfo_UriSpec();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentConfigurationImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentConfiguration()
		 * @generated
		 */
		EClass COMPONENT_CONFIGURATION = eINSTANCE.getComponentConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__COMPONENT_ID = eINSTANCE.getComponentConfiguration_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__COMPONENT_NAME = eINSTANCE.getComponentConfiguration_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Component Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__COMPONENT_CATEGORY = eINSTANCE.getComponentConfiguration_ComponentCategory();

		/**
		 * The meta object literal for the '<em><b>Component Implementation Java Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS = eINSTANCE.getComponentConfiguration_ComponentImplementationJavaClass();

		/**
		 * The meta object literal for the '<em><b>Communication Provider Implementation Java Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS = eINSTANCE.getComponentConfiguration_CommunicationProviderImplementationJavaClass();

		/**
		 * The meta object literal for the '<em><b>Communication Provider Connection String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING = eINSTANCE.getComponentConfiguration_CommunicationProviderConnectionString();

		/**
		 * The meta object literal for the '<em><b>In Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__IN_CHANNEL_NAME = eINSTANCE.getComponentConfiguration_InChannelName();

		/**
		 * The meta object literal for the '<em><b>Out Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME = eINSTANCE.getComponentConfiguration_OutChannelName();

		/**
		 * The meta object literal for the '<em><b>External Connection String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING = eINSTANCE.getComponentConfiguration_ExternalConnectionString();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__PROPERTIES = eINSTANCE.getComponentConfiguration_Properties();

		/**
		 * The meta object literal for the '<em><b>Simulation Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION = eINSTANCE.getComponentConfiguration_SimulationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Get Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_CONFIGURATION___GET_PROPERTY__STRING = eINSTANCE.getComponentConfiguration__GetProperty__String();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.PropertyImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequest()
		 * @generated
		 */
		EClass COMPONENT_REQUEST = eINSTANCE.getComponentRequest();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST__COMPONENT_ID = eINSTANCE.getComponentRequest_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Correlation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST__CORRELATION_ID = eINSTANCE.getComponentRequest_CorrelationId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.CommandRequestImpl <em>Command Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.CommandRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getCommandRequest()
		 * @generated
		 */
		EClass COMMAND_REQUEST = eINSTANCE.getCommandRequest();

		/**
		 * The meta object literal for the '<em><b>Control Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_REQUEST__CONTROL_COMMAND = eINSTANCE.getCommandRequest_ControlCommand();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ChangeModeRequestImpl <em>Change Mode Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ChangeModeRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getChangeModeRequest()
		 * @generated
		 */
		EClass CHANGE_MODE_REQUEST = eINSTANCE.getChangeModeRequest();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_MODE_REQUEST__MODE = eINSTANCE.getChangeModeRequest_Mode();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.CapabilityRequestImpl <em>Capability Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.CapabilityRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getCapabilityRequest()
		 * @generated
		 */
		EClass CAPABILITY_REQUEST = eINSTANCE.getCapabilityRequest();

		/**
		 * The meta object literal for the '<em><b>Capability Variant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REQUEST__CAPABILITY_VARIANT = eINSTANCE.getCapabilityRequest_CapabilityVariant();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl <em>Request Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestStatus()
		 * @generated
		 */
		EClass COMPONENT_REQUEST_STATUS = eINSTANCE.getComponentRequestStatus();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST_STATUS__COMPONENT_ID = eINSTANCE.getComponentRequestStatus_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST_STATUS__STATUS = eINSTANCE.getComponentRequestStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST_STATUS__MESSAGE = eINSTANCE.getComponentRequestStatus_Message();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl <em>Status Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getStatusRequest()
		 * @generated
		 */
		EClass STATUS_REQUEST = eINSTANCE.getStatusRequest();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentResponse()
		 * @generated
		 */
		EClass COMPONENT_RESPONSE = eINSTANCE.getComponentResponse();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESPONSE__COMPONENT_ID = eINSTANCE.getComponentResponse_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESPONSE__STATUS = eINSTANCE.getComponentResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESPONSE__STATUS_CODE = eINSTANCE.getComponentResponse_StatusCode();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESPONSE__MESSAGE = eINSTANCE.getComponentResponse_Message();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_RESPONSE__REQUEST = eINSTANCE.getComponentResponse_Request();

		/**
		 * The meta object literal for the '<em><b>Result Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_RESPONSE__RESULT_VARIABLES = eINSTANCE.getComponentResponse_ResultVariables();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl <em>Request Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestCollection()
		 * @generated
		 */
		EClass COMPONENT_REQUEST_COLLECTION = eINSTANCE.getComponentRequestCollection();

		/**
		 * The meta object literal for the '<em><b>Component Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS = eINSTANCE.getComponentRequestCollection_ComponentRequests();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl <em>Simulation Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.SimulationConfigurationImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getSimulationConfiguration()
		 * @generated
		 */
		EClass SIMULATION_CONFIGURATION = eINSTANCE.getSimulationConfiguration();

		/**
		 * The meta object literal for the '<em><b>On Resetting Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_RESETTING_DURATION = eINSTANCE.getSimulationConfiguration_OnResettingDuration();

		/**
		 * The meta object literal for the '<em><b>On Starting Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_STARTING_DURATION = eINSTANCE.getSimulationConfiguration_OnStartingDuration();

		/**
		 * The meta object literal for the '<em><b>On Execute Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_EXECUTE_DURATION = eINSTANCE.getSimulationConfiguration_OnExecuteDuration();

		/**
		 * The meta object literal for the '<em><b>On Completing Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_COMPLETING_DURATION = eINSTANCE.getSimulationConfiguration_OnCompletingDuration();

		/**
		 * The meta object literal for the '<em><b>On Stopping Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_STOPPING_DURATION = eINSTANCE.getSimulationConfiguration_OnStoppingDuration();

		/**
		 * The meta object literal for the '<em><b>On Aborting Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_ABORTING_DURATION = eINSTANCE.getSimulationConfiguration_OnAbortingDuration();

		/**
		 * The meta object literal for the '<em><b>On Clearing Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_CLEARING_DURATION = eINSTANCE.getSimulationConfiguration_OnClearingDuration();

		/**
		 * The meta object literal for the '<em><b>On Holding Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_HOLDING_DURATION = eINSTANCE.getSimulationConfiguration_OnHoldingDuration();

		/**
		 * The meta object literal for the '<em><b>On Unholding Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_UNHOLDING_DURATION = eINSTANCE.getSimulationConfiguration_OnUnholdingDuration();

		/**
		 * The meta object literal for the '<em><b>On Suspending Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_SUSPENDING_DURATION = eINSTANCE.getSimulationConfiguration_OnSuspendingDuration();

		/**
		 * The meta object literal for the '<em><b>On Unsuspending Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_UNSUSPENDING_DURATION = eINSTANCE.getSimulationConfiguration_OnUnsuspendingDuration();

		/**
		 * The meta object literal for the '<em><b>On Completing Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_CONFIGURATION__ON_COMPLETING_VARIABLES = eINSTANCE.getSimulationConfiguration_OnCompletingVariables();

		/**
		 * The meta object literal for the '<em><b>On Completing Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_COMPLETING_STATUS_CODE = eINSTANCE.getSimulationConfiguration_OnCompletingStatusCode();

		/**
		 * The meta object literal for the '<em><b>On Stopping Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_CONFIGURATION__ON_STOPPING_STATUS_CODE = eINSTANCE.getSimulationConfiguration_OnStoppingStatusCode();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestImpl <em>Process Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getProcessRequest()
		 * @generated
		 */
		EClass PROCESS_REQUEST = eINSTANCE.getProcessRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REQUEST__NAME = eINSTANCE.getProcessRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Business Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REQUEST__BUSINESS_KEY = eINSTANCE.getProcessRequest_BusinessKey();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_REQUEST__VARIABLES = eINSTANCE.getProcessRequest_Variables();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestStatusImpl <em>Process Request Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessRequestStatusImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getProcessRequestStatus()
		 * @generated
		 */
		EClass PROCESS_REQUEST_STATUS = eINSTANCE.getProcessRequestStatus();

		/**
		 * The meta object literal for the '<em><b>Process Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REQUEST_STATUS__PROCESS_INSTANCE_ID = eINSTANCE.getProcessRequestStatus_ProcessInstanceId();

		/**
		 * The meta object literal for the '<em><b>Business Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REQUEST_STATUS__BUSINESS_KEY = eINSTANCE.getProcessRequestStatus_BusinessKey();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REQUEST_STATUS__STATUS = eINSTANCE.getProcessRequestStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REQUEST_STATUS__MESSAGE = eINSTANCE.getProcessRequestStatus_Message();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl <em>Process Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ProcessResponseImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getProcessResponse()
		 * @generated
		 */
		EClass PROCESS_RESPONSE = eINSTANCE.getProcessResponse();

		/**
		 * The meta object literal for the '<em><b>Process Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_RESPONSE__PROCESS_INSTANCE_ID = eINSTANCE.getProcessResponse_ProcessInstanceId();

		/**
		 * The meta object literal for the '<em><b>Business Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_RESPONSE__BUSINESS_KEY = eINSTANCE.getProcessResponse_BusinessKey();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_RESPONSE__STATUS = eINSTANCE.getProcessResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_RESPONSE__STATUS_CODE = eINSTANCE.getProcessResponse_StatusCode();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_RESPONSE__MESSAGE = eINSTANCE.getProcessResponse_Message();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_RESPONSE__REQUEST = eINSTANCE.getProcessResponse_Request();

		/**
		 * The meta object literal for the '<em><b>Result Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_RESPONSE__RESULT_VARIABLES = eINSTANCE.getProcessResponse_ResultVariables();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentCategory()
		 * @generated
		 */
		EEnum COMPONENT_CATEGORY = eINSTANCE.getComponentCategory();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.State
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ControlMode <em>Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ControlMode
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getControlMode()
		 * @generated
		 */
		EEnum CONTROL_MODE = eINSTANCE.getControlMode();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ControlCommand <em>Control Command</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ControlCommand
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getControlCommand()
		 * @generated
		 */
		EEnum CONTROL_COMMAND = eINSTANCE.getControlCommand();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.RequestStatus <em>Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.RequestStatus
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getRequestStatus()
		 * @generated
		 */
		EEnum REQUEST_STATUS = eINSTANCE.getRequestStatus();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus <em>Response Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getResponseStatus()
		 * @generated
		 */
		EEnum RESPONSE_STATUS = eINSTANCE.getResponseStatus();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.VariableType
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

	}

} //ComponentPackage
