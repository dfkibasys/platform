/**
 */
package de.dfki.cos.basys.platform.model.runtime.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentPackage;
import de.dfki.cos.basys.platform.model.runtime.component.ControlMode;
import de.dfki.cos.basys.platform.model.runtime.component.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getComponentCategory <em>Component Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getInChannelName <em>In Channel Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getOutChannelName <em>Out Channel Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getStatusChannelName <em>Status Channel Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getCurrentMode <em>Current Mode</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getCommunicationProvider <em>Communication Provider</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getConnectionString <em>Connection String</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getHostName <em>Host Name</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#getUriSpec <em>Uri Spec</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentInfoImpl#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInfoImpl extends MinimalEObjectImpl.Container implements ComponentInfo {
	/**
	 * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected String componentId = COMPONENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected String componentName = COMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentCategory() <em>Component Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentCategory COMPONENT_CATEGORY_EDEFAULT = ComponentCategory.NONE;

	/**
	 * The cached value of the '{@link #getComponentCategory() <em>Component Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentCategory()
	 * @generated
	 * @ordered
	 */
	protected ComponentCategory componentCategory = COMPONENT_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInChannelName() <em>In Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInChannelName()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_CHANNEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInChannelName() <em>In Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInChannelName()
	 * @generated
	 * @ordered
	 */
	protected String inChannelName = IN_CHANNEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutChannelName() <em>Out Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutChannelName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_CHANNEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutChannelName() <em>Out Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutChannelName()
	 * @generated
	 * @ordered
	 */
	protected String outChannelName = OUT_CHANNEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusChannelName() <em>Status Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusChannelName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_CHANNEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusChannelName() <em>Status Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusChannelName()
	 * @generated
	 * @ordered
	 */
	protected String statusChannelName = STATUS_CHANNEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentState() <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected static final State CURRENT_STATE_EDEFAULT = State.UNDEFINED;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState = CURRENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentMode() <em>Current Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMode()
	 * @generated
	 * @ordered
	 */
	protected static final ControlMode CURRENT_MODE_EDEFAULT = ControlMode.UNDEFINED;

	/**
	 * The cached value of the '{@link #getCurrentMode() <em>Current Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMode()
	 * @generated
	 * @ordered
	 */
	protected ControlMode currentMode = CURRENT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationProvider() <em>Communication Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationProvider() <em>Communication Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProvider()
	 * @generated
	 * @ordered
	 */
	protected String communicationProvider = COMMUNICATION_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionString()
	 * @generated
	 * @ordered
	 */
	protected String connectionString = CONNECTION_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected String hostName = HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriSpec() <em>Uri Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriSpec()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriSpec() <em>Uri Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriSpec()
	 * @generated
	 * @ordered
	 */
	protected String uriSpec = URI_SPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentName() {
		return componentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentName(String newComponentName) {
		String oldComponentName = componentName;
		componentName = newComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCategory getComponentCategory() {
		return componentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentCategory(ComponentCategory newComponentCategory) {
		ComponentCategory oldComponentCategory = componentCategory;
		componentCategory = newComponentCategory == null ? COMPONENT_CATEGORY_EDEFAULT : newComponentCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__COMPONENT_CATEGORY, oldComponentCategory, componentCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInChannelName() {
		return inChannelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInChannelName(String newInChannelName) {
		String oldInChannelName = inChannelName;
		inChannelName = newInChannelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__IN_CHANNEL_NAME, oldInChannelName, inChannelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutChannelName() {
		return outChannelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutChannelName(String newOutChannelName) {
		String oldOutChannelName = outChannelName;
		outChannelName = newOutChannelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__OUT_CHANNEL_NAME, oldOutChannelName, outChannelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusChannelName() {
		return statusChannelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusChannelName(String newStatusChannelName) {
		String oldStatusChannelName = statusChannelName;
		statusChannelName = newStatusChannelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__STATUS_CHANNEL_NAME, oldStatusChannelName, statusChannelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState == null ? CURRENT_STATE_EDEFAULT : newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlMode getCurrentMode() {
		return currentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentMode(ControlMode newCurrentMode) {
		ControlMode oldCurrentMode = currentMode;
		currentMode = newCurrentMode == null ? CURRENT_MODE_EDEFAULT : newCurrentMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__CURRENT_MODE, oldCurrentMode, currentMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationProvider() {
		return communicationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationProvider(String newCommunicationProvider) {
		String oldCommunicationProvider = communicationProvider;
		communicationProvider = newCommunicationProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__COMMUNICATION_PROVIDER, oldCommunicationProvider, communicationProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectionString() {
		return connectionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionString(String newConnectionString) {
		String oldConnectionString = connectionString;
		connectionString = newConnectionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__CONNECTION_STRING, oldConnectionString, connectionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostName() {
		return hostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostName(String newHostName) {
		String oldHostName = hostName;
		hostName = newHostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__HOST_NAME, oldHostName, hostName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriSpec() {
		return uriSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriSpec(String newUriSpec) {
		String oldUriSpec = uriSpec;
		uriSpec = newUriSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__URI_SPEC, oldUriSpec, uriSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_INFO__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_INFO__COMPONENT_ID:
				return getComponentId();
			case ComponentPackage.COMPONENT_INFO__COMPONENT_NAME:
				return getComponentName();
			case ComponentPackage.COMPONENT_INFO__COMPONENT_CATEGORY:
				return getComponentCategory();
			case ComponentPackage.COMPONENT_INFO__IN_CHANNEL_NAME:
				return getInChannelName();
			case ComponentPackage.COMPONENT_INFO__OUT_CHANNEL_NAME:
				return getOutChannelName();
			case ComponentPackage.COMPONENT_INFO__STATUS_CHANNEL_NAME:
				return getStatusChannelName();
			case ComponentPackage.COMPONENT_INFO__CURRENT_STATE:
				return getCurrentState();
			case ComponentPackage.COMPONENT_INFO__CURRENT_MODE:
				return getCurrentMode();
			case ComponentPackage.COMPONENT_INFO__COMMUNICATION_PROVIDER:
				return getCommunicationProvider();
			case ComponentPackage.COMPONENT_INFO__CONNECTION_STRING:
				return getConnectionString();
			case ComponentPackage.COMPONENT_INFO__HOST_NAME:
				return getHostName();
			case ComponentPackage.COMPONENT_INFO__URI_SPEC:
				return getUriSpec();
			case ComponentPackage.COMPONENT_INFO__CONNECTED:
				return isConnected();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_INFO__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__COMPONENT_NAME:
				setComponentName((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__COMPONENT_CATEGORY:
				setComponentCategory((ComponentCategory)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__IN_CHANNEL_NAME:
				setInChannelName((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__OUT_CHANNEL_NAME:
				setOutChannelName((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__STATUS_CHANNEL_NAME:
				setStatusChannelName((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__CURRENT_STATE:
				setCurrentState((State)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__CURRENT_MODE:
				setCurrentMode((ControlMode)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__COMMUNICATION_PROVIDER:
				setCommunicationProvider((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__CONNECTION_STRING:
				setConnectionString((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__HOST_NAME:
				setHostName((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__URI_SPEC:
				setUriSpec((String)newValue);
				return;
			case ComponentPackage.COMPONENT_INFO__CONNECTED:
				setConnected((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_INFO__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__COMPONENT_CATEGORY:
				setComponentCategory(COMPONENT_CATEGORY_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__IN_CHANNEL_NAME:
				setInChannelName(IN_CHANNEL_NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__OUT_CHANNEL_NAME:
				setOutChannelName(OUT_CHANNEL_NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__STATUS_CHANNEL_NAME:
				setStatusChannelName(STATUS_CHANNEL_NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__CURRENT_STATE:
				setCurrentState(CURRENT_STATE_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__CURRENT_MODE:
				setCurrentMode(CURRENT_MODE_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__COMMUNICATION_PROVIDER:
				setCommunicationProvider(COMMUNICATION_PROVIDER_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__CONNECTION_STRING:
				setConnectionString(CONNECTION_STRING_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__HOST_NAME:
				setHostName(HOST_NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__URI_SPEC:
				setUriSpec(URI_SPEC_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_INFO__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_INFO__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case ComponentPackage.COMPONENT_INFO__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
			case ComponentPackage.COMPONENT_INFO__COMPONENT_CATEGORY:
				return componentCategory != COMPONENT_CATEGORY_EDEFAULT;
			case ComponentPackage.COMPONENT_INFO__IN_CHANNEL_NAME:
				return IN_CHANNEL_NAME_EDEFAULT == null ? inChannelName != null : !IN_CHANNEL_NAME_EDEFAULT.equals(inChannelName);
			case ComponentPackage.COMPONENT_INFO__OUT_CHANNEL_NAME:
				return OUT_CHANNEL_NAME_EDEFAULT == null ? outChannelName != null : !OUT_CHANNEL_NAME_EDEFAULT.equals(outChannelName);
			case ComponentPackage.COMPONENT_INFO__STATUS_CHANNEL_NAME:
				return STATUS_CHANNEL_NAME_EDEFAULT == null ? statusChannelName != null : !STATUS_CHANNEL_NAME_EDEFAULT.equals(statusChannelName);
			case ComponentPackage.COMPONENT_INFO__CURRENT_STATE:
				return currentState != CURRENT_STATE_EDEFAULT;
			case ComponentPackage.COMPONENT_INFO__CURRENT_MODE:
				return currentMode != CURRENT_MODE_EDEFAULT;
			case ComponentPackage.COMPONENT_INFO__COMMUNICATION_PROVIDER:
				return COMMUNICATION_PROVIDER_EDEFAULT == null ? communicationProvider != null : !COMMUNICATION_PROVIDER_EDEFAULT.equals(communicationProvider);
			case ComponentPackage.COMPONENT_INFO__CONNECTION_STRING:
				return CONNECTION_STRING_EDEFAULT == null ? connectionString != null : !CONNECTION_STRING_EDEFAULT.equals(connectionString);
			case ComponentPackage.COMPONENT_INFO__HOST_NAME:
				return HOST_NAME_EDEFAULT == null ? hostName != null : !HOST_NAME_EDEFAULT.equals(hostName);
			case ComponentPackage.COMPONENT_INFO__URI_SPEC:
				return URI_SPEC_EDEFAULT == null ? uriSpec != null : !URI_SPEC_EDEFAULT.equals(uriSpec);
			case ComponentPackage.COMPONENT_INFO__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(", componentName: ");
		result.append(componentName);
		result.append(", componentCategory: ");
		result.append(componentCategory);
		result.append(", inChannelName: ");
		result.append(inChannelName);
		result.append(", outChannelName: ");
		result.append(outChannelName);
		result.append(", statusChannelName: ");
		result.append(statusChannelName);
		result.append(", currentState: ");
		result.append(currentState);
		result.append(", currentMode: ");
		result.append(currentMode);
		result.append(", communicationProvider: ");
		result.append(communicationProvider);
		result.append(", connectionString: ");
		result.append(connectionString);
		result.append(", hostName: ");
		result.append(hostName);
		result.append(", uriSpec: ");
		result.append(uriSpec);
		result.append(", connected: ");
		result.append(connected);
		result.append(')');
		return result.toString();
	}

	public static class Builder {
		private String componentId;
		private String componentName;
		private ComponentCategory componentCategory;
		private String inChannelName;
		private String outChannelName;
		private String statusChannelName;
		private State currentState;
		private ControlMode currentMode;
		private String communicationProvider;
		private String connectionString;
		private String hostName;
		private String uriSpec;
		private boolean connected; 
		//private List<Property> properties;

		public Builder componentId(String componentId) {
			this.componentId = componentId;
			return this;
		}

		public Builder componentName(String componentName) {
			this.componentName = componentName;
			return this;
		}

		public Builder componentCategory(ComponentCategory componentCategory) {
			this.componentCategory = componentCategory;
			return this;
		}

		public Builder inChannelName(String inChannelName) {
			this.inChannelName = inChannelName;
			return this;
		}

		public Builder outChannelName(String outChannelName) {
			this.outChannelName = outChannelName;
			return this;
		}

		public Builder statusChannelName(String statusChannelName) {
			this.statusChannelName = statusChannelName;
			return this;
		}

		public Builder currentState(State currentState) {
			this.currentState = currentState;
			return this;
		}

		public Builder currentMode(ControlMode currentMode) {
			this.currentMode = currentMode;
			return this;
		}

		public Builder communicationProvider(String communicationProvider) {
			this.communicationProvider = communicationProvider;
			return this;
		}

		public Builder connectionString(String connectionString) {
			this.connectionString = connectionString;
			return this;
		}

		public Builder hostName(String hostName) {
			this.hostName = hostName;
			return this;
		}

		public Builder uriSpec(String uriSpec) {
			this.uriSpec = uriSpec;
			return this;
		}
		
		public Builder isConnected(boolean connected) {
			this.connected = connected;
			return this;
		}
		
//		public Builder properties(List<Property> properties) {
//			this.properties = properties;
//			return this;
//		}

		public ComponentInfoImpl build() {
			return new ComponentInfoImpl(this);
		}
	}

	private ComponentInfoImpl(Builder builder) {
		this.componentId = builder.componentId;
		this.componentName = builder.componentName;
		this.componentCategory = builder.componentCategory;
		this.inChannelName = builder.inChannelName;
		this.outChannelName = builder.outChannelName;
		this.statusChannelName = builder.statusChannelName;
		this.currentState = builder.currentState;
		this.currentMode = builder.currentMode;
		this.communicationProvider = builder.communicationProvider;
		this.connectionString = builder.connectionString;
		this.hostName = builder.hostName;
		this.uriSpec = builder.uriSpec;
		this.connected = builder.connected;
		//this.getProperties().addAll(builder.properties);
	}
}
