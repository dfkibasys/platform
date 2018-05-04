/**
 */
package de.dfki.iui.basys.model.runtime.component;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dfki.iui.basys.model.runtime.component.ComponentFactory
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
	ComponentPackage eINSTANCE = de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentInfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentInfoImpl
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentInfo()
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
	 * The feature id for the '<em><b>Current State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__CURRENT_STATE = 5;

	/**
	 * The feature id for the '<em><b>Current Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__CURRENT_MODE = 6;

	/**
	 * The feature id for the '<em><b>Communication Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__COMMUNICATION_PROVIDER = 7;

	/**
	 * The feature id for the '<em><b>Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__CONNECTION_STRING = 8;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentConfiguration()
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
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.ComponentRequest <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentRequest
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentRequest()
	 * @generated
	 */
	int COMPONENT_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST__COMPONENT_ID = 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.impl.CommandRequestImpl <em>Command Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.impl.CommandRequestImpl
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getCommandRequest()
	 * @generated
	 */
	int COMMAND_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl <em>Change Mode Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getChangeModeRequest()
	 * @generated
	 */
	int CHANGE_MODE_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MODE_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl <em>Capability Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getCapabilityRequest()
	 * @generated
	 */
	int CAPABILITY_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REQUEST__CAPABILITY = COMPONENT_REQUEST_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentRequestStatusImpl <em>Request Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentRequestStatusImpl
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestStatus()
	 * @generated
	 */
	int COMPONENT_REQUEST_STATUS = 6;

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
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.ComponentCategory <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentCategory
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentCategory()
	 * @generated
	 */
	int COMPONENT_CATEGORY = 7;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.State
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getState()
	 * @generated
	 */
	int STATE = 8;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.ControlMode <em>Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.ControlMode
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getControlMode()
	 * @generated
	 */
	int CONTROL_MODE = 9;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.ControlCommand <em>Control Command</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.ControlCommand
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getControlCommand()
	 * @generated
	 */
	int CONTROL_COMMAND = 10;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.runtime.component.RequestStatus <em>Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.runtime.component.RequestStatus
	 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getRequestStatus()
	 * @generated
	 */
	int REQUEST_STATUS = 11;

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo
	 * @generated
	 */
	EClass getComponentInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentId()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentName()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentCategory <em>Component Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Category</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentCategory()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ComponentCategory();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getInChannelName <em>In Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Channel Name</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getInChannelName()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_InChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getOutChannelName <em>Out Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Channel Name</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getOutChannelName()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_OutChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current State</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCurrentState()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCurrentMode <em>Current Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Mode</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCurrentMode()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_CurrentMode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCommunicationProvider <em>Communication Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Provider</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCommunicationProvider()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_CommunicationProvider();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getConnectionString <em>Connection String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection String</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentInfo#getConnectionString()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ConnectionString();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration
	 * @generated
	 */
	EClass getComponentConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentId()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentName()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentCategory <em>Component Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Category</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentCategory()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ComponentCategory();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentImplementationJavaClass <em>Component Implementation Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Implementation Java Class</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentImplementationJavaClass()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ComponentImplementationJavaClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getCommunicationProviderImplementationJavaClass <em>Communication Provider Implementation Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Provider Implementation Java Class</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getCommunicationProviderImplementationJavaClass()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_CommunicationProviderImplementationJavaClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getCommunicationProviderConnectionString <em>Communication Provider Connection String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Provider Connection String</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getCommunicationProviderConnectionString()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_CommunicationProviderConnectionString();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getInChannelName <em>In Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Channel Name</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getInChannelName()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_InChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getOutChannelName <em>Out Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Channel Name</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getOutChannelName()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_OutChannelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getExternalConnectionString <em>External Connection String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Connection String</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getExternalConnectionString()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_ExternalConnectionString();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.component.ComponentRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentRequest
	 * @generated
	 */
	EClass getComponentRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentRequest#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentRequest#getComponentId()
	 * @see #getComponentRequest()
	 * @generated
	 */
	EAttribute getComponentRequest_ComponentId();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.component.CommandRequest <em>Command Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Request</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.CommandRequest
	 * @generated
	 */
	EClass getCommandRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.CommandRequest#getControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Command</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.CommandRequest#getControlCommand()
	 * @see #getCommandRequest()
	 * @generated
	 */
	EAttribute getCommandRequest_ControlCommand();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.component.ChangeModeRequest <em>Change Mode Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Mode Request</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ChangeModeRequest
	 * @generated
	 */
	EClass getChangeModeRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ChangeModeRequest#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ChangeModeRequest#getMode()
	 * @see #getChangeModeRequest()
	 * @generated
	 */
	EAttribute getChangeModeRequest_Mode();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.component.CapabilityRequest <em>Capability Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Request</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.CapabilityRequest
	 * @generated
	 */
	EClass getCapabilityRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.runtime.component.CapabilityRequest#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.CapabilityRequest#getCapability()
	 * @see #getCapabilityRequest()
	 * @generated
	 */
	EReference getCapabilityRequest_Capability();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Status</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus
	 * @generated
	 */
	EClass getComponentRequestStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus#getComponentId()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus#getStatus()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentRequestStatus#getMessage()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_Message();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.runtime.component.ComponentCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentCategory
	 * @generated
	 */
	EEnum getComponentCategory();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.runtime.component.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.runtime.component.ControlMode <em>Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Mode</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ControlMode
	 * @generated
	 */
	EEnum getControlMode();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.runtime.component.ControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Command</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.ControlCommand
	 * @generated
	 */
	EEnum getControlCommand();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.runtime.component.RequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Status</em>'.
	 * @see de.dfki.iui.basys.model.runtime.component.RequestStatus
	 * @generated
	 */
	EEnum getRequestStatus();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentInfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentInfoImpl
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentInfo()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentConfiguration()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.ComponentRequest <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.ComponentRequest
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentRequest()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.impl.CommandRequestImpl <em>Command Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.impl.CommandRequestImpl
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getCommandRequest()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl <em>Change Mode Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ChangeModeRequestImpl
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getChangeModeRequest()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl <em>Capability Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.impl.CapabilityRequestImpl
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getCapabilityRequest()
		 * @generated
		 */
		EClass CAPABILITY_REQUEST = eINSTANCE.getCapabilityRequest();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REQUEST__CAPABILITY = eINSTANCE.getCapabilityRequest_Capability();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentRequestStatusImpl <em>Request Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentRequestStatusImpl
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestStatus()
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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.ComponentCategory <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.ComponentCategory
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getComponentCategory()
		 * @generated
		 */
		EEnum COMPONENT_CATEGORY = eINSTANCE.getComponentCategory();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.State
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.ControlMode <em>Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.ControlMode
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getControlMode()
		 * @generated
		 */
		EEnum CONTROL_MODE = eINSTANCE.getControlMode();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.ControlCommand <em>Control Command</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.ControlCommand
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getControlCommand()
		 * @generated
		 */
		EEnum CONTROL_COMMAND = eINSTANCE.getControlCommand();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.runtime.component.RequestStatus <em>Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.runtime.component.RequestStatus
		 * @see de.dfki.iui.basys.model.runtime.component.impl.ComponentPackageImpl#getRequestStatus()
		 * @generated
		 */
		EEnum REQUEST_STATUS = eINSTANCE.getRequestStatus();

	}

} //ComponentPackage
