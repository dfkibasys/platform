/**
 */
package de.dfki.iui.basys.model.runtime.component.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.basys.model.runtime.component.ComponentCategory;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.model.runtime.component.ComponentPackage;
import de.dfki.iui.basys.model.runtime.component.Property;
import de.dfki.iui.basys.model.runtime.component.SimulationConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getComponentCategory <em>Component Category</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getComponentImplementationJavaClass <em>Component Implementation Java Class</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getCommunicationProviderImplementationJavaClass <em>Communication Provider Implementation Java Class</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getCommunicationProviderConnectionString <em>Communication Provider Connection String</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getInChannelName <em>In Channel Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getOutChannelName <em>Out Channel Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getExternalConnectionString <em>External Connection String</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.impl.ComponentConfigurationImpl#getSimulationConfiguration <em>Simulation Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentConfigurationImpl extends MinimalEObjectImpl.Container implements ComponentConfiguration {
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
	 * The default value of the '{@link #getComponentImplementationJavaClass() <em>Component Implementation Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentImplementationJavaClass()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_IMPLEMENTATION_JAVA_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentImplementationJavaClass() <em>Component Implementation Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentImplementationJavaClass()
	 * @generated
	 * @ordered
	 */
	protected String componentImplementationJavaClass = COMPONENT_IMPLEMENTATION_JAVA_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationProviderImplementationJavaClass() <em>Communication Provider Implementation Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProviderImplementationJavaClass()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationProviderImplementationJavaClass() <em>Communication Provider Implementation Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProviderImplementationJavaClass()
	 * @generated
	 * @ordered
	 */
	protected String communicationProviderImplementationJavaClass = COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationProviderConnectionString() <em>Communication Provider Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProviderConnectionString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_PROVIDER_CONNECTION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationProviderConnectionString() <em>Communication Provider Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProviderConnectionString()
	 * @generated
	 * @ordered
	 */
	protected String communicationProviderConnectionString = COMMUNICATION_PROVIDER_CONNECTION_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getExternalConnectionString() <em>External Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalConnectionString()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_CONNECTION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalConnectionString() <em>External Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalConnectionString()
	 * @generated
	 * @ordered
	 */
	protected String externalConnectionString = EXTERNAL_CONNECTION_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getSimulationConfiguration() <em>Simulation Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationConfiguration()
	 * @generated
	 * @ordered
	 */
	protected SimulationConfiguration simulationConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_ID, oldComponentId, componentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_NAME, oldComponentName, componentName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_CATEGORY, oldComponentCategory, componentCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentImplementationJavaClass() {
		return componentImplementationJavaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentImplementationJavaClass(String newComponentImplementationJavaClass) {
		String oldComponentImplementationJavaClass = componentImplementationJavaClass;
		componentImplementationJavaClass = newComponentImplementationJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS, oldComponentImplementationJavaClass, componentImplementationJavaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationProviderImplementationJavaClass() {
		return communicationProviderImplementationJavaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationProviderImplementationJavaClass(String newCommunicationProviderImplementationJavaClass) {
		String oldCommunicationProviderImplementationJavaClass = communicationProviderImplementationJavaClass;
		communicationProviderImplementationJavaClass = newCommunicationProviderImplementationJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS, oldCommunicationProviderImplementationJavaClass, communicationProviderImplementationJavaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationProviderConnectionString() {
		return communicationProviderConnectionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationProviderConnectionString(String newCommunicationProviderConnectionString) {
		String oldCommunicationProviderConnectionString = communicationProviderConnectionString;
		communicationProviderConnectionString = newCommunicationProviderConnectionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING, oldCommunicationProviderConnectionString, communicationProviderConnectionString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__IN_CHANNEL_NAME, oldInChannelName, inChannelName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME, oldOutChannelName, outChannelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalConnectionString() {
		return externalConnectionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalConnectionString(String newExternalConnectionString) {
		String oldExternalConnectionString = externalConnectionString;
		externalConnectionString = newExternalConnectionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING, oldExternalConnectionString, externalConnectionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ComponentPackage.COMPONENT_CONFIGURATION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationConfiguration getSimulationConfiguration() {
		return simulationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulationConfiguration(SimulationConfiguration newSimulationConfiguration, NotificationChain msgs) {
		SimulationConfiguration oldSimulationConfiguration = simulationConfiguration;
		simulationConfiguration = newSimulationConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION, oldSimulationConfiguration, newSimulationConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationConfiguration(SimulationConfiguration newSimulationConfiguration) {
		if (newSimulationConfiguration != simulationConfiguration) {
			NotificationChain msgs = null;
			if (simulationConfiguration != null)
				msgs = ((InternalEObject)simulationConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION, null, msgs);
			if (newSimulationConfiguration != null)
				msgs = ((InternalEObject)newSimulationConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION, null, msgs);
			msgs = basicSetSimulationConfiguration(newSimulationConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION, newSimulationConfiguration, newSimulationConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Property getProperty(String key) {
		for (Property p : getProperties()) {
			if (p.getKey().equals(key))
				return p;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_CONFIGURATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION:
				return basicSetSimulationConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_ID:
				return getComponentId();
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_NAME:
				return getComponentName();
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_CATEGORY:
				return getComponentCategory();
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS:
				return getComponentImplementationJavaClass();
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS:
				return getCommunicationProviderImplementationJavaClass();
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING:
				return getCommunicationProviderConnectionString();
			case ComponentPackage.COMPONENT_CONFIGURATION__IN_CHANNEL_NAME:
				return getInChannelName();
			case ComponentPackage.COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME:
				return getOutChannelName();
			case ComponentPackage.COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING:
				return getExternalConnectionString();
			case ComponentPackage.COMPONENT_CONFIGURATION__PROPERTIES:
				return getProperties();
			case ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION:
				return getSimulationConfiguration();
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
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_NAME:
				setComponentName((String)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_CATEGORY:
				setComponentCategory((ComponentCategory)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS:
				setComponentImplementationJavaClass((String)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS:
				setCommunicationProviderImplementationJavaClass((String)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING:
				setCommunicationProviderConnectionString((String)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__IN_CHANNEL_NAME:
				setInChannelName((String)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME:
				setOutChannelName((String)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING:
				setExternalConnectionString((String)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION:
				setSimulationConfiguration((SimulationConfiguration)newValue);
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
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_CATEGORY:
				setComponentCategory(COMPONENT_CATEGORY_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS:
				setComponentImplementationJavaClass(COMPONENT_IMPLEMENTATION_JAVA_CLASS_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS:
				setCommunicationProviderImplementationJavaClass(COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING:
				setCommunicationProviderConnectionString(COMMUNICATION_PROVIDER_CONNECTION_STRING_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__IN_CHANNEL_NAME:
				setInChannelName(IN_CHANNEL_NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME:
				setOutChannelName(OUT_CHANNEL_NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING:
				setExternalConnectionString(EXTERNAL_CONNECTION_STRING_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__PROPERTIES:
				getProperties().clear();
				return;
			case ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION:
				setSimulationConfiguration((SimulationConfiguration)null);
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
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_CATEGORY:
				return componentCategory != COMPONENT_CATEGORY_EDEFAULT;
			case ComponentPackage.COMPONENT_CONFIGURATION__COMPONENT_IMPLEMENTATION_JAVA_CLASS:
				return COMPONENT_IMPLEMENTATION_JAVA_CLASS_EDEFAULT == null ? componentImplementationJavaClass != null : !COMPONENT_IMPLEMENTATION_JAVA_CLASS_EDEFAULT.equals(componentImplementationJavaClass);
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS:
				return COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS_EDEFAULT == null ? communicationProviderImplementationJavaClass != null : !COMMUNICATION_PROVIDER_IMPLEMENTATION_JAVA_CLASS_EDEFAULT.equals(communicationProviderImplementationJavaClass);
			case ComponentPackage.COMPONENT_CONFIGURATION__COMMUNICATION_PROVIDER_CONNECTION_STRING:
				return COMMUNICATION_PROVIDER_CONNECTION_STRING_EDEFAULT == null ? communicationProviderConnectionString != null : !COMMUNICATION_PROVIDER_CONNECTION_STRING_EDEFAULT.equals(communicationProviderConnectionString);
			case ComponentPackage.COMPONENT_CONFIGURATION__IN_CHANNEL_NAME:
				return IN_CHANNEL_NAME_EDEFAULT == null ? inChannelName != null : !IN_CHANNEL_NAME_EDEFAULT.equals(inChannelName);
			case ComponentPackage.COMPONENT_CONFIGURATION__OUT_CHANNEL_NAME:
				return OUT_CHANNEL_NAME_EDEFAULT == null ? outChannelName != null : !OUT_CHANNEL_NAME_EDEFAULT.equals(outChannelName);
			case ComponentPackage.COMPONENT_CONFIGURATION__EXTERNAL_CONNECTION_STRING:
				return EXTERNAL_CONNECTION_STRING_EDEFAULT == null ? externalConnectionString != null : !EXTERNAL_CONNECTION_STRING_EDEFAULT.equals(externalConnectionString);
			case ComponentPackage.COMPONENT_CONFIGURATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ComponentPackage.COMPONENT_CONFIGURATION__SIMULATION_CONFIGURATION:
				return simulationConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ComponentPackage.COMPONENT_CONFIGURATION___GET_PROPERTY__STRING:
				return getProperty((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(", componentName: ");
		result.append(componentName);
		result.append(", componentCategory: ");
		result.append(componentCategory);
		result.append(", componentImplementationJavaClass: ");
		result.append(componentImplementationJavaClass);
		result.append(", communicationProviderImplementationJavaClass: ");
		result.append(communicationProviderImplementationJavaClass);
		result.append(", communicationProviderConnectionString: ");
		result.append(communicationProviderConnectionString);
		result.append(", inChannelName: ");
		result.append(inChannelName);
		result.append(", outChannelName: ");
		result.append(outChannelName);
		result.append(", externalConnectionString: ");
		result.append(externalConnectionString);
		result.append(')');
		return result.toString();
	}

	public static class Builder {
		private String componentId;
		private String componentName;
		private ComponentCategory componentCategory;
		private String componentImplementationJavaClass;
		private String communicationProviderImplementationJavaClass;
		private String communicationProviderConnectionString;
		private String inChannelName;
		private String outChannelName;
		private String externalConnectionString;

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

		public Builder componentImplementationJavaClass(String componentImplementationJavaClass) {
			this.componentImplementationJavaClass = componentImplementationJavaClass;
			return this;
		}

		public Builder communicationProviderImplementationJavaClass(String communicationProviderImplementationJavaClass) {
			this.communicationProviderImplementationJavaClass = communicationProviderImplementationJavaClass;
			return this;
		}

		public Builder communicationProviderConnectionString(String communicationProviderConnectionString) {
			this.communicationProviderConnectionString = communicationProviderConnectionString;
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

		public Builder externalConnectionString(String externalConnectionString) {
			this.externalConnectionString = externalConnectionString;
			return this;
		}

		public ComponentConfiguration build() {
			return new ComponentConfigurationImpl(this);
		}
	}

	protected ComponentConfigurationImpl(Builder builder) {
		this.componentId = builder.componentId;
		this.componentName = builder.componentName;
		this.componentCategory = builder.componentCategory;
		this.componentImplementationJavaClass = builder.componentImplementationJavaClass;
		this.communicationProviderImplementationJavaClass = builder.communicationProviderImplementationJavaClass;
		this.communicationProviderConnectionString = builder.communicationProviderConnectionString;
		this.inChannelName = builder.inChannelName;
		this.outChannelName = builder.outChannelName;
		this.externalConnectionString = builder.externalConnectionString;
	}
}
