/**
 */
package de.dfki.iui.basys.model.service;

import de.dfki.iui.basys.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceImplementation#getServiceDescriptionId <em>Service Description Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceImplementation#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceImplementation#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceImplementation#getBundleLocation <em>Bundle Location</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceImplementation()
 * @model
 * @generated
 */
public interface ServiceImplementation extends Entity {
	/**
	 * Returns the value of the '<em><b>Service Description Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Description Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Description Id</em>' attribute.
	 * @see #setServiceDescriptionId(String)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceImplementation_ServiceDescriptionId()
	 * @model
	 * @generated
	 */
	String getServiceDescriptionId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceImplementation#getServiceDescriptionId <em>Service Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Id</em>' attribute.
	 * @see #getServiceDescriptionId()
	 * @generated
	 */
	void setServiceDescriptionId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceImplementation_Version()
	 * @model default=""
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceImplementation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceImplementation_Platform()
	 * @model
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceImplementation#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Bundle Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Location</em>' attribute.
	 * @see #setBundleLocation(String)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceImplementation_BundleLocation()
	 * @model
	 * @generated
	 */
	String getBundleLocation();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceImplementation#getBundleLocation <em>Bundle Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Location</em>' attribute.
	 * @see #getBundleLocation()
	 * @generated
	 */
	void setBundleLocation(String value);

} // ServiceImplementation
