/**
 */
package de.dfki.iui.basys.model.runtime.component;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentCategory <em>Component Category</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentImplementationJavaClass <em>Component Implementation Java Class</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getCommunicationProviderImplementationJavaClass <em>Communication Provider Implementation Java Class</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getCommunicationProviderConnectionString <em>Communication Provider Connection String</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getInChannelName <em>In Channel Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getOutChannelName <em>Out Channel Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getExternalConnectionString <em>External Connection String</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getSimulationConfiguration <em>Simulation Configuration</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration()
 * @model
 * @generated
 */
public interface ComponentConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_ComponentName()
	 * @model
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Component Category</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.runtime.component.ComponentCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Category</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentCategory
	 * @see #setComponentCategory(ComponentCategory)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_ComponentCategory()
	 * @model default="NONE"
	 * @generated
	 */
	ComponentCategory getComponentCategory();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentCategory <em>Component Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Category</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentCategory
	 * @see #getComponentCategory()
	 * @generated
	 */
	void setComponentCategory(ComponentCategory value);

	/**
	 * Returns the value of the '<em><b>Component Implementation Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Implementation Java Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Implementation Java Class</em>' attribute.
	 * @see #setComponentImplementationJavaClass(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_ComponentImplementationJavaClass()
	 * @model
	 * @generated
	 */
	String getComponentImplementationJavaClass();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getComponentImplementationJavaClass <em>Component Implementation Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Implementation Java Class</em>' attribute.
	 * @see #getComponentImplementationJavaClass()
	 * @generated
	 */
	void setComponentImplementationJavaClass(String value);

	/**
	 * Returns the value of the '<em><b>Communication Provider Implementation Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Provider Implementation Java Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Provider Implementation Java Class</em>' attribute.
	 * @see #setCommunicationProviderImplementationJavaClass(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_CommunicationProviderImplementationJavaClass()
	 * @model
	 * @generated
	 */
	String getCommunicationProviderImplementationJavaClass();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getCommunicationProviderImplementationJavaClass <em>Communication Provider Implementation Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Provider Implementation Java Class</em>' attribute.
	 * @see #getCommunicationProviderImplementationJavaClass()
	 * @generated
	 */
	void setCommunicationProviderImplementationJavaClass(String value);

	/**
	 * Returns the value of the '<em><b>Communication Provider Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Provider Connection String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Provider Connection String</em>' attribute.
	 * @see #setCommunicationProviderConnectionString(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_CommunicationProviderConnectionString()
	 * @model
	 * @generated
	 */
	String getCommunicationProviderConnectionString();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getCommunicationProviderConnectionString <em>Communication Provider Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Provider Connection String</em>' attribute.
	 * @see #getCommunicationProviderConnectionString()
	 * @generated
	 */
	void setCommunicationProviderConnectionString(String value);

	/**
	 * Returns the value of the '<em><b>In Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Channel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Channel Name</em>' attribute.
	 * @see #setInChannelName(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_InChannelName()
	 * @model
	 * @generated
	 */
	String getInChannelName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getInChannelName <em>In Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Channel Name</em>' attribute.
	 * @see #getInChannelName()
	 * @generated
	 */
	void setInChannelName(String value);

	/**
	 * Returns the value of the '<em><b>Out Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Channel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Channel Name</em>' attribute.
	 * @see #setOutChannelName(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_OutChannelName()
	 * @model
	 * @generated
	 */
	String getOutChannelName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getOutChannelName <em>Out Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Channel Name</em>' attribute.
	 * @see #getOutChannelName()
	 * @generated
	 */
	void setOutChannelName(String value);

	/**
	 * Returns the value of the '<em><b>External Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Connection String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Connection String</em>' attribute.
	 * @see #setExternalConnectionString(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_ExternalConnectionString()
	 * @model
	 * @generated
	 */
	String getExternalConnectionString();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getExternalConnectionString <em>External Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Connection String</em>' attribute.
	 * @see #getExternalConnectionString()
	 * @generated
	 */
	void setExternalConnectionString(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.runtime.component.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Simulation Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Configuration</em>' containment reference.
	 * @see #setSimulationConfiguration(SimulationConfiguration)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentConfiguration_SimulationConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	SimulationConfiguration getSimulationConfiguration();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentConfiguration#getSimulationConfiguration <em>Simulation Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Configuration</em>' containment reference.
	 * @see #getSimulationConfiguration()
	 * @generated
	 */
	void setSimulationConfiguration(SimulationConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Property getProperty(String key);

} // ComponentConfiguration
