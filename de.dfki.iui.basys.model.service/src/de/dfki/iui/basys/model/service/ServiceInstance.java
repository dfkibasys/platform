/**
 */
package de.dfki.iui.basys.model.service;

import de.dfki.iui.basys.model.base.IdentifiableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceInstance#getServiceDescriptionId <em>Service Description Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceInstance#getServiceImplementationId <em>Service Implementation Id</em>}</li>
 *   <li>{@link de.dfki.iui.basys.model.service.ServiceInstance#getEndpoints <em>Endpoints</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceInstance()
 * @model
 * @generated
 */
public interface ServiceInstance extends IdentifiableEntity {
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
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceInstance_ServiceDescriptionId()
	 * @model
	 * @generated
	 */
	String getServiceDescriptionId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceInstance#getServiceDescriptionId <em>Service Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Id</em>' attribute.
	 * @see #getServiceDescriptionId()
	 * @generated
	 */
	void setServiceDescriptionId(String value);

	/**
	 * Returns the value of the '<em><b>Service Implementation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Implementation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Implementation Id</em>' attribute.
	 * @see #setServiceImplementationId(String)
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceInstance_ServiceImplementationId()
	 * @model
	 * @generated
	 */
	String getServiceImplementationId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.service.ServiceInstance#getServiceImplementationId <em>Service Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Implementation Id</em>' attribute.
	 * @see #getServiceImplementationId()
	 * @generated
	 */
	void setServiceImplementationId(String value);

	/**
	 * Returns the value of the '<em><b>Endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.service.ServiceEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoints</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.service.ServicePackage#getServiceInstance_Endpoints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceEndpoint> getEndpoints();

} // ServiceInstance
