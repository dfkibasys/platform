/**
 */
package de.dfki.iui.basys.model.runtime.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentCategory <em>Component Category</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getInChannelName <em>In Channel Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getOutChannelName <em>Out Channel Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getStatusChannelName <em>Status Channel Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCurrentMode <em>Current Mode</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCommunicationProvider <em>Communication Provider</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getConnectionString <em>Connection String</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getHostName <em>Host Name</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getUriSpec <em>Uri Spec</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo()
 * @model
 * @generated
 */
public interface ComponentInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_ComponentId()
	 * @model
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentId <em>Component Id</em>}' attribute.
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
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_ComponentName()
	 * @model
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentName <em>Component Name</em>}' attribute.
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
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Category</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentCategory
	 * @see #setComponentCategory(ComponentCategory)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_ComponentCategory()
	 * @model default="NONE"
	 * @generated
	 */
	ComponentCategory getComponentCategory();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getComponentCategory <em>Component Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Category</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentCategory
	 * @see #getComponentCategory()
	 * @generated
	 */
	void setComponentCategory(ComponentCategory value);

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
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_InChannelName()
	 * @model
	 * @generated
	 */
	String getInChannelName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getInChannelName <em>In Channel Name</em>}' attribute.
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
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_OutChannelName()
	 * @model
	 * @generated
	 */
	String getOutChannelName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getOutChannelName <em>Out Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Channel Name</em>' attribute.
	 * @see #getOutChannelName()
	 * @generated
	 */
	void setOutChannelName(String value);

	/**
	 * Returns the value of the '<em><b>Status Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Channel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Channel Name</em>' attribute.
	 * @see #setStatusChannelName(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_StatusChannelName()
	 * @model
	 * @generated
	 */
	String getStatusChannelName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getStatusChannelName <em>Status Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Channel Name</em>' attribute.
	 * @see #getStatusChannelName()
	 * @generated
	 */
	void setStatusChannelName(String value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.runtime.component.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.State
	 * @see #setCurrentState(State)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCurrentState <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.State
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Current Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.basys.model.runtime.component.ControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Mode</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ControlMode
	 * @see #setCurrentMode(ControlMode)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_CurrentMode()
	 * @model
	 * @generated
	 */
	ControlMode getCurrentMode();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCurrentMode <em>Current Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Mode</em>' attribute.
	 * @see de.dfki.iui.basys.model.runtime.component.ControlMode
	 * @see #getCurrentMode()
	 * @generated
	 */
	void setCurrentMode(ControlMode value);

	/**
	 * Returns the value of the '<em><b>Communication Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Provider</em>' attribute.
	 * @see #setCommunicationProvider(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_CommunicationProvider()
	 * @model
	 * @generated
	 */
	String getCommunicationProvider();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getCommunicationProvider <em>Communication Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Provider</em>' attribute.
	 * @see #getCommunicationProvider()
	 * @generated
	 */
	void setCommunicationProvider(String value);

	/**
	 * Returns the value of the '<em><b>Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection String</em>' attribute.
	 * @see #setConnectionString(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_ConnectionString()
	 * @model
	 * @generated
	 */
	String getConnectionString();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getConnectionString <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection String</em>' attribute.
	 * @see #getConnectionString()
	 * @generated
	 */
	void setConnectionString(String value);

	/**
	 * Returns the value of the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Name</em>' attribute.
	 * @see #setHostName(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_HostName()
	 * @model
	 * @generated
	 */
	String getHostName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getHostName <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Name</em>' attribute.
	 * @see #getHostName()
	 * @generated
	 */
	void setHostName(String value);

	/**
	 * Returns the value of the '<em><b>Uri Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Spec</em>' attribute.
	 * @see #setUriSpec(String)
	 * @see de.dfki.iui.basys.model.runtime.component.ComponentPackage#getComponentInfo_UriSpec()
	 * @model
	 * @generated
	 */
	String getUriSpec();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.runtime.component.ComponentInfo#getUriSpec <em>Uri Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Spec</em>' attribute.
	 * @see #getUriSpec()
	 * @generated
	 */
	void setUriSpec(String value);

} // ComponentInfo
